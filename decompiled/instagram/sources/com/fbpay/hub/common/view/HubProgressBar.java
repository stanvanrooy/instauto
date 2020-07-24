package com.fbpay.hub.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import p000X.AnonymousClass11G;

public class HubProgressBar extends FrameLayout {
    public HubProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public HubProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HubProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass11G.A04();
        inflate(context, C0003R.layout.hub_spinner, this);
    }
}
