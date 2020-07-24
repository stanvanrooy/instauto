package p000X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.0ya  reason: invalid class name and case insensitive filesystem */
public final class C22530ya {
    public C22610yi A00;
    public C22620yj A01;
    public final Context A02;
    public final String A03;

    public final C22560yd A00() {
        C22560yd r1;
        String str = this.A03;
        C22540yb r3 = new C22540yb(this);
        Map map = C22560yd.A09;
        synchronized (map) {
            WeakReference weakReference = (WeakReference) map.get(str);
            if (weakReference != null) {
                r1 = (C22560yd) weakReference.get();
            } else {
                r1 = null;
            }
            if (r1 == null) {
                Object apply = r3.apply(str);
                AnonymousClass0a4.A06(apply);
                r1 = (C22560yd) apply;
                map.put(str, new WeakReference(r1));
            }
        }
        return r1;
    }

    public C22530ya(Context context, String str) {
        this.A02 = context;
        this.A03 = str;
    }

    public C22530ya setDiskSerializer(C22610yi r1) {
        this.A00 = r1;
        return this;
    }

    public C22530ya setDiskWriterListener(C22620yj r1) {
        this.A01 = r1;
        return this;
    }
}
