package p000X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1vW  reason: invalid class name and case insensitive filesystem */
public final class C44051vW implements C44061vX {
    public final /* synthetic */ C256719u A00;
    public final /* synthetic */ C44041vV A01;

    public C44051vW(C256719u r1, C44041vV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void B6q(C26211Cc r5) {
        C44041vV r1 = this.A01;
        if (r1 != null) {
            C40291oQ r3 = r1.A01.A00;
            String str = r1.A02;
            C256019m r0 = r1.A00;
            synchronized (r3) {
                String str2 = r0.A09;
                Set set = (Set) r3.A02.get(str);
                if (set != null) {
                    set.remove(r5);
                }
                r3.A01.remove(r5);
                if (str2 != null && r3.A00.containsKey(str2)) {
                    ((Set) r3.A00.get(str2)).remove(r5);
                }
            }
        }
    }

    public final void BJG(C26211Cc r7) {
        Set hashSet;
        C44041vV r1 = this.A01;
        if (r1 != null) {
            C40291oQ r2 = r1.A01.A00;
            String str = r1.A02;
            C256019m r4 = r1.A00;
            synchronized (r2) {
                String str2 = r4.A09;
                if (r2.A02.containsKey(str)) {
                    hashSet = (Set) r2.A02.get(str);
                } else {
                    hashSet = new HashSet();
                }
                hashSet.add(r7);
                r2.A02.put(str, hashSet);
                r2.A01.put(r7, r4);
                if (str2 != null) {
                    if (r2.A00.containsKey(str2)) {
                        ((Set) r2.A00.get(str2)).add(r7);
                    } else {
                        HashSet hashSet2 = new HashSet();
                        hashSet2.add(r7);
                        r2.A00.put(str2, hashSet2);
                    }
                }
            }
        }
    }
}
