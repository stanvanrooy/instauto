package com.instagram.common.p004ui.widget.touchimageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EB;
import p000X.AnonymousClass1EC;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass2KD;
import p000X.C1430669x;
import p000X.C1430769y;
import p000X.C168387Hb;
import p000X.C168397Hc;
import p000X.C27181Gu;

/* renamed from: com.instagram.common.ui.widget.touchimageview.TouchImageView */
public class TouchImageView extends View implements AnonymousClass2KD, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener {
    public static final AnonymousClass1EA A0W = AnonymousClass1EA.A01(0.0d, 1.5d);
    public static final AnonymousClass1EA A0X = AnonymousClass1EA.A01(30.0d, 8.0d);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public Bitmap A0A;
    public C168397Hc A0B;
    public C1430769y A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final Rect A0J;
    public final RectF A0K;
    public final AnonymousClass1EG A0L;
    public final AnonymousClass1EG A0M;
    public final AnonymousClass1EG A0N;
    public final Paint A0O;
    public final PointF A0P;
    public final PointF A0Q;
    public final RectF A0R;
    public final RectF A0S;
    public final RectF A0T;
    public final GestureDetector A0U;
    public final ScaleGestureDetector A0V;

    public final void At8(AnonymousClass1EC r1) {
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A03 = (float) C27181Gu.A00((double) f, -3000.0d, 3000.0d);
        this.A04 = (float) C27181Gu.A00((double) f2, -3000.0d, 3000.0d);
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    private float A00() {
        return Math.max(this.A0C.AH0(this).height() / ((float) this.A0J.height()), this.A0C.AH0(this).width() / ((float) this.A0J.width()));
    }

    private void A01(float f, float f2, float f3) {
        float f4;
        RectF AH0 = this.A0C.AH0(this);
        this.A0K.offsetTo(AH0.centerX() - f, AH0.centerY() - f2);
        invalidate();
        A02(this.A0J, this.A0K, Math.max(A00(), f3), AH0.centerX(), AH0.centerY());
        invalidate();
        if (!this.A0K.contains(AH0)) {
            float width = f / this.A0K.width();
            float height = f2 / this.A0K.height();
            RectF rectF = this.A0K;
            int round = Math.round(rectF.left);
            int round2 = Math.round(AH0.left);
            if (round > round2) {
                f4 = Math.max((((float) (round - round2)) / width) / rectF.width(), 1.0f);
            } else {
                f4 = 1.0f;
            }
            RectF rectF2 = this.A0K;
            int round3 = Math.round(rectF2.right);
            int round4 = Math.round(AH0.right);
            if (round3 < round4) {
                f4 = Math.max((((float) (round4 - round3)) / (1.0f - width)) / rectF2.width(), f4);
            }
            RectF rectF3 = this.A0K;
            int round5 = Math.round(rectF3.top);
            int round6 = Math.round(AH0.top);
            if (round5 > round6) {
                f4 = Math.max((((float) (round5 - round6)) / height) / rectF3.height(), f4);
            }
            RectF rectF4 = this.A0K;
            int round7 = Math.round(rectF4.bottom);
            int round8 = Math.round(AH0.bottom);
            if (round7 < round8) {
                f4 = Math.max(Math.max((((float) (round8 - round7)) / (1.0f - height)) / rectF4.height(), f4), f4);
            }
            A02(this.A0J, this.A0K, f4 * getContentScale(), f, f2);
            invalidate();
            A05(false);
        }
    }

    private boolean A03() {
        if (this.A0A == null || this.A0J.isEmpty() || this.A0C.AH0(this).isEmpty()) {
            return false;
        }
        return true;
    }

    private float getContentScale() {
        return this.A0K.width() / ((float) this.A0J.width());
    }

    private float getContentTranslationX() {
        return this.A0K.left;
    }

    private float getContentTranslationY() {
        return this.A0K.top;
    }

    public final void A04() {
        if (!this.A0D && A03()) {
            this.A0D = true;
            this.A0K.set(this.A0J);
            A01(this.A0K.centerX(), this.A0K.centerY(), A00());
        }
    }

    public final void A05(boolean z) {
        boolean z2;
        RectF rectF;
        this.A0T.set(this.A0K);
        RectF AH0 = this.A0C.AH0(this);
        boolean z3 = false;
        boolean z4 = false;
        if (this.A0T.width() > AH0.width() * this.A02) {
            z4 = true;
        }
        if (!this.A0T.contains(AH0) || z4) {
            if (z4) {
                A02(this.A0J, this.A0T, this.A02 * A00(), AH0.centerX(), AH0.centerY());
            }
            if (Math.round(this.A0T.height()) < Math.round(AH0.height()) || Math.round(this.A0T.width()) < Math.round(AH0.width())) {
                Rect rect = this.A0J;
                RectF rectF2 = this.A0T;
                float A002 = A00();
                PointF pointF = this.A0P;
                A02(rect, rectF2, A002, pointF.x, pointF.y);
                z4 = true;
            }
            RectF rectF3 = this.A0T;
            float f = rectF3.left;
            int round = Math.round(f);
            float f2 = AH0.left;
            if (round > Math.round(f2)) {
                rectF3.offset(f2 - f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                z2 = true;
            } else {
                z2 = false;
            }
            RectF rectF4 = this.A0T;
            float f3 = rectF4.right;
            int round2 = Math.round(f3);
            float f4 = AH0.right;
            if (round2 < Math.round(f4)) {
                rectF4.offset(f4 - f3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                z2 = true;
            }
            RectF rectF5 = this.A0T;
            float f5 = rectF5.top;
            int round3 = Math.round(f5);
            float f6 = AH0.top;
            if (round3 > Math.round(f6)) {
                rectF5.offset(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f6 - f5);
                z3 = true;
            }
            RectF rectF6 = this.A0T;
            float f7 = rectF6.bottom;
            int round4 = Math.round(f7);
            float f8 = AH0.bottom;
            if (round4 < Math.round(f8)) {
                rectF6.offset(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f8 - f7);
                z3 = true;
            }
            if (!z) {
                rectF = this.A0K;
            } else if (this.A05) {
                return;
            } else {
                if (z4) {
                    this.A05 = true;
                    this.A0M.A02();
                    this.A0N.A02();
                    AnonymousClass1EG r3 = this.A0L;
                    r3.A02();
                    r3.A05(0.0d, true);
                    r3.A03(1.0d);
                    this.A0S.set(this.A0K);
                    rectF = this.A0R;
                } else {
                    if (z2) {
                        AnonymousClass1EG r2 = this.A0M;
                        r2.A06(A0X);
                        r2.A03((double) this.A0T.left);
                    }
                    if (z3) {
                        AnonymousClass1EG r22 = this.A0N;
                        r22.A06(A0X);
                        r22.A03((double) this.A0T.top);
                        return;
                    }
                    return;
                }
            }
            rectF.set(this.A0T);
        }
    }

    public final void ArN(AnonymousClass1EC r23) {
        if (this.A05) {
            RectF rectF = this.A0S;
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = rectF.right;
            float f4 = rectF.bottom;
            RectF rectF2 = this.A0R;
            float f5 = rectF2.left;
            float f6 = rectF2.top;
            float f7 = rectF2.right;
            float f8 = rectF2.bottom;
            double A002 = (double) ((float) this.A0L.A00());
            this.A0K.set((float) C27181Gu.A01(A002, 0.0d, 1.0d, (double) f, (double) f5), (float) C27181Gu.A01(A002, 0.0d, 1.0d, (double) f2, (double) f6), (float) C27181Gu.A01(A002, 0.0d, 1.0d, (double) f3, (double) f7), (float) C27181Gu.A01(A002, 0.0d, 1.0d, (double) f4, (double) f8));
            invalidate();
            return;
        }
        AnonymousClass1EG r1 = this.A0M;
        if (!r1.A09() || !this.A0N.A09()) {
            this.A0K.offsetTo((float) r1.A00(), (float) this.A0N.A00());
            invalidate();
            if (!this.A09) {
                A05(true);
            }
        }
    }

    public Rect getCropRect() {
        RectF rectF = new RectF(this.A0K);
        RectF rectF2 = new RectF(this.A0C.AH0(this));
        float f = -rectF.left;
        float f2 = -rectF.top;
        rectF.offset(f, f2);
        rectF2.offset(f, f2);
        rectF.intersect(rectF2);
        float contentScale = getContentScale();
        return new Rect(Math.round(rectF.left / contentScale), Math.round(rectF.top / contentScale), Math.round(rectF.right / contentScale), Math.round(rectF.bottom / contentScale));
    }

    public C168387Hb getRenderState() {
        return new C168387Hb(this.A0K, this.A0C.AH0(this), this.A0J, this.A0A, this.A0F, this.A0G);
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        PointF pointF = this.A0Q;
        PointF pointF2 = this.A0P;
        pointF.x = pointF2.x;
        pointF.y = pointF2.y;
        pointF2.x = (float) ((int) scaleGestureDetector.getFocusX());
        this.A0P.y = (float) ((int) scaleGestureDetector.getFocusY());
        float currentSpan = scaleGestureDetector.getCurrentSpan() / scaleGestureDetector.getPreviousSpan();
        PointF pointF3 = this.A0P;
        float f = pointF3.x;
        float f2 = pointF3.y;
        A02(this.A0J, this.A0K, currentSpan * getContentScale(), f, f2);
        invalidate();
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.A0H) {
            return false;
        }
        this.A07 = true;
        getParent().requestDisallowInterceptTouchEvent(true);
        this.A0Q.x = (float) ((int) scaleGestureDetector.getFocusX());
        this.A0Q.y = (float) ((int) scaleGestureDetector.getFocusY());
        this.A0P.x = (float) ((int) scaleGestureDetector.getFocusX());
        this.A0P.y = (float) ((int) scaleGestureDetector.getFocusY());
        return true;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.A0A = bitmap;
        this.A0D = false;
        this.A0F = false;
        this.A0G = false;
        if (bitmap == null) {
            this.A0K.setEmpty();
        } else {
            this.A0J.set(0, 0, bitmap.getWidth(), this.A0A.getHeight());
        }
        this.A0K.set(this.A0J);
        A04();
    }

    public void setRenderState(C168387Hb r7) {
        setImageBitmap(r7.A00);
        this.A0M.A02();
        this.A0N.A02();
        this.A0L.A02();
        this.A0K.set(r7.A02);
        RectF AH0 = this.A0C.AH0(this);
        this.A0F = r7.A04;
        this.A0G = r7.A05;
        PointF pointF = new PointF(r7.A03.centerX() - r7.A02.left, r7.A03.centerY() - r7.A02.top);
        PointF pointF2 = this.A0P;
        pointF2.x = pointF.x;
        pointF2.y = pointF.y;
        float width = r7.A02.width() / ((float) r7.A01.width());
        float width2 = r7.A03.width() / r7.A03.height();
        float width3 = ((float) getWidth()) / ((float) getHeight());
        if (Math.abs(width2 - width3) / width3 < 0.1f) {
            width *= Math.min(AH0.width() / r7.A03.width(), AH0.height() / r7.A03.height());
        }
        A01(pointF.x, pointF.y, width);
        invalidate();
    }

    public static void A02(Rect rect, RectF rectF, float f, float f2, float f3) {
        float width = ((float) rect.width()) * f;
        float height = ((float) rect.height()) * f;
        float width2 = (f2 - (rectF.left - ((float) rect.left))) / rectF.width();
        float height2 = (f3 - (rectF.top - ((float) rect.top))) / rectF.height();
        rectF.left -= width2 * (width - rectF.width());
        float height3 = rectF.top - (height2 * (height - rectF.height()));
        rectF.top = height3;
        rectF.right = rectF.left + width;
        rectF.bottom = height3 + height;
    }

    public Bitmap getImageBitmap() {
        return this.A0A;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (A03()) {
            float f = -1.0f;
            float f2 = 1.0f;
            if (this.A0G) {
                f2 = -1.0f;
            }
            if (!this.A0F) {
                f = 1.0f;
            }
            canvas.scale(f2, f, this.A0K.centerX(), this.A0K.centerY());
            canvas.drawBitmap(this.A0A, this.A0J, this.A0K, this.A0O);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00b2, code lost:
        if (r2 < 0.25f) goto L_0x00b4;
     */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        getParent().requestDisallowInterceptTouchEvent(true);
        if (this.A0V.isInProgress()) {
            PointF pointF = this.A0Q;
            float f3 = pointF.x;
            PointF pointF2 = this.A0P;
            f = f3 - pointF2.x;
            f2 = pointF.y - pointF2.y;
        } else if (!this.A06) {
            this.A06 = true;
            f -= this.A00 - motionEvent2.getRawX();
            f2 -= this.A01 - motionEvent2.getRawY();
        }
        if (!this.A07 && this.A08) {
            C168397Hc r2 = this.A0B;
            RectF AH0 = this.A0C.AH0(this);
            RectF rectF = this.A0K;
            r2.A01 = Math.min(Math.max(rectF.left / AH0.width(), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), 1.0f);
            r2.A03 = Math.min(Math.max(rectF.top / AH0.height(), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), 1.0f);
            r2.A02 = Math.min(Math.max((AH0.width() - rectF.right) / AH0.width(), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), 1.0f);
            r2.A00 = Math.min(Math.max((AH0.height() - rectF.bottom) / AH0.height(), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), 1.0f);
            C168397Hc r8 = this.A0B;
            float pow = (float) Math.pow((double) (1.0f - Math.max(r8.A01, r8.A02)), 4.0d);
            f *= pow;
            float pow2 = (float) Math.pow((double) (1.0f - Math.max(r8.A03, r8.A00)), 4.0d);
            f2 *= pow2;
            if (pow >= 0.25f) {
                z = false;
            }
            z = true;
            if (z) {
                if (!this.A0E && this.A09) {
                    this.A0E = true;
                }
                this.A0K.offset(-f, -f2);
                invalidate();
                return true;
            }
        }
        this.A0E = false;
        this.A0K.offset(-f, -f2);
        invalidate();
        return true;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int A062 = AnonymousClass0Z0.A06(-687530270);
        super.onSizeChanged(i, i2, i3, i4);
        this.A0L.A02();
        this.A0M.A02();
        this.A0N.A02();
        if (!A03()) {
            i5 = 1575468891;
        } else {
            A04();
            RectF rectF = this.A0K;
            rectF.offset((((float) i) / 2.0f) - (((float) i3) / 2.0f), (((float) i2) / 2.0f) - (((float) i4) / 2.0f));
            invalidate();
            A05(false);
            i5 = -1291197680;
        }
        AnonymousClass0Z0.A0D(i5, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0060, code lost:
        if (r3 != false) goto L_0x0062;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int A052 = AnonymousClass0Z0.A05(-1402862563);
        boolean z2 = false;
        if (!this.A0I) {
            i = -941998414;
        } else {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.A09 = true;
                this.A06 = false;
                this.A00 = motionEvent.getRawX();
                this.A01 = motionEvent.getRawY();
                this.A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                this.A04 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                this.A05 = false;
                this.A0M.A05((double) this.A0K.left, true);
                this.A0N.A05((double) this.A0K.top, true);
                this.A0L.A05((double) getContentScale(), true);
            }
            boolean onTouchEvent = this.A0V.onTouchEvent(motionEvent);
            if (!this.A0U.onTouchEvent(motionEvent)) {
                z = false;
            }
            z = true;
            if (z || super.onTouchEvent(motionEvent)) {
                z2 = true;
            }
            if (actionMasked == 1 || actionMasked == 3) {
                this.A09 = false;
                this.A07 = false;
                AnonymousClass1EG r3 = this.A0M;
                r3.A06(A0W);
                r3.A05((double) this.A0K.left, true);
                r3.A04((double) this.A03);
                AnonymousClass1EG r32 = this.A0N;
                r32.A06(A0W);
                r32.A05((double) this.A0K.top, true);
                r32.A04((double) this.A04);
                this.A0L.A05((double) getContentScale(), true);
                A05(true);
            }
            i = 240419877;
        }
        AnonymousClass0Z0.A0C(i, A052);
        return z2;
    }

    public void setBoundsDelegate(C1430769y r1) {
        this.A0C = r1;
    }

    public void setMaxScale(float f) {
        this.A02 = f;
    }

    public void setScaleEnabled(boolean z) {
        this.A0H = z;
    }

    public void setShouldSlipNearBounds(boolean z) {
        this.A08 = z;
    }

    public void setTouchEnabled(boolean z) {
        this.A0I = z;
    }

    public TouchImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TouchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0H = true;
        this.A08 = true;
        this.A02 = Float.MAX_VALUE;
        this.A0U = new GestureDetector(context, this);
        this.A0V = new ScaleGestureDetector(context, this);
        this.A0O = new Paint(2);
        this.A0T = new RectF();
        this.A0S = new RectF();
        this.A0R = new RectF();
        this.A0J = new Rect();
        this.A0K = new RectF();
        this.A0P = new PointF();
        this.A0Q = new PointF();
        this.A0B = new C168397Hc();
        AnonymousClass1EB A002 = AnonymousClass0P2.A00();
        A002.A01(this);
        AnonymousClass1EG A003 = A002.A00();
        AnonymousClass1EA r3 = A0W;
        A003.A06(r3);
        A003.A02 = 0.5d;
        A003.A00 = 0.5d;
        this.A0M = A003;
        AnonymousClass1EG A004 = A002.A00();
        A004.A02 = 0.5d;
        A004.A00 = 0.5d;
        A004.A06(r3);
        this.A0N = A004;
        AnonymousClass1EG A005 = A002.A00();
        A005.A06(A0X);
        A005.A02 = 0.01d;
        A005.A00 = 0.01d;
        this.A0L = A005;
        setBoundsDelegate(new C1430669x());
    }
}
