package p000X;

import android.content.Context;
import android.widget.OverScroller;

/* renamed from: X.AAO */
public final class AAO extends OverScroller {
    public int A00 = 250;

    public final int A00() {
        super.startScroll(0, 0, 0, 0);
        return this.A00;
    }

    public AAO(Context context) {
        super(context);
    }

    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.A00 = i5;
    }
}
