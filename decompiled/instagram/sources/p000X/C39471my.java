package p000X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1my  reason: invalid class name and case insensitive filesystem */
public final class C39471my {
    public static Drawable A00(Context context, List list, int i, boolean z, Integer num, boolean z2, boolean z3, Float f) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C13330iM) it.next()).ASv());
        }
        return C39481mz.A00(context, arrayList, i, z, num, z2, z3, f, (Integer) null, (Integer) null);
    }
}
