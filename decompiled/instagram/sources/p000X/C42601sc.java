package p000X;

import android.net.NetworkInfo;

/* renamed from: X.1sc  reason: invalid class name and case insensitive filesystem */
public final class C42601sc implements AnonymousClass0NZ {
    public final /* synthetic */ C17870qw A00;

    public C42601sc(C17870qw r1) {
        this.A00 = r1;
    }

    public final void Ay1(NetworkInfo networkInfo) {
        String str;
        if (networkInfo != null) {
            boolean z = true;
            if (networkInfo.getType() != 1) {
                z = false;
            }
            C17870qw r2 = this.A00;
            if (C17870qw.A0A(r2)) {
                if (z) {
                    str = "connected to wifi";
                } else {
                    str = "connected to data";
                }
                C17870qw.A09(r2, str, true);
            }
        }
    }
}
