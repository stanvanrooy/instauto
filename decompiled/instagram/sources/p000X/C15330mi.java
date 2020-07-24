package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* renamed from: X.0mi  reason: invalid class name and case insensitive filesystem */
public final class C15330mi {
    public static AnonymousClass0IT A00;
    public static SharedPreferences A01;
    public static Integer A02;

    public static SharedPreferences A00() {
        if (A01 == null) {
            A01 = C05750Lu.A00("ig_device_theme");
        }
        return A01;
    }

    public static void A01(Context context) {
        AnonymousClass0IT r0;
        if (A02 == null && (r0 = A00) != null) {
            A02 = (Integer) r0.get();
        }
        if (A02 != null) {
            context.getTheme().applyStyle(A02.intValue(), true);
        }
    }

    public static boolean A03(boolean z) {
        AnonymousClass0L7 r2;
        boolean z2;
        String str;
        Object A012;
        AnonymousClass0L7 r22;
        boolean z3;
        String str2;
        if (z) {
            int i = Build.VERSION.SDK_INT;
            if (i > 28) {
                r22 = AnonymousClass0L7.BLACK_OUT_TOGGLE;
                z3 = false;
                str2 = "is_enabled_q_plus";
            } else if (i == 28) {
                r22 = AnonymousClass0L7.BLACK_OUT_TOGGLE;
                z3 = false;
                str2 = "is_enabled_pie";
            } else if (i == 26 || i == 27) {
                r22 = AnonymousClass0L7.BLACK_OUT_TOGGLE;
                z3 = false;
                str2 = "is_enabled_oreo";
            } else {
                r22 = AnonymousClass0L7.BLACK_OUT_TOGGLE;
                z3 = false;
                str2 = "is_enabled";
            }
            A012 = C05640Lj.A00(r22, str2, z3);
        } else {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 > 28) {
                r2 = AnonymousClass0L7.BLACK_OUT_TOGGLE;
                z2 = false;
                str = "is_enabled_q_plus";
            } else if (i2 == 28) {
                r2 = AnonymousClass0L7.BLACK_OUT_TOGGLE;
                z2 = false;
                str = "is_enabled_pie";
            } else if (i2 == 26 || i2 == 27) {
                r2 = AnonymousClass0L7.BLACK_OUT_TOGGLE;
                z2 = false;
                str = "is_enabled_oreo";
            } else {
                r2 = AnonymousClass0L7.BLACK_OUT_TOGGLE;
                z2 = false;
                str = "is_enabled";
            }
            A012 = C05640Lj.A01(r2, str, z2);
        }
        return ((Boolean) A012).booleanValue();
    }

    public static void A02(Context context, int i) {
        A01(context);
        C11130eT r0 = C11130eT.A01;
        C11150eV.A00(r0.A00, new AnonymousClass1BB(context));
        A00().edit().putInt("KEY_CONFIG_UI_MODE", i).apply();
    }
}
