package p000X;

/* renamed from: X.06o  reason: invalid class name and case insensitive filesystem */
public final class C033306o {
    public final int A00;
    public final AnonymousClass00N A01;
    public final String A02;
    public final boolean A03;

    public C033306o(int i, String str, boolean z, AnonymousClass00N r6) {
        if (i != -1) {
            this.A00 = i;
            this.A02 = str;
            this.A03 = z;
            this.A01 = r6;
            return;
        }
        throw new IllegalArgumentException("jobId = -1");
    }
}
