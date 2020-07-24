package p000X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Messenger;
import android.os.SystemClock;
import com.facebook.analytics2.logger.AlarmBasedUploadService;

/* renamed from: X.06x  reason: invalid class name and case insensitive filesystem */
public final class C034206x extends C032906k {
    public final ComponentName A00;
    public final Context A01;

    public final void A01(int i, String str, AnonymousClass06W r24, long j, long j2) {
        AlarmManager alarmManager;
        Context context = this.A01;
        if (j2 < j) {
            AnonymousClass0DB.A0L("AlarmUpload-MaxDelay", "MaxDelayms(%d) < MinDelayms(%d)", Long.valueOf(j2), Long.valueOf(j));
            j2 = j;
        }
        long j3 = AlarmBasedUploadService.A03;
        if (j >= j3) {
            j3 = Math.min(AlarmBasedUploadService.A02, 2 * j);
        }
        String str2 = str;
        int i2 = i;
        C033806t r9 = new C033806t((Messenger) null, (Bundle) null, str2, r24, i2, new C033506q(j3, j3 + (j2 - j), str2), context);
        Class<AlarmBasedUploadService> cls = AlarmBasedUploadService.class;
        Intent action = new Intent(context, cls).setAction(AnonymousClass000.A05("com.facebook.analytics2.logger.UPLOAD_NOW-", i2));
        Bundle bundle = new Bundle();
        bundle.putParcelable("_messenger", r9.A05);
        bundle.putBundle("_extras", r9.A04);
        bundle.putString("_hack_action", r9.A08);
        bundle.putBundle("_upload_job_config", new Bundle((Bundle) r9.A06.A00(new AnonymousClass03E(new Bundle()))));
        bundle.putInt("_job_id", r9.A02);
        C033506q r92 = r9.A07;
        if (r92 != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("min_delay_ms", r92.A01);
            bundle2.putLong("max_delay_ms", r92.A00);
            bundle2.putString("action", r92.A02);
            bundle2.putInt("__VERSION_CODE", 227299068);
            bundle.putBundle("_fallback_config", bundle2);
        }
        Intent putExtras = action.putExtras(bundle);
        AnonymousClass0XS A002 = AnonymousClass0XU.A00();
        A002.A04(putExtras, context.getClassLoader());
        PendingIntent service = PendingIntent.getService(context, 0, A002.A03(context), 134217728);
        synchronized (cls) {
            if (AlarmBasedUploadService.A01 == null) {
                AlarmBasedUploadService.A01 = (AlarmManager) context.getSystemService("alarm");
            }
            alarmManager = AlarmBasedUploadService.A01;
        }
        alarmManager.set(2, SystemClock.elapsedRealtime() + j, service);
    }

    public C034206x(Context context) {
        this.A01 = context;
        this.A00 = new ComponentName(context, AlarmBasedUploadService.class);
    }
}
