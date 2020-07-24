package p000X;

/* renamed from: X.1zP  reason: invalid class name and case insensitive filesystem */
public final class C46241zP extends C46251zQ {
    public final /* synthetic */ C46231zO A00;

    public C46241zP(C46231zO r1) {
        this.A00 = r1;
    }

    public final int A00() {
        return this.A00.A03.size();
    }

    public final int A01() {
        return this.A00.A04.size();
    }

    public final Object A02(int i, int i2) {
        Object obj = this.A00.A04.get(i);
        Object obj2 = this.A00.A03.get(i2);
        if (obj != null && obj2 != null) {
            return null;
        }
        throw new AssertionError();
    }

    public final boolean A03(int i, int i2) {
        Object obj = this.A00.A04.get(i);
        Object obj2 = this.A00.A03.get(i2);
        if (obj != null && obj2 != null) {
            return this.A00.A01.A04.A00.areContentsTheSame(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public final boolean A04(int i, int i2) {
        Object obj = this.A00.A04.get(i);
        Object obj2 = this.A00.A03.get(i2);
        if (obj != null && obj2 != null) {
            return this.A00.A01.A04.A00.areItemsTheSame(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        return false;
    }
}
