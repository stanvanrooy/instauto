package p000X;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0rg  reason: invalid class name and case insensitive filesystem */
public final class C18330rg extends C18340rh {
    public static final long A01 = TimeUnit.MINUTES.toMillis(3);
    public C156466mG A00;

    public final C156466mG A00() {
        C156466mG r5 = this.A00;
        if (r5 != null && System.currentTimeMillis() - r5.A00.longValue() <= A01) {
            return r5;
        }
        this.A00 = null;
        return null;
    }

    public final void A01(String str, Map map) {
        this.A00 = new C156466mG(str, map);
    }
}
