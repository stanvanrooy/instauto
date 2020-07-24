package p000X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.BJD */
public final class BJD implements ServiceConnection {
    public int A00 = 2;
    public ComponentName A01;
    public IBinder A02;
    public boolean A03;
    public final BJP A04;
    public final Set A05 = new HashSet();
    public final /* synthetic */ BJC A06;

    public final void A00() {
        Intent component;
        this.A00 = 3;
        Context context = this.A06.A00;
        BJP bjp = this.A04;
        String str = bjp.A01;
        if (str != null) {
            component = new Intent(str).setPackage(bjp.A02);
        } else {
            component = new Intent().setComponent((ComponentName) null);
        }
        boolean A012 = C25160B3p.A01(context, component, this, this.A04.A00);
        this.A03 = A012;
        if (A012) {
            AnonymousClass0ZA.A06(this.A06.A01, this.A06.A01.obtainMessage(1, this.A04), 300000);
            return;
        }
        this.A00 = 2;
        try {
            AnonymousClass0ZI.A01(this.A06.A00, this, 572429141);
        } catch (IllegalArgumentException unused) {
        }
    }

    public BJD(BJC bjc, BJP bjp) {
        this.A06 = bjc;
        this.A04 = bjp;
    }

    public final void A01(ServiceConnection serviceConnection) {
        BJP bjp = this.A04;
        String str = bjp.A01;
        if (str != null) {
            new Intent(str).setPackage(bjp.A02);
        } else {
            new Intent().setComponent((ComponentName) null);
        }
        this.A05.add(serviceConnection);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.A06.A03) {
            AnonymousClass0ZA.A04(this.A06.A01, 1, this.A04);
            this.A02 = iBinder;
            this.A01 = componentName;
            for (ServiceConnection onServiceConnected : this.A05) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.A00 = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.A06.A03) {
            AnonymousClass0ZA.A04(this.A06.A01, 1, this.A04);
            this.A02 = null;
            this.A01 = componentName;
            for (ServiceConnection onServiceDisconnected : this.A05) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.A00 = 2;
        }
    }
}
