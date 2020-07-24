package p000X;

import android.util.Pair;
import java.util.Comparator;

/* renamed from: X.0hM  reason: invalid class name and case insensitive filesystem */
public final class C12770hM implements Comparator {
    public final /* synthetic */ C12710hG A00;

    public C12770hM(C12710hG r1) {
        this.A00 = r1;
    }

    public final int compare(Object obj, Object obj2) {
        int ordering = ((AnonymousClass897) ((Pair) obj).second).ordering();
        int ordering2 = ((AnonymousClass897) ((Pair) obj2).second).ordering();
        if (ordering != ordering2) {
            return ordering - ordering2;
        }
        throw new IllegalStateException("Two plugins with the same ordering provided");
    }
}
