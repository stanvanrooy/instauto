package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* renamed from: X.0Ds  reason: invalid class name and case insensitive filesystem */
public final class C04380Ds {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "add_mem_info";
            case 2:
                return "anr_data";
            case 3:
                return "app_info";
            case 4:
                return "app_state";
            case 5:
                return "app_config_info";
            case 6:
                return "custom";
            case 7:
                return "device_info";
            case 8:
                return "extra_device_info";
            case 9:
                return "disk_info";
            case 10:
                return "global_app_state";
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                return "logcat";
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                return "lmk_info";
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                return "memory";
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                return "mem_class_info";
            case 15:
                return "nightwatch";
            case 16:
                return "oom_score";
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                return "private_dirty_memory";
            case 18:
                return "runtime_permissions";
            case 19:
                return "screenshot";
            case 20:
                return "stack_traces";
            case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                return "time_info";
            case C120125Dh.NUM_VIEW_TYPES /*22*/:
                return "user_info";
            case 23:
                return "simple_memory";
            case 24:
                return "system_boot";
            case 25:
                return "system_health_stats";
            case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                return "watermark";
            case 27:
                return "test_collector";
            case 28:
                return "lacrima_files";
            default:
                return "all_app_mem_info";
        }
    }
}
