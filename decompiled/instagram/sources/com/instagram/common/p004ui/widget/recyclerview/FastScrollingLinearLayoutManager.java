package com.instagram.common.p004ui.widget.recyclerview;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import p000X.AnonymousClass1Xv;
import p000X.AnonymousClass5LE;

/* renamed from: com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager */
public class FastScrollingLinearLayoutManager extends CustomScrollingLinearLayoutManager {
    public final void A1Z(RecyclerView recyclerView, AnonymousClass1Xv r3, int i) {
        this.A00 = AnonymousClass5LE.A00(i, A1g());
        super.A1Z(recyclerView, r3, i);
    }

    public FastScrollingLinearLayoutManager(Context context) {
        super(context, 1, 2.0f);
    }

    public FastScrollingLinearLayoutManager(Context context, int i) {
        super(context, i, 25.0f);
    }
}
