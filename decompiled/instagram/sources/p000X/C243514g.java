package p000X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.instagram.publisher.HeartbeatJobService;
import com.instagram.publisher.TransactionRevivalJobService;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.14g  reason: invalid class name and case insensitive filesystem */
public final class C243514g implements C243614h {
    public static final Map A02;
    public final JobScheduler A00;
    public final String A01;

    static {
        HashMap hashMap = new HashMap();
        A02 = hashMap;
        hashMap.put(Collections.emptySet(), 51500);
        A02.put(EnumSet.of(C243714i.NETWORK), 51501);
    }

    private JobInfo A00(AnonymousClass0C1 r6, int i) {
        List<JobInfo> allPendingJobs = this.A00.getAllPendingJobs();
        if (allPendingJobs != null) {
            for (JobInfo next : allPendingJobs) {
                String string = next.getExtras().getString("IgSessionManager.SESSION_TOKEN_KEY");
                if (next.getId() == i && r6.getToken().equals(string)) {
                    return next;
                }
            }
        }
        return null;
    }

    public final void Bed(AnonymousClass0C1 r9, AnonymousClass4YE r10) {
        Set set = r10.A02;
        Integer num = (Integer) A02.get(set);
        if (num != null) {
            int intValue = num.intValue();
            long j = r10.A00;
            JobInfo A002 = A00(r9, intValue);
            boolean z = false;
            if (A002 != null && A002.getExtras().getLong("targetTimeMs", 2147483647L) < j) {
                z = true;
            }
            if (!z) {
                long j2 = r10.A00;
                JobInfo.Builder builder = new JobInfo.Builder(intValue, new ComponentName(this.A01, TransactionRevivalJobService.class.getName()));
                long currentTimeMillis = j2 - System.currentTimeMillis();
                if (currentTimeMillis < 0) {
                    currentTimeMillis = 0;
                }
                builder.setMinimumLatency(currentTimeMillis);
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r9.getToken());
                builder.setExtras(persistableBundle);
                switch (intValue) {
                    case 51500:
                        break;
                    case 51501:
                        builder.setRequiredNetworkType(1);
                        break;
                    default:
                        throw new RuntimeException(AnonymousClass000.A05("Unknown job id: ", intValue));
                }
                this.A00.schedule(builder.build());
                return;
            }
            return;
        }
        throw new RuntimeException("Cannot schedule job for required conditions: " + set);
    }

    public C243514g(JobScheduler jobScheduler, Context context) {
        this.A00 = jobScheduler;
        this.A01 = context.getPackageName();
    }

    public final void Bhr(AnonymousClass0C1 r7, boolean z) {
        JobInfo A002 = A00(r7, 51400);
        JobInfo build = new JobInfo.Builder(51400, new ComponentName(this.A01, HeartbeatJobService.class.getName())).setPeriodic(HeartbeatJobService.A00).build();
        if (z && A002 == null) {
            this.A00.schedule(build);
        } else if (A002 != null) {
            this.A00.cancel(A002.getId());
        }
    }
}
