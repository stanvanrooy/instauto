package p000X;

/* renamed from: X.11h  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C236511h implements C11590fD {
    public final /* synthetic */ AnonymousClass0C1 A00;

    public /* synthetic */ C236511h(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final Object get() {
        AnonymousClass0C1 r5 = this.A00;
        C236611i r4 = new C236611i();
        AnonymousClass0L7 r3 = AnonymousClass0L7.VIDEO_QPL_PIPELINE;
        r4.A01 = ((Boolean) AnonymousClass0L6.A02(r5, r3, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        r4.A00 = (long) ((Integer) AnonymousClass0L6.A02(r5, r3, "timeout", 10000, (AnonymousClass04H) null)).intValue();
        return new C236411g(new C236711j(r4));
    }
}
