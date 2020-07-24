package p000X;

import java.io.Serializable;
import java.util.Collections;

/* renamed from: X.C0C */
public final class C0C extends C23 implements Serializable {
    public static final C0C A00 = new C0C();
    public static final C27180Bzy A01;
    public static final C27180Bzy A02;
    public static final C27180Bzy A03;
    public static final C27180Bzy A04;

    static {
        Class<String> cls = String.class;
        A04 = new C27180Bzy((C0s) null, C0w.A00(cls), C00.A01(cls, (C27179Bzx) null, (C3Z) null), Collections.emptyList());
        Class cls2 = Boolean.TYPE;
        A01 = new C27180Bzy((C0s) null, C0w.A00(cls2), C00.A01(cls2, (C27179Bzx) null, (C3Z) null), Collections.emptyList());
        Class cls3 = Integer.TYPE;
        A02 = new C27180Bzy((C0s) null, C0w.A00(cls3), C00.A01(cls3, (C27179Bzx) null, (C3Z) null), Collections.emptyList());
        Class cls4 = Long.TYPE;
        A03 = new C27180Bzy((C0s) null, C0w.A00(cls4), C00.A01(cls4, (C27179Bzx) null, (C3Z) null), Collections.emptyList());
    }

    public static final C27180Bzy A00(C0L c0l) {
        Class<String> cls = c0l.A00;
        if (cls == String.class) {
            return A04;
        }
        if (cls == Boolean.TYPE) {
            return A01;
        }
        if (cls == Integer.TYPE) {
            return A02;
        }
        if (cls == Long.TYPE) {
            return A03;
        }
        return null;
    }

    public final C27181Bzz A06(C0s c0s, C0L c0l, C3Z c3z, boolean z) {
        C27179Bzx bzx;
        C0s c0s2 = c0s;
        boolean A05 = c0s.A05(C1A.USE_ANNOTATIONS);
        C0L c0l2 = c0l;
        Class cls = c0l.A00;
        if (A05) {
            bzx = c0s.A01();
        } else {
            bzx = null;
        }
        C27181Bzz bzz = new C27181Bzz(c0s2, z, c0l2, C00.A00(cls, bzx, c3z), "set");
        bzz.A02();
        return bzz;
    }
}
