package p000X;

/* renamed from: X.D3Z */
public final class D3Z extends Exception {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    public D3Z(int i, Throwable th) {
        super(r0, th);
        String message;
        if (th == null) {
            message = null;
        } else {
            message = th.getMessage();
        }
        this.A00 = i;
    }
}
