package p000X;

import android.os.Handler;
import java.util.List;

/* renamed from: X.AMB */
public final class AMB extends C17920r1 {
    public final /* synthetic */ AMC A00;

    public AMB(AMC amc) {
        this.A00 = amc;
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(1432849999);
        AMC amc = this.A00;
        Handler handler = amc.A02;
        if (handler != null) {
            AnonymousClass0ZA.A09(handler, new AN0(this), (long) (((Integer) AnonymousClass0L6.A02(amc.A0A, AnonymousClass0L7.LIVE_LIKE_INTERACTION_POLLING_INTERVAL, "polling_interval", 3, (AnonymousClass04H) null)).intValue() * 1000), 239311098);
        }
        AnonymousClass0Z0.A0A(477690532, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(233618519);
        AMA ama = (AMA) obj;
        int A032 = AnonymousClass0Z0.A03(145692570);
        AMC amc = this.A00;
        amc.A01 = Math.max(ama.A02, amc.A01);
        if (amc.A05) {
            C23393AKs aKs = amc.A03;
            int i = ama.A01;
            List list = ama.A04;
            AM9 am9 = ama.A03;
            AMD amd = aKs.A01;
            if (amd != null) {
                amd.A08(i, list, am9);
            }
            C23393AKs aKs2 = this.A00.A03;
            int i2 = ama.A00;
            AM9 am92 = ama.A03;
            AMD amd2 = aKs2.A01;
            if (amd2 != null) {
                amd2.A07(i2, 0, am92);
            }
        }
        AnonymousClass0Z0.A0A(1628119570, A032);
        AnonymousClass0Z0.A0A(423073047, A03);
    }
}
