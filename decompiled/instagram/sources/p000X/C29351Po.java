package p000X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Po  reason: invalid class name and case insensitive filesystem */
public abstract class C29351Po {
    public C29371Pq A00;
    public List A01 = Collections.unmodifiableList(new ArrayList());
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();
    public final LinkedList A04 = new LinkedList();

    public abstract String A05(Object obj);

    public void A08() {
    }

    public void A0B(Object obj) {
        A01(obj, 0);
    }

    public void A0C(Object obj) {
    }

    public void A0D(Object obj) {
    }

    private void A00() {
        this.A02.clear();
        for (int i = 0; i < this.A01.size(); i++) {
            this.A02.put(A05(this.A01.get(i)), Integer.valueOf(i));
        }
    }

    public int A02() {
        return this.A01.size();
    }

    public final int A03() {
        return this.A01.size();
    }

    public final Object A04(int i) {
        return this.A01.get(i);
    }

    public void A06() {
        this.A03.clear();
        this.A04.clear();
        this.A01 = Collections.unmodifiableList(new ArrayList());
        this.A02.clear();
        A08();
    }

    public void A07() {
        this.A01 = Collections.unmodifiableList(new ArrayList(this.A04));
        A00();
    }

    public void A09(AnonymousClass1QB r6) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (r6.BnD(next)) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        for (Object A0I : arrayList) {
            A0I(A0I);
        }
        this.A01 = Collections.unmodifiableList(arrayList2);
        A00();
    }

    public void A0A(Object obj) {
        A01(obj, this.A04.size());
    }

    public final boolean A0G() {
        return !this.A01.isEmpty();
    }

    public boolean A0I(Object obj) {
        boolean remove = this.A04.remove(obj);
        this.A03.remove(A05(obj));
        if (remove) {
            A0D(obj);
        }
        return remove;
    }

    public boolean A0K(String str) {
        Integer num = (Integer) this.A02.get(str);
        if (num == null || !A0I(A04(num.intValue()))) {
            return false;
        }
        return true;
    }

    private void A01(Object obj, int i) {
        String A05 = A05(obj);
        if (this.A03.get(A05) == null) {
            this.A03.put(A05, obj);
            this.A04.add(i, obj);
            A0C(obj);
            return;
        }
        C29371Pq r0 = this.A00;
        if (r0 != null) {
            r0.B85(obj);
        }
    }

    public void A0F(List list) {
        for (Object A0A : list) {
            A0A(A0A);
        }
    }

    public final boolean A0H() {
        if (A02() == 0) {
            return true;
        }
        return false;
    }

    public final boolean A0J(Object obj) {
        return this.A03.containsKey(A05(obj));
    }

    public void A0E(Object obj, int i) {
        A01(obj, i);
    }

    public C29351Po() {
    }

    public C29351Po(List list) {
        this.A01 = list;
    }
}
