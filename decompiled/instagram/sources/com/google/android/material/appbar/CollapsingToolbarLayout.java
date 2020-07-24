package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.facebook.C0003R;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass3AY;
import p000X.AnonymousClass98G;
import p000X.AnonymousClass98K;
import p000X.AnonymousClass98M;
import p000X.AnonymousClass98R;
import p000X.AnonymousClass98S;
import p000X.C019000b;
import p000X.C208718yk;
import p000X.C2111898z;
import p000X.C25913Bc3;
import p000X.C35491gS;
import p000X.C55072a1;
import p000X.C710538t;
import p000X.C711939j;
import p000X.C712039k;

public class CollapsingToolbarLayout extends FrameLayout {
    public int A00;
    public Drawable A01;
    public int A02;
    public long A03;
    public ValueAnimator A04;
    public View A05;
    public Toolbar A06;
    public C35491gS A07;
    public boolean A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public Drawable A0F;
    public View A0G;
    public C710538t A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final AnonymousClass98G A0L;
    public final Rect A0M;

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    private void A01() {
        if (this.A0K) {
            Toolbar toolbar = null;
            this.A06 = null;
            this.A05 = null;
            int i = this.A0E;
            if (i != -1) {
                Toolbar toolbar2 = (Toolbar) findViewById(i);
                this.A06 = toolbar2;
                if (toolbar2 != null) {
                    ViewParent parent = toolbar2.getParent();
                    View view = toolbar2;
                    while (parent != this && parent != null) {
                        View view2 = parent instanceof View ? (View) parent : view;
                        parent = parent.getParent();
                        view = view2;
                    }
                    this.A05 = view;
                }
            }
            if (this.A06 == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    ? childAt = getChildAt(i2);
                    if (childAt instanceof Toolbar) {
                        toolbar = childAt;
                        break;
                    }
                    i2++;
                }
                this.A06 = toolbar;
            }
            A02();
            this.A0K = false;
        }
    }

    private void A02() {
        View view;
        if (!this.A0I && (view = this.A0G) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.A0G);
            }
        }
        if (this.A0I && this.A06 != null) {
            if (this.A0G == null) {
                this.A0G = new View(getContext());
            }
            if (this.A0G.getParent() == null) {
                this.A06.addView(this.A0G, -1, -1);
            }
        }
    }

    public final void A03() {
        if (this.A0F != null || this.A01 != null) {
            boolean z = false;
            if (getHeight() + this.A00 < getScrimVisibleHeightTrigger()) {
                z = true;
            }
            setScrimsShown(z);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        Drawable drawable = this.A0F;
        if (drawable != null && this.A02 > 0) {
            View view2 = this.A05;
            boolean z2 = true;
            if (view2 == null || view2 == this ? view != this.A06 : view != view2) {
                z2 = false;
            }
            if (z2) {
                drawable.mutate().setAlpha(this.A02);
                this.A0F.draw(canvas);
                z = true;
                if (super.drawChild(canvas, view, j) && !z) {
                    return false;
                }
            }
        }
        z = false;
        return super.drawChild(canvas, view, j) ? true : true;
    }

    public int getCollapsedTitleGravity() {
        return this.A0L.A08;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.A0L.A0E;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public int getExpandedTitleGravity() {
        return this.A0L.A09;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.A0L.A0F;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.A0D;
        if (i2 >= 0) {
            return i2;
        }
        C35491gS r0 = this.A07;
        if (r0 != null) {
            i = r0.A06();
        } else {
            i = 0;
        }
        int minimumHeight = getMinimumHeight();
        if (minimumHeight > 0) {
            return Math.min((minimumHeight << 1) + i, getHeight());
        }
        return getHeight() / 3;
    }

    public CharSequence getTitle() {
        if (this.A0I) {
            return this.A0L.A0G;
        }
        return null;
    }

    public void setCollapsedTitleGravity(int i) {
        AnonymousClass98G r1 = this.A0L;
        if (r1.A08 != i) {
            r1.A08 = i;
            r1.A08();
        }
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.A0L.A0A(i);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        AnonymousClass98G r1 = this.A0L;
        if (r1.A0E != typeface) {
            r1.A0E = typeface;
            r1.A08();
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.A0F;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A0F = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.A0F.setCallback(this);
                this.A0F.setAlpha(this.A02);
            }
            AnonymousClass1E1.A0I(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setExpandedTitleGravity(int i) {
        AnonymousClass98G r1 = this.A0L;
        if (r1.A09 != i) {
            r1.A09 = i;
            r1.A08();
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.A09 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.A0A = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.A0B = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.A0C = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.A0L.A0B(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        AnonymousClass98G r1 = this.A0L;
        if (r1.A0D != colorStateList) {
            r1.A0D = colorStateList;
            r1.A08();
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        AnonymousClass98G r1 = this.A0L;
        if (r1.A0F != typeface) {
            r1.A0F = typeface;
            r1.A08();
        }
    }

    public void setScrimAlpha(int i) {
        Toolbar toolbar;
        if (i != this.A02) {
            if (!(this.A0F == null || (toolbar = this.A06) == null)) {
                AnonymousClass1E1.A0I(toolbar);
            }
            this.A02 = i;
            AnonymousClass1E1.A0I(this);
        }
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.A0D != i) {
            this.A0D = i;
            A03();
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A01 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.A01.setState(getDrawableState());
                }
                C55072a1.A05(this.A01, getLayoutDirection());
                Drawable drawable4 = this.A01;
                boolean z = false;
                if (getVisibility() == 0) {
                    z = true;
                }
                drawable4.setVisible(z, false);
                this.A01.setCallback(this);
                this.A01.setAlpha(this.A02);
            }
            AnonymousClass1E1.A0I(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setTitle(CharSequence charSequence) {
        AnonymousClass98G r1 = this.A0L;
        if (charSequence == null || !charSequence.equals(r1.A0G)) {
            r1.A0G = charSequence;
            r1.A0H = null;
            r1.A08();
        }
        setContentDescription(getTitle());
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.A0I) {
            this.A0I = z;
            setContentDescription(getTitle());
            A02();
            requestLayout();
        }
    }

    public static AnonymousClass3AY A00(View view) {
        AnonymousClass3AY r1 = (AnonymousClass3AY) view.getTag(C0003R.C0005id.view_offset_helper);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass3AY r12 = new AnonymousClass3AY(view);
        view.setTag(C0003R.C0005id.view_offset_helper, r12);
        return r12;
    }

    public final void draw(Canvas canvas) {
        int i;
        Drawable drawable;
        int A032 = AnonymousClass0Z0.A03(-1218945545);
        super.draw(canvas);
        A01();
        if (this.A06 == null && (drawable = this.A0F) != null && this.A02 > 0) {
            drawable.mutate().setAlpha(this.A02);
            this.A0F.draw(canvas);
        }
        if (this.A0I && this.A0J) {
            this.A0L.A0F(canvas);
        }
        if (this.A01 != null && this.A02 > 0) {
            C35491gS r0 = this.A07;
            if (r0 != null) {
                i = r0.A06();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.A01.setBounds(0, -this.A00, getWidth(), i - this.A00);
                this.A01.mutate().setAlpha(this.A02);
                this.A01.draw(canvas);
            }
        }
        AnonymousClass0Z0.A0A(2050445218, A032);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A01;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0F;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        AnonymousClass98G r0 = this.A0L;
        if (r0 != null) {
            z |= r0.A0G(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public Drawable getContentScrim() {
        return this.A0F;
    }

    public int getExpandedTitleMarginBottom() {
        return this.A09;
    }

    public int getExpandedTitleMarginEnd() {
        return this.A0A;
    }

    public int getExpandedTitleMarginStart() {
        return this.A0B;
    }

    public int getExpandedTitleMarginTop() {
        return this.A0C;
    }

    public int getScrimAlpha() {
        return this.A02;
    }

    public long getScrimAnimationDuration() {
        return this.A03;
    }

    public Drawable getStatusBarScrim() {
        return this.A01;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(-1659027699);
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            setFitsSystemWindows(((View) parent).getFitsSystemWindows());
            if (this.A0H == null) {
                this.A0H = new AnonymousClass98K(this);
            }
            ((AppBarLayout) parent).A01(this.A0H);
            AnonymousClass1E1.A0J(this);
        }
        AnonymousClass0Z0.A0D(-1811480091, A062);
    }

    public final void onDetachedFromWindow() {
        List list;
        int A062 = AnonymousClass0Z0.A06(-530617280);
        ViewParent parent = getParent();
        C710538t r1 = this.A0H;
        if (!(r1 == null || !(parent instanceof AppBarLayout) || (list = ((AppBarLayout) parent).A05) == null || r1 == null)) {
            list.remove(r1);
        }
        super.onDetachedFromWindow();
        AnonymousClass0Z0.A0D(599195892, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r10.A0G.getVisibility() != 0) goto L_0x0041;
     */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int height;
        View view;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        C35491gS r0 = this.A07;
        if (r0 != null) {
            int A062 = r0.A06();
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < A062) {
                    AnonymousClass1E1.A0T(childAt, A062);
                }
            }
        }
        if (this.A0I && (view = this.A0G) != null) {
            boolean z3 = true;
            if (view.isAttachedToWindow()) {
                z2 = true;
            }
            z2 = false;
            this.A0J = z2;
            if (z2) {
                if (getLayoutDirection() != 1) {
                    z3 = false;
                }
                View view2 = this.A05;
                if (view2 == null) {
                    view2 = this.A06;
                }
                int height2 = ((getHeight() - A00(view2).A01) - view2.getHeight()) - ((AnonymousClass98M) view2.getLayoutParams()).bottomMargin;
                C208718yk.A00(this, this.A0G, this.A0M);
                AnonymousClass98G r7 = this.A0L;
                Rect rect = this.A0M;
                int i10 = rect.left;
                if (z3) {
                    i5 = this.A06.A07;
                } else {
                    i5 = this.A06.A08;
                }
                int i11 = i10 + i5;
                Toolbar toolbar = this.A06;
                int i12 = rect.top + height2 + toolbar.A09;
                int i13 = rect.right;
                if (z3) {
                    i6 = toolbar.A08;
                } else {
                    i6 = toolbar.A07;
                }
                r7.A0C(i11, i12, i13 + i6, (rect.bottom + height2) - toolbar.A06);
                AnonymousClass98G r4 = this.A0L;
                if (z3) {
                    i7 = this.A0A;
                } else {
                    i7 = this.A0B;
                }
                int i14 = this.A0M.top + this.A0C;
                int i15 = i3 - i;
                if (z3) {
                    i8 = this.A0B;
                } else {
                    i8 = this.A0A;
                }
                r4.A0D(i7, i14, i15 - i8, (i4 - i2) - this.A09);
                this.A0L.A08();
            }
        }
        int childCount2 = getChildCount();
        for (int i16 = 0; i16 < childCount2; i16++) {
            AnonymousClass3AY A002 = A00(getChildAt(i16));
            A002.A01 = A002.A03.getTop();
            A002.A00 = A002.A03.getLeft();
            AnonymousClass3AY.A00(A002);
        }
        if (this.A06 != null) {
            if (this.A0I && TextUtils.isEmpty(this.A0L.A0G)) {
                setTitle(this.A06.A0I);
            }
            View view3 = this.A05;
            if (view3 == null || view3 == this) {
                view3 = this.A06;
            }
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                height = view3.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            } else {
                height = view3.getHeight();
            }
            setMinimumHeight(height);
        }
        A03();
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        A01();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C35491gS r0 = this.A07;
        if (r0 != null) {
            i3 = r0.A06();
        } else {
            i3 = 0;
        }
        if (mode == 0 && i3 > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, C25913Bc3.MAX_SIGNED_POWER_OF_TWO));
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(631055892);
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A0F;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
        AnonymousClass0Z0.A0D(1110234369, A062);
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C019000b.A03(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (isInEditMode() != false) goto L_0x000d;
     */
    public void setScrimsShown(boolean z) {
        boolean z2;
        TimeInterpolator timeInterpolator;
        if (isLaidOut()) {
            z2 = true;
        }
        z2 = false;
        if (this.A08 != z) {
            int i = 255;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                A01();
                ValueAnimator valueAnimator = this.A04;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.A04 = valueAnimator2;
                    valueAnimator2.setDuration(this.A03);
                    ValueAnimator valueAnimator3 = this.A04;
                    if (i > this.A02) {
                        timeInterpolator = C2111898z.A01;
                    } else {
                        timeInterpolator = C2111898z.A04;
                    }
                    valueAnimator3.setInterpolator(timeInterpolator);
                    this.A04.addUpdateListener(new AnonymousClass98S(this));
                } else if (valueAnimator.isRunning()) {
                    this.A04.cancel();
                }
                this.A04.setIntValues(new int[]{this.A02, i});
                this.A04.start();
            } else {
                if (!z) {
                    i = 0;
                }
                setScrimAlpha(i);
            }
            this.A08 = z;
        }
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C019000b.A03(getContext(), i));
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        Drawable drawable = this.A01;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.A01.setVisible(z, false);
        }
        Drawable drawable2 = this.A0F;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.A0F.setVisible(z, false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A0F || drawable == this.A01) {
            return true;
        }
        return false;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass98M;
    }

    public void setScrimAnimationDuration(long j) {
        this.A03 = j;
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0K = true;
        this.A0M = new Rect();
        this.A0D = -1;
        AnonymousClass98G r1 = new AnonymousClass98G(this);
        this.A0L = r1;
        r1.A0B = C2111898z.A00;
        r1.A08();
        TypedArray A002 = C711939j.A00(context, attributeSet, C712039k.A08, i, 2131886886, new int[0]);
        AnonymousClass98G r6 = this.A0L;
        int i2 = A002.getInt(3, 8388691);
        if (r6.A09 != i2) {
            r6.A09 = i2;
            r6.A08();
        }
        AnonymousClass98G r62 = this.A0L;
        int i3 = A002.getInt(0, 8388627);
        if (r62.A08 != i3) {
            r62.A08 = i3;
            r62.A08();
        }
        int dimensionPixelSize = A002.getDimensionPixelSize(4, 0);
        this.A09 = dimensionPixelSize;
        this.A0A = dimensionPixelSize;
        this.A0C = dimensionPixelSize;
        this.A0B = dimensionPixelSize;
        if (A002.hasValue(7)) {
            this.A0B = A002.getDimensionPixelSize(7, 0);
        }
        if (A002.hasValue(6)) {
            this.A0A = A002.getDimensionPixelSize(6, 0);
        }
        if (A002.hasValue(8)) {
            this.A0C = A002.getDimensionPixelSize(8, 0);
        }
        if (A002.hasValue(5)) {
            this.A09 = A002.getDimensionPixelSize(5, 0);
        }
        this.A0I = A002.getBoolean(14, true);
        setTitle(A002.getText(13));
        this.A0L.A0B(2131886763);
        this.A0L.A0A(2131886752);
        if (A002.hasValue(9)) {
            this.A0L.A0B(A002.getResourceId(9, 0));
        }
        if (A002.hasValue(1)) {
            this.A0L.A0A(A002.getResourceId(1, 0));
        }
        this.A0D = A002.getDimensionPixelSize(11, -1);
        this.A03 = (long) A002.getInt(10, 600);
        setContentScrim(A002.getDrawable(2));
        setStatusBarScrim(A002.getDrawable(12));
        this.A0E = A002.getResourceId(15, -1);
        A002.recycle();
        setWillNotDraw(false);
        AnonymousClass1E1.A0c(this, new AnonymousClass98R(this));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new AnonymousClass98M(layoutParams);
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass98M(getContext(), attributeSet);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.A0L.A0E(colorStateList);
    }
}
