package p000X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.0rM  reason: invalid class name and case insensitive filesystem */
public abstract class C18130rM {
    public static C18130rM A00;

    public abstract C105814hT A01(Context context, AnonymousClass0C1 r2, C107684kX r3);

    public abstract C105814hT A02(Context context, AnonymousClass0C1 r2, C104754fk r3);

    public abstract String A03(Map map, C105814hT r2);

    public abstract String A04(Map map, C105814hT r2);

    public static C18130rM A00() {
        C18130rM r0 = A00;
        if (r0 != null) {
            return r0;
        }
        throw new RuntimeException("VideoTransactionBuilder not initialized");
    }
}
