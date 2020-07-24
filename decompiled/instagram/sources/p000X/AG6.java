package p000X;

import android.os.Handler;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.AG6 */
public final class AG6 {
    public static final WeakHashMap A07 = new WeakHashMap();
    public final Handler A00 = new Handler();
    public final SparseArray A01 = new SparseArray();
    public final WeakReference A02;
    public final Map A03 = new ConcurrentHashMap();
    public final Set A04 = new CopyOnWriteArraySet();
    public final Set A05 = new CopyOnWriteArraySet();
    public final AtomicInteger A06 = new AtomicInteger(0);

    public final synchronized void A01(int i) {
        Set set = this.A04;
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass0FY.A03(set.remove(valueOf), AnonymousClass000.A06("Tried to finish non-existent task with id ", i, "."));
        boolean z = false;
        if (this.A03.remove(valueOf) != null) {
            z = true;
        }
        AnonymousClass0FY.A03(z, AnonymousClass000.A06("Tried to remove non-existent task config with id ", i, "."));
        Runnable runnable = (Runnable) this.A01.get(i);
        if (runnable != null) {
            AnonymousClass0ZA.A08(this.A00, runnable);
            this.A01.remove(i);
        }
        C228039ra.A01(new AG8(this, i));
    }

    public static AG6 A00(A3N a3n) {
        WeakHashMap weakHashMap = A07;
        AG6 ag6 = (AG6) weakHashMap.get(a3n);
        if (ag6 != null) {
            return ag6;
        }
        AG6 ag62 = new AG6(a3n);
        weakHashMap.put(a3n, ag62);
        return ag62;
    }

    public AG6(A3N a3n) {
        this.A02 = new WeakReference(a3n);
    }
}
