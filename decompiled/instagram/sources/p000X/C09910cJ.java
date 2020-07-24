package p000X;

import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.util.Collection;

/* renamed from: X.0cJ  reason: invalid class name and case insensitive filesystem */
public final class C09910cJ extends AnonymousClass0Y2 {
    public int A00;
    public Context A01;
    public C09900cI A02;

    public C09910cJ(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext;
        if (applicationContext == null) {
            Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.");
            this.A01 = context;
        }
        this.A00 = 0;
        this.A02 = new C09900cI(new File(this.A01.getApplicationInfo().nativeLibraryDir), 0);
    }

    public final void A03(int i) {
        this.A02.A03(i);
    }

    public final int A04(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.A02.A04(str, i, threadPolicy);
    }

    public final File A05(String str) {
        return this.A02.A05(str);
    }

    public final String A06(String str) {
        return this.A02.A06(str);
    }

    public final void A07(Collection collection) {
        this.A02.A07(collection);
    }

    public final String[] A08(String str) {
        return this.A02.A08(str);
    }

    public final String toString() {
        return this.A02.toString();
    }
}
