package com.instagram.shopping.widget.pdp.cta;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.igds.components.button.IgButton;
import p000X.AnonymousClass969;
import p000X.AnonymousClass96C;

public class CustomCTAButton extends IgButton {
    public void setCustomRenderer(AnonymousClass969 r2) {
        this.A07 = r2;
        setStyle(AnonymousClass96C.UNKNOWN);
        A01();
    }

    public void setTextScale(float f) {
        this.A06.setScaleX(f);
        this.A06.setScaleY(f);
    }

    public CustomCTAButton(Context context) {
        super(context);
    }

    public CustomCTAButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomCTAButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
