package p000X;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;

/* renamed from: X.B6U */
public final class B6U implements Closeable {
    public C60302jg A00;
    public final URL A01;
    public volatile InputStream A02;

    public static /* synthetic */ void A00(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                B6X.A00.A00(th, th2);
            }
        } else {
            inputStream.close();
        }
    }

    public final void close() {
        InputStream inputStream = this.A02;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    C2099993t.A00.logp(Level.WARNING, "com.google.common.io.Closeables", "close", AnonymousClass0C5.$const$string(163), e);
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
    }

    public B6U(URL url) {
        this.A01 = url;
    }
}
