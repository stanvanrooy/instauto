# ************************************
# default instagram profile values
# ************************************
#: Can change overtime, but it's pretty easy to extract, see:
#: https://mokhdzanifaeq.github.io/2015/09/28/extracting-instagram-signature-key-2/
DEFAULT_SIGNATURE_KEY = "19ce5f445dbfd9d29c59dc2a78c616a7fc090a8e018b9267bc4240a30244c53b"
DEFAULT_SIGNATURE_KEY_V = "4"
DEFAULT_HTTP_ENGINE = "Liger"
DEFAULT_IG_CAPABILITIES = "3brTvw8="
DEFAULT_APP_ID = "567067343352427"
DEFAULT_IG_VERSION = "148.0.0.33.121"
DEFAULT_BUILD_NUMBER = "227298996"

# ************************************
# default phone profile values (s10 edge)
# ************************************
DEFAULT_MANUFACTURER = "samsung"
DEFAULT_ANDROID_SDK = "29"
DEFAULT_ANDROID_RELEASE = "10"
DEFAULT_DEVICE = "SM-973F"
DEFAULT_MODEL = "beyond1"
DEFAULT_DPI = 560
DEFAULT_RESOLUTION = (1440, 2891)
DEFAULT_CHIPSET = "exynos9820"


DEFAULT_IG_PROFILE = {'signature_key': DEFAULT_SIGNATURE_KEY, 'signature_key_version': DEFAULT_SIGNATURE_KEY_V,
                      'http_engine': DEFAULT_HTTP_ENGINE, 'capabilities': DEFAULT_IG_CAPABILITIES, 'id': DEFAULT_APP_ID,
                      'version': DEFAULT_IG_VERSION, 'build_number': DEFAULT_BUILD_NUMBER}

DEFAULT_DEVICE_PROFILE = {'manufacturer': DEFAULT_MANUFACTURER, 'android_sdk_version': DEFAULT_ANDROID_SDK,
                         'android_release': DEFAULT_ANDROID_RELEASE, 'device': DEFAULT_DEVICE, 'model': DEFAULT_MODEL,
                         'dpi': DEFAULT_DPI, 'resolution': DEFAULT_RESOLUTION, 'chipset': DEFAULT_CHIPSET}


# ************************************
# state default settings
# ************************************
DEFAULT_APP_STARTUP_COUNTRY = "US"
DEFAULT_DEVICE_LOCALE = "nl_NL"
DEFAULT_APP_LOCALE = "nl_NL"
DEFAULT_BANDWIDTH_TOTALBYTES_B = '0'
DEFAULT_BANDWIDTH_TOTALTIME_MS = '0'
DEFAULT_CONNECTION_TYPE = 'WIFI'
DEFAULT_ACCEPT_LANGUAGE = 'nl_NL, en_US'
DEFAULT_ACCEPT_ENCODING = 'gzip'
DEFAULT_ACCEPT = '*/*'
DEFAULT_ADS_OPT_OUT = int(False)
DEFAULT_AUTHORIZATION = ''
DEFAULT_WWW_CLAIM = '0'
DEFAULT_RUR = 'VLL'
DEFAULT_BLOKS_VERSION_ID = "5da07fc1b20eb4c7d1b2e6146ee5f197072cbbd193d2d1eb3bb4e825d3c39e28"
DEFAULT_BLOKS_IS_LAYOUT_RTL = "False"

DEFAULT_STATE = {
    'app_startup_country':  DEFAULT_APP_STARTUP_COUNTRY, 'device_locale':  DEFAULT_DEVICE_LOCALE, 'app_locale':
        DEFAULT_APP_LOCALE, 'www_claim': DEFAULT_WWW_CLAIM,
    'authorization': DEFAULT_AUTHORIZATION, 'bandwidth_totalbytes_b': DEFAULT_BANDWIDTH_TOTALBYTES_B,
    'bandwidth_totaltime_ms': DEFAULT_BANDWIDTH_TOTALTIME_MS, 'connection_type': DEFAULT_CONNECTION_TYPE,
    'accept_language': DEFAULT_ACCEPT_LANGUAGE, 'accept_encoding': DEFAULT_ACCEPT_ENCODING, 'accept': DEFAULT_ACCEPT,
    'bloks_version_id': DEFAULT_BLOKS_VERSION_ID, 'bloks_is_layout_rtl': DEFAULT_BLOKS_IS_LAYOUT_RTL
 }


# ************************************
# API stuff
# ************************************
API_BASE_URL = "https://i.instagram.com/api/v1/{}"
