package p000X;

import android.content.Context;

/* renamed from: X.05s  reason: invalid class name and case insensitive filesystem */
public final class C031505s extends C10450dK {
    public final C10930e7 A00;

    public final String A00() {
        return "com.facebook.rti.mqtt.ACTION_ZR_SWITCH";
    }

    public final String A01() {
        return "ZeroRatingConnectionConfigOverrides";
    }

    public final void A05(String str, String str2) {
        C11000eG A002 = this.A04.A00(Constants.A07).A00();
        A002.A00.putString("zero_rating_last_host", str);
        A002.A00.putLong("zero_rating_last_host_timestamp", System.currentTimeMillis());
        A002.A00.apply();
    }

    public C031505s(Context context, C07630Tv r8, Integer num, C10960eC r10, C10930e7 r11) {
        super(context, r8, num, r10);
        this.A00 = r11;
        C10980eE A002 = this.A04.A00(Constants.A07);
        if (System.currentTimeMillis() - A002.A00.getLong("zero_rating_last_host_timestamp", 0) < 86400000) {
            this.A06 = A002.A00.getString("zero_rating_last_host", (String) null);
        }
    }
}
