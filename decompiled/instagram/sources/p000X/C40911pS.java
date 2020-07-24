package p000X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1pS  reason: invalid class name and case insensitive filesystem */
public final class C40911pS {
    public static int A04;
    public int A00;
    public int A01;
    public final Map A02 = new HashMap();
    public final WeakReference A03;

    public final void A00(String str) {
        WeakReference weakReference;
        AnonymousClass2B3 r0;
        this.A02.remove(str);
        if (this.A02.isEmpty() && (weakReference = this.A03) != null && (r0 = (AnonymousClass2B3) weakReference.get()) != null) {
            r0.onFinish();
        }
    }

    public C40911pS(List list, AnonymousClass2B3 r6) {
        A04++;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C40901pR r2 = (C40901pR) it.next();
            this.A02.put(r2.A04, r2);
            this.A01++;
            this.A00 += r2.A01;
        }
        if (r6 != null) {
            this.A03 = new WeakReference(r6);
        }
    }
}
