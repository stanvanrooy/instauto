package p000X;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.MessageQueue;
import com.facebook.common.classmarkers.ClassMarkerLoader;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.debug.memorydump.MemoryDumpCreator;
import com.instagram.util.startup.tracking.TaskLifeDetectingService;

/* renamed from: X.0h4  reason: invalid class name and case insensitive filesystem */
public final class C12600h4 implements AnonymousClass0Q6 {
    public static C12600h4 A08;
    public static final C12610h5 A09 = C12610h5.A00("killed_by_back_button");
    public static final C12610h5 A0A = C12610h5.A00("killed_by_task_removal");
    public static final C12610h5 A0B = C12610h5.A00("no_surface_attached");
    public static final C12610h5 A0C = C12610h5.A00("backgrounded");
    public AnonymousClass0h8 A00;
    public Boolean A01;
    public String A02;
    public C12620h6 A03 = C12620h6.UNKNOWN;
    public final AnonymousClass00B A04;
    public final C12630h7 A05 = new C12630h7();
    public volatile boolean A06 = false;
    public volatile boolean A07 = false;

    public static synchronized C12600h4 A00() {
        C12600h4 r0;
        synchronized (C12600h4.class) {
            if (A08 == null) {
                A08 = new C12600h4();
            }
            r0 = A08;
        }
        return r0;
    }

    public static void A01(C12600h4 r9, Context context, Integer num, long j, MessageQueue messageQueue) {
        if (r9.A00 == null) {
            r9.A00 = new AnonymousClass0h8(num, r9.A03, context.getApplicationContext(), System.currentTimeMillis());
            if (j == -1) {
                r9.A04.markerStart(15335435);
                j = AwakeTimeSinceBootClock.INSTANCE.now();
            } else {
                if (num == Constants.ZERO) {
                    r9.A04.markerStart(25100289);
                    r9.A04.markerStart(25100291);
                    AnonymousClass0h8 r1 = r9.A00;
                    r1.A05 = true;
                    r1.A04 = true;
                }
                r9.A04.markerStart(15335435, 0, j);
            }
            String A002 = C12660hB.A00(num);
            C12670hC.A02();
            C06480Pf.A00 = j;
            C06480Pf.A01 = A002;
            r9.A04.markerAnnotate(15335435, "type", C12660hB.A00(r9.A00.A0C));
            messageQueue.addIdleHandler(new C12680hD(r9));
            AnonymousClass0Q7.A03().A0B(r9);
        }
    }

    public static void A02(C12600h4 r2, String str) {
        AnonymousClass0h8 r0 = r2.A00;
        if (r0 != null) {
            if (r0.A05) {
                r2.A04.markerPoint(25100289, str);
            }
            r2.A04.markerPoint(15335435, str);
        }
    }

    public static void A03(C12600h4 r3, String str) {
        AnonymousClass0h8 r0 = r3.A00;
        if (r0 != null) {
            if (r0.A05) {
                r3.A04.markerPoint(25100289, "APP_TERMINATED", str);
            }
            r3.A04.markerPoint(15335435, "APP_TERMINATED", str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r9.A00.A05 != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f8, code lost:
        if (r4 != false) goto L_0x00fa;
     */
    public final void A04(C12610h5 r10) {
        String str;
        boolean z;
        C27601Im r0;
        AnonymousClass00B r3;
        short s;
        AnonymousClass0h8 r2 = this.A00;
        if (r2 != null) {
            if (r2.A03 || r2.A0C != Constants.ZERO || r2.A01 == C12620h6.APP_UPGRADED || this.A06 || this.A07) {
                if (r10.A00) {
                    this.A04.markerAnnotate(15335435, "failure_reason", r10.toString());
                }
                this.A04.markerAnnotate(15335435, "is_successful", !r10.A00);
                AnonymousClass0h8 r02 = this.A00;
                if (r02 != null) {
                    this.A04.markerAnnotate(15335435, "trigger", r02.A01.A00());
                    AnonymousClass0h8 r6 = this.A00;
                    if (r6.A05) {
                        this.A04.markerAnnotate(25100289, "trigger", r6.A01.A00());
                    }
                    this.A04.markerAnnotate(15335435, "user_logged_in", this.A00.A06);
                    this.A04.markerAnnotate(15335435, "build_type", "prod");
                    C27601Im r03 = this.A00.A02;
                    if (r03 != null) {
                        this.A04.markerAnnotate(15335435, "destination", r03.AKA());
                    }
                    long j = C05790Ly.A00(this.A00.A0B).getLong("last_app_start_timestamp", -1);
                    if (j > 0) {
                        this.A04.markerAnnotate(15335435, "duration_since_last_startup", this.A00.A09 - j);
                        this.A04.markerAnnotate(15335435, "last_app_start_trigger", C05790Ly.A00(this.A00.A0B).getString("last_app_start_trigger", C12620h6.UNKNOWN.A00()));
                        this.A04.markerAnnotate(15335435, "last_app_start_type", C05790Ly.A00(this.A00.A0B).getString("last_app_start_type", C12660hB.A00(Constants.ZERO)));
                    }
                    if (this.A00.A0C == Constants.ZERO && (this.A07 || this.A06)) {
                        AnonymousClass00B r22 = this.A04;
                        if (this.A06) {
                            str = "on_install";
                        } else {
                            str = "on_upgrade";
                        }
                        r22.markerAnnotate(15335435, "first_run", str);
                    }
                }
                if (r10 == A0C) {
                    this.A04.markerEnd(15335435, 467, AnonymousClass0Q7.A03().A07());
                } else {
                    this.A04.markerEnd(15335435, 467);
                    AnonymousClass0h8 r1 = this.A00;
                    if (r1.A05) {
                        C27601Im r04 = r1.A02;
                        if (r04 != null && r04.AKA().equals(AnonymousClass1DW.A00(Constants.ZERO))) {
                            AnonymousClass00B r23 = this.A04;
                            short s2 = 2;
                            if (r10.A00) {
                                s2 = 3;
                            }
                            r23.markerEnd(25100289, s2);
                        }
                        this.A04.markerDrop(25100289);
                    }
                    AnonymousClass0h8 r12 = this.A00;
                    if (r12 != null && r12.A04) {
                        this.A04.markerAnnotate(25100291, "trigger", r12.A01.name());
                        AnonymousClass00B r24 = this.A04;
                        short s3 = 2;
                        if (this.A00.A03) {
                            s3 = 3;
                        }
                        r24.markerEnd(25100291, s3);
                        this.A01 = Boolean.valueOf(!this.A00.A03);
                    }
                    AnonymousClass0h8 r05 = this.A00;
                    if (r05 != null) {
                        long j2 = C05790Ly.A00(r05.A0B).getLong("last_app_start_timestamp", -1);
                        if (C05790Ly.A00(this.A00.A0B).getBoolean("last_app_start_is_background_cold_start", false) && j2 > 0) {
                            this.A04.markerStart(25100290, 0, j2);
                            this.A04.markerAnnotate(25100290, "trigger", C05790Ly.A00(this.A00.A0B).getString("last_app_start_trigger", C12620h6.UNKNOWN.A00()));
                            AnonymousClass0h8 r32 = this.A00;
                            if (r32.A0C == Constants.ZERO) {
                                r3 = this.A04;
                                s = 3;
                            } else {
                                this.A04.markerAnnotate(25100290, "foreground_trigger", r32.A01.A00());
                                C27601Im r06 = this.A00.A02;
                                if (r06 != null) {
                                    this.A04.markerAnnotate(25100290, "destination", r06.AKA());
                                }
                                r3 = this.A04;
                                s = 2;
                            }
                            r3.markerEnd(25100290, s, System.currentTimeMillis());
                        }
                    }
                    AnonymousClass0h8 r4 = this.A00;
                    Context context = r4.A0B;
                    long j3 = r4.A09;
                    String A002 = r4.A01.A00();
                    Integer num = r4.A0C;
                    boolean z2 = r4.A03;
                    SharedPreferences.Editor putString = C05790Ly.A00(context).edit().putLong("last_app_start_timestamp", j3).putString("last_app_start_trigger", A002).putString("last_app_start_type", C12660hB.A00(num));
                    if (num == Constants.ZERO) {
                        z = true;
                    }
                    z = false;
                    putString.putBoolean("last_app_start_is_background_cold_start", z).apply();
                    AnonymousClass1BH.A06(new Intent(this.A00.A0B, TaskLifeDetectingService.class), this.A00.A0B);
                    AnonymousClass0h8 r33 = this.A00;
                    Integer num2 = r33.A0C;
                    Integer num3 = Constants.ZERO;
                    if (num2 == num3 && r33.A01 == C12620h6.LAUNCHER && (r0 = r33.A02) != null && r0.AKA().equals(AnonymousClass1DW.A00(num3)) && !r10.A00) {
                        ClassMarkerLoader.loadIsColdStartRunMarker();
                        MemoryDumpCreator memoryDumpCreator = r33.A00;
                        if (memoryDumpCreator != null) {
                            memoryDumpCreator.createBetamapMemoryDump();
                        }
                    }
                    AnonymousClass0h8 r25 = this.A00;
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = r25.A0A;
                    if (activityLifecycleCallbacks != null) {
                        ((Application) r25.A0B).unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                    }
                    C27601Im r07 = r25.A02;
                    if (r07 != null) {
                        r07.Azk();
                    }
                    this.A00 = null;
                    this.A03 = C12620h6.UNKNOWN;
                    AnonymousClass0Q7.A03().A0D(this);
                }
            } else {
                this.A04.markerDrop(15335435);
            }
        }
    }

    public final void A05(C12620h6 r7) {
        boolean z = r7.A00;
        if (!z) {
            this.A03 = r7;
        }
        AnonymousClass0h8 r4 = this.A00;
        if (r4 == null) {
            return;
        }
        if (r7 != C12620h6.LAUNCHER || r4.A01 == C12620h6.UNKNOWN) {
            Integer num = r4.A0C;
            Integer num2 = Constants.ZERO;
            if ((num == num2 && r4.A01 == C12620h6.UNKNOWN) || (num != num2 && !z)) {
                r4.A01 = r7;
            }
        }
    }

    public final void A06(C27601Im r4) {
        AnonymousClass0h8 r0 = this.A00;
        if (r0 != null && r0.A02 != r4) {
            this.A04.markerTag(15335435, r4.AKA());
            C27601Im r02 = this.A00.A02;
            if (r02 != null) {
                r02.Azk();
            }
            r4.AsP();
            this.A00.A02 = r4;
        }
    }

    public final void A07(C27601Im r3, String str) {
        AnonymousClass0h8 r1 = this.A00;
        if (r1 != null && r1.A02 == r3) {
            if (r1.A05) {
                this.A04.markerPoint(25100289, str);
            }
            this.A04.markerPoint(15335435, str);
        }
    }

    public final void A08(String str, long j) {
        AnonymousClass0h8 r0 = this.A00;
        if (r0 != null) {
            if (r0.A05) {
                this.A04.markerPoint(25100289, str);
            }
            this.A04.markerPoint(15335435, str, j);
        }
    }

    public final boolean A09() {
        Intent A002 = this.A05.A00();
        if (A002 == null || !"android.intent.action.MAIN".equals(A002.getAction()) || !A002.hasCategory("android.intent.category.LAUNCHER")) {
            return false;
        }
        return true;
    }

    public C12600h4() {
        AnonymousClass00B r2 = AnonymousClass00B.A01;
        this.A04 = r2;
        r2.A0M(15335435, 1);
        this.A04.A0M(25100289, 0);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0Z0.A03(-1147452035);
        if (this.A00 != null) {
            A08("APP_BACKGROUNDED", AnonymousClass0Q7.A03().A07());
            A04(A0C);
        }
        AnonymousClass0Z0.A0A(-1916504259, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0Z0.A0A(-1665433757, AnonymousClass0Z0.A03(-1776320653));
    }
}
