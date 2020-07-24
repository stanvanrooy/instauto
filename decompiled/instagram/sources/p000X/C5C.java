package p000X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.C5C */
public abstract class C5C extends C4i {
    public WeakReference A00;

    public boolean A00() {
        if (this instanceof C27243C4q) {
            return false;
        }
        C4m c4m = (C4m) this;
        if (!c4m.A0I) {
            return false;
        }
        B7F b7f = c4m.A0G;
        if (b7f != null) {
            b7f.A00();
            c4m.A0G = null;
        }
        c4m.A0I = false;
        return true;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C5Z) {
            this.A00 = new WeakReference((C5Z) context);
        }
    }
}
