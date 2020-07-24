package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import java.util.List;

/* renamed from: X.AWR */
public final class AWR extends Handler {
    public final /* synthetic */ AWQ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AWR(AWQ awq, Looper looper) {
        super(looper);
        this.A00 = awq;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        switch (i) {
            case 1:
                AWQ awq = this.A00;
                awq.A02 = (Surface) message.obj;
                AWQ.A01(awq);
                AnonymousClass3V5 r2 = new AnonymousClass3V5();
                awq.A03 = r2;
                C12670hC.A04(new AWS(awq.A05, r2));
                return;
            case 2:
                AWQ awq2 = this.A00;
                AnonymousClass8HL r1 = awq2.A04;
                if (r1 != null) {
                    awq2.A06.A07(r1);
                    return;
                }
                return;
            case 3:
                AWQ awq3 = this.A00;
                AWQ.A00(awq3);
                for (AWY awy : (List) message.obj) {
                    awy.Bic(new AWH(awq3, awy));
                    AXF axf = new AXF(awy, awq3.A05, awq3.A08.isEmpty());
                    awq3.A06.A07(axf);
                    awq3.A08.put(awy, axf);
                }
                C12670hC.A04(new AWW(awq3.A05));
                return;
            case 4:
                AWQ.A00(this.A00);
                return;
            case 5:
                AWQ awq4 = this.A00;
                AnonymousClass8HL r12 = awq4.A04;
                if (r12 != null) {
                    awq4.A06.A08(r12);
                }
                AnonymousClass3V5 r0 = awq4.A03;
                if (r0 != null) {
                    r0.release();
                    awq4.A03 = null;
                }
                C12670hC.A04(new AWV(awq4.A05));
                return;
            case 6:
                AWQ awq5 = this.A00;
                int i2 = message.arg1;
                int i3 = message.arg2;
                awq5.A01 = i2;
                awq5.A00 = i3;
                AWQ.A01(awq5);
                return;
            case 7:
                AWQ awq6 = this.A00;
                AWZ awz = (AWZ) message.obj;
                AnonymousClass8HL r13 = awq6.A04;
                if (r13 != null) {
                    r13.A01 = awz;
                    r13.A00 = 0;
                    return;
                }
                awz.A03(new IllegalStateException("View hasn't been setup yet"));
                return;
            default:
                throw new IllegalArgumentException(AnonymousClass000.A05(C193418Ps.$const$string(57), i));
        }
    }
}
