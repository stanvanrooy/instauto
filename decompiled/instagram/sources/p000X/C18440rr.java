package p000X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import com.instagram.archive.fragment.ArchiveHomeFragment;
import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.archive.fragment.ManageHighlightsFragment;
import com.instagram.archive.fragment.SelectHighlightsCoverFragment;
import com.instagram.business.fragment.OnboardingCheckListFragment;
import com.instagram.clips.capture.sharesheet.ClipsShareHomeFragment;
import com.instagram.clips.viewer.ClipsViewerFragment;
import com.instagram.debug.devoptions.api.DeveloperOptionsLauncher;
import com.instagram.debug.devoptions.sandboxselector.SandboxSelectorFragment;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import com.instagram.direct.inbox.fragment.DirectSearchInboxSeeAllFragment;
import com.instagram.guides.intf.GuideFragmentConfig;
import com.instagram.igtv.browse.IGTVBrowseFragment;
import com.instagram.model.shopping.Product;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.reels.fragment.ReelMoreOptionsFragment;
import com.instagram.shopping.fragment.destination.profileshop.ProfileShopFragment;
import com.instagram.shopping.fragment.pdp.ProductDetailsPageFragment;
import com.instagram.shopping.fragment.pdp.herocarousel.HeroCarouselProductImageViewerFragment;
import com.instagram.shopping.fragment.pdp.lightbox.LightboxFragment;
import com.instagram.shopping.fragment.productsource.ProductSourceSelectionTabbedFragment;
import com.instagram.video.live.livewith.fragment.IgLiveWithGuestFragment;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: X.0rr  reason: invalid class name and case insensitive filesystem */
public final class C18440rr extends C18450rs {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x024b, code lost:
        if (r2.equals("fundraiser_donation_webview") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0257, code lost:
        if (r2.equals("checkout_awareness") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0263, code lost:
        if (r2.equals("attribution_quick_camera_fragment") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0270, code lost:
        if (r2.equals("um_opt_in_flow") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x027c, code lost:
        if (r2.equals("clips_feed_viewer") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0289, code lost:
        if (r2.equals("select_highlights_cover") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0295, code lost:
        if (r2.equals("direct_permanent_media_viewer") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02a2, code lost:
        if (r2.equals("reel_viewer_settings") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02ae, code lost:
        if (r2.equals("direct_expiring_media_viewer") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02ba, code lost:
        if (r2.equals("direct_quick_camera_fragment") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02c7, code lost:
        if (r2.equals("shopping_shop_management_add_collection") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02d4, code lost:
        if (r2.equals("shopping_viewer") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02e0, code lost:
        if (r2.equals("discover_people") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ed, code lost:
        if (r2.equals("save_autofill_learn_more") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02f9, code lost:
        if (r2.equals("ads_data_preferences_notice") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0305, code lost:
        if (r2.equals("edit_autofill_entry") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0312, code lost:
        if (r2.equals("shopping_product_source_selection") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x031e, code lost:
        if (r2.equals("political_ad_expanded_info_sheet") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x032a, code lost:
        if (r2.equals("direct_settings_notification") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0336, code lost:
        if (r2.equals("direct_pick_video_call_recipients") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0342, code lost:
        if (r2.equals("phone_number_entry") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x034e, code lost:
        if (r2.equals("effect_gallery_surface") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x035b, code lost:
        if (r2.equals("recommend_accounts_receiver") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0367, code lost:
        if (r2.equals("clips_share_sheet") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0373, code lost:
        if (r2.equals("effects_page") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0380, code lost:
        if (r2.equals("shopping_collection_selection") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x038c, code lost:
        if (r2.equals("discover_connect_contacts") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0399, code lost:
        if (r2.equals("smb_support_links_edit_url") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03a4, code lost:
        if (r2.equals("direct_pick_recipients_redesign") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03b0, code lost:
        if (r2.equals("effect_gallery_search_surface") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03bd, code lost:
        if (r2.equals("reel_per_media_blacklist") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03ca, code lost:
        if (r2.equals("shopping_influencer_merchant_education") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03d7, code lost:
        if (r2.equals("reel_swipe_up") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03e3, code lost:
        if (r2.equals("guide") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03ef, code lost:
        if (r2.equals("bloks") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03fb, code lost:
        if (r2.equals("direct_search_inbox_fragment") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0407, code lost:
        if (r2.equals("igtv") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0412, code lost:
        if (r2.equals("blocked_list") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x041e, code lost:
        if (r2.equals("livewith_guest") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x042a, code lost:
        if (r2.equals("location_transparency_landing_surface") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0436, code lost:
        if (r2.equals("location_picker") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0443, code lost:
        if (r2.equals("videocall_screen_capture_share") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0450, code lost:
        if (r2.equals("reel_more options") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x045d, code lost:
        if (r2.equals("sms_verify") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x046a, code lost:
        if (r2.equals("reel_guide_share") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0477, code lost:
        if (r2.equals("shopping_creator_education_full_text") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0483, code lost:
        if (r2.equals("legacy_shopping_product_appeals") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0490, code lost:
        if (r2.equals("reel_challenge_share") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x049c, code lost:
        if (r2.equals("analytics_events_list") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04a8, code lost:
        if (r2.equals("gdpr_consent") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04b4, code lost:
        if (r2.equals("profile") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04c1, code lost:
        if (r2.equals("shopping_shop_management_edit") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04cd, code lost:
        if (r2.equals("direct_thread_detail") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04d8, code lost:
        if (r2.equals("confirm_connection") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04e5, code lost:
        if (r2.equals("sandbox_selector") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04f1, code lost:
        if (r2.equals("profile_fullname_screen") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04fd, code lost:
        if (r2.equals("comment_likers_list") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x050a, code lost:
        if (r2.equals("shopping_product_appeals") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0516, code lost:
        if (r2.equals("political_context_page") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0522, code lost:
        if (r2.equals("comments") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x052d, code lost:
        if (r2.equals("direct_pick_recipients") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x053a, code lost:
        if (r2.equals("report_intellectual_property_fragment") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0546, code lost:
        if (r2.equals("archive_reels") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0552, code lost:
        if (r2.equals("igtv_series") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x055f, code lost:
        if (r2.equals("reel_share_fundraiser_sticker_fragment") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x056b, code lost:
        if (r2.equals("profile_photo") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0577, code lost:
        if (r2.equals("clips_camera") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0584, code lost:
        if (r2.equals("shopping_creator_education_nux") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0591, code lost:
        if (r2.equals("reel_clips_share") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x059d, code lost:
        if (r2.equals("favorites_nux") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05aa, code lost:
        if (r2.equals("reel_countdown_reshare") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x05b6, code lost:
        if (r2.equals("favorites_home") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05c2, code lost:
        if (r2.equals("developer_options") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05cf, code lost:
        if (r2.equals("rapid_feedback") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05db, code lost:
        if (r2.equals("fxcal_flow") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05e8, code lost:
        if (r2.equals("reel_smb_support_sticker_fragment") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05f5, code lost:
        if (r2.equals("shopping_home_onboarding_profile_selection") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0602, code lost:
        if (r2.equals("unified_follow_list") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x060f, code lost:
        if (r2.equals("um_opt_out_group_selection_flow") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x061b, code lost:
        if (r2.equals("igtv_browse") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0628, code lost:
        if (r2.equals("shopping_shop_management_add_product") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0635, code lost:
        if (r2.equals("quick_camera") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0641, code lost:
        if (r2.equals("ad_hide_reasons") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x064e, code lost:
        if (r2.equals("reel_fundraiser_public_thanks_sticker_fragment") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x065a, code lost:
        if (r2.equals("nav_stack_list") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0666, code lost:
        if (r2.equals("iglive_capture") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0673, code lost:
        if (r2.equals("reel_dashboard_add_to_story_camera") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x067f, code lost:
        if (r2.equals("merchant_shopping_bag") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x068a, code lost:
        if (r2.equals(com.instagram.realtimeclient.RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING) == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0697, code lost:
        if (r2.equals("reel_igtv_share") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x06a4, code lost:
        if (r2.equals("shopping_lightbox") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x06b0, code lost:
        if (r2.equals("qp_full_screen") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06bd, code lost:
        if (r2.equals("zero_video_setting") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x06c9, code lost:
        if (r2.equals("promote_media_picker") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06d5, code lost:
        if (r2.equals("business_onboarding_check_list") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06e1, code lost:
        if (r2.equals("direct_quick_reply_camera_fragment") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x06ed, code lost:
        if (r2.equals("direct_story_create_group") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x06f8, code lost:
        if (r2.equals("direct_permissions_inbox") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0704, code lost:
        if (r2.equals("create_collection") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0711, code lost:
        if (r2.equals("shopping_bag") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x071d, code lost:
        if (r2.equals("direct_private_story_recipients") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x072a, code lost:
        if (r2.equals("shopping_in_app_signup") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0736, code lost:
        if (r2.equals("direct_visual_reply_fragment") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0742, code lost:
        if (r2.equals("archive_home") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x074e, code lost:
        if (r2.equals("mini_shop_bloks") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x075a, code lost:
        if (r2.equals("interop_upgrade") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0767, code lost:
        if (r2.equals("user_options_redesign") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0774, code lost:
        if (r2.equals("single_media_feed") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0781, code lost:
        if (r2.equals("shopping_catalog_selection") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x078d, code lost:
        if (r2.equals("location_feed") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x079a, code lost:
        if (r2.equals("shopping_brand_selection") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x07a6, code lost:
        if (r2.equals("profile_product_feed") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x07b3, code lost:
        if (r2.equals("reel_memories_share") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x07bf, code lost:
        if (r2.equals("direct_add_members") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x07cb, code lost:
        if (r2.equals("igtv_profile") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x07d7, code lost:
        if (r2.equals("direct_selfie_sticker_camera") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x07e3, code lost:
        if (r2.equals("bake_off") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07f0, code lost:
        if (r2.equals("reel_poll_share_result_camera") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x07fd, code lost:
        if (r2.equals("shopping_tagging_product_picker") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0809, code lost:
        if (r2.equals("explore_positive_signals") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00af, code lost:
        if (r2.equals("direct_edit_quick_reply") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bc, code lost:
        if (r2.equals("shopping_product_image_viewer") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c8, code lost:
        if (r2.equals("qe_settings") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d5, code lost:
        if (r2.equals("shopping_quick_camera") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e2, code lost:
        if (r2.equals("reel_viewer") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ef, code lost:
        if (r2.equals("reel_mention_reshare") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fc, code lost:
        if (r2.equals("saved_products_feed") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0109, code lost:
        if (r2.equals("reel_settings") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0116, code lost:
        if (r2.equals("reel_product_share") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0123, code lost:
        if (r2.equals("search_find_friends") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012f, code lost:
        if (r2.equals("nametag") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013c, code lost:
        if (r2.equals("saved_tabbed_feed") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0149, code lost:
        if (r2.equals("recommend_accounts_sender") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0155, code lost:
        if (r2.equals("discover_connect_facebook") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0162, code lost:
        if (r2.equals("reel_remix_share") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x10f7, code lost:
        return r1.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016e, code lost:
        if (r2.equals("audio_page") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017b, code lost:
        if (r2.equals("saved_feed") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0186, code lost:
        if (r2.equals("direct_msys_thread") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0192, code lost:
        if (r2.equals("igtv_settings") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019f, code lost:
        if (r2.equals("smb_support_links") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ab, code lost:
        if (r2.equals("manage_highlights") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b7, code lost:
        if (r2.equals("hashtag_feed") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c3, code lost:
        if (r2.equals("direct_search_inbox_see_all_fragment") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01cf, code lost:
        if (r2.equals("payout_paypal_auth") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01dc, code lost:
        if (r2.equals("reel_feed_post_share") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e8, code lost:
        if (r2.equals("likers_list") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f5, code lost:
        if (r2.equals("secondary_account_create_username") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0200, code lost:
        if (r2.equals("direct_msys_thread_list") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020d, code lost:
        if (r2.equals("shopping_product_video_viewer") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x021a, code lost:
        if (r2.equals("reel_shoutout_share") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0226, code lost:
        if (r2.equals("effect_licensing") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0232, code lost:
        if (r2.equals("discover_connect_contacts_with_upsell") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023f, code lost:
        if (r2.equals("reel_question_response_share") == false) goto L_0x000c;
     */
    public final AnonymousClass1HD A00(AnonymousClass0C1 r26, FragmentActivity fragmentActivity, String str, Bundle bundle) {
        char c;
        C139165x9 r1;
        String str2 = str;
        switch (str2.hashCode()) {
            case -2129977679:
                c = 146;
                break;
            case -1985120417:
                c = '2';
                break;
            case -1973471444:
                c = 'J';
                break;
            case -1950200311:
                c = 'x';
                break;
            case -1932093368:
                c = 18;
                break;
            case -1831773046:
                c = 'i';
                break;
            case -1821369307:
                c = 25;
                break;
            case -1811898940:
                c = 'P';
                break;
            case -1802229308:
                c = 'A';
                break;
            case -1801080323:
                c = '6';
                break;
            case -1797027864:
                c = '!';
                break;
            case -1781624369:
                c = '3';
                break;
            case -1703194256:
                c = 131;
                break;
            case -1702723546:
                c = 'k';
                break;
            case -1691820134:
                c = 152;
                break;
            case -1689823252:
                c = 'd';
                break;
            case -1684343236:
                c = 'a';
                break;
            case -1622982898:
                c = 16;
                break;
            case -1618101831:
                c = '?';
                break;
            case -1587411498:
                c = 21;
                break;
            case -1577211727:
                c = '>';
                break;
            case -1563873855:
                c = 'U';
                break;
            case -1558133707:
                c = 7;
                break;
            case -1555587940:
                c = 22;
                break;
            case -1533823315:
                c = 15;
                break;
            case -1495209254:
                c = 139;
                break;
            case -1450975384:
                c = 129;
                break;
            case -1440995019:
                c = '`';
                break;
            case -1425497604:
                c = 31;
                break;
            case -1404928532:
                c = '.';
                break;
            case -1339494843:
                c = 'M';
                break;
            case -1331586071:
                c = 1;
                break;
            case -1326486072:
                c = '=';
                break;
            case -1319671867:
                c = 'I';
                break;
            case -1312308463:
                c = 'V';
                break;
            case -1290689391:
                c = '^';
                break;
            case -1280421951:
                c = 133;
                break;
            case -1274394802:
                c = 'w';
                break;
            case -1249016393:
                c = 'E';
                break;
            case -1157540249:
                c = '0';
                break;
            case -1152617591:
                c = 'g';
                break;
            case -938018203:
                c = 128;
                break;
            case -937875137:
                c = 'y';
                break;
            case -911418469:
                c = '8';
                break;
            case -910118754:
                c = 136;
                break;
            case -899807791:
                c = 28;
                break;
            case -895862936:
                c = 'e';
                break;
            case -881874135:
                c = '\\';
                break;
            case -866377273:
                c = 11;
                break;
            case -860547431:
                c = 'q';
                break;
            case -859225687:
                c = 12;
                break;
            case -817253090:
                c = 'L';
                break;
            case -733841392:
                c = ':';
                break;
            case -733004863:
                c = 141;
                break;
            case -717715428:
                c = 'D';
                break;
            case -686622079:
                c = 132;
                break;
            case -677852298:
                c = 'j';
                break;
            case -666102820:
                c = 'b';
                break;
            case -641587898:
                c = '%';
                break;
            case -606799870:
                c = 5;
                break;
            case -602415628:
                c = 'm';
                break;
            case -502216415:
                c = '[';
                break;
            case -473730915:
                c = '4';
                break;
            case -436618619:
                c = 'n';
                break;
            case -418657253:
                c = 'C';
                break;
            case -383248809:
                c = 151;
                break;
            case -339593795:
                c = 0;
                break;
            case -330241456:
                c = 26;
                break;
            case -324960332:
                c = '/';
                break;
            case -309425751:
                c = 'B';
                break;
            case -307187846:
                c = 29;
                break;
            case -296013621:
                c = ']';
                break;
            case -283421474:
                c = 134;
                break;
            case -261180333:
                c = '5';
                break;
            case -172339684:
                c = ';';
                break;
            case -162782665:
                c = 'O';
                break;
            case -120012257:
                c = 'X';
                break;
            case -115342632:
                c = 14;
                break;
            case -90073543:
                c = 130;
                break;
            case -76988328:
                c = '*';
                break;
            case -55796760:
                c = 140;
                break;
            case -47214837:
                c = 13;
                break;
            case -19866863:
                c = 2;
                break;
            case 3230752:
                c = 'f';
                break;
            case 46760842:
                c = 23;
                break;
            case 93832589:
                c = 145;
                break;
            case 98712316:
                c = 30;
                break;
            case 213763653:
                c = 'F';
                break;
            case 299998396:
                c = '<';
                break;
            case 315623867:
                c = 10;
                break;
            case 350678033:
                c = '(';
                break;
            case 398408014:
                c = 6;
                break;
            case 504362695:
                c = 149;
                break;
            case 506141086:
                c = 's';
                break;
            case 507742114:
                c = '7';
                break;
            case 512488364:
                c = ')';
                break;
            case 524744163:
                c = 143;
                break;
            case 530982245:
                c = 'G';
                break;
            case 550987282:
                c = '\'';
                break;
            case 554359597:
                c = 'Y';
                break;
            case 561131183:
                c = 27;
                break;
            case 564879281:
                c = '~';
                break;
            case 591778618:
                c = 'Z';
                break;
            case 598042287:
                c = '9';
                break;
            case 625847418:
                c = '|';
                break;
            case 695479845:
                c = 137;
                break;
            case 711896411:
                c = 127;
                break;
            case 752332709:
                c = 'v';
                break;
            case 807688393:
                c = '+';
                break;
            case 811602470:
                c = '1';
                break;
            case 818947074:
                c = 17;
                break;
            case 827775034:
                c = 19;
                break;
            case 853158795:
                c = 9;
                break;
            case 888562644:
                c = 20;
                break;
            case 997989018:
                c = 'z';
                break;
            case 1054532791:
                c = 142;
                break;
            case 1098798933:
                c = '}';
                break;
            case 1125573656:
                c = '#';
                break;
            case 1217039868:
                c = '@';
                break;
            case 1217257728:
                c = '{';
                break;
            case 1221340341:
                c = 'p';
                break;
            case 1266291941:
                c = 't';
                break;
            case 1283344272:
                c = '&';
                break;
            case 1285712826:
                c = 147;
                break;
            case 1314987549:
                c = '-';
                break;
            case 1318473930:
                c = 4;
                break;
            case 1325249756:
                c = 138;
                break;
            case 1329398885:
                c = 'l';
                break;
            case 1332605084:
                c = 'K';
                break;
            case 1352403547:
                c = 150;
                break;
            case 1417491156:
                c = 24;
                break;
            case 1443914289:
                c = ' ';
                break;
            case 1474421081:
                c = 'c';
                break;
            case 1484229778:
                c = 148;
                break;
            case 1486505314:
                c = 'h';
                break;
            case 1517091987:
                c = 3;
                break;
            case 1536896086:
                c = 'R';
                break;
            case 1549235544:
                c = 144;
                break;
            case 1561772228:
                c = 135;
                break;
            case 1570722833:
                c = 'u';
                break;
            case 1593752363:
                c = 'H';
                break;
            case 1594974073:
                c = 'S';
                break;
            case 1721972015:
                c = 'W';
                break;
            case 1722257990:
                c = 'r';
                break;
            case 1727940394:
                c = 'N';
                break;
            case 1737314472:
                c = 8;
                break;
            case 1783288801:
                c = 'T';
                break;
            case 1834852370:
                c = 'Q';
                break;
            case 1905468375:
                c = '\"';
                break;
            case 1929283374:
                c = '$';
                break;
            case 1960080878:
                c = '_';
                break;
            case 2060406077:
                c = ',';
                break;
            case 2066987257:
                c = 'o';
                break;
            default:
                c = 65535;
                break;
        }
        AnonymousClass1HD r9 = null;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        AnonymousClass0C1 r15 = r26;
        Bundle bundle2 = bundle;
        switch (c) {
            case 0:
                C16310oO.A00.A00();
                String string = bundle2.getString("confirm_connection_navbar_title");
                HashMap hashMap = new HashMap();
                hashMap.put("presentation_style", "modal");
                r1 = new C139165x9(r15);
                r1.A03("com.instagram.pages.screens.review_connection");
                r1.A05(hashMap);
                r1.A04(string);
                break;
            case 1:
            case 5:
                return new C96734Gh();
            case 2:
                return C17530qO.A00.A00().A04(r15);
            case 3:
                return C18260rZ.A00.A01();
            case 4:
                return C18260rZ.A00.A00();
            case 6:
                return new C110474pL();
            case 7:
                return new AnonymousClass4A8();
            case 8:
                return C17020pY.A00().A0J().A00();
            case 9:
                C17020pY.A00();
                return new AnonymousClass58S();
            case 10:
                C17020pY.A00();
                AnonymousClass581 r92 = new AnonymousClass581();
                r92.setArguments(bundle2);
                return r92;
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                return AnonymousClass1UT.A00.A02(r15);
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                return AnonymousClass1UT.A00.A00();
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                C16380oV.A00.A01();
                return new IgLiveWithGuestFragment();
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                C17020pY.A00();
                ReelMoreOptionsFragment reelMoreOptionsFragment = new ReelMoreOptionsFragment();
                reelMoreOptionsFragment.setArguments(new Bundle());
                return reelMoreOptionsFragment;
            case 15:
                return new C1890985x();
            case 16:
                return new C1891085y();
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                return new C1890785v();
            case 18:
                return new AnonymousClass863();
            case 19:
                return new C211779Bn();
            case 20:
                return new C98674Oj();
            case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                AnonymousClass56D r3 = new AnonymousClass56D(bundle2);
                r3.A00.putString("IgSessionManager.SESSION_TOKEN_KEY", r15.getToken());
                return r3.A00();
            case C120125Dh.NUM_VIEW_TYPES /*22*/:
                return new C110214ov();
            case 23:
                return new DirectSearchInboxFragment();
            case 24:
                return new DirectSearchInboxSeeAllFragment();
            case 25:
                return new C948548x();
            case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                return new C96364Ev();
            case 27:
                C21860xP.A00.A01();
                return new C110254oz();
            case 28:
                return new AnonymousClass7I1();
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                C17550qQ.A00.A00();
                C139455xl r93 = new C139455xl();
                r93.setArguments(bundle2);
                return r93;
            case 30:
                GuideFragmentConfig guideFragmentConfig = (GuideFragmentConfig) bundle2.getParcelable("arg_guide_config");
                C18830sU.A00.A00();
                AnonymousClass0a4.A06(guideFragmentConfig);
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("GuideFragment.ARGUMENT_CONFIG", guideFragmentConfig);
                C159216qt r94 = new C159216qt();
                r94.setArguments(bundle3);
                return r94;
            case 31:
                C17640qZ.A00.A04();
                BX6 bx6 = new BX6();
                bx6.setArguments(bundle2);
                return bx6;
            case ' ':
                C17910r0.A00.A01();
                return new AnonymousClass2KP();
            case '!':
                return C16230oG.A00.getFragmentFactory().Apr(bundle2.getString("LocationFeedFragment.ARGUMENT_LOCATION_VENUE_ID"));
            case '\"':
                return C17020pY.A00().A0J().A01(bundle2);
            case '#':
                C16330oQ.A00.A03();
                return new AnonymousClass860();
            case '$':
                C17510qM.A00.A0V();
                AnonymousClass865 r32 = new AnonymousClass865();
                if (!bundle2.containsKey("shopping_session_id")) {
                    bundle2.putString("shopping_session_id", (String) null);
                }
                bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", r15.getToken());
                r32.setArguments(bundle2);
                return r32;
            case '%':
                C16330oQ.A00.A03();
                return new C143326Az();
            case '&':
                C16330oQ.A00.A03();
                return new C100394Vo();
            case '\'':
                C16330oQ.A00.A03();
                return new AnonymousClass8JJ();
            case '(':
                C16330oQ.A00.A03();
                return new C192208Jr();
            case ')':
                C18600s7.A00.A00();
                C190348Bn r95 = new C190348Bn();
                r95.setArguments(bundle2);
                return r95;
            case '*':
                C16330oQ.A00.A03();
                return new C161466ui();
            case '+':
                C17510qM.A00.A0V();
                ProductDetailsPageFragment productDetailsPageFragment = new ProductDetailsPageFragment();
                productDetailsPageFragment.setArguments(bundle2);
                return productDetailsPageFragment;
            case ',':
                C17510qM.A00.A0V();
                return new HeroCarouselProductImageViewerFragment();
            case '-':
                C17510qM.A00.A0V();
                return new C102874cG();
            case '.':
                C17510qM.A00.A0V();
                return new LightboxFragment();
            case '/':
                C17510qM.A00.A0V();
                String string2 = bundle2.getString("waterfall_id");
                AnonymousClass0a4.A06(string2);
                String string3 = bundle2.getString("prior_module_name");
                AnonymousClass0a4.A06(string3);
                Bundle bundle4 = new Bundle();
                bundle4.putString("IgSessionManager.SESSION_TOKEN_KEY", r15.getToken());
                bundle4.putString("waterfall_id", string2);
                bundle4.putString("prior_module", string3);
                CSA csa = new CSA();
                csa.setArguments(bundle4);
                return csa;
            case '0':
                C17510qM.A00.A0V();
                String string4 = bundle2.getString("waterfall_id");
                AnonymousClass0a4.A06(string4);
                String string5 = bundle2.getString("prior_module_name");
                AnonymousClass0a4.A06(string5);
                Bundle bundle5 = new Bundle();
                bundle5.putString("IgSessionManager.SESSION_TOKEN_KEY", r15.getToken());
                bundle5.putString("waterfall_id", string4);
                bundle5.putString("prior_module", string5);
                CRM crm = new CRM();
                crm.setArguments(bundle5);
                return crm;
            case '1':
                C17510qM.A00.A0V();
                String string6 = bundle2.getString("waterfall_id");
                AnonymousClass0a4.A06(string6);
                String string7 = bundle2.getString("prior_module_name");
                AnonymousClass0a4.A06(string7);
                Bundle bundle6 = new Bundle();
                bundle6.putString("IgSessionManager.SESSION_TOKEN_KEY", r15.getToken());
                bundle6.putString("waterfall_id", string6);
                bundle6.putString("prior_module", string7);
                CSE cse = new CSE();
                cse.setArguments(bundle6);
                return cse;
            case AMD.MAX_LIKES_PER_FETCH /*50*/:
                CNE A0J = C17510qM.A00.A0J(r15, bundle2.getString("prior_module_name"), bundle2.getString("prior_submodule_name"), C27671CMp.A01, bundle2.getBoolean("can_tag_from_brands"));
                A0J.A00 = bundle2.getString("tagged_business_partner");
                A0J.A01 = bundle2.getString("tagged_merchant_id");
                A0J.A06 = true;
                return A0J.A00();
            case '3':
                C17510qM.A00.A0V();
                return new C53822Um();
            case '4':
                String string8 = bundle2.getString("product_id");
                AnonymousClass0a4.A06(string8);
                C17510qM.A00.A0V();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("product_id", string8);
                r1 = new C139165x9(r15);
                r1.A03("com.instagram.shopping.product_appeals_entrypoint");
                r1.A05(hashMap2);
                break;
            case '5':
                String string9 = bundle2.getString("module_name");
                return new C160506t2(fragmentActivity2, (Product) bundle2.getParcelable("product"), AnonymousClass1PZ.A00(r15).A02(bundle2.getString("media_id")), new AnonymousClass4EG(C17510qM.A00.A0V(), string9), r15).A00;
            case '6':
                C17510qM.A00.A0V();
                return new CNZ();
            case '7':
                C17510qM.A00.A0V();
                return new C27682CNb();
            case '8':
                C17510qM.A00.A0V();
                return new C167097Bf();
            case '9':
                C17510qM.A00.A0V();
                return new ProductSourceSelectionTabbedFragment();
            case ':':
                C17510qM.A00.A0V();
                String string10 = bundle2.getString("prior_module_name");
                C96254Ek r96 = new C96254Ek();
                Bundle bundle7 = new Bundle();
                bundle7.putString("IgSessionManager.SESSION_TOKEN_KEY", r15.getToken());
                bundle7.putString("prior_module_name", string10);
                r96.setArguments(bundle7);
                return r96;
            case ';':
                return C17510qM.A00.A0V().A06(bundle2.getString("prior_module_name"), r15, false);
            case '<':
                C17510qM.A00.A0V();
                String string11 = bundle2.getString("prior_module_name");
                C109284nE r97 = new C109284nE();
                Bundle bundle8 = new Bundle();
                bundle8.putString("prior_module_name", string11);
                bundle8.putString("IgSessionManager.SESSION_TOKEN_KEY", r15.getToken());
                r97.setArguments(bundle8);
                return r97;
            case '=':
                return C17510qM.A00.A0V().A0A(bundle2.getString("merchant_id"), bundle2.getString("shopping_session_id"), bundle2.getString("prior_module_name"), bundle2.getString("entry_point"), bundle2.getString("logging_token"), bundle2.getString("tracking_token"), bundle2.getString("global_bag_entry_point"), bundle2.getString("global_bag_prior_module"), bundle2.getString("checkout_session_id"), bundle2.getString("product_id_to_animate"), bundle2.getBoolean("is_modal"));
            case '>':
                return C17510qM.A00.A0V().A09(bundle2.getString("shopping_session_id"), bundle2.getString("prior_module_name"), bundle2.getString("entry_point"), bundle2.getString("tracking_token"));
            case '?':
                return C17510qM.A00.A0V().A05(r15, bundle2.getString("prior_module"), bundle2.getString("entry_point"), bundle2.getString("waterfall_id"), bundle2.getString("signup_nav_bar_title"), true, bundle2.getInt("signup_perf_logging_id"));
            case '@':
                C17510qM.A00.A0V();
                return new AnonymousClass9NN();
            case 'A':
                C17510qM.A00.A0V();
                ProfileShopFragment profileShopFragment = new ProfileShopFragment();
                profileShopFragment.setArguments(bundle2);
                return profileShopFragment;
            case 'B':
                if (bundle2.containsKey("ProfileLaunchConstants.LAUNCH_CONFIG")) {
                    return C18980sj.A00.A00().A02((UserDetailLaunchConfig) bundle2.getParcelable("ProfileLaunchConstants.LAUNCH_CONFIG"));
                }
                AnonymousClass0QD.A02("ModalActivity", "Launch config must be supplied when launching modal activity. Call UserDetailFragmentFactory.newUserDetailFragmentArgsForModal() to create arguments that include this launch config.");
                return null;
            case 'C':
                C18980sj.A00.A00();
                Bundle bundle9 = new Bundle();
                bundle9.putString("full_name", (String) null);
                C116194yq r98 = new C116194yq();
                r98.setArguments(bundle9);
                return r98;
            case 'D':
                C15940nm.A02().A03();
                C1427468o r99 = new C1427468o();
                Bundle bundle10 = new Bundle();
                bundle10.putBoolean("extra_standalone", true);
                r99.setArguments(bundle10);
                return r99;
            case 'E':
                C16330oQ.A00.A03();
                return new C1890185p();
            case 'F':
                AnonymousClass9EN r910 = new AnonymousClass9EN();
                r910.setArguments(bundle2);
                return r910;
            case 'G':
                C17990r8.A00.A00();
                AnonymousClass5G8 r911 = new AnonymousClass5G8();
                r911.setArguments(bundle2);
                return r911;
            case 'H':
                C17990r8.A00.A00();
                C120635Fk r912 = new C120635Fk();
                r912.setArguments(bundle2);
                return r912;
            case 'I':
                C17020pY.A00();
                return new C1886883w();
            case 'J':
                C17020pY.A00();
                return new C1886383r();
            case 'K':
                C17020pY.A00();
                return new C1886583t();
            case 'L':
                C17020pY.A00();
                return new C1886483s();
            case 'M':
                C17020pY.A00();
                return new C1886283q();
            case 'N':
                C17020pY.A00();
                return new C1886783v();
            case 'O':
                C17020pY.A00();
                return new C1886683u();
            case 'P':
                C17020pY.A00();
                return new C1886083o();
            case 'Q':
                C17020pY.A00();
                return new C1886183p();
            case 'R':
                C17430qE.A00.A02();
                return new C194908Vy();
            case 'S':
                C17430qE.A00.A02();
                return new AnonymousClass8V9();
            case 'T':
                return C17510qM.A00.A0V().A08((String) null, bundle2.getString("prior_module_name"));
            case 'U':
                C17430qE.A00.A02();
                String string12 = bundle2.getString("IgSessionManager.SESSION_TOKEN_KEY");
                int i = bundle2.getInt("ARGUMENT_NUM_MEDIA_COLLECTIONS");
                AnonymousClass7JN r913 = new AnonymousClass7JN();
                Bundle bundle11 = new Bundle();
                bundle11.putString("IgSessionManager.SESSION_TOKEN_KEY", string12);
                bundle11.putInt("ARGUMENT_NUM_MEDIA_COLLECTIONS", i);
                r913.setArguments(bundle11);
                return r913;
            case 'V':
                C16380oV.A00.A01();
                C23468ANp aNp = new C23468ANp();
                aNp.setArguments(bundle2);
                return aNp;
            case 'W':
                C19000sl.A00.A02();
                return new C177777iZ();
            case 'X':
                C15940nm.A02().A03();
                return new C114514w2();
            case 'Y':
                return C15940nm.A02().A03().A07(r15);
            case 'Z':
                C22410yM.A00.A00();
                C147816Tm r914 = new C147816Tm();
                r914.setArguments(bundle2);
                return r914;
            case '[':
                C22410yM.A00.A00();
                AnonymousClass0a4.A06(bundle2.getString("IgSessionManager.SESSION_TOKEN_KEY"));
                AnonymousClass0a4.A06(bundle2.getString("ad_id"));
                AnonymousClass0a4.A06(bundle2.getString("tracking_token"));
                C225439n9 r915 = new C225439n9();
                r915.setArguments(bundle2);
                return r915;
            case '\\':
                DeveloperOptionsLauncher.loadAndLaunchDeveloperOptions(fragmentActivity2.getApplicationContext(), fragmentActivity2.A05(), fragmentActivity2, r15, bundle2);
                return null;
            case ']':
                return (AnonymousClass1HD) Class.forName("com.instagram.analytics.eventlog.EventLogListFragment").newInstance();
            case '^':
                return (AnonymousClass1HD) Class.forName("com.instagram.analytics.navigation.debug.ModuleStackFragment").newInstance();
            case '_':
                try {
                    return (AnonymousClass1HD) Class.forName("com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment").newInstance();
                } catch (Exception e) {
                    AnonymousClass0QD.A0A("ModalActivity", e);
                    return null;
                }
            case '`':
                return AnonymousClass2UZ.A00().A0F(r15);
            case 'a':
                C16270oK.A00.A01();
                return new ArchiveHomeFragment();
            case 'b':
                C16270oK.A00.A01();
                ArchiveReelFragment archiveReelFragment = new ArchiveReelFragment();
                archiveReelFragment.setArguments(bundle2);
                return archiveReelFragment;
            case 'c':
                C16270oK.A00.A01();
                ManageHighlightsFragment manageHighlightsFragment = new ManageHighlightsFragment();
                manageHighlightsFragment.setArguments(bundle2);
                return manageHighlightsFragment;
            case 'd':
                C17510qM.A00.A0V();
                return C53802Uk.A00(bundle2, r15, "com.bloks.www.minishops.storefront.ig", C0003R.layout.mini_shop_storefront_loading_screen);
            case 'e':
                C26880Bu4 bu4 = new C26880Bu4();
                bu4.setArguments(bundle2);
                return bu4;
            case 'f':
                r9 = new C162256wC();
                if (bundle != null) {
                    r9.setArguments(bundle2);
                    return r9;
                }
                break;
            case 'g':
                r9 = new IGTVBrowseFragment();
                if (bundle != null) {
                    r9.setArguments(bundle2);
                    return r9;
                }
                break;
            case 'h':
                return new AnonymousClass5E3();
            case 'i':
                C1651472n r916 = new C1651472n();
                bundle2.putBoolean("igtv_is_launching_tab_for_destination", false);
                r916.setArguments(bundle2);
                return r916;
            case 'j':
                AnonymousClass76D r917 = new AnonymousClass76D();
                r917.setArguments(bundle2);
                return r917;
            case 'k':
                C17480qJ.A00.A00();
                return new C1170350s();
            case 'l':
                C17530qO.A00.A00();
                C128365eZ r918 = new C128365eZ();
                r918.setArguments(bundle2);
                return r918;
            case 'm':
                C16980pU.A00.A00();
                return new AnonymousClass2VA(bundle2).A00();
            case 'n':
                C17530qO.A00.A00();
                C127635dO r919 = new C127635dO();
                r919.setArguments(bundle2);
                return r919;
            case 'o':
                return new AnonymousClass4NG();
            case 'p':
                C17020pY.A00();
                return new C1885883m();
            case 'q':
                C17020pY.A00();
                return new C1885783k();
            case 'r':
                if (C22120xs.A01()) {
                    C22120xs.A00().A02();
                    return new C28200Cd2();
                }
                break;
            case 's':
                if (C22100xq.A01()) {
                    return C22100xq.A00().A02().A00(2);
                }
                break;
            case 't':
                if (C22100xq.A01()) {
                    return C22100xq.A00().A02().A02((String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, 2, true);
                }
                break;
            case 'u':
                if (C22100xq.A01()) {
                    return C22100xq.A00().A02().A00(1);
                }
                break;
            case 'v':
                if (C22100xq.A01()) {
                    C22100xq.A00().A02();
                    return AnonymousClass5W2.A00(bundle2);
                }
                break;
            case 'w':
                return AnonymousClass2UZ.A00().A0B(bundle2);
            case 'x':
                return AnonymousClass2UZ.A00().A0K(bundle2.getString("extra_data_token"));
            case 'y':
                return C17530qO.A00.A00().A03(bundle2);
            case 'z':
                C16270oK.A00.A01();
                String token = r15.getToken();
                Bundle bundle12 = new Bundle();
                bundle12.putBoolean("EXTRA_CAPTURE_INPUT_ONLY", true);
                bundle12.putString("IgSessionManager.SESSION_TOKEN_KEY", token);
                SelectHighlightsCoverFragment selectHighlightsCoverFragment = new SelectHighlightsCoverFragment();
                selectHighlightsCoverFragment.setArguments(bundle12);
                Bundle bundle13 = selectHighlightsCoverFragment.mArguments;
                if (bundle13 != null) {
                    bundle13.putAll(bundle2);
                    return selectHighlightsCoverFragment;
                }
                selectHighlightsCoverFragment.setArguments(bundle2);
                return selectHighlightsCoverFragment;
            case '{':
                C17020pY.A00();
                C155696kq r920 = new C155696kq();
                r920.setArguments(bundle2);
                return r920;
            case '|':
                C25084Azi azi = new C25084Azi();
                C05230Is.A00(r15, bundle2);
                azi.setArguments(bundle2);
                return azi;
            case '}':
                return C18260rZ.A00.A03(bundle2);
            case '~':
                return C17480qJ.A00.A00().A01(r15.getToken(), "instagram_direct", "Direct Messages");
            case 127:
                AnonymousClass490 r921 = new AnonymousClass490();
                r921.setArguments(bundle2);
                return r921;
            case 128:
                return C18260rZ.A00.A02(bundle2);
            case 129:
                String string13 = bundle2.getString("entryPoint");
                String string14 = bundle2.getString("coupon_offer_id");
                if (((Boolean) AnonymousClass0L6.A02(r15, AnonymousClass0L7.PROMOTE_MEDIA_PICKER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    return C16310oO.A00.A03().A01(string13, string14);
                }
                return C16310oO.A00.A00().A01(string13, string14);
            case 130:
                C27341Hl Apw = C16590oq.A00.A02().Apw();
                Apw.setArguments(bundle2);
                return Apw;
            case 131:
                AnonymousClass1HD A08 = AnonymousClass2UZ.A00().A08();
                A08.setArguments(bundle2);
                return A08;
            case 132:
                C17020pY.A00();
                return new AnonymousClass83j();
            case 133:
                C17020pY.A00();
                return new AnonymousClass83l();
            case 134:
                C17020pY.A00();
                return new AnonymousClass861();
            case 135:
                C17020pY.A00();
                return new C1891185z();
            case 136:
                C17020pY.A00();
                return new C1885983n();
            case 137:
                C22020xi.A00.A00();
                C139165x9 r33 = new C139165x9(r15);
                r33.A03("com.instagram.ads.ads_data_preferences_notice");
                r33.A05(new HashMap());
                r33.A04(fragmentActivity2.getResources().getString(C0003R.string.ads_data_preferences_notice_title));
                r33.A00.A0K = true;
                return r33.A02();
            case 138:
                C18090rI.A00.A00();
                C132945m7 r922 = new C132945m7();
                r922.setArguments(bundle2);
                return r922;
            case 139:
                C16310oO.A00.A00();
                OnboardingCheckListFragment onboardingCheckListFragment = new OnboardingCheckListFragment();
                onboardingCheckListFragment.setArguments(bundle2);
                return onboardingCheckListFragment;
            case 140:
                C18010rA.A00.A00();
                return new C25768BZc();
            case 141:
                C18600s7.A00.A00();
                AnonymousClass866 r923 = new AnonymousClass866();
                r923.setArguments(bundle2);
                return r923;
            case 142:
                C18600s7.A00.A00();
                return new ClipsViewerFragment();
            case 143:
                C18600s7.A00.A00();
                ClipsShareHomeFragment clipsShareHomeFragment = new ClipsShareHomeFragment();
                clipsShareHomeFragment.setArguments(bundle2);
                return clipsShareHomeFragment;
            case 144:
                C18600s7.A00.A00();
                AnonymousClass8BY r924 = new AnonymousClass8BY();
                r924.setArguments(bundle2);
                return r924;
            case 145:
                C53762Uf r925 = new C53762Uf();
                r925.setArguments(bundle2);
                return r925;
            case 146:
                C22080xo.A00().A02();
                String string15 = bundle2.getString("SOURCE_MEDIA_ID");
                String string16 = bundle2.getString("explore_session_id");
                boolean z = bundle2.getBoolean("is_modal");
                Bundle bundle14 = new Bundle();
                if (string15 != null) {
                    bundle14.putString("SOURCE_MEDIA_ID", string15);
                }
                bundle14.putString("explore_session_id", string16);
                bundle14.putBoolean("is_modal", z);
                AnonymousClass8WK r926 = new AnonymousClass8WK();
                r926.setArguments(bundle14);
                return r926;
            case 147:
                C16330oQ.A00.A03();
                C1886983x r927 = new C1886983x();
                r927.setArguments(bundle2);
                return r927;
            case 148:
                return C16310oO.A00.A00().A02("sticker", UUID.randomUUID().toString(), (AnonymousClass2A5) bundle2.getSerializable("args_service_type"));
            case 149:
                return C16310oO.A00.A00().A04(UUID.randomUUID().toString(), bundle2.getString("APP_ID"), bundle2.getString("PARTNER_NAME"), bundle2.getString("PLACEHOLDER_URL"), bundle2.getString("AUTOFILL_URL"), "sticker", (AnonymousClass2A5) bundle2.getSerializable("args_service_type"));
            case 150:
                C18640sB.A00().A00();
                return new C155706kr();
            case 151:
                return new SandboxSelectorFragment();
            case 152:
                return new C99184Qr();
        }
    }
}
