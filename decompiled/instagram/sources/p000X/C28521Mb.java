package p000X;

/* renamed from: X.1Mb  reason: invalid class name and case insensitive filesystem */
public final class C28521Mb implements C06570Po {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Double A0B;
    public Double A0C;
    public Integer A0D;
    public Integer A0E;
    public Boolean A0F;
    public Boolean A0G;
    public final AnonymousClass0C1 A0H;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C28521Mb A00(AnonymousClass0C1 r2) {
        return (C28521Mb) r2.AVA(C28521Mb.class, new C28531Mc(r2));
    }

    public final boolean A01() {
        if (this.A0F == null) {
            this.A0F = (Boolean) AnonymousClass0L6.A02(this.A0H, AnonymousClass0L7.MAINFEED_LIGHTWEIGHT_PILL, "lightweight_pill_enabled", false, (AnonymousClass04H) null);
        }
        return this.A0F.booleanValue();
    }

    public final boolean A02() {
        if (this.A0G == null) {
            this.A0G = (Boolean) AnonymousClass0L6.A02(this.A0H, AnonymousClass0L7.FEED_SHORT_SESSION_NEW_POST_PILL, "short_session_pill_enabled", false, (AnonymousClass04H) null);
        }
        return this.A0G.booleanValue();
    }

    public C28521Mb(AnonymousClass0C1 r1) {
        this.A0H = r1;
    }
}
