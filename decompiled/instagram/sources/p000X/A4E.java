package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ReactCallback;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.systrace.Systrace;
import java.lang.ref.WeakReference;

/* renamed from: X.A4E */
public final class A4E implements ReactCallback {
    public final WeakReference A00;

    public final void decrementPendingJSCalls() {
        CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.A00.get();
        if (catalystInstanceImpl != null) {
            int decrementAndGet = catalystInstanceImpl.mPendingJSCalls.decrementAndGet();
            boolean z = false;
            if (decrementAndGet == 0) {
                z = true;
            }
            Systrace.A05(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, catalystInstanceImpl.mJsPendingCallsTitleForTrace, decrementAndGet);
            if (z && !catalystInstanceImpl.mBridgeIdleListeners.isEmpty()) {
                catalystInstanceImpl.mNativeModulesQueueThread.runOnQueue(new A4N(catalystInstanceImpl));
            }
        }
    }

    public final void incrementPendingJSCalls() {
        CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.A00.get();
        if (catalystInstanceImpl != null) {
            int andIncrement = catalystInstanceImpl.mPendingJSCalls.getAndIncrement();
            boolean z = false;
            if (andIncrement == 0) {
                z = true;
            }
            Systrace.A05(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, catalystInstanceImpl.mJsPendingCallsTitleForTrace, andIncrement + 1);
            if (z && !catalystInstanceImpl.mBridgeIdleListeners.isEmpty()) {
                catalystInstanceImpl.mNativeModulesQueueThread.runOnQueue(new A4K(catalystInstanceImpl));
            }
        }
    }

    public final void onBatchComplete() {
        ModuleHolder moduleHolder;
        boolean z;
        CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.A00.get();
        if (catalystInstanceImpl != null && (moduleHolder = (ModuleHolder) catalystInstanceImpl.mNativeModuleRegistry.A01.get(UIManagerModule.NAME)) != null) {
            synchronized (moduleHolder) {
                z = false;
                if (moduleHolder.mModule != null) {
                    z = true;
                }
            }
            if (z) {
                ((UIManagerModule) moduleHolder.getModule()).onBatchComplete();
            }
        }
    }

    public A4E(CatalystInstanceImpl catalystInstanceImpl) {
        this.A00 = new WeakReference(catalystInstanceImpl);
    }
}
