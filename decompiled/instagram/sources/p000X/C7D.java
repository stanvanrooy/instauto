package p000X;

/* renamed from: X.C7D */
public final class C7D extends C17920r1 {
    public final /* synthetic */ C8J A00;
    public final /* synthetic */ C17920r1 A01;

    public C7D(C8J c8j, C17920r1 r2) {
        this.A00 = c8j;
        this.A01 = r2;
    }

    public final void onFail(C43791v5 r4) {
        int A03 = AnonymousClass0Z0.A03(-1712970913);
        C8Q.A00.remove(this.A00.A04);
        this.A01.onFail(r4);
        AnonymousClass0Z0.A0A(-1914552044, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-1496028072);
        int A032 = AnonymousClass0Z0.A03(-1378420415);
        C8Q.A00.remove(this.A00.A04);
        this.A01.onSuccess((C28711Mu) obj);
        AnonymousClass0Z0.A0A(988533481, A032);
        AnonymousClass0Z0.A0A(36415726, A03);
    }
}
