package p000X;

import com.facebook.profilo.core.TriggerRegistry;
import com.facebook.profilo.ipc.TraceContext;
import java.util.Random;

/* renamed from: X.0bd  reason: invalid class name and case insensitive filesystem */
public final class C09570bd implements AnonymousClass0Gm {
    public static final int A01 = TriggerRegistry.A00.A02("black_box");
    public final ThreadLocal A00 = new AnonymousClass0GO(this);

    public final boolean A9h(long j, Object obj, long j2, Object obj2) {
        return j == 0 || j2 == 0 || j == j2;
    }

    public final boolean Aek() {
        return true;
    }

    public final int ADR(long j, Object obj, AnonymousClass0GE r6) {
        AnonymousClass0b9 r62 = (AnonymousClass0b9) r6;
        if (((Random) this.A00.get()).nextInt(r62.A03) == 0) {
            return r62.A04;
        }
        return 0;
    }

    public final TraceContext.TraceConfigExtras AYl(long j, Object obj, AnonymousClass0GE r8) {
        AnonymousClass0b9 r82 = (AnonymousClass0b9) r8;
        return new TraceContext.TraceConfigExtras(r82.A02, r82.A00, r82.A01);
    }
}
