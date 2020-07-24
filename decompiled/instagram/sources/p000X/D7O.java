package p000X;

import android.media.MediaCodec;
import android.os.Handler;

/* renamed from: X.D7O */
public final class D7O implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ C29732D6w A00;

    public D7O(C29732D6w d6w, MediaCodec mediaCodec) {
        this.A00 = d6w;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        C29732D6w d6w = this.A00;
        if (this == d6w.A0O) {
            d6w.A0a();
        }
    }
}
