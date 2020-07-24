package p000X;

import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;

/* renamed from: X.1ng  reason: invalid class name and case insensitive filesystem */
public final class C39861ng implements C39791nY {
    public final void B2S(VideoPrefetchRequest videoPrefetchRequest) {
        C236811k A00 = C236411g.A00();
        if (C236811k.A00(A00)) {
            A00.A01.A02(videoPrefetchRequest.A09, C43721uy.A03(C43721uy.A01(videoPrefetchRequest.A03)), AnonymousClass7KX.DID_ENTER_PREFETCH_QUEUE, A00.A00.currentMonotonicTimestampNanos());
        }
    }

    public final void B3A(VideoPrefetchRequest videoPrefetchRequest) {
        C236811k A00 = C236411g.A00();
        if (C236811k.A00(A00)) {
            A00.A01.A02(videoPrefetchRequest.A09, C43721uy.A03(C43721uy.A01(videoPrefetchRequest.A03)), AnonymousClass7KX.DID_EXIT_PREFETCH_QUEUE, A00.A00.currentMonotonicTimestampNanos());
        }
    }
}
