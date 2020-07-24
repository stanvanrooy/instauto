package p000X;

/* renamed from: X.18a  reason: invalid class name and case insensitive filesystem */
public final class C252418a extends AnonymousClass18F {
    public final /* synthetic */ AnonymousClass18Y A00;
    public final /* synthetic */ C30560Dei A01;
    public final /* synthetic */ AnonymousClass18X A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C252418a(AnonymousClass18Y r2, int i, int i2, AnonymousClass18X r5, C30560Dei dei) {
        super(i, 350, i2);
        this.A00 = r2;
        this.A02 = r5;
        this.A01 = dei;
    }

    public final /* bridge */ /* synthetic */ int A01(Object obj, Object obj2) {
        return this.A02.A00((String) obj, obj2);
    }

    public final /* bridge */ /* synthetic */ void A06(boolean z, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        C30560Dei dei = this.A01;
        if (dei != null) {
            dei.A00(z, str, obj2, obj3);
        } else {
            super.A06(z, str, obj2, obj3);
        }
    }
}
