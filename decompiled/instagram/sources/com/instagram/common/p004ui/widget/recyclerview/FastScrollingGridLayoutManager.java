package com.instagram.common.p004ui.widget.recyclerview;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000X.AnonymousClass1Xv;
import p000X.AnonymousClass5LE;
import p000X.C151336dY;

/* renamed from: com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager */
public class FastScrollingGridLayoutManager extends GridLayoutManager {
    public float A00;
    public final Context A01;

    public FastScrollingGridLayoutManager(Context context, int i) {
        super(i);
        this.A01 = context;
    }

    public final void A1Z(RecyclerView recyclerView, AnonymousClass1Xv r4, int i) {
        this.A00 = AnonymousClass5LE.A00(i, A1g());
        C151336dY r1 = new C151336dY(this, this.A01);
        r1.A00 = i;
        A0t(r1);
    }
}
