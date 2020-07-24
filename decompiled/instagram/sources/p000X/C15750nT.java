package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0nT  reason: invalid class name and case insensitive filesystem */
public final class C15750nT extends C13140hx {
    public int A00 = 1;
    public final C13080hr[] A01;

    public C15750nT(C13080hr[] r2) {
        super(r2[0]);
        this.A01 = r2;
    }

    public static C15750nT A00(C13080hr r3, C13080hr r4) {
        boolean z = r3 instanceof C15750nT;
        if (z || (r4 instanceof C15750nT)) {
            ArrayList arrayList = new ArrayList();
            if (z) {
                ((C15750nT) r3).A0x(arrayList);
            } else {
                arrayList.add(r3);
            }
            if (r4 instanceof C15750nT) {
                ((C15750nT) r4).A0x(arrayList);
            } else {
                arrayList.add(r4);
            }
            return new C15750nT((C13080hr[]) arrayList.toArray(new C13080hr[arrayList.size()]));
        }
        return new C15750nT(new C13080hr[]{r3, r4});
    }

    public final C13120hv A0p() {
        boolean z;
        do {
            C13120hv A0p = this.A00.A0p();
            if (A0p != null) {
                return A0p;
            }
            int i = this.A00;
            C13080hr[] r1 = this.A01;
            if (i >= r1.length) {
                z = false;
                continue;
            } else {
                this.A00 = i + 1;
                this.A00 = r1[i];
                z = true;
                continue;
            }
        } while (z);
        return null;
    }

    public final void A0x(List list) {
        int length = this.A01.length;
        for (int i = this.A00 - 1; i < length; i++) {
            C13080hr r1 = this.A01[i];
            if (r1 instanceof C15750nT) {
                ((C15750nT) r1).A0x(list);
            } else {
                list.add(r1);
            }
        }
    }

    public final void close() {
        boolean z;
        do {
            this.A00.close();
            int i = this.A00;
            C13080hr[] r1 = this.A01;
            if (i >= r1.length) {
                z = false;
                continue;
            } else {
                this.A00 = i + 1;
                this.A00 = r1[i];
                z = true;
                continue;
            }
        } while (z);
    }
}
