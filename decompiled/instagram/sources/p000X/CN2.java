package p000X;

import android.content.SharedPreferences;

/* renamed from: X.CN2 */
public final class CN2 implements C06570Po {
    public final SharedPreferences A00;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static synchronized CN2 A00(AnonymousClass0C1 r2) {
        CN2 cn2;
        Class<CN2> cls = CN2.class;
        synchronized (cls) {
            cn2 = (CN2) r2.AVA(cls, new CN3(r2));
        }
        return cn2;
    }

    public CN2(AnonymousClass0C1 r3) {
        this.A00 = C14190ju.A01(r3).A03(Constants.A0V);
    }
}
