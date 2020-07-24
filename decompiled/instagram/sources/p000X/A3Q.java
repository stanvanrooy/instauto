package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.queue.MessageQueueThread;

/* renamed from: X.A3Q */
public final class A3Q implements Runnable {
    public final /* synthetic */ CatalystInstanceImpl A00;

    public A3Q(CatalystInstanceImpl catalystInstanceImpl) {
        this.A00 = catalystInstanceImpl;
    }

    public final void run() {
        A3R a3r = this.A00.mNativeModuleRegistry;
        MessageQueueThread messageQueueThread = a3r.A00.A04;
        AnonymousClass0FY.A00(messageQueueThread);
        messageQueueThread.assertIsOnThread("From version React Native v0.44, native modules are explicitly not initialized on the UI thread. See https://github.com/facebook/react-native/wiki/Breaking-Changes#d4611211-reactnativeandroidbreaking-move-nativemodule-initialization-off-ui-thread---aaachiuuu  for more details.");
        ReactMarker.logMarker(A3L.NATIVE_MODULE_INITIALIZE_START);
        AnonymousClass0ZJ.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "NativeModuleRegistry_notifyJSInstanceInitialized", 1763277720);
        try {
            for (ModuleHolder markInitializable : a3r.A01.values()) {
                markInitializable.markInitializable();
            }
        } finally {
            AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1508065495);
            ReactMarker.logMarker(A3L.NATIVE_MODULE_INITIALIZE_END);
        }
    }
}
