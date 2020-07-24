package p000X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.Logger;
import java.util.Set;

/* renamed from: X.00l  reason: invalid class name and case insensitive filesystem */
public final class C019700l extends AnonymousClass06D {
    public final void BGb(int i) {
        Set<String> A03 = ProvidersRegistry.A00.A03(i);
        StringBuilder sb = new StringBuilder();
        for (String str : A03) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(str);
        }
        Logger.writeBytesEntry(0, 1, 57, Logger.writeBytesEntry(0, 1, 56, Logger.writeStandardEntry(0, 7, 52, 0, 0, 8126514, 0, 0), "Active providers"), sb.toString());
    }

    public final void BGa() {
        long nanoTime = System.nanoTime();
        Logger.writeBytesEntry(0, 1, 83, Logger.writeStandardEntry(0, 5, 22, nanoTime, 0, 0, 0, 0), "Profilo.ProvidersInitialized");
        Logger.writeStandardEntry(0, 5, 23, nanoTime, 0, 0, 0, 0);
    }
}
