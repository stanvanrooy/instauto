package p000X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.A60 */
public final class A60 {
    public int A00 = 0;
    public int[] A01;
    public final ViewGroup A02;

    public final int A00(int i, int i2) {
        if (this.A01 == null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(this.A02.getChildAt(i3));
            }
            Collections.sort(arrayList, new A69(this));
            this.A01 = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                this.A01[i4] = this.A02.indexOfChild((View) arrayList.get(i4));
            }
        }
        return this.A01[i2];
    }

    public A60(ViewGroup viewGroup) {
        this.A02 = viewGroup;
    }
}
