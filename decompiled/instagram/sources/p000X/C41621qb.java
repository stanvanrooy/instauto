package p000X;

import com.instagram.model.reels.Reel;

/* renamed from: X.1qb  reason: invalid class name and case insensitive filesystem */
public final class C41621qb extends AnonymousClass1SZ {
    public final C701435a A00;
    public final C27371Ho A01;
    public final AnonymousClass0C1 A02;

    public C41621qb(C13740j9 r3, C701435a r4) {
        super(r3, new C702735n(r4.A02));
        this.A01 = r4.A00;
        this.A02 = r4.A05;
        this.A00 = r4;
    }

    private void A00(C39941no r6, AnonymousClass3FM r7, String str) {
        C27371Ho r4 = this.A01;
        AnonymousClass1OY r2 = this.A00.A01;
        Reel reel = r7.A00.A0A;
        AnonymousClass0C1 r0 = this.A02;
        AnonymousClass3GU r3 = new AnonymousClass3GU(r4, r2, reel, r0);
        C37141jB A022 = AnonymousClass3GV.A02(r6, str, r3, r0);
        A022.A04();
        C37311jS.A08(A022, r6, r7, this.A00);
        AnonymousClass3GW.A00(A022, this.A00);
        C36901in.A09(AnonymousClass0WN.A01(this.A02), r3, r6, A022.A03(), Constants.ZERO);
    }

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        A00((C39941no) obj, (AnonymousClass3FM) obj2, AnonymousClass366.A00("impression", this.A00.A09));
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        A00((C39941no) obj, (AnonymousClass3FM) obj2, AnonymousClass366.A00("sub_impression", this.A00.A09));
    }
}
