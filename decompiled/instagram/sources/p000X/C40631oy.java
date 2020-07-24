package p000X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.SystemClock;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi;
import java.util.Iterator;

/* renamed from: X.1oy  reason: invalid class name and case insensitive filesystem */
public final class C40631oy implements ServiceConnection {
    public final /* synthetic */ C39731nP A00;

    public static void A00(C40631oy r4, IBinder iBinder) {
        HeroPlayerServiceApi proxy;
        C40431oe.A01("HeroServiceClient", "onServiceConnected()", new Object[0]);
        SystemClock.elapsedRealtime();
        if (iBinder == null) {
            proxy = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof HeroPlayerServiceApi)) {
                proxy = new HeroPlayerServiceApi.Stub.Proxy(iBinder);
            } else {
                proxy = (HeroPlayerServiceApi) queryLocalInterface;
            }
        }
        r4.A00.A0K = proxy;
        if (r4.A00.A0O != null && r4.A00.A0O.A14) {
            while (!r4.A00.A0A.isEmpty()) {
                AnonymousClass89G r0 = (AnonymousClass89G) r4.A00.A0A.poll();
                C39731nP.A02(r4.A00, r0.A01, r0.A02, r0.A00);
            }
        }
        C39731nP r02 = r4.A00;
        AnonymousClass0ZA.A0E(r02.A05, r02.A08, -1831812732);
        Iterator it = r4.A00.A0B.iterator();
        while (it.hasNext()) {
            ((C39851nf) it.next()).BMV(r4.A00.A0Q);
        }
        C39771nW r3 = r4.A00.A07;
        if (r3.A02.A00.A0K != null) {
            AnonymousClass0ZA.A0E(r3.A01, new C41921rC(r3), -338221613);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C40431oe.A01("HeroServiceClient", "onServiceDisconnected()", new Object[0]);
        this.A00.A0K = null;
        SystemClock.elapsedRealtime();
        Iterator it = this.A00.A0B.iterator();
        while (it.hasNext()) {
            ((C39851nf) it.next()).BMW();
        }
        if (this.A00.A0J != null) {
            C40641oz r1 = this.A00.A0J;
            synchronized (r1) {
                r1.A01.evictAll();
            }
        }
        C39731nP r6 = this.A00;
        synchronized (r6) {
            if (r6.A0H != null) {
                if (r6.A0F == 0 || SystemClock.elapsedRealtime() - r6.A0F > 3000) {
                    C39731nP.A01(r6);
                } else {
                    C40431oe.A02("HeroServiceClient", "Video Player service disconnected within 3s", new Object[0]);
                }
            }
        }
    }

    public C40631oy(C39731nP r1) {
        this.A00 = r1;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        A00(this, iBinder);
    }
}
