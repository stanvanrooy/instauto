package p000X;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.DCp */
public final class DCp implements C29871DEg, C29872DEh {
    public int A00;
    public DCo[] A01;

    public final boolean equals(Object obj) {
        DCo[] dCoArr;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DCp)) {
            return false;
        }
        DCp dCp = (DCp) obj;
        int i = this.A00;
        if (i != dCp.A00) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            DCo[] dCoArr2 = this.A01;
            if (dCoArr2 != null && (dCoArr = dCp.A01) != null && !dCoArr2[i2].equals(dCoArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final void ABl(ByteBuffer byteBuffer, int i) {
        DCo[] dCoArr = (DCo[]) C29825DCj.A07(byteBuffer, i, 0, DCo.class);
        this.A01 = dCoArr;
        if (dCoArr != null) {
            this.A00 = dCoArr.length;
        }
    }

    public final /* bridge */ /* synthetic */ Object Ado(Object obj, Object obj2, float f) {
        int i;
        DCp dCp = (DCp) obj;
        DCp dCp2 = (DCp) obj2;
        DCo[] dCoArr = this.A01;
        if (!(dCoArr == null || dCp.A01 == null)) {
            DCo[] dCoArr2 = dCp2.A01;
            int i2 = 0;
            if (dCoArr2 == null || dCoArr2.length < dCoArr.length) {
                DCo[] dCoArr3 = new DCo[dCoArr.length];
                dCp2.A01 = dCoArr3;
                for (int i3 = 0; i3 < this.A01.length; i3++) {
                    DCo dCo = new DCo();
                    dCo.A03 = new C29831DCs();
                    dCo.A01 = new C29831DCs();
                    dCo.A02 = new C29831DCs();
                    dCoArr3[i3] = dCo;
                }
            }
            while (true) {
                i = this.A00;
                if (i2 >= i) {
                    break;
                }
                DCo[] dCoArr4 = dCp2.A01;
                DCo dCo2 = this.A01[i2];
                DCo dCo3 = dCp.A01[i2];
                DCo dCo4 = dCoArr4[i2];
                dCo2.A00(dCo3, dCo4, f);
                dCoArr4[i2] = dCo4;
                i2++;
            }
            dCp2.A00 = i;
        }
        return dCp2;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(this.A01);
    }
}
