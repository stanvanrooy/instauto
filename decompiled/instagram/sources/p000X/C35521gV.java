package p000X;

/* renamed from: X.1gV  reason: invalid class name and case insensitive filesystem */
public final class C35521gV implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C15730nR A01;
    public final /* synthetic */ String A02;

    public C35521gV(C15730nR r1, String str, int i) {
        this.A01 = r1;
        this.A02 = str;
        this.A00 = i;
    }

    public final void run() {
        int hashCode = this.A02.hashCode();
        synchronized (this.A01.A04) {
            if (C15730nR.A02(this.A01, hashCode)) {
                this.A01.A03.markerAnnotate(23396353, hashCode, "ENCODED_BYTE_SIZE", this.A00);
            }
        }
    }
}
