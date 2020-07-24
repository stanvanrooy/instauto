package p000X;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;

/* renamed from: X.D70 */
public final class D70 {
    public final MediaCodecInfo.CodecCapabilities A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public static boolean A00(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean A01(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public final Point A03(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean A04(int i) {
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        int i2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (!(codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null)) {
            String str = this.A02;
            String str2 = this.A01;
            int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((C25948Bd0.A00 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                if ("audio/ac3".equals(str2)) {
                    i2 = 6;
                } else {
                    i2 = 30;
                    if ("audio/eac3".equals(str2)) {
                        i2 = 16;
                    }
                }
                Log.w("MediaCodecInfo", AnonymousClass000.A0M("AssumedMaxChannelAdjustment: ", str, ", [", maxInputChannelCount, " to ", i2, "]"));
                maxInputChannelCount = i2;
            }
            if (maxInputChannelCount >= i) {
                return true;
            }
        }
        return false;
    }

    public final boolean A05(int i) {
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null || !audioCapabilities.isSampleRateSupported(i)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if ("mcv5a".equals(p000X.C25948Bd0.A01) == false) goto L_0x0028;
     */
    public final boolean A06(int i, int i2, double d) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (!(codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null)) {
            if (A02(videoCapabilities, i, i2, d)) {
                return true;
            }
            if (i < i2) {
                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.A02)) {
                    z = false;
                }
                z = true;
                if (!z || !A02(videoCapabilities, i2, i, d)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (A01(r6) == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        if (r1 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        if (A00(r6) == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r0 != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r6.isFeatureSupported(p000X.C193418Ps.$const$string(73)) == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r1 == false) goto L_0x002a;
     */
    public D70(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        D6U.A01(str);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = codecCapabilities;
        this.A05 = z;
        boolean z6 = true;
        if (!z2 && codecCapabilities != null) {
            boolean z7 = C25948Bd0.A00 >= 19 ? true : z7;
            z7 = false;
            z4 = true;
        }
        z4 = false;
        this.A03 = z4;
        if (codecCapabilities != null) {
            boolean z8 = C25948Bd0.A00 >= 21 ? true : z8;
            z8 = false;
            z5 = true;
        }
        z5 = false;
        this.A07 = z5;
        if (!z3) {
            if (codecCapabilities != null) {
                boolean z9 = C25948Bd0.A00 >= 21 ? true : z9;
                z9 = false;
            }
            z6 = false;
        }
        this.A06 = z6;
        this.A04 = C29735D6z.A05(str2);
    }

    public static boolean A02(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public final String toString() {
        return this.A02;
    }
}
