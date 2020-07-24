package p000X;

import com.facebook.react.bridge.CatalystInstanceImpl;
import java.util.Iterator;

/* renamed from: X.A4K */
public final class A4K implements Runnable {
    public final /* synthetic */ CatalystInstanceImpl A00;

    public A4K(CatalystInstanceImpl catalystInstanceImpl) {
        this.A00 = catalystInstanceImpl;
    }

    public final void run() {
        Iterator it = this.A00.mBridgeIdleListeners.iterator();
        while (it.hasNext()) {
            ACE ace = (ACE) it.next();
            synchronized (ace) {
                ace.A00.A01(System.nanoTime());
            }
        }
    }
}
