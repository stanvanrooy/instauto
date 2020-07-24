package p000X;

/* renamed from: X.1cl  reason: invalid class name and case insensitive filesystem */
public final class C33341cl implements C26211Cc {
    public final /* synthetic */ C33321cj A00;
    public final /* synthetic */ C16480of A01;

    public C33341cl(C16480of r1, C33321cj r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void BsT(Integer num) {
        C33321cj r1 = this.A00;
        C26211Cc r0 = r1.A00;
        if (r0 != null) {
            r0.BsT(num);
        } else {
            r1.A02 = num;
        }
    }

    public final void cancel() {
        C33321cj r1 = this.A00;
        C26211Cc r0 = r1.A00;
        if (r0 != null) {
            r0.cancel();
        } else {
            r1.A03 = true;
        }
    }
}
