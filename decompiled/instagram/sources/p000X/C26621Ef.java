package p000X;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Ef  reason: invalid class name and case insensitive filesystem */
public abstract class C26621Ef {
    public Context A00;
    public AnonymousClass0OT A01;
    public final AnonymousClass0C1 A02;
    public final Object A03 = new Object();
    public final LinkedHashMap A04 = new LinkedHashMap();
    public final Map A05 = new HashMap();

    public final synchronized void A07() {
        if (this.A00 == null) {
            this.A00 = StoredPreferences.A00;
            this.A01 = C26591Ec.A00(this.A02).A01;
            A0G();
        }
    }

    public final synchronized void A08() {
        boolean z;
        A02();
        Iterator it = A04().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object A032 = A03(str);
            if (A032 != null) {
                synchronized (this.A03) {
                    if (!this.A04.containsKey(str)) {
                        z = false;
                    } else {
                        this.A05.put(str, this.A04.remove(str));
                        z = true;
                    }
                }
                if (z) {
                    C17850qu A0E = A0E(A032);
                    if (A0E != null) {
                        A0E.A00 = new C107274js(this, str, A0F(), A032);
                        C26591Ec.A00(this.A02).A03(A0E);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public abstract C17850qu A0E(Object obj);

    public abstract Integer A0F();

    public abstract void A0G();

    public abstract void A0H();

    public abstract void A0I();

    public synchronized void initStore(Context context, AnonymousClass0OT r3) {
        if (this.A00 == null) {
            this.A00 = context.getApplicationContext();
            this.A01 = r3;
            r3.ADc(new AnonymousClass1Ej(this));
        }
    }

    public final int A02() {
        int size;
        synchronized (this.A03) {
            size = this.A04.size() + this.A05.size();
        }
        return size;
    }

    public final Object A03(String str) {
        Object obj;
        synchronized (this.A03) {
            if (this.A04.containsKey(str)) {
                obj = this.A04.get(str);
            } else {
                obj = this.A05.get(str);
            }
        }
        return obj;
    }

    public final ArrayList A04() {
        ArrayList arrayList;
        synchronized (this.A03) {
            arrayList = new ArrayList(this.A04.keySet());
        }
        return arrayList;
    }

    public final ArrayList A05() {
        ArrayList arrayList;
        synchronized (this.A03) {
            arrayList = new ArrayList(this.A04.values());
        }
        return arrayList;
    }

    public final HashMap A06() {
        HashMap hashMap;
        synchronized (this.A03) {
            hashMap = new HashMap(this.A04);
        }
        return hashMap;
    }

    public final void A09(String str) {
        synchronized (this.A03) {
            this.A04.remove(str);
        }
    }

    public final void A0A(String str) {
        synchronized (this.A03) {
            this.A05.remove(str);
        }
    }

    public final void A0B(String str, Object obj) {
        C26591Ec A002 = C26591Ec.A00(this.A02);
        if (!A002.A00) {
            A002.A00 = true;
            AnonymousClass0KT.A08.add(A002.A02);
        }
        synchronized (this.A03) {
            this.A04.put(str, obj);
        }
    }

    public final void A0C(Map map) {
        C26591Ec A002 = C26591Ec.A00(this.A02);
        if (!A002.A00) {
            A002.A00 = true;
            AnonymousClass0KT.A08.add(A002.A02);
        }
        synchronized (this.A03) {
            this.A04.putAll(map);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r3.A05.containsKey(r4) != false) goto L_0x0014;
     */
    public final boolean A0D(String str) {
        boolean z;
        synchronized (this.A03) {
            if (!this.A04.containsKey(str)) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    public C26621Ef(AnonymousClass0C1 r2) {
        this.A02 = r2;
    }
}
