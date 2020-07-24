package p000X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AE3 */
public final class AE3 implements C29241Pd {
    public final ArrayList A00 = new ArrayList();
    public final List A01;
    public final List A02;

    public final void A01(ADe aDe) {
        for (int i = 0; i < this.A00.size(); i++) {
            AE9 ae9 = (AE9) this.A00.get(i);
            if (ae9.A00 == null) {
                ae9.A00 = (AnonymousClass2D8) this.A01.get(i);
            }
        }
        for (AE8 ae8 : this.A02) {
            int i2 = ae8.A02;
            if (i2 == 0) {
                int i3 = ae8.A00;
                List A002 = A00(ae8);
                aDe.A05.addAll(i3, A002);
                aDe.notifyItemRangeInserted(i3, A002.size());
            } else if (i2 == 1) {
                int i4 = ae8.A00;
                List A003 = A00(ae8);
                int size = A003.size();
                for (int i5 = 0; i5 < size; i5++) {
                    aDe.A05.set(i4 + i5, A003.get(i5));
                }
                aDe.notifyItemRangeChanged(i4, A003.size());
            } else if (i2 == 2) {
                int i6 = ae8.A00;
                int i7 = ae8.A01;
                for (int i8 = 0; i8 < i7; i8++) {
                    aDe.A05.remove(i6);
                }
                aDe.notifyItemRangeRemoved(i6, i7);
            } else if (i2 == 3) {
                int i9 = ae8.A00;
                int i10 = ae8.A01;
                List list = aDe.A05;
                list.add(i10, list.remove(i9));
                aDe.notifyItemMoved(i9, i10);
            }
        }
    }

    public final void BIS(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            this.A00.remove(i);
        }
        this.A02.add(new AE8(2, i, i2, (List) null));
    }

    public static List A00(AE8 ae8) {
        List list = ae8.A03;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (int i = 0; i < ae8.A03.size(); i++) {
                arrayList.add(((AE9) ae8.A03.get(i)).A00);
            }
            return arrayList;
        }
        throw new IllegalStateException("Add or Update should always have components to operate on");
    }

    public final void Auy(int i, int i2, Object obj) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            AE9 ae9 = (AE9) this.A00.get(i + i3);
            ae9.A00 = null;
            arrayList.add(ae9);
        }
        this.A02.add(new AE8(1, i, -1, arrayList));
    }

    public final void B7Z(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            AE9 ae9 = new AE9((AnonymousClass2D8) null);
            this.A00.add(i + i3, ae9);
            arrayList.add(ae9);
        }
        this.A02.add(new AE8(0, i, -1, arrayList));
    }

    public final void BBx(int i, int i2) {
        this.A00.add(i2, (AE9) this.A00.remove(i));
        this.A02.add(new AE8(3, i, i2, (List) null));
    }

    public AE3(List list, List list2) {
        this.A01 = list2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A00.add(new AE9((AnonymousClass2D8) it.next()));
        }
        this.A02 = new ArrayList();
    }
}
