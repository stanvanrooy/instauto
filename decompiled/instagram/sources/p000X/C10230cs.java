package p000X;

import android.content.SharedPreferences;
import android.os.Bundle;

/* renamed from: X.0cs  reason: invalid class name and case insensitive filesystem */
public final class C10230cs extends C08390Wv {
    public final Class A00() {
        return String.class;
    }

    public final Object A01(SharedPreferences sharedPreferences, String str, Object obj) {
        return sharedPreferences.getString(str, (String) obj);
    }

    public final Object A02(Bundle bundle, String str, Object obj) {
        return bundle.getString(str, (String) obj);
    }

    public final void A03(SharedPreferences.Editor editor, String str, Object obj) {
        editor.putString(str, (String) obj);
    }

    public final void A04(Bundle bundle, String str, Object obj) {
        bundle.putString(str, (String) obj);
    }
}
