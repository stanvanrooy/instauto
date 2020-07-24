package com.instagram.common.p004ui.widget.recyclerview;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1Xv;
import p000X.C55512am;

/* renamed from: com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager */
public class CustomScrollingLinearLayoutManager extends LinearLayoutManagerCompat {
    public float A00;
    public final Context A01;

    public void A1Z(RecyclerView recyclerView, AnonymousClass1Xv r4, int i) {
        boolean z = false;
        if (this.A00 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            z = true;
        }
        AnonymousClass0a4.A0B(z, "Cannot perform smooth scrolling with non positive scrolling speed.");
        C55512am r1 = new C55512am(this, this.A01);
        r1.A00 = i;
        A0t(r1);
    }

    public CustomScrollingLinearLayoutManager(Context context, int i, float f) {
        super(i);
        this.A01 = context;
        this.A00 = f;
    }
}
