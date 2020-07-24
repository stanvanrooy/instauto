package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Ta  reason: invalid class name and case insensitive filesystem */
public class C30231Ta {
    public AnonymousClass1TY A00 = AnonymousClass1TY.A05;
    public List A01 = null;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C30231Ta A00(C28111Kl r2) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(r2);
        return this;
    }

    public AnonymousClass1TY A02() {
        return new AnonymousClass1TY(this);
    }

    public C30231Ta(Object obj, Object obj2, String str) {
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = str;
    }

    public C30231Ta A01(AnonymousClass1TY r1) {
        this.A00 = r1;
        return this;
    }
}
