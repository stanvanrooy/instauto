package com.instagram.p009ui.widget.gradientspinneravatarview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.p009ui.widget.gradientspinner.GradientSpinner;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass46K;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C06400Ox;
import p000X.C35981hF;
import p000X.C37361jX;

/* renamed from: com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView */
public class GradientSpinnerAvatarView extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Drawable A08;
    public float A09;
    public float A0A;
    public int A0B;
    public int A0C;
    public Paint A0D;
    public RectF A0E;
    public Drawable A0F;
    public final int A0G;
    public final CircularImageView A0H;
    public final CircularImageView A0I;
    public final GradientSpinner A0J;
    public final GradientSpinner A0K;
    public final boolean A0L;
    public final int A0M;
    public final boolean A0N;
    public final boolean A0O;

    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas);
        Drawable drawable = this.A08;
        if (drawable != null) {
            A00(canvas2, drawable, drawable.getIntrinsicWidth(), this.A08.getIntrinsicHeight(), this.A09);
        }
        Drawable drawable2 = this.A0F;
        if (drawable2 != null) {
            Rect bounds = drawable2.getBounds();
            int i = bounds.right - bounds.left;
            int i2 = bounds.bottom - bounds.top;
            float f = this.A0A;
            if (f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f = 0.03f;
            }
            A00(canvas2, this.A0F, i, i2, f);
        }
    }

    public void setGradientSpinnerActivated(boolean z) {
        if (z) {
            this.A0J.A04();
            if (this.A03 == 2) {
                this.A0K.A04();
                return;
            }
            return;
        }
        this.A0J.A06();
        if (this.A03 == 2) {
            this.A0K.A06();
        }
    }

    public void setGradientSpinnerVisible(boolean z) {
        GradientSpinner gradientSpinner;
        int i;
        if (z) {
            gradientSpinner = this.A0J;
            i = 0;
        } else {
            gradientSpinner = this.A0J;
            i = 4;
        }
        gradientSpinner.setVisibility(i);
        if (this.A03 == 2) {
            this.A0K.setVisibility(i);
        }
    }

    public static void A01(GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z = false;
        if (gradientSpinnerAvatarView.A03 == 2) {
            z = true;
        }
        if (z) {
            i = gradientSpinnerAvatarView.A05;
        } else {
            i = gradientSpinnerAvatarView.A07;
        }
        if (z) {
            i2 = gradientSpinnerAvatarView.A04;
        } else {
            i2 = gradientSpinnerAvatarView.A06;
        }
        if (z) {
            i3 = gradientSpinnerAvatarView.A0C;
        } else {
            i3 = 0;
        }
        if (z) {
            i4 = gradientSpinnerAvatarView.A0M;
        } else {
            i4 = 0;
        }
        int i6 = 17;
        if (z) {
            i6 = 51;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gradientSpinnerAvatarView.A0J.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) gradientSpinnerAvatarView.A0H.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i2;
        layoutParams2.gravity = i6;
        layoutParams.gravity = i6;
        layoutParams2.height = i;
        layoutParams2.width = i;
        layoutParams2.leftMargin = i3;
        layoutParams2.topMargin = i4;
        if (z) {
            int i7 = (i2 - i) >> 1;
            layoutParams.topMargin = i4 - i7;
            layoutParams.leftMargin = i3 - i7;
        } else {
            layoutParams.topMargin = 0;
            layoutParams.leftMargin = 0;
        }
        if (gradientSpinnerAvatarView.A0L) {
            if (z) {
                CircularImageView circularImageView = gradientSpinnerAvatarView.A0H;
                circularImageView.setStrokeAlpha(circularImageView.A00);
            } else {
                gradientSpinnerAvatarView.A0H.setStrokeAlpha(0);
            }
        }
        gradientSpinnerAvatarView.A0J.setLayoutParams(layoutParams);
        gradientSpinnerAvatarView.A0H.setLayoutParams(layoutParams2);
        if (z) {
            if (z) {
                i5 = gradientSpinnerAvatarView.A0B;
            } else {
                i5 = 0;
            }
            int i8 = 17;
            if (z) {
                i8 = 85;
            }
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) gradientSpinnerAvatarView.A0K.getLayoutParams();
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) gradientSpinnerAvatarView.A0I.getLayoutParams();
            int i9 = i2 + i5;
            layoutParams3.height = i9;
            layoutParams3.width = i9;
            gradientSpinnerAvatarView.A0K.setPadding(i5, i5, 0, 0);
            layoutParams4.height = i;
            layoutParams4.width = i;
            layoutParams4.gravity = i8;
            layoutParams4.rightMargin = i3;
            layoutParams4.bottomMargin = i4;
            if (z) {
                int i10 = (i2 - i) >> 1;
                layoutParams3.topMargin = i4 - i10;
                layoutParams3.leftMargin = i3 - i10;
            } else {
                layoutParams3.topMargin = 0;
                layoutParams3.leftMargin = 0;
            }
            if (z) {
                CircularImageView circularImageView2 = gradientSpinnerAvatarView.A0I;
                circularImageView2.setStrokeAlpha(circularImageView2.A00);
            } else {
                gradientSpinnerAvatarView.A0I.setStrokeAlpha(0);
            }
            gradientSpinnerAvatarView.A0K.setLayoutParams(layoutParams3);
            gradientSpinnerAvatarView.A0I.setLayoutParams(layoutParams4);
        }
    }

    public static void A02(GradientSpinnerAvatarView gradientSpinnerAvatarView, AnonymousClass46K r3) {
        if (gradientSpinnerAvatarView.A0L) {
            gradientSpinnerAvatarView.A0I.setVisibility(8);
            gradientSpinnerAvatarView.A0K.setVisibility(8);
        }
        if (1 != gradientSpinnerAvatarView.A03) {
            gradientSpinnerAvatarView.A03 = 1;
            A01(gradientSpinnerAvatarView);
        }
        if (r3 != null) {
            gradientSpinnerAvatarView.A0J.setProgressState(r3.A00);
        }
    }

    public final void A03() {
        this.A0J.A05();
        if (this.A03 == 2) {
            this.A0K.A05();
        }
    }

    public final void A04() {
        this.A0J.A0A();
        if (this.A03 == 2) {
            this.A0K.A0A();
        }
    }

    public final void A05(ImageUrl imageUrl, ImageUrl imageUrl2, AnonymousClass46K r5) {
        if (this.A0L) {
            this.A0I.setUrl(imageUrl);
            if (imageUrl2 == null) {
                this.A0H.A05();
            } else {
                this.A0H.setUrl(imageUrl2);
            }
            this.A0I.setVisibility(0);
            this.A0K.setVisibility(0);
            if (2 != this.A03) {
                this.A03 = 2;
                A01(this);
            }
            if (r5 != null) {
                setProgressState(r5);
                return;
            }
            return;
        }
        throw new IllegalStateException("Params for double avatars were not passed in at initialization time");
    }

    public final void A06(ImageUrl imageUrl, AnonymousClass46K r3) {
        this.A0H.setUrl(imageUrl);
        A02(this, r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r4.A0K.A0C() == false) goto L_0x0015;
     */
    public final boolean A07() {
        boolean z;
        boolean A0C2 = this.A0J.A0C();
        if (this.A03 == 2) {
            z = true;
        }
        z = false;
        if (A0C2 || z) {
            return true;
        }
        return false;
    }

    public RectF getAvatarBounds() {
        if (this.A03 == 2) {
            return C06220Of.A0A(this);
        }
        return C06220Of.A0A(this.A0H);
    }

    public CircularImageView getBackAvatarView() {
        return this.A0H;
    }

    public GradientSpinner getBackGradientSpinner() {
        return this.A0J;
    }

    public Drawable getBadgeDrawable() {
        return this.A08;
    }

    public AnonymousClass46K getCurrentSpinnerProgressState() {
        C37361jX r0;
        C37361jX progressState = this.A0J.getProgressState();
        GradientSpinner gradientSpinner = this.A0K;
        if (gradientSpinner != null) {
            r0 = gradientSpinner.getProgressState();
        } else {
            r0 = null;
        }
        return new AnonymousClass46K(progressState, r0);
    }

    public CircularImageView getFrontAvatarView() {
        return this.A0I;
    }

    public GradientSpinner getFrontGradientSpinner() {
        return this.A0K;
    }

    public void setAvatarViewDrawable(Drawable drawable) {
        this.A0H.setImageDrawable(drawable);
        if (this.A03 == 2) {
            this.A0I.setImageDrawable(drawable);
        }
    }

    public void setBackgroundRingColor(int i) {
        this.A00 = i;
        if (this.A0L) {
            this.A0I.A0A(this.A0G, i);
            this.A0H.A0A(this.A0G, this.A00);
        }
    }

    public void setBadgeDrawable(Drawable drawable) {
        Drawable drawable2 = this.A08;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            this.A08 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                Drawable drawable3 = this.A08;
                drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), this.A08.getIntrinsicHeight());
            }
            invalidate();
        }
    }

    public void setDoubleAvatarGradientPadding(int i) {
        this.A0B = i;
        A01(this);
    }

    public void setGradientColor(C35981hF r2) {
        this.A0J.setGradientColors(r2);
        if (this.A0L) {
            this.A0K.setGradientColors(r2);
        }
    }

    public void setGradientColorRes(int i) {
        this.A0J.setGradientColors(i);
        if (this.A0L) {
            this.A0K.setGradientColors(i);
        }
    }

    public void setGradientSpinnerActiveStrokeWidth(float f) {
        this.A0J.setActiveStrokeWidth(f);
        if (this.A0L) {
            this.A0K.setActiveStrokeWidth(f);
        }
    }

    public void setGradientSpinnerInactiveStrokeWidth(float f) {
        this.A0J.setInactiveStrokeWidth(f);
        if (this.A0L) {
            this.A0K.setInactiveStrokeWidth(f);
        }
    }

    public void setPresenceBadgeDrawable(Drawable drawable) {
        Drawable drawable2 = this.A0F;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            this.A0F = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                Drawable drawable3 = this.A0F;
                drawable3.setBounds(0, 0, drawable3.getMinimumWidth(), this.A0F.getMinimumHeight());
            }
            invalidate();
        }
    }

    public void setProgressState(AnonymousClass46K r3) {
        this.A0J.setProgressState(r3.A00);
        this.A0K.setProgressState(r3.A01);
    }

    public void setRotation(float f) {
        this.A0J.setRotation(f);
        if (this.A0L) {
            this.A0K.setRotation(f);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (this.A08 == drawable || this.A0F == drawable || super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    private void A00(Canvas canvas, Drawable drawable, int i, int i2, float f) {
        float f2;
        canvas.save();
        int width = getWidth();
        int height = getHeight();
        float f3 = ((float) (height - i2)) - (((float) height) * f);
        if (this.A0N) {
            f2 = ((float) width) * f;
        } else {
            f2 = ((float) (width - i)) - (((float) width) * f);
        }
        canvas.translate(f2, f3);
        drawable.draw(canvas);
        if (this.A02 > 0) {
            if (this.A0D == null) {
                this.A0D = new Paint();
            }
            if (this.A0E == null) {
                this.A0E = new RectF();
            }
            this.A0E.set(drawable.getBounds());
            this.A0D.setStyle(Paint.Style.STROKE);
            this.A0D.setStrokeWidth((float) this.A02);
            this.A0D.setColor(this.A01);
            this.A0D.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawOval(this.A0E, this.A0D);
        }
        canvas.restore();
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(556483911);
        super.onAttachedToWindow();
        Drawable drawable = this.A08;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        Drawable drawable2 = this.A0F;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        AnonymousClass0Z0.A0D(1189109594, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(1107170153);
        super.onDetachedFromWindow();
        Drawable drawable = this.A08;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        Drawable drawable2 = this.A0F;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        AnonymousClass0Z0.A0D(1083735507, A062);
    }

    public void setBadgeDrawableMarginPercent(float f) {
        this.A09 = f;
    }

    public void setPresenceBadgeDrawableMarginPercent(float f) {
        this.A0A = f;
    }

    public GradientSpinnerAvatarView(Context context) {
        this(context, (AttributeSet) null);
    }

    public GradientSpinnerAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public GradientSpinnerAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientSpinner gradientSpinner;
        this.A09 = 0.03f;
        boolean z = false;
        this.A03 = 0;
        this.A0N = C06400Ox.A02(context);
        Context context2 = getContext();
        int A002 = C019000b.A00(context2, C0003R.color.igds_highlight_background);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A24);
        try {
            this.A06 = obtainStyledAttributes.getDimensionPixelSize(9, -1);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(4, -1);
            this.A07 = obtainStyledAttributes.getDimensionPixelSize(10, -1);
            this.A05 = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            this.A0C = obtainStyledAttributes.getDimensionPixelSize(5, -1);
            getContext();
            this.A0M = obtainStyledAttributes.getDimensionPixelSize(7, (int) C06220Of.A03(context2, 2));
            this.A0B = obtainStyledAttributes.getDimensionPixelSize(3, -1);
            this.A0O = obtainStyledAttributes.getBoolean(8, false);
            getContext();
            this.A0G = obtainStyledAttributes.getDimensionPixelSize(2, (int) C06220Of.A03(context2, 2));
            this.A00 = obtainStyledAttributes.getColor(0, C019000b.A00(context, AnonymousClass1BA.A03(context, C0003R.attr.backgroundColorPrimary)));
            boolean z2 = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
            if (!(this.A05 == -1 || this.A04 == -1 || this.A0B == -1 || this.A0C == -1)) {
                z = true;
            }
            this.A0L = z;
            if (!this.A0O || !z) {
                this.A0J = new GradientSpinner(context, attributeSet);
                CircularImageView circularImageView = new CircularImageView(context, attributeSet);
                this.A0H = circularImageView;
                circularImageView.A01 = z2;
                CircularImageView circularImageView2 = null;
                if (this.A0L) {
                    gradientSpinner = new GradientSpinner(context, attributeSet);
                } else {
                    gradientSpinner = null;
                }
                this.A0K = gradientSpinner;
                this.A0I = this.A0L ? new CircularImageView(context, attributeSet) : circularImageView2;
                addView(this.A0J);
                if (this.A0L) {
                    addView(this.A0K);
                }
                addView(this.A0H);
                this.A0H.setPlaceHolderColor(A002);
                if (this.A0L) {
                    addView(this.A0I);
                    this.A0I.setPlaceHolderColor(A002);
                }
                if (this.A0L) {
                    this.A0I.A0A(this.A0G, this.A00);
                    this.A0H.A0A(this.A0G, this.A00);
                } else if (this.A0O) {
                    getContext();
                    Context context3 = context2;
                    CircularImageView circularImageView3 = this.A0H;
                    getContext();
                    circularImageView3.A0A((int) C06220Of.A03(context2, 1), C019000b.A00(context3, C0003R.color.black_20_transparent));
                }
                this.A03 = 1;
                if (this.A0L) {
                    this.A0I.setVisibility(8);
                    this.A0K.setVisibility(8);
                }
                A01(this);
                return;
            }
            throw new IllegalStateException("showSingleAvatarBorder is only applicable to GradientSpinnerAvatarViews that support single avatar mode");
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
