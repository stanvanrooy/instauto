package p000X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import com.facebook.C0003R;

/* renamed from: X.13w  reason: invalid class name and case insensitive filesystem */
public final class C242513w implements AnonymousClass0Q6, AnonymousClass0C2 {
    public AnonymousClass0C1 A00;
    public final Context A01;

    private boolean A00() {
        JobScheduler jobScheduler = (JobScheduler) this.A01.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            for (JobInfo id : jobScheduler.getAllPendingJobs()) {
                if (id.getId() == C0003R.C0005id.sim_info_job_service) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void onUserSessionWillEnd(boolean z) {
        C252017t A002;
        Class A012;
        if (!(Build.VERSION.SDK_INT < 21 || (A002 = new C251917r(this.A01).A00()) == null || (A012 = C252017t.A01(A002, C0003R.C0005id.sim_info_job_service)) == null)) {
            A002.A02(C0003R.C0005id.sim_info_job_service, A012);
        }
        AnonymousClass0Q7.A03().A0D(this);
    }

    public C242513w(Context context, AnonymousClass0C1 r2) {
        this.A01 = context;
        this.A00 = r2;
    }

    public final void onAppBackgrounded() {
        AnonymousClass0Z0.A0A(995437406, AnonymousClass0Z0.A03(152629220));
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0Z0.A03(-755033319);
        int intValue = ((Integer) AnonymousClass0L6.A02(this.A00, AnonymousClass0L7.SIM_API_ANALYTICS_REPORTING, "timeout", -1, (AnonymousClass04H) null)).intValue();
        if (intValue != -1 && !A00()) {
            AnonymousClass237 r4 = new AnonymousClass237(C0003R.C0005id.sim_info_job_service);
            r4.A00 = 0;
            r4.A02 = ((long) intValue) * 60000;
            AnonymousClass238 A002 = r4.A00();
            C252017t A003 = new C251917r(this.A01).A00();
            if (A003 != null) {
                A003.A03(A002);
            }
        }
        AnonymousClass0Z0.A0A(286910604, A03);
    }

    public final void onUserSessionStart(boolean z) {
        int A03 = AnonymousClass0Z0.A03(1878016813);
        AnonymousClass0Q7.A03().A0B(this);
        AnonymousClass0Z0.A0A(-1531920591, A03);
    }
}
