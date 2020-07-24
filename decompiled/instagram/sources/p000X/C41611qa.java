package p000X;

import android.content.Context;
import com.instagram.model.reels.Reel;

/* renamed from: X.1qa  reason: invalid class name and case insensitive filesystem */
public final class C41611qa extends AnonymousClass1SZ {
    public final C701435a A00;
    public final Context A01;
    public final C27371Ho A02;
    public final AnonymousClass358 A03;
    public final AnonymousClass0C1 A04;

    public C41611qa(Context context, C13740j9 r5, C701435a r6, AnonymousClass358 r7) {
        super(r5, new C702835o(r6.A02, r6.A05));
        this.A01 = context;
        this.A02 = r6.A00;
        this.A04 = r6.A05;
        this.A00 = r6;
        this.A03 = r7;
    }

    private void A00(C39941no r19, AnonymousClass3FM r20, String str) {
        C27371Ho r6 = this.A02;
        AnonymousClass1OY r5 = this.A00.A01;
        AnonymousClass3FM r4 = r20;
        Reel reel = r4.A00.A0A;
        AnonymousClass0C1 r0 = this.A04;
        AnonymousClass3GU r3 = new AnonymousClass3GU(r6, r5, reel, r0);
        C39941no r9 = r19;
        C37141jB A022 = AnonymousClass3GV.A02(r9, str, r3, r0);
        A022.A04();
        C37311jS.A08(A022, r9, r4, this.A00);
        C701435a r52 = this.A00;
        AnonymousClass358 r02 = this.A03;
        String str2 = r9.A0F;
        Context context = this.A01;
        AnonymousClass0C1 r62 = r52.A05;
        C50282Fr r7 = r4.A00;
        AnonymousClass0C1 r12 = r62;
        C39941no r14 = r9;
        C37311jS.A0E(r12, A022, r14, (C66352vL) r02.A02.get(str2), new AnonymousClass3GS(r62, r7, r7.A0A, r9, r4.A02, r4.A01.A00(r9), r4.A03), context);
        AnonymousClass3GW.A00(A022, this.A00);
        C36901in.A09(AnonymousClass0WN.A01(this.A04), r3, r9, A022.A03(), Constants.ONE);
    }

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        A00((C39941no) obj, (AnonymousClass3FM) obj2, AnonymousClass366.A00("impression", this.A00.A09));
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        A00((C39941no) obj, (AnonymousClass3FM) obj2, AnonymousClass366.A00("sub_impression", this.A00.A09));
    }
}
