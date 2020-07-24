package p000X;

import com.facebook.profilo.config.p001v2.Config;
import java.util.TreeMap;

/* renamed from: X.0bN  reason: invalid class name and case insensitive filesystem */
public final class C09420bN implements AnonymousClass0GB {
    public int A00;
    public AnonymousClass0b9 A01;
    public C09290bA A02;
    public C09320bD A03;

    public static TreeMap A00(Config config, int i) {
        TreeMap treeMap = new TreeMap();
        if (config.optTraceConfigParamBool(i, "trace_config.should_pause_in_background", false)) {
            treeMap.put("trace_config.should_pause_in_background", true);
        }
        if (config.optTraceConfigParamBool(i, "provider.stack_trace.use_thread_specific_profiler", false)) {
            treeMap.put("provider.stack_trace.use_thread_specific_profiler", true);
        }
        if (treeMap.size() == 0) {
            return null;
        }
        return treeMap;
    }

    public static TreeMap A01(Config config, int i) {
        TreeMap treeMap = new TreeMap();
        int[] optTraceConfigParamIntList = config.optTraceConfigParamIntList(i, "provider.qpl.event_whitelist");
        if (!(optTraceConfigParamIntList == null || optTraceConfigParamIntList.length == 0)) {
            treeMap.put("provider.qpl.event_whitelist", optTraceConfigParamIntList);
        }
        int[] optTraceConfigParamIntList2 = config.optTraceConfigParamIntList(i, "trace_config.duration_condition");
        if (!(optTraceConfigParamIntList2 == null || optTraceConfigParamIntList2.length == 0)) {
            treeMap.put("trace_config.duration_condition", optTraceConfigParamIntList2);
        }
        if (treeMap.size() == 0) {
            return null;
        }
        return treeMap;
    }

    public static TreeMap A02(Config config, int i, int i2) {
        int optTraceConfigParamInt = config.optTraceConfigParamInt(i, "provider.stack_trace.cpu_sampling_rate_ms", 0);
        int optTraceConfigParamInt2 = config.optTraceConfigParamInt(i, "provider.system_counters.sampling_rate_ms", 0);
        int optTraceConfigParamInt3 = config.optTraceConfigParamInt(i, "provider.high_freq_main_thread_counters.sampling_rate_ms", 0);
        int optTraceConfigParamInt4 = config.optTraceConfigParamInt(i, "provider.qpl.point_max_level", 0);
        TreeMap treeMap = new TreeMap();
        if (optTraceConfigParamInt > 0) {
            treeMap.put("provider.stack_trace.cpu_sampling_rate_ms", Integer.valueOf(optTraceConfigParamInt));
        }
        if (optTraceConfigParamInt2 > 0) {
            treeMap.put("provider.system_counters.sampling_rate_ms", Integer.valueOf(optTraceConfigParamInt2));
        }
        if (optTraceConfigParamInt3 > 0) {
            treeMap.put("provider.high_freq_main_thread_counters.sampling_rate_ms", Integer.valueOf(optTraceConfigParamInt3));
        }
        if (optTraceConfigParamInt4 > 0) {
            treeMap.put("provider.qpl.point_max_level", Integer.valueOf(optTraceConfigParamInt4));
        }
        int optTraceConfigParamInt5 = config.optTraceConfigParamInt(i, "trace_config.trace_timeout_ms", i2);
        if (optTraceConfigParamInt5 > 0) {
            treeMap.put("trace_config.trace_timeout_ms", Integer.valueOf(optTraceConfigParamInt5));
        }
        treeMap.put("trace_config.logger_priority", Integer.valueOf(config.optTraceConfigParamInt(i, "trace_config.logger_priority", 5)));
        treeMap.put("trace_config.post_trace_extension_ms", Integer.valueOf(config.optTraceConfigParamInt(i, "trace_config.post_trace_extension_ms", 0)));
        treeMap.put("provider.stack_trace.thread_detect_interval_ms", Integer.valueOf(config.optTraceConfigParamInt(i, "provider.stack_trace.thread_detect_interval_ms", 0)));
        int optTraceConfigParamInt6 = config.optTraceConfigParamInt(i, "provider.native_memory_allocation.small_allocation_sample_rate", 0);
        if (optTraceConfigParamInt6 > 0) {
            treeMap.put("provider.native_memory_allocation.small_allocation_sample_rate", Integer.valueOf(optTraceConfigParamInt6));
        }
        int optTraceConfigParamInt7 = config.optTraceConfigParamInt(i, "provider.native_memory_allocation.big_allocation_sample_rate", 0);
        if (optTraceConfigParamInt7 > 0) {
            treeMap.put("provider.native_memory_allocation.big_allocation_sample_rate", Integer.valueOf(optTraceConfigParamInt7));
        }
        int optTraceConfigParamInt8 = config.optTraceConfigParamInt(i, "provider.native_memory_allocation.unwinder_type", 0);
        if (optTraceConfigParamInt8 > 0) {
            treeMap.put("provider.native_memory_allocation.unwinder_type", Integer.valueOf(optTraceConfigParamInt8));
        }
        int optTraceConfigParamInt9 = config.optTraceConfigParamInt(i, "provider.native_memory_allocation.max_unwind_depth", 0);
        if (optTraceConfigParamInt9 > 0) {
            treeMap.put("provider.native_memory_allocation.max_unwind_depth", Integer.valueOf(optTraceConfigParamInt9));
        }
        int optTraceConfigParamInt10 = config.optTraceConfigParamInt(i, "provider.native_memory_allocation.allocation_tracker_buffer_size", 0);
        if (optTraceConfigParamInt10 > 0) {
            treeMap.put("provider.native_memory_allocation.allocation_tracker_buffer_size", Integer.valueOf(optTraceConfigParamInt10));
        }
        int optTraceConfigParamInt11 = config.optTraceConfigParamInt(i, "provider.native_memory_allocation.big_allocation_threshold", 0);
        if (optTraceConfigParamInt11 > 0) {
            treeMap.put("provider.native_memory_allocation.big_allocation_threshold", Integer.valueOf(optTraceConfigParamInt11));
        }
        return treeMap;
    }

    public final AnonymousClass0GE AIa(int i) {
        if (i == C09600bg.A01 || i == C09600bg.A02) {
            return this.A03;
        }
        if (i == C09590bf.A01) {
            return this.A02;
        }
        if (i == C09570bd.A01) {
            return this.A01;
        }
        return null;
    }

    public final int AYI() {
        return this.A00;
    }

    public C09420bN(C09320bD r1, C09290bA r2, AnonymousClass0b9 r3, int i) {
        this.A03 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = i;
    }
}
