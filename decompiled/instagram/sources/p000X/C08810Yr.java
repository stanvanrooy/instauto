package p000X;

import java.util.Random;

/* renamed from: X.0Yr  reason: invalid class name and case insensitive filesystem */
public final class C08810Yr implements AnonymousClass0EP {
    public final Object AAA(AnonymousClass0EV r11) {
        AnonymousClass0aX r3;
        AnonymousClass0FG A01 = r11.A01();
        C04370Dr A00 = r11.A00();
        if (!((Boolean) r11.A0M.get()).booleanValue()) {
            r3 = new AnonymousClass0aX(new Random(), 120000, 2147483647L, false);
        } else {
            r3 = new AnonymousClass0aX(new Random(), 12000, 1, true);
        }
        return new AnonymousClass0aY(A01, A00, r3);
    }
}
