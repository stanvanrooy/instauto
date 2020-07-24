package p000X;

import android.util.LruCache;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1gP  reason: invalid class name and case insensitive filesystem */
public final class C35461gP extends AnonymousClass0O9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass17R A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35461gP(AnonymousClass17R r4, int i, String str, long j) {
        super(9, 4, false, false);
        this.A02 = r4;
        this.A00 = i;
        this.A03 = str;
        this.A01 = j;
    }

    public final void run() {
        boolean z;
        Integer valueOf;
        AnonymousClass17R r1 = this.A02;
        int i = this.A00;
        String str = this.A03;
        long j = this.A01;
        if (AnonymousClass1CU.A00()) {
            z = true;
        } else {
            z = r1.A01;
        }
        if (z) {
            LruCache lruCache = AnonymousClass17R.A04;
            synchronized (lruCache) {
                try {
                    valueOf = Integer.valueOf(i);
                    if (lruCache.get(valueOf) != null) {
                        lruCache.put(valueOf, true);
                    }
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                }
            }
            if (!AnonymousClass00B.A01.isMarkerOn(25624577, i)) {
                return;
            }
            if (str.equals("DISK")) {
                Set set = AnonymousClass17R.A05;
                synchronized (set) {
                    try {
                        Iterator it = set.iterator();
                        if (set.size() > 300 && it.hasNext()) {
                            it.next();
                            it.remove();
                        }
                        set.add(valueOf);
                        AnonymousClass00B.A01.markerPoint(25624577, i, "DISK", j);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                return;
            }
            AnonymousClass00B.A01.markerAnnotate(25624577, i, "SOURCE", str);
            AnonymousClass00B.A01.markerEnd(25624577, i, 467, j);
        }
    }
}
