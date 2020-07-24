package p000X;

/* renamed from: X.BHF */
public final class BHF implements C60362jm {
    public final /* synthetic */ BHP A00;
    public final /* synthetic */ String A01;

    public BHF(BHP bhp, String str) {
        this.A00 = bhp;
        this.A01 = str;
    }

    public final void B42(Exception exc) {
        C11130eT.A01.BXT(new C136055rM("API_ERROR: " + exc.getClass() + ":" + exc.getMessage(), this.A01));
    }
}
