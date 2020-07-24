package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1x8  reason: invalid class name and case insensitive filesystem */
public abstract class C45011x8 implements C12450gl {
    public static final int[] A01 = new int[0];
    public final C12290gV A00;

    public void A00(int i, List list) {
    }

    public void A01(int i, List list) {
    }

    public int[] AGt(C51762Ma r6) {
        if (r6 != null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            if (r6.A02 == 2) {
                A01(r6.A03, arrayList);
            } else {
                A00(r6.A03, arrayList);
            }
            if (!arrayList.isEmpty()) {
                int[] iArr = new int[arrayList.size()];
                int i = 0;
                for (Integer intValue : arrayList) {
                    iArr[i] = intValue.intValue();
                    i++;
                }
                return iArr;
            }
        }
        return A01;
    }

    public C45011x8(C12290gV r1) {
        this.A00 = r1;
    }
}
