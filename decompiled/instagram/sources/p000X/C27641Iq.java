package p000X;

import java.util.HashSet;

/* renamed from: X.1Iq  reason: invalid class name and case insensitive filesystem */
public final class C27641Iq extends C27591Il {
    public boolean A00;
    public final AnonymousClass2YY A01;
    public final HashSet A02 = new HashSet();

    public final void A0A(String str) {
        if (this.A00) {
            this.A02.add(str);
            AnonymousClass2YY r0 = this.A01;
            if (r0 != null) {
                r0.A00.add(0, new AnonymousClass2Y6(System.currentTimeMillis(), str));
            }
        }
    }

    public C27641Iq(AnonymousClass0C1 r3) {
        AnonymousClass2YY r0;
        if (C14090jk.A01(r3)) {
            r0 = (AnonymousClass2YY) r3.AVA(AnonymousClass2YY.class, new C929740e(r3));
        } else {
            r0 = null;
        }
        this.A01 = r0;
    }

    public final void A08(C255119b r7, int i) {
        int A03 = AnonymousClass0Z0.A03(131081546);
        if ((i == 1 || i == 2) && this.A00) {
            this.A02.add("scroll");
            AnonymousClass2YY r0 = this.A01;
            if (r0 != null) {
                r0.A00.add(0, new AnonymousClass2Y6(System.currentTimeMillis(), "scroll"));
            }
        }
        AnonymousClass0Z0.A0A(-1676281065, A03);
    }
}
