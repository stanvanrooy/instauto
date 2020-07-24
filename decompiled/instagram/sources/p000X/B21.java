package p000X;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.B21 */
public abstract class B21 {
    public List A00 = new ArrayList();
    public boolean A01 = false;

    public View A00() {
        return !(this instanceof C25105B0x) ? ((B1N) this).A00.A00 : ((C25105B0x) this).A00.A00;
    }

    public boolean A02() {
        return this instanceof B1N;
    }

    public boolean A03() {
        return this instanceof B1N;
    }

    public final void A01(boolean z) {
        if (z != this.A01) {
            this.A01 = z;
            for (B22 A002 : this.A00) {
                A002.A00();
            }
        }
    }
}
