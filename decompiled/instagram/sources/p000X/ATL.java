package p000X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.iabeventlogging.model.IABEvent;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.ATL */
public final class ATL {
    public static ATL A07;
    public int A00;
    public ServiceConnection A01;
    public Handler A02;
    public HandlerThread A03;
    public ARE A04;
    public C23570ARp A05;
    public BrowserLiteCallback A06;

    public static synchronized void A01(ATL atl) {
        synchronized (atl) {
            if (atl.A04 != null) {
                AnonymousClass09Q.A09("main_process_state", "alive");
            }
        }
    }

    public static synchronized ATL A00() {
        ATL atl;
        synchronized (ATL.class) {
            if (A07 == null) {
                A07 = new ATL();
            }
            atl = A07;
        }
        return atl;
    }

    public static void A02(ATL atl, ASM asm) {
        if (atl.A01 == null) {
            ATK.A00("BrowserLiteCallbacker", "Callback service is not available.", new Object[0]);
        } else {
            AnonymousClass0ZA.A0E(atl.A02, new ASN(atl, asm), -1920571210);
        }
    }

    public final void A03(Context context, boolean z) {
        C23570ARp aRp;
        this.A00++;
        if (this.A01 == null || (aRp = this.A05) == null) {
            Intent intent = new Intent("com.facebook.browser.lite.BrowserLiteCallback");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            if (!queryIntentServices.isEmpty() && queryIntentServices.size() <= 1) {
                HandlerThread handlerThread = new HandlerThread("BrowserLiteCallbacker");
                this.A03 = handlerThread;
                handlerThread.start();
                this.A02 = new Handler(this.A03.getLooper());
                this.A01 = new ATM(this, z);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(new ComponentName(context.getPackageName(), queryIntentServices.get(0).serviceInfo.name));
                AnonymousClass0ZI.A02(context, intent2, this.A01, 9, 23556913);
                return;
            }
            return;
        }
        BrowserLiteCallback browserLiteCallback = this.A06;
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
        if (z) {
            A02(this, new AS2(this));
        }
        A01(this);
    }

    public final void A04(IABEvent iABEvent, Bundle bundle) {
        if (!IABEvent.A04.equals(iABEvent)) {
            A02(this, new C23573ARu(this, iABEvent, bundle));
        }
    }

    public final void A05(Map map, Bundle bundle) {
        A02(this, new C23574ARv(this, map, bundle));
    }
}
