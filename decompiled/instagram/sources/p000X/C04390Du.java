package p000X;

/* renamed from: X.0Du  reason: invalid class name and case insensitive filesystem */
public final class C04390Du implements AnonymousClass0Q6 {
    public final /* synthetic */ BTF A00;
    public final /* synthetic */ B7J A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C04390Du(boolean z, B7J b7j, boolean z2, BTF btf) {
        this.A03 = z;
        this.A01 = b7j;
        this.A02 = z2;
        this.A00 = btf;
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0Z0.A03(-1827709525);
        if (this.A03) {
            this.A01.A00(2, (Object) null);
        }
        if (this.A02) {
            this.A01.A00(6, (Object) null);
        }
        AnonymousClass0Z0.A0A(-1034895611, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0Z0.A03(1837140771);
        if (this.A03) {
            this.A01.A00(1, (Object) null);
        }
        if (this.A02) {
            this.A01.A00(5, this.A00);
        }
        AnonymousClass0Z0.A0A(209747707, A032);
    }
}
