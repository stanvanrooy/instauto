package com.instagram.p009ui.emptystaterow;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.facebook.C0003R;
import com.facebook.forker.Process;
import java.util.HashMap;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass2Oq;
import p000X.AnonymousClass2PB;
import p000X.C019000b;
import p000X.C62442ni;
import p000X.C66782w2;
import p000X.C66792w3;

/* renamed from: com.instagram.ui.emptystaterow.EmptyStateView */
public class EmptyStateView extends NestedScrollView {
    public AnonymousClass2Oq A00;
    public final HashMap A01;
    public final View A02;

    public static void A00(AnonymousClass2PB r3, TypedArray typedArray) {
        r3.A02 = typedArray.getResourceId(8, 0);
        r3.A01 = typedArray.getColor(2, -1);
        r3.A0B = typedArray.getString(15);
        r3.A07 = typedArray.getString(14);
        r3.A09 = typedArray.getString(1);
        r3.A0D = typedArray.getBoolean(12, false);
    }

    public final void A0F() {
        C66792w3.A02(new C66782w2(this.A02), (AnonymousClass2PB) this.A01.get(this.A00), this.A00);
    }

    public final void A0H(int i, AnonymousClass2Oq r3) {
        ((AnonymousClass2PB) this.A01.get(r3)).A02 = i;
    }

    public final void A0K(View.OnClickListener onClickListener, AnonymousClass2Oq r3) {
        if (this.A01.containsKey(r3)) {
            ((AnonymousClass2PB) this.A01.get(r3)).A05 = onClickListener;
        }
    }

    public final void A0L(C62442ni r2, AnonymousClass2Oq r3) {
        if (this.A01.get(r3) != null) {
            ((AnonymousClass2PB) this.A01.get(r3)).A06 = r2;
        }
    }

    public final void A0M(AnonymousClass2Oq r2) {
        if (r2 != this.A00) {
            this.A00 = r2;
            A0F();
        }
    }

    public final void A0N(String str, AnonymousClass2Oq r3) {
        ((AnonymousClass2PB) this.A01.get(r3)).A07 = str;
    }

    public int getEmptyStateViewWrappedHeight() {
        this.A02.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Process.WAIT_RESULT_TIMEOUT), 0);
        return this.A02.getMeasuredHeight();
    }

    public final void A0G(int i, AnonymousClass2Oq r4) {
        ((AnonymousClass2PB) this.A01.get(r4)).A09 = getResources().getString(i);
    }

    public final void A0I(int i, AnonymousClass2Oq r3) {
        A0N(getResources().getString(i), r3);
    }

    public final void A0J(int i, AnonymousClass2Oq r4) {
        ((AnonymousClass2PB) this.A01.get(r4)).A0B = getResources().getString(i);
    }

    public EmptyStateView(Context context) {
        this(context, (AttributeSet) null);
    }

    public EmptyStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EmptyStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        HashMap hashMap = new HashMap();
        this.A01 = hashMap;
        hashMap.put(AnonymousClass2Oq.EMPTY, new AnonymousClass2PB());
        this.A01.put(AnonymousClass2Oq.LOADING, new AnonymousClass2PB());
        this.A01.put(AnonymousClass2Oq.ERROR, new AnonymousClass2PB());
        this.A01.put(AnonymousClass2Oq.GONE, new AnonymousClass2PB());
        this.A01.put(AnonymousClass2Oq.NOT_LOADED, new AnonymousClass2PB());
        setFillViewport(true);
        View A002 = C66792w3.A00(context, this);
        this.A02 = A002;
        addView(A002);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A1G, 0, 0);
        View view = this.A02;
        Context context2 = getContext();
        getContext();
        view.setBackgroundColor(obtainStyledAttributes.getColor(0, C019000b.A00(context2, AnonymousClass1BA.A03(context2, C0003R.attr.backgroundColorSecondary))));
        AnonymousClass2PB r4 = (AnonymousClass2PB) this.A01.get(AnonymousClass2Oq.EMPTY);
        A00(r4, obtainStyledAttributes);
        AnonymousClass2PB r1 = (AnonymousClass2PB) this.A01.get(AnonymousClass2Oq.LOADING);
        r1.A0B = obtainStyledAttributes.getString(11);
        r1.A07 = obtainStyledAttributes.getString(10);
        r1.A09 = obtainStyledAttributes.getString(9);
        r4.A0D = obtainStyledAttributes.getBoolean(12, false);
        AnonymousClass2PB r5 = (AnonymousClass2PB) this.A01.get(AnonymousClass2Oq.ERROR);
        r5.A02 = obtainStyledAttributes.getResourceId(5, 0);
        r4.A01 = obtainStyledAttributes.getColor(4, -1);
        r5.A0B = obtainStyledAttributes.getString(7);
        r5.A07 = obtainStyledAttributes.getString(6);
        r5.A09 = obtainStyledAttributes.getString(3);
        r4.A0D = obtainStyledAttributes.getBoolean(12, false);
        A00((AnonymousClass2PB) this.A01.get(AnonymousClass2Oq.NOT_LOADED), obtainStyledAttributes);
        A0M(AnonymousClass2Oq.values()[obtainStyledAttributes.getInt(13, 0)]);
        obtainStyledAttributes.recycle();
    }
}
