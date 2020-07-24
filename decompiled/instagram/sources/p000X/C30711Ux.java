package p000X;

import android.content.Context;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.react.uimanager.BaseViewManager;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Ux  reason: invalid class name and case insensitive filesystem */
public final class C30711Ux {
    public static Boolean A0M;
    public static final C30731Uz A0N = new C30721Uy();
    public long A00;
    public C29811DAv A01;
    public AnonymousClass1VA A02;
    public C30731Uz A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final AwakeTimeSinceBootClock A08;
    public final AnonymousClass0RN A09;
    public final AnonymousClass00B A0A;
    public final AnonymousClass1V0 A0B;
    public final C256619t A0C;
    public final AnonymousClass1V6 A0D = new AnonymousClass1V6();
    public final C252117x A0E;
    public final Runnable A0F;
    public final WeakReference A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final AnonymousClass1V4 A0L;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00de, code lost:
        if (r0.A0H == false) goto L_0x00e0;
     */
    public static void A00(C30711Ux r23, boolean z) {
        boolean z2;
        int i;
        C30711Ux r0 = r23;
        if (r0.A04) {
            AnonymousClass1V6 r8 = r0.A0D;
            AnonymousClass1V7 A012 = r0.A02.A01();
            int i2 = -1;
            int i3 = 0;
            if (r8.A0C) {
                i3 = -1;
            }
            int i4 = 0;
            if (r8.A0B) {
                i4 = -1;
            }
            if (!r8.A0A) {
                i2 = 0;
            }
            r8.A06 = new AnonymousClass1V7(A012.A02 + i3, A012.A01 + ((float) i4), A012.A00 + ((float) i2));
            if (r0.A0I) {
                C29811DAv dAv = r0.A01;
                if (dAv.A03) {
                    dAv.A03 = false;
                    dAv.A05.disable();
                    double min = Math.min(dAv.A01, 3600.0d);
                    double min2 = Math.min(dAv.A00, 1000.0d);
                    long millis = TimeUnit.NANOSECONDS.toMillis(Math.min(dAv.A02, C29811DAv.A07));
                    C29046Cqz cqz = dAv.A06;
                    C92823zm r5 = new C92823zm(min, min2, millis);
                    AnonymousClass0Hz withMarker = cqz.A01.withMarker(cqz.A00);
                    withMarker.A03("sfd", r5.A01);
                    withMarker.A03("lfd", r5.A00);
                    withMarker.A05("ts", r5.A02);
                    withMarker.Aoj();
                    C29046Cqz cqz2 = dAv.A06;
                    cqz2.A01.markerAnnotate(cqz2.A00, "module", cqz2.A02);
                    cqz2.A01.markerEnd(cqz2.A00, 2);
                    dAv.A01 = 0.0d;
                    dAv.A00 = 0.0d;
                    dAv.A02 = 0;
                }
            }
            if (r0.A0K) {
                if (C92833zn.A02 == null) {
                    C92833zn.A02 = new C92833zn();
                }
                C92833zn r2 = C92833zn.A02;
                if (r2.A00 == r0) {
                    r2.A00 = null;
                }
                r2.A01.remove(r0);
            }
            r0.A04 = false;
            r0.A09.getModuleName();
            if (r0.A0K && z) {
                z2 = true;
            }
            z2 = false;
            if (r0.A0D.A05 <= 0 || z2) {
                r0.A0A.markerDrop(r0.A07, r0.A06);
            } else {
                long now = r0.A08.now();
                AnonymousClass0P4 A002 = AnonymousClass0P4.A00("feed_scroll_perf", r0.A09);
                A002.A0E("1_frame_drop_bucket", Integer.valueOf(r0.A0D.A06.A02));
                A002.A0D("4_frame_drop_bucket", Float.valueOf(r0.A0D.A06.A01));
                A002.A0D("8_frame_drop_bucket", Float.valueOf(r0.A0D.A06.A00));
                A002.A0D("display_refresh_rate", Float.valueOf(r0.A02.A05));
                A002.A0F("total_time_spent", Long.valueOf(r0.A0D.A05 / 1000000));
                A002.A0F("total_busy_time_spent", Long.valueOf(r0.A0D.A04 / 1000000));
                A002.A0F("current_ts_ms", Long.valueOf(now));
                A002.A0F("startup_ts_ms", Long.valueOf(C06480Pf.A00));
                A002.A0G("startup_type", C06480Pf.A01);
                A002.A0A("is_session_logging_enabled", true);
                A002.A0C("heap_free_ratio", Double.valueOf(r0.A0E.A03()));
                r0.A0C.A31(A002);
                AnonymousClass0RU r1 = (AnonymousClass0RU) r0.A0G.get();
                if (r1 != null) {
                    r1.BcG(A002);
                }
                r0.A03.reportScrollForDebug(A002);
                r0.A0A.markerAnnotate(r0.A07, r0.A06, "1_frame_drop_bucket", r0.A0D.A06.A02);
                r0.A0A.markerAnnotate(r0.A07, r0.A06, "4_frame_drop_bucket", (double) r0.A0D.A06.A01);
                AnonymousClass00B r13 = r0.A0A;
                int i5 = r0.A07;
                AnonymousClass00B r19 = r13;
                int i6 = i5;
                r19.markerAnnotate(i6, r0.A06, "8_frame_drop_bucket", (double) r0.A0D.A06.A00);
                AnonymousClass00B r12 = r0.A0A;
                int i7 = r0.A07;
                AnonymousClass00B r192 = r12;
                int i8 = i7;
                r192.markerAnnotate(i8, r0.A06, "total_time_spent", r0.A0D.A05 / 1000000);
                AnonymousClass00B r11 = r0.A0A;
                int i9 = r0.A07;
                AnonymousClass00B r17 = r11;
                int i10 = i9;
                r17.markerAnnotate(i10, r0.A06, "total_busy_time_spent", r0.A0D.A04 / 1000000);
                AnonymousClass00B r10 = r0.A0A;
                int i11 = r0.A07;
                AnonymousClass00B r172 = r10;
                int i12 = i11;
                r172.markerAnnotate(i12, r0.A06, "display_refresh_rate", (double) r0.A02.A05);
                r0.A0A.markerAnnotate(r0.A07, r0.A06, "container_module", r0.A09.getModuleName());
                r0.A0A.markerAnnotate(r0.A07, r0.A06, "vsync_time", (int) Math.ceil((double) (1000.0f / r0.A02.A05)));
                AnonymousClass00B r3 = r0.A0A;
                int i13 = r0.A07;
                AnonymousClass00B r82 = r3;
                int i14 = i13;
                r82.markerAnnotate(i14, r0.A06, "current_ts_ms", now);
                AnonymousClass00B r9 = r0.A0A;
                int i15 = r0.A07;
                int i16 = r0.A06;
                long j = (now - C06480Pf.A00) / 1000;
                if (j < 1) {
                    i = 0;
                } else if (j < 5) {
                    i = 1;
                } else if (j < 30) {
                    i = 2;
                } else {
                    i = 4;
                    if (j < 120) {
                        i = 3;
                    }
                }
                r9.markerAnnotate(i15, i16, "time_since_startup_bucket", i);
                r0.A0A.markerAnnotate(r0.A07, r0.A06, "startup_ts_ms", C06480Pf.A00);
                r0.A0A.markerAnnotate(r0.A07, r0.A06, "startup_type", C06480Pf.A01);
                r0.A0A.markerAnnotate(r0.A07, r0.A06, "heap_free_ratio", r0.A0E.A03());
                r0.A0A.markerAnnotate(r0.A07, r0.A06, "scroll_direction", r0.A0D.A07.toString());
                r0.A0A.markerAnnotate(r0.A07, r0.A06, "source_description", r0.A0D.A09);
                r0.A0A.markerAnnotate(r0.A07, r0.A06, "destination_description", r0.A0D.A08);
                r0.A0A.markerAnnotate(r0.A07, r0.A06, "scroll_distance_x", r0.A0D.A01);
                r0.A0A.markerAnnotate(r0.A07, r0.A06, "scroll_distance_y", r0.A0D.A02);
                r0.A0A.markerAnnotate(r0.A07, r0.A06, "display_density", r0.A05);
                r0.A0C.A30(r0.A0A, r0.A07, r0.A06);
                r0.A0A.markerEnd(r0.A07, r0.A06, 2);
            }
            r0.A03.onScrollStop();
        }
    }

    public final void A01(String str) {
        AnonymousClass1V6 r1 = this.A0D;
        if (r1.A09.isEmpty()) {
            r1.A09 = str;
        }
    }

    public final void A02(boolean z) {
        if (z) {
            A00(this, false);
            return;
        }
        boolean z2 = this.A04;
        if (!z2 && A0M.booleanValue()) {
            if (!z2) {
                this.A04 = true;
                this.A09.getModuleName();
                if (this.A0K) {
                    if (C92833zn.A02 == null) {
                        C92833zn.A02 = new C92833zn();
                    }
                    C92833zn r6 = C92833zn.A02;
                    r6.A00 = this;
                    r6.A01.add(this);
                    for (C30711Ux r2 : (C30711Ux[]) r6.A01.toArray(new C30711Ux[0])) {
                        if (r6.A00 != r2) {
                            r2.A09.getModuleName();
                            r2.A0D.A08 = "force_detach";
                            A00(r2, true);
                        }
                    }
                }
                AnonymousClass1V6 r3 = this.A0D;
                r3.A05 = 0;
                r3.A04 = 0;
                r3.A00 = 0;
                r3.A03 = -1;
                r3.A0C = false;
                r3.A0B = false;
                r3.A0A = false;
                r3.A01 = 0;
                r3.A02 = 0;
                r3.A07 = C480526l.UNKNOWN;
                r3.A09 = "";
                r3.A08 = "";
                r3.A06 = new AnonymousClass1V7(0, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A02.A02();
                if (this.A0I) {
                    C29811DAv dAv = this.A01;
                    if (!dAv.A03) {
                        dAv.A03 = true;
                        dAv.A05.enable();
                        C29046Cqz cqz = dAv.A06;
                        cqz.A01.markerStart(cqz.A00);
                    }
                }
            } else {
                throw new IllegalStateException("Shall not attach the watch twice");
            }
        }
        this.A03.registerModule(this.A09.getModuleName());
        this.A03.onScrollStart();
    }

    public C30711Ux(Context context, AnonymousClass0RN r6, C256619t r7, int i, AnonymousClass1V0 r9, AnonymousClass00B r10, C30731Uz r11, AnonymousClass1V2 r12, AwakeTimeSinceBootClock awakeTimeSinceBootClock, AnonymousClass0RU r14, C252117x r15, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, int i3, int i4, int i5) {
        int i6 = i3;
        boolean z6 = true;
        this.A00 = 0;
        this.A0F = new AnonymousClass1V8(this);
        this.A0L = new AnonymousClass1V9(this);
        if (A0M == null) {
            boolean z7 = true;
            if (!C06610Ps.A01()) {
                i6 = i5;
                if (C06610Ps.A02()) {
                    i6 = i4;
                }
            }
            A0M = Boolean.valueOf(new Random().nextInt(i6) >= 1 ? false : z7);
        }
        this.A04 = false;
        this.A09 = r6;
        this.A0C = r7;
        this.A0B = r9;
        this.A0A = r10;
        this.A02 = r12.A00(this.A0L, z4);
        this.A03 = r11;
        this.A08 = awakeTimeSinceBootClock;
        this.A0G = new WeakReference(r14);
        this.A0E = r15;
        this.A0K = z;
        this.A0H = z2;
        this.A0J = z3;
        this.A05 = i2;
        this.A07 = i;
        this.A06 = new Random().nextInt();
        this.A0A.A0M(this.A07, 1);
        this.A03.registerModule(this.A09.getModuleName());
        z6 = (context == null || !z5) ? false : z6;
        this.A0I = z6;
        if (z6) {
            this.A01 = new C29811DAv(new C29046Cqz(this.A0A, r6.getModuleName()), context);
        }
    }
}
