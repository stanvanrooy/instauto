package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* renamed from: X.0cV  reason: invalid class name and case insensitive filesystem */
public abstract class C10000cV extends BroadcastReceiver implements AnonymousClass0XX {
    public AnonymousClass1BT A00;
    public C08460Xc A01 = C08460Xc.A01;
    public String A02;

    public abstract AnonymousClass0XW A00(Context context, String str);

    public abstract boolean A01(String str);

    public final void onReceive(Context context, Intent intent) {
        int i;
        boolean A002;
        int A012 = AnonymousClass0Z0.A01(-1544703797);
        if (this.A02 == null) {
            this.A02 = String.format("%s/%s", new Object[]{context.getPackageName(), getClass().getName()});
        }
        String action = intent.getAction();
        AnonymousClass0XW A003 = A00(context, action);
        if (A003 == null) {
            if (!A01(action)) {
                Log.e("SecureBroadcastReceiver", AnonymousClass000.A0N("Rejected the intent for the receiver because it was not registered: ", action, ":", "SecureBroadcastReceiver"));
            }
            i = 1800194351;
        } else if (!AnonymousClass0XY.A01().A00(context, A003, intent)) {
            i = -1553093352;
        } else {
            synchronized (this) {
                A002 = this.A01.A00(context, this, intent, (AnonymousClass0XP) null);
            }
            if (A002) {
                AnonymousClass1BT r2 = this.A00;
                boolean z = true;
                if (r2 != null && r2.A0B(intent, context, (String) null) == null) {
                    z = false;
                }
                if (z) {
                    A003.BH8(context, intent, this);
                    i = 1800194351;
                }
            }
            i = -975594931;
        }
        AnonymousClass0Z0.A0E(intent, i, A012);
    }
}
