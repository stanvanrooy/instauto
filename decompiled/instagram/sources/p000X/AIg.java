package p000X;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AIg */
public final class AIg implements C30165DTm {
    public final C23330AIf A00 = new C23330AIf();
    public final C14440kc A01 = new C14440kc();
    public volatile C30165DTm A02;

    public final C30165DTm A9u(ReferenceQueue referenceQueue, Object obj, DU5 du5) {
        return this;
    }

    public final DU5 ALC() {
        return null;
    }

    public final boolean AgL() {
        return true;
    }

    public final long A00() {
        long j;
        C23330AIf aIf = this.A00;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (aIf.A01) {
            j = (aIf.A02.A00() - aIf.A00) + 0;
        } else {
            j = 0;
        }
        return timeUnit.convert(j, timeUnit);
    }

    public final C14490kj A01(Object obj, C211549Ak r6) {
        C14490kj A012;
        try {
            C23330AIf aIf = this.A00;
            AnonymousClass0a4.A0C(!aIf.A01, "This stopwatch is already running.");
            aIf.A01 = true;
            aIf.A00 = aIf.A02.A00();
            Object obj2 = this.A02.get();
            if (obj2 == null) {
                Object A002 = r6.A00(obj);
                if (this.A01.A0A(A002)) {
                    return this.A01;
                }
                return AnonymousClass2MU.A00(A002);
            }
            AnonymousClass0a4.A06(obj);
            AnonymousClass0a4.A06(obj2);
            C14490kj A003 = AnonymousClass2MU.A00(r6.A00(obj));
            AIi aIi = new AIi(this);
            C197618cv r0 = C197618cv.A01;
            AnonymousClass0a4.A06(aIi);
            C206108s0 r1 = new C206108s0(A003, aIi);
            A003.A3T(r1, C206128s2.A00(r0, r1));
            return r1;
        } catch (Throwable th) {
            if (this.A01.A0B(th)) {
                A012 = this.A01;
            } else {
                A012 = AnonymousClass2MU.A01(th);
            }
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return A012;
        }
    }

    public final int Aag() {
        return this.A02.Aag();
    }

    public final boolean Ae3() {
        return this.A02.Ae3();
    }

    public final void AqF(Object obj) {
        if (obj != null) {
            this.A01.A0A(obj);
        } else {
            this.A02 = C30160DTh.A0K;
        }
    }

    public final Object Bu5() {
        return C54522Xr.A00(this.A01);
    }

    public final Object get() {
        return this.A02.get();
    }

    public AIg(C30165DTm dTm) {
        this.A02 = dTm;
    }
}
