package p000X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.SystemClock;
import com.facebook.mediastreaming.opt.encoder.audio.AndroidPlatformAudioEncoderHybrid;
import com.facebook.mediastreaming.opt.encoder.audio.AudioEncoderConfig;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: X.D7k */
public final class D7k {
    public static final Class A08 = D7k.class;
    public int A00;
    public int A01;
    public int A02;
    public MediaCodec.BufferInfo A03;
    public MediaCodec A04;
    public MediaFormat A05;
    public AudioEncoderConfig A06;
    public final AndroidPlatformAudioEncoderHybrid A07;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:51|52|(4:54|55|59|(2:61|62))|63|64|(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0113, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0186, code lost:
        r0.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0194, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0197, code lost:
        p000X.AnonymousClass0DB.A03(A08, "audio_enc_exception_restart");
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x013d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x017c */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0186 A[Catch:{ Exception -> 0x018a }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013f A[SYNTHETIC] */
    public final void A00(ByteBuffer byteBuffer, int i, boolean z) {
        boolean z2;
        Throwable th;
        MediaCodec.BufferInfo bufferInfo;
        int i2;
        do {
            try {
                ByteBuffer[] inputBuffers = this.A04.getInputBuffers();
                ByteBuffer[] outputBuffers = this.A04.getOutputBuffers();
                int dequeueInputBuffer = this.A04.dequeueInputBuffer(-1);
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer byteBuffer2 = inputBuffers[dequeueInputBuffer];
                    byteBuffer2.clear();
                    byteBuffer2.put(byteBuffer.asReadOnlyBuffer());
                    this.A04.queueInputBuffer(dequeueInputBuffer, 0, i, SystemClock.elapsedRealtime() * 1000, 0);
                }
                if (z) {
                    this.A04.signalEndOfInputStream();
                }
                while (true) {
                    int dequeueOutputBuffer = this.A04.dequeueOutputBuffer(this.A03, 1000);
                    if (dequeueOutputBuffer != -1) {
                        if (dequeueOutputBuffer != -3) {
                            if (dequeueOutputBuffer != -2) {
                                if (dequeueOutputBuffer >= 0 && (i2 = bufferInfo.offset) >= 0 && (bufferInfo = this.A03).size >= 0) {
                                    ByteBuffer byteBuffer3 = outputBuffers[dequeueOutputBuffer];
                                    if (byteBuffer3 == null) {
                                        th = new RuntimeException(AnonymousClass000.A06("encoderOutputBuffer ", dequeueOutputBuffer, " was null"));
                                        break;
                                    }
                                    if ((bufferInfo.flags & 2) != 0) {
                                        bufferInfo.presentationTimeUs = 0;
                                    }
                                    Buffer position = byteBuffer3.position(i2);
                                    MediaCodec.BufferInfo bufferInfo2 = this.A03;
                                    position.limit(bufferInfo2.offset + bufferInfo2.size);
                                    long j = this.A03.presentationTimeUs / 1000;
                                    this.A07.onEncoded(byteBuffer3, byteBuffer3.position(), byteBuffer3.remaining(), j, j, this.A03.flags, this.A05);
                                    this.A04.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    if ((this.A03.flags & 4) != 0) {
                                        break;
                                    }
                                } else {
                                    if (dequeueOutputBuffer >= 0) {
                                        this.A04.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    }
                                    int i3 = this.A00 + 1;
                                    this.A00 = i3;
                                    if (i3 > 100) {
                                        StringBuilder sb = new StringBuilder("Audio encoder bad parameters ret=");
                                        sb.append(dequeueOutputBuffer);
                                        sb.append(" offs=");
                                        MediaCodec.BufferInfo bufferInfo3 = this.A03;
                                        sb.append(bufferInfo3.offset);
                                        sb.append(" sz=");
                                        sb.append(bufferInfo3.size);
                                        sb.append(" pts=");
                                        sb.append(bufferInfo3.presentationTimeUs);
                                        sb.append(" cnt=");
                                        sb.append(i3);
                                        th = new IllegalStateException(sb.toString());
                                        break;
                                    }
                                }
                            } else {
                                this.A05 = this.A04.getOutputFormat();
                            }
                        } else {
                            outputBuffers = this.A04.getOutputBuffers();
                        }
                    } else if (!z) {
                        break;
                    }
                }
                this.A02 = 0;
                return;
            } catch (Exception e) {
                AnonymousClass0DB.A05(A08, "handleAudioException/original", e);
                if (Build.VERSION.SDK_INT < 21 || !D8J.A00(e)) {
                    int i4 = this.A01 + 1;
                    this.A01 = i4;
                    AnonymousClass0DB.A08(A08, "audio_enc_exception_restart_count=%d", Integer.valueOf(i4));
                    if (this.A01 <= 5) {
                        try {
                            MediaCodec mediaCodec = this.A04;
                            if (mediaCodec != null) {
                                try {
                                    mediaCodec.flush();
                                } catch (Exception e2) {
                                    AnonymousClass0DB.A05(A08, "restartAudioEncoderOnError/flush", e2);
                                }
                                MediaCodec mediaCodec2 = this.A04;
                                if (mediaCodec2 != null) {
                                    mediaCodec2.stop();
                                    mediaCodec2.release();
                                }
                            }
                            MediaCodec A002 = D74.A00(this.A06);
                            this.A04 = A002;
                            if (A002 != null) {
                            }
                        } catch (Exception e3) {
                            AnonymousClass0DB.A05(A08, "restartAudioEncoderOnError", e3);
                        }
                        boolean z3 = false;
                        if (z3) {
                        }
                    }
                    z2 = false;
                    continue;
                } else {
                    if (this.A02 <= 100) {
                        AnonymousClass0DB.A03(A08, "audio_enc_exception_transient");
                        this.A02++;
                        z2 = true;
                        continue;
                    }
                    z2 = false;
                    continue;
                }
                if (!z2) {
                }
            }
        } while (!z2);
        this.A07.fireError(C194408Ty.AudioEncoderError, "Failed to drain audio encoder", e);
    }

    public D7k(AndroidPlatformAudioEncoderHybrid androidPlatformAudioEncoderHybrid) {
        AnonymousClass0a4.A06(androidPlatformAudioEncoderHybrid);
        this.A07 = androidPlatformAudioEncoderHybrid;
    }
}
