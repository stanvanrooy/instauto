package p000X;

/* renamed from: X.1Rv  reason: invalid class name and case insensitive filesystem */
public final class C29931Rv implements C29941Rw {
    public final C29951Rx A00;
    public final AnonymousClass0C1 A01;
    public final StringBuilder A02 = new StringBuilder();

    public final /* bridge */ /* synthetic */ void Alw(C27371Ho r9, C249616t r10, int i, int i2, C06270Ok r13) {
        AnonymousClass1NJ r3 = (AnonymousClass1NJ) r10;
        C27371Ho r4 = r9;
        C37141jB A012 = this.A00.A01(r9, r3, i2);
        if (A012 != null) {
            C29951Rx.A00(A012, r3, this.A01, this.A02);
            A012.A07(r13);
            A01(A012, r9, r3, i2);
            C36901in.A0J(this.A01, A012, r3, r4, i, false, Constants.ONE);
        }
    }

    public final /* bridge */ /* synthetic */ void AoB(C27371Ho r12, C249616t r13, int i, double d, String str, boolean z) {
        AnonymousClass1NJ r4 = (AnonymousClass1NJ) r13;
        C27371Ho r3 = r12;
        int i2 = i;
        double d2 = d;
        String str2 = str;
        boolean z2 = z;
        if (C05630Li.A03(new C05000Hl("include_log_viewability", AnonymousClass0L7.APP_SPEED_IG_EXECUTOR, false, (String[]) null, (AnonymousClass04H) null))) {
            C05700Lp.A00().ADc(new C99504Rx(this, r3, r4, i2, d2, str2, z2));
        } else {
            A00(this, r3, r4, i2, d2, str2, z2);
        }
    }

    public static void A00(C29931Rv r3, C27371Ho r4, AnonymousClass1NJ r5, int i, double d, String str, boolean z) {
        C29951Rx r2 = r3.A00;
        AnonymousClass0C1 r0 = r2.A00;
        C37141jB A012 = C37591ju.A01("viewability", r5, r4);
        A012.A0B(r0, r5);
        A012.A04 = d;
        A012.A58 = str;
        A012.A1G = i;
        A012.A2V = Boolean.valueOf(z);
        if (r2.A01) {
            A012.A13 = 24;
            A012.A2M = Boolean.TRUE;
        }
        C36901in.A09(AnonymousClass0WN.A01(r3.A01), r4, r5, A012.A03(), (Integer) null);
    }

    public final void Ajp(C27371Ho r8, AnonymousClass1NJ r9, int i, int i2) {
        AnonymousClass1NJ r2 = r9;
        C27371Ho r3 = r8;
        C37141jB A04 = this.A00.A04("impression", r8, r9, i2);
        if (A04 != null) {
            C36901in.A0J(this.A01, A04, r2, r3, i, true, Constants.ONE);
        }
    }

    public final void Ajq(C27371Ho r7, AnonymousClass1NJ r8, int i, int i2) {
        AnonymousClass1NJ r2 = r8;
        C27371Ho r3 = r7;
        C37141jB A04 = this.A00.A04("sub_impression", r7, r8, i2);
        if (A04 != null) {
            C36901in.A0I(this.A01, A04, r2, r3, i, true);
        }
    }

    public final void Ajr(C27371Ho r7, AnonymousClass1NJ r8, int i, int i2) {
        AnonymousClass1NJ r2 = r8;
        C27371Ho r3 = r7;
        C37141jB A04 = this.A00.A04("sub_viewed_impression", r7, r8, i2);
        if (A04 != null) {
            C36901in.A0I(this.A01, A04, r2, r3, i, true);
        }
    }

    public final void Ajt(C27371Ho r9, AnonymousClass1NJ r10, int i, int i2, long j) {
        AnonymousClass0C1 r2 = this.A00.A00;
        C37141jB A012 = C37591ju.A01(AnonymousClass000.A0E("carousel_", "time_spent"), r10, r9);
        A012.A0B(r2, r10);
        A012.A14 = i2;
        A012.A1t = j;
        C36901in.A0I(this.A01, A012, r10, r9, i, true);
    }

    public final void Aju(C27371Ho r7, AnonymousClass1NJ r8, int i, int i2) {
        AnonymousClass1NJ r2 = r8;
        C27371Ho r3 = r7;
        C37141jB A04 = this.A00.A04("viewed_impression", r7, r8, i2);
        if (A04 != null) {
            C36901in.A0I(this.A01, A04, r2, r3, i, true);
        }
    }

    public final /* bridge */ /* synthetic */ void AnZ(C27371Ho r4, C249616t r5, int i, int i2, C06270Ok r8) {
        AnonymousClass1NJ r52 = (AnonymousClass1NJ) r5;
        C37141jB A022 = this.A00.A02(r4, r52, i2);
        if (A022 != null) {
            C29951Rx.A00(A022, r52, this.A01, this.A02);
            A01(A022, r4, r52, i2);
            A022.A07(r8);
            C36901in.A0H(this.A01, A022, r52, r4, i);
        }
    }

    public final /* bridge */ /* synthetic */ void Ana(C27371Ho r3, C249616t r4, int i, int i2) {
        AnonymousClass1NJ r42 = (AnonymousClass1NJ) r4;
        C37141jB A05 = this.A00.A05("sub_viewed_impression", r3, r42, i2);
        if (A05 != null) {
            C36901in.A0H(this.A01, A05, r42, r3, i);
        }
    }

    public final /* bridge */ /* synthetic */ void Ao4(C27371Ho r8, C249616t r9, int i, int i2, long j, C39531n4 r14) {
        AnonymousClass1NJ r92 = (AnonymousClass1NJ) r9;
        C36901in.A0H(this.A01, this.A00.A03(r8, r92, i2, j, r14), r92, r8, i);
    }

    public final /* bridge */ /* synthetic */ void AoC(C27371Ho r3, C249616t r4, int i, int i2) {
        AnonymousClass1NJ r42 = (AnonymousClass1NJ) r4;
        C37141jB A05 = this.A00.A05("viewed_impression", r3, r42, i2);
        if (A05 != null) {
            C36901in.A0H(this.A01, A05, r42, r3, i);
        }
    }

    public C29931Rv(AnonymousClass0C1 r2, AnonymousClass1I6 r3) {
        this.A00 = new C29951Rx(r2, r3);
        this.A01 = r2;
    }

    public static void A01(C37141jB r2, C27371Ho r3, AnonymousClass1NJ r4, int i) {
        String str;
        if ("feed_timeline".equals(r3.getModuleName()) && r4.Aho()) {
            AnonymousClass1Z9 r1 = AnonymousClass1Z9.A01;
            r2.A3X = Integer.toString(r1.A00(C37161jD.AD, i));
            r2.A3Y = Integer.toString(r1.A00(C37161jD.NETEGO, i));
            String id = r4.getId();
            if (C46421zi.A00.get(id) != null) {
                str = (String) C46421zi.A00.get(id);
            } else {
                str = "timeline_request";
            }
            r2.A32 = str;
        }
    }
}
