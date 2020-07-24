package com.instagram.creation.video.p030ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.Iterator;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass8FG;
import p000X.AnonymousClass8FH;
import p000X.C191048Ep;
import p000X.C191148Ez;

/* renamed from: com.instagram.creation.video.ui.ClipStackView */
public class ClipStackView extends LinearLayout implements AnonymousClass8FH {
    public AnonymousClass8FG A00;
    public final Drawable A01;
    public final Drawable A02;

    public final void AwX(C191048Ep r1, Integer num) {
    }

    public final void AwY(C191048Ep r1) {
    }

    public final void Awc() {
    }

    public final void BJg() {
    }

    private void A00(C191048Ep r5) {
        addView(new C191148Ez(getContext(), r5, this.A01.getConstantState().newDrawable(), this.A02.getConstantState().newDrawable()));
    }

    public void setClipStack(AnonymousClass8FG r3) {
        this.A00 = r3;
        Iterator it = r3.iterator();
        while (it.hasNext()) {
            A00((C191048Ep) it.next());
        }
    }

    public final void Awb(C191048Ep r3) {
        C191148Ez r1 = (C191148Ez) findViewWithTag(r3);
        r3.A08.remove(r1);
        removeView(r1);
    }

    public final void AwW(C191048Ep r1) {
        A00(r1);
    }

    public ClipStackView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ClipStackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClipStackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0j, 0, 0);
        this.A01 = obtainStyledAttributes.getDrawable(0);
        this.A02 = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
    }
}
