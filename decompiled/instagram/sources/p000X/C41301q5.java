package p000X;

/* renamed from: X.1q5  reason: invalid class name and case insensitive filesystem */
public final class C41301q5 extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41301q5(C37531jo r3) {
        super("initCameraLeakDetector", 387);
        this.A00 = r3;
    }

    public final void A00() {
        AnonymousClass0C1 r4 = this.A00.A07;
        if (r4 != null && ((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.CAMERA_LEAK, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() && CBO.A02 == null) {
            CBO.A02 = new CBO();
        }
    }
}
