package p000X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.instagram.analytics.uploadscheduler.AnalyticsUploadAlarmReceiver;

/* renamed from: X.0zA  reason: invalid class name and case insensitive filesystem */
public enum C22890zA {
    BatchUpload("action_batch_upload", 300000),
    UploadRetry("action_upload_retry", 3600000);
    
    public long A00;
    public PendingIntent A01;
    public boolean A02;
    public final String A03;

    public final void A00(Context context, AlarmManager alarmManager) {
        if (!this.A02) {
            long elapsedRealtime = SystemClock.elapsedRealtime() + this.A00;
            if (this.A01 == null) {
                Intent intent = new Intent(context, AnalyticsUploadAlarmReceiver.class);
                intent.setAction(this.A03);
                AnonymousClass0XS A002 = AnonymousClass0XU.A00();
                A002.A04(intent, context.getClassLoader());
                this.A01 = A002.A02(context, 0, 134217728);
            }
            alarmManager.set(2, elapsedRealtime, this.A01);
            this.A02 = true;
        }
    }

    /* access modifiers changed from: public */
    C22890zA(String str, long j) {
        this.A03 = str;
        this.A00 = j;
    }
}
