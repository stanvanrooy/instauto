package com.instagram.maps.p053ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.C0003R;
import p000X.B3X;
import p000X.C019000b;
import p000X.C25690BVj;

/* renamed from: com.instagram.maps.ui.IgStaticMapView */
public class IgStaticMapView extends C25690BVj {
    public long A00 = 0;

    public Drawable getInfoGlyph() {
        return C019000b.A03(getContext(), C0003R.C0004drawable.instagram_info_filled_16);
    }

    public IgStaticMapView(Context context) {
        super(context);
        this.A09 = new B3X(getContext());
    }

    public IgStaticMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A09 = new B3X(getContext());
    }

    public IgStaticMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = new B3X(getContext());
    }
}
