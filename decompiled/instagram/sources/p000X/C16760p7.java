package p000X;

import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.0p7  reason: invalid class name and case insensitive filesystem */
public final class C16760p7 implements C14250k8 {
    public final C14250k8 A00;

    public final C26211Cc startRequest(AnonymousClass1C4 r7, C256019m r8, AnonymousClass1CB r9) {
        String uri = r7.A04.toString();
        C06590Pq A01 = AnonymousClass0J1.A01(this);
        AnonymousClass0C1 A03 = C05210Iq.A03(A01);
        AnonymousClass1CH A002 = AnonymousClass1CF.A00(A01);
        if (!A002.AYV().A0A.isEmpty()) {
            String Be9 = A002.Be9(uri);
            if (!Be9.equals(uri)) {
                AnonymousClass27E r2 = new AnonymousClass27E(AnonymousClass0QT.A00(A01, (AnonymousClass0RN) null).A02("ig_zero_url_rewrite"));
                r2.A08("rewritten_url", Be9);
                r2.A08(IgReactNavigatorModule.URL, uri);
                r2.A01();
                AnonymousClass1BZ r0 = new AnonymousClass1BZ(r7);
                r0.A02 = Be9;
                r7 = r0.A00();
            }
        }
        if (A03 != null) {
            r9.A04(new AnonymousClass1CR(A03));
        }
        return this.A00.startRequest(r7, r8, r9);
    }

    public C16760p7(C14250k8 r1) {
        this.A00 = r1;
    }
}
