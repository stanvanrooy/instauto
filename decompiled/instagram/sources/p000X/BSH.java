package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import java.lang.ref.WeakReference;

/* renamed from: X.BSH */
public final class BSH implements C06710Qc {
    public final AnonymousClass0Q7 A00;
    public final AnonymousClass0OQ A01;
    public final BSI A02;

    public BSH(C06590Pq r5) {
        C13150hy.A02(r5, "session");
        AnonymousClass0Q7 A03 = AnonymousClass0Q7.A03();
        C13150hy.A01(A03, "BackgroundDetector.getInstance()");
        BSI bsi = (BSI) r5.AVA(BSI.class, new BSJ());
        C13150hy.A01(bsi, "VideoStateAggregator.getInstance(session)");
        AnonymousClass0OQ A002 = AnonymousClass0OQ.A00();
        C13150hy.A01(A002, "IGInteractionLatch.getInstance()");
        C13150hy.A02(A03, "detector");
        C13150hy.A02(bsi, "aggregator");
        C13150hy.A02(A002, "latch");
        this.A00 = A03;
        this.A02 = bsi;
        this.A01 = A002;
    }

    public final void BsZ(C06720Qd r7) {
        float A002;
        boolean z;
        if (r7 != null) {
            BSI bsi = this.A02;
            if (bsi.A00.size() == 0) {
                A002 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            } else {
                C36341ht r4 = C36341ht.IDLE;
                for (WeakReference weakReference : bsi.A00) {
                    BSK bsk = (BSK) weakReference.get();
                    if (bsk == null) {
                        bsi.A00.remove(weakReference);
                    } else {
                        C36341ht r2 = bsk.A00;
                        if (BSI.A00(r4) <= BSI.A00(r2)) {
                            r4 = r2;
                        }
                    }
                }
                A002 = (((float) BSI.A00(r4)) + 1.0f) / 6.0f;
            }
            r7.A01 = A002;
            r7.A02 = this.A00.A0H();
            AnonymousClass0OQ r0 = this.A01;
            synchronized (r0.A01) {
                z = r0.A00;
            }
            float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (z) {
                f = 1.0f;
            }
            r7.A00 = f;
        }
    }
}
