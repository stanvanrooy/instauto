package p000X;

import java.util.Map;

/* renamed from: X.DM1 */
public final class DM1 implements Map.Entry {
    public int A00;
    public DM1 A01;
    public DM1 A02;
    public DM1 A03;
    public Object A04;
    public DM1 A05;
    public DM1 A06;
    public final Object A07;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.A07;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.A04;
        if (obj3 == null) {
            if (entry.getValue() == null) {
                return true;
            }
            return false;
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.A07;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.A04;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        Object obj2 = this.A04;
        this.A04 = obj;
        return obj2;
    }

    public final String toString() {
        return this.A07 + "=" + this.A04;
    }

    public final Object getKey() {
        return this.A07;
    }

    public final Object getValue() {
        return this.A04;
    }

    public DM1() {
        this.A07 = null;
        this.A03 = this;
        this.A01 = this;
    }

    public DM1(DM1 dm1, Object obj, DM1 dm12, DM1 dm13) {
        this.A02 = dm1;
        this.A07 = obj;
        this.A00 = 1;
        this.A01 = dm12;
        this.A03 = dm13;
        dm13.A01 = this;
        dm12.A03 = this;
    }
}
