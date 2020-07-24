package p000X;

import com.instagram.user.model.MicroUser;

/* renamed from: X.24a  reason: invalid class name and case insensitive filesystem */
public final class C474524a {
    public static MicroUser parseFromJson(C13080hr r4) {
        MicroUser microUser = new MicroUser();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("username".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                microUser.A04 = str;
            } else if ("full_name".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                microUser.A02 = str;
            } else if ("profile_pic_url".equals(A0i)) {
                microUser.A00 = C13270iF.A00(r4);
            } else if ("pk".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                microUser.A03 = str;
            } else if ("is_approved".equals(A0i)) {
                microUser.A05 = r4.A0O();
            } else if (!"has_password".equals(A0i)) {
                continue;
            } else {
                int A0I = r4.A0I();
                if (MicroUser.PasswordState.values().length <= A0I || A0I < 0) {
                    throw new UnsupportedOperationException();
                }
                microUser.A01 = MicroUser.PasswordState.values()[A0I];
            }
            r4.A0f();
        }
        return microUser;
    }

    public static void A00(C13460iZ r2, MicroUser microUser) {
        r2.A0T();
        String str = microUser.A04;
        if (str != null) {
            r2.A0H("username", str);
        }
        String str2 = microUser.A02;
        if (str2 != null) {
            r2.A0H("full_name", str2);
        }
        if (microUser.A00 != null) {
            r2.A0d("profile_pic_url");
            C13270iF.A01(r2, microUser.A00);
        }
        String str3 = microUser.A03;
        if (str3 != null) {
            r2.A0H("pk", str3);
        }
        r2.A0I("is_approved", microUser.A05);
        MicroUser.PasswordState passwordState = microUser.A01;
        if (passwordState != null) {
            r2.A0F("has_password", passwordState.ordinal());
        }
        r2.A0Q();
    }
}
