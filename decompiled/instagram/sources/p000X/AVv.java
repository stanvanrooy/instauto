package p000X;

import android.os.Handler;
import com.facebook.mediastreaming.opt.transport.SpeedTestStatus;
import com.facebook.mediastreaming.opt.transport.TransportCallbacks;
import com.facebook.mediastreaming.opt.transport.TransportError;
import com.facebook.mediastreaming.opt.transport.TransportEvent;

/* renamed from: X.AVv */
public final class AVv implements TransportCallbacks {
    public TransportCallbacks A00;
    public final Handler A01;

    public final void onSpeedTestResult(SpeedTestStatus speedTestStatus) {
        AnonymousClass0ZA.A0E(this.A01, new AVx(this, speedTestStatus), 22419061);
    }

    public final void onTransportEvent(TransportEvent transportEvent, TransportError transportError) {
        AnonymousClass0ZA.A0E(this.A01, new C23643AVw(this, transportEvent, transportError), 2064543043);
    }

    public AVv(TransportCallbacks transportCallbacks, Handler handler) {
        this.A00 = transportCallbacks;
        this.A01 = handler;
    }
}
