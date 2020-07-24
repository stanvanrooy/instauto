package p000X;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Executor;

/* renamed from: X.B4Y */
public final class B4Y {
    public final Context A00;
    public final Bundle A01;
    public final C24718AsL A02;
    public final Executor A03;

    public B4Y(Context context, Bundle bundle, Executor executor) {
        this.A03 = executor;
        this.A00 = context;
        this.A01 = bundle;
        this.A02 = new C24718AsL(context, context.getPackageName());
    }
}
