package p000X;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BY1 */
public enum BY1 {
    ;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    public boolean A00(List list, long j) {
        boolean z;
        if (!(this instanceof BY3)) {
            if (this instanceof BY4) {
                return ((long) list.size()) >= j;
            }
            if (!(this instanceof BY0)) {
                z = true;
                if (list.isEmpty() || System.currentTimeMillis() >= ((Long) list.get(list.size() - 1)).longValue() + TimeUnit.SECONDS.toMillis(j)) {
                    return z;
                }
                return false;
            }
            z = true;
            if (!list.isEmpty()) {
                return System.currentTimeMillis() <= ((Long) list.get(list.size() - 1)).longValue() + TimeUnit.SECONDS.toMillis(j);
            }
            return z;
        } else if (((long) list.size()) > j) {
            return false;
        }
    }
}
