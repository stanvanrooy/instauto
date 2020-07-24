package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.DS8 */
public final class DS8 {
    public C202008kg A00;
    public C201798kL A01;
    public DSE A02;
    public DS6 A03;
    public DSB A04;
    public C203758nd A05;
    public DS7 A06;
    public String A07;
    public String A08;
    public String A09;
    public Map A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public final void A00(C202008kg r2) {
        this.A00 = r2;
        this.A04 = new DSB(r2);
    }

    public final void A01(DS6 ds6) {
        this.A03 = ds6;
        this.A06 = new DS7(ds6);
    }

    public DS8() {
        this.A0A = new HashMap();
        DS6 ds6 = new DS6();
        this.A03 = ds6;
        this.A06 = new DS7(ds6);
        C202008kg A002 = C202008kg.A00();
        this.A00 = A002;
        this.A04 = new DSB(A002);
        this.A08 = null;
        this.A07 = null;
        this.A09 = null;
        this.A0D = false;
        this.A0B = false;
        this.A02 = null;
        this.A0E = false;
        this.A0C = false;
        this.A0F = true;
        this.A05 = null;
    }

    public DS8(C201798kL r3) {
        this.A0A = new HashMap();
        DS6 ds6 = new DS6();
        this.A03 = ds6;
        this.A06 = new DS7(ds6);
        C202008kg A002 = C202008kg.A00();
        this.A00 = A002;
        this.A04 = new DSB(A002);
        this.A08 = null;
        this.A07 = null;
        this.A09 = null;
        this.A0D = false;
        this.A0B = false;
        this.A02 = null;
        this.A0E = false;
        this.A0C = false;
        this.A0F = true;
        this.A05 = null;
        this.A01 = r3;
    }

    public DS8(DS9 ds9) {
        HashMap hashMap = new HashMap();
        this.A0A = hashMap;
        DS6 ds6 = new DS6();
        this.A03 = ds6;
        this.A06 = new DS7(ds6);
        C202008kg A002 = C202008kg.A00();
        this.A00 = A002;
        this.A04 = new DSB(A002);
        this.A08 = null;
        this.A07 = null;
        this.A09 = null;
        this.A0D = false;
        this.A0B = false;
        this.A02 = null;
        this.A0E = false;
        this.A0C = false;
        this.A0F = true;
        this.A05 = null;
        this.A01 = ds9.A02;
        hashMap.putAll(ds9.A0B);
        DS6 ds62 = ds9.A04;
        this.A03 = ds62;
        this.A06 = new DS7(ds62);
        C202008kg r1 = ds9.A01;
        this.A00 = r1;
        this.A04 = new DSB(r1);
        this.A08 = ds9.A09;
        this.A07 = ds9.A08;
        this.A09 = ds9.A0A;
        this.A0D = ds9.A00;
        this.A0B = ds9.A0C;
        this.A02 = ds9.A03;
        this.A0E = ds9.A0E;
        this.A0C = ds9.A0D;
        this.A0F = ds9.A0F;
        this.A05 = ds9.A06;
    }
}
