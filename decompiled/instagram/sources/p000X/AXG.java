package p000X;

/* renamed from: X.AXG */
public final class AXG {
    public int A00;
    public int A01;
    public long A02;
    public AXH A03;
    public final long A04 = 1000;
    public final C04140Cp A05;
    public final AXI A06;
    public volatile int A07;

    public AXG(C04140Cp r3, AXI axi) {
        this.A05 = r3;
        this.A03 = new AXH(r3);
        this.A06 = axi;
    }
}
