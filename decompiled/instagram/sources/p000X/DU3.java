package p000X;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: X.DU3 */
public final class DU3<K, V> extends AbstractQueue<DU5<K, V>> {
    public final DU5 A00 = new DU2(this);

    public final void clear() {
        DU5 AQq = this.A00.AQq();
        while (true) {
            DU5 du5 = this.A00;
            if (AQq != du5) {
                DU5 AQq2 = AQq.AQq();
                DU7 du7 = DU7.A01;
                AQq.BjD(du7);
                AQq.Bjj(du7);
                AQq = AQq2;
            } else {
                du5.BjD(du5);
                DU5 du52 = this.A00;
                du52.Bjj(du52);
                return;
            }
        }
    }

    public final boolean contains(Object obj) {
        if (((DU5) obj).AQq() != DU7.A01) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if (this.A00.AQq() == this.A00) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        DU5 AQq = this.A00.AQq();
        if (AQq == this.A00) {
            AQq = null;
        }
        return new DUN(this, AQq);
    }

    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        DU5 du5 = (DU5) obj;
        DU5 ASi = du5.ASi();
        DU5 AQq = du5.AQq();
        ASi.BjD(AQq);
        AQq.Bjj(ASi);
        DU5 ASi2 = this.A00.ASi();
        ASi2.BjD(du5);
        du5.Bjj(ASi2);
        DU5 du52 = this.A00;
        du5.BjD(du52);
        du52.Bjj(du5);
        return true;
    }

    public final /* bridge */ /* synthetic */ Object peek() {
        DU5 AQq = this.A00.AQq();
        if (AQq == this.A00) {
            return null;
        }
        return AQq;
    }

    public final /* bridge */ /* synthetic */ Object poll() {
        DU5 AQq = this.A00.AQq();
        if (AQq == this.A00) {
            return null;
        }
        remove(AQq);
        return AQq;
    }

    public final boolean remove(Object obj) {
        DU5 du5 = (DU5) obj;
        DU5 ASi = du5.ASi();
        DU5 AQq = du5.AQq();
        ASi.BjD(AQq);
        AQq.Bjj(ASi);
        DU7 du7 = DU7.A01;
        du5.BjD(du7);
        du5.Bjj(du7);
        if (AQq != du7) {
            return true;
        }
        return false;
    }

    public final int size() {
        int i = 0;
        for (DU5 AQq = this.A00.AQq(); AQq != this.A00; AQq = AQq.AQq()) {
            i++;
        }
        return i;
    }
}
