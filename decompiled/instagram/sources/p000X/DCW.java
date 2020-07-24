package p000X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.List;

/* renamed from: X.DCW */
public final class DCW extends C29820DCe {
    public float A00;
    public float A01;
    public final Matrix A02;
    public final Paint A03;

    public static Bitmap A00(DCW dcw) {
        List list = dcw.A0L.A03.A05;
        if (list == null) {
            return null;
        }
        return ((C29817DCb) list.get(dcw.A0E.A07)).A00;
    }

    public DCW(DCV dcv, C29821DCf dCf) {
        super(dcv, dCf);
        List list = dcv.A03.A05;
        List list2 = list;
        if (list != null) {
            C29817DCb dCb = (C29817DCb) list2.get(this.A0E.A07);
            Bitmap bitmap = dCb.A00;
            if (bitmap != null) {
                this.A00 = dCb.A01.A01 / ((float) bitmap.getWidth());
                this.A01 = dCb.A01.A00 / ((float) dCb.A00.getHeight());
                Matrix matrix = new Matrix();
                this.A02 = matrix;
                matrix.preScale(this.A00, this.A01);
                this.A03 = new Paint(1);
                return;
            }
            throw new IllegalArgumentException("No bitmap found in model");
        }
        throw new IllegalArgumentException("No bitmap models found for BitmapLayer");
    }

    public final void A07(float f, float f2) {
        super.A07(f, f2);
        if (A00(this) != null) {
            this.A02.reset();
            this.A02.preScale(this.A00 * f, this.A01 * f2);
        }
    }
}
