package p000X;

import android.content.Context;
import android.content.Intent;
import com.instagram.publisher.CopypastaUploadRetryService;

/* renamed from: X.20z  reason: invalid class name and case insensitive filesystem */
public final class C468120z implements C243614h {
    public long A00 = Long.MAX_VALUE;
    public final Context A01;

    public final void Bhr(AnonymousClass0C1 r5, boolean z) {
        Context context = this.A01;
        AnonymousClass1BH.A04(new Intent(context, CopypastaUploadRetryService.class).setAction("ScheduleHeartbeat").putExtra("ScheduleHeartbeatEnabled", z).putExtra("IgSessionManager.SESSION_TOKEN_KEY", r5.getToken()), context);
    }

    public C468120z(Context context) {
        this.A01 = context.getApplicationContext();
    }

    public final void Bed(AnonymousClass0C1 r9, AnonymousClass4YE r10) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.A00 < currentTimeMillis) {
            this.A00 = Long.MAX_VALUE;
        }
        long j = r10.A00;
        if (j <= this.A00) {
            Context context = this.A01;
            CopypastaUploadRetryService.A03(context, r9, true);
            AnonymousClass1BH.A04(new Intent(context, CopypastaUploadRetryService.class).setAction("ScheduleAlarm").putExtra("AlarmDelay", j - currentTimeMillis).putExtra("IgSessionManager.SESSION_TOKEN_KEY", r9.getToken()), context);
            this.A00 = r10.A00;
        }
    }
}
