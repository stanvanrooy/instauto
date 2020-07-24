package p000X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.DOK */
public abstract class DOK implements Iterator {
    public int A00;
    public MapMakerInternalMap.Segment A01;
    public int A02 = -1;
    public C13620ix A03;
    public DOJ A04;
    public DOJ A05;
    public AtomicReferenceArray A06;
    public final /* synthetic */ MapMakerInternalMap A07;

    public final void A00() {
        boolean z;
        boolean z2;
        MapMakerInternalMap.Segment segment;
        boolean z3;
        this.A05 = null;
        C13620ix r0 = this.A03;
        if (r0 != null) {
            while (true) {
                C13620ix AQm = r0.AQm();
                this.A03 = AQm;
                if (AQm == null) {
                    break;
                } else if (A01(AQm)) {
                    z = true;
                    break;
                } else {
                    r0 = this.A03;
                }
            }
        }
        z = false;
        if (!z) {
            while (true) {
                int i = this.A02;
                if (i >= 0) {
                    AtomicReferenceArray atomicReferenceArray = this.A06;
                    this.A02 = i - 1;
                    C13620ix r02 = (C13620ix) atomicReferenceArray.get(i);
                    this.A03 = r02;
                    if (r02 == null) {
                        continue;
                    } else {
                        if (!A01(r02)) {
                            C13620ix r03 = this.A03;
                            if (r03 != null) {
                                while (true) {
                                    C13620ix AQm2 = r03.AQm();
                                    this.A03 = AQm2;
                                    if (AQm2 == null) {
                                        break;
                                    } else if (A01(AQm2)) {
                                        z3 = true;
                                        break;
                                    } else {
                                        r03 = this.A03;
                                    }
                                }
                            }
                            z3 = false;
                            if (!z3) {
                                continue;
                            }
                        }
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                if (!z2) {
                    do {
                        int i2 = this.A00;
                        if (i2 >= 0) {
                            MapMakerInternalMap.Segment[] segmentArr = this.A07.A05;
                            this.A00 = i2 - 1;
                            segment = segmentArr[i2];
                            this.A01 = segment;
                        } else {
                            return;
                        }
                    } while (segment.count == 0);
                    AtomicReferenceArray atomicReferenceArray2 = this.A01.table;
                    this.A06 = atomicReferenceArray2;
                    this.A02 = atomicReferenceArray2.length() - 1;
                } else {
                    return;
                }
            }
        }
    }

    public Object next() {
        if (this instanceof DOL) {
            DOL dol = (DOL) this;
            DOJ doj = dol.A05;
            if (doj != null) {
                dol.A04 = doj;
                dol.A00();
                return dol.A04.getValue();
            }
        } else if (!(this instanceof DOM)) {
            DON don = (DON) this;
            DOJ doj2 = don.A05;
            if (doj2 != null) {
                don.A04 = doj2;
                don.A00();
                return don.A04;
            }
        } else {
            DOM dom = (DOM) this;
            DOJ doj3 = dom.A05;
            if (doj3 != null) {
                dom.A04 = doj3;
                dom.A00();
                return dom.A04.getKey();
            }
        }
        throw new NoSuchElementException();
    }

    public DOK(MapMakerInternalMap mapMakerInternalMap) {
        this.A07 = mapMakerInternalMap;
        this.A00 = mapMakerInternalMap.A05.length - 1;
        A00();
    }

    public final boolean hasNext() {
        if (this.A05 != null) {
            return true;
        }
        return false;
    }

    public final void remove() {
        boolean z = false;
        if (this.A04 != null) {
            z = true;
        }
        AnonymousClass0a4.A0C(z, C193418Ps.$const$string(9));
        this.A07.remove(this.A04.getKey());
        this.A04 = null;
    }

    public final boolean A01(C13620ix r5) {
        Object obj;
        boolean z;
        try {
            Object key = r5.getKey();
            if (r5.getKey() == null || (obj = r5.getValue()) == null) {
                obj = null;
            }
            if (obj != null) {
                this.A05 = new DOJ(this.A07, key, obj);
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.A01.A05();
        }
    }
}
