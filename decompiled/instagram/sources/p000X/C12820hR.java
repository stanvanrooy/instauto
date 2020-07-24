package p000X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.0hR  reason: invalid class name and case insensitive filesystem */
public final class C12820hR implements C12830hS {
    public static final Handler A01 = new Handler(Looper.getMainLooper());
    public final AnonymousClass0OT A00;

    public C12820hR(AnonymousClass0OT r1) {
        this.A00 = r1;
    }

    public final void schedule(C17860qv r8) {
        int runnableId = r8.getRunnableId();
        AnonymousClass0OT r0 = this.A00;
        r8.onStart();
        r0.ADc(new C22650ym(runnableId, 3, false, false, r8));
    }

    public final void schedule(C17860qv r8, int i, int i2, boolean z, boolean z2) {
        AnonymousClass0OT r0 = this.A00;
        r8.onStart();
        boolean z3 = z;
        r0.ADc(new C22650ym(i, i2, z3, z2, r8));
    }
}
