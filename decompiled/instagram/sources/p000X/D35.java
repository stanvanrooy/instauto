package p000X;

/* renamed from: X.D35 */
public final class D35 {
    public String A00 = "inline";
    public String A01 = null;
    public boolean A02 = false;
    public boolean A03 = false;
    public String A04 = null;
    public String A05 = null;
    public boolean A06 = false;

    public final synchronized String A00() {
        return this.A04;
    }

    public final synchronized String A01() {
        return this.A00;
    }

    public final synchronized String A02() {
        return this.A01;
    }

    public final synchronized void A03(String str) {
        this.A04 = str;
    }

    public final synchronized void A04(String str) {
        this.A05 = str;
    }

    public final synchronized void A05(boolean z) {
        this.A06 = z;
    }

    public final synchronized boolean A06() {
        return this.A06;
    }

    public final synchronized boolean A07() {
        return this.A02;
    }
}
