package p000X;

/* renamed from: X.DF6 */
public abstract class DF6 extends Exception {
    public static final boolean A00;
    public static final StackTraceElement[] A01 = new StackTraceElement[0];

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    static {
        boolean z = false;
        if (System.getProperty("surefire.test.class.path") != null) {
            z = true;
        }
        A00 = z;
    }
}
