package p000X;

import com.samsung.android.os.SemPerfManager;

/* renamed from: X.1xO  reason: invalid class name and case insensitive filesystem */
public final class C45161xO extends C45171xP {
    public final void A03() {
        if (this.A00) {
            SemPerfManager.onSmoothScrollEvent(false);
        } else {
            SemPerfManager.onScrollEvent(false);
        }
    }

    public final boolean A04() {
        if (this.A00) {
            SemPerfManager.onSmoothScrollEvent(true);
            return true;
        }
        SemPerfManager.onScrollEvent(true);
        return true;
    }

    public C45161xO(int i, boolean z) {
        super(i, z);
    }
}
