package com.instagram.p009ui.widget.slideouticon;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.Constants;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EM;
import p000X.C019000b;
import p000X.C06400Ox;
import p000X.C120345Eg;
import p000X.C27181Gu;
import p000X.C29761Rd;
import p000X.C38791lr;
import p000X.C38811lt;

/* renamed from: com.instagram.ui.widget.slideouticon.SlideInAndOutIconView */
public class SlideInAndOutIconView extends LinearLayout implements C38791lr {
    public C120345Eg A00;
    public C38811lt A01;
    public boolean A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public GradientDrawable A07;
    public C29761Rd A08;
    public String A09;
    public final ImageView A0A;
    public final TextView A0B;
    public final Paint A0C;
    public final RectF A0D;
    public final boolean A0E;

    private void A00(float f, float f2, float f3) {
        this.A0D.set(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f2, f3);
        this.A07.setBounds((int) f, (int) BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (int) f2, (int) f3);
    }

    public final void A01() {
        setVisibility(8);
        setAlpha(1.0f);
        this.A0B.setScaleX(1.0f);
        this.A0B.setScaleY(1.0f);
        this.A0B.setVisibility(8);
    }

    public final void A02(int i, int i2) {
        if (this.A06 != i || this.A05 != i2) {
            this.A06 = i;
            this.A05 = i2;
            this.A07.setColors(new int[]{i, i2});
        }
    }

    public final void BNl(C29761Rd r3) {
        if (r3 != C29761Rd.SLIDE_IN) {
            this.A0B.setVisibility(8);
            this.A0A.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    public final void BNn(C29761Rd r4) {
        boolean z;
        float width;
        this.A03 = this.A0D.height() + ((float) this.A0B.getWidth());
        if (r4 != C29761Rd.SLIDE_IN) {
            TextView textView = this.A0B;
            textView.setPivotY((float) (textView.getMeasuredHeight() >> 1));
            TextView textView2 = this.A0B;
            C38811lt r1 = this.A01;
            if ((r1 != C38811lt.START || this.A02) && (r1 != C38811lt.END || !this.A02)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                width = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            } else {
                width = (float) textView2.getWidth();
            }
            textView2.setPivotX(width);
        }
    }

    public final void BNp(C29761Rd r18, float f) {
        boolean z;
        C120345Eg r7 = this.A00;
        float f2 = f;
        if (r7 != null) {
            float f3 = 1.0f - f;
            setIconColor(((Integer) r7.A01.evaluate(f3, -1, Integer.valueOf(r7.A00))).intValue());
            float f4 = 1.0f - f3;
            setBackgroundAlpha(f4);
            setIconScale((float) C27181Gu.A01((double) f4, 0.0d, 1.0d, 0.8d, 1.0d));
        }
        this.A0B.setScaleX(f2);
        this.A0B.setScaleY(f2);
        float measuredWidth = ((float) this.A0B.getMeasuredWidth()) * (1.0f - f);
        C38811lt r1 = this.A01;
        if ((r1 != C38811lt.START || this.A02) && (r1 != C38811lt.END || !this.A02)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.A02) {
                this.A0A.setTranslationX(-measuredWidth);
            }
            A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A03 - measuredWidth, this.A0D.height());
        } else {
            if (!this.A02) {
                this.A0A.setTranslationX(measuredWidth);
            }
            A00(measuredWidth, this.A03, this.A0D.height());
        }
        invalidate();
    }

    public final void BOR(Integer num) {
        float height;
        if (num != Constants.ZERO) {
            setVisibility(0);
            String str = this.A09;
            if (str == null || str.isEmpty() || num != Constants.ONE) {
                this.A0B.setVisibility(8);
                height = this.A0D.height();
            } else {
                this.A0B.setVisibility(0);
                height = this.A0D.height() + ((float) this.A0B.getMeasuredWidth());
            }
            A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, height, this.A0D.height());
        }
    }

    public int getLineHeight() {
        return this.A0B.getLineHeight();
    }

    public void setBackgroundAlpha(float f) {
        this.A07.setAlpha((int) (f * 255.0f));
    }

    public void setBackgroundColor(int i) {
        this.A07.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void setIcon(Drawable drawable) {
        this.A0A.setImageDrawable(drawable);
    }

    public void setIconColor(int i) {
        this.A0A.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    public void setIconScale(float f) {
        this.A0A.setScaleX(f);
        this.A0A.setScaleY(f);
    }

    public void setTextColor(int i) {
        this.A0B.setTextColor(i);
    }

    public void setTextSize(float f) {
        this.A0B.setTextSize(0, f);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.A07 || super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    public final void B3i() {
        A01();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        GradientDrawable gradientDrawable = this.A07;
        RectF rectF = this.A0D;
        gradientDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A07.draw(canvas);
        if (this.A0E) {
            RectF rectF2 = this.A0D;
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, this.A0D.height() / 2.0f, this.A0C);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(-1561329543);
        super.onSizeChanged(i, i2, i3, i4);
        float f = (float) i2;
        A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i, f);
        if (this.A08 == C29761Rd.SLIDE_IN) {
            A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f, f);
        }
        this.A07.setCornerRadius(this.A0D.height() / 2.0f);
        AnonymousClass0Z0.A0D(2017869721, A062);
    }

    public final void B3h(float f) {
        setAlpha(f);
    }

    public final void B3j(float f) {
        setAlpha(f);
    }

    public void setSlideDirection(C38811lt r1) {
        this.A01 = r1;
    }

    public void setSlideEffect(C29761Rd r1) {
        this.A08 = r1;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public SlideInAndOutIconView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SlideInAndOutIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlideInAndOutIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0C = new Paint(1);
        this.A0D = new RectF();
        this.A01 = C38811lt.START;
        this.A08 = C29761Rd.SLIDE_OUT;
        setOrientation(0);
        Resources resources = getResources();
        Context context2 = getContext();
        int A002 = C019000b.A00(context2, C0003R.color.default_slideout_icon_text_color);
        getContext();
        this.A04 = C019000b.A00(context2, C0003R.color.default_slideout_icon_background);
        getContext();
        int A003 = C019000b.A00(context2, C0003R.color.default_slideout_icon_background_border);
        float dimension = resources.getDimension(C0003R.dimen.default_slideout_icon_text_size);
        LayoutInflater.from(context).inflate(C0003R.layout.slideout_icon, this);
        this.A0A = (ImageView) findViewById(C0003R.C0005id.slideout_iconview_icon);
        this.A0B = (TextView) findViewById(C0003R.C0005id.slideout_iconview_text);
        getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3P);
        setText(obtainStyledAttributes.getResourceId(6, 0));
        setTextSize(obtainStyledAttributes.getDimension(10, dimension));
        this.A0B.setTextColor(obtainStyledAttributes.getColor(7, A002));
        this.A0B.setPivotX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        getContext();
        boolean A022 = C06400Ox.A02(context2);
        this.A02 = A022;
        this.A0B.setPadding(A022 ? dimensionPixelSize2 : dimensionPixelSize, 0, !A022 ? dimensionPixelSize2 : dimensionPixelSize, 0);
        setIcon(obtainStyledAttributes.getDrawable(5));
        this.A06 = obtainStyledAttributes.getColor(3, this.A04);
        int color = obtainStyledAttributes.getColor(2, this.A04);
        this.A05 = color;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{this.A06, color});
        this.A07 = gradientDrawable;
        gradientDrawable.mutate();
        this.A07.setCallback(this);
        this.A0E = obtainStyledAttributes.getBoolean(1, false);
        this.A0C.setStyle(Paint.Style.STROKE);
        this.A0C.setColor(obtainStyledAttributes.getColor(0, A003));
        this.A0C.setStrokeWidth(1.0f);
        this.A0C.setAntiAlias(true);
        if (obtainStyledAttributes.hasValue(4)) {
            getContext();
            setIconColor(obtainStyledAttributes.getColor(4, C019000b.A00(context2, C0003R.color.default_slideout_icon_color)));
        }
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
    }

    public void setText(int i) {
        if (i != 0) {
            setText(getContext().getString(i));
        } else {
            setText((String) null);
        }
    }

    public void setText(String str) {
        this.A09 = str;
        if (str == null || str.isEmpty()) {
            this.A0B.setVisibility(8);
            return;
        }
        this.A0B.setText(str);
        this.A0B.setVisibility(0);
    }
}
