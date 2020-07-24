package p000X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: X.1gR  reason: invalid class name and case insensitive filesystem */
public final class C35481gR implements Comparator {
    public final int compare(Object obj, Object obj2) {
        C480626m r7 = (C480626m) obj;
        C480626m r8 = (C480626m) obj2;
        RecyclerView recyclerView = r7.A03;
        boolean z = false;
        if (recyclerView == null) {
            z = true;
        }
        boolean z2 = false;
        if (r8.A03 == null) {
            z2 = true;
        }
        if (z == z2) {
            boolean z3 = r7.A04;
            if (z3 == r8.A04) {
                int i = r8.A02 - r7.A02;
                if (i == 0 && (i = r7.A00 - r8.A00) == 0) {
                    return 0;
                }
                return i;
            } else if (z3) {
                return -1;
            }
        } else if (recyclerView == null) {
            return 1;
        } else {
            return -1;
        }
        return 1;
    }
}
