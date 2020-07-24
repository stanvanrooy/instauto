package p000X;

/* renamed from: X.BVQ */
public final class BVQ implements AnonymousClass1N6 {
    public final /* synthetic */ BVO A00;

    public BVQ(BVO bvo) {
        this.A00 = bvo;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.A00.setOnClickListener(new BVP(this));
        }
    }
}
