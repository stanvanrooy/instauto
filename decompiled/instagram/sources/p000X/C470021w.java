package p000X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.instagram.shopping.adapter.bag.merchant.PinnedLinearLayoutManager;

/* renamed from: X.21w  reason: invalid class name and case insensitive filesystem */
public final class C470021w extends C44651wX {
    public final /* synthetic */ PinnedLinearLayoutManager A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C470021w(PinnedLinearLayoutManager pinnedLinearLayoutManager, Context context) {
        super(context);
        this.A00 = pinnedLinearLayoutManager;
    }

    public final float A06(DisplayMetrics displayMetrics) {
        return this.A00.A04 / ((float) displayMetrics.densityDpi);
    }
}
