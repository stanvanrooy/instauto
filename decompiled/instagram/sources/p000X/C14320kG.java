package p000X;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0kG  reason: invalid class name and case insensitive filesystem */
public final class C14320kG {
    public final C11570fB A00;
    public final AtomicReference A01 = new AtomicReference(false);

    public final boolean A00(Locale locale) {
        if (!this.A00.AFC(Constants.ONE).contains(locale.toString()) || ((Boolean) this.A01.get()).booleanValue()) {
            return false;
        }
        return true;
    }

    public C14320kG(C11570fB r3) {
        this.A00 = r3;
    }
}
