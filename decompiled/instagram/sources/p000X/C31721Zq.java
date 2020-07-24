package p000X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1Zq  reason: invalid class name and case insensitive filesystem */
public final class C31721Zq extends AnonymousClass1YW {
    public final int A00;
    public final int A01;

    public C31721Zq(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass1Xv r7) {
        int i;
        int A002 = RecyclerView.A00(view);
        rect.top = 0;
        rect.bottom = 0;
        if (A002 == 0) {
            i = this.A01;
        } else {
            i = this.A00;
        }
        rect.left = i;
        AnonymousClass1PH r0 = recyclerView.A0J;
        if (r0 == null || A002 != r0.getItemCount() - 1) {
            rect.right = 0;
        } else {
            rect.right = this.A01;
        }
    }
}
