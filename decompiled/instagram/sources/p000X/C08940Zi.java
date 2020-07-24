package p000X;

import android.os.Build;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.0Zi  reason: invalid class name and case insensitive filesystem */
public final class C08940Zi extends C09790c1 {
    public static /* synthetic */ void A00() {
        String str;
        AnonymousClass0L7 r3 = AnonymousClass0L7.MPROTECT_CODE;
        if (!C05630Li.A03(new C05000Hl("madv_after_startup", r3, false, (String[]) null, (AnonymousClass04H) null))) {
            if (C05630Li.A03(new C05000Hl("madv_rand_code", r3, false, (String[]) null, (AnonymousClass04H) null))) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 21) {
                    DalvikInternals.madviseFile("base.odex");
                    if (i >= 26) {
                        str = "base.vdex";
                    }
                } else {
                    str = "classes.dex";
                }
                DalvikInternals.madviseFile(str);
            }
            if (C05630Li.A03(new C05000Hl("madv_rand_apk", r3, false, (String[]) null, (AnonymousClass04H) null))) {
                DalvikInternals.madviseFile("/base.apk");
            }
        }
    }

    public final void A07() {
        int A03 = AnonymousClass0Z0.A03(-89011863);
        C05700Lp.A00().ADc(new C09010Zq(this));
        AnonymousClass0Z0.A0A(1760287412, A03);
    }
}
