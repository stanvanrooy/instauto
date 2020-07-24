package p000X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.ATM */
public final class ATM implements ServiceConnection {
    public final /* synthetic */ ATL A00;
    public final /* synthetic */ boolean A01;

    public ATM(ATL atl, boolean z) {
        this.A00 = atl;
        this.A01 = z;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BrowserLiteCallback proxy;
        ATL atl = this.A00;
        if (iBinder == null) {
            proxy = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BrowserLiteCallback)) {
                proxy = new BrowserLiteCallback.Stub.Proxy(iBinder);
            } else {
                proxy = (BrowserLiteCallback) queryLocalInterface;
            }
        }
        atl.A06 = proxy;
        ATL atl2 = this.A00;
        C23570ARp aRp = atl2.A05;
        if (aRp != null) {
            BrowserLiteCallback browserLiteCallback = atl2.A06;
            HashSet hashSet = null;
            if (browserLiteCallback != null) {
                try {
                    List ASW = browserLiteCallback.ASW();
                    if (ASW != null) {
                        hashSet = new HashSet(ASW);
                    }
                } catch (RemoteException unused) {
                }
            }
            aRp.A00(hashSet);
        }
        if (this.A01) {
            ATL atl3 = this.A00;
            ATL.A02(atl3, new AS2(atl3));
        }
        ATL.A01(this.A00);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        ATL atl = this.A00;
        synchronized (atl) {
            ARE are = atl.A04;
            if (are != null) {
                AnonymousClass09Q.A09("main_process_state", "dead");
                int i = are.A00 + 1;
                are.A00 = i;
                AnonymousClass09Q.A09("main_process_num_deaths", Integer.toString(i));
            }
        }
        this.A00.A06 = null;
    }
}
