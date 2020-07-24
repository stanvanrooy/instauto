package p000X;

/* renamed from: X.BU2 */
public abstract class BU2 extends AnonymousClass2GM {
    public BU9 A00;
    public long A01;
    public boolean A02;

    public void A01() {
        BU7 bu7;
        boolean compareAndSet;
        if (this instanceof BTz) {
            BTz bTz = (BTz) this;
            BU5.A00.set((Object) null);
            bTz._isCompleted = 1;
            boolean z = AnonymousClass2GE.A01;
            if (!z || bTz._isCompleted != 0) {
                while (true) {
                    Object obj = bTz._queue;
                    if (obj != null) {
                        if (!(obj instanceof C50432Gh)) {
                            if (obj == BU6.A00) {
                                break;
                            }
                            C50432Gh r2 = new C50432Gh(8, true);
                            r2.A00((Runnable) obj);
                            compareAndSet = BTz.A01.compareAndSet(bTz, obj, r2);
                            continue;
                        } else {
                            ((C50432Gh) obj).A03();
                            break;
                        }
                    } else {
                        compareAndSet = BTz.A01.compareAndSet(bTz, (Object) null, BU6.A00);
                        continue;
                    }
                    if (compareAndSet) {
                        break;
                    }
                }
                do {
                } while (bTz.A09() <= 0);
                long nanoTime = System.nanoTime();
                while (true) {
                    BU8 bu8 = (BU8) bTz._delayed;
                    if (bu8 != null) {
                        synchronized (bu8) {
                            bu7 = null;
                            if (bu8._size > 0) {
                                bu7 = bu8.A02(0);
                            }
                        }
                        BU1 bu1 = (BU1) bu7;
                        if (bu1 != null) {
                            if (z) {
                                boolean z2 = false;
                                if (bTz != BU0.A00) {
                                    z2 = true;
                                }
                                if (!z2) {
                                    break;
                                }
                            }
                            BU0.A00.A0A(nanoTime, bu1);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            throw new AssertionError();
        }
    }

    public final void A02() {
        long j = this.A01 - 4294967296L;
        this.A01 = j;
        if (j <= 0) {
            if (AnonymousClass2GE.A01) {
                boolean z = false;
                if (j == 0) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if (this.A02) {
                A01();
            }
        }
    }

    public final void A03(AnonymousClass2HR r14) {
        BU9 bu9 = this.A00;
        if (bu9 == null) {
            bu9 = new BU9();
            this.A00 = bu9;
        }
        Object[] objArr = bu9.A02;
        int i = bu9.A01;
        objArr[i] = r14;
        int length = objArr.length;
        int i2 = (length - 1) & (i + 1);
        bu9.A01 = i2;
        int i3 = bu9.A00;
        if (i2 == i3) {
            Object[] objArr2 = new Object[(length << 1)];
            C52862Qm.A01(objArr, objArr2, 0, i3, 0, 10);
            Object[] objArr3 = bu9.A02;
            int length2 = objArr3.length;
            int i4 = bu9.A00;
            C52862Qm.A01(objArr3, objArr2, length2 - i4, 0, i4, 4);
            bu9.A02 = objArr2;
            bu9.A00 = 0;
            bu9.A01 = length;
        }
    }

    public final void A04(boolean z) {
        long j;
        long j2 = this.A01;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        this.A01 = j2 + j;
        if (!z) {
            this.A02 = true;
        }
    }

    public final boolean A05() {
        if (this.A01 < 4294967296L) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.2HR} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final boolean A06() {
        BU9 bu9 = this.A00;
        if (bu9 != null) {
            int i = bu9.A00;
            Object obj = null;
            if (i != bu9.A01) {
                Object[] objArr = bu9.A02;
                Object obj2 = objArr[i];
                objArr[i] = null;
                bu9.A00 = (i + 1) & (objArr.length - 1);
                if (obj2 != null) {
                    obj = obj2;
                } else {
                    throw new C183227s6("null cannot be cast to non-null type T");
                }
            }
            AnonymousClass2HR r1 = (AnonymousClass2HR) obj;
            if (r1 != null) {
                r1.run();
                return true;
            }
        }
        return false;
    }

    public long A07() {
        BU9 bu9 = this.A00;
        if (bu9 == null) {
            return Long.MAX_VALUE;
        }
        int i = bu9.A00;
        int i2 = bu9.A01;
        boolean z = false;
        if (i == i2) {
            z = true;
        }
        if (!z) {
            return 0;
        }
        return Long.MAX_VALUE;
    }
}
