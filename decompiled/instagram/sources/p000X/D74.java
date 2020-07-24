package p000X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.mediastreaming.opt.encoder.audio.AudioEncoderConfig;
import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.D74 */
public final class D74 {
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2.configure(r7, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
     */
    public static MediaCodec A00(AudioEncoderConfig audioEncoderConfig) {
        int i;
        int i2;
        int i3;
        RuntimeException runtimeException;
        int i4 = 2;
        if (audioEncoderConfig != null) {
            i = audioEncoderConfig.sampleRate;
            i3 = audioEncoderConfig.channels;
            i2 = audioEncoderConfig.bitRate;
            if (audioEncoderConfig.profile == C23622AUg.HE) {
                i4 = 5;
            }
        } else {
            AnonymousClass0DB.A0D("AudioEncoderSetup", "audioEncoderConfig is null. Using default values");
            i = 44100;
            i2 = 64000;
            i3 = 1;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "audio/mp4a-latm");
        mediaFormat.setInteger("aac-profile", i4);
        mediaFormat.setInteger("sample-rate", i);
        mediaFormat.setInteger("channel-count", i3);
        mediaFormat.setInteger(TraceFieldType.Bitrate, i2);
        int i5 = 0;
        MediaCodec mediaCodec = null;
        RuntimeException e = null;
        while (true) {
            if (i5 >= 3) {
                break;
            }
            try {
                mediaCodec = MediaCodec.createEncoderByType("audio/mp4a-latm");
                if (mediaCodec != null) {
                    try {
                        break;
                    } catch (IllegalStateException e2) {
                        runtimeException = new RuntimeException("MediaCodec audio encoder configure failed", e2);
                    }
                } else {
                    i5++;
                }
            } catch (IOException e3) {
                try {
                    runtimeException = new RuntimeException("MediaCodec creation failed", e3);
                    throw runtimeException;
                } catch (RuntimeException e4) {
                    e = e4;
                    mediaCodec = null;
                }
            }
        }
        if (mediaCodec != null) {
            return mediaCodec;
        }
        if (e == null) {
            e = new RuntimeException("Audio encoder failed to create");
        }
        throw e;
    }
}
