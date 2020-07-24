package p000X;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Rx  reason: invalid class name and case insensitive filesystem */
public final class C07140Rx {
    public UUID A00;
    public final AtomicInteger A01 = new AtomicInteger();

    public final synchronized UUID A00() {
        if (this.A00 == null) {
            this.A00 = UUID.randomUUID();
        }
        return this.A00;
    }
}
