package p000X;

/* renamed from: X.B84 */
public final class B84 extends RuntimeException {
    public B84() {
    }

    public B84(String str) {
        super(str);
    }

    public B84(Throwable th) {
        super("Could not load application package metadata", th);
    }
}
