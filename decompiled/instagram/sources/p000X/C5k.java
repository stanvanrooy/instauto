package p000X;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.C5k */
public final class C5k {
    public static C5k A03;
    public static final Class A04 = C5k.class;
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final HashMap A01 = new HashMap();
    public final Executor A02 = Executors.newSingleThreadExecutor();

    public final void A00(C5m c5m, C1176953o r5) {
        C12670hC.A02();
        if (this.A01.containsKey(c5m.A02)) {
            ((C27255C5j) this.A01.get(c5m.A02)).A01.add(new WeakReference(r5));
            return;
        }
        C27255C5j c5j = new C27255C5j(this, c5m);
        c5j.A01.add(new WeakReference(r5));
        this.A01.put(c5m.A02, c5j);
        AnonymousClass0Z9.A03(this.A02, c5j, -1627773430);
    }
}
