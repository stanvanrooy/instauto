package com.instagram.shopping.adapter.destination.productcollection;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass7BR;
import p000X.C13150hy;
import p000X.C215449Qh;

public final class ProductCollectionLoadingView extends RecyclerView {
    public ProductCollectionLoadingView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (AnonymousClass7BR) null);
    }

    public ProductCollectionLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (AnonymousClass7BR) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductCollectionLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        C13150hy.A02(context, "context");
        boolean z2 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2w);
            z = obtainStyledAttributes.getBoolean(1, false);
            z2 = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        } else {
            z = false;
        }
        setAdapter(new C215449Qh(context, z, z2));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductCollectionLoadingView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass7BR r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
