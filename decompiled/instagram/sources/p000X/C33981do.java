package p000X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.p004ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import java.util.List;

/* renamed from: X.1do  reason: invalid class name and case insensitive filesystem */
public final class C33981do {
    public static int A00(C31391Ya r1) {
        if (r1 instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) r1).A1g();
        }
        if (r1 instanceof FlowingGridLayoutManager) {
            FlowingGridLayoutManager flowingGridLayoutManager = (FlowingGridLayoutManager) r1;
            if (flowingGridLayoutManager.A0S() == 0 || flowingGridLayoutManager.A08.isEmpty()) {
                return -1;
            }
            return ((Integer) flowingGridLayoutManager.A08.get(0)).intValue();
        }
        throw A03(r1);
    }

    public static int A01(C31391Ya r1) {
        if (r1 instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) r1).A1h();
        }
        if (r1 instanceof FlowingGridLayoutManager) {
            FlowingGridLayoutManager flowingGridLayoutManager = (FlowingGridLayoutManager) r1;
            if (flowingGridLayoutManager.A0S() == 0 || flowingGridLayoutManager.A08.isEmpty()) {
                return -1;
            }
            List list = flowingGridLayoutManager.A08;
            return ((Integer) list.get(list.size() - 1)).intValue();
        }
        throw A03(r1);
    }

    public static int A02(RecyclerView recyclerView, C31391Ya r2, int i) {
        if (r2 instanceof LinearLayoutManager) {
            int A1g = i - ((LinearLayoutManager) r2).A1g();
            if (A1g < 0 || A1g >= recyclerView.getChildCount()) {
                return -1;
            }
            return A1g;
        } else if (r2 instanceof FlowingGridLayoutManager) {
            FlowingGridLayoutManager flowingGridLayoutManager = (FlowingGridLayoutManager) r2;
            if (flowingGridLayoutManager.A0S() != 0 && !flowingGridLayoutManager.A08.isEmpty()) {
                for (int i2 = 0; i2 < flowingGridLayoutManager.A08.size(); i2++) {
                    if (((Integer) flowingGridLayoutManager.A08.get(i2)).intValue() == i) {
                        return i2;
                    }
                }
            }
            return -1;
        } else {
            throw A03(r2);
        }
    }

    public static IllegalArgumentException A03(C31391Ya r3) {
        return new IllegalArgumentException(AnonymousClass000.A0E("Unsupported LayoutManager: ", r3.getClass().getCanonicalName()));
    }

    public static boolean A04(RecyclerView recyclerView, C31391Ya r2, int i) {
        int A02 = A02(recyclerView, r2, i);
        if (A02 == -1) {
            return false;
        }
        return r2.A10(r2.A0a(A02), true);
    }
}
