package com.instagram.p009ui.widget.shutterbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.Constants;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0P3;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass3k2;
import p000X.AnonymousClass7QL;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C06390Ow;
import p000X.C06420Oz;
import p000X.C27181Gu;
import p000X.C33781dU;
import p000X.C77523a6;
import p000X.C77623aK;
import p000X.C79753e1;
import p000X.C79763e2;
import p000X.C82633ij;
import p000X.C82653il;
import p000X.C82673in;
import p000X.C82693ip;
import p000X.C83073jR;
import p000X.C87293qV;
import p000X.C87303qW;
import p000X.C87313qX;

/* renamed from: com.instagram.ui.widget.shutterbutton.ShutterButton */
public class ShutterButton extends View implements AnonymousClass1E8, C79753e1 {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public AnonymousClass1EG A07;
    public AnonymousClass3k2 A08;
    public C82633ij A09;
    public C87293qV A0A;
    public C82693ip A0B;
    public C82653il A0C;
    public C82673in A0D;
    public C83073jR A0E;
    public AnonymousClass7QL A0F;
    public Float A0G;
    public Integer A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public float A0M;
    public float A0N;
    public float A0O;
    public int A0P;
    public LinearGradient A0Q;
    public Drawable A0R;
    public C79763e2 A0S;
    public final Rect A0T;
    public final Choreographer.FrameCallback A0U;
    public final Choreographer A0V;
    public final C79763e2 A0W;
    public final Runnable A0X;
    public final int[] A0Y;
    public final float A0Z;
    public final float A0a;
    public final float A0b;
    public final int A0c;
    public final int A0d;
    public final Matrix A0e;
    public final Paint A0f;
    public final Paint A0g;
    public final Paint A0h;
    public final Paint A0i;
    public final RectF A0j;
    public final Drawable A0k;

    private void A00() {
        this.A03 = 0;
        this.A0K = false;
        this.A0V.removeFrameCallback(this.A0U);
        setVideoRecordingProgress(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A07.A03(1.0d);
    }

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public void setMultiCaptureProgress(float f) {
        this.A00 = C06420Oz.A00(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
        invalidate();
    }

    public void setVideoRecordingProgress(float f) {
        this.A02 = C06420Oz.A00(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
        invalidate();
        C82693ip r1 = this.A0B;
        if (r1 != null) {
            r1.BVJ(this.A02);
        }
    }

    private void A01() {
        this.A0Q.getLocalMatrix(this.A0e);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A06;
        this.A0e.setRotate(this.A0S.AT4(elapsedRealtime), ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        this.A0Q.setLocalMatrix(this.A0e);
        this.A0i.setStrokeWidth(this.A0S.AT5(this.A0b, elapsedRealtime));
    }

    private void A03(Canvas canvas, float f) {
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        float min = ((((float) Math.min(getWidth(), getHeight())) / 2.0f) * this.A01) - (this.A0b / 2.0f);
        this.A0j.set(width - min, height - min, width + min, height + min);
        A01();
        Canvas canvas2 = canvas;
        canvas2.drawArc(this.A0j, 270.0f, f * 360.0f, false, this.A0i);
    }

    private void A04(Canvas canvas, Drawable drawable) {
        canvas.save();
        Rect bounds = drawable.getBounds();
        canvas.translate(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        float f = this.A0N;
        canvas.scale(f, f);
        canvas.translate(((float) (-bounds.width())) / 2.0f, ((float) (-bounds.height())) / 2.0f);
        drawable.setAlpha((int) (1.0f * 255.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    private void setMode(C87293qV r2) {
        if (!this.A0A.equals(r2)) {
            this.A0A = r2;
            invalidate();
        }
    }

    public final void A05() {
        C87293qV r1 = this.A0A;
        C87293qV r0 = C87293qV.READY_TO_SHOOT;
        if (r1 != r0) {
            A00();
            setMode(r0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r0.Aed() != false) goto L_0x000b;
     */
    public final void A06() {
        boolean z;
        C82633ij r0 = this.A09;
        if (r0 != null) {
            z = false;
        }
        z = true;
        if (!z) {
            A09();
            return;
        }
        setMode(C87293qV.RECORD_VIDEO_REQUESTED);
        SystemClock.elapsedRealtime();
        C82693ip r02 = this.A0B;
        if (r02 != null) {
            r02.BOi();
        }
    }

    public final void A07() {
        if (this.A0A != C87293qV.READY_TO_SHOOT) {
            long min = Math.min(SystemClock.elapsedRealtime() - this.A06, this.A05);
            SystemClock.elapsedRealtime();
            A00();
            setMode(C87293qV.READY_TO_SHOOT);
            C82693ip r1 = this.A0B;
            if (r1 != null) {
                r1.BPH((int) min);
            }
        }
    }

    public final void A08() {
        setMode(C87293qV.MULTI_CAPTURE);
        this.A07.A03(1.0d);
    }

    public final void A09() {
        setMode(C87293qV.READY_TO_SHOOT);
        this.A07.A03(1.0d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r4.Aeq() == false) goto L_0x0027;
     */
    public final void A0A(Integer num) {
        boolean z;
        int i;
        if (this.A0A.equals(C87293qV.RECORD_VIDEO_REQUESTED)) {
            boolean z2 = true;
            if (this.A0J) {
                this.A0K = true;
            }
            this.A07.A03(1.524999976158142d);
            C83073jR r4 = this.A0E;
            if (r4 != null) {
                z = true;
            }
            z = false;
            this.A03 = 0;
            if (z) {
                if (this.A0I) {
                    i = r4.AIx();
                } else {
                    i = 1;
                }
                this.A04 = i;
                AnonymousClass7QL r1 = new AnonymousClass7QL(i);
                this.A0F = r1;
                r1.A02 = this.A0Q;
            }
            setMode(C87293qV.RECORDING_VIDEO);
            if (num == Constants.ZERO) {
                this.A06 = SystemClock.elapsedRealtime();
                this.A0V.postFrameCallback(this.A0U);
            }
            C82693ip r12 = this.A0B;
            if (r12 != null) {
                if (!this.A0I || !z) {
                    z2 = false;
                }
                r12.BOk(z2);
            }
        }
    }

    public float getZoomDragAvailableHeight() {
        if (this.A0O == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            this.A0O = Math.min(((float) getRootView().getHeight()) * 0.7f, C06220Of.A03(getContext(), 200));
        }
        return this.A0O;
    }

    public final void onDraw(Canvas canvas) {
        switch (this.A0A.ordinal()) {
            case 0:
            case 1:
                A02(canvas);
                return;
            case 2:
                A02(canvas);
                if (!this.A0S.BnO()) {
                    A03(canvas, 1.0f);
                    return;
                }
                AnonymousClass7QL r0 = this.A0F;
                if (r0 == null) {
                    A03(canvas, this.A02);
                    return;
                } else if (r0 != null) {
                    float width = ((float) getWidth()) / 2.0f;
                    float height = ((float) getHeight()) / 2.0f;
                    float min = (((float) Math.min(getWidth(), getHeight())) / 2.0f) * this.A01;
                    A01();
                    AnonymousClass7QL r4 = this.A0F;
                    r4.A04.set(width - min, height - min, width + min, height + min);
                    C77623aK.A01(Constants.ZERO, r4.A03, r4.A04, r4.A05);
                    r4.invalidateSelf();
                    AnonymousClass7QL r2 = this.A0F;
                    int i = this.A03;
                    float f = this.A02;
                    r2.A01 = i;
                    r2.A00 = f;
                    r2.invalidateSelf();
                    this.A0F.draw(canvas);
                    return;
                } else {
                    return;
                }
            case 3:
                A02(canvas);
                float f2 = this.A00;
                if (f2 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    A03(canvas, f2);
                    return;
                }
                return;
            default:
                throw new RuntimeException("Encountered a mode without drawing instructions");
        }
    }

    public void setFormatIcon(Drawable drawable) {
        this.A0R = drawable;
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r2 == false) goto L_0x0007;
     */
    public void setHandsFreeRecordingInProgress(boolean z) {
        boolean z2;
        if (this.A0J) {
            z2 = true;
        }
        z2 = false;
        this.A0K = z2;
    }

    public void setInnerCircleAlpha(float f) {
        if (this.A0M != f) {
            this.A0M = f;
            invalidate();
        }
    }

    public void setShutterButtonRecordingStyle(C79763e2 r1) {
        this.A0S = r1;
        requestLayout();
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0045, code lost:
        if (r14.A0S.BnO() != false) goto L_0x0047;
     */
    private void A02(Canvas canvas) {
        boolean z;
        float min = ((float) Math.min(getWidth(), getHeight())) / 2.0f;
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        int i = (int) (this.A0M * 255.0f);
        this.A0h.setAlpha(i);
        Canvas canvas2 = canvas;
        canvas.drawCircle(width, height, (min - (this.A0a + this.A0Z)) * this.A0N, this.A0h);
        int i2 = 0;
        if (this.A0A == C87293qV.RECORDING_VIDEO) {
            z = false;
        }
        z = true;
        Paint paint = this.A0f;
        if (z) {
            i2 = 255;
        }
        paint.setAlpha(i2);
        float f = (min * this.A01) - (this.A0b / 2.0f);
        this.A0j.set(width - f, height - f, width + f, height + f);
        canvas2.drawArc(this.A0j, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 360.0f, false, this.A0f);
        if (this.A0K) {
            A04(canvas, this.A0k);
            return;
        }
        Drawable drawable = this.A0R;
        if (drawable != null && i > 0) {
            A04(canvas, drawable);
        }
    }

    public final void BOH(AnonymousClass1EG r1) {
        invalidate();
    }

    public final void BOK(AnonymousClass1EG r11) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        float A002 = (float) r11.A00();
        this.A01 = A002;
        if (r11.A01 > r11.A03) {
            d = (double) A002;
            d2 = 1.0d;
            d3 = 1.524999976158142d;
            d4 = 1.0d;
            d5 = 0.8726999759674072d;
        } else {
            d = (double) A002;
            d2 = 1.524999976158142d;
            d3 = 1.0d;
            d4 = 0.8726999759674072d;
            d5 = 1.0d;
        }
        this.A0N = (float) C27181Gu.A01(d, d2, d3, d4, d5);
        invalidate();
        if (this.A0B != null) {
            float f = this.A01;
            float A012 = C06420Oz.A01(f, 1.0f, 1.525f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
            float min = ((float) Math.min(getWidth(), getHeight())) / 2.0f;
            this.A0B.BNI(A012, min * (f - 1.0f));
        }
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(-887745157);
        super.onAttachedToWindow();
        this.A07.A07(this);
        AnonymousClass0Z0.A0D(-370876623, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(588741068);
        super.onDetachedFromWindow();
        this.A07.A08(this);
        AnonymousClass0Z0.A0D(630395457, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        LinearGradient linearGradient = new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) getWidth(), (float) getHeight(), this.A0S.AT2(this.A0d), this.A0S.AT3(), Shader.TileMode.CLAMP);
        this.A0Q = linearGradient;
        this.A0i.setShader(linearGradient);
        AnonymousClass7QL r1 = this.A0F;
        if (r1 != null) {
            r1.A02 = this.A0Q;
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(1478185920);
        int width = getWidth() >> 1;
        this.A0g.setShader(new RadialGradient((float) width, (float) (getHeight() >> 1), (((float) Math.min(getWidth(), getHeight())) / 2.0f) * this.A01 * 1.09f, this.A0c, 0, Shader.TileMode.CLAMP));
        AnonymousClass0Z0.A0D(-472642741, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r5 != 6) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        if (r0.Aed() != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012d, code lost:
        if (r0.Aed() != false) goto L_0x012f;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        C87293qV r1;
        C87293qV r12;
        boolean z;
        boolean z2;
        float floatValue;
        int A052 = AnonymousClass0Z0.A05(-1078915541);
        if (isEnabled()) {
            int actionMasked = motionEvent.getActionMasked();
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                            }
                        }
                    } else if (pointerId == this.A0P) {
                        if (this.A0G == null) {
                            this.A0G = Float.valueOf(motionEvent.getY());
                        }
                        if (this.A0A == C87293qV.RECORDING_VIDEO) {
                            C82633ij r0 = this.A09;
                            if (r0 != null) {
                                z2 = false;
                            }
                            z2 = true;
                            if (z2 && this.A0D != null) {
                                Float f = this.A0G;
                                if (f == null) {
                                    floatValue = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                                } else {
                                    floatValue = f.floatValue() - motionEvent.getY();
                                }
                                float scaledTouchSlop = (float) ViewConfiguration.get(getContext()).getScaledTouchSlop();
                                if (floatValue >= scaledTouchSlop) {
                                    float max = Math.max(Math.min((floatValue - scaledTouchSlop) / getZoomDragAvailableHeight(), 1.0f), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                                    this.A0D.B1P(max * max * (3.0f - (max * 2.0f)));
                                }
                            }
                        }
                        i2 = -187779123;
                        AnonymousClass0Z0.A0C(i2, A052);
                        return true;
                    }
                }
                if (pointerId == this.A0P) {
                    AnonymousClass0ZA.A08(getHandler(), this.A0X);
                    this.A0G = null;
                    if (motionEvent.getAction() != 3) {
                        Integer num = this.A0H;
                        Integer num2 = Constants.ZERO;
                        if (num != num2 || !this.A0K) {
                            if (num == num2 && (((r12 = this.A0A) == C87293qV.READY_TO_SHOOT || r12 == C87293qV.MULTI_CAPTURE) && this.A07.A09())) {
                                int rawX = (int) motionEvent.getRawX();
                                int rawY = (int) motionEvent.getRawY();
                                getLocationOnScreen(this.A0Y);
                                getGlobalVisibleRect(this.A0T);
                                int[] iArr = this.A0Y;
                                int i3 = iArr[0];
                                Rect rect = this.A0T;
                                int i4 = iArr[1];
                                rect.set(i3, i4, i3 + (rect.bottom - rect.top), i4 + (rect.right - rect.left));
                                if (this.A0T.contains(rawX, rawY)) {
                                    C82633ij r02 = this.A09;
                                    if (r02 != null) {
                                        z = false;
                                    }
                                    z = true;
                                    if (!z) {
                                        A09();
                                        AnonymousClass0QD.A01("ShutterButton", "Not handling single tap since camera is not initialized");
                                    } else {
                                        C82653il r03 = this.A0C;
                                        if (r03 != null) {
                                            r03.BNV();
                                        }
                                    }
                                }
                            }
                            if (this.A0H == Constants.ONE && ((r1 = this.A0A) == C87293qV.RECORDING_VIDEO || r1 == C87293qV.RECORD_VIDEO_REQUESTED)) {
                                if (this.A0J) {
                                    this.A0K = true;
                                }
                            }
                        }
                        A07();
                    }
                }
                if (actionMasked != 6) {
                    this.A0P = -1;
                }
                i2 = -2035315795;
                AnonymousClass0Z0.A0C(i2, A052);
                return true;
            }
            int i5 = this.A0P;
            if (i5 == -1) {
                this.A0P = pointerId;
                AnonymousClass0ZA.A09(getHandler(), this.A0X, 350, -723656656);
                C87293qV r13 = this.A0A;
                if (r13 == C87293qV.READY_TO_SHOOT || r13 == C87293qV.MULTI_CAPTURE || this.A0K) {
                    this.A0H = Constants.ZERO;
                }
                i2 = 674943181;
                AnonymousClass0Z0.A0C(i2, A052);
                return true;
            }
            if (i5 == pointerId) {
                AnonymousClass0DB.A0K("ShutterButton", "The touch sequence shall not happen. Current pointer id: %s. Incoming: %s", Integer.valueOf(i5), Integer.valueOf(pointerId));
                i = 783744075;
            } else {
                i = -504961167;
            }
            AnonymousClass0Z0.A0C(i, A052);
            return false;
        }
        i = 1899065004;
        AnonymousClass0Z0.A0C(i, A052);
        return false;
    }

    public void setCameraInitialisedDelegate(C82633ij r1) {
        this.A09 = r1;
    }

    public void setContinuousVideoCaptureSupported(boolean z) {
        this.A0I = z;
    }

    public void setHandsFreeRecordingEnabled(boolean z) {
        this.A0J = z;
    }

    public void setMaxVideoDurationMS(long j) {
        this.A05 = j;
    }

    public void setOnRecordVideoListener(C82693ip r1) {
        this.A0B = r1;
    }

    public void setOnSingleTapCaptureListener(C82653il r1) {
        this.A0C = r1;
    }

    public void setOnZoomVideoListener(C82673in r1) {
        this.A0D = r1;
    }

    public void setRecordingProgressListener(AnonymousClass3k2 r1) {
        this.A08 = r1;
    }

    public void setVideoCaptureDelegate(C83073jR r1) {
        this.A0E = r1;
    }

    public void setVideoRecordingEnabled(boolean z) {
        this.A0L = z;
    }

    public ShutterButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public ShutterButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public ShutterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0e = new Matrix();
        this.A0T = new Rect();
        this.A0Y = new int[2];
        this.A0L = true;
        this.A0I = true;
        this.A01 = 1.0f;
        this.A0N = 1.0f;
        this.A0j = new RectF();
        this.A0P = -1;
        this.A0A = C87293qV.READY_TO_SHOOT;
        this.A0M = 1.0f;
        if (AnonymousClass0P3.A00 == null) {
            AnonymousClass0P3.A00 = Choreographer.getInstance();
        }
        this.A0V = AnonymousClass0P3.A00;
        this.A0U = new C87303qW(this);
        this.A0X = new C87313qX(this);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3L, 0, 0);
        try {
            int color = obtainStyledAttributes.getColor(5, -7829368);
            this.A0c = obtainStyledAttributes.getColor(3, -3355444);
            int color2 = obtainStyledAttributes.getColor(0, -1);
            this.A0a = obtainStyledAttributes.getDimension(2, 5.0f);
            this.A0Z = obtainStyledAttributes.getDimension(1, 5.0f);
            this.A0b = obtainStyledAttributes.getDimension(8, 5.0f);
            this.A05 = (long) obtainStyledAttributes.getInteger(6, 15000);
            this.A0d = obtainStyledAttributes.getResourceId(9, C0003R.style.GradientPatternStyle);
            Context context2 = getContext();
            int color3 = obtainStyledAttributes.getColor(7, C019000b.A00(context2, C0003R.color.camera_shutter_button_outer_border_shadow_color));
            obtainStyledAttributes.recycle();
            C77523a6 r0 = new C77523a6(context);
            this.A0W = r0;
            setShutterButtonRecordingStyle(r0);
            Paint paint = new Paint(1);
            this.A0h = paint;
            paint.setColor(color);
            this.A0h.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint(this.A0h);
            this.A0g = paint2;
            paint2.setStyle(Paint.Style.FILL);
            Paint paint3 = new Paint(this.A0h);
            this.A0f = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            this.A0f.setColor(color2);
            this.A0f.setStrokeCap(Paint.Cap.ROUND);
            this.A0f.setStrokeWidth(this.A0a);
            this.A0f.setShadowLayer((float) getResources().getDimensionPixelSize(C0003R.dimen.camera_shutter_button_outer_border_shadow_radius), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, color3);
            Paint paint4 = new Paint(1);
            this.A0i = paint4;
            paint4.setStyle(Paint.Style.STROKE);
            this.A0i.setStrokeCap(Paint.Cap.ROUND);
            this.A0i.setStrokeWidth(this.A0b);
            AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
            A002.A06(AnonymousClass1EA.A01(80.0d, 7.0d));
            A002.A05(1.0d, true);
            this.A07 = A002;
            getContext();
            Drawable A003 = C06390Ow.A00(context2, C0003R.C0004drawable.video_stop_icon);
            this.A0k = A003;
            A003.setBounds(0, 0, A003.getIntrinsicWidth(), this.A0k.getIntrinsicHeight());
            if (Build.VERSION.SDK_INT > 25) {
                setClickable(false);
                setFocusable(true);
            } else {
                setClickable(true);
            }
            setLongClickable(true);
            C33781dU.A00(this, Constants.ONE);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
