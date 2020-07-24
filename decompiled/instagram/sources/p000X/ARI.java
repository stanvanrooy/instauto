package p000X;

import com.facebook.video.common.livestreaming.LiveStreamingError;
import java.io.File;

/* renamed from: X.ARI */
public final class ARI extends AWZ {
    public final /* synthetic */ ARK A00;
    public final /* synthetic */ ARJ A01;

    public ARI(ARJ arj, ARK ark) {
        this.A01 = arj;
        this.A00 = ark;
    }

    public final void A03(Exception exc) {
        this.A01.A00.A0V.A00(new LiveStreamingError("endBroadcastSession", exc));
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        File file;
        boolean z;
        ARL arl = (ARL) obj;
        AQ5 aq5 = this.A01.A00;
        if (aq5.A0T.A0C) {
            file = arl.A00;
            z = arl.A01;
        } else {
            file = null;
            z = false;
        }
        C12670hC.A04(new AO4(aq5, file, z));
        if (this.A00.AfI()) {
            AQ5 aq52 = this.A01.A00;
            AnonymousClass0C1 r1 = aq52.A05;
            String str = aq52.A08.A0G;
            boolean z2 = aq52.A0N;
            C15890nh r3 = new C15890nh(r1);
            r3.A09 = Constants.ONE;
            r3.A0E("live/%s/end_broadcast/", str);
            r3.A0C("end_after_copyright_warning", z2);
            r3.A06(AnonymousClass1N4.class, true);
            r3.A0G = true;
            C17850qu A03 = r3.A03();
            A03.A00 = new ARY(aq52);
            C28351Lj.A00(aq52.A03, aq52.A0O, A03);
        }
    }
}
