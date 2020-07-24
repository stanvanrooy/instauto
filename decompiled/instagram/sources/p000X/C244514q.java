package p000X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.14q  reason: invalid class name and case insensitive filesystem */
public final class C244514q implements C244414p {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();

    public final synchronized void ABc(String str) {
        this.A01.remove(str);
        this.A00.remove(str);
    }

    public final synchronized C105814hT AF4(String str) {
        return (C105814hT) this.A01.get(str);
    }

    public final long AKL() {
        return 0;
    }

    public final synchronized AnonymousClass4WK AQF(String str) {
        return (AnonymousClass4WK) this.A00.get(str);
    }

    public final synchronized Collection AYx() {
        return new ArrayList(this.A01.values());
    }

    public final void Ad8() {
    }

    public final synchronized boolean BYh(String str, C105884ha r8, long j, C105814hT r11) {
        boolean z;
        C105814hT r3 = r11;
        if (this.A01.containsKey(r11.A04)) {
            z = false;
        } else {
            A00(str, r8, r3, j);
            z = true;
        }
        return z;
    }

    public final synchronized AnonymousClass4WK BsJ(C105824hU r7, AnonymousClass4WK r8) {
        return A00(r8.A09, r8.A06, r7.A00, r8.A05);
    }

    public final synchronized void Bso(AnonymousClass4WK r3) {
        if (this.A01.containsKey(r3.A08)) {
            this.A00.put(r3.A08, r3);
        }
    }

    public final synchronized AnonymousClass4WK A00(String str, C105884ha r20, C105814hT r21, long j) {
        AnonymousClass4WK r0;
        synchronized (this) {
            C105814hT r3 = r21;
            if (!this.A01.containsKey(r3.A04) || !this.A00.containsKey(r3.A04)) {
                Map map = this.A00;
                String str2 = r3.A04;
                AnonymousClass0C1 r6 = r3.A03;
                long currentTimeMillis = System.currentTimeMillis();
                String str3 = str;
                map.put(str2, new AnonymousClass4WK(str2, r6, 0, 0, currentTimeMillis, currentTimeMillis, 0, str3, r20, j));
                Set set = (Set) this.A02.get(str3);
                if (set == null) {
                    set = new HashSet();
                    this.A02.put(str3, set);
                }
                set.add(r3.A04);
            }
            this.A01.put(r3.A04, r3);
            Object obj = this.A00.get(r3.A04);
            AnonymousClass0a4.A06(obj);
            r0 = (AnonymousClass4WK) obj;
        }
        return r0;
    }

    public final Collection AYy(String str) {
        ArrayList arrayList = new ArrayList();
        if (this.A02.containsKey(str)) {
            Set set = (Set) this.A02.get(str);
            for (C105814hT r1 : this.A01.values()) {
                if (set.contains(r1.A04)) {
                    arrayList.add(r1);
                }
            }
        }
        return arrayList;
    }
}
