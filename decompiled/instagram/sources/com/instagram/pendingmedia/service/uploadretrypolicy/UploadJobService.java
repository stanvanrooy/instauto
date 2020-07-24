package com.instagram.pendingmedia.service.uploadretrypolicy;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.store.PendingMediaStore;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.C106834jA;
import p000X.C106844jB;
import p000X.C17870qw;
import p000X.C32621bZ;

public class UploadJobService extends JobService {
    public JobParameters A00;
    public C32621bZ A01 = new C106844jB(this);
    public PendingMedia A02;
    public AnonymousClass0C1 A03;
    public String A04;
    public final C106834jA A05 = new C106834jA(this);

    public final boolean onStartJob(JobParameters jobParameters) {
        boolean z;
        this.A00 = jobParameters;
        AnonymousClass0C1 currentUserSession = AnonymousClass0J1.A02().getCurrentUserSession(jobParameters.getExtras().getString("IgSessionManager.SESSION_TOKEN_KEY"));
        this.A03 = currentUserSession;
        C17870qw A012 = C17870qw.A01(this, currentUserSession, "job service alarm");
        A012.A03.add(this.A05);
        this.A04 = jobParameters.getExtras().getString("EXTRA_MEDIA_KEY");
        this.A02 = PendingMediaStore.A01(this.A03).A04(this.A04);
        long j = jobParameters.getExtras().getLong("EXTRA_START_TIME");
        long j2 = 0;
        for (int i = 1; ((long) i) < 7; i++) {
            j2 += ((long) (1 << i)) * ArLinkScanControllerImpl.ERROR_DELAY_MS;
        }
        if (System.currentTimeMillis() > j + j2) {
            System.currentTimeMillis();
            z = false;
        } else {
            String str = this.A04;
            System.currentTimeMillis();
            PendingMedia A042 = A012.A00.A04(str);
            if (A042 == null) {
                z = false;
            } else {
                C17870qw.A08(A012, C17870qw.A02(A012, 0, A042, "job service alarm"));
                z = true;
            }
        }
        if (!z) {
            A012.A03.remove(this.A05);
        }
        return z;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        C17870qw A012 = C17870qw.A01(this, this.A03, "job service alarm");
        A012.A03.remove(this.A05);
        return true;
    }
}
