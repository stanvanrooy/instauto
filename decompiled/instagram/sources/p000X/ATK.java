package p000X;

import android.util.Log;
import java.util.Locale;

/* renamed from: X.ATK */
public final class ATK {
    public static boolean A00;

    public static void A00(String str, String str2, Object... objArr) {
        if (C23602ATi.A04) {
            if (C23602ATi.A03 == null) {
                C23602ATi.A03 = new C23602ATi();
            }
            C23602ATi aTi = C23602ATi.A03;
            String str3 = str2;
            if (objArr.length != 0) {
                str3 = String.format((Locale) null, str2, objArr);
            }
            aTi.A00(AnonymousClass000.A0J(str, ": ", str3));
        }
        A03(str2, objArr);
    }

    public static void A01(String str, String str2, Object... objArr) {
        if (C23602ATi.A04) {
            if (C23602ATi.A03 == null) {
                C23602ATi.A03 = new C23602ATi();
            }
            C23602ATi aTi = C23602ATi.A03;
            String str3 = str2;
            if (objArr.length != 0) {
                str3 = String.format((Locale) null, str2, objArr);
            }
            aTi.A00(AnonymousClass000.A0J(str, ": ", str3));
        }
        if (A00) {
            if (objArr.length != 0) {
                str2 = String.format((Locale) null, str2, objArr);
            }
            Log.e(str, str2);
        }
    }

    public static void A02(String str, Throwable th, String str2, Object... objArr) {
        if (A00) {
            if (objArr.length != 0) {
                str2 = String.format((Locale) null, str2, objArr);
            }
            Log.e(str, str2, th);
        }
    }

    public static void A03(String str, Object... objArr) {
        if (A00 && objArr.length != 0) {
            String.format((Locale) null, str, objArr);
        }
    }
}
