package p000X;

import android.util.SparseArray;
import com.facebook.profilo.core.TriggerRegistry;
import com.facebook.profilo.ipc.TraceContext;
import java.util.Random;

/* renamed from: X.0bg  reason: invalid class name and case insensitive filesystem */
public final class C09600bg implements AnonymousClass0Gm, AnonymousClass0GX {
    public static final int A01;
    public static final int A02;
    public Random A00 = new Random();

    public final boolean A9h(long j, Object obj, long j2, Object obj2) {
        return j == j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 <= 0) goto L_0x000e;
     */
    public final int ADR(long j, Object obj, AnonymousClass0GE r7) {
        boolean z;
        AnonymousClass0GJ r2;
        int i;
        int i2 = (int) j;
        C09320bD r72 = (C09320bD) r7;
        SparseArray sparseArray = r72.A01;
        if (sparseArray != null) {
            int size = sparseArray.size();
            z = true;
        }
        z = false;
        if (!z) {
            r2 = null;
        } else {
            r2 = (AnonymousClass0GJ) r72.A01.get(i2);
        }
        if (r2 == null || (i = r2.A04) == 0) {
            return 0;
        }
        if (i == 1 || this.A00.nextInt(i) == 0) {
            return r2.A00;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 <= 0) goto L_0x000e;
     */
    public final TraceContext.TraceConfigExtras AYl(long j, Object obj, AnonymousClass0GE r8) {
        boolean z;
        AnonymousClass0GJ r0;
        int i = (int) j;
        C09320bD r82 = (C09320bD) r8;
        SparseArray sparseArray = r82.A01;
        if (sparseArray != null) {
            int size = sparseArray.size();
            z = true;
        }
        z = false;
        if (!z) {
            r0 = null;
        } else {
            r0 = (AnonymousClass0GJ) r82.A01.get(i);
        }
        return new TraceContext.TraceConfigExtras(r0.A03, r0.A01, r0.A02);
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

    static {
        AnonymousClass0GY r1 = TriggerRegistry.A00;
        A01 = r1.A02("qpl");
        A02 = r1.A02("sequence_qpl");
    }
}
