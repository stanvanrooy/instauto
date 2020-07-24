package p000X;

/* renamed from: X.1xr  reason: invalid class name and case insensitive filesystem */
public final class C45421xr extends Exception {
    public final Exception A00;
    public final String A01;
    public final boolean A02;

    public final String getMessage() {
        String str;
        String str2;
        String str3 = this.A01;
        if (this.A02) {
            str = " (Cancellation), ";
        } else {
            str = ", ";
        }
        Exception exc = this.A00;
        if (exc != null) {
            str2 = exc.getMessage();
        } else {
            str2 = "None";
        }
        return AnonymousClass000.A0O("Failure Reason: ", str3, str, "InnerException: ", str2);
    }

    public C45421xr(String str, boolean z, Exception exc) {
        super(str, exc);
        this.A01 = str;
        this.A02 = z;
        this.A00 = exc;
    }
}
