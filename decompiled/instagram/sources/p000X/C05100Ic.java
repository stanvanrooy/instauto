package p000X;

/* renamed from: X.0Ic  reason: invalid class name and case insensitive filesystem */
public final class C05100Ic implements C92803zk {
    public Object A00;
    public final AnonymousClass0C1 A01;
    public final C05110Id A02;
    public volatile boolean A03;

    public final Object get() {
        if (!this.A03) {
            synchronized (this) {
                if (!this.A03) {
                    this.A00 = this.A02.AF7(this.A01);
                    this.A03 = true;
                }
            }
        }
        return this.A00;
    }

    public C05100Ic(AnonymousClass0C1 r1, C05110Id r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
