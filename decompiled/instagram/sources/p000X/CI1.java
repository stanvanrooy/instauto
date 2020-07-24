package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CI1 */
public final class CI1 {
    public int A00;
    public int A01;
    public final List A02 = new ArrayList();
    public final List A03 = new ArrayList();

    public final boolean A00() {
        if (!this.A02.isEmpty() || !this.A03.isEmpty()) {
            return false;
        }
        return true;
    }
}
