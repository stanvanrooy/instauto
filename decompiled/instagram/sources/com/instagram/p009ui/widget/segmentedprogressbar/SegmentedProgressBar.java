package com.instagram.p009ui.widget.segmentedprogressbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass9CX;
import p000X.C06220Of;
import p000X.C06400Ox;
import p000X.C1424066y;
import p000X.C212929Gf;
import p000X.C34291eR;

/* renamed from: com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar */
public class SegmentedProgressBar extends View {
    public static final int[] A0Q = {C0003R.C0004drawable.fuse_1, C0003R.C0004drawable.fuse_2, C0003R.C0004drawable.fuse_3, C0003R.C0004drawable.fuse_4, C0003R.C0004drawable.fuse_5, C0003R.C0004drawable.fuse_6, C0003R.C0004drawable.fuse_7, C0003R.C0004drawable.fuse_8, C0003R.C0004drawable.fuse_9};
    public static final int A0R = Color.argb(0, 255, 225, 255);
    public static final int A0S = Color.argb(255, 255, 226, 164);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public ValueAnimator A0A;
    public Bitmap A0B;
    public C212929Gf A0C;
    public boolean A0D;
    public Bitmap[] A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final BitmapFactory.Options A0I;
    public final Paint A0J;
    public final RectF A0K;
    public final RectF A0L;
    public final SparseArray A0M;
    public final SparseArray A0N;
    public final SparseArray A0O;
    public final boolean A0P;

    public final void A04(int i, boolean z) {
        setProgress(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A02 = Math.min(i, this.A06 - 1);
        this.A0D = z;
        Resources resources = getResources();
        boolean z2 = this.A0D;
        if (z2 && this.A0E == null) {
            this.A0E = new Bitmap[A0Q.length];
            int i2 = 0;
            while (true) {
                int[] iArr = A0Q;
                if (i2 >= iArr.length) {
                    break;
                }
                this.A0E[i2] = BitmapFactory.decodeResource(resources, iArr[i2], this.A0I);
                i2++;
            }
        } else if (!z2 && this.A0E != null) {
            int i3 = 0;
            while (true) {
                Bitmap[] bitmapArr = this.A0E;
                if (i3 >= bitmapArr.length) {
                    break;
                }
                bitmapArr[i3].recycle();
                i3++;
            }
            this.A0E = null;
        }
        if (this.A0D && this.A0B == null) {
            this.A0B = BitmapFactory.decodeResource(resources, C0003R.C0004drawable.smoke, this.A0I);
        }
        this.A09 = -1;
        this.A03 = -1;
        invalidate();
    }

    public void setProgress(float f) {
        this.A01 = Math.min(Math.max(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), 1.0f);
        invalidate();
    }

    private LinearGradient A00(float f) {
        int i;
        int i2;
        RectF rectF = this.A0L;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        boolean z = this.A0P;
        if (z) {
            i = A0S;
        } else {
            i = A0R;
        }
        if (z) {
            i2 = A0R;
        } else {
            i2 = A0S;
        }
        return new LinearGradient(f2, f3, f4, f, i, i2, Shader.TileMode.CLAMP);
    }

    private void A02(int i, float f) {
        this.A0N.put(i, Float.valueOf(f));
        if (this.A0O.get(i) == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 2.0f});
            ofFloat.setDuration(1000);
            ofFloat.addListener(new C1424066y(this, i));
            ofFloat.addUpdateListener(new AnonymousClass9CX(this));
            this.A0O.put(i, ofFloat);
        }
    }

    private boolean A03(int i) {
        if (!this.A0D || i != this.A02) {
            return false;
        }
        return true;
    }

    public int getCurrentSegment() {
        return this.A02;
    }

    public int getSegments() {
        return this.A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x030e, code lost:
        if (r14.A0P == false) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a0, code lost:
        if (r14.A0P != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d2, code lost:
        if (r14.A0P == false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01cc, code lost:
        if (r14.A0P != false) goto L_0x01ce;
     */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        float f;
        boolean z3;
        int i3;
        boolean z4;
        boolean z5;
        float f2;
        if (this.A06 == 0) {
            return;
        }
        if (this.A0A.isRunning()) {
            float width = (float) (getWidth() - (this.A0H << 1));
            int i4 = this.A06;
            float animatedFraction = ((width - ((float) ((i4 - 1) * this.A07))) / ((float) i4)) * this.A0A.getAnimatedFraction();
            int i5 = this.A06;
            int i6 = this.A05;
            float f3 = (width - (((float) (i5 - i6)) * animatedFraction)) / ((float) i6);
            float height = (float) getHeight();
            float f4 = (float) this.A0H;
            float height2 = (((float) getHeight()) - height) / 2.0f;
            int i7 = 0;
            while (true) {
                int i8 = this.A06;
                if (i7 < i8) {
                    boolean z6 = this.A0P;
                    if ((!z6 || i7 < i8 - this.A05) && (z6 || i7 > this.A05 - 1)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    float f5 = animatedFraction;
                    if (z3) {
                        f5 = f3;
                    }
                    this.A0J.setShader((Shader) null);
                    this.A0L.set(f4, height2, f4 + f5, height2 + height);
                    this.A0J.setStyle(Paint.Style.FILL);
                    if (this.A0P) {
                        i3 = (this.A06 - 1) - i7;
                    } else {
                        i3 = i7;
                    }
                    if (i3 < this.A02) {
                        this.A0J.setColor(this.A04);
                    } else {
                        this.A0J.setColor(this.A08);
                        this.A0J.setAlpha(153);
                    }
                    RectF rectF = this.A0L;
                    float f6 = (float) this.A0G;
                    canvas.drawRoundRect(rectF, f6, f6, this.A0J);
                    this.A0J.setColor(this.A04);
                    int i9 = this.A02;
                    if (i3 == i9) {
                        z4 = true;
                    }
                    z4 = false;
                    if (z4) {
                        RectF rectF2 = this.A0L;
                        rectF2.right = rectF2.left + (this.A01 * f5);
                        float f7 = (float) this.A0G;
                        canvas.drawRoundRect(rectF2, f7, f7, this.A0J);
                        RectF rectF3 = this.A0L;
                        rectF3.right = rectF3.left + f5;
                    } else {
                        if (i3 == i9) {
                            z5 = true;
                        }
                        z5 = false;
                        if (z5) {
                            if (this.A0P) {
                                f2 = 1.0f - this.A01;
                            } else {
                                f2 = this.A01;
                            }
                            RectF rectF4 = this.A0L;
                            rectF4.left += f2 * f5;
                            float f8 = (float) this.A0G;
                            canvas.drawRoundRect(rectF4, f8, f8, this.A0J);
                            RectF rectF5 = this.A0L;
                            rectF5.left = rectF5.right - f5;
                        }
                    }
                    f4 += this.A0L.width() + ((float) this.A07);
                    i7++;
                } else {
                    return;
                }
            }
        } else {
            float f9 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            int i10 = 0;
            for (int i11 = 0; i11 < this.A0M.size(); i11++) {
                f9 += ((Float) this.A0M.valueAt(i11)).floatValue();
                if (f9 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    f9 += (float) this.A07;
                } else {
                    i10++;
                }
            }
            float width2 = (((float) getWidth()) - f9) - ((float) (this.A0H << 1));
            int size = this.A06 - this.A0M.size();
            this.A00 = (width2 - ((float) (((size - 1) - i10) * this.A07))) / ((float) size);
            float height3 = (float) getHeight();
            float f10 = (float) this.A0H;
            float height4 = (((float) getHeight()) - height3) / 2.0f;
            for (int i12 = 0; i12 < this.A06; i12++) {
                Float f11 = (Float) this.A0M.get(i12);
                if (f11 == null) {
                    f11 = Float.valueOf(this.A00);
                }
                float floatValue = f11.floatValue();
                if (floatValue != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    this.A0J.setShader((Shader) null);
                    this.A0L.set(f10, height4, floatValue + f10, height4 + height3);
                    this.A0J.setStyle(Paint.Style.FILL);
                    if (this.A0P) {
                        i = (this.A06 - 1) - i12;
                    } else {
                        i = i12;
                    }
                    if (i < this.A02) {
                        this.A0J.setColor(this.A04);
                    } else {
                        this.A0J.setColor(this.A08);
                        Paint paint = this.A0J;
                        if (A03(i)) {
                            i2 = (int) ((1.0f - this.A01) * 153.0f);
                        } else {
                            i2 = 153;
                        }
                        paint.setAlpha(i2);
                    }
                    RectF rectF6 = this.A0L;
                    float f12 = (float) this.A0G;
                    canvas.drawRoundRect(rectF6, f12, f12, this.A0J);
                    this.A0J.setColor(this.A04);
                    int i13 = this.A02;
                    if (i == i13) {
                        z = true;
                    }
                    z = false;
                    if (z) {
                        RectF rectF7 = this.A0L;
                        float f13 = rectF7.left;
                        float f14 = this.A00;
                        float f15 = this.A01;
                        float f16 = f13 + (f14 * f15);
                        rectF7.right = f16;
                        if (A03(i)) {
                            rectF7.left = Math.max(f13, f16 - ((1.0f - f15) * floatValue));
                            this.A0J.setShader(A00(height3));
                        }
                        RectF rectF8 = this.A0L;
                        float f17 = (float) this.A0G;
                        canvas.drawRoundRect(rectF8, f17, f17, this.A0J);
                        if (A03(i)) {
                            A02(i12, this.A0L.left);
                            A01();
                            Bitmap bitmap = this.A0E[this.A03];
                            canvas.drawBitmap(bitmap, this.A0L.right - ((float) (bitmap.getWidth() >> 1)), (this.A0L.top - ((float) (bitmap.getHeight() >> 1))) + this.A0F, this.A0J);
                        }
                        C212929Gf r1 = this.A0C;
                        if (r1 != null && r1.isEnabled()) {
                            this.A0C.BjZ(this.A0L.right, f13, this.A00 + f13);
                        }
                        RectF rectF9 = this.A0L;
                        rectF9.left = f13;
                        rectF9.right = f13 + this.A00;
                    } else {
                        if (i == i13) {
                            z2 = true;
                        }
                        z2 = false;
                        if (z2) {
                            if (this.A0P) {
                                f = 1.0f - this.A01;
                            } else {
                                f = this.A01;
                            }
                            RectF rectF10 = this.A0L;
                            float f18 = rectF10.left + (this.A00 * f);
                            rectF10.left = f18;
                            float f19 = rectF10.right;
                            if (A03(i)) {
                                rectF10.right = Math.min(f19, f18 + ((1.0f - this.A01) * floatValue));
                                this.A0J.setShader(A00(height3));
                            }
                            RectF rectF11 = this.A0L;
                            float f20 = (float) this.A0G;
                            canvas.drawRoundRect(rectF11, f20, f20, this.A0J);
                            if (A03(i)) {
                                A02(i12, this.A0L.left);
                                A01();
                                Bitmap bitmap2 = this.A0E[this.A03];
                                canvas.drawBitmap(bitmap2, this.A0L.left - ((float) (bitmap2.getWidth() >> 1)), (this.A0L.top - ((float) (bitmap2.getHeight() >> 1))) + this.A0F, this.A0J);
                            }
                            C212929Gf r0 = this.A0C;
                            if (r0 != null && r0.isEnabled()) {
                                this.A0C.BjZ(this.A0L.left, f19 - this.A00, f19);
                            }
                            RectF rectF12 = this.A0L;
                            rectF12.right = f19;
                            rectF12.left = f19 - this.A00;
                        }
                    }
                    f10 += this.A0L.width() + ((float) this.A07);
                }
                ValueAnimator valueAnimator = (ValueAnimator) this.A0O.get(i12);
                if (valueAnimator != null) {
                    Float f21 = (Float) this.A0M.get(i12);
                    if (this.A01 > 0.95f || (f21 != null && f21.floatValue() < this.A00)) {
                        if (!valueAnimator.isStarted()) {
                            valueAnimator.start();
                        }
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        float f22 = floatValue2 - 1.0f;
                        if (this.A0P) {
                            this.A0K.left = ((Float) this.A0N.get(i12)).floatValue() - f22;
                        } else {
                            this.A0K.left = ((Float) this.A0N.get(i12)).floatValue() + f22;
                        }
                        RectF rectF13 = this.A0K;
                        rectF13.right = rectF13.left + (((float) this.A0B.getWidth()) * floatValue2);
                        this.A0K.top = (((float) getHeight()) - (((float) this.A0B.getHeight()) * floatValue2)) / 2.0f;
                        RectF rectF14 = this.A0K;
                        rectF14.bottom = rectF14.top + (((float) this.A0B.getHeight()) * floatValue2);
                        canvas.drawBitmap(this.A0B, (Rect) null, this.A0K, this.A0J);
                    }
                }
            }
        }
    }

    public void setSegments(int i) {
        this.A06 = i;
        invalidate();
    }

    private void A01() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.A09;
        if (j == -1 || currentTimeMillis - j > 30) {
            this.A03 = (this.A03 + 1) % A0Q.length;
            this.A09 = currentTimeMillis;
        }
    }

    public void setPositionAnchorDelegate(C212929Gf r1) {
        this.A0C = r1;
    }

    public SegmentedProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public SegmentedProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SegmentedProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0M = new SparseArray();
        this.A0N = new SparseArray();
        this.A0O = new SparseArray();
        this.A03 = 0;
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3I, i, 0);
        this.A0G = obtainStyledAttributes.getDimensionPixelSize(0, resources.getDimensionPixelSize(C0003R.dimen.segmented_progress_bar_default_radius));
        this.A07 = obtainStyledAttributes.getDimensionPixelOffset(3, resources.getDimensionPixelOffset(C0003R.dimen.segmented_progress_bar_default_spacing));
        getResources();
        this.A0H = resources.getDimensionPixelOffset(C0003R.dimen.segmented_progress_bar_default_margin_side);
        this.A04 = obtainStyledAttributes.getColor(1, Color.argb(255, 255, 255, 255));
        this.A08 = obtainStyledAttributes.getColor(4, Color.argb(153, 255, 255, 255));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.A0J = paint;
        getResources();
        paint.setShadowLayer(resources.getDisplayMetrics().density * 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Color.argb(39, 0, 0, 0));
        this.A0L = new RectF();
        this.A0K = new RectF();
        this.A0P = C06400Ox.A02(context);
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.A0I = options;
        options.inSampleSize = 3;
        this.A0F = C06220Of.A03(getContext(), 1);
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f}).setDuration(200);
        this.A0A = duration;
        duration.addUpdateListener(new C34291eR(this));
        this.A0A.setInterpolator(new OvershootInterpolator(1.25f));
    }
}
