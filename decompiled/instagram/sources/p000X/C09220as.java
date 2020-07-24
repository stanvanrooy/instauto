package p000X;

import android.os.Process;

/* renamed from: X.0as  reason: invalid class name and case insensitive filesystem */
public final class C09220as extends AnonymousClass0O9 {
    public C09220as() {
        super(14, 2, false, true);
    }

    public final void run() {
        Process.setThreadPriority(-10);
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01("initAsyncHttpService", -2146833262);
        }
        synchronized (AnonymousClass0k4.class) {
            if (AnonymousClass0k4.A03 == null) {
                AnonymousClass0k4.A03 = new AnonymousClass0k4((C14250k8) AnonymousClass0k4.A02.get());
            }
        }
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A00(1386686017);
        }
    }
}
