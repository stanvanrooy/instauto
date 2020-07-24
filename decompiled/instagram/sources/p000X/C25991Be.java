package p000X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.1Be  reason: invalid class name and case insensitive filesystem */
public final class C25991Be {
    public static C25991Be A02;
    public String A00;
    public final SharedPreferences A01;

    public C25991Be(Context context) {
        C22560yd A002 = new C22530ya(context, "AuthHeaderPrefs").A00();
        this.A01 = A002;
        this.A00 = A002.getString("DEVICE_HEADER_ID", "");
    }
}
