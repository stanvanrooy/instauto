package p000X;

import com.facebook.profilo.core.TriggerRegistry;
import com.facebook.profilo.ipc.TraceContext;
import java.util.Random;

/* renamed from: X.0bf  reason: invalid class name and case insensitive filesystem */
public final class C09590bf implements AnonymousClass0Gm, AnonymousClass0GX {
    public static final int A01 = TriggerRegistry.A00.A02("cold_start");
    public final ThreadLocal A00 = new AnonymousClass0GP(this);

    public final boolean A9h(long j, Object obj, long j2, Object obj2) {
        return ((int) j) == ((int) j2);
    }

    public final boolean Aek() {
        return true;
    }

    public final boolean Afx(long j, Object obj, int i) {
        if (((int) j) == i) {
            return true;
        }
        return false;
    }

    public final int ADR(long j, Object obj, AnonymousClass0GE r6) {
        C09290bA r62 = (C09290bA) r6;
        if (((Random) this.A00.get()).nextInt(r62.A04) == 0) {
            return r62.A00;
        }
        return 0;
    }

    public final TraceContext.TraceConfigExtras AYl(long j, Object obj, AnonymousClass0GE r8) {
        C09290bA r82 = (C09290bA) r8;
        return new TraceContext.TraceConfigExtras(r82.A03, r82.A01, r82.A02);
    }
}
