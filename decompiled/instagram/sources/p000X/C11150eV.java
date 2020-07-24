package p000X;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0eV  reason: invalid class name and case insensitive filesystem */
public final class C11150eV {
    public final List A00 = new ArrayList();
    public final Handler A01;
    public final C11170eX A02;
    public final Map A03 = new HashMap();

    public static boolean A00(C11150eV r6, Object obj) {
        Set set;
        ArrayList arrayList;
        synchronized (r6) {
            try {
                set = (Set) r6.A03.get(obj.getClass());
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        boolean z = false;
        if (set != null && !set.isEmpty()) {
            synchronized (set) {
                try {
                    C11170eX r2 = r6.A02;
                    synchronized (r2) {
                        if (set.size() > 8) {
                            arrayList = new ArrayList(set);
                        } else {
                            if (r2.A00.isEmpty()) {
                                arrayList = new ArrayList(8);
                            } else {
                                arrayList = (ArrayList) r2.A00.remove();
                            }
                            if (arrayList.isEmpty()) {
                                arrayList.addAll(set);
                            } else {
                                throw new IllegalStateException("recycled list has entries");
                            }
                        }
                    }
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                        break;
                    }
                }
            }
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C11200ea r1 = (C11200ea) it.next();
                    synchronized (set) {
                        if (set.contains(r1)) {
                            if (!(r1 instanceof C27021Ge) || ((C27021Ge) r1).A2J(obj)) {
                                r1.onEvent(obj);
                                z = true;
                            }
                        }
                    }
                }
                r6.A02.A00(arrayList);
            } catch (Throwable th3) {
                r6.A02.A00(arrayList);
                throw th3;
            }
        }
        return z;
        throw th;
    }

    public final synchronized void A01(Class cls, C11200ea r4) {
        Set set = (Set) this.A03.get(cls);
        if (set == null) {
            set = new HashSet();
            this.A03.put(cls, set);
        }
        synchronized (set) {
            set.add(r4);
        }
    }

    public final synchronized void A02(Class cls, C11200ea r4) {
        Set set = (Set) this.A03.get(cls);
        if (set != null) {
            synchronized (set) {
                set.remove(r4);
                if (set.isEmpty()) {
                    this.A03.remove(cls);
                }
            }
        }
    }

    public final void A03(Object obj) {
        synchronized (this.A00) {
            this.A00.add(obj);
            if (!this.A01.hasMessages(1)) {
                AnonymousClass0ZA.A0B(this.A01, 1);
            }
        }
    }

    public C11150eV(Looper looper) {
        this.A01 = new C11160eW(this, looper);
        this.A02 = new C11170eX();
    }
}
