package p000X;

/* renamed from: X.1bj  reason: invalid class name and case insensitive filesystem */
public final class C32711bj extends C32721bk {
    public final AnonymousClass1HH A00;
    public final AnonymousClass1HI A01;
    public final C32741bm A02 = new C32731bl(this);
    public final AnonymousClass1HD A03;
    public final C27291Hg A04;

    public static C32711bj A00(AnonymousClass1HD r3) {
        return new C32711bj(r3, (AnonymousClass1HH) r3, (AnonymousClass1HI) r3);
    }

    public C32711bj(AnonymousClass1HD r3, AnonymousClass1HH r4, AnonymousClass1HI r5) {
        C32751bn r0 = new C32751bn(this);
        this.A04 = r0;
        this.A03 = r3;
        this.A00 = r4;
        this.A01 = r5;
        r4.registerLifecycleListener(r0);
        this.A01.addFragmentVisibilityListener(this.A02);
    }
}
