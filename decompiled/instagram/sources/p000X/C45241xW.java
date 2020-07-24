package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: X.1xW  reason: invalid class name and case insensitive filesystem */
public final class C45241xW {
    public static final List A00;

    static {
        Integer num = Constants.ZERO;
        Integer num2 = Constants.ONE;
        A00 = Arrays.asList(new C68042yK[]{new C68042yK("qpl_marker", num), new C68042yK("count", num), new C68042yK("duration", num), new C68042yK("cpu_level", num), new C68042yK("gpu_level", num), new C68042yK("platform", num), new C68042yK("timed_out", num), new C68042yK("optimization_type", num2), new C68042yK("classpreload_task_name", num2), new C68042yK("classpreload_time", num), new C68042yK("classpreload_list", num2)});
    }

    public static synchronized void A00(Context context) {
        synchronized (C45241xW.class) {
            C197068bw.A01("MB_LOGS_LOCATIONS", context);
            C197068bw.A01("MB_ADDITIONAL_INFO", context);
            SharedPreferences A002 = C197068bw.A00("MB_ADDITIONAL_INFO", context);
            if (A002 != null) {
                A002.edit().putLong("last_log_clear", System.currentTimeMillis()).apply();
            }
        }
    }

    public static synchronized void A01(String str, long j, long j2, long j3, Context context, Map map, Map map2) {
        SharedPreferences.Editor editor;
        long j4 = j;
        long j5 = j3;
        long j6 = j2;
        synchronized (C45241xW.class) {
            if (!(j == 0 && j6 == 0)) {
                Context context2 = context;
                SharedPreferences A002 = C197068bw.A00("MB_LOGS_LOCATIONS", context2);
                SharedPreferences A003 = C197068bw.A00("MB_ADDITIONAL_INFO", context2);
                String str2 = str;
                SharedPreferences A004 = C197068bw.A00(AnonymousClass000.A0E("MB_LOGS_", str), context2);
                if (!(A002 == null || A003 == null || A004 == null)) {
                    long j7 = A003.getLong("last_log_clear", 0);
                    if (j7 != 0 && System.currentTimeMillis() - j7 > 86400000) {
                        A00(context2);
                    }
                    if (!A002.contains(AnonymousClass000.A0E("MB_LOGS_", str2))) {
                        A002.edit().putBoolean(AnonymousClass000.A0E("MB_LOGS_", str2), true).apply();
                        editor = A004.edit();
                        editor.putString("qpl_marker", str2);
                        editor.putLong("count", j4);
                        editor.putLong("duration", j6);
                        editor.putLong("timed_out", j5);
                        Map map3 = map;
                        for (String str3 : map3.keySet()) {
                            editor.putLong(str3, ((Long) map3.get(str3)).longValue());
                        }
                        Map map4 = map2;
                        for (String str4 : map4.keySet()) {
                            editor.putString(str4, (String) map4.get(str4));
                        }
                    } else {
                        editor = A004.edit();
                        editor.putLong("count", j4 + A004.getLong("count", 0));
                        editor.putLong("duration", A004.getLong("duration", 0) + j6);
                        editor.putLong("timed_out", j3 + A004.getLong("timed_out", 0));
                    }
                    editor.apply();
                    SharedPreferences.Editor edit = A003.edit();
                    long j8 = A003.getLong("total_duration", 0);
                    if (j8 == 0) {
                        edit.putLong("report_timestamp", System.currentTimeMillis());
                    }
                    edit.putLong("total_duration", j6 + j8);
                    edit.apply();
                }
            }
        }
    }
}
