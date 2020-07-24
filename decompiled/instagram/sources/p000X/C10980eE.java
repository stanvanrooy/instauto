package p000X;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.0eE  reason: invalid class name and case insensitive filesystem */
public final class C10980eE {
    public final SharedPreferences A00;
    public final Object A01 = new Object();
    public final WeakHashMap A02 = new WeakHashMap();

    public final synchronized Map A01() {
        return this.A00.getAll();
    }

    public final C11000eG A00() {
        return new C11000eG(this, this.A00.edit());
    }

    public C10980eE(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }
}
