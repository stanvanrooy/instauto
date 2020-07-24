package p000X;

import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BQF */
public final class BQF extends AnonymousClass0L1 {
    public final /* synthetic */ AnonymousClass12K A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BQF(AnonymousClass12K r3) {
        super("schedule BDLibrary init()", 579);
        this.A00 = r3;
    }

    public final void A00() {
        BQN bqn;
        C33401cr r1;
        AnonymousClass12K r8 = this.A00;
        if (r8.A06.get() == null && (bqn = r8.A00) != null && ((Boolean) AnonymousClass0L6.A02(bqn.A00, AnonymousClass0L7.BD_PD_LAUNCHER, "is_interval_mode_enabled", false, (AnonymousClass04H) null)).booleanValue() && r8.A05 != null && r8.A04 != null && r8.A02 != null && r8.A03 != null && r8.A01 != null) {
            BQP A002 = BQP.A00();
            A002.A01(r8.A04);
            A002.A01(r8.A05);
            A002.A01(r8.A03);
            A002.A01(r8.A02);
            A002.A02(r8.A0B);
            boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r8.A00.A00, AnonymousClass0L7.BD_PD_LAUNCHER, "is_interval_mode_enabled", false, (AnonymousClass04H) null)).booleanValue();
            int intValue = ((Integer) AnonymousClass0L6.A02(r8.A00.A00, AnonymousClass0L7.BD_PD_LAUNCHER, "interval_duration_s", 0, (AnonymousClass04H) null)).intValue();
            AnonymousClass0C1 r2 = r8.A00.A00;
            AnonymousClass0L7 r12 = AnonymousClass0L7.BD_PD_LAUNCHER;
            AnonymousClass0L6.A02(r2, r12, "biometric_signal_circular_buffer_length", 1, (AnonymousClass04H) null);
            AnonymousClass0L6.A02(r8.A00.A00, r12, "dynamic_signal_circular_buffer_length", 1, (AnonymousClass04H) null);
            AnonymousClass0C1 r3 = r8.A00.A00;
            AnonymousClass0L7 r22 = AnonymousClass0L7.BD_PD_LAUNCHER;
            int intValue2 = ((Integer) AnonymousClass0L6.A02(r3, r22, "static_signal_circular_buffer_length", 0, (AnonymousClass04H) null)).intValue();
            HashMap hashMap = new HashMap();
            BQR bqr = r8.A02;
            BQJ bqj = r8.A01.A01;
            AnonymousClass0C1 r32 = r8.A00.A00;
            Double valueOf = Double.valueOf(0.0d);
            AnonymousClass0L6.A02(r32, r22, "interval_execution_operational_logging_sampling_rate", valueOf, (AnonymousClass04H) null);
            C25520BOe bOe = C25520BOe.ONSITE;
            BQN bqn2 = r8.A00;
            HashMap hashMap2 = new HashMap();
            hashMap2.put(10920, (String) AnonymousClass0L6.A02(bqn2.A00, r22, "bd_config_10920", "{}", (AnonymousClass04H) null));
            hashMap2.put(10941, (String) AnonymousClass0L6.A02(bqn2.A00, r22, "bd_config_10941", "{}", (AnonymousClass04H) null));
            hashMap2.put(10300, (String) AnonymousClass0L6.A02(bqn2.A00, r22, "bd_config_10300", "{}", (AnonymousClass04H) null));
            hashMap2.put(10940, (String) AnonymousClass0L6.A02(bqn2.A00, r22, "bd_config_10940", "{}", (AnonymousClass04H) null));
            hashMap2.put(10943, (String) AnonymousClass0L6.A02(bqn2.A00, r22, "bd_config_10943", "{}", (AnonymousClass04H) null));
            hashMap2.put(10944, (String) AnonymousClass0L6.A02(bqn2.A00, r22, "bd_config_10944", "{}", (AnonymousClass04H) null));
            hashMap2.put(10945, (String) AnonymousClass0L6.A02(bqn2.A00, r22, "bd_config_10945", "{}", (AnonymousClass04H) null));
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap2);
            int intValue3 = ((Integer) AnonymousClass0L6.A02(r8.A00.A00, r22, "package_manager_properties_value_count", 0, (AnonymousClass04H) null)).intValue();
            float doubleValue = (float) ((Double) AnonymousClass0L6.A02(r8.A00.A00, r22, "float_epsilon", valueOf, (AnonymousClass04H) null)).doubleValue();
            AnonymousClass0C1 r33 = r8.A00.A00;
            AnonymousClass0L7 r23 = AnonymousClass0L7.BD_PD_LAUNCHER;
            long intValue4 = (long) ((Integer) AnonymousClass0L6.A02(r33, r23, "non_biometric_signal_time_epsilon", 0, (AnonymousClass04H) null)).intValue();
            long intValue5 = (long) ((Integer) AnonymousClass0L6.A02(r8.A00.A00, r23, "biometric_signal_time_epsilon", 0, (AnonymousClass04H) null)).intValue();
            C25580BQm bQm = r8.A01;
            BQO bqo = r8.A04;
            long millis = TimeUnit.SECONDS.toMillis((long) ((Integer) AnonymousClass0L6.A02(r8.A00.A00, r23, "pdc_interval_s", 0, (AnonymousClass04H) null)).intValue());
            long millis2 = TimeUnit.SECONDS.toMillis((long) ((Integer) AnonymousClass0L6.A02(r8.A00.A00, AnonymousClass0L7.BD_PD_LAUNCHER, "pdc_rt_interval_s", 0, (AnonymousClass04H) null)).intValue());
            AnonymousClass0C1 r15 = r8.A00.A00;
            AnonymousClass0L7 r14 = AnonymousClass0L7.BD_PD_LAUNCHER;
            long millis3 = TimeUnit.SECONDS.toMillis((long) ((Integer) AnonymousClass0L6.A02(r15, r14, "hb_interval_s", 0, (AnonymousClass04H) null)).intValue());
            int intValue6 = ((Integer) AnonymousClass0L6.A02(r8.A00.A00, r14, "biometric_signal_circular_buffer_length", 1, (AnonymousClass04H) null)).intValue();
            int intValue7 = ((Integer) AnonymousClass0L6.A02(r8.A00.A00, r14, "dynamic_signal_circular_buffer_length", 1, (AnonymousClass04H) null)).intValue();
            BQE bqe = r8.A05;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = AnonymousClass0O5.A00().A00;
            BQH bqh = new BQH();
            bqh.A0J = booleanValue;
            bqh.A02 = intValue;
            bqh.A0G = hashMap;
            bqh.A01 = intValue7;
            bqh.A00 = intValue6;
            bqh.A04 = intValue2;
            bqh.A0F = (String) AnonymousClass0L6.A02(r8.A00.A00, r22, "qe_signal_config", "{}", (AnonymousClass04H) null);
            bqh.A0A = bqr;
            bqh.A0B = bqj;
            bqh.A08 = bOe;
            bqh.A0H = unmodifiableMap;
            bqh.A03 = intValue3;
            bqh.A0E = AnonymousClass0QP.class;
            bqh.A09 = bQm;
            BQH.A0K = doubleValue;
            BQH.A0M = intValue4;
            BQH.A0L = intValue5;
            bqh.A06 = millis;
            bqh.A07 = millis2;
            bqh.A05 = millis3;
            bqh.A0C = bqo;
            bqh.A0D = bqe;
            bqh.A0I = scheduledThreadPoolExecutor;
            Context context = r8.A0A;
            BQK A003 = r8.A00.A00();
            synchronized (C33401cr.class) {
                if (C33401cr.A06.get() == null) {
                    C33401cr.A06.set(new C33401cr(context, bqh, A003));
                }
                r1 = (C33401cr) C33401cr.A06.get();
            }
            r8.A06.set(r1);
        }
    }
}
