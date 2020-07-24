package p000X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: X.DKK */
public final class DKK implements C29998DKz {
    public MediaCodec.BufferInfo A00;
    public MediaCodec A01;
    public MediaFormat A02;
    public final Handler A03;
    public final C30046DOa A04;
    public final DKP A05;
    public volatile Integer A06 = Constants.ZERO;

    public final void A03(byte[] bArr, int i, long j) {
        Exception e;
        int i2 = i;
        if (Looper.myLooper() != this.A03.getLooper()) {
            throw new IllegalStateException("inputData must be invoked on the same thread as the other methods");
        } else if (this.A06 == Constants.A0C) {
            if (i < 0) {
                try {
                    e = new IOException(String.format((Locale) null, "Failure to read input data, bytesRead=%d", new Object[]{Integer.valueOf(i)}));
                    i2 = 0;
                } catch (Exception e2) {
                    e = e2;
                }
            } else {
                e = null;
            }
            ByteBuffer[] inputBuffers = this.A01.getInputBuffers();
            int dequeueInputBuffer = this.A01.dequeueInputBuffer((long) this.A04.A01);
            if (dequeueInputBuffer >= 0) {
                ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                byteBuffer.clear();
                byteBuffer.put(bArr, 0, i2);
                this.A01.queueInputBuffer(dequeueInputBuffer, 0, i2, j, 0);
            }
            A01(this);
            if (e != null) {
                this.A05.B2g(e);
            }
        }
    }

    public static MediaFormat A00(C30046DOa dOa, boolean z) {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", dOa.A03, 1);
        createAudioFormat.setInteger("aac-profile", 1);
        createAudioFormat.setInteger(TraceFieldType.Bitrate, 64000);
        if (z) {
            createAudioFormat.setInteger("max-input-size", 0);
        } else {
            int i = dOa.A00;
            if (i > 0) {
                createAudioFormat.setInteger("max-input-size", i);
            }
        }
        createAudioFormat.setInteger("pcm-encoding", dOa.A02);
        return createAudioFormat;
    }

    public static void A01(DKK dkk) {
        DKP dkp;
        IOException iOException;
        try {
            ByteBuffer[] outputBuffers = dkk.A01.getOutputBuffers();
            while (true) {
                int dequeueOutputBuffer = dkk.A01.dequeueOutputBuffer(dkk.A00, 1000);
                if (dequeueOutputBuffer == -1) {
                    return;
                }
                if (dequeueOutputBuffer == -3) {
                    outputBuffers = dkk.A01.getOutputBuffers();
                } else if (dequeueOutputBuffer == -2) {
                    dkk.A02 = dkk.A01.getOutputFormat();
                } else if (dequeueOutputBuffer < 0) {
                    dkp = dkk.A05;
                    iOException = new IOException(String.format((Locale) null, C193418Ps.$const$string(161), new Object[]{Integer.valueOf(dequeueOutputBuffer)}));
                    break;
                } else {
                    ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                    if (byteBuffer == null) {
                        dkp = dkk.A05;
                        iOException = new IOException(String.format((Locale) null, "encoderOutputBuffer : %d was null", new Object[]{Integer.valueOf(dequeueOutputBuffer)}));
                        break;
                    }
                    byteBuffer.position(dkk.A00.offset).limit(dkk.A00.size);
                    dkk.A05.Az9(byteBuffer, dkk.A00);
                    dkk.A01.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((dkk.A00.flags & 4) != 0) {
                        return;
                    }
                }
            }
            dkp.B2g(iOException);
        } catch (Exception e) {
            dkk.A05.B2g(e);
        }
    }

    public final void A02(DKT dkt, Handler handler) {
        AnonymousClass0ZA.A0E(this.A03, new DKM(this, dkt, handler), 1625176851);
    }

    public DKK(C30046DOa dOa, DKP dkp, Handler handler) {
        this.A04 = dOa;
        this.A05 = dkp;
        this.A03 = handler;
    }

    public final MediaFormat ARM() {
        return this.A02;
    }
}
