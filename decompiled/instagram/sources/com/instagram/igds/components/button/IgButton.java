package com.instagram.igds.components.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass967;
import p000X.AnonymousClass969;
import p000X.AnonymousClass96C;
import p000X.C177177hR;
import p000X.C177187hS;
import p000X.C177207hU;
import p000X.C177217hV;

public class IgButton extends FrameLayout {
    public AnonymousClass967 A00 = AnonymousClass967.MEDIUM;
    public AnonymousClass96C A01 = AnonymousClass96C.LINK;
    public String A02;
    public int A03;
    public int A04;
    public SpinnerImageView A05;
    public TextView A06;
    public AnonymousClass969 A07;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r6.equals("large") == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r6.equals("medium") == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0092, code lost:
        if (r0 == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009c, code lost:
        if (r0 == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a6, code lost:
        if (r0 == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b1, code lost:
        if (r0 == false) goto L_0x001e;
     */
    public final void A02(AttributeSet attributeSet) {
        char c;
        AnonymousClass967 r0;
        char c2;
        AnonymousClass96C r02;
        boolean z = true;
        if (attributeSet != null) {
            Context context = getContext();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2B);
            String string = obtainStyledAttributes.getString(7);
            if (string != null) {
                switch (string.hashCode()) {
                    case -1624730937:
                        boolean equals = string.equals("link_emphasized");
                        c2 = 1;
                        break;
                    case 3321850:
                        boolean equals2 = string.equals("link");
                        c2 = 0;
                        break;
                    case 102727412:
                        boolean equals3 = string.equals("label");
                        c2 = 2;
                        break;
                    case 1682604941:
                        boolean equals4 = string.equals("label_emphasized");
                        c2 = 3;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 == 0) {
                    r02 = AnonymousClass96C.LINK;
                } else if (c2 == 1) {
                    r02 = AnonymousClass96C.LINK_EMPHASIZED;
                } else if (c2 == 2) {
                    r02 = AnonymousClass96C.LABEL;
                } else if (c2 != 3) {
                    r02 = AnonymousClass96C.UNKNOWN;
                } else {
                    r02 = AnonymousClass96C.LABEL_EMPHASIZED;
                }
                this.A01 = r02;
            }
            String string2 = obtainStyledAttributes.getString(6);
            if (string2 != null) {
                int hashCode = string2.hashCode();
                if (hashCode == -1078030475) {
                    c = 0;
                } else if (hashCode == 102742843) {
                    c = 1;
                }
                c = 65535;
                if (c == 0) {
                    r0 = AnonymousClass967.MEDIUM;
                } else if (c != 1) {
                    r0 = AnonymousClass967.UNKNOWN;
                } else {
                    r0 = AnonymousClass967.LARGE;
                }
                this.A00 = r0;
            }
            int resourceId = obtainStyledAttributes.getResourceId(5, 0);
            if (resourceId != 0) {
                getContext();
                this.A02 = context.getString(resourceId);
            }
            z = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
        A03(z);
    }

    public final void A01() {
        switch (this.A01.ordinal()) {
            case 0:
                this.A07 = new C177217hV();
                break;
            case 1:
                this.A07 = new C177207hU();
                break;
            case 2:
                this.A07 = new C177177hR();
                break;
            case 3:
                this.A07 = new C177187hS();
                break;
        }
        this.A07.A02(this.A06, getResources());
        this.A07.A03(this.A05);
    }

    public final void A03(boolean z) {
        int i;
        int i2;
        int i3;
        Context context = getContext();
        TextView textView = new TextView(context);
        this.A06 = textView;
        textView.setGravity(17);
        this.A06.setTypeface((Typeface) null, 1);
        TextView textView2 = this.A06;
        Resources resources = getResources();
        textView2.setTextSize(0, resources.getDimension(C0003R.dimen.ig_button_text_size));
        setText(this.A02);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.A06, layoutParams);
        getContext();
        SpinnerImageView spinnerImageView = new SpinnerImageView(context);
        this.A05 = spinnerImageView;
        spinnerImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A05.setVisibility(8);
        if (this.A00 == AnonymousClass967.LARGE) {
            getResources();
            i = C0003R.dimen.large_spinner_size;
        } else {
            getResources();
            i = C0003R.dimen.medium_spinner_size;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams2.gravity = 17;
        addView(this.A05, layoutParams2);
        A01();
        if (this.A00 == AnonymousClass967.LARGE) {
            getResources();
            i2 = C0003R.dimen.large_height;
        } else {
            getResources();
            i2 = C0003R.dimen.medium_height;
        }
        this.A03 = resources.getDimensionPixelSize(i2);
        if (this.A00 == AnonymousClass967.LARGE) {
            getResources();
            i3 = C0003R.dimen.large_horizontal_text_margin;
        } else {
            getResources();
            i3 = C0003R.dimen.medium_horizontal_text_margin;
        }
        this.A04 = resources.getDimensionPixelSize(i3);
        setWillNotDraw(false);
        setEnabled(z);
    }

    public void onMeasure(int i, int i2) {
        measureChild(this.A06, i, i2);
        measureChild(this.A05, i, i2);
        int measuredWidth = this.A06.getMeasuredWidth();
        int measuredWidth2 = this.A05.getMeasuredWidth();
        int i3 = this.A04 << 1;
        int max = Math.max(measuredWidth + i3, measuredWidth2 + i3);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            max = Math.max(View.MeasureSpec.getSize(i), max);
        }
        this.A07.A00(max, this.A03);
        setMeasuredDimension(max, this.A03);
    }

    public void setLoading(boolean z) {
        this.A07.A05(z, this.A06, this.A05);
        setEnabled(!z);
    }

    public void setStyle(AnonymousClass96C r2) {
        if (this.A01 != r2) {
            this.A01 = r2;
            A01();
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.A07.A01(canvas);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A07.A04(z, this.A06, this);
    }

    public void setPressed(boolean z) {
        if (isPressed() != z) {
            this.A07.A06(z, this.A06, this);
        }
        super.setPressed(z);
    }

    public IgButton(Context context) {
        super(context);
        A02((AttributeSet) null);
    }

    public IgButton(Context context, AnonymousClass96C r3, AnonymousClass967 r4, String str) {
        super(context);
        this.A01 = r3;
        this.A00 = r4;
        this.A02 = str;
        A03(true);
    }

    public IgButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02(attributeSet);
    }

    public IgButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02(attributeSet);
    }

    public void setText(int i) {
        setText(getContext().getString(i));
    }

    public void setText(String str) {
        this.A02 = str;
        if (str != null) {
            this.A06.setText(str);
            if (TextUtils.isEmpty(getContentDescription())) {
                setContentDescription(getContext().getString(C0003R.string.button_description_placeholder, new Object[]{this.A02}));
            }
        }
    }
}
