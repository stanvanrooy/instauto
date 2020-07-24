package p000X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.A5e */
public abstract class A5e {
    public static final float[] A03 = new float[9];
    public static final float[] A04 = new float[9];
    public float A00 = 1.0f;
    public Matrix A01 = new Matrix();
    public final float A02 = AnonymousClass951.A01.density;

    public void A02(Canvas canvas, Paint paint, float f) {
        A1e array;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        if (!(this instanceof A5f)) {
            A5i a5i = (A5i) this;
            float f2 = f * a5i.A00;
            if (f2 > 0.01f) {
                canvas2.save();
                Matrix matrix = a5i.A01;
                if (matrix != null) {
                    canvas2.concat(matrix);
                }
                RectF rectF = a5i.A00;
                if (rectF != null) {
                    float f3 = rectF.left;
                    float f4 = a5i.A02;
                    canvas2.clipRect(f3 * f4, rectF.top * f4, rectF.right * f4, rectF.bottom * f4);
                }
                for (int i = 0; i < a5i.A01.size(); i++) {
                    ((A5e) a5i.A01.get(i)).A02(canvas2, paint2, f2);
                }
            } else {
                return;
            }
        } else {
            A5f a5f = (A5f) this;
            if (!(a5f instanceof A5c)) {
                float f5 = f * a5f.A00;
                if (f5 > 0.01f) {
                    canvas2.save();
                    Matrix matrix2 = a5f.A01;
                    if (matrix2 != null) {
                        canvas2.concat(matrix2);
                    }
                    if (a5f.A03 != null) {
                        if (a5f.A03(paint2, f5)) {
                            canvas2.drawPath(a5f.A03, paint2);
                        }
                        if (a5f.A04(paint2, f5)) {
                            canvas2.drawPath(a5f.A03, paint2);
                        }
                    } else {
                        throw new A0k("Shapes should have a valid path (d) prop");
                    }
                } else {
                    return;
                }
            } else {
                A5c a5c = (A5c) a5f;
                C23043A0y a0y = a5c.A00;
                if (a0y != null) {
                    float f6 = f * a5c.A00;
                    if (f6 > 0.01f && a0y.hasKey("lines") && (array = a5c.A00.getArray("lines")) != null && array.size() != 0) {
                        canvas2.save();
                        Matrix matrix3 = a5c.A01;
                        if (matrix3 != null) {
                            canvas2.concat(matrix3);
                        }
                        int size = array.size();
                        String[] strArr = new String[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            strArr[i2] = array.getString(i2);
                        }
                        String join = TextUtils.join("\n", strArr);
                        if (a5c.A04(paint2, f6)) {
                            A5c.A00(a5c, paint2);
                            Path path = a5c.A03;
                            if (path == null) {
                                canvas2.drawText(join, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -paint2.ascent(), paint2);
                            } else {
                                canvas2.drawTextOnPath(join, path, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, paint2);
                            }
                        }
                        if (a5c.A03(paint2, f6)) {
                            A5c.A00(a5c, paint2);
                            Path path2 = a5c.A03;
                            if (path2 == null) {
                                canvas2.drawText(join, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -paint2.ascent(), paint2);
                            } else {
                                canvas2.drawTextOnPath(join, path2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, paint2);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        canvas2.restore();
    }

    public static List A01(A1e a1e) {
        Object a5i;
        ArrayList arrayList = new ArrayList();
        if (a1e != null) {
            for (int i = 0; i < a1e.size(); i++) {
                C23043A0y map = a1e.getMap(i);
                int i2 = -1;
                if (map.hasKey("type")) {
                    i2 = map.getInt("type");
                }
                if (i2 == 1) {
                    a5i = new A5i(map);
                } else if (i2 == 2) {
                    a5i = new A5f(map);
                } else if (i2 == 3) {
                    a5i = new A5c(map);
                } else {
                    throw new IllegalArgumentException("Unknown Type");
                }
                arrayList.add(a5i);
            }
        }
        return arrayList;
    }

    public A5e(C23043A0y a0y) {
        double d;
        if (a0y.hasKey("opacity")) {
            d = a0y.getDouble("opacity");
        } else {
            d = (double) 1.0f;
        }
        this.A00 = (float) d;
        A1e array = a0y.getArray("transform");
        if (array == null || array.size() <= 0) {
            this.A01 = null;
            return;
        }
        int A002 = C23080A5o.A00(array, A03);
        if (A002 == 6) {
            float[] fArr = A04;
            float[] fArr2 = A03;
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[2];
            float f = fArr2[4];
            float f2 = this.A02;
            fArr[2] = f * f2;
            fArr[3] = fArr2[1];
            fArr[4] = fArr2[3];
            fArr[5] = fArr2[5] * f2;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
            fArr[8] = 1.0f;
            if (this.A01 == null) {
                this.A01 = new Matrix();
            }
            this.A01.setValues(fArr);
        } else if (A002 != -1) {
            throw new A0k("Transform matrices must be of size 6");
        }
    }
}
