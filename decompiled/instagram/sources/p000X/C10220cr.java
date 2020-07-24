package p000X;

import android.content.SharedPreferences;
import android.os.Bundle;

/* renamed from: X.0cr  reason: invalid class name and case insensitive filesystem */
public final class C10220cr extends C08390Wv {
    public final Class A00() {
        return Integer.class;
    }

    public final Object A01(SharedPreferences sharedPreferences, String str, Object obj) {
        int intValue;
        Integer num = (Integer) obj;
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        return Integer.valueOf(sharedPreferences.getInt(str, intValue));
    }

    public final Object A02(Bundle bundle, String str, Object obj) {
        int intValue;
        Integer num = (Integer) obj;
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        return Integer.valueOf(bundle.getInt(str, intValue));
    }

    public final void A03(SharedPreferences.Editor editor, String str, Object obj) {
        editor.putInt(str, ((Integer) obj).intValue());
    }

    public final void A04(Bundle bundle, String str, Object obj) {
        bundle.putInt(str, ((Integer) obj).intValue());
    }
}
