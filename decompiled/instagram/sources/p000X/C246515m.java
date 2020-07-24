package p000X;

/* renamed from: X.15m  reason: invalid class name and case insensitive filesystem */
public final class C246515m implements AnonymousClass15d {
    public static final C17120pi A02 = new C246615n();
    public AnonymousClass20J A00;
    public AnonymousClass20G A01;

    public final String getTypeName() {
        return "IngestionStrategyAttachment";
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        AnonymousClass20G r1 = this.A01;
        Object obj = r1.A00;
        if (obj != null || (obj = r1.A01) != null || (obj = r1.A02) != null) {
            return obj;
        }
        throw new IllegalStateException("No configuration set");
    }

    public final String toString() {
        return "IngestionStrategyAttachment{" + this.A00 + '}';
    }

    public C246515m() {
    }

    public C246515m(AnonymousClass20J r2) {
        this.A01 = new AnonymousClass20G(r2);
    }
}
