package p000X;

import java.util.Map;

/* renamed from: X.0Eb  reason: invalid class name and case insensitive filesystem */
public final class C04460Eb extends AnonymousClass00M {
    public final /* synthetic */ C04450Ea A00;

    public C04460Eb(C04450Ea r1) {
        this.A00 = r1;
    }

    public final int A01() {
        return this.A00.A00;
    }

    public final int A02(Object obj) {
        return this.A00.A04(obj);
    }

    public final int A03(Object obj) {
        return this.A00.A03(obj);
    }

    public final Object A04(int i, int i2) {
        return this.A00.A02[(i << 1) + i2];
    }

    public final Object A05(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.A00.A02;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final Map A06() {
        return this.A00;
    }

    public final void A07() {
        this.A00.clear();
    }

    public final void A08(int i) {
        this.A00.A07(i);
    }

    public final void A09(Object obj, Object obj2) {
        this.A00.put(obj, obj2);
    }
}
