package p000X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.1wo  reason: invalid class name and case insensitive filesystem */
public final class C44821wo {
    public static Boolean A00;

    public static boolean A00() {
        if (!Build.MANUFACTURER.toUpperCase().contains("SAMSUNG") || !Build.MODEL.toUpperCase().startsWith("SM-G9")) {
            return false;
        }
        return true;
    }

    public static boolean A01() {
        if (!Build.MANUFACTURER.toUpperCase().contains("SAMSUNG") || !Build.MODEL.toUpperCase().startsWith("SM-G97")) {
            return false;
        }
        return true;
    }

    public static boolean A02() {
        if (!Build.MANUFACTURER.toUpperCase().contains("SAMSUNG") || !Build.MODEL.toUpperCase().startsWith("SM-G95")) {
            return false;
        }
        return true;
    }

    public static boolean A03() {
        if (!Build.MANUFACTURER.toUpperCase().contains("SAMSUNG") || !Build.MODEL.toUpperCase().startsWith("SM-G96")) {
            return false;
        }
        return true;
    }

    public static boolean A04() {
        if (!Build.MANUFACTURER.toUpperCase().contains("SAMSUNG") || !Build.MODEL.toUpperCase().startsWith("SM-N97")) {
            return false;
        }
        return true;
    }

    public static boolean A05(AnonymousClass0C1 r4) {
        return ((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.OPTIC_FACE_DETECTION, "enable_front", false, (AnonymousClass04H) null)).booleanValue();
    }

    public static boolean A06(AnonymousClass0C1 r4) {
        return ((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.OPTIC_FACE_DETECTION, "enable_rear", false, (AnonymousClass04H) null)).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (p000X.AnonymousClass113.A00(r5) == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r4, p000X.AnonymousClass0L7.CAMERACORE_ANDROID_NEW_OPTIC_CAMERA2, "use_new_optic_if_camera1", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0039;
     */
    public static boolean A07(AnonymousClass0C1 r4, Context context) {
        boolean z;
        boolean z2;
        if (!((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.OPTIC_NEW_ARCHITECTURE, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            if (C235310t.A00(context)) {
                z = true;
            }
            z = false;
            if (z) {
                z2 = true;
            }
            z2 = false;
            if (z2 || A08(r4, context)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (android.os.Build.MODEL.toUpperCase().startsWith("SM-G93") == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        if (android.os.Build.MODEL.toUpperCase().startsWith("SM-G98") == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (p000X.AnonymousClass113.A00(r5) == false) goto L_0x0016;
     */
    public static boolean A08(AnonymousClass0C1 r4, Context context) {
        boolean z;
        boolean z2;
        AnonymousClass0L7 r3;
        boolean z3;
        AnonymousClass0L7 r32;
        boolean z4;
        String str;
        Boolean bool = A00;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C235310t.A00(context)) {
            z = true;
        }
        z = false;
        if (!z) {
            A00 = false;
        } else {
            if (Build.MANUFACTURER.toUpperCase().contains("SAMSUNG")) {
                z2 = true;
            }
            z2 = false;
            if (z2) {
                r3 = AnonymousClass0L7.CAMERACORE_ANDROID_CAMERA2_GALAXY_S7;
            } else if (A02()) {
                r3 = AnonymousClass0L7.CAMERACORE_ANDROID_CAMERA2_GALAXY_S8;
            } else if (A03()) {
                r3 = AnonymousClass0L7.CAMERACORE_ANDROID_CAMERA2_GALAXY_S9;
            } else if (A01() || A04()) {
                r3 = AnonymousClass0L7.CAMERACORE_ANDROID_CAMERA2_GALAXY_S10;
            } else {
                if (Build.MANUFACTURER.toUpperCase().contains("SAMSUNG")) {
                    z3 = true;
                }
                z3 = false;
                if (z3) {
                    r3 = AnonymousClass0L7.CAMERACORE_ANDROID_CAMERA2_GALAXY_S20;
                } else {
                    if (A00()) {
                        r32 = AnonymousClass0L7.CAMERACORE_ANDROID_NEW_OPTIC_CAMERA2_GALAXY;
                    } else {
                        r32 = AnonymousClass0L7.CAMERACORE_ANDROID_NEW_OPTIC_CAMERA2;
                    }
                    z4 = false;
                    str = "use_camera2";
                    A00 = (Boolean) AnonymousClass0L6.A02(r4, r32, str, z4, (AnonymousClass04H) null);
                }
            }
            z4 = false;
            str = "enabled";
            A00 = (Boolean) AnonymousClass0L6.A02(r4, r32, str, z4, (AnonymousClass04H) null);
        }
        boolean booleanValue = A00.booleanValue();
        C72333Et.A02 = booleanValue;
        return booleanValue;
    }
}
