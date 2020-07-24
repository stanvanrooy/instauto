package p000X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1jH  reason: invalid class name and case insensitive filesystem */
public final class C37201jH {
    /* JADX WARNING: Removed duplicated region for block: B:4:0x000c  */
    public static AnonymousClass1UP A01(List list, Context context) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1UP r2 = (AnonymousClass1UP) it.next();
            if (!AnonymousClass1UR.AD_DESTINATION_DEEPLINK.equals(r2.A00) || AnonymousClass270.A09(context, r2.A04)) {
                return r2;
            }
            while (it.hasNext()) {
            }
        }
        return null;
    }

    public static AnonymousClass1UP A00(AnonymousClass1NJ r1, int i, Context context) {
        List list;
        if (!r1.Aho()) {
            return null;
        }
        if (r1.A1W()) {
            list = r1.A0P(i).A2Q;
        } else {
            list = r1.A2Q;
        }
        return A01(list, context);
    }
}
