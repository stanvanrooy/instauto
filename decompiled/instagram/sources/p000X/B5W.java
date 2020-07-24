package p000X;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.B5W */
public final class B5W implements ServiceConnection {
    public B5Z A00;
    public int A01 = 0;
    public final Messenger A02 = new Messenger(new AnonymousClass2G5(Looper.getMainLooper(), new B5X(this)));
    public final Queue A03 = new ArrayDeque();
    public final SparseArray A04 = new SparseArray();
    public final /* synthetic */ B4X A05;

    public final synchronized void A00() {
        if (this.A01 == 2 && this.A03.isEmpty() && this.A04.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.A01 = 3;
            C25160B3p.A00();
            AnonymousClass0ZI.A01(this.A05.A02, this, 572429141);
        }
    }

    public final synchronized void A01(int i, String str) {
        IllegalStateException illegalStateException;
        if (Log.isLoggable("MessengerIpcClient", 3) && String.valueOf(str).length() == 0) {
            new String("Disconnected: ");
        }
        int i2 = this.A01;
        if (i2 == 0) {
            illegalStateException = new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.A01 = 4;
            C25160B3p.A00();
            AnonymousClass0ZI.A01(this.A05.A02, this, 572429141);
            C25172B4s b4s = new C25172B4s(i, str);
            for (C25171B4r A012 : this.A03) {
                A012.A01(b4s);
            }
            this.A03.clear();
            for (int i3 = 0; i3 < this.A04.size(); i3++) {
                ((C25171B4r) this.A04.valueAt(i3)).A01(b4s);
            }
            this.A04.clear();
        } else if (i2 == 3) {
            this.A01 = 4;
        } else if (i2 != 4) {
            StringBuilder sb = new StringBuilder(26);
            sb.append(AnonymousClass0C5.$const$string(51));
            sb.append(i2);
            illegalStateException = new IllegalStateException(sb.toString());
        }
        throw illegalStateException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        return true;
     */
    public final synchronized boolean A02(C25171B4r b4r) {
        int i = this.A01;
        if (i == 0) {
            this.A03.add(b4r);
            boolean z = false;
            if (this.A01 == 0) {
                z = true;
            }
            AnonymousClass0a2.A07(z);
            Log.isLoggable("MessengerIpcClient", 2);
            this.A01 = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            C25160B3p.A00();
            if (!C25160B3p.A01(this.A05.A02, intent, this, 1)) {
                A01(0, "Unable to bind to service");
            } else {
                this.A05.A03.schedule(new C25177B5d(this), 30, TimeUnit.SECONDS);
            }
        } else if (i == 1) {
            this.A03.add(b4r);
        } else if (i == 2) {
            this.A03.add(b4r);
            AnonymousClass0Z9.A03(this.A05.A03, new B5V(this), -1836300646);
        } else if (i != 3 && i != 4) {
            StringBuilder sb = new StringBuilder(26);
            sb.append(AnonymousClass0C5.$const$string(51));
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        if (iBinder == null) {
            A01(0, "Null service connection");
        } else {
            try {
                this.A00 = new B5Z(iBinder);
                this.A01 = 2;
                AnonymousClass0Z9.A03(this.A05.A03, new B5V(this), -1836300646);
            } catch (RemoteException e) {
                A01(0, e.getMessage());
            }
        }
        return;
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        A01(2, "Service disconnected");
    }

    public B5W(B4X b4x) {
        this.A05 = b4x;
    }
}
