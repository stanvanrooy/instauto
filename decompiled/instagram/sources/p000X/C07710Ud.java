package p000X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.rti.common.time.RealtimeSinceBootClock;

/* renamed from: X.0Ud  reason: invalid class name and case insensitive filesystem */
public final class C07710Ud {
    public static final String A0E = AnonymousClass000.A0E(C07710Ud.class.getCanonicalName(), ".ACTION_ALARM.");
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final AlarmManager A03;
    public final PendingIntent A04;
    public final BroadcastReceiver A05;
    public final Context A06;
    public final Handler A07;
    public final AnonymousClass0TU A08;
    public final String A09;
    public final int A0A;
    public final RealtimeSinceBootClock A0B;
    public final C07690Ub A0C;
    public volatile Runnable A0D;

    public final synchronized void A00() {
        if (this.A00) {
            this.A00 = false;
            this.A08.A04(this.A03, this.A04);
        }
    }

    public final synchronized void A01() {
        synchronized (this) {
            if (!this.A01) {
                this.A01 = this.A08.A07(this.A06, this.A05, new IntentFilter(this.A09), this.A07);
            }
        }
        if (!this.A00) {
            long AM2 = (long) ((this.A0C.AM2() + this.A0A) * 1000);
            this.A00 = true;
            long elapsedRealtime = SystemClock.elapsedRealtime() + AM2;
            try {
                if (this.A02 >= 19) {
                    this.A08.A01(this.A03, elapsedRealtime, this.A04);
                } else {
                    this.A03.set(2, elapsedRealtime, this.A04);
                }
            } catch (Throwable th) {
                this.A00 = false;
                AnonymousClass0DB.A0Q("PingUnreceivedAlarm", th, "alarm_failed; intervalSec=%s", Long.valueOf(AM2 / 1000));
            }
        }
        return;
    }

    public C07710Ud(Context context, AnonymousClass0TY r6, String str, RealtimeSinceBootClock realtimeSinceBootClock, Handler handler, C07690Ub r10, AnonymousClass0TU r11) {
        this.A06 = context;
        StringBuilder sb = new StringBuilder(A0E);
        sb.append(str);
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            sb.append('.');
            sb.append(packageName);
        }
        this.A09 = sb.toString();
        C07400Sy A002 = r6.A00("alarm", AlarmManager.class);
        if (A002.A01()) {
            this.A03 = (AlarmManager) A002.A00();
            this.A0B = realtimeSinceBootClock;
            this.A02 = Build.VERSION.SDK_INT;
            this.A07 = handler;
            this.A0C = r10;
            this.A08 = r11;
            this.A0A = r10.AS3();
            this.A05 = new C07700Uc(this);
            Intent intent = new Intent(this.A09);
            intent.setPackage(this.A06.getPackageName());
            this.A04 = PendingIntent.getBroadcast(this.A06, 0, intent, 134217728);
            return;
        }
        throw new IllegalArgumentException("Cannot acquire Alarm service");
    }
}
