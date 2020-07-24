package com.facebook.cameracore.mediapipeline.asyncscripting;

import android.os.RemoteException;
import com.facebook.cameracore.mediapipeline.asyncscripting.IScriptingClient;
import com.facebook.jni.HybridData;
import p000X.AXO;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.C64312rH;

public class RemoteHostConnection extends IScriptingClient.Stub {
    public final C64312rH mCallback;
    public final HybridData mHybridData;
    public final Object mLock = new Object();
    public IAsyncScriptingService mService;
    public IJsVm mVm;

    private native HybridData initHybrid();

    public native String call(int i, String str);

    public native void onConnected();

    public native void onDisconnected();

    public native void onObjectsReleased(int i, String str);

    public native void onScriptingError(int i, String str);

    public native String postMsg(int i, String str);

    static {
        AnonymousClass0Y1.A08("graphicsengine-asyncscripting-native");
    }

    public RemoteHostConnection(C64312rH r3) {
        int A03 = AnonymousClass0Z0.A03(-311500060);
        this.mCallback = r3;
        this.mHybridData = initHybrid();
        AnonymousClass0Z0.A0A(-1063310889, A03);
    }

    public void destroy() {
        int A03 = AnonymousClass0Z0.A03(928534539);
        synchronized (this.mLock) {
            try {
                IJsVm iJsVm = this.mVm;
                if (iJsVm != null) {
                    iJsVm.destroy();
                }
            } catch (RemoteException e) {
                AnonymousClass0DB.A05(RemoteHostConnection.class, "destroy failed", e);
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(100995229, A03);
                    throw th;
                }
            }
            this.mHybridData.resetNative();
        }
        C64312rH r1 = this.mCallback;
        synchronized (r1.A00.mConnections) {
            r1.A00.mConnections.remove(this);
            if (r1.A00.mConnections.isEmpty()) {
                AsyncScriptingClient asyncScriptingClient = r1.A00;
                AnonymousClass0ZA.A0E(asyncScriptingClient.mMainThreadHandler, new AXO(asyncScriptingClient), 54250609);
            }
        }
        AnonymousClass0Z0.A0A(610643559, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        r0 = -1087519346;
     */
    public boolean execute(int i, String str, String str2) {
        int A03 = AnonymousClass0Z0.A03(-463687699);
        synchronized (this.mLock) {
            try {
                IJsVm iJsVm = this.mVm;
                if (iJsVm != null) {
                    while (!str.isEmpty()) {
                        if (str.length() > 56320) {
                            iJsVm.enqueueMessages(i, str.substring(0, 51200));
                            str = str.substring(51200);
                        } else {
                            iJsVm.enqueueMessages(i, str);
                            str = "";
                        }
                    }
                    IJsVm iJsVm2 = this.mVm;
                    while (!str2.isEmpty()) {
                        if (str2.length() > 56320) {
                            iJsVm2.enqueueScript(i, str2.substring(0, 51200));
                            str2 = str2.substring(51200);
                        } else {
                            iJsVm2.enqueueScript(i, str2);
                            str2 = "";
                        }
                    }
                    this.mVm.execute();
                    AnonymousClass0Z0.A0A(1837859939, A03);
                    return true;
                }
            } catch (RemoteException e) {
                AnonymousClass0DB.A05(RemoteHostConnection.class, "execute failed", e);
                int i2 = -940704149;
                AnonymousClass0Z0.A0A(i2, A03);
                return false;
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(1722379781, A03);
                    throw th;
                }
            }
        }
    }

    /* renamed from: gc */
    public void mo13527gc() {
        int A03 = AnonymousClass0Z0.A03(-1269348964);
        synchronized (this.mLock) {
            try {
                IJsVm iJsVm = this.mVm;
                if (iJsVm != null) {
                    iJsVm.mo48736gc();
                }
            } catch (RemoteException e) {
                AnonymousClass0DB.A05(RemoteHostConnection.class, "gc failed", e);
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(994182981, A03);
                    throw th;
                }
            }
        }
        AnonymousClass0Z0.A0A(-1627498408, A03);
    }

    public boolean init() {
        boolean z;
        int i;
        int A03 = AnonymousClass0Z0.A03(-747855384);
        synchronized (this.mLock) {
            try {
                IAsyncScriptingService iAsyncScriptingService = this.mService;
                z = false;
                if (iAsyncScriptingService == null) {
                    i = 1437700761;
                } else {
                    this.mVm = iAsyncScriptingService.ABH(this);
                    if (this.mVm != null) {
                        z = true;
                    }
                    i = 2123924163;
                }
            } catch (RemoteException e) {
                AnonymousClass0DB.A05(RemoteHostConnection.class, "createVm failed", e);
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(-1636423067, A03);
                    throw th;
                }
            }
        }
        AnonymousClass0Z0.A0A(i, A03);
        return z;
    }

    public void onServiceConnected(IAsyncScriptingService iAsyncScriptingService) {
        int i;
        int A03 = AnonymousClass0Z0.A03(-132381534);
        synchronized (this.mLock) {
            try {
                boolean z = false;
                if (this.mHybridData.mDestructor.mNativePointer != 0) {
                    z = true;
                }
                if (!z) {
                    i = 1476000586;
                } else {
                    this.mService = iAsyncScriptingService;
                    onConnected();
                    i = -1966738905;
                }
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(251751505, A03);
                    throw th;
                }
            }
        }
        AnonymousClass0Z0.A0A(i, A03);
    }
}
