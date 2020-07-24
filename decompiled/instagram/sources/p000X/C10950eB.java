package p000X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0eB  reason: invalid class name and case insensitive filesystem */
public final class C10950eB extends AnonymousClass0T6 {
    public final SharedPreferences A00(Context context, String str, boolean z) {
        int i = 0;
        if (z) {
            i = 4;
        }
        return context.getSharedPreferences(str, i);
    }
}
