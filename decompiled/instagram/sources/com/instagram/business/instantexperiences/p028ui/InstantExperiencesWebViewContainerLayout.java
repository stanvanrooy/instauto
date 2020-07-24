package com.instagram.business.instantexperiences.p028ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p000X.AV6;
import p000X.C25129B2f;

/* renamed from: com.instagram.business.instantexperiences.ui.InstantExperiencesWebViewContainerLayout */
public class InstantExperiencesWebViewContainerLayout extends FrameLayout {
    public AV6 A00;
    public C25129B2f A01;

    public AV6 getWebView() {
        return this.A00;
    }

    public void setWebView(AV6 av6) {
        removeAllViews();
        addView(av6);
        this.A00 = av6;
    }

    public void setWebViewChangeListner(C25129B2f b2f) {
        this.A01 = b2f;
    }

    public InstantExperiencesWebViewContainerLayout(Context context) {
        super(context);
    }

    public InstantExperiencesWebViewContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InstantExperiencesWebViewContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
