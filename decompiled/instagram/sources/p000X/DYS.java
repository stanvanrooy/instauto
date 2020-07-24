package p000X;

import java.util.ArrayList;

/* renamed from: X.DYS */
public final class DYS {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static DYT parseFromJson(C13080hr r4) {
        DYT dyt = new DYT();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("attitude_time_delay".equals(A0i)) {
                dyt.A00 = r4.A0H();
            } else {
                ? r3 = 0;
                if ("camera_device_type".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    dyt.A07 = r3;
                } else if ("camera_distortion_1".equals(A0i)) {
                    dyt.A01 = r4.A0H();
                } else if ("camera_distortion_2".equals(A0i)) {
                    dyt.A02 = r4.A0H();
                } else if ("camera_focal_length".equals(A0i)) {
                    dyt.A03 = r4.A0H();
                } else if ("camera_imu_from_camera_rotation".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            Double valueOf = Double.valueOf(r4.A0H());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                        r3 = arrayList;
                    }
                    dyt.A09 = r3;
                } else if ("camera_imu_from_camera_translation".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList2 = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            Double valueOf2 = Double.valueOf(r4.A0H());
                            if (valueOf2 != null) {
                                arrayList2.add(valueOf2);
                            }
                        }
                        r3 = arrayList2;
                    }
                    dyt.A0A = r3;
                } else if ("camera_principal_point_x".equals(A0i)) {
                    dyt.A04 = r4.A0H();
                } else if ("camera_principal_point_y".equals(A0i)) {
                    dyt.A05 = r4.A0H();
                } else if ("id".equals(A0i)) {
                    dyt.A06 = r4.A0J();
                } else if ("slam_capable".equals(A0i)) {
                    dyt.A0B = r4.A0O();
                } else if ("slam_configuration_params".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    dyt.A08 = r3;
                } else if ("vision_only_slam".equals(A0i)) {
                    dyt.A0C = r4.A0O();
                }
            }
            r4.A0f();
        }
        return dyt;
    }
}
