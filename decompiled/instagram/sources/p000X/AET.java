package p000X;

import com.instagram.model.hashtag.Hashtag;
import java.util.ArrayList;

/* renamed from: X.AET */
public final class AET implements AnonymousClass2PG {
    public final /* synthetic */ AEU A00;
    public final /* synthetic */ AEV A01;
    public final /* synthetic */ C51382Kl A02;
    public final /* synthetic */ AnonymousClass1OP A03;

    public AET(AEU aeu, AnonymousClass1OP r2, AEV aev, C51382Kl r4) {
        this.A00 = aeu;
        this.A03 = r2;
        this.A01 = aev;
        this.A02 = r4;
    }

    public final void Avs(Hashtag hashtag) {
        AnonymousClass1OP r0 = this.A03;
        r0.A04.schedule(AnonymousClass1L7.A00(C05210Iq.A02(r0.A03), hashtag));
        AEV aev = this.A01;
        C49672Dd r4 = aev.A01;
        if (r4 != null) {
            C51432Kq r3 = this.A02.A01;
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() == 0) {
                arrayList.add(C51412Ko.A00(aev));
                r3.A00(r4, new C51422Kp(arrayList));
                return;
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
    }

    public final void AwQ(Hashtag hashtag) {
        AnonymousClass1OP r0 = this.A03;
        r0.A04.schedule(AnonymousClass1L7.A01(C05210Iq.A02(r0.A03), hashtag));
        AEV aev = this.A01;
        C49672Dd r4 = aev.A02;
        if (r4 != null) {
            C51432Kq r3 = this.A02.A01;
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() == 0) {
                arrayList.add(C51412Ko.A00(aev));
                r3.A00(r4, new C51422Kp(arrayList));
                return;
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
    }
}
