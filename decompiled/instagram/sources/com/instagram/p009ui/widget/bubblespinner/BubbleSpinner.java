package com.instagram.p009ui.widget.bubblespinner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.Constants;
import p000X.AnonymousClass1EM;
import p000X.C85443nN;
import p000X.C85453nO;

/* renamed from: com.instagram.ui.widget.bubblespinner.BubbleSpinner */
public class BubbleSpinner extends View {
    public static final int[] A0D = {-4652876, -2947736, -652286, -155365, -367087, -649981, -652286, -2947736, -4652876};
    public static final float[] A0E = {BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.2f, 0.4f, 0.6f, 0.8f, 1.0f, 0.8f, 0.6f, 0.4f, 0.2f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER};
    public static final float[] A0F = {0.7f, 0.75f, 0.8f, 0.85f, 0.9f, 0.95f, 1.0f};
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;
    public C85443nN[] A07;
    public long A08;
    public Paint A09;
    public C85453nO A0A;
    public float[] A0B;
    public int[] A0C;

    private void A00() {
        if (this.A04.intValue() != 1) {
            this.A0C = new int[]{this.A01};
        } else {
            this.A0C = A0D;
            this.A0B = A0F;
        }
        int i = this.A02;
        this.A07 = new C85443nN[i];
        int max = Math.max(i / this.A0C.length, 1);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.A02; i4++) {
            if (i2 >= max) {
                int i5 = 0;
                if (i3 < this.A0C.length - 1) {
                    i5 = i3 + 1;
                }
                i3 = i5;
                i2 = 0;
            }
            Paint paint = new Paint();
            this.A09 = paint;
            paint.setColor(this.A0C[i3]);
            this.A07[i4] = new C85443nN(this.A00, this.A09);
            i2++;
        }
    }

    public final void onDraw(Canvas canvas) {
        if (this.A0A == C85453nO.LOADING) {
            if (!this.A06) {
                int width = canvas.getWidth() >> 1;
                float height = (float) canvas.getHeight();
                float f = 0.416f;
                if (this.A05) {
                    f = 0.5f;
                }
                int i = (int) (height * f);
                C85443nN[] r6 = this.A07;
                float length = (float) (6.283185307179586d / ((double) r6.length));
                float f2 = ((float) ((int) (((float) width) * 0.875f))) + r6[0].A00;
                for (int i2 = 0; i2 < this.A02; i2++) {
                    double d = (double) (((float) i2) * length);
                    double d2 = (double) f2;
                    int cos = (int) (((double) width) + (Math.cos(d) * d2));
                    int sin = (int) (((double) i) + (Math.sin(d) * d2));
                    C85443nN r0 = r6[i2];
                    r0.A01 = cos;
                    r0.A02 = sin;
                }
                this.A06 = true;
            }
            int pivotIndex = getPivotIndex();
            int i3 = pivotIndex;
            while (true) {
                float[] fArr = this.A0B;
                if (i3 < fArr.length + pivotIndex) {
                    int i4 = this.A02;
                    int i5 = i3 - i4;
                    if (i3 < i4) {
                        i5 = i3;
                    }
                    C85443nN r4 = this.A07[i5];
                    canvas.drawCircle((float) r4.A01, (float) r4.A02, (float) ((int) (r4.A00 * fArr[i3 - pivotIndex])), r4.A03);
                    i3++;
                } else {
                    invalidate();
                    return;
                }
            }
        }
    }

    public void setBubbleRadius(float f) {
        this.A00 = f;
        A00();
    }

    public void setLoadingStatus(C85453nO r4) {
        if (this.A0A != r4) {
            switch (r4.ordinal()) {
                case 0:
                    this.A06 = false;
                    this.A0A = C85453nO.LOADING;
                    this.A08 = SystemClock.elapsedRealtime();
                    setVisibility(0);
                    invalidate();
                    return;
                case 1:
                    this.A0A = C85453nO.DONE;
                    setVisibility(8);
                    return;
                default:
                    return;
            }
        }
    }

    private int getPivotIndex() {
        long j = this.A03;
        return (int) ((((float) ((SystemClock.elapsedRealtime() - this.A08) % j)) / ((float) j)) * ((float) this.A02));
    }

    public BubbleSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public BubbleSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BubbleSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = Constants.ZERO;
        this.A0B = A0E;
        this.A02 = 40;
        this.A03 = 1000;
        TypedArray typedArray = null;
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0S, 0, i);
            this.A02 = typedArray.getInteger(5, 40);
            this.A00 = typedArray.getFloat(1, 12.0f);
            this.A03 = (long) typedArray.getInteger(4, 1000);
            this.A05 = typedArray.getBoolean(3, true);
            this.A04 = Constants.ZERO(2)[typedArray.getInteger(2, 0)];
            this.A01 = typedArray.getColor(0, -1);
            typedArray.recycle();
            A00();
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }
}
