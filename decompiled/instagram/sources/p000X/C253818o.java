package p000X;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: X.18o  reason: invalid class name and case insensitive filesystem */
public final class C253818o {
    public static final long A02 = TimeUnit.SECONDS.toMillis(30);
    public final Context A00;
    public final C92803zk A01;

    public static C253818o A00(Context context) {
        return new C253818o(context, AnonymousClass8AL.A00(new C253918p(context)));
    }

    public C253818o(Context context, C92803zk r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
