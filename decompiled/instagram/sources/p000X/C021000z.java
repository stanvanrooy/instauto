package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: X.00z  reason: invalid class name and case insensitive filesystem */
public final class C021000z {
    public static C022301o A00;
    public static C022401p A01;
    public static C04040Cc A02;
    public static AnonymousClass0CU A03;
    public static AnonymousClass08S A04;
    public static boolean A05;
    public static final Object A06 = new Object();
    public static final Object A07 = new Object();

    public static int A00(String str) {
        return A03.A00.getSharedPreferences("acra_flags_store", 0).getInt(str, 0);
    }

    public static void A01(Context context, C04410Dw r26, String str) {
        int A002 = A00("android_anr_detector_to_use");
        int A003 = A00("error_monitor_check_interval");
        synchronized (A06) {
            C04410Dw r4 = r26;
            Context context2 = context;
            C04040Cc r12 = new C04040Cc(context2, r4);
            A02 = r12;
            C022301o r13 = A00;
            Handler handler = new Handler(Looper.getMainLooper());
            boolean A052 = A05("should_report_soft_errors");
            boolean A053 = A05("log_on_signal_handler");
            boolean A054 = A05("avoid_mutex_on_signal_handler");
            int A004 = A00("anr_recovery_timeout");
            boolean A055 = A05("record_signal_time");
            boolean z = A03.A00.getSharedPreferences("acra_flags_store", 0).getBoolean("anr_gk_cached", true);
            String str2 = r4.A0H;
            A01 = A03.A00(A002, new C021801j(context2, str, r12, r13, handler, A002, A052, A053, A054, A004, A055, z, str2, r4.A0I, r4.A0B.getDir("traces", 0).getPath(), A00("foreground_check_period"), false), A003);
        }
    }

    public static void A02(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                AnonymousClass0DB.A0M("ACRA", e, "Error while closing stream: ");
            }
        }
    }

    public static void A03(String str, int i) {
        SharedPreferences sharedPreferences = A03.A00.getSharedPreferences("acra_flags_store", 0);
        if (sharedPreferences.getInt(str, 0) != i) {
            sharedPreferences.edit().putInt(str, i).apply();
        }
    }

    public static void A04(String str, boolean z) {
        SharedPreferences sharedPreferences = A03.A00.getSharedPreferences("acra_flags_store", 0);
        if (sharedPreferences.getBoolean(str, false) != z) {
            sharedPreferences.edit().putBoolean(str, z).apply();
        }
    }

    public static boolean A05(String str) {
        return A03.A00.getSharedPreferences("acra_flags_store", 0).getBoolean(str, false);
    }
}
