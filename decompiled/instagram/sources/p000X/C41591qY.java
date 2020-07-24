package p000X;

import android.content.Context;
import com.instagram.model.reels.Reel;

/* renamed from: X.1qY  reason: invalid class name and case insensitive filesystem */
public final class C41591qY extends AnonymousClass1SZ {
    public final C701435a A00;
    public final Context A01;
    public final C27371Ho A02;
    public final AnonymousClass358 A03;
    public final AnonymousClass0C1 A04;

    public C41591qY(Context context, C13740j9 r5, C701435a r6, AnonymousClass358 r7) {
        super(r5, new C703135r(r6.A02, r6.A05));
        this.A01 = context;
        this.A00 = r6;
        this.A02 = r6.A00;
        this.A04 = r6.A05;
        this.A03 = r7;
    }

    private void A00(C50282Fr r19, AnonymousClass3FN r20, String str) {
        C27371Ho r5 = this.A02;
        AnonymousClass1OY r2 = this.A00.A01;
        C50282Fr r11 = r19;
        Reel reel = r11.A0A;
        AnonymousClass0C1 r0 = this.A04;
        AnonymousClass3GU r4 = new AnonymousClass3GU(r5, r2, reel, r0);
        C37141jB A012 = AnonymousClass3GV.A01(reel, str, r4, r0);
        A012.A04();
        AnonymousClass3FN r7 = r20;
        A012.A1S = r7.A00;
        C37311jS.A07(A012, r7.A01, r11, r7, this.A00);
        Reel reel2 = r11.A0A;
        C39941no r8 = r7.A01;
        C701435a r9 = this.A00;
        AnonymousClass358 r02 = this.A03;
        String id = reel2.getId();
        Context context = this.A01;
        AnonymousClass0C1 r10 = r9.A05;
        AnonymousClass3GS r92 = new AnonymousClass3GS(r10, r11, r11.A0A, r8, r7.A03, r7.A02.A00(r8), r7.A04);
        Reel reel3 = reel2;
        C37141jB r13 = A012;
        C37311jS.A0E(r10, r13, reel3, (C66352vL) r02.A02.get(id), r92, context);
        AnonymousClass3GW.A00(A012, this.A00);
        C36901in.A09(AnonymousClass0WN.A01(this.A04), r4, r11.A0A, A012.A03(), Constants.ONE);
    }

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        A00((C50282Fr) obj, (AnonymousClass3FN) obj2, AnonymousClass366.A00("impression", this.A00.A09));
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        A00((C50282Fr) obj, (AnonymousClass3FN) obj2, AnonymousClass366.A00("sub_impression", this.A00.A09));
    }
}
