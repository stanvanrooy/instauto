package p000X;

import android.content.Context;

/* renamed from: X.0sV  reason: invalid class name and case insensitive filesystem */
public final class C18840sV extends C18850sW {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (p000X.C63272pA.A0C(r3) != false) goto L_0x0018;
     */
    public final Boolean A00(Context context, String str) {
        boolean z;
        C13150hy.A02(context, "context");
        C13150hy.A02(str, "contentType");
        String A05 = C254518v.A05(str);
        if (A05 != null) {
            z = false;
        }
        z = true;
        if (z) {
            return false;
        }
        return C254518v.A01(context, A05);
    }

    public final void A01(Context context, String str) {
        C13150hy.A02(context, "context");
        C13150hy.A02(str, "contentType");
        if (!C06100Nt.A01(context)) {
            C254518v.A07(context);
        } else if (!C13150hy.A05(A00(context, str), true)) {
            C254518v.A0K(context, C254518v.A05(str));
        }
    }
}
