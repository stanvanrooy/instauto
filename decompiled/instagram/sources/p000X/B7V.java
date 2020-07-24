package p000X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: X.B7V */
public final class B7V implements Callable {
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ Long A01;
    public final /* synthetic */ String A02;

    public B7V(SharedPreferences sharedPreferences, String str, Long l) {
        this.A00 = sharedPreferences;
        this.A02 = str;
        this.A01 = l;
    }

    public final /* synthetic */ Object call() {
        return Long.valueOf(this.A00.getLong(this.A02, this.A01.longValue()));
    }
}
