package p000X;

/* renamed from: X.0xI  reason: invalid class name and case insensitive filesystem */
public final class C21790xI implements C19590tj {
    public static final C05110Id A01 = new C21800xJ();
    public final AnonymousClass0C1 A00;

    public final /* bridge */ /* synthetic */ void BcU(C17090pf r12, boolean z, boolean z2, AnonymousClass4R2 r15, C06270Ok r16) {
        String str;
        C21730xC r122 = (C21730xC) r12;
        AnonymousClass0C1 r2 = this.A00;
        boolean z3 = r122.A04;
        String str2 = r122.A03;
        AnonymousClass3C6 A012 = AnonymousClass3C6.A01(r122.A01);
        C105374gl r0 = r122.A00;
        String str3 = r122.A02;
        String str4 = r0.A02;
        if (z3) {
            str = "block_fail";
        } else {
            str = "unblock_fail";
        }
        AnonymousClass3C0.A06(r2, str4, str, A012, str2, r0.A01, r0.A03, r0.A00, str3);
    }

    public final /* bridge */ /* synthetic */ void BcV(C17090pf r12, boolean z, boolean z2, C06270Ok r15) {
        String str;
        C21730xC r122 = (C21730xC) r12;
        if (!z) {
            AnonymousClass0C1 r2 = this.A00;
            boolean z3 = r122.A04;
            String str2 = r122.A03;
            AnonymousClass3C6 A012 = AnonymousClass3C6.A01(r122.A01);
            C105374gl r0 = r122.A00;
            String str3 = r122.A02;
            String str4 = r0.A02;
            if (z3) {
                str = "block_confirm";
            } else {
                str = "unblock_confirm";
            }
            AnonymousClass3C0.A06(r2, str4, str, A012, str2, r0.A01, r0.A03, r0.A00, str3);
        }
    }

    public final /* bridge */ /* synthetic */ void BcX(C17090pf r12, boolean z, C06270Ok r14) {
        String str;
        C21730xC r122 = (C21730xC) r12;
        AnonymousClass0C1 r2 = this.A00;
        boolean z2 = r122.A04;
        String str2 = r122.A03;
        AnonymousClass3C6 A012 = AnonymousClass3C6.A01(r122.A01);
        C105374gl r0 = r122.A00;
        String str3 = r122.A02;
        String str4 = r0.A02;
        if (z2) {
            str = "block";
        } else {
            str = "unblock";
        }
        AnonymousClass3C0.A06(r2, str4, str, A012, str2, r0.A01, r0.A03, r0.A00, str3);
    }

    public C21790xI(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final void BcT(C17090pf r1, boolean z) {
    }

    public final void BcW(C17090pf r1, boolean z) {
    }
}
