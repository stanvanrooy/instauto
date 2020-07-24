package p000X;

import android.util.SparseArray;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0gC  reason: invalid class name and case insensitive filesystem */
public abstract class C12110gC {
    public C12190gK A00;
    public final SparseArray A01 = new SparseArray();
    public final C12210gM A02 = C12210gM.A00();
    public final C12200gL A03 = C12200gL.A01;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r2 == p000X.AnonymousClass2MZ.A00) goto L_0x000f;
     */
    public final void A02(int i, List list) {
        boolean z;
        if (list != null) {
            C12470gn A002 = this.A03.A00(i);
            if (A002 != null) {
                z = true;
            }
            z = false;
            if (z) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AnonymousClass299 r4 = (AnonymousClass299) it.next();
                    int i2 = r4.A03;
                    C12230gP r3 = (C12230gP) this.A01.get(i2);
                    if (r3 == null) {
                        C12190gK r2 = this.A00;
                        C12210gM r1 = this.A02;
                        if (C12240gQ.A01 == null) {
                            C12240gQ.A01 = new C12240gQ(r1);
                        }
                        r3 = new C12230gP(i2, r2, C12240gQ.A01);
                        this.A01.put(i2, r3);
                    }
                    C12100gB r12 = C12230gP.A07;
                    if (r12 != null && r12.A0D(r4.A04)) {
                        r3.A05.add(r4);
                        r3.A03.put(r4.A04, r4);
                    }
                }
            }
        }
    }

    public C12110gC() {
        if (C12190gK.A05 == null) {
            C12190gK.A05 = new C12190gK((AnonymousClass0Ba) null);
        }
        this.A00 = C12190gK.A05;
    }
}
