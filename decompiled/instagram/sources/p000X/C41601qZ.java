package p000X;

import com.instagram.model.reels.Reel;

/* renamed from: X.1qZ  reason: invalid class name and case insensitive filesystem */
public final class C41601qZ extends AnonymousClass1SZ {
    public final C701435a A00;
    public final C27371Ho A01;
    public final AnonymousClass0C1 A02;

    public C41601qZ(C13740j9 r3, C701435a r4) {
        super(r3, new C703035q(r4.A02));
        this.A00 = r4;
        this.A01 = r4.A00;
        this.A02 = r4.A05;
    }

    private void A00(C50282Fr r7, AnonymousClass3FN r8, String str) {
        C27371Ho r3 = this.A01;
        AnonymousClass1OY r2 = this.A00.A01;
        Reel reel = r7.A0A;
        AnonymousClass0C1 r0 = this.A02;
        AnonymousClass3GU r5 = new AnonymousClass3GU(r3, r2, reel, r0);
        C37141jB A012 = AnonymousClass3GV.A01(reel, str, r5, r0);
        A012.A04();
        A012.A1S = r8.A00;
        C37311jS.A07(A012, r8.A01, r7, r8, this.A00);
        AnonymousClass3GW.A00(A012, this.A00);
        C36901in.A09(AnonymousClass0WN.A01(this.A02), r5, r7.A0A, A012.A03(), Constants.ZERO);
    }

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        A00((C50282Fr) obj, (AnonymousClass3FN) obj2, AnonymousClass366.A00("impression", this.A00.A09));
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        A00((C50282Fr) obj, (AnonymousClass3FN) obj2, AnonymousClass366.A00("sub_impression", this.A00.A09));
    }
}
