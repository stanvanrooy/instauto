package com.instagram.creation.capture;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0003R;
import p000X.C019000b;

public class FocusIndicatorView extends View {
    private void setDrawable(int i) {
        setBackground(C019000b.A03(getContext(), i));
    }

    public final void A00() {
        setDrawable(C0003R.C0004drawable.ic_focus_failed);
    }

    public final void A01() {
        setDrawable(C0003R.C0004drawable.ic_focus_focusing);
    }

    public final void A02() {
        setDrawable(C0003R.C0004drawable.ic_focus_focused);
    }

    public FocusIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
