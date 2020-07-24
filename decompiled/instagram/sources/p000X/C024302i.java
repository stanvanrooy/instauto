package p000X;

import android.os.PowerManager;

/* renamed from: X.02i  reason: invalid class name and case insensitive filesystem */
public final class C024302i implements AnonymousClass06Y {
    public final C032906k A00;
    public final /* synthetic */ C033806t A01;

    public C024302i(C033806t r1, C032906k r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void B32() {
        PowerManager.WakeLock wakeLock = this.A01.A00;
        if (wakeLock != null) {
            AnonymousClass0ZP.A02(wakeLock);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r10.A01;
     */
    public final void BWA(boolean z) {
        C033806t r1;
        C033506q r0;
        if (z && (r0 = r1.A07) != null) {
            this.A00.A01(r1.A02, r0.A02, r1.A06, r0.A01, r0.A00);
        }
    }
}
