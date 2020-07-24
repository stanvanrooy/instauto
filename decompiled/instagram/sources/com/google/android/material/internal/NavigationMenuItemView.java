package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1YC;
import p000X.AnonymousClass3In;
import p000X.AnonymousClass99H;
import p000X.AnonymousClass99I;
import p000X.C176587gS;
import p000X.C200358hu;
import p000X.C206908uL;
import p000X.C208778ys;
import p000X.C55072a1;
import p000X.C71403An;

public class NavigationMenuItemView extends C200358hu implements AnonymousClass99H {
    public static final int[] A0A = {16842912};
    public boolean A00;
    public FrameLayout A01;
    public AnonymousClass99I A02;
    public ColorStateList A03;
    public Drawable A04;
    public boolean A05;
    public boolean A06;
    public final CheckedTextView A07;
    public final int A08;
    public final AnonymousClass1YC A09;

    public final boolean BXf() {
        return false;
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.A05) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C55072a1.A02(drawable).mutate();
                C55072a1.A08(drawable, this.A03);
            }
            int i = this.A08;
            drawable.setBounds(0, 0, i, i);
        } else if (this.A06) {
            if (this.A04 == null) {
                Drawable A012 = C176587gS.A01(getResources(), C0003R.C0004drawable.navigation_empty_icon, getContext().getTheme());
                this.A04 = A012;
                if (A012 != null) {
                    int i2 = this.A08;
                    A012.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.A04;
        }
        this.A07.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A01 == null) {
                this.A01 = (FrameLayout) ((ViewStub) findViewById(C0003R.C0005id.design_menu_item_action_area_stub)).inflate();
            }
            this.A01.removeAllViews();
            this.A01.addView(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0097, code lost:
        if (r5.A02.getActionView() == null) goto L_0x0099;
     */
    public final void Adc(AnonymousClass99I r6, int i) {
        boolean z;
        C208778ys r1;
        int i2;
        StateListDrawable stateListDrawable;
        this.A02 = r6;
        int i3 = 8;
        if (r6.isVisible()) {
            i3 = 0;
        }
        setVisibility(i3);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C0003R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(A0A, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            AnonymousClass1E1.A0a(this, stateListDrawable);
        }
        setCheckable(r6.isCheckable());
        setChecked(r6.isChecked());
        setEnabled(r6.isEnabled());
        setTitle(r6.getTitle());
        setIcon(r6.getIcon());
        setActionView(r6.getActionView());
        setContentDescription(r6.getContentDescription());
        C71403An.A00(this, r6.getTooltipText());
        AnonymousClass99I r12 = this.A02;
        if (r12.getTitle() == null && r12.getIcon() == null) {
            z = true;
        }
        z = false;
        if (z) {
            this.A07.setVisibility(8);
            FrameLayout frameLayout = this.A01;
            if (frameLayout != null) {
                r1 = (C208778ys) frameLayout.getLayoutParams();
                i2 = -1;
            } else {
                return;
            }
        } else {
            this.A07.setVisibility(0);
            FrameLayout frameLayout2 = this.A01;
            if (frameLayout2 != null) {
                r1 = (C208778ys) frameLayout2.getLayoutParams();
                i2 = -2;
            } else {
                return;
            }
        }
        r1.width = i2;
        this.A01.setLayoutParams(r1);
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        AnonymousClass99I r1 = this.A02;
        if (r1 != null && r1.isCheckable() && r1.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, A0A);
        }
        return onCreateDrawableState;
    }

    public void setIconPadding(int i) {
        this.A07.setCompoundDrawablePadding(i);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.A03 = colorStateList;
        boolean z = false;
        if (colorStateList != null) {
            z = true;
        }
        this.A05 = z;
        AnonymousClass99I r0 = this.A02;
        if (r0 != null) {
            setIcon(r0.getIcon());
        }
    }

    public void setTextAppearance(int i) {
        AnonymousClass3In.A06(this.A07, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.A07.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.A07.setText(charSequence);
    }

    public AnonymousClass99I getItemData() {
        return this.A02;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.A00 != z) {
            this.A00 = z;
            this.A09.A01(this.A07, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.A07.setChecked(z);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.A06 = z;
    }

    public NavigationMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = new C206908uL(this);
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0003R.layout.design_navigation_menu_item, this, true);
        this.A08 = context.getResources().getDimensionPixelSize(C0003R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C0003R.C0005id.design_menu_item_text);
        this.A07 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AnonymousClass1E1.A0b(this.A07, this.A09);
    }
}
