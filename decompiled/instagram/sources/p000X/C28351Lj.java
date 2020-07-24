package p000X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1Lj  reason: invalid class name and case insensitive filesystem */
public final class C28351Lj implements C12830hS {
    public static final Handler A02 = new Handler(Looper.getMainLooper());
    public final Context A00;
    public final AnonymousClass1L8 A01;

    public static void A00(Context context, AnonymousClass1L8 r5, C17860qv r6) {
        int andIncrement = C05960Nd.A00.getAndIncrement();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            AnonymousClass0QD.A03("LoaderScheduler", AnonymousClass000.A0E("Tried to initialize loader on non-UI thread for module: ", AnonymousClass1BC.A02.A00), 1);
            AnonymousClass0ZA.A0E(A02, new C192688Lt(r5, andIncrement, context, r6), -225604149);
            return;
        }
        r5.A03(andIncrement, (Bundle) null, new C28631Mm(context, r5, andIncrement, r6));
    }

    public C28351Lj(Context context, AnonymousClass1L8 r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void schedule(C17860qv r3) {
        A00(this.A00, this.A01, r3);
    }

    public final void schedule(C17860qv r1, int i, int i2, boolean z, boolean z2) {
        schedule(r1);
    }
}
