package com.instagram.p009ui.widget.wheelview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EM;
import p000X.C019000b;
import p000X.C26792Bsb;
import p000X.C26793Bsc;
import p000X.C26796Bsh;
import p000X.C26798Bsj;
import p000X.C26799Bsk;

/* renamed from: com.instagram.ui.widget.wheelview.WheelView */
public class WheelView extends ScrollView {
    public int[] A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public int A04 = 1;
    public int A05 = 1;
    public int A06;
    public int A07;
    public int A08;
    public Context A09;
    public Paint A0A;
    public LinearLayout A0B;
    public C26799Bsk A0C;
    public Runnable A0D;
    public List A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;

    private void A00(int i) {
        String str;
        int i2;
        int i3 = this.A03;
        int i4 = i % i3;
        int i5 = (i / i3) + this.A04;
        if (i4 > (i3 >> 1)) {
            i5++;
        }
        int childCount = this.A0B.getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            TextView textView = (TextView) this.A0B.getChildAt(i6);
            if (textView != null) {
                if (i5 == i6) {
                    textView.setTextColor(this.A0F);
                    str = (String) this.A0E.get(i6);
                    i2 = this.A0G;
                } else {
                    textView.setTextColor(this.A0J);
                    str = (String) this.A0E.get(i6);
                    i2 = this.A07;
                }
                A02(textView, str, i2);
                i6++;
            } else {
                return;
            }
        }
    }

    private void A01(Context context, AttributeSet attributeSet, int i) {
        this.A09 = context;
        setVerticalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.A0B = linearLayout;
        linearLayout.setOrientation(1);
        addView(this.A0B);
        Context context2 = getContext();
        this.A0J = C019000b.A00(context2, C0003R.color.grey_5);
        getContext();
        this.A0F = C019000b.A00(context2, C0003R.color.grey_9);
        getContext();
        this.A0H = C019000b.A00(context2, C0003R.color.grey_2);
        Resources resources = getResources();
        this.A0I = resources.getDimensionPixelSize(C0003R.dimen.selectorWidth);
        getResources();
        this.A07 = resources.getDimensionPixelSize(C0003R.dimen.font_medium);
        getResources();
        this.A06 = resources.getDimensionPixelSize(C0003R.dimen.textPadding);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A42, i, 0);
        if (obtainStyledAttributes.hasValue(1)) {
            this.A0J = obtainStyledAttributes.getColor(1, this.A0J);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.A0F = obtainStyledAttributes.getColor(2, this.A0F);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.A0H = obtainStyledAttributes.getColor(4, this.A0H);
        }
        if (obtainStyledAttributes.hasValue(5)) {
            this.A0I = obtainStyledAttributes.getDimensionPixelSize(5, this.A0I);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.A07 = obtainStyledAttributes.getDimensionPixelSize(0, this.A07);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.A06 = obtainStyledAttributes.getDimensionPixelSize(6, this.A06);
        }
        this.A0G = obtainStyledAttributes.getDimensionPixelSize(3, this.A07);
        obtainStyledAttributes.recycle();
        this.A0D = new C26792Bsb(this);
    }

    private void A02(TextView textView, String str, int i) {
        Paint paint = new Paint();
        float f = (float) i;
        paint.setTextSize(f);
        float measureText = paint.measureText(str, 0, str.length());
        if (this.A08 == 0) {
            this.A08 = ((Activity) this.A09).getWindowManager().getDefaultDisplay().getWidth();
        }
        int i2 = this.A08;
        int i3 = this.A06;
        float f2 = (float) (i2 - i3);
        if (measureText <= f2) {
            int i4 = i3 >> 1;
            textView.setPadding(i4, i3, i4, i3);
        } else {
            float f3 = (f2 * f) / measureText;
            int i5 = i3 >> 1;
            int ceil = i3 + ((int) Math.ceil((double) ((f - f3) / 2.0f)));
            textView.setPadding(i5, ceil, i5, ceil);
            f = 20.0f;
            if (f3 < 20.0f) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                f = f3;
            }
        }
        textView.setTextSize(0, f);
    }

    public static void A03(WheelView wheelView) {
        C26799Bsk bsk = wheelView.A0C;
        if (bsk != null) {
            int i = wheelView.A05;
            bsk.BM6(i, (String) wheelView.A0E.get(i));
        }
    }

    public static int[] A04(WheelView wheelView) {
        if (wheelView.A00 == null) {
            int[] iArr = new int[2];
            wheelView.A00 = iArr;
            int i = wheelView.A03;
            int i2 = wheelView.A04;
            iArr[0] = i * i2;
            iArr[1] = i * (i2 + 1);
        }
        return wheelView.A00;
    }

    public final void fling(int i) {
        super.fling(i / 3);
    }

    public int getSeletedIndex() {
        return this.A05 - this.A04;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.A08 == 0) {
            this.A08 = ((Activity) this.A09).getWindowManager().getDefaultDisplay().getWidth();
        }
        if (this.A0A == null) {
            Paint paint = new Paint();
            this.A0A = paint;
            paint.setColor(this.A0H);
            this.A0A.setStrokeWidth((float) this.A0I);
        }
        super.setBackgroundDrawable(new C26793Bsc(this));
    }

    public void setItems(List list) {
        int i;
        if (this.A0E == null) {
            this.A0E = new ArrayList();
        }
        this.A0E.clear();
        this.A0E.addAll(list);
        int i2 = 0;
        while (true) {
            i = this.A04;
            if (i2 >= i) {
                break;
            }
            this.A0E.add(0, "");
            this.A0E.add("");
            i2++;
        }
        this.A01 = (i << 1) + 1;
        this.A0B.removeAllViews();
        int i3 = 0;
        for (int i4 = 0; i4 < this.A0E.size(); i4++) {
            LinearLayout linearLayout = this.A0B;
            String str = (String) this.A0E.get(i4);
            TextView textView = new TextView(this.A09);
            textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            textView.setSingleLine(true);
            textView.setTextSize(0, (float) this.A07);
            textView.setText(str);
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            int i5 = this.A06;
            int i6 = i5 >> 1;
            textView.setPadding(i6, i5, i6, i5);
            if (!TextUtils.isEmpty(str)) {
                textView.setOnClickListener(new C26796Bsh(this, i4));
            }
            if (this.A03 == 0) {
                textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = textView.getMeasuredHeight();
                this.A03 = measuredHeight;
                this.A0B.setLayoutParams(new FrameLayout.LayoutParams(-1, measuredHeight * this.A01));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
                setLayoutParams(new LinearLayout.LayoutParams(layoutParams.width, this.A03 * this.A01, layoutParams.weight));
            }
            A02(textView, str, this.A07);
            linearLayout.addView(textView);
        }
        int i7 = this.A05 - this.A04;
        if (i7 > 0) {
            i3 = i7 * this.A03;
        }
        A00(i3);
    }

    public void setSelection(int i) {
        this.A05 = this.A04 + i;
        post(new C26798Bsj(this, i));
    }

    public int getOffset() {
        return this.A04;
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        A00(i2);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(1616491277);
        super.onSizeChanged(i, i2, i3, i4);
        this.A08 = i;
        setBackgroundDrawable((Drawable) null);
        AnonymousClass0Z0.A0D(1052833682, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0Z0.A05(1485503782);
        if (motionEvent.getAction() == 1) {
            this.A02 = getScrollY();
            postDelayed(this.A0D, 50);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0Z0.A0C(-2136235628, A052);
        return onTouchEvent;
    }

    public void setOffset(int i) {
        this.A04 = i;
    }

    public void setOnWheelViewListener(C26799Bsk bsk) {
        this.A0C = bsk;
    }

    public WheelView(Context context) {
        super(context);
        A01(context, (AttributeSet) null, 0);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet, 0);
    }

    public WheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context, attributeSet, i);
    }
}
