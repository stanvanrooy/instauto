package p000X;

import java.util.List;

/* renamed from: X.ADU */
public final class ADU {
    public ADR A00;
    public C23161AAp A01;
    public boolean A02;
    public final ADV A03;
    public final C23214ADc A04;

    public final void A00(C23161AAp aAp) {
        int i;
        if (this.A01 != aAp) {
            if (aAp == null) {
                ADV adv = this.A03;
                if (adv.A02 != null) {
                    C23213ADb aDb = adv.A00.A02;
                    int i2 = 0;
                    while (true) {
                        List list = aDb.A00;
                        if (list != null) {
                            i = list.size();
                        } else {
                            i = 0;
                        }
                        if (i2 >= i) {
                            break;
                        }
                        ADV.A05(adv, (C23213ADb) aDb.A00.get(i2));
                        i2++;
                    }
                    C23225ADo aDo = (C23225ADo) adv.A07.A04(0, (Object) null);
                    if (aDo != null) {
                        if (aDo.A03) {
                            ADV.A00(adv.A06, aDo);
                        }
                        adv.A07.A06(0);
                        ADV.A03(adv.A06, aDb, aDb.A05, aDo.A02);
                    }
                    adv.A01 = true;
                }
            }
            this.A01 = aAp;
            this.A04.requestLayout();
        }
    }

    public ADU(C23214ADc aDc) {
        this.A04 = aDc;
        this.A03 = new ADV(aDc);
    }
}
