package p000X;

import android.content.Context;
import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.1jK  reason: invalid class name and case insensitive filesystem */
public final class C37231jK implements Runnable {
    public final /* synthetic */ C28541Md A00;

    public C37231jK(C28541Md r1) {
        this.A00 = r1;
    }

    public final void run() {
        long now = AwakeTimeSinceBootClock.INSTANCE.now();
        AnonymousClass1NJ A05 = ((AnonymousClass1NG) this.A00.A01.A0T.A04(0)).A05();
        Context context = this.A00.A06.getContext();
        if (context != null && A05 != null && A05.A3G.contains(C28571Mg.CACHED)) {
            C05700Lp.A00().ADc(new C37381jZ(this, context, A05.getId(), now));
        }
    }
}
