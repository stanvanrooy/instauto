package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Lw  reason: invalid class name and case insensitive filesystem */
public final class C05770Lw {
    public static C05770Lw A01;
    public static final Set A02 = new HashSet();
    public SharedPreferences A00;

    public static synchronized C05770Lw A00() {
        C05770Lw A012;
        synchronized (C05770Lw.class) {
            A012 = A01(StoredPreferences.A00);
        }
        return A012;
    }

    public static synchronized C05770Lw A01(Context context) {
        C05770Lw r0;
        synchronized (C05770Lw.class) {
            if (A01 == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                A01 = new C05770Lw(context);
            }
            r0 = A01;
        }
        return r0;
    }

    public final String A02() {
        return this.A00.getString("configuration_device_spoof_id", (String) null);
    }

    public final String A03() {
        return this.A00.getString("configuration_user_spoof_id", (String) null);
    }

    public final String A04() {
        return this.A00.getString("dev_server_name", "");
    }

    public final String A05() {
        return this.A00.getString("qe_user_bisect_id", (String) null);
    }

    public final Set A06() {
        return new HashSet(this.A00.getStringSet("local_media_injector_feed_ads_ids", Collections.emptySet()));
    }

    public final Set A07() {
        return new HashSet(this.A00.getStringSet("local_media_injector_feed_netego_ids", Collections.emptySet()));
    }

    public final Set A08() {
        return new HashSet(this.A00.getStringSet("local_media_injector_stories_ads_ids", Collections.emptySet()));
    }

    public final Set A09() {
        return new HashSet(this.A00.getStringSet("local_media_injector_stories_netego_ids", Collections.emptySet()));
    }

    public final void A0A(int i) {
        this.A00.edit().putInt("qe_user_bisect_top", i).apply();
    }

    public final void A0B(int i) {
        this.A00.edit().putInt("qe_user_bisect_bottom", i).apply();
    }

    public final void A0C(boolean z) {
        this.A00.edit().putBoolean("using_dev_server", z).apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        if (r0 >= 0) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a A[RETURN] */
    public final boolean A0D() {
        boolean z;
        String[] split = this.A00.getString("debug_allow_user_certs_ttl", "").split(":");
        boolean z2 = false;
        if (split.length == 2) {
            try {
                long parseLong = Long.parseLong(split[0]);
                long parseLong2 = Long.parseLong(split[1]);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis >= parseLong) {
                    int i = ((currentTimeMillis - parseLong) > parseLong2 ? 1 : ((currentTimeMillis - parseLong) == parseLong2 ? 0 : -1));
                    z = false;
                }
                z = true;
                if (z) {
                    try {
                        this.A00.edit().putBoolean("debug_allow_user_certs", false).apply();
                    } catch (NumberFormatException unused) {
                    }
                }
            } catch (NumberFormatException unused2) {
            }
            if (this.A00.getBoolean("debug_allow_user_certs", false) && !z) {
                z2 = true;
            }
            if (z2 || !A02.contains("debug_allow_user_certs")) {
                return z2;
            }
            return true;
        }
        z = false;
        z2 = true;
        if (z2 || !A02.contains("debug_allow_user_certs")) {
        }
    }

    public final boolean A0H() {
        return this.A00.getBoolean("show_iglive_mute", false);
    }

    public final boolean A0I() {
        return this.A00.getBoolean("show_live_video_debug", false);
    }

    public final boolean A0J() {
        if (this.A00.getBoolean("force_new_nux_reel", false) || this.A00.getBoolean("force_mock_post_live_reel", false) || this.A00.getBoolean("force_mock_close_friends_reel", false) || this.A00.getBoolean("force_mock_large_reel", false) || this.A00.getBoolean("force_mock_many_large_reels", false) || this.A00.getBoolean("force_mock_empty_reel", false)) {
            return true;
        }
        return false;
    }

    public final boolean A0K() {
        return this.A00.getBoolean("using_dev_server", false);
    }

    public final boolean A0L() {
        return this.A00.getBoolean("show_debug_head", false);
    }

    public C05770Lw(Context context) {
        this.A00 = C05790Ly.A01(context, "devprefs");
    }

    public final boolean A0E() {
        if (A02() != null) {
            return true;
        }
        return false;
    }

    public final boolean A0F() {
        if (A03() != null) {
            return true;
        }
        return false;
    }

    public final boolean A0G() {
        if (A05() != null) {
            return true;
        }
        return false;
    }
}
