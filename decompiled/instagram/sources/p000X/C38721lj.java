package p000X;

import com.instagram.model.mediatype.MediaType;

/* renamed from: X.1lj  reason: invalid class name and case insensitive filesystem */
public final class C38721lj {
    public static Integer A00(AnonymousClass1NJ r2, AnonymousClass0C1 r3) {
        if (r2.A0Q(r3).A1f()) {
            return Constants.A0j;
        }
        if (r2.A0Q(r3).Aho()) {
            return Constants.A0Y;
        }
        if (r2.A1P()) {
            return Constants.A0C;
        }
        if (r2.A1O()) {
            return Constants.ONE;
        }
        if (r2.A1a()) {
            return Constants.A0N;
        }
        if (!AnonymousClass1YR.Clips.equals(r2.A0t) || !AnonymousClass1WV.A03(r3)) {
            return Constants.ZERO;
        }
        return Constants.A0u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r0 != false) goto L_0x001f;
     */
    public static boolean A01(AnonymousClass1NJ r2, AnonymousClass0C1 r3) {
        boolean z;
        boolean A1P;
        if (r2.APx() == MediaType.PHOTO) {
            if (!r2.A1O()) {
                if (r2.A0Q(r3).Aho()) {
                    A1P = C36961it.A01(r2);
                } else {
                    A1P = r2.A1P();
                }
                z = false;
            }
            z = true;
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }
}
