package com.instagram.feed.p005ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass2Z4;
import p000X.AnonymousClass2Z5;

/* renamed from: com.instagram.feed.ui.views.EndOfFeedDemarcatorCheckmark */
public class EndOfFeedDemarcatorCheckmark extends AnonymousClass2Z4 implements AnonymousClass2Z5 {
    public final void Bsz(float f) {
        A00(f);
    }

    public EndOfFeedDemarcatorCheckmark(Context context) {
        this(context, (AttributeSet) null);
    }

    public EndOfFeedDemarcatorCheckmark(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EndOfFeedDemarcatorCheckmark(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray = null;
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A1H, 0, i);
            this.A01 = typedArray.getInteger(0, this.A01);
            typedArray.recycle();
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }
}
