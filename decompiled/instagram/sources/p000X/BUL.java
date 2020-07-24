package p000X;

import android.app.job.JobParameters;
import com.instagram.contacts.ccu.intf.CCUJobService;

/* renamed from: X.BUL */
public final class BUL implements DND {
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ CCUJobService A01;

    public BUL(CCUJobService cCUJobService, JobParameters jobParameters) {
        this.A01 = cCUJobService;
        this.A00 = jobParameters;
    }

    public final void onFinish() {
        this.A01.jobFinished(this.A00, false);
    }
}
