package p000X;

import java.lang.ref.WeakReference;

/* renamed from: X.1nH  reason: invalid class name and case insensitive filesystem */
public final class C39661nH {
    public final /* synthetic */ C39651nG A00;
    public final /* synthetic */ AnonymousClass1FG A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ WeakReference A04;

    public C39661nH(AnonymousClass1FG r1, Object obj, C39651nG r3, String str, WeakReference weakReference) {
        this.A01 = r1;
        this.A02 = obj;
        this.A00 = r3;
        this.A03 = str;
        this.A04 = weakReference;
    }

    public final void A00(boolean z) {
        C49152Az r2;
        int i = this.A00.A00;
        String str = this.A03;
        AnonymousClass1FH r3 = this.A01.A05;
        AnonymousClass1FC r22 = r3.A00.A07;
        synchronized (r22) {
            C39631nE r1 = (C39631nE) r22.A01.get(str);
            if (r1 == null) {
                r1 = new C39631nE();
                r22.A01.put(str, r1);
            }
            if (z) {
                r1.A01 = i;
                r1.A02 = 0;
            } else {
                r1.A02++;
            }
        }
        C12670hC.A04(new C44881wv(r3));
        WeakReference weakReference = this.A04;
        if (weakReference != null) {
            r2 = (C49152Az) weakReference.get();
        } else {
            r2 = null;
        }
        if (r2 != null) {
            r2.A02.A06(new C58982gq(r2, z));
        }
        AnonymousClass1FG.A00(this.A01);
    }
}
