package p000X;

import android.telephony.PhoneStateListener;
import com.facebook.rsys.externalcall.gen.ExternalCallDelegate;

/* renamed from: X.DQH */
public final class DQH extends PhoneStateListener {
    public final DQK A00;

    public final void onCallStateChanged(int i, String str) {
        ExternalCallDelegate externalCallDelegate;
        boolean z = false;
        if (i == 2) {
            z = true;
        }
        if (z && (externalCallDelegate = this.A00.A00.A00) != null) {
            externalCallDelegate.onExternalCallStarted();
        }
    }

    public DQH(DQK dqk) {
        this.A00 = dqk;
    }
}
