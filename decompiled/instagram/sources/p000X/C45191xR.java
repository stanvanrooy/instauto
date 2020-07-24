package p000X;

import android.os.DVFSHelper;

/* renamed from: X.1xR  reason: invalid class name and case insensitive filesystem */
public final class C45191xR extends C45171xP {
    public final void A03() {
        if (this.A00) {
            DVFSHelper.onSmoothScrollEvent(false);
        } else {
            DVFSHelper.onScrollEvent(false);
        }
    }

    public final boolean A04() {
        if (this.A00) {
            DVFSHelper.onSmoothScrollEvent(true);
            return true;
        }
        DVFSHelper.onScrollEvent(true);
        return true;
    }

    public C45191xR(int i, boolean z) {
        super(i, z);
    }
}
