package p000X;

/* renamed from: X.1Sx  reason: invalid class name and case insensitive filesystem */
public final class C30201Sx implements AnonymousClass1L0 {
    public final /* synthetic */ AnonymousClass0C1 A00;

    public C30201Sx(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final String AOQ(AnonymousClass1TY r5) {
        String A0A = C30671Ut.A0A(this.A00, (AnonymousClass1NJ) r5.A01);
        AnonymousClass1NJ A0P = ((AnonymousClass1NJ) r5.A01).A0P(((C44521wI) r5.A02).A00);
        if (A0P == null) {
            A0P = (AnonymousClass1NJ) r5.A01;
        }
        return AnonymousClass000.A0N("carousel_", Integer.toHexString(A0A.hashCode()), A0P.getId(), "_LAST_VIEWED_IMPRESSION_TIME");
    }
}
