package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.queue.MessageQueueThread;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.A4F */
public final class A4F implements Runnable {
    public final /* synthetic */ CatalystInstanceImpl A00;

    public A4F(CatalystInstanceImpl catalystInstanceImpl) {
        this.A00 = catalystInstanceImpl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        p000X.AnonymousClass0ZJ.A00(com.facebook.common.dextricks.OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1666469188);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bf, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final void run() {
        A3R a3r = this.A00.mNativeModuleRegistry;
        MessageQueueThread messageQueueThread = a3r.A00.A04;
        AnonymousClass0FY.A00(messageQueueThread);
        messageQueueThread.assertIsOnThread();
        AnonymousClass0ZJ.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "NativeModuleRegistry_notifyJSInstanceDestroy", -1996504252);
        for (ModuleHolder moduleHolder : a3r.A01.values()) {
            synchronized (moduleHolder) {
                NativeModule nativeModule = moduleHolder.mModule;
                if (nativeModule != null) {
                    nativeModule.onCatalystInstanceDestroy();
                }
            }
        }
        AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -2141050097);
        for (Map.Entry entry : this.A00.mJSIModuleRegistry.A00.entrySet()) {
            if (((C23061A3s) entry.getKey()) != C23061A3s.TurboModuleManager) {
                entry.getValue();
                throw null;
            }
        }
        boolean z = false;
        if (this.A00.mPendingJSCalls.getAndSet(0) == 0) {
            z = true;
        }
        if (!this.A00.mBridgeIdleListeners.isEmpty()) {
            Iterator it = this.A00.mBridgeIdleListeners.iterator();
            while (it.hasNext()) {
                ACE ace = (ACE) it.next();
                if (!z) {
                    synchronized (ace) {
                        ace.A01.A01(System.nanoTime());
                    }
                }
                synchronized (ace) {
                }
            }
        }
        this.A00.getReactQueueConfiguration().A00.runOnQueue(new A4J(this));
    }
}
