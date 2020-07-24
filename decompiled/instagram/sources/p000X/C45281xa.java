package p000X;

import android.os.Build;

/* renamed from: X.1xa  reason: invalid class name and case insensitive filesystem */
public final class C45281xa {
    public static volatile Integer A00;

    public static int A00() {
        int i;
        if (A00 == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                int[] A002 = C179837m6.A00("(RenderThread)");
                if (A002 == null || A002.length != 1) {
                    i = -1;
                } else {
                    i = A002[0];
                }
            } else {
                i = 0;
            }
            A00 = Integer.valueOf(i);
        }
        return A00.intValue();
    }
}
