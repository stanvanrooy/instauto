package p000X;

import android.os.SystemClock;
import com.instagram.model.reels.Reel;

/* renamed from: X.1y3  reason: invalid class name and case insensitive filesystem */
public abstract class C45511y3 extends C28241Ky {
    public final C701435a A00;
    public final C27371Ho A01;
    public final AnonymousClass0C1 A02;

    public abstract Integer A04();

    public C45511y3(C13740j9 r3, C701435a r4, AnonymousClass1L0 r5) {
        super(r5, r3, 0);
        this.A00 = r4;
        this.A02 = r4.A05;
        this.A01 = r4.A00;
    }

    private void A00(C39941no r8, AnonymousClass3FM r9, String str) {
        C27371Ho r2 = this.A01;
        AnonymousClass1OY r1 = this.A00.A01;
        Reel reel = r9.A00.A0A;
        AnonymousClass0C1 r6 = this.A02;
        AnonymousClass3GU r4 = new AnonymousClass3GU(r2, r1, reel, r6);
        C64982sM r5 = r9.A02;
        r5.A00 = ((double) (SystemClock.uptimeMillis() - r5.A0C)) / 1000.0d;
        C37141jB A022 = AnonymousClass3GV.A02(r8, str, r4, r6);
        A022.A04();
        C37311jS.A08(A022, r8, r9, this.A00);
        C37311jS.A0C(A022, r9.A02);
        AnonymousClass3GW.A00(A022, this.A00);
        C36901in.A09(AnonymousClass0WN.A01(this.A02), r4, r8, A022.A03(), A04());
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2, long j) {
        A00((C39941no) obj, (AnonymousClass3FM) obj2, AnonymousClass366.A00("sub_viewed_impression", this.A00.A09));
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2, long j) {
        A00((C39941no) obj, (AnonymousClass3FM) obj2, AnonymousClass366.A00("viewed_impression", this.A00.A09));
    }
}
