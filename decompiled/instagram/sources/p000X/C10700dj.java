package p000X;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0dj  reason: invalid class name and case insensitive filesystem */
public final class C10700dj implements AnonymousClass0US {
    public final Set A00 = new HashSet();

    public final boolean BmU(Map map) {
        boolean z = true;
        for (AnonymousClass0US BmU : this.A00) {
            z &= BmU.BmU(map);
        }
        return z;
    }
}
