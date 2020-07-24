package com.instagram.util.offline;

import android.app.job.JobParameters;
import android.app.job.JobService;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QD;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C150326bu;
import p000X.C150386c0;

public class BackgroundWifiPrefetcherJobService extends JobService {
    public final boolean onStartJob(JobParameters jobParameters) {
        C06590Pq A01 = AnonymousClass0J1.A01(this);
        if (!A01.AgN()) {
            return false;
        }
        AnonymousClass0C1 A02 = C05210Iq.A02(A01);
        C150326bu.A01(getApplicationContext(), A02);
        C150326bu.A00(A02).A04(new C150386c0(this, A02, jobParameters));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        AnonymousClass0QD.A00().Bp5("BackgroundWifiPrefetcherJobService", "onStopJob");
        return false;
    }
}
