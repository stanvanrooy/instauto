package com.instagram.p009ui.widget.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import p000X.AFU;

/* renamed from: com.instagram.ui.widget.search.ImeBackButtonHandlerFrameLayout */
public class ImeBackButtonHandlerFrameLayout extends FrameLayout {
    public AFU A00;

    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (this.A00 != null) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (!this.A00.Ag6() && keyDispatcherState != null) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState.startTracking(keyEvent, this);
                } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && keyDispatcherState.isTracking(keyEvent)) {
                    return this.A00.onBackPressed();
                }
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public void setBackListener(AFU afu) {
        this.A00 = afu;
    }

    public ImeBackButtonHandlerFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ImeBackButtonHandlerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImeBackButtonHandlerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
