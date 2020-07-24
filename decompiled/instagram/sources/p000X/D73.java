package p000X;

import android.media.MediaCodec;
import com.google.android.exoplayer2.Format;

/* renamed from: X.D73 */
public final class D73 extends Exception {
    public final D70 A00;
    public final D73 A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public static String A00(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }

    public D73(Format format, Throwable th, int i) {
        this("Decoder init failed: [" + i + "], " + format, th, format.A0S, false, (D70) null, AnonymousClass000.A0G("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_", "neg_", Math.abs(i)), (D73) null);
    }

    public D73(String str, Throwable th, String str2, boolean z, D70 d70, String str3, D73 d73) {
        super(str, th);
        this.A03 = str2;
        this.A04 = z;
        this.A00 = d70;
        this.A02 = str3;
        this.A01 = d73;
    }
}
