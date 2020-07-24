package p000X;

import java.util.ArrayList;

/* renamed from: X.13n  reason: invalid class name and case insensitive filesystem */
public final class C241613n {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public final Object[] A03;

    public final synchronized int A00() {
        return this.A00;
    }

    public final synchronized Object A01() {
        Object obj;
        int i = this.A00;
        if (i > 0) {
            Object[] objArr = this.A03;
            int i2 = this.A02;
            obj = objArr[i2];
            objArr[i2] = null;
            this.A02 = (i2 + 1) % objArr.length;
            this.A00 = i - 1;
        } else {
            throw new IllegalStateException("Underflow");
        }
        return obj;
    }

    public final synchronized Object A02(int i) {
        Object[] objArr;
        if (this.A00 > i) {
            objArr = this.A03;
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objArr[(i + this.A02) % objArr.length];
    }

    public final synchronized ArrayList A03() {
        ArrayList arrayList;
        arrayList = new ArrayList(A00());
        for (int i = 0; i < this.A00; i++) {
            arrayList.add(A02(i));
        }
        return arrayList;
    }

    public final synchronized void A04() {
        int i = 0;
        this.A00 = 0;
        this.A02 = 0;
        this.A01 = 0;
        while (true) {
            Object[] objArr = this.A03;
            if (i < objArr.length) {
                objArr[i] = null;
                i++;
            }
        }
    }

    public final synchronized void A05(Object obj) {
        boolean z;
        if (this.A03.length != 0) {
            synchronized (this) {
                z = false;
                if (this.A00 == this.A03.length) {
                    z = true;
                }
            }
            if (z && !A06()) {
                A01();
            }
            int i = this.A00;
            Object[] objArr = this.A03;
            int length = objArr.length;
            if (i < length) {
                int i2 = this.A01;
                objArr[i2] = obj;
                this.A01 = (i2 + 1) % length;
                this.A00 = i + 1;
            } else {
                throw new IllegalStateException("Overflow");
            }
        }
    }

    public final synchronized boolean A06() {
        boolean z;
        z = false;
        if (this.A00 == 0) {
            z = true;
        }
        return z;
    }

    public C241613n(int i) {
        this.A03 = new Object[i];
    }
}
