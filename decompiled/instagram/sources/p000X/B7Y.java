package p000X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.B7Y */
public final class B7Y implements Callable {
    public final /* synthetic */ Context A00;

    public B7Y(Context context) {
        this.A00 = context;
    }

    public final /* synthetic */ Object call() {
        return this.A00.getSharedPreferences("google_sdk_flags", 0);
    }
}
