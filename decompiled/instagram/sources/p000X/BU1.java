package p000X;

/* renamed from: X.BU1 */
public abstract class BU1 implements Runnable, Comparable, BU7, C50602Gy {
    public long A00;
    public Object A01;
    public int A02 = -1;

    public final synchronized void dispose() {
        Object obj = this.A01;
        if (obj != BU6.A01) {
            if (!(obj instanceof BU8)) {
                obj = null;
            }
            BU8 bu8 = (BU8) obj;
            if (bu8 != null) {
                synchronized (bu8) {
                    boolean z = false;
                    if (AMo() != null) {
                        int index = getIndex();
                        if (AnonymousClass2GE.A01) {
                            if (index >= 0) {
                                z = true;
                            }
                            if (!z) {
                                throw new AssertionError();
                            }
                        }
                        bu8.A02(index);
                    }
                }
            }
            this.A01 = BU6.A01;
        }
    }

    public final BU4 AMo() {
        Object obj = this.A01;
        if (!(obj instanceof BU4)) {
            obj = null;
        }
        return (BU4) obj;
    }

    public final void Bhq(BU4 bu4) {
        boolean z = false;
        if (this.A01 != BU6.A01) {
            z = true;
        }
        if (z) {
            this.A01 = bu4;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass0C5.$const$string(310).toString());
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.A00 - ((BU1) obj).A00;
        if (j > 0) {
            return 1;
        }
        if (j < 0) {
            return -1;
        }
        return 0;
    }

    public String toString() {
        return "Delayed[nanos=" + this.A00 + ']';
    }

    public BU1(long j) {
        this.A00 = j;
    }

    public final void Bi2(int i) {
        this.A02 = i;
    }

    public final int getIndex() {
        return this.A02;
    }
}
