package p000X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;

/* renamed from: X.0ct  reason: invalid class name and case insensitive filesystem */
public abstract class C10240ct extends C07320Sp {
    public final Class A00;

    public C10240ct(Class cls) {
        if (cls != null) {
            this.A00 = cls;
            return;
        }
        throw new IllegalArgumentException("intentService cannot be null");
    }

    public void onReceive(Context context, Intent intent) {
        ComponentName startService;
        int i;
        int A01 = AnonymousClass0Z0.A01(252419707);
        intent.getAction();
        if (intent.getAction() == null) {
            i = -73478706;
        } else {
            intent.setClass(context, this.A00);
            SparseArray sparseArray = C07320Sp.A01;
            synchronized (sparseArray) {
                int i2 = C07320Sp.A00;
                int i3 = i2 + 1;
                C07320Sp.A00 = i3;
                if (i3 <= 0) {
                    C07320Sp.A00 = 1;
                }
                intent.putExtra("androidx.contentpager.content.wakelockid", i2);
                startService = context.startService(intent);
                if (startService == null) {
                    startService = null;
                } else {
                    PowerManager.WakeLock A002 = AnonymousClass0ZP.A00((PowerManager) context.getSystemService("power"), 1, AnonymousClass000.A0E("wake:", startService.flattenToShortString()));
                    AnonymousClass0ZP.A03(A002);
                    AnonymousClass0ZP.A04(A002, 60000);
                    sparseArray.put(i2, A002);
                }
            }
            if (startService == null) {
                AnonymousClass0DB.A0J("FbnsCallbackReceiver", "service %s does not exist", this.A00.getClass().getCanonicalName());
            }
            i = -737601156;
        }
        AnonymousClass0Z0.A0E(intent, i, A01);
    }
}
