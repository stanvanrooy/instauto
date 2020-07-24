package p000X;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;

/* renamed from: X.0Sp  reason: invalid class name and case insensitive filesystem */
public abstract class C07320Sp extends BroadcastReceiver {
    public static int A00 = 1;
    public static final SparseArray A01 = new SparseArray();

    public static void A00(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra != 0) {
            SparseArray sparseArray = A01;
            synchronized (sparseArray) {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray.get(intExtra);
                if (wakeLock != null) {
                    AnonymousClass0ZP.A02(wakeLock);
                    sparseArray.remove(intExtra);
                } else {
                    AnonymousClass0DB.A0K("WakefulBroadcastReceiver", "No active wake lock id #%s", Integer.valueOf(intExtra));
                }
            }
        }
    }
}
