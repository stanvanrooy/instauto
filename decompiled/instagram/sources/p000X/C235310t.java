package p000X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: X.10t  reason: invalid class name and case insensitive filesystem */
public final class C235310t {
    public static Boolean A00;
    public static final String[] A01 = {"SM-G388F", "SM-J100F", "SM-J100FN", "SM-J100M", "SM-J100MU", "SM-J100Y", "SM-J110F", "SM-J110G", "SM-T239", "SM-T239M"};
    public static final String[] A02 = {"SM-G361F", "SM-G388F", "SM-G531F", "SM-G531M", "SM-G531Y", "SM-J110M", "SM-J700M"};

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (p000X.C06110Nu.A00(r4) != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (r1 != false) goto L_0x0051;
     */
    public static boolean A00(Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        String[] strArr;
        if (A00 == null) {
            if (C05770Lw.A00().A00.getBoolean("camera_enable_ar_engine", true)) {
                int A002 = C12300gW.A00(context);
                boolean z4 = true;
                if (A002 >= 2008 && A002 < 2010) {
                    z4 = false;
                }
                if (z4) {
                    z2 = true;
                }
                z2 = false;
                if (z2) {
                    String str = Build.VERSION.RELEASE;
                    if (str.equals("5.1.1")) {
                        strArr = A02;
                    } else {
                        if (str.equals("4.4.4")) {
                            strArr = A01;
                        }
                        z3 = false;
                        z = true;
                    }
                    String str2 = Build.MODEL;
                    if (!TextUtils.isEmpty(str2)) {
                        int length = strArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (str2.equalsIgnoreCase(strArr[i])) {
                                z3 = true;
                                break;
                            } else {
                                i++;
                            }
                        }
                        z = true;
                    }
                    z3 = false;
                    z = true;
                }
            }
            z = false;
            A00 = Boolean.valueOf(z);
        }
        return A00.booleanValue();
    }
}
