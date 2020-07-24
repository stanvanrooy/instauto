package p000X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.instagram.jobscheduler.SchedulerAlarmBroadcastReceiverV2;
import com.instagram.jobscheduler.SchedulerNetworkChangeReceiver;
import java.util.Set;

/* renamed from: X.B52 */
public final class B52 extends C49852Dw {
    public final Context A00;
    public final AnonymousClass0C1 A01;

    public final void A01(C49842Dv r5) {
        boolean z;
        Class cls = r5.A03;
        Intent intent = new Intent(this.A00, SchedulerAlarmBroadcastReceiverV2.class);
        intent.setAction(cls.getName());
        PendingIntent broadcast = PendingIntent.getBroadcast(this.A00, r5.A00, intent, 134217728);
        AlarmManager alarmManager = (AlarmManager) this.A00.getSystemService("alarm");
        if (broadcast != null) {
            alarmManager.cancel(broadcast);
        }
        AnonymousClass0C1 r2 = this.A01;
        B55 b55 = (B55) r2.AVA(B55.class, new B56(r2));
        String name = r5.A03.getName();
        synchronized (b55) {
            Set A002 = b55.A00();
            A002.remove(name);
            b55.A00.edit().putStringSet("services_waiting_for_connectivity_change", A002).apply();
        }
        synchronized (b55) {
            z = !b55.A00().isEmpty();
        }
        if (!z) {
            this.A00.getPackageManager().setComponentEnabledSetting(new ComponentName(this.A00, SchedulerNetworkChangeReceiver.class), 2, 1);
        }
        B53.A00(this.A00, r5.A03);
    }

    public final void A02(C49842Dv r7, Class cls) {
        if (r7.A02 > 0) {
            Intent intent = new Intent(this.A00, SchedulerAlarmBroadcastReceiverV2.class);
            intent.setAction(cls.getName());
            ((AlarmManager) this.A00.getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + r7.A02, PendingIntent.getBroadcast(this.A00, r7.A00, intent, 134217728));
            return;
        }
        AnonymousClass1BH.A04(new Intent(this.A00, cls), this.A00);
    }

    public B52(Context context, AnonymousClass0C1 r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
