package p000X;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0oA  reason: invalid class name and case insensitive filesystem */
public final class C16180oA implements C06570Po {
    public SharedPreferences A00;

    public final void A0D() {
        this.A00.edit().putBoolean("has_seen_favorites_change_confirmation_dialog", true).apply();
    }

    public final void A0E() {
        this.A00.edit().putBoolean("has_seen_direct_reply_bottom_sheet", true).apply();
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C16180oA A00(AnonymousClass0C1 r2) {
        return (C16180oA) r2.AVA(C16180oA.class, new C16190oB(r2));
    }

    public final int A02() {
        return this.A00.getInt("dialog_after_sharing_story_show_times", 0);
    }

    public final int A03() {
        return this.A00.getInt("self_story_sharing_option_dialog_show_times", 0);
    }

    public final String A04() {
        return this.A00.getString("branded_content_eligibility_decision", (String) null);
    }

    public final String A05() {
        return this.A00.getString("share_to_fb_settings", (String) null);
    }

    public final Set A06(String str) {
        return this.A00.getStringSet(AnonymousClass000.A0E(str, "_limit_location_list"), new HashSet());
    }

    public final void A07() {
        this.A00.edit().remove("recent_hashtag_searches_with_ts").apply();
    }

    public final void A08() {
        this.A00.edit().remove("recent_place_searces").apply();
    }

    public final void A09() {
        this.A00.edit().remove("recent_user_searches").apply();
    }

    public final void A0A() {
        this.A00.edit().remove("recent_user_searches_with_ts").apply();
    }

    public final void A0B() {
        this.A00.edit().putInt("video_call_cowatch_tooltip_display_count", this.A00.getInt("video_call_cowatch_tooltip_display_count", 0) + 1).apply();
    }

    public final void A0C() {
        this.A00.edit().putInt("video_editing_tooltip_seen_count", this.A00.getInt("video_editing_tooltip_seen_count", 0) + 1).apply();
    }

    public final void A0F() {
        this.A00.edit().putBoolean("has_shown_checkout_awareness_interstitial", true).apply();
    }

    public final void A0G() {
        this.A00.edit().putBoolean("has_used_shopping_bag", true).apply();
    }

    public final void A0H(int i) {
        this.A00.edit().putInt("anti_bully_tooltip_shown_count", i).apply();
    }

    public final void A0I(int i) {
        this.A00.edit().putInt("anti_bully_global_tooltip_shown_count", i).apply();
    }

    public final void A0K(int i) {
        this.A00.edit().putInt("voter_registration_tooltip_shown_count", i).apply();
    }

    public final void A0L(int i) {
        this.A00.edit().putInt("zero_rating_story_nux_count", i).apply();
    }

    public final void A0M(long j) {
        this.A00.edit().putLong("last_seen_upsell_on_discover_people_timestamp", j).apply();
    }

    public final void A0N(String str) {
        Set hashSet;
        if (this.A00.contains("profile_pending_hide_or_remove_medias")) {
            hashSet = this.A00.getStringSet("profile_pending_hide_or_remove_medias", new HashSet());
        } else {
            hashSet = new HashSet();
        }
        hashSet.remove(str);
        this.A00.edit().putStringSet("profile_pending_hide_or_remove_medias", hashSet).apply();
    }

    public final void A0O(String str) {
        this.A00.edit().putString("branded_content_eligibility_decision", str).apply();
    }

    public final void A0P(String str) {
        this.A00.edit().putString("last_posted_reel_item_type", str).apply();
    }

    public final void A0Q(String str) {
        this.A00.edit().putString("linked_fb_page_id", str).apply();
    }

    public final void A0R(String str) {
        this.A00.edit().putString("reel_message_prefs", str).apply();
    }

    public final void A0S(String str) {
        this.A00.edit().putString("remaining_nux_steps", str).apply();
    }

    public final void A0T(String str) {
        this.A00.edit().putString("share_to_fb_settings", str).apply();
    }

    public final void A0U(String str, int i) {
        this.A00.edit().putInt(AnonymousClass000.A0E("bloks_shown_count_", str), i).apply();
    }

    public final void A0V(String str, int i) {
        this.A00.edit().putInt(AnonymousClass000.A0E("text_to_camera_custom_text_color_scheme_index_", str), i).apply();
    }

    public final void A0W(String str, int i) {
        this.A00.edit().putInt(AnonymousClass000.A0E("text_to_camera_gradient_background_index_", str), i).apply();
    }

    public final void A0X(String str, boolean z) {
        this.A00.edit().putBoolean(AnonymousClass000.A0E(str, "_limit_location_enabled"), z).apply();
    }

    public final void A0Y(String str, boolean z) {
        if (str != null) {
            this.A00.edit().putBoolean(AnonymousClass000.A0E("unsend_warning_banner_enabled_for_thread/", str), z).apply();
        }
    }

    public final void A0Z(Set set) {
        this.A00.edit().remove("preference_story_recently_donated_fundraisers_with_ts").apply();
        this.A00.edit().putStringSet("preference_story_recently_donated_fundraisers_with_ts", set).apply();
    }

    public final void A0a(boolean z) {
        this.A00.edit().putBoolean("allow_contacts_sync", z).apply();
    }

    public final void A0b(boolean z) {
        this.A00.edit().putBoolean("allow_story_reshare", z).apply();
    }

    public final void A0c(boolean z) {
        this.A00.edit().putBoolean("auto_save_reel_media_to_gallery", z).apply();
    }

    public final void A0d(boolean z) {
        this.A00.edit().putBoolean("has_interop_enable", z).apply();
    }

    public final void A0e(boolean z) {
        this.A00.edit().putBoolean("felix_crossposting_sticky_pref", z).apply();
    }

    public final void A0f(boolean z) {
        this.A00.edit().putBoolean("is_presence_enabled", z).apply();
        this.A00.edit().putLong("presence_last_set", System.currentTimeMillis()).apply();
    }

    public final void A0g(boolean z) {
        this.A00.edit().putBoolean("should_force_effect_metadata_request", z).apply();
    }

    public final void A0h(boolean z) {
        this.A00.edit().putBoolean("direct_share_activity_preview", z).apply();
        this.A00.edit().putLong("message_preview_last_set", System.currentTimeMillis()).apply();
    }

    public final void A0i(boolean z) {
        this.A00.edit().putBoolean("oxp_show_app_update_available_notifications", z).apply();
    }

    public final void A0j(boolean z) {
        this.A00.edit().putBoolean("show_business_welcome_dialog", z).apply();
    }

    public final boolean A0k() {
        if (this.A00.contains("checkout_awareness_interstitial_shown_count_pdp") || this.A00.contains("checkout_awareness_interstitial_shown_count_drops_pdp") || this.A00.contains("checkout_awareness_interstitial_shown_count_shop_home") || this.A00.contains("checkout_awareness_interstitial_shown_count_shopping_bag")) {
            A0F();
            this.A00.edit().remove("checkout_awareness_interstitial_shown_count_pdp").apply();
            this.A00.edit().remove("checkout_awareness_interstitial_shown_count_drops_pdp").apply();
            this.A00.edit().remove("checkout_awareness_interstitial_shown_count_shop_home").apply();
            this.A00.edit().remove("checkout_awareness_interstitial_shown_count_shopping_bag").apply();
            this.A00.edit().remove("checkout_awareness_interstitial_last_shown_time_ms").apply();
        }
        return this.A00.getBoolean("has_shown_checkout_awareness_interstitial", false);
    }

    public final boolean A0l() {
        return this.A00.getBoolean("is_presence_enabled", true);
    }

    public final boolean A0m() {
        return this.A00.getBoolean("save_original_photos", true);
    }

    public final boolean A0n() {
        return this.A00.getBoolean("oxp_allow_app_updates", true);
    }

    public final boolean A0o(String str) {
        return this.A00.getBoolean(AnonymousClass000.A0E(str, "_limit_location_enabled"), false);
    }

    public final boolean A0p(String str) {
        return this.A00.getBoolean(AnonymousClass000.A0E("dismissed_find_people_card", str), false);
    }

    public C16180oA(AnonymousClass0C1 r3) {
        this.A00 = C14190ju.A01(r3).A03(Constants.A0n);
    }

    public static void A01(AnonymousClass0C1 r1, int i) {
        C14190ju.A01(r1).A03(Constants.A0n).edit().putInt("num_unseen_activities", i).apply();
    }

    public final void A0J(int i) {
        this.A00.edit().putInt("should_show_like_direct_message_count", i).apply();
    }
}
