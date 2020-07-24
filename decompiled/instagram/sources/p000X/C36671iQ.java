package p000X;

import android.os.Build;
import java.util.Arrays;

/* renamed from: X.1iQ  reason: invalid class name and case insensitive filesystem */
public final class C36671iQ {
    public static final StringBuilder A00 = new StringBuilder();

    public static String A00(C30941Vv r7, int i) {
        int i2;
        String sb;
        int i3 = r7.A00;
        if (i3 < 0) {
            i2 = -1;
        } else {
            i2 = i3 / 6;
        }
        if (i2 < 0) {
            return null;
        }
        int i4 = i2 * 6;
        int min = Math.min(i4 + 6, C30941Vv.A04().length) - i4;
        String[] strArr = new String[min];
        for (int i5 = 0; i5 < min; i5++) {
            strArr[i5] = C30941Vv.A04()[i4 + i5].A02;
        }
        String A03 = C36681iR.A01(",").A03(Arrays.asList(strArr));
        StringBuilder sb2 = A00;
        synchronized (sb2) {
            sb2.setLength(0);
            sb2.append("emoji-sprite-sheet:/");
            sb2.append("emoji-sprite-sheet-api");
            sb2.append(Build.VERSION.SDK_INT);
            sb2.append("-");
            sb2.append(A03.hashCode());
            sb2.append("-dpi-");
            sb2.append(i);
            sb2.append("//");
            sb2.append(6);
            sb2.append("//");
            sb2.append(A03);
            sb = sb2.toString();
        }
        return sb;
    }
}
