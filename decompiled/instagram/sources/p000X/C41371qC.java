package p000X;

/* renamed from: X.1qC  reason: invalid class name and case insensitive filesystem */
public final class C41371qC extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41371qC(C37531jo r3) {
        super("maybeStartMemoryLogger", 394);
        this.A00 = r3;
    }

    public final void A00() {
        C37531jo r5 = this.A00;
        if (((Boolean) AnonymousClass0L6.A02(r5.A07, AnonymousClass0L7.MEMORY_USE_LOGGING, "logging_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass0C1 r2 = r5.A07;
            AnonymousClass8KQ r1 = (AnonymousClass8KQ) r2.AVA(AnonymousClass8KQ.class, new AnonymousClass8KT(r2));
            if (!r1.A02) {
                r1.A02 = true;
                AnonymousClass0Q7.A03().A0B(r1);
                AnonymousClass8KQ.A00(r1);
            }
        }
    }
}
