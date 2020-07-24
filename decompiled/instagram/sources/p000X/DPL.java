package p000X;

/* renamed from: X.DPL */
public final class DPL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DPL)) {
            return false;
        }
        DPL dpl = (DPL) obj;
        return this.A03 == dpl.A03 && this.A02 == dpl.A02 && this.A00 == dpl.A00 && this.A01 == dpl.A01 && this.A04.equals(dpl.A04);
    }

    public final int hashCode() {
        return (((((((((this.A03 * 31) + this.A02) * 31) + this.A00) * 31) + this.A01) * 31) + 5) * 31) + this.A04.hashCode();
    }

    public DPL(C30084DPo dPo) {
        int min;
        int i = dPo.A02;
        this.A03 = i;
        int i2 = dPo.A01;
        this.A02 = i2;
        int i3 = dPo.A00;
        this.A01 = i3;
        this.A04 = dPo.A04;
        Integer num = dPo.A03;
        if (num != null) {
            min = num.intValue();
        } else {
            min = Math.min((int) (((double) (i * i2)) * 0.07d * ((double) ((float) i3)) * ((double) DQ4.A00.intValue())), 10000000);
        }
        this.A00 = min;
    }
}
