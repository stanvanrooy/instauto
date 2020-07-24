package p000X;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* renamed from: X.1y4  reason: invalid class name and case insensitive filesystem */
public final class C45521y4 {
    public static int A00;
    public static File A01;
    public static Set A02;

    public static File A00(Context context, String str) {
        if (A01 == null) {
            File A012 = C15020mC.A01(context, "coverframe", false);
            A01 = A012;
            if (A012 != null && !A012.exists()) {
                A01.mkdirs();
            }
            if (A01 == null) {
                return null;
            }
        }
        return new File(A01.getAbsolutePath(), Integer.toHexString(str.hashCode()));
    }

    public static boolean A02(String str) {
        Set set = A02;
        if (set == null || !set.contains(Integer.toHexString(str.hashCode()))) {
            return false;
        }
        return true;
    }

    public static String A01(AnonymousClass1NJ r1, AnonymousClass0C1 r2) {
        if (r1.Agp()) {
            return r1.A29;
        }
        if (C30671Ut.A0A(r2, r1) != null) {
            return C30671Ut.A0A(r2, r1);
        }
        return r1.APo();
    }
}
