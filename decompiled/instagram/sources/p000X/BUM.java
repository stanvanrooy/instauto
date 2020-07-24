package p000X;

import android.app.job.JobParameters;
import android.content.Context;
import com.facebook.common.jobscheduler.compat.JobServiceCompat;

/* renamed from: X.BUM */
public final class BUM implements C2095190p {
    public final JobParameters A00;
    public final Context A01;
    public final /* synthetic */ JobServiceCompat A02;

    public BUM(JobServiceCompat jobServiceCompat, JobParameters jobParameters, Context context) {
        this.A02 = jobServiceCompat;
        this.A00 = jobParameters;
        this.A01 = context;
    }

    public final void B8Z(boolean z) {
        this.A02.jobFinished(this.A00, z);
        if (!z) {
            AnonymousClass23J A002 = AnonymousClass23J.A00(this.A01);
            synchronized (A002) {
                A002.A00.put(this.A00.getJobId(), false);
            }
        }
    }
}
