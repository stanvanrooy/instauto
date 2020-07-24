package p000X;

import com.facebook.react.modules.datepicker.DatePickerDialogModule;

/* renamed from: X.0iD  reason: invalid class name and case insensitive filesystem */
public final class C13250iD {
    public static C13260iE parseFromJson(C13080hr r4) {
        C13260iE r3 = new C13260iE();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if (DatePickerDialogModule.ARG_MODE.equals(A0i)) {
                r3.A02 = r4.A0I();
            } else if ("gradient".equals(A0i)) {
                r3.A01 = r4.A0I();
            } else {
                String str = null;
                if ("emoji".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    r3.A04 = str;
                } else if ("emoji_color".equals(A0i)) {
                    r3.A00 = r4.A0I();
                } else if ("selfie_sticker".equals(A0i)) {
                    r3.A03 = r4.A0I();
                } else if ("selfie_url".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    r3.A05 = str;
                }
            }
            r4.A0f();
        }
        return r3;
    }

    public static void A00(C13460iZ r2, C13260iE r3) {
        r2.A0T();
        r2.A0F(DatePickerDialogModule.ARG_MODE, r3.A02);
        r2.A0F("gradient", r3.A01);
        String str = r3.A04;
        if (str != null) {
            r2.A0H("emoji", str);
        }
        r2.A0F("emoji_color", r3.A00);
        r2.A0F("selfie_sticker", r3.A03);
        String str2 = r3.A05;
        if (str2 != null) {
            r2.A0H("selfie_url", str2);
        }
        r2.A0Q();
    }
}
