package com.instagram.nux.p020ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import p000X.AnonymousClass5A5;
import p000X.C06590Pq;
import p000X.C15300mf;

/* renamed from: com.instagram.nux.ui.NetzDgTermsTextView */
public class NetzDgTermsTextView extends TextView {
    public final void A00(C06590Pq r2) {
        if (!C15300mf.A06()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        setClickable(true);
        setOnClickListener(new AnonymousClass5A5(this, r2));
    }

    public NetzDgTermsTextView(Context context) {
        super(context);
    }

    public NetzDgTermsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NetzDgTermsTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NetzDgTermsTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
