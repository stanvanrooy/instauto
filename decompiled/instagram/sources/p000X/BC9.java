package p000X;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.BC9 */
public final class BC9 {
    public View A00;
    public final ArrayList A01 = new ArrayList();
    public final Map A02 = new HashMap();

    public final boolean equals(Object obj) {
        if (!(obj instanceof BC9)) {
            return false;
        }
        BC9 bc9 = (BC9) obj;
        if (this.A00 != bc9.A00 || !this.A02.equals(bc9.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A02.hashCode();
    }

    public final String toString() {
        String A0E = AnonymousClass000.A0E(AnonymousClass000.A0J("TransitionValues@", Integer.toHexString(hashCode()), ":\n") + "    view = " + this.A00 + "\n", "    values:");
        for (String str : this.A02.keySet()) {
            A0E = A0E + "    " + str + ": " + this.A02.get(str) + "\n";
        }
        return A0E;
    }

    public BC9() {
    }

    public BC9(View view) {
        this.A00 = view;
    }
}
