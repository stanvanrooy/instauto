package p000X;

import android.app.NotificationManager;
import android.content.Context;

/* renamed from: X.BJL */
public final class BJL implements Runnable {
    public final /* synthetic */ C25406BIf A00;

    public BJL(C25406BIf bIf) {
        this.A00 = bIf;
    }

    public final void run() {
        Context context = this.A00.A0C;
        if (!C42011rM.A02.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }
}
