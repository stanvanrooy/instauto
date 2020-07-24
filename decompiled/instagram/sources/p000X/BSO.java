package p000X;

import java.util.List;

/* renamed from: X.BSO */
public final class BSO {
    public final /* synthetic */ BSR A00;

    public BSO(BSR bsr) {
        this.A00 = bsr;
    }

    public final void A00(long j, List list, long j2, long j3, long j4, String str) {
        synchronized (this.A00) {
            BSS bss = this.A00.A00;
            bss.A06 = "xx";
            bss.A04 = j;
            bss.A07 = list;
            bss.A02 = j2;
            bss.A03 = j3;
            bss.A01 = j4;
            bss.A05 = str;
        }
    }

    public final void A01(String str) {
        synchronized (this.A00) {
            BSR bsr = this.A00;
            BSS bss = new BSS();
            bsr.A00 = bss;
            bss.A06 = str;
        }
    }
}
