package p000X;

import java.io.IOException;

/* renamed from: X.AX6 */
public final class AX6 extends IOException {
    public AX6(String str) {
        super(str);
    }

    public AX6(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
