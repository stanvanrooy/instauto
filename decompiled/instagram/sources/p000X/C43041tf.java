package p000X;

import android.widget.AbsListView;

/* renamed from: X.1tf  reason: invalid class name and case insensitive filesystem */
public final class C43041tf {
    public static void A00(AnonymousClass1HD r3, AbsListView absListView) {
        if (absListView.getCount() != 0 && absListView.getHeight() != 0) {
            absListView.smoothScrollToPosition(0);
            absListView.postDelayed(new C43051tg(r3, absListView), 100);
        }
    }
}
