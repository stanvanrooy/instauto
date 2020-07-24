package p000X;

import android.util.SparseArray;
import com.facebook.profilo.config.p001v2.Config;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0bF  reason: invalid class name and case insensitive filesystem */
public final class C09340bF implements AnonymousClass0GC {
    public AnonymousClass0GB A00;
    public AnonymousClass0GI A01;
    public Config A02;

    public C09340bF(Config config) {
        C09290bA r9;
        Config config2 = config;
        this.A02 = config2;
        long longValue = Long.valueOf((long) config2.getSystemConfigParamInt("system_config.upload_max_bytes")).longValue();
        long longValue2 = Long.valueOf((long) config2.getSystemConfigParamInt("system_config.upload_bytes_per_update")).longValue();
        long longValue3 = Long.valueOf((long) config2.getSystemConfigParamInt("system_config.upload_time_period_sec")).longValue();
        if (longValue == 0 || longValue2 == 0 || longValue3 == 0) {
            throw new IllegalArgumentException("Bad values for system control configuration");
        }
        this.A01 = new C09560bc(config2.optSystemConfigParamInt("system_config.buffer_size", -1), config2.optSystemConfigParamBool("system_config.mmap_buffer", false));
        Config config3 = this.A02;
        ArrayList arrayList = new ArrayList();
        int[] traceConfigIdxs = config3.getTraceConfigIdxs("qpl", "start");
        int i = -1;
        for (int i2 : traceConfigIdxs) {
            if (i != -1 || !config3.optTraceConfigParamBool(i2, "trace_config.is_cold_start", false)) {
                arrayList.add(Integer.valueOf(i2));
            } else {
                i = i2;
            }
        }
        int systemConfigParamInt = config3.getSystemConfigParamInt("system_config.max_trace_timeout_ms");
        SparseArray sparseArray = new SparseArray();
        C09320bD r2 = null;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                sparseArray.put(config3.getTraceConfigTriggerParamInt(intValue, "qpl", "start", "trigger.qpl.marker"), new AnonymousClass0GJ(config3.getTraceConfigParamInt(intValue, "trace_config.coinflip_sample_rate"), Arrays.asList(config3.getTraceConfigProviders(intValue)), C09420bN.A02(config3, intValue, systemConfigParamInt), C09420bN.A00(config3, intValue), C09420bN.A01(config3, intValue)));
            }
            if (sparseArray.size() > 0) {
                r2 = new C09320bD(sparseArray);
            }
        }
        if (i == -1) {
            r9 = null;
        } else {
            int traceConfigParamInt = config3.getTraceConfigParamInt(i, "trace_config.coinflip_sample_rate");
            List asList = Arrays.asList(config3.getTraceConfigProviders(i));
            config3.getTraceConfigTriggerParamInt(i, "qpl", "stop", "trigger.qpl.marker");
            r9 = new C09290bA(traceConfigParamInt, asList, C09420bN.A02(config3, i, systemConfigParamInt), C09420bN.A00(config3, i), C09420bN.A01(config3, i));
        }
        int[] traceConfigIdxs2 = config3.getTraceConfigIdxs("startup", "start");
        int length = traceConfigIdxs2.length;
        AnonymousClass0b9 r11 = null;
        if (length != 0) {
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                int i4 = traceConfigIdxs2[i3];
                if (config3.optTraceConfigParamBool(i4, "trace_config.is_black_box", false)) {
                    r11 = new AnonymousClass0b9(config3.getTraceConfigParamInt(i4, "trace_config.coinflip_sample_rate"), Arrays.asList(config3.getTraceConfigProviders(i4)), config3.optTraceConfigTriggerParamInt(i4, "qpl", "stop", "trigger.qpl.marker", 0), C09420bN.A02(config3, i4, -1), C09420bN.A00(config3, i4), C09420bN.A01(config3, i4));
                    break;
                }
                i3++;
            }
        }
        this.A00 = new C09420bN(r2, r9, r11, config3.getSystemConfigParamInt("system_config.timed_out_upload_sample_rate"));
    }

    public final long AIb() {
        return this.A02.getID();
    }

    public final AnonymousClass0GB AJ0() {
        return this.A00;
    }

    public final AnonymousClass0GI AXX() {
        return this.A01;
    }
}
