package com.instagram.p009ui.widget.radiogroup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p000X.AnonymousClass0Z0;
import p000X.B0M;
import p000X.C27025Bwb;
import p000X.C27026Bwc;
import p000X.C27027Bwe;
import p000X.C27028Bwf;
import p000X.C27029Bwg;

/* renamed from: com.instagram.ui.widget.radiogroup.IgRadioGroup */
public class IgRadioGroup extends LinearLayout {
    public int A00 = -1;
    public B0M A01 = new C27027Bwe(this);
    public C27029Bwg A02;
    public C27026Bwc A03;
    public boolean A04 = false;

    public final void A01(int i) {
        if (i == -1 || i != this.A00) {
            int i2 = this.A00;
            if (i2 != -1) {
                A00(this, i2, false);
            }
            if (i != -1) {
                A00(this, i, true);
            }
            setCheckedId(this, i);
        }
    }

    public static void setCheckedId(IgRadioGroup igRadioGroup, int i) {
        igRadioGroup.A00 = i;
        C27029Bwg bwg = igRadioGroup.A02;
        if (bwg != null) {
            bwg.AvI(igRadioGroup, i);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if ((view instanceof C27025Bwb) && ((C27025Bwb) view).isChecked()) {
            this.A04 = true;
            int i2 = this.A00;
            if (i2 != -1) {
                A00(this, i2, false);
            }
            this.A04 = false;
            setCheckedId(this, view.getId());
        }
        super.addView(view, i, layoutParams);
    }

    public CharSequence getAccessibilityClassName() {
        return IgRadioGroup.class.getName();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A03.A00 = onHierarchyChangeListener;
    }

    public static void A00(IgRadioGroup igRadioGroup, int i, boolean z) {
        View findViewById = igRadioGroup.findViewById(i);
        if (findViewById != null && (findViewById instanceof C27025Bwb)) {
            ((C27025Bwb) findViewById).setChecked(z);
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C27028Bwf;
    }

    public int getCheckedRadioButtonId() {
        return this.A00;
    }

    public final void onFinishInflate() {
        int A06 = AnonymousClass0Z0.A06(-1207466535);
        super.onFinishInflate();
        int i = this.A00;
        if (i != -1) {
            this.A04 = true;
            A00(this, i, true);
            this.A04 = false;
            setCheckedId(this, this.A00);
        }
        AnonymousClass0Z0.A0D(687041123, A06);
    }

    public void setOnCheckedChangeListener(C27029Bwg bwg) {
        this.A02 = bwg;
    }

    public IgRadioGroup(Context context) {
        super(context);
        C27026Bwc bwc = new C27026Bwc(this);
        this.A03 = bwc;
        super.setOnHierarchyChangeListener(bwc);
    }

    public IgRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C27026Bwc bwc = new C27026Bwc(this);
        this.A03 = bwc;
        super.setOnHierarchyChangeListener(bwc);
    }

    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C27028Bwf();
    }
}
