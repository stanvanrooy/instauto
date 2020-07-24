package p000X;

import java.util.Arrays;

/* renamed from: X.DPH */
public final class DPH implements DQ3 {
    public final C79233d3 A00;
    public final DPL A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DPH dph = (DPH) obj;
            C79233d3 r4 = this.A00;
            C79233d3 r3 = dph.A00;
            boolean z = false;
            if (r3 != null && r4.A01 == r3.A01 && r4.A00 == r3.A00) {
                z = true;
            }
            if (!z || !this.A01.equals(dph.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public DPH(DPL dpl) {
        this.A01 = dpl;
        this.A00 = new C79233d3(dpl.A03, dpl.A02);
    }

    public final DCR AZ7() {
        return DCR.VIDEO;
    }
}
