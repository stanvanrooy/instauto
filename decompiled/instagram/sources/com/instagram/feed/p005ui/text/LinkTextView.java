package com.instagram.feed.p005ui.text;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass19g;
import p000X.C54302Wt;

/* renamed from: com.instagram.feed.ui.text.LinkTextView */
public class LinkTextView extends TextView {
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence Aon;
        if (charSequence == null) {
            Aon = null;
        } else {
            Aon = AnonymousClass19g.A00(getContext()).Aon(charSequence, -1);
        }
        super.setText(Aon, bufferType);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1 == false) goto L_0x0015;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int A05 = AnonymousClass0Z0.A05(-1518675000);
        Layout layout = getLayout();
        boolean z2 = true;
        if (layout != null) {
            boolean A00 = C54302Wt.A00(motionEvent, layout, this);
            z = true;
        }
        z = false;
        if (!z && !super.onTouchEvent(motionEvent)) {
            z2 = false;
        }
        AnonymousClass0Z0.A0C(1375740748, A05);
        return z2;
    }

    public LinkTextView(Context context) {
        super(context);
    }

    public LinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LinkTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
