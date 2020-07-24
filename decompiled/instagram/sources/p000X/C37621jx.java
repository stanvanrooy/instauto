package p000X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.1jx  reason: invalid class name and case insensitive filesystem */
public final class C37621jx {
    public static C37631jy A01(AnonymousClass1NJ r6, Context context, String str, Integer num) {
        return A02(r6, context, str, num, false, false);
    }

    public static C37631jy A02(AnonymousClass1NJ r10, Context context, String str, Integer num, boolean z, boolean z2) {
        C37671k2 r3;
        AnonymousClass1NJ r4 = r10;
        if (r10.AiO()) {
            r3 = r10.A0e();
        } else {
            r3 = null;
        }
        return new C37631jy(r10.getId(), A00(r4, context, str, num, z, z2, false), r3);
    }

    public static AnonymousClass1GK A00(AnonymousClass1NJ r2, Context context, String str, Integer num, boolean z, boolean z2, boolean z3) {
        ImageUrl A0S;
        if (num != Constants.ZERO && !z2) {
            A0S = r2.A0F();
        } else if (!z || !r2.A1a() || r2.A0E() == null) {
            A0S = r2.A0S(context);
        } else {
            A0S = r2.A0E();
        }
        AnonymousClass1GH A0D = AnonymousClass12C.A0c.A0D(A0S, str);
        A0D.A0G = true;
        A0D.A0H = z3;
        if (!TextUtils.isEmpty(r2.A26)) {
            A0D.A06 = r2.A26;
        }
        return A0D.A00();
    }

    public static C37631jy A03(AnonymousClass1NJ r8, String str, boolean z) {
        return new C37631jy(r8.getId(), A00(r8, (Context) null, str, Constants.ONE, false, false, z), (C37671k2) null);
    }
}
