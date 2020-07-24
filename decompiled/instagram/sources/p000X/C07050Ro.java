package p000X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0Ro  reason: invalid class name and case insensitive filesystem */
public final class C07050Ro extends C09790c1 {
    public final Context A00;
    public final int A01 = 2131886795;

    public C07050Ro(Context context) {
        this.A00 = context;
    }

    public final void A06() {
        super.A06();
        this.A04.add(AnonymousClass05N.class);
        this.A04.add(C08560Xo.class);
    }

    public final void A07() {
        int A03 = AnonymousClass0Z0.A03(-1001971749);
        int i = this.A01;
        this.A00.setTheme(i);
        C15330mi.A00 = new AnonymousClass0S1(this, i);
        int i2 = this.A00.getResources().getConfiguration().uiMode & 48;
        if (i2 == 16 || i2 == 32) {
            SharedPreferences.Editor edit = C15330mi.A00().edit();
            edit.putInt("KEY_CONFIG_UI_MODE", i2);
            edit.putInt("KEY_CONFIG_CURRENT_SYSTEM_UI_MODE", i2);
            edit.apply();
        }
        AnonymousClass0Z0.A0A(-312239281, A03);
    }
}
