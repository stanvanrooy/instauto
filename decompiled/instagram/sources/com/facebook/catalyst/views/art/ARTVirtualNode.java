package com.facebook.catalyst.views.art;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import p000X.A0k;
import p000X.A1e;
import p000X.AnonymousClass951;
import p000X.C23043A0y;
import p000X.C23080A5o;

public abstract class ARTVirtualNode extends ReactShadowNodeImpl {
    public static final float[] A03 = new float[9];
    public static final float[] A04 = new float[9];
    public float A00 = 1.0f;
    public Matrix A01 = new Matrix();
    public final float A02 = AnonymousClass951.A01.density;

    public void A0D(Canvas canvas, Paint paint, float f) {
        A1e array;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        if (!(this instanceof ARTShapeShadowNode)) {
            ARTGroupShadowNode aRTGroupShadowNode = (ARTGroupShadowNode) this;
            float f2 = f * aRTGroupShadowNode.A00;
            if (f2 > 0.01f) {
                canvas2.save();
                Matrix matrix = aRTGroupShadowNode.A01;
                if (matrix != null) {
                    canvas2.concat(matrix);
                }
                RectF rectF = aRTGroupShadowNode.A00;
                if (rectF != null) {
                    float f3 = rectF.left;
                    float f4 = aRTGroupShadowNode.A02;
                    canvas2.clipRect(f3 * f4, rectF.top * f4, rectF.right * f4, rectF.bottom * f4);
                }
                for (int i = 0; i < aRTGroupShadowNode.AI5(); i++) {
                    ARTVirtualNode aRTVirtualNode = (ARTVirtualNode) aRTGroupShadowNode.AI2(i);
                    aRTVirtualNode.A0D(canvas2, paint2, f2);
                    aRTVirtualNode.Aoh();
                }
                canvas2.restore();
                return;
            }
            return;
        }
        ARTShapeShadowNode aRTShapeShadowNode = (ARTShapeShadowNode) this;
        if (!(aRTShapeShadowNode instanceof ARTTextShadowNode)) {
            float f5 = f * aRTShapeShadowNode.A00;
            if (f5 > 0.01f) {
                canvas2.save();
                Matrix matrix2 = aRTShapeShadowNode.A01;
                if (matrix2 != null) {
                    canvas2.concat(matrix2);
                }
                if (aRTShapeShadowNode.A00 != null) {
                    if (aRTShapeShadowNode.A0E(paint2, f5)) {
                        canvas2.drawPath(aRTShapeShadowNode.A00, paint2);
                    }
                    if (aRTShapeShadowNode.A0F(paint2, f5)) {
                        canvas2.drawPath(aRTShapeShadowNode.A00, paint2);
                    }
                    canvas2.restore();
                } else {
                    throw new A0k("Shapes should have a valid path (d) prop");
                }
            }
            aRTShapeShadowNode.Aoh();
            return;
        }
        ARTTextShadowNode aRTTextShadowNode = (ARTTextShadowNode) aRTShapeShadowNode;
        C23043A0y a0y = aRTTextShadowNode.A01;
        if (a0y != null) {
            float f6 = f * aRTTextShadowNode.A00;
            if (f6 > 0.01f && a0y.hasKey("lines") && (array = aRTTextShadowNode.A01.getArray("lines")) != null && array.size() != 0) {
                canvas2.save();
                Matrix matrix3 = aRTTextShadowNode.A01;
                if (matrix3 != null) {
                    canvas2.concat(matrix3);
                }
                int size = array.size();
                String[] strArr = new String[size];
                for (int i2 = 0; i2 < size; i2++) {
                    strArr[i2] = array.getString(i2);
                }
                String join = TextUtils.join("\n", strArr);
                if (aRTTextShadowNode.A0F(paint2, f6)) {
                    ARTTextShadowNode.A00(aRTTextShadowNode, paint2);
                    Path path = aRTTextShadowNode.A00;
                    if (path == null) {
                        canvas2.drawText(join, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -paint2.ascent(), paint2);
                    } else {
                        canvas2.drawTextOnPath(join, path, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, paint2);
                    }
                }
                if (aRTTextShadowNode.A0E(paint2, f6)) {
                    ARTTextShadowNode.A00(aRTTextShadowNode, paint2);
                    Path path2 = aRTTextShadowNode.A00;
                    if (path2 == null) {
                        canvas2.drawText(join, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -paint2.ascent(), paint2);
                    } else {
                        canvas2.drawTextOnPath(join, path2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, paint2);
                    }
                }
                canvas2.restore();
                aRTTextShadowNode.Aoh();
            }
        }
    }

    @ReactProp(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(float f) {
        this.A00 = f;
        A06();
    }

    @ReactProp(name = "transform")
    public void setTransform(A1e a1e) {
        if (a1e != null) {
            int A002 = C23080A5o.A00(a1e, A03);
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
        } else {
            this.A01 = null;
        }
        A06();
    }
}
