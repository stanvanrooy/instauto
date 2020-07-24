package p000X;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.24c  reason: invalid class name and case insensitive filesystem */
public final class C474624c {
    public static C474624c A03;
    public final AnonymousClass07X A00;
    public final AnonymousClass07X A01;
    public final AnonymousClass07Y A02;

    public C474624c(C06590Pq r17) {
        AnonymousClass07Y r1;
        AnonymousClass07X r0;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        AnonymousClass0L7 r6 = AnonymousClass0L7.CPU_SPIN_DETECTOR;
        C06590Pq r12 = r17;
        this.A01 = new AnonymousClass07X((long) ((Integer) AnonymousClass0L6.A00(r12, r6, "threshold_process_pct_cpu_fg", 200, (AnonymousClass04H) null)).intValue(), (long) ((Integer) AnonymousClass0L6.A00(r12, r6, "threshold_thread_pct_cpu_fg", 70, (AnonymousClass04H) null)).intValue(), (long) ((Integer) AnonymousClass0L6.A00(r12, r6, "period_fg_s", 60, (AnonymousClass04H) null)).intValue(), "foreground");
        this.A00 = new AnonymousClass07X((long) ((Integer) AnonymousClass0L6.A00(r12, r6, "threshold_process_pct_cpu_bg", 20, (AnonymousClass04H) null)).intValue(), (long) ((Integer) AnonymousClass0L6.A00(r12, r6, "threshold_thread_pct_cpu_bg", 15, (AnonymousClass04H) null)).intValue(), (long) ((Integer) AnonymousClass0L6.A00(r12, r6, "period_bg_s", 900, (AnonymousClass04H) null)).intValue(), AppStateModule.APP_STATE_BACKGROUND);
        this.A02 = new AnonymousClass07Y(newSingleThreadScheduledExecutor, new C474724d(newSingleThreadScheduledExecutor, (long) (((Integer) AnonymousClass0L6.A00(r12, AnonymousClass0L7.CPU_SPIN_DETECTOR, "loom_trace_duration_s", 15, (AnonymousClass04H) null)).intValue() * 1000)));
        if (AnonymousClass0Q7.A03().A0H()) {
            r1 = this.A02;
            r0 = this.A00;
        } else {
            r1 = this.A02;
            r0 = this.A01;
        }
        r1.A00(r0);
    }
}
