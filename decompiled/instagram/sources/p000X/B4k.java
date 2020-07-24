package p000X;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: X.B4k */
public final /* synthetic */ class B4k implements Runnable {
    public final Bundle A00;
    public final B57 A01;
    public final C68512zF A02;

    public B4k(C68512zF r1, Bundle bundle, B57 b57) {
        this.A02 = r1;
        this.A00 = bundle;
        this.A01 = b57;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b0, code lost:
        if (r2.containsKey("google.messenger") != false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b8, code lost:
        r3.A00.A0H(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bd, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final void run() {
        Bundle bundle;
        int i;
        Object A002;
        C68512zF r0 = this.A02;
        Bundle bundle2 = this.A00;
        B57 b57 = this.A01;
        C68522zG r4 = r0.A02;
        if (r4.A05.A04() >= 12000000) {
            B4X A012 = B4X.A01(r4.A03);
            synchronized (A012) {
                i = A012.A00;
                A012.A00 = i + 1;
            }
            C60302jg A003 = B4X.A00(A012, new C25169B4p(i, bundle2));
            try {
                AnonymousClass0a2.A00();
                AnonymousClass0a2.A03(A003, "Task must not be null");
                if (A003.A0E()) {
                    A002 = C60402jq.A00(A003);
                } else {
                    C60412jr r2 = new C60412jr();
                    Executor executor = C60422js.A01;
                    A003.A08(executor, r2);
                    A003.A07(executor, r2);
                    A003.A06(executor, r2);
                    r2.A00.await();
                    A002 = C60402jq.A00(A003);
                }
                bundle = (Bundle) A002;
            } catch (InterruptedException | ExecutionException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String.valueOf(e);
                }
                if ((e.getCause() instanceof C25172B4s) && ((C25172B4s) e.getCause()).A00 == 4) {
                    bundle = C68522zG.A00(r4, bundle2);
                    if (bundle != null && bundle.containsKey("google.messenger") && (bundle = C68522zG.A00(r4, bundle2)) != null && bundle.containsKey("google.messenger")) {
                    }
                }
                bundle = null;
            }
        } else {
            bundle = C68522zG.A00(r4, bundle2);
            if (bundle != null) {
                if (bundle.containsKey("google.messenger")) {
                    bundle = C68522zG.A00(r4, bundle2);
                    if (bundle != null) {
                    }
                }
            }
        }
        b57.A01(bundle);
    }
}
