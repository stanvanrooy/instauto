package p000X;

/* renamed from: X.A9E */
public final class A9E implements AnonymousClass1Q8 {
    public int A00 = 0;
    public final Object[] A01 = new Object[1024];

    public final synchronized void A00() {
        for (int i = 0; i < this.A00; i++) {
            this.A01[i] = null;
        }
        this.A00 = 0;
    }

    public final synchronized Object A2N() {
        int i = this.A00;
        if (i == 0) {
            return null;
        }
        int i2 = i - 1;
        this.A00 = i2;
        Object[] objArr = this.A01;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final synchronized boolean BaL(Object obj) {
        boolean z;
        int i = this.A00;
        Object[] objArr = this.A01;
        if (i == objArr.length) {
            z = false;
        } else {
            objArr[i] = obj;
            z = true;
            this.A00 = i + 1;
        }
        return z;
    }
}
