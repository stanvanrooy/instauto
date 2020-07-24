package p000X;

/* renamed from: X.1rw  reason: invalid class name and case insensitive filesystem */
public final class C42221rw extends C12690hE {
    public final /* synthetic */ C12030g4 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42221rw(C12030g4 r2) {
        super("CriticalPathMainThreadIdleQueue");
        this.A00 = r2;
    }

    public final boolean onQueueIdle() {
        return this.A00.doNext();
    }
}
