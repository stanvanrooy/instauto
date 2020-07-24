package p000X;

import android.content.Context;
import com.facebook.wellbeing.timeinapp.jnibindings.OSUsageEventsCallback;
import com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppControllerWrapper;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.11b  reason: invalid class name and case insensitive filesystem */
public final class C236011b implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01 = 8;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ AnonymousClass11Z A03;
    public final /* synthetic */ XAnalyticsHolder A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ ScheduledExecutorService A06;
    public final /* synthetic */ boolean A07;

    public C236011b(AnonymousClass11Z r2, String str, ScheduledExecutorService scheduledExecutorService, Context context, XAnalyticsHolder xAnalyticsHolder, int i, boolean z) {
        this.A03 = r2;
        this.A05 = str;
        this.A06 = scheduledExecutorService;
        this.A02 = context;
        this.A04 = xAnalyticsHolder;
        this.A00 = i;
        this.A07 = z;
    }

    public final void run() {
        TimeInAppControllerWrapper timeInAppControllerWrapper;
        AnonymousClass11Z r3 = this.A03;
        TimeInAppControllerWrapper timeInAppControllerWrapper2 = new TimeInAppControllerWrapper();
        synchronized (r3) {
            r3.A00 = timeInAppControllerWrapper2;
            if (r3.A01.isEmpty()) {
                r3.A00.dispatch(AnonymousClass13G.BACKGROUND);
            } else {
                Iterator it = r3.A01.iterator();
                while (it.hasNext()) {
                    r3.A00.dispatch((AnonymousClass13G) it.next());
                }
                r3.A01.clear();
            }
            timeInAppControllerWrapper = r3.A00;
        }
        if (timeInAppControllerWrapper != null) {
            timeInAppControllerWrapper.initController(this.A06, this.A02.getDatabasePath(AnonymousClass000.A0J("time_in_app_", this.A05, ".db")).getPath(), this.A04, this.A01, this.A00);
            if (this.A07 && OSUsageEventsCallback.areUsageEventsAvailable()) {
                timeInAppControllerWrapper.setOSUsageEventsCallback(new OSUsageEventsCallback(this.A02));
            }
        }
    }
}
