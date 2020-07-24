package p000X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.gms.common.internal.IGmsServiceBroker$Stub$zza;

/* renamed from: X.BJG */
public final class BJG implements ServiceConnection {
    public final int A00;
    public final /* synthetic */ BJA A01;

    public BJG(BJA bja, int i) {
        this.A01 = bja;
        this.A00 = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IGmsServiceBroker iGmsServiceBroker$Stub$zza;
        boolean z;
        if (iBinder == null) {
            BJA bja = this.A01;
            synchronized (bja.A0I) {
                try {
                    z = false;
                    if (bja.A02 == 3) {
                        z = true;
                    }
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                        break;
                    }
                }
            }
            int i = 4;
            if (z) {
                i = 5;
                bja.A0A = true;
            }
            Handler handler = bja.A0F;
            AnonymousClass0ZA.A0D(handler, handler.obtainMessage(i, bja.A09.get(), 16));
            return;
        }
        synchronized (this.A01.A0J) {
            try {
                BJA bja2 = this.A01;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) {
                    iGmsServiceBroker$Stub$zza = new IGmsServiceBroker$Stub$zza(iBinder);
                } else {
                    iGmsServiceBroker$Stub$zza = (IGmsServiceBroker) queryLocalInterface;
                }
                bja2.A08 = iGmsServiceBroker$Stub$zza;
            } catch (Throwable th2) {
                while (true) {
                    th = th2;
                }
            }
        }
        BJA bja3 = this.A01;
        int i2 = this.A00;
        Handler handler2 = bja3.A0F;
        AnonymousClass0ZA.A0D(handler2, handler2.obtainMessage(7, i2, -1, new BJK(bja3, 0)));
        return;
        throw th;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.A01.A0J) {
            this.A01.A08 = null;
        }
        Handler handler = this.A01.A0F;
        AnonymousClass0ZA.A0D(handler, handler.obtainMessage(6, this.A00, 1));
    }
}
