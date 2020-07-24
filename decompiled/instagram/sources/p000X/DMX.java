package p000X;

import android.content.Context;

/* renamed from: X.DMX */
public final class DMX {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public DMR A05;
    public DMV A06;
    public CN4 A07;
    public C30006DMi A08;
    public DN7 A09;
    public final Context A0A;
    public final C30016DMt A0B;

    public DMX(C30004DMf dMf) {
        this.A0A = dMf.A04;
        this.A0B = new C30016DMt(dMf.A03);
        CN4 cn4 = dMf.A01;
        if (cn4 != null) {
            this.A07 = cn4;
            DN7 dn7 = dMf.A02;
            if (dn7 != null) {
                this.A09 = dn7;
                C30013DMp dMp = dMf.A00;
                if (dMp != null) {
                    DMV dmv = new DMV(dMp);
                    this.A06 = dmv;
                    C30006DMi dMi = new C30006DMi();
                    this.A08 = dMi;
                    dMi.A01.add(dmv);
                    C30006DMi dMi2 = this.A08;
                    dMi2.A00.add(this.A06);
                    for (C30007DMj dMj : dMf.A06) {
                        if (dMj != null) {
                            this.A08.A01.add(dMj);
                        }
                    }
                    for (DMV dmv2 : dMf.A05) {
                        if (dmv2 != null) {
                            this.A08.A00.add(dmv2);
                        }
                    }
                    this.A00 = 50;
                    this.A01 = 1;
                    this.A02 = 10000;
                    this.A03 = 3;
                    this.A04 = 86400000;
                    this.A05 = new DMR(this.A0B, this.A0A, this.A07, this, this.A09, this.A08, this.A06);
                    return;
                }
            }
        }
        throw null;
    }
}
