package p000X;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.DCo */
public final class DCo implements C29871DEg, C29872DEh {
    public byte A00;
    public C29831DCs A01;
    public C29831DCs A02;
    public C29831DCs A03;

    public final void ABl(ByteBuffer byteBuffer, int i) {
        byte b = 0;
        int A012 = C29825DCj.A01(byteBuffer, i, 0);
        if (A012 != 0) {
            b = byteBuffer.get(A012);
        }
        this.A00 = b;
        Class<C29831DCs> cls = C29831DCs.class;
        this.A03 = (C29831DCs) C29825DCj.A02(byteBuffer, i, 1, cls);
        this.A01 = (C29831DCs) C29825DCj.A02(byteBuffer, i, 2, cls);
        this.A02 = (C29831DCs) C29825DCj.A02(byteBuffer, i, 3, cls);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        r0 = r4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        r1 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        r0 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        r1 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        r0 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r1 = r3.A03;
     */
    public final boolean equals(Object obj) {
        C29831DCs dCs;
        C29831DCs dCs2;
        C29831DCs dCs3;
        C29831DCs dCs4;
        C29831DCs dCs5;
        C29831DCs dCs6;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DCo)) {
            return false;
        }
        DCo dCo = (DCo) obj;
        return (this.A00 != dCo.A00 || dCs == null || dCs2 == null || !dCs.equals(dCs2) || dCs3 == null || dCs4 == null || !dCs3.equals(dCs4) || dCs5 == null || dCs6 == null || !dCs5.equals(dCs6)) ? false : true;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{Byte.valueOf(this.A00), this.A03, this.A01, this.A02});
    }

    public final void A00(DCo dCo, DCo dCo2, float f) {
        C29831DCs dCs;
        C29831DCs dCs2;
        C29831DCs dCs3;
        dCo2.A00 = this.A00;
        C29831DCs dCs4 = this.A03;
        if (dCs4 != null) {
            C29831DCs dCs5 = dCo.A03;
            C29831DCs dCs6 = dCs5;
            if (!(dCs5 == null || (dCs3 = dCo2.A03) == null)) {
                dCs4.A00(dCs6, dCs3, f);
            }
        }
        C29831DCs dCs7 = this.A01;
        if (dCs7 != null) {
            C29831DCs dCs8 = dCo.A01;
            C29831DCs dCs9 = dCs8;
            if (!(dCs8 == null || (dCs2 = dCo2.A01) == null)) {
                dCs7.A00(dCs9, dCs2, f);
            }
        }
        C29831DCs dCs10 = this.A02;
        if (dCs10 != null) {
            C29831DCs dCs11 = dCo.A02;
            C29831DCs dCs12 = dCs11;
            if (dCs11 != null && (dCs = dCo2.A02) != null) {
                dCs10.A00(dCs12, dCs, f);
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object Ado(Object obj, Object obj2, float f) {
        DCo dCo = (DCo) obj2;
        A00((DCo) obj, dCo, f);
        return dCo;
    }
}
