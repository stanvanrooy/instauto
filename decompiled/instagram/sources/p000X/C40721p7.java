package p000X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1p7  reason: invalid class name and case insensitive filesystem */
public final class C40721p7 implements C40661p1 {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r3.A01.A01 == false) goto L_0x0013;
     */
    public final void BWB(VideoPlayRequest videoPlayRequest, String str) {
        boolean z;
        if (C236411g.A03 != null) {
            C237111n r3 = C236411g.A03.A02;
            if (!r3.A02) {
                z = true;
            }
            z = false;
            if (z) {
                long currentMonotonicTimestampNanos = r3.A00.currentMonotonicTimestampNanos();
                String str2 = videoPlayRequest.A05.A0D;
                int A00 = C169107Ki.A00(str2);
                if (!r3.A00.isMarkerOn(AnonymousClass7Kh.A00(C237111n.A03), A00)) {
                    AnonymousClass0QD.A02(r3.getClass().getSimpleName(), StringFormatUtil.formatStrLocaleSafe("cannot end marker with error for video ID %s: already started", (Object) str2));
                }
                r3.A00.markerAnnotate(AnonymousClass7Kh.A00(C237111n.A03), A00, "msg", str);
                r3.A00.markerEnd(AnonymousClass7Kh.A00(C237111n.A03), A00, 87, currentMonotonicTimestampNanos, TimeUnit.NANOSECONDS);
                return;
            }
            return;
        }
        throw new IllegalStateException("VideoQPL never initialized");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r3.A01.A01 == false) goto L_0x0013;
     */
    public final void BWC(VideoPlayRequest videoPlayRequest) {
        boolean z;
        if (C236411g.A03 != null) {
            C237111n r3 = C236411g.A03.A02;
            if (!r3.A02) {
                z = true;
            }
            z = false;
            if (z) {
                long currentMonotonicTimestampNanos = r3.A00.currentMonotonicTimestampNanos();
                String str = videoPlayRequest.A05.A0D;
                int A00 = C169107Ki.A00(str);
                if (r3.A00.isMarkerOn(AnonymousClass7Kh.A00(C237111n.A03), A00)) {
                    AnonymousClass0QD.A02(r3.getClass().getSimpleName(), StringFormatUtil.formatStrLocaleSafe("cannot start marker for video ID %s: already started", (Object) str));
                }
                r3.A00.markerStart(AnonymousClass7Kh.A00(C237111n.A03), A00, currentMonotonicTimestampNanos, TimeUnit.NANOSECONDS);
                return;
            }
            return;
        }
        throw new IllegalStateException("VideoQPL never initialized");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r3.A01.A01 == false) goto L_0x0013;
     */
    public final void BWD(VideoPlayRequest videoPlayRequest) {
        boolean z;
        if (C236411g.A03 != null) {
            C237111n r3 = C236411g.A03.A02;
            if (!r3.A02) {
                z = true;
            }
            z = false;
            if (z) {
                long currentMonotonicTimestampNanos = r3.A00.currentMonotonicTimestampNanos();
                String str = videoPlayRequest.A05.A0D;
                int A00 = C169107Ki.A00(str);
                if (!r3.A00.isMarkerOn(AnonymousClass7Kh.A00(C237111n.A03), A00)) {
                    AnonymousClass0QD.A02(r3.getClass().getSimpleName(), StringFormatUtil.formatStrLocaleSafe("cannot end marker for video ID %s: not started", (Object) str));
                }
                r3.A00.markerEnd(AnonymousClass7Kh.A00(C237111n.A03), A00, 2, currentMonotonicTimestampNanos, TimeUnit.NANOSECONDS);
                return;
            }
            return;
        }
        throw new IllegalStateException("VideoQPL never initialized");
    }
}
