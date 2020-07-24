package p000X;

import android.view.View;
import com.instagram.model.reels.Reel;

/* renamed from: X.1l2  reason: invalid class name and case insensitive filesystem */
public final class C38291l2 extends C38301l3 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0RN A01;
    public final /* synthetic */ AnonymousClass1NJ A02;
    public final /* synthetic */ C31801Zz A03;
    public final /* synthetic */ AnonymousClass1VJ A04;
    public final /* synthetic */ C36841ih A05;
    public final /* synthetic */ Reel A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38291l2(AnonymousClass1VJ r2, C06590Pq r3, Reel reel, AnonymousClass1NJ r5, C36841ih r6, C31801Zz r7, AnonymousClass0RN r8, int i) {
        super(r3, true);
        this.A04 = r2;
        this.A06 = reel;
        this.A02 = r5;
        this.A05 = r6;
        this.A03 = r7;
        this.A01 = r8;
        this.A00 = i;
    }

    public final C33071cK A00() {
        return AnonymousClass1VJ.A00(C33051cI.PAGE_PROFILE_PIC, this.A02, this.A05);
    }

    public final void A01(View view) {
        if (this.A06 != null) {
            AnonymousClass1VJ r1 = this.A04;
            if (!r1.A07) {
                if (!C50262Fp.A00(r1.A06, Constants.ZERO)) {
                    this.A04.A05.AwE(this.A06, this.A02, this.A05, this.A03);
                } else {
                    C16180oA A002 = C16180oA.A00(this.A04.A06);
                    int i = A002.A00.getInt("zero_rating_story_nux_count", 0);
                    AnonymousClass1CK AYV = AnonymousClass1CF.A00(this.A04.A06).AYV();
                    C155946lF r7 = new C155946lF(this, A002, i);
                    AnonymousClass1VJ r0 = this.A04;
                    C119355Ad.A00(r0.A04, r0.A06, this.A03.A07.getTypedUrl(), false, r7, Constants.ZERO, AYV);
                }
                if (this.A01 instanceof C27371Ho) {
                    C215669Rg.A00(this.A04.A06).A01("Profile click not logging brand profile", (C27371Ho) this.A01, this.A04.A06, "profile_pic", this.A02);
                    return;
                }
                return;
            }
        }
        this.A04.A05.AwC(this.A02, this.A05, this.A00);
    }
}
