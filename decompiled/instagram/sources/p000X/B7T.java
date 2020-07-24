package p000X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: X.B7T */
public final class B7T implements Callable {
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ Boolean A01;
    public final /* synthetic */ String A02;

    public B7T(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.A00 = sharedPreferences;
        this.A02 = str;
        this.A01 = bool;
    }

    public final /* synthetic */ Object call() {
        return Boolean.valueOf(this.A00.getBoolean(this.A02, this.A01.booleanValue()));
    }
}
