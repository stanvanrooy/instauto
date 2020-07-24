package p000X;

import android.graphics.Matrix;

/* renamed from: X.C5Q */
public final class C5Q extends ThreadLocal {
    public final Object initialValue() {
        return new Matrix();
    }

    public final /* bridge */ /* synthetic */ Object get() {
        Matrix matrix = (Matrix) super.get();
        if (matrix != null) {
            matrix.reset();
        }
        return matrix;
    }
}
