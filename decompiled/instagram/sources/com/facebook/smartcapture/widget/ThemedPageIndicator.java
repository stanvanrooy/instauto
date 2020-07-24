package com.facebook.smartcapture.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.C158556po;
import p000X.C158566pp;
import p000X.C213009Go;
import p000X.C25913Bc3;
import p000X.C44611wS;
import p000X.C71883Cn;

public class ThemedPageIndicator extends View {
    public C44611wS A00;
    public float A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public float A02 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public int A03 = 0;
    public int A04 = 0;
    public ViewPager A05;
    public final DataSetObserver A06 = new C158566pp(this);
    public final Paint A07 = new Paint(1);
    public final Paint A08 = new Paint(1);
    public final C44611wS A09 = new C158556po(this);

    public static void A01(ThemedPageIndicator themedPageIndicator) {
        C71883Cn adapter;
        ViewPager viewPager = themedPageIndicator.A05;
        if (viewPager == null || (adapter = viewPager.getAdapter()) == null) {
            themedPageIndicator.A03 = 0;
        } else {
            themedPageIndicator.A03 = adapter.getCount();
            themedPageIndicator.A04 = themedPageIndicator.A05.getCurrentItem();
            themedPageIndicator.requestLayout();
        }
        themedPageIndicator.invalidate();
    }

    public final void onMeasure(int i, int i2) {
        float f = this.A01;
        int i3 = this.A03;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((((float) i3) * f) + (this.A02 * ((float) (i3 - 1)))), C25913Bc3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec((int) (f + ((float) getPaddingTop()) + ((float) getPaddingBottom())), C25913Bc3.MAX_SIGNED_POWER_OF_TWO));
    }

    public void setViewPager(ViewPager viewPager) {
        this.A05 = viewPager;
        if (viewPager.getAdapter() != null) {
            this.A05.getAdapter().registerDataSetObserver(this.A06);
            this.A05.A0K(this.A09);
            A01(this);
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    private void A00(Context context) {
        this.A01 = context.getResources().getDimension(C0003R.dimen.sc_page_indicator_dot_size);
        this.A02 = context.getResources().getDimension(C0003R.dimen.sc_page_indicator_dot_space);
        this.A07.setStyle(Paint.Style.FILL);
        this.A07.setColor(C213009Go.A01(context, C0003R.attr.scPageIndicatorColor, C0003R.color.sc_default_page_indicator_color));
        this.A08.setColor(C213009Go.A01(context, C0003R.attr.scPageIndicatorSelectedColor, C0003R.color.sc_default_page_indicator_selected_color));
    }

    public final void onDraw(Canvas canvas) {
        Paint paint;
        int paddingStart = (int) (((float) getPaddingStart()) + (this.A01 / 2.0f));
        int measuredHeight = (int) (((float) getMeasuredHeight()) / 2.0f);
        for (int i = 0; i < this.A03; i++) {
            float f = (float) paddingStart;
            float f2 = (float) measuredHeight;
            float f3 = this.A01 / 2.0f;
            if (i == this.A04) {
                paint = this.A08;
            } else {
                paint = this.A07;
            }
            canvas.drawCircle(f, f2, f3, paint);
            paddingStart = (int) (f + this.A01 + this.A02);
        }
    }

    public void setOnPageChangeListener(C44611wS r1) {
        this.A00 = r1;
    }

    public ThemedPageIndicator(Context context) {
        super(context);
        A00(context);
    }

    public ThemedPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public ThemedPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }
}
