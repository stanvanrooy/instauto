package p000X;

/* renamed from: X.BBF */
public final class BBF extends RuntimeException {
    public BBF() {
    }

    public BBF(String str) {
        super("Malformed session format. Column not found.");
    }

    public BBF(Throwable th) {
        super(th);
    }
}
