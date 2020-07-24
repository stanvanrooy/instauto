package p000X;

/* renamed from: X.1qD  reason: invalid class name and case insensitive filesystem */
public final class C41381qD extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41381qD(C37531jo r3) {
        super("initializeLocationManagerDetours", 395);
        this.A00 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r5, p000X.AnonymousClass0L7.LOCATION_MANAGER_DETOUR, "log_errors", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r5, p000X.AnonymousClass0L7.LOCATION_MANAGER_DETOUR, "enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r5, p000X.AnonymousClass0L7.LOCATION_MANAGER_DETOUR, "block_api_in_bg", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0039;
     */
    public final void A00() {
        boolean z;
        boolean z2;
        boolean z3;
        AnonymousClass0C1 r5 = this.A00.A07;
        if (r5 != null) {
            z = true;
        }
        z = false;
        if (z) {
            if (r5 != null) {
                z2 = true;
            }
            z2 = false;
            if (r5 != null) {
                z3 = true;
            }
            z3 = false;
            AnonymousClass2TJ r1 = new AnonymousClass2TJ(z3, z2);
            try {
                C44101vb.A01.writeLock().lock();
                C44101vb.A00 = r1;
            } finally {
                C44101vb.A01.writeLock().unlock();
            }
        }
    }
}
