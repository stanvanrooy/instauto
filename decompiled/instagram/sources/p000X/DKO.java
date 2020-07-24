package p000X;

import android.os.Handler;
import java.util.Map;

/* renamed from: X.DKO */
public final class DKO {
    public static void A00(C88443sQ r2, Handler handler) {
        if (r2 == null) {
            throw new IllegalArgumentException("stateCallback cannot be null");
        } else if (handler != null) {
            AnonymousClass0ZA.A0E(handler, new DKJ(r2), 108443936);
        } else {
            throw new IllegalArgumentException("handler cannot be null");
        }
    }

    public static void A01(C88443sQ r2, Handler handler, Exception exc, Map map) {
        if (r2 == null) {
            throw new IllegalArgumentException("stateCallback cannot be null");
        } else if (handler != null) {
            AnonymousClass0ZA.A0E(handler, new DKG(r2, exc, map), -479289835);
        } else {
            throw new IllegalArgumentException("handler cannot be null");
        }
    }

    public static void A02(DKT dkt, Handler handler) {
        if (dkt == null) {
            throw new IllegalArgumentException("stateCallback cannot be null");
        } else if (handler != null) {
            AnonymousClass0ZA.A0E(handler, new DKS(dkt), 1931394049);
        } else {
            throw new IllegalArgumentException("handler cannot be null");
        }
    }

    public static void A03(DKT dkt, Handler handler, Throwable th) {
        if (dkt == null) {
            throw new IllegalArgumentException("stateCallback cannot be null");
        } else if (handler != null) {
            AnonymousClass0ZA.A0E(handler, new DKR(dkt, th), 898138338);
        } else {
            throw new IllegalArgumentException("handler cannot be null");
        }
    }
}
