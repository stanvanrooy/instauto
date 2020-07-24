package p000X;

import android.graphics.Rect;
import com.instagram.p009ui.listview.StickyHeaderListView;
import java.lang.ref.WeakReference;

/* renamed from: X.1br  reason: invalid class name and case insensitive filesystem */
public final class C32791br implements C32781bq {
    public final WeakReference A00;

    public final void AIG(Rect rect) {
        if (this.A00.get() != null) {
            rect.set(((StickyHeaderListView) this.A00.get()).getTopChromeArea());
        } else {
            rect.setEmpty();
        }
    }

    public C32791br(StickyHeaderListView stickyHeaderListView) {
        this.A00 = new WeakReference(stickyHeaderListView);
    }
}
