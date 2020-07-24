package p000X;

import java.io.PrintStream;

/* renamed from: X.B6X */
public final class B6X {
    public static final B6V A00;

    static {
        B6V b6v;
        Integer num;
        try {
            num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
        } catch (Exception e) {
            PrintStream printStream = System.err;
            printStream.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(printStream);
            num = null;
        } catch (Throwable th) {
            PrintStream printStream2 = System.err;
            String name = B6Y.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream2.println(sb.toString());
            th.printStackTrace(printStream2);
            b6v = new B6Y();
        }
        if (num == null || num.intValue() < 19) {
            if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                b6v = new B6Z();
            } else {
                b6v = new B6Y();
            }
            A00 = b6v;
        }
        b6v = new B6W();
        A00 = b6v;
    }
}
