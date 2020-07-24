package p000X;

/* renamed from: X.1Zd  reason: invalid class name and case insensitive filesystem */
public final class C31641Zd implements C31651Ze {
    public int A00;
    public final Object[] A01 = new Object[256];

    public final void BaN(Object[] objArr, int i) {
        int length = objArr.length;
        if (i > length) {
            i = length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            int i3 = this.A00;
            Object[] objArr2 = this.A01;
            if (i3 < objArr2.length) {
                objArr2[i3] = obj;
                this.A00 = i3 + 1;
            }
        }
    }

    public final Object A2N() {
        int i = this.A00;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.A01;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.A00 = i2;
        return obj;
    }

    public final boolean BaL(Object obj) {
        int i = this.A00;
        Object[] objArr = this.A01;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.A00 = i + 1;
        return true;
    }
}
