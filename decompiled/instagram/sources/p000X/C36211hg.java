package p000X;

/* renamed from: X.1hg  reason: invalid class name and case insensitive filesystem */
public abstract class C36211hg extends C256219o implements C36221hh {
    public final AnonymousClass1HD A00;
    public final C27301Hh A01;
    public final AnonymousClass1PJ A02;
    public final C221499gT A03;
    public final C27361Hn A04;
    public final AnonymousClass0C1 A05;
    public final AnonymousClass1OY A06;

    public final void B6V() {
        if (this.A00.isResumed()) {
            this.A01.A0E(this.A04.getScrollingViewProxy(), this.A02, this.A03.A00);
        }
    }

    public C36211hg(AnonymousClass1HD r3, C27361Hn r4, AnonymousClass1PJ r5, C27301Hh r6, AnonymousClass1OY r7, AnonymousClass0C1 r8) {
        this.A00 = r3;
        this.A04 = r4;
        this.A02 = r5;
        this.A01 = r6;
        this.A06 = r7;
        this.A05 = r8;
        this.A03 = new C221499gT(r3.getContext(), this);
    }

    public final void A08(C255119b r3, int i) {
        AnonymousClass0Z0.A0A(1878807388, AnonymousClass0Z0.A03(-1367279544));
    }

    public void A09(C255119b r3, int i, int i2, int i3, int i4, int i5) {
        AnonymousClass0Z0.A0A(-1740213960, AnonymousClass0Z0.A03(-1801341971));
    }

    public final void A0A() {
        C34071dx A0T = C17020pY.A00().A0T(this.A00.getActivity());
        if (A0T != null && A0T.A0a() && A0T.A0D == this.A06) {
            A0T.A0R();
        }
        this.A01.A0B((float) this.A03.A00, new C33941dk(), AnonymousClass1EW.A03(this.A00.getActivity()).A07);
    }
}
