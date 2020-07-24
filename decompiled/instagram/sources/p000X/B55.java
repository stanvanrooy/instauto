package p000X;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.B55 */
public final class B55 implements C06570Po {
    public SharedPreferences A00;

    public final synchronized Set A00() {
        return this.A00.getStringSet("services_waiting_for_connectivity_change", new HashSet());
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public B55(AnonymousClass0C1 r3) {
        this.A00 = C14190ju.A01(r3).A03(Constants.A0K);
    }
}
