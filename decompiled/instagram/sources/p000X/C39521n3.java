package p000X;

import com.instagram.model.reels.Reel;

/* renamed from: X.1n3  reason: invalid class name and case insensitive filesystem */
public abstract class C39521n3 extends C28241Ky {
    public final C701435a A00;
    public final C27371Ho A01;
    public final C55772bK A02;
    public final AnonymousClass0C1 A03;

    public abstract Integer A04();

    public C39521n3(C13740j9 r3, C701435a r4, AnonymousClass1L0 r5, C55772bK r6) {
        super(r5, r3, 0);
        this.A00 = r4;
        this.A03 = r4.A05;
        this.A01 = r4.A00;
        this.A02 = r6;
    }

    private void A00(C50282Fr r7, String str, AnonymousClass3FN r9) {
        Reel reel = r7.A0A;
        C27371Ho r2 = this.A01;
        AnonymousClass1OY r1 = this.A00.A01;
        AnonymousClass0C1 r0 = this.A03;
        AnonymousClass3GU r4 = new AnonymousClass3GU(r2, r1, reel, r0);
        C37141jB A012 = AnonymousClass3GV.A01(reel, str, r4, r0);
        A012.A04();
        A012.A1S = r9.A00;
        C37311jS.A07(A012, r9.A01, r7, r9, this.A00);
        C37311jS.A0C(A012, r9.A03);
        AnonymousClass3GW.A00(A012, this.A00);
        C36901in.A09(AnonymousClass0WN.A01(this.A03), r4, reel, A012.A03(), A04());
    }

    public final float A01(AnonymousClass1TY r5, C32761bo r6) {
        C55772bK r3 = this.A02;
        String id = ((C50282Fr) r5.A01).A0A.getId();
        C55782bL r1 = (C55782bL) r3.A00.get(id);
        if (r1 == null) {
            r1 = new C55782bL();
            r3.A00.put(id, r1);
        }
        return r1.A00;
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2, long j) {
        A00((C50282Fr) obj, AnonymousClass366.A00("sub_viewed_impression", this.A00.A09), (AnonymousClass3FN) obj2);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2, long j) {
        A00((C50282Fr) obj, AnonymousClass366.A00("viewed_impression", this.A00.A09), (AnonymousClass3FN) obj2);
    }
}
