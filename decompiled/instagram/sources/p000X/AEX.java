package p000X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.AEX */
public final class AEX implements C23244AEh {
    public final /* synthetic */ AEU A00;
    public final /* synthetic */ AEV A01;
    public final /* synthetic */ C51382Kl A02;

    public AEX(AEU aeu, C51382Kl r2, AEV aev) {
        this.A00 = aeu;
        this.A02 = r2;
        this.A01 = aev;
    }

    public final void B6S(Hashtag hashtag) {
        Hashtag hashtag2 = new Hashtag(hashtag);
        C51382Kl r4 = this.A02;
        r4.A00.A03(this.A01.AIE(), new AEZ(this, hashtag2));
        r4.A00.A02();
    }
}
