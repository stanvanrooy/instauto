package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.C0003R;
import com.instagram.util.offline.BackgroundWifiPrefetcherJobService;
import com.instagram.util.offline.BackgroundWifiPrefetcherWorkerService;
import java.util.Random;

/* renamed from: X.1Gz  reason: invalid class name and case insensitive filesystem */
public final class C27231Gz implements AnonymousClass0Q6, C06570Po {
    public static final Random A03 = new Random();
    public AnonymousClass0C1 A00;
    public final C16180oA A01;
    public final Context A02;

    private void A00(long j) {
        Class cls;
        AnonymousClass0C1 r2 = this.A00;
        if (A03.nextInt(100) < 1) {
            C150366by r22 = new C150366by(AnonymousClass0QT.A00(r2, (AnonymousClass0RN) null).A02("ig_android_background_prefetch_scheduler"));
            r22.A08("type", "scheduled");
            r22.A01();
        }
        this.A01.A00.edit().putLong("bg_fetch_schedule_target_ms", (System.currentTimeMillis() / 1000) + j).apply();
        C49852Dw A002 = C49852Dw.A00(this.A02, this.A00);
        if (Build.VERSION.SDK_INT >= 21) {
            cls = BackgroundWifiPrefetcherJobService.class;
        } else {
            cls = BackgroundWifiPrefetcherWorkerService.class;
        }
        C49832Dt r3 = new C49832Dt(C0003R.C0005id.background_wifi_prefetcher_job_scheduler_id, cls);
        r3.A04 = true;
        r3.A01 = 2;
        r3.A02 = j;
        C49842Dv r1 = new C49842Dv(r3);
        A002.A02(r1, r1.A03);
    }

    public static synchronized void A01(AnonymousClass0C1 r3) {
        Class<C27231Gz> cls = C27231Gz.class;
        synchronized (cls) {
            C27231Gz r1 = (C27231Gz) r3.AV9(cls);
            if (r1 != null) {
                AnonymousClass0Q7.A03().A0D(r1);
            }
            r3.BbT(cls);
        }
    }

    private void A02(String str, boolean z) {
        Class cls;
        if (Build.VERSION.SDK_INT >= 21) {
            cls = BackgroundWifiPrefetcherJobService.class;
        } else {
            cls = BackgroundWifiPrefetcherWorkerService.class;
        }
        C49852Dw.A00(this.A02, this.A00).A01(new C49842Dv(new C49832Dt(C0003R.C0005id.background_wifi_prefetcher_job_scheduler_id, cls)));
        boolean z2 = true;
        if (A03.nextInt(100) < 1) {
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_android_background_prefetch_scheduler", (AnonymousClass0RN) null);
            A002.A0G("type", "cancelled");
            A002.A0G("source", str);
            if (C150326bu.A00(this.A00) == null) {
                z2 = false;
            }
            A002.A0A("is_running", Boolean.valueOf(z2));
            if (z) {
                long j = this.A01.A00.getLong("bg_fetch_schedule_target_ms", -1);
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                if (j != -1 && currentTimeMillis < j) {
                    A002.A0F("latency_delta", Long.valueOf(j - currentTimeMillis));
                }
            }
            AnonymousClass0WN.A01(this.A00).BcG(A002);
        }
        this.A01.A00.edit().remove("bg_fetch_schedule_target_ms").apply();
    }

    public C27231Gz(Context context, AnonymousClass0C1 r3) {
        this.A02 = context;
        this.A00 = r3;
        this.A01 = C16180oA.A00(r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00dd, code lost:
        if ((r26 + r6) < r6) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f8, code lost:
        if ((r20 - r18) > r8) goto L_0x00fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0088  */
    public final void onAppBackgrounded() {
        long j;
        long j2;
        boolean z;
        boolean z2;
        SharedPreferences.Editor putLong;
        int A032 = AnonymousClass0Z0.A03(1478029887);
        C16180oA r11 = this.A01;
        long j3 = r11.A00.getLong("bg_fetch_server_timing_ms", -1);
        if (j3 > 0) {
            r11.A00.edit().remove("bg_fetch_server_timing_ms").apply();
            j = j3 / 60000;
        } else {
            long j4 = r11.A00.getLong("last_session_ts", 0);
            long currentTimeMillis = System.currentTimeMillis();
            r11.A00.edit().putLong("last_session_ts", currentTimeMillis).apply();
            int i = ((int) (currentTimeMillis - j4)) / 60000;
            if (i >= 0 && i < 600) {
                int i2 = r11.A00.getInt("total_sessions_count", 0);
                long j5 = (long) i;
                int i3 = i2;
                if (i2 == 0) {
                    putLong = r11.A00.edit().putInt("total_sessions_count", 1);
                } else {
                    long j6 = j5 * j5;
                    long j7 = r11.A00.getLong("min_between_sessions", 10);
                    long j8 = r11.A00.getLong("min_between_sessions_sum_of_squares", 125);
                    long j9 = j7 / ((long) i2);
                    long j10 = j9 * j9;
                    double d = (((double) j8) / ((double) i2)) - ((double) j10);
                    long round = Math.round(Math.sqrt(d));
                    if (i2 < 100) {
                        j2 = 10;
                    } else {
                        j2 = 3;
                    }
                    long j11 = round * j2;
                    if (i2 + 1 >= i2 && j5 + j7 >= j7) {
                        z = false;
                    }
                    z = true;
                    if (z) {
                        long j12 = (long) 100;
                        j8 = j12 * (((long) d) + j10);
                        j7 = j9 * j12;
                        i3 = 100;
                    }
                    if (j9 + j11 >= j5) {
                        z2 = false;
                    }
                    z2 = true;
                    if (z || !z2) {
                        if (!z2) {
                            if (!z) {
                                i3++;
                            }
                            j7 += j5;
                            j8 += j6;
                        }
                        r11.A00.edit().putInt("total_sessions_count", i3).apply();
                        r11.A00.edit().putLong("min_between_sessions", j7).apply();
                        putLong = r11.A00.edit().putLong("min_between_sessions_sum_of_squares", j8);
                    }
                    if (i2 >= 100) {
                        j = (long) (((double) (r11.A00.getLong("min_between_sessions", 10) / ((long) i2))) * 0.75d);
                    }
                }
                putLong.apply();
                if (i2 >= 100) {
                }
            }
            j = 10;
        }
        A00(j * 60000);
        AnonymousClass0Z0.A0A(-1938022005, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0Z0.A03(559894658);
        A02("app_foregrounded", true);
        AnonymousClass0Z0.A0A(654493249, A032);
    }

    public final void onUserSessionWillEnd(boolean z) {
        A02("user_switch", false);
        AnonymousClass0Q7.A03().A0D(this);
        this.A00 = null;
    }
}
