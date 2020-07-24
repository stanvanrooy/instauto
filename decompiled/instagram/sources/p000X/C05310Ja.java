package p000X;

import android.app.ActivityManager;
import android.app.Application;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Ja  reason: invalid class name and case insensitive filesystem */
public abstract class C05310Ja {
    public static final AtomicBoolean A00 = new AtomicBoolean();
    public static final AtomicReference A01 = new AtomicReference("0");
    public static final AtomicBoolean A02 = new AtomicBoolean();
    public static final AtomicBoolean A03 = new AtomicBoolean();

    public static synchronized AnonymousClass184 A00() {
        AnonymousClass184 A002;
        synchronized (C05310Ja.class) {
            if (!A02.getAndSet(true)) {
                AnonymousClass183 r3 = new AnonymousClass183();
                r3.A02 = new AnonymousClass0DH();
                r3.A0B = new AnonymousClass0FA();
                r3.A08 = new C04670Ew();
                r3.A06 = new C04630Es();
                r3.A07 = new C04620Er();
                r3.A0C = new C04600Ep();
                r3.A01 = new AnonymousClass0EQ();
                r3.A05 = new AnonymousClass0EA();
                r3.A0A = new C04430Dy();
                r3.A03 = new AnonymousClass0DI();
                if (AnonymousClass0JE.A01()) {
                    r3.A00(new C04300Dk());
                }
                if (!AnonymousClass0JE.A03() || !C05770Lw.A00().A0L() || C05770Lw.A00().A00.getBoolean("client_leak_analysis", false)) {
                    r3.A04 = new AnonymousClass0F8();
                } else {
                    r3.A04 = new AnonymousClass0F0();
                    r3.A00(new AnonymousClass0DX());
                }
                if (AnonymousClass0JE.A04()) {
                    r3.A00(new AnonymousClass0DQ());
                    r3.A09 = new AnonymousClass0DL();
                }
                AnonymousClass184.A0R = new AnonymousClass184(r3);
            }
            A002 = AnonymousClass184.A00();
        }
        return A002;
    }

    public static C25624BSf A01() {
        int i;
        Application application = (Application) StoredPreferences.A00;
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        String A002 = C14600lC.A00();
        C25625BSg bSg = new C25625BSg();
        bSg.A06(C205208qU.A01(application));
        bSg.A03(C205208qU.A00(application));
        bSg.A01();
        bSg.A02();
        if (A002 == null) {
            A002 = "";
        }
        bSg.A05(A002);
        if (activityManager != null) {
            i = activityManager.getMemoryClass();
        } else {
            i = 0;
        }
        bSg.A04(String.valueOf(i));
        return bSg.A00();
    }

    public static C25620BSb A02() {
        C252017t A002 = new C251917r(StoredPreferences.A00).A00();
        AnonymousClass0a4.A07(A002, "JobSchedulerCompat failed to build");
        return new C25620BSb(A002, new C05320Jb());
    }

    public static void A03() {
        B7J A07;
        if (!A03.getAndSet(true)) {
            AnonymousClass0L7 r1 = AnonymousClass0L7.MEMORY_MANAGER_LIB;
            boolean booleanValue = ((Boolean) C05640Lj.A00(r1, "session_event_handler_enabled", false)).booleanValue();
            boolean booleanValue2 = ((Boolean) C05640Lj.A00(r1, "periodic_event_handler_enabled", false)).booleanValue();
            BTF btf = null;
            if (booleanValue2 || booleanValue) {
                A07 = A00().A07();
            } else {
                A07 = null;
            }
            if (booleanValue2) {
                AnonymousClass0L7 r5 = AnonymousClass0L7.MEMORY_MANAGER_LIB;
                btf = new BTF((long) ((Integer) C05640Lj.A00(r5, "memory_metrics_delay_ms", 0)).intValue(), (long) ((Integer) C05640Lj.A00(r5, "memory_metrics_interval_ms", 120000)).intValue(), TimeUnit.MILLISECONDS);
            }
            if (A07 != null) {
                if (booleanValue2) {
                    A07.A00(5, btf);
                }
                AnonymousClass0Q7.A03().A0B(new C04390Du(booleanValue, A07, booleanValue2, btf));
            }
        }
    }
}
