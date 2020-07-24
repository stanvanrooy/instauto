package p000X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1xN  reason: invalid class name and case insensitive filesystem */
public final class C45151xN extends C12380ge {
    public static final AtomicBoolean A00 = new AtomicBoolean(false);

    public final boolean A04() {
        C04090Cj r1;
        if (!AnonymousClass0Cg.A00() || AnonymousClass0Cg.A01.getAndSet(true)) {
            return true;
        }
        boolean z = false;
        if (AnonymousClass0Cg.A00 != AnonymousClass0KY.A00) {
            z = true;
        }
        if (!z) {
            r1 = null;
        } else if (AnonymousClass0Bq.A00) {
            r1 = AnonymousClass0Cg.A02[5];
        } else {
            r1 = AnonymousClass0Cg.A03[5];
        }
        if (r1 != null) {
            r1.toString();
        }
        AnonymousClass0Cg.A00.badTimeToDoGc(r1);
        return true;
    }

    public final int AGu() {
        return 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r5.A01;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    public C45151xN(Context context, C51762Ma r5) {
        super(r0);
        int i = (r5 == null || i <= 0) ? 5000 : i;
        if (A00.compareAndSet(false, true)) {
            AnonymousClass4FG.A00(context);
        }
    }

    public final void A03() {
        if (AnonymousClass0Cg.A00() && AnonymousClass0Cg.A01.getAndSet(false)) {
            AnonymousClass0Cg.A00.notAsBadTimeToDoGc();
        }
    }
}
