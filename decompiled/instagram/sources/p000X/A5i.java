package p000X;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.A5i */
public final class A5i extends A5e {
    public RectF A00;
    public List A01;

    public A5i(C23043A0y a0y) {
        super(a0y);
        RectF rectF;
        List arrayList;
        float[] A012;
        if (!a0y.hasKey("clipping") || (A012 = C23080A5o.A01(a0y.getArray("clipping"))) == null) {
            rectF = null;
        } else if (A012.length == 4) {
            float f = A012[0];
            float f2 = A012[1];
            rectF = new RectF(f, f2, f + A012[2], A012[3] + f2);
        } else {
            throw new A0k("Clipping should be array of length 4 (e.g. [x, y, width, height])");
        }
        this.A00 = rectF;
        if (a0y.hasKey("elements")) {
            arrayList = A5e.A01(a0y.getArray("elements"));
        } else {
            arrayList = new ArrayList();
        }
        this.A01 = arrayList;
    }
}
