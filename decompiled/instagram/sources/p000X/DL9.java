package p000X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.DL9 */
public final class DL9 implements Comparator, Serializable {
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((DLB) obj).A00, ((DLB) obj2).A00);
    }
}
