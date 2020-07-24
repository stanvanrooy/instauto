package p000X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import org.webrtc.HardwareVideoEncoder;

/* renamed from: X.D75 */
public final class D75 {
    public static final Class A03 = D75.class;
    public boolean A00;
    public boolean A01;
    public boolean A02;

    public static MediaCodec A00(D75 d75, AWA awa, C23624AUk aUk, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        C23624AUk aUk2 = aUk;
        AWA awa2 = awa;
        int i8 = i4;
        int i9 = i5;
        int i10 = i3;
        int i11 = i2;
        int i12 = i;
        try {
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i12, i11);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger(TraceFieldType.Bitrate, i10);
            createVideoFormat.setInteger("frame-rate", i8);
            createVideoFormat.setInteger("i-frame-interval", i9);
            createVideoFormat.setInteger("channel-count", 1);
            int ordinal = awa.ordinal();
            switch (ordinal) {
                case 1:
                case 2:
                    i6 = 8;
                    break;
                case 3:
                    i6 = 2;
                    break;
                default:
                    i6 = 1;
                    break;
            }
            createVideoFormat.setInteger("profile", i6);
            int i13 = 512;
            if (ordinal != 2) {
                i13 = 256;
            }
            createVideoFormat.setInteger("level", i13);
            if (aUk2 != C23624AUk.DEFAULT) {
                switch (aUk2.ordinal()) {
                    case 1:
                        i7 = 2;
                        break;
                    case 2:
                        i7 = 0;
                        break;
                    default:
                        i7 = -1;
                        break;
                }
                createVideoFormat.setInteger(HardwareVideoEncoder.KEY_BITRATE_MODE, i7);
            }
            C23983Ael.A03(A03, "Trying to get video encoder for profile: %s, bitrate mode: %s, format: %s", awa.name(), aUk2.name(), createVideoFormat.toString());
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(createVideoFormat.getString("mime"));
            createEncoderByType.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            return createEncoderByType;
        } catch (IOException e) {
            throw new RuntimeException("MediaCodec creation failed", e);
        } catch (Exception e2) {
            D75 d752 = d75;
            if (awa == AWA.HIGH31) {
                C23983Ael.A05(A03, e2, "Error getting videoencoder for profile: %s, bitrate mode: %s. Trying default high profile mode", awa.name(), aUk2.name());
                d75.A02 = true;
                awa2 = AWA.HIGH;
            } else {
                if (aUk2 != C23624AUk.DEFAULT) {
                    C23983Ael.A05(A03, e2, "Error getting videoencoder for profile: %s, bitrate mode: %s. Trying default mode", awa.name(), aUk2.name());
                    d75.A01 = true;
                } else if (awa != AWA.BASELINE) {
                    C23983Ael.A05(A03, e2, "Error getting videoencoder for profile: %s, bitrate mode: %s. Trying baseline", awa.name(), aUk2.name());
                    d75.A00 = true;
                    awa2 = AWA.BASELINE;
                } else {
                    throw new RuntimeException("MediaCodec creation failed", e2);
                }
                aUk2 = C23624AUk.DEFAULT;
            }
            return A00(d752, awa2, aUk2, i12, i11, i10, i8, i9);
        }
    }
}
