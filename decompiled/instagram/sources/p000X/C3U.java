package p000X;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: X.C3U */
public abstract class C3U {
    public void A00(C13460iZ r7, Object obj) {
        C02 c02 = (C02) this;
        C27191C0q c0q = c02.A01;
        if (c0q.A06(C15.INDENT_OUTPUT)) {
            r7.A0J();
        }
        if (!c0q.A06(C15.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            c02.A03.A0G(c0q, c02.A04).A0H(r7, obj);
            if (c0q.A06(C15.FLUSH_AFTER_WRITE_VALUE)) {
                r7.flush();
                return;
            }
            return;
        }
        Closeable closeable = (Closeable) obj;
        try {
            c02.A03.A0G(c0q, c02.A04).A0H(r7, obj);
            if (c0q.A06(C15.FLUSH_AFTER_WRITE_VALUE)) {
                r7.flush();
            }
            try {
                closeable.close();
            } catch (Throwable th) {
                th = th;
                closeable = null;
            }
        } catch (Throwable th2) {
            th = th2;
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
            throw th;
        }
    }
}
