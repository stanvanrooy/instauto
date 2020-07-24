package p000X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import com.facebook.react.uimanager.BaseViewManager;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.A7Y */
public final class A7Y implements Interpolator {
    public float[] A00;
    public float[] A01;

    public final float getInterpolation(float f) {
        if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        float[] fArr = this.A00;
        int length = fArr.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) >> 1;
            if (f < fArr[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return this.A01[i];
        }
        float[] fArr2 = this.A01;
        float f5 = fArr2[i];
        return f5 + (((f - f3) / f4) * (fArr2[length] - f5));
    }

    private void A00(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.A00 = new float[min];
            this.A01 = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.A00[i2] = fArr[0];
                this.A01[i2] = fArr[1];
            }
            float[] fArr2 = this.A00;
            float f = fArr2[0];
            if (((double) Math.abs(f)) <= 1.0E-5d) {
                float[] fArr3 = this.A01;
                if (((double) Math.abs(fArr3[0])) <= 1.0E-5d) {
                    int i3 = min - 1;
                    if (((double) Math.abs(fArr2[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(fArr3[i3] - 1.0f)) <= 1.0E-5d) {
                        int i4 = 0;
                        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                        while (i < min) {
                            int i5 = i4 + 1;
                            float f3 = fArr2[i4];
                            if (f3 >= f2) {
                                fArr2[i] = f3;
                                i++;
                                f2 = f3;
                                i4 = i5;
                            } else {
                                throw new IllegalArgumentException(AnonymousClass000.A04("The Path cannot loop back on itself, x :", f3));
                            }
                        }
                        if (pathMeasure.nextContour()) {
                            throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                        }
                        return;
                    }
                }
            }
            StringBuilder sb = new StringBuilder("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(f);
            sb.append(",");
            sb.append(this.A01[0]);
            sb.append(" end:");
            int i6 = min - 1;
            sb.append(this.A00[i6]);
            sb.append(",");
            sb.append(this.A01[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException(AnonymousClass000.A04("The Path has a invalid length ", length));
    }

    public A7Y(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray A02 = AnonymousClass21B.A02(context.getResources(), context.getTheme(), attributeSet, AnonymousClass21A.A06);
        if (AnonymousClass21B.A05(xmlPullParser, "pathData")) {
            String A04 = AnonymousClass21B.A04(A02, xmlPullParser, "pathData", 4);
            Path A002 = AnonymousClass21E.A00(A04);
            if (A002 != null) {
                A00(A002);
            } else {
                throw new InflateException(AnonymousClass000.A0E("The path is null, which is created from ", A04));
            }
        } else if (!AnonymousClass21B.A05(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (AnonymousClass21B.A05(xmlPullParser, "controlY1")) {
            float A003 = AnonymousClass21B.A00(A02, xmlPullParser, "controlX1", 0, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            float A004 = AnonymousClass21B.A00(A02, xmlPullParser, "controlY1", 1, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            boolean A05 = AnonymousClass21B.A05(xmlPullParser, "controlX2");
            if (A05 != AnonymousClass21B.A05(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!A05) {
                Path path = new Path();
                path.moveTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                path.quadTo(A003, A004, 1.0f, 1.0f);
                A00(path);
            } else {
                float A005 = AnonymousClass21B.A00(A02, xmlPullParser, "controlX2", 2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                float A006 = AnonymousClass21B.A00(A02, xmlPullParser, "controlY2", 3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                Path path2 = new Path();
                path2.moveTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                path2.cubicTo(A003, A004, A005, A006, 1.0f, 1.0f);
                A00(path2);
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        A02.recycle();
    }
}
