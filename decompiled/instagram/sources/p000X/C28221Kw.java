package p000X;

/* renamed from: X.1Kw  reason: invalid class name and case insensitive filesystem */
public final class C28221Kw implements C11590fD {
    public final /* synthetic */ AnonymousClass0C1 A00;

    public C28221Kw(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        C13740j9 A01;
        C13740j9 A012;
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(this.A00, AnonymousClass0L7.VIEWPOINT_STORIES_PUBLIC_TESTING, "enable_self_cache_trimming", false, (AnonymousClass04H) null)).booleanValue();
        AnonymousClass0C1 r5 = this.A00;
        String A0J = AnonymousClass000.A0J(r5.A04(), "_", "starred_view");
        Class<C13740j9> cls = C13740j9.class;
        synchronized (cls) {
            A01 = C13740j9.A01(A0J, booleanValue, 200);
        }
        String A0J2 = AnonymousClass000.A0J(r5.A04(), "_", "organic_view");
        synchronized (cls) {
            A012 = C13740j9.A01(A0J2, booleanValue, 200);
        }
        return new C28211Kv(A01, A012);
    }
}
