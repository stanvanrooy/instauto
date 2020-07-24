package p000X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.instagram.contacts.ccu.intf.CCUWorkerService;
import com.instagram.gallery.scanner.MediaScannerWorkerService;
import com.instagram.jobscheduler.SchedulerNetworkChangeReceiver;
import com.instagram.util.offline.BackgroundWifiPrefetcherWorkerService;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.B53 */
public abstract class B53 extends Service {
    public void A01() {
        if (this instanceof BackgroundWifiPrefetcherWorkerService) {
            BackgroundWifiPrefetcherWorkerService backgroundWifiPrefetcherWorkerService = (BackgroundWifiPrefetcherWorkerService) this;
            C06590Pq A01 = AnonymousClass0J1.A01(backgroundWifiPrefetcherWorkerService);
            if (A01.AgN()) {
                AnonymousClass0C1 A02 = C05210Iq.A02(A01);
                C150326bu.A01(backgroundWifiPrefetcherWorkerService.getApplicationContext(), A02);
                C150326bu.A00(A02).A04(new B6K(backgroundWifiPrefetcherWorkerService, A02));
                return;
            }
            backgroundWifiPrefetcherWorkerService.stopSelf();
        } else if (!(this instanceof MediaScannerWorkerService)) {
            CCUWorkerService cCUWorkerService = (CCUWorkerService) this;
            BUE instance = BUE.getInstance(cCUWorkerService.getApplicationContext());
            if (instance != null) {
                instance.onStart(cCUWorkerService, new BUG(cCUWorkerService));
            }
        } else {
            ((MediaScannerWorkerService) this).A00.A00();
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    static {
        TimeUnit.SECONDS.toMillis(30);
        TimeUnit.HOURS.toMillis(5);
    }

    public static void A00(Context context, Class cls) {
        PendingIntent service = PendingIntent.getService(context, 0, new Intent(context, cls), 134217728);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (service != null) {
            alarmManager.cancel(service);
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        int A04 = AnonymousClass0Z0.A04(2129932220);
        C06590Pq A01 = AnonymousClass0J1.A01(this);
        if (!A01.AgN()) {
            i3 = 1608175616;
        } else {
            if (AnonymousClass0NT.A08(this)) {
                A00(this, getClass());
                A01();
            } else {
                AnonymousClass0C1 A02 = C05210Iq.A02(A01);
                B55 b55 = (B55) A02.AVA(B55.class, new B56(A02));
                String name = getClass().getName();
                synchronized (b55) {
                    Set A00 = b55.A00();
                    A00.add(name);
                    b55.A00.edit().putStringSet("services_waiting_for_connectivity_change", A00).apply();
                }
                getPackageManager().setComponentEnabledSetting(new ComponentName(this, SchedulerNetworkChangeReceiver.class), 1, 1);
            }
            i3 = -307826916;
        }
        AnonymousClass0Z0.A0B(i3, A04);
        return 2;
    }
}
