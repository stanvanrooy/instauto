package p000X;

/* renamed from: X.1Fb  reason: invalid class name and case insensitive filesystem */
public final class C26741Fb extends AnonymousClass0O9 {
    public final String A00;
    public final /* synthetic */ C26631Eg A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26741Fb(C26631Eg r2, String str) {
        super(515);
        this.A01 = r2;
        this.A00 = str;
    }

    public final void run() {
        try {
            C26631Eg.A00(this.A01).Bac(this.A00);
        } catch (IllegalStateException unused) {
            AnonymousClass0QD.A01("JSONDiskSerializer_Concurrent_Edit ", "remove failed due to attempt to remove cache entry still under edit");
        }
    }
}
