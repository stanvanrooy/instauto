package p000X;

/* renamed from: X.DRN */
public final class DRN extends DRO {
    public int A00;
    public boolean A01;
    public final C27841Jk A02;
    public final Object[] A03;
    public volatile boolean A04;

    public final int BdM(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        this.A01 = true;
        return 1;
    }

    public final void dispose() {
        this.A04 = true;
    }

    public final void clear() {
        this.A00 = this.A03.length;
    }

    public final boolean isEmpty() {
        if (this.A00 == this.A03.length) {
            return true;
        }
        return false;
    }

    public final Object poll() {
        int i = this.A00;
        Object[] objArr = this.A03;
        if (i == objArr.length) {
            return null;
        }
        this.A00 = i + 1;
        Object obj = objArr[i];
        AnonymousClass1J6.A01(obj, "The array element is null");
        return obj;
    }

    public DRN(C27841Jk r1, Object[] objArr) {
        this.A02 = r1;
        this.A03 = objArr;
    }
}
