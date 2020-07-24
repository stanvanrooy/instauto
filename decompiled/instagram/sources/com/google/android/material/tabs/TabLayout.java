package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1Q6;
import p000X.AnonymousClass1Q7;
import p000X.AnonymousClass1Q8;
import p000X.AnonymousClass3A0;
import p000X.AnonymousClass3A1;
import p000X.AnonymousClass3A2;
import p000X.AnonymousClass3A3;
import p000X.AnonymousClass3Af;
import p000X.C104894fz;
import p000X.C2111898z;
import p000X.C25913Bc3;
import p000X.C26061Bl;
import p000X.C474223w;
import p000X.C711939j;
import p000X.C712039k;
import p000X.C712739t;
import p000X.C712839u;
import p000X.C713239z;
import p000X.C71353Ae;
import p000X.C71883Cn;

@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {
    public static final AnonymousClass1Q8 A0d = new AnonymousClass1Q6(16);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public ColorStateList A0A;
    public ColorStateList A0B;
    public ColorStateList A0C;
    public Drawable A0D;
    public ViewPager A0E;
    public boolean A0F;
    public boolean A0G;
    public int A0H;
    public int A0I;
    public boolean A0J;
    public int A0K;
    public ValueAnimator A0L;
    public DataSetObserver A0M;
    public C71883Cn A0N;
    public AnonymousClass3A3 A0O;
    public AnonymousClass3A1 A0P;
    public AnonymousClass3A1 A0Q;
    public C71353Ae A0R;
    public C713239z A0S;
    public boolean A0T;
    public final int A0U;
    public final RectF A0V;
    public final AnonymousClass1Q8 A0W;
    public final C712739t A0X;
    public final ArrayList A0Y;
    public final ArrayList A0Z;
    public final int A0a;
    public final int A0b;
    public final int A0c;

    private void A03(int i) {
        boolean z;
        if (i != -1) {
            if (getWindowToken() != null && isLaidOut()) {
                C712739t r3 = this.A0X;
                int childCount = r3.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        z = false;
                        break;
                    } else if (r3.getChildAt(i2).getWidth() <= 0) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    int scrollX = getScrollX();
                    int A002 = A00(i, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    if (scrollX != A002) {
                        A02();
                        this.A0L.setIntValues(new int[]{scrollX, A002});
                        this.A0L.start();
                    }
                    this.A0X.A02(i, this.A03);
                    return;
                }
            }
            A0B(i, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, true, true);
        }
    }

    private void A05(ViewPager viewPager, boolean z) {
        List list;
        List list2;
        ViewPager viewPager2 = this.A0E;
        if (viewPager2 != null) {
            C713239z r1 = this.A0S;
            if (!(r1 == null || (list2 = viewPager2.A0B) == null)) {
                list2.remove(r1);
            }
            AnonymousClass3A3 r12 = this.A0O;
            if (!(r12 == null || (list = this.A0E.A0A) == null)) {
                list.remove(r12);
            }
        }
        AnonymousClass3A1 r3 = this.A0P;
        if (r3 != null) {
            this.A0Y.remove(r3);
            this.A0P = null;
        }
        if (viewPager != null) {
            this.A0E = viewPager;
            if (this.A0S == null) {
                this.A0S = new C713239z(this);
            }
            C713239z r13 = this.A0S;
            r13.A01 = 0;
            r13.A00 = 0;
            viewPager.A0K(r13);
            AnonymousClass3A0 r14 = new AnonymousClass3A0(viewPager);
            this.A0P = r14;
            if (!this.A0Y.contains(r14)) {
                this.A0Y.add(r14);
            }
            C71883Cn adapter = viewPager.getAdapter();
            if (adapter != null) {
                A0D(adapter, true);
            }
            if (this.A0O == null) {
                this.A0O = new AnonymousClass3A3(this);
            }
            AnonymousClass3A3 r15 = this.A0O;
            r15.A00 = true;
            if (viewPager.A0A == null) {
                viewPager.A0A = new ArrayList();
            }
            viewPager.A0A.add(r15);
            A0B(viewPager.getCurrentItem(), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, true, true);
        } else {
            this.A0E = null;
            A0D((C71883Cn) null, false);
        }
        this.A0T = z;
    }

    public final void A0B(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.A0X.getChildCount()) {
            if (z2) {
                C712739t r1 = this.A0X;
                ValueAnimator valueAnimator = r1.A05;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    r1.A05.cancel();
                }
                r1.A04 = i;
                r1.A00 = f;
                C712739t.A00(r1);
            }
            ValueAnimator valueAnimator2 = this.A0L;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.A0L.cancel();
            }
            scrollTo(A00(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public final void A0C(int i, int i2) {
        setTabTextColors(new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i}));
    }

    public final void A0G(boolean z) {
        for (int i = 0; i < this.A0X.getChildCount(); i++) {
            View childAt = this.A0X.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            A04((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r5 = (p000X.AnonymousClass3Af) r5;
     */
    public final void onDraw(Canvas canvas) {
        AnonymousClass3Af r5;
        Drawable drawable;
        for (int i = 0; i < this.A0X.getChildCount(); i++) {
            View childAt = this.A0X.getChildAt(i);
            if ((childAt instanceof AnonymousClass3Af) && (drawable = r5.A00) != null) {
                drawable.setBounds(r5.getLeft(), r5.getTop(), r5.getRight(), r5.getBottom());
                r5.A00.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void setTabsFromPagerAdapter(C71883Cn r2) {
        A0D(r2, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        A05(viewPager, false);
    }

    private int A00(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        if (this.A0H != 0) {
            return 0;
        }
        View childAt = this.A0X.getChildAt(i);
        int i4 = i + 1;
        if (i4 < this.A0X.getChildCount()) {
            view = this.A0X.getChildAt(i4);
        } else {
            view = null;
        }
        if (childAt != null) {
            i2 = childAt.getWidth();
        } else {
            i2 = 0;
        }
        if (view != null) {
            i3 = view.getWidth();
        }
        int left = (childAt.getLeft() + (i2 >> 1)) - (getWidth() >> 1);
        int i5 = (int) (((float) (i2 + i3)) * 0.5f * f);
        if (getLayoutDirection() == 0) {
            return left + i5;
        }
        return left - i5;
    }

    private void A01() {
        int i;
        if (this.A0H == 0) {
            i = Math.max(0, this.A0K - this.A07);
        } else {
            i = 0;
        }
        this.A0X.setPaddingRelative(i, 0, 0, 0);
        int i2 = this.A0H;
        if (i2 == 0) {
            this.A0X.setGravity(8388611);
        } else if (i2 == 1) {
            this.A0X.setGravity(1);
        }
        A0G(true);
    }

    private void A02() {
        if (this.A0L == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.A0L = valueAnimator;
            valueAnimator.setInterpolator(C2111898z.A02);
            this.A0L.setDuration((long) this.A03);
            this.A0L.addUpdateListener(new C104894fz(this));
        }
    }

    private void A04(LinearLayout.LayoutParams layoutParams) {
        if (this.A0H == 1 && this.A02 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    private int getDefaultHeight() {
        int size = this.A0Z.size();
        for (int i = 0; i < size; i++) {
            C71353Ae r0 = (C71353Ae) this.A0Z.get(i);
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.A0b;
        if (i != -1) {
            return i;
        }
        if (this.A0H == 0) {
            return this.A0c;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.A0X.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        int childCount = this.A0X.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.A0X.getChildAt(i2);
                boolean z = true;
                boolean z2 = false;
                if (i2 == i) {
                    z2 = true;
                }
                childAt.setSelected(z2);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
            }
        }
    }

    public final C71353Ae A07() {
        AnonymousClass3Af r1;
        CharSequence charSequence;
        C71353Ae r2 = (C71353Ae) A0d.A2N();
        if (r2 == null) {
            r2 = new C71353Ae();
        }
        r2.A03 = this;
        AnonymousClass1Q8 r0 = this.A0W;
        if (r0 != null) {
            r1 = (AnonymousClass3Af) r0.A2N();
        } else {
            r1 = null;
        }
        if (r1 == null) {
            r1 = new AnonymousClass3Af(this, getContext());
        }
        if (r2 != r1.A06) {
            r1.A06 = r2;
            r1.A02();
        }
        r1.setFocusable(true);
        r1.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty((CharSequence) null)) {
            charSequence = r2.A04;
        } else {
            charSequence = null;
        }
        r1.setContentDescription(charSequence);
        r2.A02 = r1;
        return r2;
    }

    public final C71353Ae A08(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C71353Ae) this.A0Z.get(i);
    }

    public final void A0A() {
        for (int childCount = this.A0X.getChildCount() - 1; childCount >= 0; childCount--) {
            AnonymousClass3Af r2 = (AnonymousClass3Af) this.A0X.getChildAt(childCount);
            this.A0X.removeViewAt(childCount);
            if (r2 != null) {
                if (null != r2.A06) {
                    r2.A06 = null;
                    r2.A02();
                }
                r2.setSelected(false);
                this.A0W.BaL(r2);
            }
            requestLayout();
        }
        Iterator it = this.A0Z.iterator();
        while (it.hasNext()) {
            C71353Ae r22 = (C71353Ae) it.next();
            it.remove();
            r22.A03 = null;
            r22.A02 = null;
            r22.A05 = null;
            r22.A04 = null;
            r22.A00 = -1;
            r22.A01 = null;
            A0d.BaL(r22);
        }
        this.A0R = null;
    }

    public final void A0D(C71883Cn r3, boolean z) {
        DataSetObserver dataSetObserver;
        C71883Cn r1 = this.A0N;
        if (!(r1 == null || (dataSetObserver = this.A0M) == null)) {
            r1.unregisterDataSetObserver(dataSetObserver);
        }
        this.A0N = r3;
        if (z && r3 != null) {
            if (this.A0M == null) {
                this.A0M = new AnonymousClass3A2(this);
            }
            r3.registerDataSetObserver(this.A0M);
        }
        A09();
    }

    public final void A0E(C71353Ae r8) {
        int size = this.A0Z.size();
        if (r8.A03 == this) {
            r8.A00 = size;
            this.A0Z.add(size, r8);
            int size2 = this.A0Z.size();
            while (true) {
                size++;
                if (size < size2) {
                    ((C71353Ae) this.A0Z.get(size)).A00 = size;
                } else {
                    AnonymousClass3Af r6 = r8.A02;
                    C712739t r5 = this.A0X;
                    int i = r8.A00;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                    A04(layoutParams);
                    r5.addView(r6, i, layoutParams);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
    }

    public final void A0F(C71353Ae r8, boolean z) {
        int i;
        C71353Ae r6 = this.A0R;
        if (r6 != r8) {
            if (r8 != null) {
                i = r8.A00;
            } else {
                i = -1;
            }
            if (z) {
                if ((r6 == null || r6.A00 == -1) && i != -1) {
                    A0B(i, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, true, true);
                } else {
                    A03(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.A0R = r8;
            if (r6 != null) {
                for (int size = this.A0Y.size() - 1; size >= 0; size--) {
                    this.A0Y.get(size);
                }
            }
            if (r8 != null) {
                for (int size2 = this.A0Y.size() - 1; size2 >= 0; size2--) {
                    ((AnonymousClass3A1) this.A0Y.get(size2)).BQm(r8);
                }
            }
        } else if (r6 != null) {
            for (int size3 = this.A0Y.size() - 1; size3 >= 0; size3--) {
                this.A0Y.get(size3);
            }
            A03(r8.A00);
        }
    }

    public int getSelectedTabPosition() {
        C71353Ae r0 = this.A0R;
        if (r0 != null) {
            return r0.A00;
        }
        return -1;
    }

    public int getTabCount() {
        return this.A0Z.size();
    }

    public void setInlineLabel(boolean z) {
        ImageView imageView;
        if (this.A0J != z) {
            this.A0J = z;
            for (int i = 0; i < this.A0X.getChildCount(); i++) {
                View childAt = this.A0X.getChildAt(i);
                if (childAt instanceof AnonymousClass3Af) {
                    AnonymousClass3Af r2 = (AnonymousClass3Af) childAt;
                    r2.setOrientation(r2.A08.A0J ^ true ? 1 : 0);
                    TextView textView = r2.A04;
                    if (textView == null && r2.A02 == null) {
                        textView = r2.A05;
                        imageView = r2.A03;
                    } else {
                        imageView = r2.A02;
                    }
                    AnonymousClass3Af.A01(r2, textView, imageView);
                }
            }
            A01();
        }
    }

    public void setOnTabSelectedListener(AnonymousClass3A1 r3) {
        AnonymousClass3A1 r1 = this.A0Q;
        if (r1 != null) {
            this.A0Y.remove(r1);
        }
        this.A0Q = r3;
        if (r3 != null && !this.A0Y.contains(r3)) {
            this.A0Y.add(r3);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        C712739t r1 = this.A0X;
        if (r1.A07.getColor() != i) {
            r1.A07.setColor(i);
            AnonymousClass1E1.A0I(r1);
        }
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            AnonymousClass1E1.A0I(this.A0X);
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        C712739t r1 = this.A0X;
        if (r1.A03 != i) {
            r1.A03 = i;
            AnonymousClass1E1.A0I(r1);
        }
    }

    public void setTabGravity(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            A01();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.A0A != colorStateList) {
            this.A0A = colorStateList;
            int size = this.A0Z.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass3Af r0 = ((C71353Ae) this.A0Z.get(i)).A02;
                if (r0 != null) {
                    r0.A02();
                }
            }
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.A0F = z;
        AnonymousClass1E1.A0I(this.A0X);
    }

    public void setTabMode(int i) {
        if (i != this.A0H) {
            this.A0H = i;
            A01();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.A0B != colorStateList) {
            this.A0B = colorStateList;
            for (int i = 0; i < this.A0X.getChildCount(); i++) {
                View childAt = this.A0X.getChildAt(i);
                if (childAt instanceof AnonymousClass3Af) {
                    AnonymousClass3Af.A00((AnonymousClass3Af) childAt, getContext());
                }
            }
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.A0C != colorStateList) {
            this.A0C = colorStateList;
            int size = this.A0Z.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass3Af r0 = ((C71353Ae) this.A0Z.get(i)).A02;
                if (r0 != null) {
                    r0.A02();
                }
            }
        }
    }

    public void setUnboundedRipple(boolean z) {
        if (this.A0G != z) {
            this.A0G = z;
            for (int i = 0; i < this.A0X.getChildCount(); i++) {
                View childAt = this.A0X.getChildAt(i);
                if (childAt instanceof AnonymousClass3Af) {
                    AnonymousClass3Af.A00((AnonymousClass3Af) childAt, getContext());
                }
            }
        }
    }

    public final int A06(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public final void A09() {
        int currentItem;
        A0A();
        C71883Cn r0 = this.A0N;
        if (r0 != null) {
            int count = r0.getCount();
            for (int i = 0; i < count; i++) {
                C71353Ae A072 = A07();
                A072.A00(this.A0N.getPageTitle(i));
                A0E(A072);
            }
            ViewPager viewPager = this.A0E;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                A0F(A08(currentItem), true);
            }
        }
    }

    public int getTabGravity() {
        return this.A02;
    }

    public ColorStateList getTabIconTint() {
        return this.A0A;
    }

    public int getTabIndicatorGravity() {
        return this.A04;
    }

    public int getTabMaxWidth() {
        return this.A0I;
    }

    public int getTabMode() {
        return this.A0H;
    }

    public ColorStateList getTabRippleColor() {
        return this.A0B;
    }

    public Drawable getTabSelectedIndicator() {
        return this.A0D;
    }

    public ColorStateList getTabTextColors() {
        return this.A0C;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(-1891590377);
        super.onAttachedToWindow();
        if (this.A0E == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                A05((ViewPager) parent, true);
            }
        }
        AnonymousClass0Z0.A0D(77190589, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-1530616597);
        super.onDetachedFromWindow();
        if (this.A0T) {
            setupWithViewPager((ViewPager) null);
            this.A0T = false;
        }
        AnonymousClass0Z0.A0D(481970430, A062);
    }

    public final void onMeasure(int i, int i2) {
        int A062 = A06(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(A062, View.MeasureSpec.getSize(i2)), C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(A062, C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.A0a;
            if (i3 <= 0) {
                i3 = size - A06(56);
            }
            this.A0I = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            boolean z = false;
            View childAt = getChildAt(0);
            int i4 = this.A0H;
            if (i4 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : !(i4 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth())) {
                z = true;
            }
            if (z) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), C25913Bc3.MAX_SIGNED_POWER_OF_TWO), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        A02();
        this.A0L.addListener(animatorListener);
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C474223w.A00(getContext(), i));
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C474223w.A00(getContext(), i));
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    public TabLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0003R.attr.tabStyle);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0086, code lost:
        r0 = p000X.C474223w.A01(r9, (r0 = r2.getResourceId(5, 0)));
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(r9, r10, r12);
        int resourceId;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        Context context2 = context;
        this.A0Z = new ArrayList();
        this.A0V = new RectF();
        this.A0I = Integer.MAX_VALUE;
        this.A0Y = new ArrayList();
        this.A0W = new AnonymousClass1Q7(12);
        setHorizontalScrollBarEnabled(false);
        C712739t r3 = new C712739t(this, context2);
        this.A0X = r3;
        super.addView(r3, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray A002 = C711939j.A00(context2, attributeSet2, C712039k.A0P, i2, 2131886888, 22);
        C712739t r6 = this.A0X;
        int dimensionPixelSize = A002.getDimensionPixelSize(10, -1);
        if (r6.A03 != dimensionPixelSize) {
            r6.A03 = dimensionPixelSize;
            AnonymousClass1E1.A0I(r6);
        }
        C712739t r62 = this.A0X;
        int color = A002.getColor(7, 0);
        if (r62.A07.getColor() != color) {
            r62.A07.setColor(color);
            AnonymousClass1E1.A0I(r62);
        }
        Drawable drawable = (!A002.hasValue(5) || resourceId == 0 || drawable == null) ? A002.getDrawable(5) : drawable;
        setSelectedTabIndicator(drawable);
        setSelectedTabIndicatorGravity(A002.getInt(9, 0));
        setTabIndicatorFullWidth(A002.getBoolean(8, true));
        int dimensionPixelSize2 = A002.getDimensionPixelSize(15, 0);
        this.A05 = dimensionPixelSize2;
        this.A06 = dimensionPixelSize2;
        this.A08 = dimensionPixelSize2;
        this.A07 = dimensionPixelSize2;
        this.A07 = A002.getDimensionPixelSize(18, dimensionPixelSize2);
        this.A08 = A002.getDimensionPixelSize(19, this.A08);
        this.A06 = A002.getDimensionPixelSize(17, this.A06);
        this.A05 = A002.getDimensionPixelSize(16, this.A05);
        int resourceId2 = A002.getResourceId(22, 2131886770);
        this.A09 = resourceId2;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, C26061Bl.A0b);
        try {
            this.A01 = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.A0C = C712839u.A00(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (A002.hasValue(23)) {
                this.A0C = C712839u.A00(context2, A002, 23);
            }
            if (A002.hasValue(21)) {
                this.A0C = new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{A002.getColor(21, 0), this.A0C.getDefaultColor()});
            }
            this.A0A = C712839u.A00(context2, A002, 3);
            A002.getInt(4, -1);
            this.A0B = C712839u.A00(context2, A002, 20);
            this.A03 = A002.getInt(6, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
            this.A0b = A002.getDimensionPixelSize(13, -1);
            this.A0a = A002.getDimensionPixelSize(12, -1);
            this.A0U = A002.getResourceId(0, 0);
            this.A0K = A002.getDimensionPixelSize(1, 0);
            this.A0H = A002.getInt(14, 1);
            this.A02 = A002.getInt(2, 0);
            this.A0J = A002.getBoolean(11, false);
            this.A0G = A002.getBoolean(24, false);
            A002.recycle();
            Resources resources = getResources();
            this.A00 = (float) resources.getDimensionPixelSize(C0003R.dimen.design_tab_text_size_2line);
            this.A0c = resources.getDimensionPixelSize(C0003R.dimen.design_tab_scrollable_min_width);
            A01();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C474223w.A01(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.A0D != drawable) {
            this.A0D = drawable;
            AnonymousClass1E1.A0I(this.A0X);
        }
    }
}
