package p000X;

import java.io.Serializable;

/* renamed from: X.C12 */
public final class C12 implements Serializable {
    public BYV A00;

    public final synchronized C12960hf A00(Class cls, C0s c0s) {
        String str;
        C25942Bct bct = new C25942Bct(cls);
        BYV byv = this.A00;
        if (byv == null) {
            this.A00 = new BYV(20, 200);
        } else {
            C12960hf r0 = (C12960hf) byv.get(bct);
            if (r0 != null) {
                return r0;
            }
        }
        C2B A05 = c0s.A01().A05(c0s.A02(c0s.A03(cls)).A04());
        if (A05 != null) {
            str = A05.A00;
            boolean z = false;
            if (str.length() > 0) {
                z = true;
            }
            if (z) {
                C12960hf r1 = new C12960hf(str);
                this.A00.put(bct, r1);
                return r1;
            }
        }
        str = cls.getSimpleName();
        C12960hf r12 = new C12960hf(str);
        this.A00.put(bct, r12);
        return r12;
    }
}
