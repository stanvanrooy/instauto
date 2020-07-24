package p000X;

import java.io.IOException;

/* renamed from: X.1xl  reason: invalid class name and case insensitive filesystem */
public class C45371xl extends IOException {
    public C116574zW A00;

    public String A02() {
        return null;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        C116574zW r3 = this.A00;
        String A02 = A02();
        if (r3 == null && A02 == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (A02 != null) {
            sb.append(A02);
        }
        if (r3 != null) {
            sb.append(10);
            sb.append(" at ");
            sb.append(r3.toString());
        }
        return sb.toString();
    }

    public String toString() {
        return AnonymousClass000.A0J(getClass().getName(), ": ", getMessage());
    }

    public C45371xl(String str) {
        super(str);
    }

    public C45371xl(String str, C116574zW r2, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this.A00 = r2;
    }
}
