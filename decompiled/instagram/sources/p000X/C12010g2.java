package p000X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0g2  reason: invalid class name and case insensitive filesystem */
public final class C12010g2 implements C12020g3 {
    public final Set A00 = new HashSet();
    public final Set A01 = new HashSet();

    public final synchronized void ADL(String str) {
        this.A01.add(str);
    }

    public final synchronized void ADk(String str) {
        this.A01.remove(str);
        A00();
    }

    public final boolean Agl() {
        return !this.A01.isEmpty();
    }

    public final void Bqi(AnonymousClass0O9 r3, C12040g5 r4) {
        if (this.A00.contains(r4)) {
            r4.Bqh(r3);
            A00();
            return;
        }
        throw new IllegalStateException("Queue not managed");
    }

    private void A00() {
        if (!Agl()) {
            for (C12040g5 BeH : this.A00) {
                BeH.BeH();
            }
        }
    }
}
