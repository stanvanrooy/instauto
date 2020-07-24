package p000X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.List;

/* renamed from: X.DCZ */
public final class DCZ extends C29841DDc {
    public float A00;
    public float A01;
    public final Matrix A02;
    public final Paint A03;

    public static Bitmap A00(DCZ dcz) {
        List list;
        C29840DDb dDb = dcz.A0B;
        int i = dcz.A04.A0H;
        C29866DEb dEb = dDb.A0C.A01;
        if (dEb == null || (list = dEb.A00) == null) {
            throw new IllegalArgumentException("no assets/bitmaps in the document");
        }
        C29023Cqb cqb = (C29023Cqb) list.get(i);
        if (cqb == null) {
            return null;
        }
        return cqb.A00;
    }

    public DCZ(C29840DDb dDb, C29846DDh dDh) {
        super(dDb, dDh);
        List list;
        int i = dDh.A0H;
        C29866DEb dEb = dDb.A0C.A01;
        if (dEb == null || (list = dEb.A00) == null) {
            throw new IllegalArgumentException("no assets/bitmaps in the document");
        }
        C29023Cqb cqb = (C29023Cqb) list.get(i);
        if (cqb != null) {
            this.A00 = cqb.A01.A01 / ((float) cqb.A00.getWidth());
            this.A01 = cqb.A01.A00 / ((float) cqb.A00.getHeight());
            Matrix matrix = new Matrix();
            this.A02 = matrix;
            matrix.preScale(this.A00, this.A01);
            this.A03 = new Paint(1);
            return;
        }
        throw new IllegalArgumentException("bitmap model not found");
    }

    public final void A04() {
        super.A04();
        this.A02.reset();
        Matrix matrix = this.A02;
        float f = this.A00;
        float f2 = this.A0B.A00;
        matrix.preScale(f * f2, this.A01 * f2);
    }
}
