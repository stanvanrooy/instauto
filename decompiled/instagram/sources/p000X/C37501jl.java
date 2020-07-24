package p000X;

/* renamed from: X.1jl  reason: invalid class name and case insensitive filesystem */
public final class C37501jl implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C15730nR A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C37501jl(C15730nR r1, String str, double d, String str2, long j) {
        this.A02 = r1;
        this.A04 = str;
        this.A00 = d;
        this.A03 = str2;
        this.A01 = j;
    }

    public final void run() {
        C15730nR r8 = this.A02;
        String str = this.A04;
        double d = this.A00;
        String str2 = this.A03;
        long j = this.A01;
        int hashCode = str.hashCode();
        synchronized (r8.A04) {
            if (C15730nR.A02(r8, hashCode)) {
                r8.A03.markerPoint(23396353, hashCode, "DID_SEND_REQUEST", j);
                r8.A03.markerAnnotate(23396353, hashCode, "BANDWIDTH_KBPS", d);
                r8.A03.markerAnnotate(23396353, hashCode, "TRACE_TOKEN", str2);
            }
        }
        AnonymousClass17R.A00().A01(str.hashCode(), "NETWORK", j);
    }
}
