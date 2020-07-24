package p000X;

/* renamed from: X.1iE  reason: invalid class name and case insensitive filesystem */
public final class C36551iE implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C15730nR A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C36551iE(C15730nR r1, String str, String str2, String str3, long j) {
        this.A01 = r1;
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p000X.AnonymousClass1CU.A00() != false) goto L_0x001c;
     */
    public final void run() {
        boolean z;
        C15730nR r7 = this.A01;
        String str = this.A04;
        String str2 = this.A02;
        String str3 = this.A03;
        long j = this.A00;
        int hashCode = str.hashCode();
        synchronized (r7.A04) {
            if (!r7.A01) {
                z = false;
            }
            z = true;
            if (z && C15730nR.A02(r7, hashCode)) {
                r7.A03.markerAnnotate(23396353, hashCode, "LOAD_SOURCE", str2);
                r7.A03.markerAnnotate(23396353, hashCode, "END_STATUS", str3);
                r7.A03.markerEnd(23396353, hashCode, 467, j);
            }
            r7.A04.remove(Integer.valueOf(hashCode));
        }
        boolean equals = str2.equals("memory");
        if (equals) {
            AnonymousClass17R.A00().A01(hashCode, "DISK", j);
        }
        if (str2.equals("disk") || equals) {
            str2 = "DISK";
        } else if (str2.equals("network")) {
            str2 = "NETWORK";
        }
        AnonymousClass17R.A00().A02(hashCode, str2, j);
    }
}
