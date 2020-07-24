package com.facebook.cameracore.mediapipeline.asyncscripting;

import android.os.RemoteException;
import com.facebook.cameracore.mediapipeline.asyncscripting.IJsVm;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass0Z0;

public class JsVm extends IJsVm.Stub {
    public final IScriptingClient mClient;
    public final HybridData mHybridData = initHybrid();

    private native HybridData initHybrid();

    public native void enqueueMessages(int i, String str);

    public native void enqueueScript(int i, String str);

    public native void execute();

    /* renamed from: gc */
    public native void mo48736gc();

    public native void init();

    static {
        AnonymousClass0Y1.A08("graphicsengine-asyncscripting-service-native");
    }

    public JsVm(IScriptingClient iScriptingClient) {
        int A03 = AnonymousClass0Z0.A03(1428991706);
        this.mClient = iScriptingClient;
        AnonymousClass0Z0.A0A(-2055602778, A03);
    }

    public String call(int i, String str) {
        int A03 = AnonymousClass0Z0.A03(1539546019);
        try {
            String call = this.mClient.call(i, str);
            AnonymousClass0Z0.A0A(-89897172, A03);
            return call;
        } catch (RemoteException e) {
            AnonymousClass0DB.A05(JsVm.class, "call failed", e);
            AnonymousClass0Z0.A0A(1715907787, A03);
            return "0Remote execution failed.";
        }
    }

    public void destroy() {
        int A03 = AnonymousClass0Z0.A03(-1635354059);
        this.mHybridData.resetNative();
        AnonymousClass0Z0.A0A(-930874251, A03);
    }

    public void onObjectsReleased(int i, String str) {
        int A03 = AnonymousClass0Z0.A03(-1286861915);
        try {
            this.mClient.onObjectsReleased(i, str);
        } catch (RemoteException e) {
            AnonymousClass0DB.A05(JsVm.class, "onObjectsReleased failed", e);
        }
        AnonymousClass0Z0.A0A(1534073416, A03);
    }

    public void onScriptingError(int i, String str) {
        int A03 = AnonymousClass0Z0.A03(-1814843945);
        try {
            this.mClient.onScriptingError(i, str);
        } catch (RemoteException e) {
            AnonymousClass0DB.A05(JsVm.class, "onScriptingError failed", e);
        }
        AnonymousClass0Z0.A0A(-393998921, A03);
    }

    public String post(int i, String str) {
        int A03 = AnonymousClass0Z0.A03(-826238815);
        try {
            String postMsg = this.mClient.postMsg(i, str);
            AnonymousClass0Z0.A0A(-2137247731, A03);
            return postMsg;
        } catch (RemoteException e) {
            AnonymousClass0DB.A05(JsVm.class, "post failed", e);
            AnonymousClass0Z0.A0A(1452667440, A03);
            return "0Remote execution failed.";
        }
    }
}
