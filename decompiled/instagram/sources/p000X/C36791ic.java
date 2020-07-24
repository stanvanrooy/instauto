package p000X;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1ic  reason: invalid class name and case insensitive filesystem */
public final class C36791ic implements C06570Po {
    public SharedPreferences A00;
    public AnonymousClass0C1 A01;

    public final void A01(AnonymousClass1NJ r2, boolean z) {
        A02(r2, z, true);
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C36791ic A00(AnonymousClass0C1 r2) {
        return (C36791ic) r2.AVA(C36791ic.class, new C36801id(r2));
    }

    public final void A02(AnonymousClass1NJ r3, boolean z, boolean z2) {
        this.A00.edit().putBoolean(r3.getId(), z).apply();
        if (z2) {
            r3.A6t(this.A01);
        }
    }

    public final boolean A04(AnonymousClass1NJ r4) {
        return this.A00.getBoolean(r4.getId(), false);
    }

    public C36791ic(AnonymousClass0C1 r1, SharedPreferences sharedPreferences) {
        this.A01 = r1;
        this.A00 = sharedPreferences;
    }

    public final void A03(List list, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            this.A00.edit().putBoolean(str, z).apply();
            AnonymousClass1NJ A02 = AnonymousClass1PZ.A00(this.A01).A02(str);
            if (A02 != null) {
                A02.A6t(this.A01);
            }
        }
    }
}
