package p000X;

import java.lang.reflect.Array;

/* renamed from: X.0Ou  reason: invalid class name and case insensitive filesystem */
public final class C06370Ou {
    public int A00 = 0;
    public C06380Ov A01;
    public Object[] A02;
    public AnonymousClass0MK A03;
    public final Class A04;

    public static int A01(C06370Ou r6, Object obj, boolean z) {
        int A002 = A00(r6, obj, 1);
        if (A002 == -1) {
            A002 = 0;
        } else if (A002 < r6.A00) {
            Object obj2 = r6.A02[A002];
            if (r6.A01.A06(obj2, obj)) {
                if (r6.A01.A05(obj2, obj)) {
                    r6.A02[A002] = obj;
                    return A002;
                }
                r6.A02[A002] = obj;
                r6.A01.A01(A002, 1);
                return A002;
            }
        }
        int i = r6.A00;
        if (A002 <= i) {
            Object[] objArr = r6.A02;
            int length = objArr.length;
            if (i == length) {
                Object[] objArr2 = (Object[]) Array.newInstance(r6.A04, length + 10);
                System.arraycopy(r6.A02, 0, objArr2, 0, A002);
                objArr2[A002] = obj;
                System.arraycopy(r6.A02, A002, objArr2, A002 + 1, r6.A00 - A002);
                r6.A02 = objArr2;
            } else {
                System.arraycopy(objArr, A002, objArr, A002 + 1, i - A002);
                r6.A02[A002] = obj;
            }
            r6.A00++;
            if (z) {
                r6.A01.A02(A002, 1);
            }
            return A002;
        }
        throw new IndexOutOfBoundsException(AnonymousClass000.A07("cannot add item to ", A002, " because size is ", i));
    }

    public final void A07(Object obj) {
        int A002 = A00(this, obj, 2);
        if (A002 != -1) {
            A02(this, A002, true);
        }
    }

    public C06370Ou(Class cls, C06380Ov r3) {
        this.A04 = cls;
        this.A02 = (Object[]) Array.newInstance(cls, 10);
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r2 >= r5) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        r1 = r9.A02[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r9.A01.A00(r1, r10) != 0) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r9.A01.A06(r1, r10) == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        r2 = -1;
     */
    public static int A00(C06370Ou r9, Object obj, int i) {
        int i2 = r9.A00;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (i3 + i2) >> 1;
            Object obj2 = r9.A02[i4];
            int A002 = r9.A01.A00(obj2, obj);
            if (A002 < 0) {
                i3 = i4 + 1;
            } else if (A002 != 0) {
                i2 = i4;
            } else if (r9.A01.A06(obj2, obj)) {
                return i4;
            } else {
                int i5 = i4;
                int i6 = i4 - 1;
                while (true) {
                    if (i6 < i3) {
                        break;
                    }
                    Object obj3 = r9.A02[i6];
                    if (r9.A01.A00(obj3, obj) != 0) {
                        break;
                    } else if (r9.A01.A06(obj3, obj)) {
                        i5 = i6;
                        break;
                    } else {
                        i6--;
                    }
                }
                if (i == 1 && i5 == -1) {
                    return i4;
                }
                return i5;
            }
        }
        if (i != 1) {
            return -1;
        }
        return i3;
    }

    public static void A02(C06370Ou r4, int i, boolean z) {
        Object[] objArr = r4.A02;
        System.arraycopy(objArr, i + 1, objArr, i, (r4.A00 - i) - 1);
        int i2 = r4.A00 - 1;
        r4.A00 = i2;
        r4.A02[i2] = null;
        if (z) {
            r4.A01.A04(i, 1);
        }
    }

    public final Object A03(int i) {
        int i2 = this.A00;
        if (i < i2 && i >= 0) {
            return this.A02[i];
        }
        throw new IndexOutOfBoundsException(AnonymousClass000.A07("Asked to get item at ", i, " but size is ", i2));
    }

    public final void A04() {
        C06380Ov r1 = this.A01;
        if (!(r1 instanceof AnonymousClass0MK)) {
            if (this.A03 == null) {
                this.A03 = new AnonymousClass0MK(r1);
            }
            this.A01 = this.A03;
        }
    }

    public final void A05() {
        C06380Ov r1 = this.A01;
        if (r1 instanceof AnonymousClass0MK) {
            ((AnonymousClass0MK) r1).A07();
        }
        C06380Ov r12 = this.A01;
        AnonymousClass0MK r0 = this.A03;
        if (r12 == r0) {
            this.A01 = r0.A03;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r5.A01.A05(r4, r7) == false) goto L_0x0011;
     */
    public final void A06(int i, Object obj) {
        boolean z;
        Object A032 = A03(i);
        if (A032 != obj) {
            z = false;
        }
        z = true;
        if (A032 == obj || this.A01.A00(A032, obj) != 0) {
            if (z) {
                this.A01.A01(i, 1);
            }
            A02(this, i, false);
            int A012 = A01(this, obj, false);
            if (i != A012) {
                this.A01.A03(i, A012);
                return;
            }
            return;
        }
        this.A02[i] = obj;
        if (z) {
            this.A01.A01(i, 1);
        }
    }
}
