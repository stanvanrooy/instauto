package p000X;

import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;

/* renamed from: X.D3A */
public final class D3A {
    public final /* synthetic */ D2D A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public final boolean equals(Object obj) {
        VideoPrefetchRequest videoPrefetchRequest;
        if (obj == null) {
            return false;
        }
        if (obj instanceof D22) {
            videoPrefetchRequest = ((D22) obj).A00;
        } else if (obj instanceof D2P) {
            videoPrefetchRequest = ((D2P) obj).A00;
        } else {
            videoPrefetchRequest = null;
        }
        if (videoPrefetchRequest == null) {
            return false;
        }
        String str = this.A01;
        VideoSource videoSource = videoPrefetchRequest.A09;
        if (str.equals(videoSource.A08)) {
            return !this.A02 || !videoSource.A0K;
        }
        return false;
    }

    public D3A(D2D d2d, String str, boolean z) {
        this.A00 = d2d;
        this.A01 = str;
        this.A02 = z;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
