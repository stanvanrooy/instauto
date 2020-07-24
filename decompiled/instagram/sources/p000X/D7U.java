package p000X;

import android.media.MediaCodecInfo;
import java.util.List;

/* renamed from: X.D7U */
public final class D7U implements D7w {
    public final D70 ARd() {
        D70 A01 = C29734D6y.A01("audio/raw");
        if (A01 == null) {
            return null;
        }
        return new D70(A01.A02, (String) null, (MediaCodecInfo.CodecCapabilities) null, true, false, false);
    }

    public final List AJv(String str, boolean z, boolean z2) {
        return C29734D6y.A03(str, z, z2);
    }
}
