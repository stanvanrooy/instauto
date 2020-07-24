package p000X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.MediaCodecVideoEncoder;

/* renamed from: X.0Ua  reason: invalid class name and case insensitive filesystem */
public final class C07680Ua {
    public static final String A0N = AnonymousClass000.A0E("KeepaliveManager", ".ACTION_INEXACT_ALARM.");
    public static final List A0O = Collections.unmodifiableList(new AnonymousClass0UW());
    public static final String A0P = AnonymousClass000.A0E("KeepaliveManager", ".ACTION_BACKUP_ALARM.");
    public static final String A0Q = AnonymousClass000.A0E("KeepaliveManager", ".ACTION_EXACT_ALARM.");
    public long A00;
    public long A01;
    public long A02 = -1;
    public boolean A03;
    public final int A04;
    public final AlarmManager A05;
    public final PendingIntent A06;
    public final PendingIntent A07;
    public final PendingIntent A08;
    public final BroadcastReceiver A09;
    public final BroadcastReceiver A0A;
    public final BroadcastReceiver A0B;
    public final Context A0C;
    public final Handler A0D;
    public final RealtimeSinceBootClock A0E;
    public final AnonymousClass0TU A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final boolean A0J;
    public final String A0K;
    public final AtomicInteger A0L;
    public volatile Runnable A0M;

    public final synchronized void A03() {
        if (this.A03) {
            this.A03 = false;
            this.A0F.A04(this.A05, this.A08);
            if (!this.A0J) {
                this.A0F.A04(this.A05, this.A06);
            }
            this.A0F.A04(this.A05, this.A07);
        }
        this.A00 = 900000;
        this.A02 = -1;
    }

    public final synchronized void A04() {
        A03();
        if (this.A0M != null) {
            this.A0F.A06(this.A0C, this.A0A);
            this.A0F.A06(this.A0C, this.A0B);
            this.A0F.A06(this.A0C, this.A09);
        }
    }

    private String A00(String str, Context context) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(this.A0K);
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            sb.append('.');
            sb.append(packageName);
        }
        return sb.toString();
    }

    public static void A01(C07680Ua r3, long j) {
        int i = r3.A04;
        if (i >= 23 && r3.A0J) {
            r3.A0F.A03(r3.A05, j, r3.A06);
        } else if (i >= 19) {
            r3.A0F.A01(r3.A05, j, r3.A06);
        } else {
            r3.A05.set(2, j, r3.A06);
        }
    }

    public static void A02(C07680Ua r5, long j, long j2) {
        long j3 = j;
        if (r5.A04 < 23 || !r5.A0J) {
            r5.A05.setInexactRepeating(2, j3, j2, r5.A08);
            return;
        }
        r5.A0F.A02(r5.A05, j, r5.A08);
    }

    public final synchronized void A05() {
        synchronized (this) {
            long j = (long) (this.A0L.get() * 1000);
            if (j > 900000) {
                boolean z = false;
                if (j >= 900000) {
                    z = true;
                }
                C07410Sz.A01(z);
                Iterator it = A0O.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        j = 900000;
                        break;
                    }
                    long longValue = ((Long) it.next()).longValue();
                    if (j >= longValue) {
                        j = longValue;
                        break;
                    }
                }
            }
            this.A00 = j;
            this.A01 = SystemClock.elapsedRealtime() + j;
            if (this.A03) {
                this.A0F.A04(this.A05, this.A07);
                if (!this.A0J) {
                    this.A0F.A04(this.A05, this.A06);
                }
            } else {
                this.A03 = true;
            }
            try {
                long j2 = this.A00;
                if (j2 < 900000) {
                    long j3 = this.A01;
                    int i = this.A04;
                    if (i >= 23 && this.A0J) {
                        this.A0F.A03(this.A05, j3, this.A07);
                    } else if (i >= 19) {
                        this.A0F.A01(this.A05, j3, this.A07);
                    } else {
                        this.A05.setRepeating(2, j3, j2, this.A07);
                    }
                } else {
                    if (this.A02 != j2) {
                        this.A02 = j2;
                        this.A0F.A04(this.A05, this.A08);
                        A02(this, this.A01, this.A00);
                    }
                    if (!this.A0J) {
                        A01(this, this.A01 + MediaCodecVideoEncoder.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public C07680Ua(Context context, AnonymousClass0TY r6, String str, AtomicInteger atomicInteger, RealtimeSinceBootClock realtimeSinceBootClock, Handler handler, AnonymousClass0TU r11) {
        this.A0C = context;
        this.A0K = str;
        this.A0J = AnonymousClass0UP.A01(context.getPackageName());
        this.A0L = atomicInteger;
        C07400Sy A002 = r6.A00("alarm", AlarmManager.class);
        if (A002.A01()) {
            this.A05 = (AlarmManager) A002.A00();
            this.A0E = realtimeSinceBootClock;
            this.A04 = Build.VERSION.SDK_INT;
            this.A0D = handler;
            this.A0F = r11;
            this.A0A = new AnonymousClass0UX(this);
            String A003 = A00(A0Q, context);
            this.A0H = A003;
            Intent intent = new Intent(A003);
            intent.setPackage(context.getPackageName());
            this.A07 = PendingIntent.getBroadcast(context, 0, intent, 134217728);
            this.A0B = new AnonymousClass0UY(this);
            String A004 = A00(A0N, context);
            this.A0I = A004;
            Intent intent2 = new Intent(A004);
            intent2.setPackage(context.getPackageName());
            this.A08 = PendingIntent.getBroadcast(context, 0, intent2, 134217728);
            this.A09 = new AnonymousClass0UZ(this);
            String A005 = A00(A0P, context);
            this.A0G = A005;
            Intent intent3 = new Intent(A005);
            intent3.setPackage(context.getPackageName());
            this.A06 = PendingIntent.getBroadcast(context, 0, intent3, 134217728);
            return;
        }
        throw new IllegalArgumentException("Cannot acquire Alarm service");
    }
}
