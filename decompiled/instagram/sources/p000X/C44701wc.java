package p000X;

import com.instagram.model.reels.Reel;

/* renamed from: X.1wc  reason: invalid class name and case insensitive filesystem */
public abstract class C44701wc extends AnonymousClass1T0 {
    public final C27371Ho A00;
    public final C701435a A01;
    public final AnonymousClass0C1 A02;
    public final String A03;
    public final C55772bK A04;

    public abstract Integer A02();

    public final float A00(AnonymousClass1TY r5, C32761bo r6) {
        C55772bK r3 = this.A04;
        String id = ((C50282Fr) r5.A01).A0A.getId();
        C55782bL r1 = (C55782bL) r3.A00.get(id);
        if (r1 == null) {
            r1 = new C55782bL();
            r3.A00.put(id, r1);
        }
        return r1.A00;
    }

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2, long j) {
        C50282Fr r7 = (C50282Fr) obj;
        AnonymousClass3FN r8 = (AnonymousClass3FN) obj2;
        Reel reel = r7.A0A;
        C37141jB A012 = AnonymousClass3GV.A01(reel, this.A03, this.A00, this.A02);
        A012.A04();
        A012.A1t = j;
        C37311jS.A07(A012, r8.A01, r7, r8, this.A01);
        AnonymousClass3GW.A00(A012, this.A01);
        C36901in.A09(AnonymousClass0WN.A01(this.A02), this.A00, reel, A012.A03(), A02());
    }

    public C44701wc(C701435a r3, C55772bK r4) {
        this.A04 = r4;
        this.A01 = r3;
        this.A02 = r3.A05;
        this.A00 = r3.A00;
        this.A03 = AnonymousClass366.A00("time_spent", r3.A09);
    }
}
