package com.instagram.p009ui.widget.proxy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import p000X.C26751Fd;

/* renamed from: com.instagram.ui.widget.proxy.ProxyFrameLayout */
public class ProxyFrameLayout extends FrameLayout {
    public View.OnClickListener A00;
    public boolean A01 = true;
    public final ArrayList A02 = new ArrayList();

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    public void setProxyToOnClickListener(boolean z) {
        this.A01 = z;
    }

    public ProxyFrameLayout(Context context) {
        super(context);
        super.setOnClickListener(new C26751Fd(this));
    }

    public ProxyFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setOnClickListener(new C26751Fd(this));
    }

    public ProxyFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setOnClickListener(new C26751Fd(this));
    }
}
