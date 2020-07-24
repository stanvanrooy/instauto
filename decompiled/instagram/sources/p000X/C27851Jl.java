package p000X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Jl  reason: invalid class name and case insensitive filesystem */
public final class C27851Jl extends AtomicBoolean implements C27711Ix {
    public final C27801Jg A00;
    public final C27841Jk A01;

    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.A00.A04(this);
        }
    }

    public C27851Jl(C27841Jk r1, C27801Jg r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
