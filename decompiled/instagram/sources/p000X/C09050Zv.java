package p000X;

import java.util.Locale;

/* renamed from: X.0Zv  reason: invalid class name and case insensitive filesystem */
public final class C09050Zv {
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r2 >= 13) goto L_0x0010;
     */
    public static String A01(int i) {
        boolean z;
        if (i == -2) {
            return "MODULE_NAME_NON_MODULAR_BUILD";
        }
        if (i == -1) {
            return "MODULE_NAME_ROOT";
        }
        if (i >= 0) {
            z = true;
        }
        z = false;
        if (z) {
            return AnonymousClass0ZV.A02(i);
        }
        return "MODULE_NAME_ERROR";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r2 >= 13) goto L_0x000f;
     */
    public static int A00(String str) {
        boolean z;
        if (str == null) {
            return -1;
        }
        int A00 = AnonymousClass0ZV.A00(str);
        if (A00 >= 0) {
            z = true;
        }
        z = false;
        if (!z) {
            return -3;
        }
        return A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r5 >= 13) goto L_0x0007;
     */
    public static boolean A02(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        }
        z = false;
        if (!z) {
            AnonymousClass0DB.A0F("AppModuleIndexUtil", String.format(Locale.US, "Checking index for %s (%d)", new Object[]{A01(i), Integer.valueOf(i)}));
        }
        return z;
    }
}
