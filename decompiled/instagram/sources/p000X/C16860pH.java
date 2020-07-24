package p000X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0pH  reason: invalid class name and case insensitive filesystem */
public final class C16860pH {
    public static final ArrayList A00 = new ArrayList();

    public static boolean A00(Context context, AnonymousClass0C1 r3) {
        Iterator it = new ArrayList(A00).iterator();
        while (it.hasNext()) {
            if (!((C16850pG) it.next()).Ae0(context, r3)) {
                return false;
            }
        }
        return true;
    }
}
