package p000X;

import android.os.Handler;
import android.os.Looper;
import java.util.Map;

/* renamed from: X.1d1  reason: invalid class name and case insensitive filesystem */
public final class C33501d1 implements C06570Po, C06580Pp {
    public C215729Rn A00 = null;
    public C215739Ro A01 = null;
    public C06590Pq A02;
    public String A03 = "";
    public String A04 = null;
    public boolean A05 = false;
    public boolean A06;
    public boolean A07;
    public Handler A08;

    public final void onSessionIsEnding() {
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C33501d1 A00(C06590Pq r2) {
        return (C33501d1) r2.AVA(C33501d1.class, new C33511d2(r2));
    }

    public static void A01(C33501d1 r3) {
        C215739Ro r1 = r3.A01;
        if (r1 != null && r3.A05) {
            C90663wI r2 = new C90663wI(AnonymousClass0QT.A01(r3.A02, (AnonymousClass0RN) r1.A01.A02, AnonymousClass0QV.A06).A02("instagram_open_application"));
            r2.A08("event_trace_id", r3.A01.A03);
            r2.A09("tracking", r3.A01.A04);
            r2.A08("dest_module_uri", r3.A03);
            r2.A02("extra_dest_module", r3.A00);
            r2.A01();
            r3.A05 = false;
            r3.A01 = null;
            r3.A03 = "";
            r3.A00 = null;
        }
    }

    public static void A02(C33501d1 r10, boolean z) {
        C06590Pq r4;
        AnonymousClass0L7 r3;
        Double valueOf;
        String str;
        String str2;
        if (z) {
            r4 = r10.A02;
            r3 = AnonymousClass0L7.AL_EXTRA_INFO_LOG_GATING;
            valueOf = Double.valueOf(10.0d);
            str = "log_multiple_click_time_period";
        } else {
            r4 = r10.A02;
            r3 = AnonymousClass0L7.AL_EXTRA_INFO_LOG_GATING;
            valueOf = Double.valueOf(120.0d);
            str = "log_click_timeout_period";
        }
        double doubleValue = ((Double) AnonymousClass0L6.A00(r4, r3, str, valueOf, (AnonymousClass04H) null)).doubleValue();
        if (z) {
            str2 = "Multiple clicks";
        } else {
            str2 = "Click timeout";
        }
        C215739Ro r42 = r10.A01;
        if (r42 != null) {
            boolean z2 = false;
            if (((double) (System.currentTimeMillis() - r42.A00)) / 1000.0d < doubleValue) {
                z2 = true;
            }
            if (!z2 && (r42.A01.A02 instanceof AnonymousClass0RN)) {
                C215669Rg A002 = C215669Rg.A00(r10.A02);
                C215739Ro r102 = r10.A01;
                A002.A02(str2, (AnonymousClass0RN) r102.A01.A02, "application", r102, (Map) null);
            }
        }
    }

    public static boolean A03(C33501d1 r5, long j) {
        if (((double) (System.currentTimeMillis() - j)) / 1000.0d < C105714hJ.A00(r5.A02)) {
            return true;
        }
        return false;
    }

    public final String A04() {
        C215739Ro r0 = this.A01;
        if (r0 == null || !A03(this, r0.A00)) {
            return null;
        }
        return this.A01.A03;
    }

    public final void A05(C215729Rn r4) {
        if (this.A07 || this.A06) {
            if (this.A08 == null) {
                this.A08 = new Handler(Looper.getMainLooper());
            }
            AnonymousClass0ZA.A0E(this.A08, new AnonymousClass9FL(this, r4), -670336295);
            return;
        }
        this.A00 = r4;
    }

    public C33501d1(C06590Pq r5) {
        this.A02 = r5;
        AnonymousClass0L7 r2 = AnonymousClass0L7.AL_LOG_OPEN_APP_EXPERIMENT;
        this.A06 = ((Boolean) AnonymousClass0L6.A00(r5, r2, "should_log_on_leave", false, (AnonymousClass04H) null)).booleanValue();
        this.A07 = ((Boolean) AnonymousClass0L6.A00(r5, r2, "should_log_on_pause", false, (AnonymousClass04H) null)).booleanValue();
    }

    public final void A06(Integer num) {
        boolean z;
        C215739Ro r0;
        switch (num.intValue()) {
            case 0:
                if (this.A06) {
                    if (!((Boolean) AnonymousClass0L6.A00(this.A02, AnonymousClass0L7.AL_EXTRA_INFO_LOG_GATING, "stop_log_open_app_interrupted", false, (AnonymousClass04H) null)).booleanValue() && this.A05 && (r0 = this.A01) != null) {
                        Object obj = r0.A01.A02;
                        if (obj instanceof AnonymousClass0RN) {
                            C215669Rg.A00(this.A02).A02("Open application is interrupted", (AnonymousClass0RN) obj, "application", this.A01, (Map) null);
                        }
                    }
                    this.A05 = false;
                    this.A03 = "";
                    this.A00 = null;
                    return;
                }
                return;
            case 1:
                z = this.A07;
                break;
            case 2:
                z = this.A06;
                break;
            default:
                return;
        }
        if (z) {
            A01(this);
        }
    }
}
