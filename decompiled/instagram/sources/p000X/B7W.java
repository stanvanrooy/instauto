package p000X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: X.B7W */
public final class B7W implements Callable {
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;

    public B7W(SharedPreferences sharedPreferences, String str, Integer num) {
        this.A00 = sharedPreferences;
        this.A02 = str;
        this.A01 = num;
    }

    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.A00.getInt(this.A02, this.A01.intValue()));
    }
}
