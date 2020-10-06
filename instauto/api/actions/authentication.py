from requests import Session
import datetime
import base64
import struct

from typing import Dict, Callable
from instauto.api.actions.stubs import _request

from Cryptodome.Cipher import AES, PKCS1_v1_5
from Cryptodome.PublicKey import RSA
from Cryptodome import Random

from ..structs import Method, State, IGProfile, LoggedInAccountData


class AuthenticationMixin:
    """This class handles everything authentication related."""
    _session: Session
    state: State
    _request: _request
    _update_token: Callable
    _user_name: str
    _user_agent: str
    _encrypted_password: str
    _unencrypted_password: str
    ig_profile: IGProfile
    state: State
    _gen_uuid: Callable

    def _create_jazoest(self) -> str:
        """No idea what a jazoest is, but this function creates one. Implementation from: https://bit.ly/3fWyPSo"""
        b = bytearray(self.state.phone_id, 'ascii')
        s = 0
        for c in range(len(b)):
            s += b[c]
        return f"2{s}"

    def login(self) -> None:
        """Logs in the account with the `username` and `password`"""
        self._update_token()
        data1 = {
            '_csrftoken': self._session.cookies['csrftoken'],
            'id': self.state.device_id,
            'sever_config_retrieval': "1",
            'experiments': "ig_android_device_detection_info_upload,ig_android_gmail_oauth_in_reg,ig_android_account_linking_upsell_universe,ig_android_direct_main_tab_universe_v2,ig_android_sign_in_help_only_one_account_family_universe,ig_android_sms_retriever_backtest_universe,ig_android_vc_interop_use_test_igid_universe,ig_android_direct_add_direct_to_android_native_photo_share_sheet,ig_growth_android_profile_pic_prefill_with_fb_pic_2,ig_account_identity_logged_out_signals_global_holdout_universe,ig_android_notification_unpack_universe,ig_android_quickcapture_keep_screen_on,ig_android_device_based_country_verification,ig_android_login_identifier_fuzzy_match,ig_android_reg_modularization_universe,ig_android_video_render_codec_low_memory_gc,ig_android_device_verification_separate_endpoint,ig_android_email_fuzzy_matching_universe,ig_android_suma_landing_page,ig_android_smartlock_hints_universe,ig_android_video_ffmpegutil_pts_fix,ig_android_multi_tap_login_new,ig_android_retry_create_account_universe,ig_android_caption_typeahead_fix_on_o_universe,ig_android_enable_keyboardlistener_redesign,ig_android_reg_nux_headers_cleanup_universe,ig_android_get_cookie_with_concurrent_session_universe,ig_android_nux_add_email_device,ig_android_device_info_foreground_reporting,ig_android_shortcuts_2019,ig_android_device_verification_fb_signup,ig_android_passwordless_account_password_creation_universe,ig_android_black_out_toggle_universe,ig_video_debug_overlay,ig_android_ask_for_permissions_on_reg,ig_assisted_login_universe,ig_android_security_intent_switchoff,ig_android_recovery_one_tap_holdout_universe,ig_android_sim_info_upload,ig_android_mobile_http_flow_device_universe,ig_android_fb_account_linking_sampling_freq_universe,ig_android_access_flow_prefill"
        }
        # this request retrieves the public key and public key id
        _ = self._request('qe/sync/', Method.POST, data=data1)

        data2 = {
            'jazoest': self._create_jazoest(),
            'phone_id': self.state.phone_id,
            'device_id': self.state.android_id,
            'guid': self.state.uuid,
            '_csrftoken': self._session.cookies['csrftoken'],  # if csrf_token is not available, app should crash.
            'adid': self.state.ad_id,
            'google_tokens': '[]',
            'username': self._user_name,
            'country_codes': "[{\"country_code\":\"31\",\"source\": \"default\"}]",
            'enc_password': self._encrypted_password,
            'login_attempt_count': "0",
        }
        # does the actual login
        resp = self._request('accounts/login/', Method.POST, data=data2, signed=True)
        self.state.logged_in_account_data = LoggedInAccountData(**resp.json()['logged_in_user'])

    def _build_initial_headers(self) -> Dict[str, str]:
        """Builds a dictionary that contains all header values required for the first request sent, before login,
        to retrieve necessary cookies and header values to send other requests.

        Returns
        -------
        d : dict
            Dictionary containing the mappings.
        """
        d = {
            'x-ig-connection-type': self.state.connection_type,
            'x-ig-capabilities': self.ig_profile.capabilities,
            'x-ig-app-id': self.ig_profile.id,
            'user-agent': self._user_agent,
            'accept-language': 'nl_NL',
            'accept-encoding': 'gzip, deflate',
            'x-fb-http-engine': self.ig_profile.http_engine,
            'x-ig-connection-speed': self.state.connection_speed,
            'x-ig-bandwidth-speed-kbps': self.state.bandwidth_speed_kbps,
            'x-ig-bandwidth-totalbytes-b': self.state.bandwidth_totalbytes_b,
            'x-ig-bandwidth-totaltime-ms': self.state.bandwidth_totaltime_ms,
            'x-ig-www-claim': self.state.www_claim,
        }
        return d

    def _encrypt_password(self) -> None:
        """Encrypts the raw password into a form that Instagram accepts."""
        if not self.state.public_api_key: return  # the api key will be retrieved from the first request, so it will not
                                                  # be present during the initial request
        key = Random.get_random_bytes(32)
        iv = Random.get_random_bytes(12)
        time = int(datetime.datetime.now().timestamp())

        pubkey = base64.b64decode(self.state.public_api_key)

        rsa_key = RSA.importKey(pubkey)
        rsa_cipher = PKCS1_v1_5.new(rsa_key)
        encrypted_key = rsa_cipher.encrypt(key)

        aes = AES.new(key, AES.MODE_GCM, nonce=iv)
        aes.update(str(time).encode('utf-8'))

        encrypted_password, cipher_tag = aes.encrypt_and_digest(bytes(self._unencrypted_password, 'utf-8'))

        encrypted = bytes([1,
                           int(self.state.public_api_key_id),
                           *list(iv),
                           *list(struct.pack('<h', len(encrypted_key))),
                           *list(encrypted_key),
                           *list(cipher_tag),
                           *list(encrypted_password)])
        encrypted = base64.b64encode(encrypted).decode('utf-8')

        self._encrypted_password = f'#PWD_INSTAGRAM:4:{time}:{encrypted}'

    def _update_token(self):
        """Only used on initial login."""
        query = {'device_id': self.state.android_id, 'token_hash': '', 'custom_device_id': self.state.device_id,
                 'fetch_reason': 'token_expired'}
        # do initial request, this retrieves the first x-mid header, required for sending other requests
        _ = self._request('zr/token/result/', Method.GET, query=query, headers=self._build_initial_headers(),
                          default_headers=False)

    def _update_session_id(self) -> None:
        """Updates the session id, to simulate a close and open of the app."""
        self.state._session_id = self._gen_uuid()
