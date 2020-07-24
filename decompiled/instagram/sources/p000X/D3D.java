package p000X;

import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;

/* renamed from: X.D3D */
public final class D3D {
    public final /* synthetic */ D2D A00;
    public final /* synthetic */ String A01;

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
        return videoPrefetchRequest != null && this.A01.equals(videoPrefetchRequest.A09.A0D);
    }

    public D3D(D2D d2d, String str) {
        this.A00 = d2d;
        this.A01 = str;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
