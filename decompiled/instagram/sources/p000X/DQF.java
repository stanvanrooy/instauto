package p000X;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.facebook.rsys.externalcall.gen.ExternalCallDelegate;
import com.facebook.rsys.externalcall.gen.ExternalCallProxy;

/* renamed from: X.DQF */
public final class DQF extends ExternalCallProxy {
    public ExternalCallDelegate A00;
    public boolean A01;
    public final Context A02;
    public final DQG A03;
    public final DQK A04;

    public final int isExternalCallConflict() {
        boolean z = false;
        if (((TelephonyManager) this.A02.getSystemService("phone")).getCallState() == 2) {
            z = true;
        }
        if (z) {
            return 1;
        }
        return 0;
    }

    public final void startMonitoringExternalCalls() {
        if (!this.A01) {
            DQG dqg = this.A03;
            dqg.A01.listen(dqg.A00, 32);
        }
        this.A01 = true;
    }

    public final void stopMonitoringExternalCalls() {
        if (this.A01) {
            DQG dqg = this.A03;
            dqg.A01.listen(dqg.A00, 0);
        }
        this.A01 = false;
    }

    public DQF(Context context, DQI dqi) {
        DQK dqk = new DQK(this);
        this.A04 = dqk;
        this.A02 = context;
        this.A03 = dqi.AA1(context, dqk);
    }

    public final void setExternalCallDelegate(ExternalCallDelegate externalCallDelegate) {
        this.A00 = externalCallDelegate;
    }
}
