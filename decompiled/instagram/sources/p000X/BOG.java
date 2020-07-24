package p000X;

/* renamed from: X.BOG */
public final class BOG implements C25584BQq {
    public final /* synthetic */ BOF A00;

    public BOG(BOF bof) {
        this.A00 = bof;
    }

    public final C25521BOf ADg() {
        BOF bof = this.A00;
        if (bof.A02.A08 == C25520BOe.ONSITE) {
            return bof.A05(Constants.A0Y);
        }
        String A01 = bof.A03.A01(10010);
        if (A01 != null) {
            return this.A00.A06(A01);
        }
        return this.A00.A05(Constants.A0C);
    }
}
