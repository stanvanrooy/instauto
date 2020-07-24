package p000X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1wW  reason: invalid class name and case insensitive filesystem */
public final class C44641wW {
    public static int A00(C31391Ya r2) {
        return (r2.A03 - r2.A0T()) - r2.A0U();
    }

    public static void A01(RecyclerView recyclerView) {
        if (recyclerView.getChildCount() != 0 && recyclerView.getHeight() != 0) {
            recyclerView.A0h(0);
            recyclerView.postDelayed(new C44681wa(recyclerView), 100);
        }
    }

    public static void A02(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, C62162n1 r5) {
        int A1h = linearLayoutManager.A1h();
        for (int A1g = linearLayoutManager.A1g(); A1g <= A1h; A1g++) {
            AnonymousClass1ZK A0O = recyclerView.A0O(A1g);
            if (A0O != null) {
                r5.A5a(A1g, A0O);
            }
        }
    }

    public static boolean A03(int i, LinearLayoutManager linearLayoutManager) {
        if (i < linearLayoutManager.A1i() || i > linearLayoutManager.A1j()) {
            return false;
        }
        return true;
    }

    public static boolean A04(int i, LinearLayoutManager linearLayoutManager) {
        if (i < linearLayoutManager.A1g() || i > linearLayoutManager.A1h()) {
            return false;
        }
        return true;
    }

    public static boolean A05(LinearLayoutManager linearLayoutManager) {
        if (linearLayoutManager.A0R() == 0 || linearLayoutManager.A1i() == 0) {
            return true;
        }
        return false;
    }
}
