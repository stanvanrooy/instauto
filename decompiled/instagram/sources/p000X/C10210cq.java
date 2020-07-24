package p000X;

import android.content.SharedPreferences;
import android.os.Bundle;

/* renamed from: X.0cq  reason: invalid class name and case insensitive filesystem */
public final class C10210cq extends C08390Wv {
    public final Class A00() {
        return Boolean.class;
    }

    public final Object A01(SharedPreferences sharedPreferences, String str, Object obj) {
        boolean booleanValue;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(sharedPreferences.getBoolean(str, booleanValue));
    }

    public final Object A02(Bundle bundle, String str, Object obj) {
        boolean booleanValue;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(bundle.getBoolean(str, booleanValue));
    }

    public final void A03(SharedPreferences.Editor editor, String str, Object obj) {
        editor.putBoolean(str, ((Boolean) obj).booleanValue());
    }

    public final void A04(Bundle bundle, String str, Object obj) {
        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
    }
}
