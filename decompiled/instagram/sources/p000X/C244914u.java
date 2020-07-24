package p000X;

/* renamed from: X.14u  reason: invalid class name and case insensitive filesystem */
public final class C244914u implements C22550yc {
    public final /* synthetic */ C244214n A00;

    public C244914u(C244214n r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        AnonymousClass0C1 r5 = (AnonymousClass0C1) obj;
        AnonymousClass0a4.A06(r5);
        String str = (String) AnonymousClass0L6.A02(r5, AnonymousClass0L7.DIRECT_MUTATION_MANAGER_MEDIA_3, "publisher_backoff_strategy", "exponential", (AnonymousClass04H) null);
        C244214n r2 = this.A00;
        if (!str.equals("exponential")) {
            if (str.equals("exponential_per_operation")) {
                return new C105744hM(r2, new C95334Av());
            }
            if (str.equals("random_exponential")) {
                return new C105724hK(new C111974rq());
            }
            if (str.equals("random_exponential_per_operation")) {
                return new C105744hM(r2, new C111974rq());
            }
        }
        return new C105724hK(new C95334Av());
    }
}
