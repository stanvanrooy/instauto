package p000X;

import android.content.Context;

/* renamed from: X.1rQ  reason: invalid class name and case insensitive filesystem */
public final class C42051rQ {
    public static Boolean A00;
    public static Boolean A01;
    public static Boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r1.getPackageManager().hasSystemFeature("android.hardware.type.watch") == false) goto L_0x0017;
     */
    public static boolean A00(Context context) {
        boolean z;
        if (A02 == null) {
            if (C42061rR.A00()) {
                z = true;
            }
            z = false;
            A02 = Boolean.valueOf(z);
        }
        return A02.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r1.getPackageManager().hasSystemFeature("cn.google") == false) goto L_0x0023;
     */
    public static boolean A01(Context context) {
        boolean z;
        if (!A00(context)) {
            return false;
        }
        if (!C42061rR.A02()) {
            return true;
        }
        if (A00 == null) {
            if (C42061rR.A01()) {
                z = true;
            }
            z = false;
            A00 = Boolean.valueOf(z);
        }
        if (!A00.booleanValue() || C42061rR.A03()) {
            return false;
        }
        return true;
    }
}
