package p000X;

import com.facebook.C0003R;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.BYC */
public final class BYC {
    public static final BYC A03 = new BYC(-1, C0003R.string.display_theme_system_default, "2");
    public static final BYC A04 = new BYC(2, C0003R.string.display_theme_setting_dark_option, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
    public static final BYC A05 = new BYC(1, C0003R.string.display_theme_setting_light_option, "0");
    public String A00;
    public final int A01;
    public final int A02;

    public BYC(int i, int i2, String str) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = str;
    }
}
