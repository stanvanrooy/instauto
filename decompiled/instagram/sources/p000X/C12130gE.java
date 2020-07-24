package p000X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.0gE  reason: invalid class name and case insensitive filesystem */
public final class C12130gE extends C12140gF {
    public final C12170gI A00 = new C12180gJ();
    public final C12190gK A01;

    public final C12170gI A00() {
        return this.A00;
    }

    public final C12190gK A01() {
        return this.A01;
    }

    public final QuickPerformanceLogger A02() {
        return AnonymousClass00B.A01;
    }

    public C12130gE() {
        AnonymousClass0Ba A002 = AnonymousClass0QD.A00();
        if (C12190gK.A05 == null) {
            C12190gK.A05 = new C12190gK(A002);
        }
        C12190gK r1 = C12190gK.A05;
        if (!r1.A03) {
            r1.A00 = A002;
            r1.A03 = true;
        }
        this.A01 = r1;
    }
}
