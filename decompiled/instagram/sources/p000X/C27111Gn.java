package p000X;

import android.os.Build;

/* renamed from: X.1Gn  reason: invalid class name and case insensitive filesystem */
public final class C27111Gn {
    public static boolean A00(AnonymousClass0C1 r7) {
        boolean z;
        AnonymousClass0L7 r2;
        String str;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        Class<C85463nQ> cls = C85463nQ.class;
        C85463nQ r4 = (C85463nQ) r7.AV9(cls);
        if (r4 == null) {
            if (!((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.CAMERA_ANDROID_ASPECT_RATIO_9_16_LAUNCHER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() || !A01(r7)) {
                z = false;
            } else {
                float A07 = ((float) C06220Of.A07(StoredPreferences.A00)) / ((float) C06220Of.A06(StoredPreferences.A00));
                if (A07 == 0.5625f) {
                    r2 = AnonymousClass0L7.CAMERA_ANDROID_ASPECT_RATIO_9_16_LAUNCHER;
                    str = "is_enabled_for_9_16_devices";
                } else if (A07 < 0.5625f) {
                    r2 = AnonymousClass0L7.CAMERA_ANDROID_ASPECT_RATIO_9_16_LAUNCHER;
                    str = "is_enabled_for_tall_devices";
                } else {
                    AnonymousClass0QD.A01("CameraAspectRatioQeUtil", String.format("Device aspect ratio is wider than 9:16, screen size %dx%d", new Object[]{Integer.valueOf(C06220Of.A07(StoredPreferences.A00)), Integer.valueOf(C06220Of.A06(StoredPreferences.A00))}));
                    r2 = AnonymousClass0L7.CAMERA_ANDROID_ASPECT_RATIO_9_16_LAUNCHER;
                    str = "is_enabled_for_short_devices";
                }
                z = ((Boolean) AnonymousClass0L6.A02(r7, r2, str, false, (AnonymousClass04H) null)).booleanValue();
            }
            r4 = new C85463nQ(z);
            r7.BYi(cls, r4);
        }
        return r4.A00;
    }

    public static boolean A01(AnonymousClass0C1 r4) {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        }
        if (!z || !((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.CAMERA_ANDROID_ASPECT_RATIO_9_16_LAUNCHER, "is_layout_hide_navigation_flag_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return false;
        }
        return true;
    }
}
