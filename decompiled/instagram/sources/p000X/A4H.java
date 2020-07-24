package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.react.bridge.CatalystInstanceImpl;

/* renamed from: X.A4H */
public final class A4H extends Handler {
    public final C23071A4p A00;

    public A4H(Looper looper, C23071A4p a4p) {
        super(looper);
        this.A00 = a4p;
    }

    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Exception e) {
            CatalystInstanceImpl catalystInstanceImpl = this.A00.A00;
            catalystInstanceImpl.mNativeModuleCallExceptionHandler.handleException(e);
            catalystInstanceImpl.mReactQueueConfiguration.A02.runOnQueue(new C23067A4k(catalystInstanceImpl));
        }
    }
}
