package p000X;

import android.content.SharedPreferences;
import android.os.Bundle;

/* renamed from: X.0co  reason: invalid class name and case insensitive filesystem */
public final class C10190co extends C08390Wv {
    public final Class A00() {
        return Long.class;
    }

    public final Object A01(SharedPreferences sharedPreferences, String str, Object obj) {
        long longValue;
        Long l = (Long) obj;
        if (l == null) {
            longValue = Long.MAX_VALUE;
        } else {
            longValue = l.longValue();
        }
        return Long.valueOf(sharedPreferences.getLong(str, longValue));
    }

    public final Object A02(Bundle bundle, String str, Object obj) {
        long longValue;
        Long l = (Long) obj;
        if (l == null) {
            longValue = Long.MAX_VALUE;
        } else {
            longValue = l.longValue();
        }
        return Long.valueOf(bundle.getLong(str, longValue));
    }

    public final void A03(SharedPreferences.Editor editor, String str, Object obj) {
        editor.putLong(str, ((Long) obj).longValue());
    }

    public final void A04(Bundle bundle, String str, Object obj) {
        bundle.putLong(str, ((Long) obj).longValue());
    }
}
