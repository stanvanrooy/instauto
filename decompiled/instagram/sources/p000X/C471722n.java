package p000X;

import com.instagram.location.impl.LocationPluginImpl;

/* renamed from: X.22n  reason: invalid class name and case insensitive filesystem */
public final class C471722n extends AnonymousClass0O9 {
    public final /* synthetic */ C471522l A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C471722n(C471522l r2) {
        super(284);
        this.A00 = r2;
    }

    public final void run() {
        synchronized (this.A00.A01.A01) {
            AnonymousClass22V r1 = (AnonymousClass22V) this.A00.A02.get();
            if (r1 != null && this.A00.A01.A02.containsKey(r1)) {
                this.A00.A00.A04();
                this.A00.A01.A02.remove(r1);
                LocationPluginImpl.A00(this.A00.A01);
            }
        }
    }
}
