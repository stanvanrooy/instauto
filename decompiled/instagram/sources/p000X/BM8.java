package p000X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.BM8 */
public final class BM8 {
    public final Map A00;
    public final AnonymousClass0IS A01;

    public static AnonymousClass92V A00(AnonymousClass92V r2) {
        try {
            return AnonymousClass92V.A00(MessageDigest.getInstance("SHA-1").digest(r2.A02()));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public BM8(BMA bma) {
        this.A00 = Collections.unmodifiableMap(bma.A01);
        this.A01 = bma.A00;
    }
}
