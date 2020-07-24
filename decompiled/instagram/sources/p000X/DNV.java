package p000X;

/* renamed from: X.DNV */
public class DNV extends C30033DNl {
    public DO8 A00;
    public AnonymousClass8UN A01;

    public void A01(C30030DNi dNi) {
        super.A01(dNi);
        this.A01 = AnonymousClass8UN.class.cast(dNi);
        this.A00 = dNi.AGo();
        this.A02 = dNi.AIQ();
        this.A00 = ((float) dNi.AFp()) / 255.0f;
    }
}
