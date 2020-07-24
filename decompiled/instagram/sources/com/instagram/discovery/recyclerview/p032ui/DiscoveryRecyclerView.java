package com.instagram.discovery.recyclerview.p032ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView */
public class DiscoveryRecyclerView extends RecyclerView {
    public double A00 = 1.0d;

    public final boolean A14(int i, int i2) {
        return super.A14(i, (int) (((double) i2) * this.A00));
    }

    public void setScrollingFrictionYFactor(double d) {
        this.A00 = d;
    }

    public DiscoveryRecyclerView(Context context) {
        super(context);
    }

    public DiscoveryRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DiscoveryRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
