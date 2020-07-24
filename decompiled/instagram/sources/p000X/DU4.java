package p000X;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: X.DU4 */
public final class DU4<K, V> extends AbstractQueue<DU5<K, V>> {
    public final DU5 A00 = new DUM(this);

    public final void clear() {
        DU5 AQp = this.A00.AQp();
        while (true) {
            DU5 du5 = this.A00;
            if (AQp != du5) {
                DU5 AQp2 = AQp.AQp();
                DU7 du7 = DU7.A01;
                AQp.BjC(du7);
                AQp.Bji(du7);
                AQp = AQp2;
            } else {
                du5.BjC(du5);
                DU5 du52 = this.A00;
                du52.Bji(du52);
                return;
            }
        }
    }

    public final boolean contains(Object obj) {
        if (((DU5) obj).AQp() != DU7.A01) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if (this.A00.AQp() == this.A00) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        DU5 AQp = this.A00.AQp();
        if (AQp == this.A00) {
            AQp = null;
        }
        return new DUO(this, AQp);
    }

    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        DU5 du5 = (DU5) obj;
        DU5 ASh = du5.ASh();
        DU5 AQp = du5.AQp();
        ASh.BjC(AQp);
        AQp.Bji(ASh);
        DU5 ASh2 = this.A00.ASh();
        ASh2.BjC(du5);
        du5.Bji(ASh2);
        DU5 du52 = this.A00;
        du5.BjC(du52);
        du52.Bji(du5);
        return true;
    }

    public final /* bridge */ /* synthetic */ Object peek() {
        DU5 AQp = this.A00.AQp();
        if (AQp == this.A00) {
            return null;
        }
        return AQp;
    }

    public final /* bridge */ /* synthetic */ Object poll() {
        DU5 AQp = this.A00.AQp();
        if (AQp == this.A00) {
            return null;
        }
        remove(AQp);
        return AQp;
    }

    public final boolean remove(Object obj) {
        DU5 du5 = (DU5) obj;
        DU5 ASh = du5.ASh();
        DU5 AQp = du5.AQp();
        ASh.BjC(AQp);
        AQp.Bji(ASh);
        DU7 du7 = DU7.A01;
        du5.BjC(du7);
        du5.Bji(du7);
        if (AQp != du7) {
            return true;
        }
        return false;
    }

    public final int size() {
        int i = 0;
        for (DU5 AQp = this.A00.AQp(); AQp != this.A00; AQp = AQp.AQp()) {
            i++;
        }
        return i;
    }
}
