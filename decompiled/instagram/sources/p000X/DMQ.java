package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DMQ */
public final class DMQ {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;
    public List A06;

    public DMQ() {
    }

    public DMQ(DMs dMs) {
        this.A04 = dMs.A04;
        this.A00 = dMs.A00;
        this.A02 = dMs.A01;
        this.A05 = new ArrayList();
        for (DNA dna : dMs.A05) {
            this.A05.add(dna.A00);
        }
        this.A06 = new ArrayList();
        for (DNB dnb : dMs.A06) {
            this.A06.add(dnb.A00);
        }
        this.A01 = dMs.A02;
        this.A03 = dMs.A03;
    }
}
