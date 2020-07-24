package p000X;

/* renamed from: X.DRG */
public final class DRG {
    public int A00;
    public Object[] A01;
    public final int A02 = 4;
    public final Object[] A03;

    public DRG() {
        Object[] objArr = new Object[5];
        this.A03 = objArr;
        this.A01 = objArr;
    }

    public final void A00(C27961Jw r5) {
        int i = this.A02;
        for (Object[] objArr = this.A03; objArr != null; objArr = objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (!r5.test(objArr2)) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void A01(Object obj) {
        int i = this.A02;
        int i2 = this.A00;
        if (i2 == i) {
            Object[] objArr = new Object[(i + 1)];
            this.A01[i] = objArr;
            this.A01 = objArr;
            i2 = 0;
        }
        this.A01[i2] = obj;
        this.A00 = i2 + 1;
    }
}
