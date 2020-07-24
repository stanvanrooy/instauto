package com.instagram.igds.components.segmentedtabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import p000X.AnonymousClass1EM;
import p000X.C019000b;
import p000X.C220439eh;
import p000X.C220559et;
import p000X.C25913Bc3;
import p000X.CIT;
import p000X.CIU;
import p000X.CIV;
import p000X.CIW;

public class IgSegmentedTabLayout extends HorizontalScrollView {
    public int A00;
    public int A01;
    public CIT A02;
    public CIV A03;
    public ViewPager A04;

    private void setTabOnClickListener(View view) {
        view.setOnClickListener(new CIW(this));
        if (getChildCount() == 1) {
            this.A02.setSelectedIndex(0);
        }
    }

    public final void A00(Context context) {
        this.A02 = new CIT(context);
        if (this.A03 == null) {
            this.A03 = CIV.FIXED;
        }
        setBackgroundColor(C019000b.A00(context, C0003R.color.igds_secondary_background));
        super.addView(this.A02, 0, new FrameLayout.LayoutParams(-1, -2));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setWillNotDraw(false);
    }

    public final void A01(C220559et r3, View.OnClickListener onClickListener) {
        C220439eh r1 = new C220439eh(getContext(), r3);
        addView(r1);
        if (onClickListener != null) {
            r1.setOnClickListener(onClickListener);
        }
    }

    public int getSelectedIndex() {
        ViewPager viewPager = this.A04;
        if (viewPager != null) {
            return viewPager.getCurrentItem();
        }
        return this.A02.A01;
    }

    public void setSelectedIndex(int i) {
        if (i < this.A02.getChildCount()) {
            View childAt = this.A02.getChildAt(i);
            ViewPager viewPager = this.A04;
            if (viewPager == null) {
                smoothScrollBy((int) ((((float) childAt.getLeft()) - ((float) ((getWidth() - childAt.getWidth()) >> 1))) - ((float) getScrollX())), 0);
            } else {
                viewPager.setCurrentItem(i);
            }
            this.A02.setSelectedIndex(i);
        }
    }

    public void setViewPager(ViewPager viewPager) {
        this.A04 = viewPager;
        viewPager.A0K(new CIU(this));
    }

    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(C0003R.dimen.segmented_tab_height), C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
        super.onMeasure(i, makeMeasureSpec);
        if (this.A03 == CIV.FIXED && getChildCount() == 1) {
            getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), C25913Bc3.MAX_SIGNED_POWER_OF_TWO), makeMeasureSpec);
        }
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.A02.invalidate();
    }

    public IgSegmentedTabLayout(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public IgSegmentedTabLayout(Context context, CIV civ) {
        super(context);
        this.A03 = CIV.FIXED;
        this.A01 = 0;
        this.A00 = 0;
        this.A03 = civ;
        A00(context);
    }

    public IgSegmentedTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IgSegmentedTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = CIV.FIXED;
        this.A01 = 0;
        this.A00 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2P);
            this.A03 = CIV.values()[obtainStyledAttributes.getInt(0, 0)];
            obtainStyledAttributes.recycle();
        }
        A00(context);
    }

    public final void addView(View view) {
        if (view instanceof C220439eh) {
            CIT.A00((C220439eh) view, this.A03);
            this.A02.addView(view);
            setTabOnClickListener(view);
            return;
        }
        throw new IllegalArgumentException("TabContainer supports children only of TabView type.");
    }

    public final void addView(View view, int i) {
        if (view instanceof C220439eh) {
            CIT.A00((C220439eh) view, this.A03);
            this.A02.addView(view, i);
            setTabOnClickListener(view);
            return;
        }
        throw new IllegalArgumentException("TabContainer supports children only of TabView type.");
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof C220439eh) {
            CIT.A00((C220439eh) view, this.A03);
            this.A02.addView(view, i, layoutParams);
            setTabOnClickListener(view);
            return;
        }
        throw new IllegalArgumentException("TabContainer supports children only of TabView type.");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof C220439eh) {
            CIT.A00((C220439eh) view, this.A03);
            this.A02.addView(view, layoutParams);
            setTabOnClickListener(view);
            return;
        }
        throw new IllegalArgumentException("TabContainer supports children only of TabView type.");
    }
}
