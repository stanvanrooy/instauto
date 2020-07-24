package com.instagram.creation.base.p029ui.effectpicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass80F;
import p000X.AnonymousClass80T;
import p000X.C187177yy;
import p000X.C187297zB;
import p000X.C187727zv;
import p000X.C1878780m;

/* renamed from: com.instagram.creation.base.ui.effectpicker.EffectPicker */
public class EffectPicker extends HorizontalScrollView implements View.OnClickListener {
    public static int A06 = -1887089959;
    public int A00 = -1;
    public int A01 = -1;
    public int A02;
    public LinearLayout A03;
    public C1878780m A04;
    public List A05;

    public boolean A03(int i, C187297zB r3) {
        return (this instanceof FilterPicker) && !(r3 instanceof C187177yy) && i != 0;
    }

    public boolean A04(int i, boolean z) {
        if (!(this instanceof FilterPicker)) {
            return true;
        }
        FilterPicker filterPicker = (FilterPicker) this;
        if (z && filterPicker.A02) {
            LinearLayout linearLayout = filterPicker.A03;
            return i != ((C187727zv) linearLayout.getChildAt(linearLayout.getChildCount() + -2)).A03.ANC();
        }
    }

    /* renamed from: com.instagram.creation.base.ui.effectpicker.EffectPicker$SavedState */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(294);
        public int A00;

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.A00 = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public final void A02(int i) {
        C187727zv r2 = (C187727zv) this.A05.get(i);
        if (A04(r2.A03.ANC(), false)) {
            smoothScrollBy(A01(r2), 0);
        }
        C1878780m r0 = this.A04;
        if (r0 != null) {
            r0.BRY(r2, false);
        }
    }

    public void setEffects(List list) {
        int i;
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.A03 = linearLayout;
        linearLayout.setOrientation(0);
        this.A03.setGravity(16);
        this.A05.clear();
        LinearLayout linearLayout2 = this.A03;
        AnonymousClass80F config = getConfig();
        getContext();
        this.A02 = AnonymousClass80T.A01(context, config);
        for (int i2 = 0; i2 < list.size(); i2++) {
            C187727zv r4 = new C187727zv(linearLayout2.getContext());
            r4.setConfig(config);
            r4.A03((C187297zB) list.get(i2), true);
            r4.setContentDescription(((C187297zB) list.get(i2)).getName());
            r4.setOnClickListener(this);
            r4.A06 = A03(i2, (C187297zB) list.get(i2));
            int i3 = A06;
            A06 = i3 + 1;
            r4.setId(i3);
            this.A05.add(r4);
            linearLayout2.addView(r4, new LinearLayout.LayoutParams(-2, -1));
            this.A04.BRX(r4);
        }
        linearLayout2.setClipChildren(false);
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(config.A04);
        getResources();
        int dimensionPixelSize2 = dimensionPixelSize + resources.getDimensionPixelSize(C0003R.dimen.effect_tile_padding);
        setClipToPadding(false);
        setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
        addView(this.A03);
        if (getWidth() > 0 && (i = this.A00) != -1) {
            this.A00 = -1;
            this.A01 = -1;
            scrollTo(i, 0);
        }
    }

    public final int A01(C187727zv r6) {
        int left = ((r6.getLeft() - r6.getWidth()) - getScrollX()) + getPaddingLeft();
        int paddingLeft = getPaddingLeft() + (((r6.getRight() + r6.getWidth()) - getWidth()) - getScrollX());
        if (paddingLeft <= 0) {
            paddingLeft = 0;
            if (left < 0) {
                paddingLeft = left;
            }
        }
        return Math.max(0, Math.min(getScrollX() + paddingLeft, Math.max(0, getChildAt(0).getWidth() - getWidth()))) - getScrollX();
    }

    public AnonymousClass80F getConfig() {
        getContext();
        return AnonymousClass80F.A01();
    }

    public void onClick(View view) {
        int A052 = AnonymousClass0Z0.A05(294703476);
        C187727zv r5 = (C187727zv) view;
        if (A04(r5.A03.ANC(), true)) {
            smoothScrollBy(A01(r5), 0);
        }
        C1878780m r0 = this.A04;
        if (r0 != null) {
            r0.BRY(r5, true);
        }
        AnonymousClass0Z0.A0C(-1825546548, A052);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() > 0) {
            if (this.A00 == -1 && (i5 = this.A01) >= 0) {
                this.A00 = A01((C187727zv) this.A03.getChildAt(i5));
            }
            int i6 = this.A00;
            if (i6 != -1) {
                this.A00 = -1;
                this.A01 = -1;
                scrollTo(i6, 0);
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A00 = savedState.A00;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.A00 = getScrollX();
        return savedState;
    }

    private void setRestoreScrollPosition(int i) {
        this.A00 = i;
    }

    public void setFilterListener(C1878780m r1) {
        this.A04 = r1;
    }

    public void setRestoreSelectedIndex(int i) {
        this.A01 = i;
    }

    public EffectPicker(Context context) {
        super(context);
        setHorizontalFadingEdgeEnabled(false);
        setHorizontalScrollBarEnabled(false);
        this.A05 = new ArrayList();
    }

    public EffectPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHorizontalFadingEdgeEnabled(false);
        setHorizontalScrollBarEnabled(false);
        this.A05 = new ArrayList();
    }

    public EffectPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setHorizontalFadingEdgeEnabled(false);
        setHorizontalScrollBarEnabled(false);
        this.A05 = new ArrayList();
    }
}
