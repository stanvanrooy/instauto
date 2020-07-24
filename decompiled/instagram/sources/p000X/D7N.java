package p000X;

import android.os.Build;
import org.webrtc.MediaCodecUtils;
import org.webrtc.MediaCodecVideoDecoder;

/* renamed from: X.D7N */
public final class D7N implements D9G {
    public final boolean Aeh(String str) {
        if (str.startsWith("OMX.qcom.") || str.startsWith(MediaCodecUtils.INTEL_PREFIX) || str.startsWith("OMX.Exynos.")) {
            return true;
        }
        if (!str.startsWith(MediaCodecVideoDecoder.supportedMediaTekH264HighProfileHwCodecPrefix) || Build.VERSION.SDK_INT <= 26) {
            return false;
        }
        return true;
    }
}
