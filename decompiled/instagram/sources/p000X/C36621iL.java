package p000X;

import android.os.Build;
import com.facebook.p002ui.emoji.model.Emoji;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1iL  reason: invalid class name and case insensitive filesystem */
public final class C36621iL {
    public static boolean A00() {
        if (Build.VERSION.SDK_INT >= 24 || AnonymousClass19g.A02()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r2 > 127999) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (p000X.AnonymousClass19g.A02() != false) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    public static boolean A01(C30941Vv r5) {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT < 24) {
            z = false;
        }
        z = true;
        if (z) {
            String str = r5.A02;
            int[] iArr = (int[]) Emoji.A01.A2N();
            if (iArr == null) {
                iArr = new int[11];
            }
            int length = str.length();
            int i = 0;
            int i2 = 0;
            while (i < length && i2 < iArr.length) {
                int codePointAt = Character.codePointAt(str, i);
                iArr[i2] = codePointAt;
                i2++;
                i += Character.charCount(codePointAt);
            }
            boolean z3 = true;
            if (i2 > 1) {
                int i3 = iArr[1];
                if (i3 >= 127995) {
                    z2 = true;
                }
                z2 = false;
                if (z2) {
                    Emoji.A01.BaL(iArr);
                    if (z3) {
                        return false;
                    }
                    return true;
                }
            }
            int A00 = C67612xY.A00(iArr, i2);
            Emoji.A01.BaL(iArr);
            if (A00 < 0) {
                z3 = false;
            }
            if (z3) {
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r2 > 127999) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052 A[LOOP:1: B:18:0x0050->B:19:0x0052, LOOP_END] */
    public static C30941Vv[] A02(C30941Vv r6) {
        List unmodifiableList;
        int size;
        int i;
        boolean z;
        String str = r6.A02;
        int[] iArr = (int[]) Emoji.A01.A2N();
        if (iArr == null) {
            iArr = new int[11];
        }
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length && i3 < iArr.length) {
            int codePointAt = Character.codePointAt(str, i2);
            iArr[i3] = codePointAt;
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        if (i3 > 1) {
            int i4 = iArr[1];
            if (i4 >= 127995) {
                z = true;
            }
            z = false;
            if (z) {
                unmodifiableList = new ArrayList();
                C67612xY.A01(unmodifiableList, iArr, i3);
                Emoji.A01.BaL(iArr);
                size = unmodifiableList.size();
                C30941Vv[] r4 = new C30941Vv[size];
                for (i = 0; i < size; i++) {
                    r4[i] = new C30941Vv(((Emoji) unmodifiableList.get(i)).A00(), -1);
                }
                return r4;
            }
        }
        int A00 = C67612xY.A00(iArr, i3);
        if (A00 < 0) {
            Emoji.A01.BaL(iArr);
            unmodifiableList = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            C67612xY.A01(arrayList, iArr, A00);
            Emoji.A01.BaL(iArr);
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        size = unmodifiableList.size();
        C30941Vv[] r42 = new C30941Vv[size];
        while (i < size) {
        }
        return r42;
    }
}
