package com.facebook.mediastreaming.opt.muxer;

import android.media.MediaFormat;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.common.RealtimeSinceBootClock;
import com.facebook.mediastreaming.opt.common.StreamingHybridClassBase;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.Executors;
import p000X.Constants;
import p000X.AnonymousClass0CQ;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass0a4;
import p000X.C194408Ty;
import p000X.C29814DAy;
import p000X.C29815DAz;
import p000X.DB3;
import p000X.DB4;
import p000X.DB5;
import p000X.DB6;

public class AndroidPlatformMediaMuxerHybrid extends StreamingHybridClassBase {
    public static final Class TAG = AndroidPlatformMediaMuxerHybrid.class;
    public C29814DAy mCallback;
    public C29815DAz mImpl;

    static {
        AnonymousClass0Y1.A08("mediastreaming");
    }

    public void configure(TempFileCreator tempFileCreator, CodecMuxerFactory codecMuxerFactory) {
        boolean z = false;
        if (this.mImpl == null) {
            z = true;
        }
        AnonymousClass0a4.A0A(z);
        DB3 createMuxer = codecMuxerFactory.createMuxer();
        createMuxer.A03 = new DB6(this);
        this.mImpl = new C29815DAz(RealtimeSinceBootClock.A00, tempFileCreator, createMuxer);
        this.mCallback = new C29814DAy(this);
    }

    public int getMuxState() {
        switch (this.mImpl.A0L.intValue()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 0;
        }
    }

    public File getOutputFile() {
        C29815DAz dAz = this.mImpl;
        if (dAz.A0J != null && dAz.A0J.length() != 0) {
            return dAz.A0J;
        }
        AnonymousClass0DB.A04(C29815DAz.A0Q, "DVR file is not available or not created");
        return null;
    }

    public void muxAudioData(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j, MediaFormat mediaFormat) {
        int i5 = i;
        ByteBuffer byteBuffer2 = byteBuffer;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        this.mImpl.A04(byteBuffer2, i5, i6, i7, i8, j, mediaFormat, this.mCallback, Constants.ZERO);
    }

    public void muxVideoData(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j, MediaFormat mediaFormat) {
        int i5 = i;
        ByteBuffer byteBuffer2 = byteBuffer;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        this.mImpl.A04(byteBuffer2, i5, i6, i7, i8, j, mediaFormat, this.mCallback, Constants.ONE);
    }

    public void prepare(boolean z, boolean z2, int i, int i2, boolean z3, int i3) {
        C29815DAz dAz = this.mImpl;
        C29814DAy dAy = this.mCallback;
        dAz.A0C = z;
        dAz.A04 = (long) i;
        dAz.A00 = i2;
        try {
            if (dAz.A0J == null) {
                dAz.A0J = dAz.A0H.createTempFile("video_transcode", ".mp4", z2);
            }
            if (dAz.A0J != null) {
                C29815DAz.A00(dAz);
                dAz.A0D = z3;
                if (z3) {
                    dAz.A0B = Executors.newSingleThreadExecutor(new AnonymousClass0CQ("MediaMuxer"));
                    dAz.A01 = i3;
                }
                dAz.A0L = Constants.ONE;
                DB4 db4 = new DB4(!dAz.A0O, dAz.A0K);
                if (!db4.A01) {
                    dAy.A00.fireError(C194408Ty.MuxerError, "Failed to prepare muxer", db4.A00);
                    return;
                }
                return;
            }
            throw new RuntimeException("Unable to create output file.");
        } catch (Exception e) {
            C29815DAz.A01(dAz, e);
        }
    }

    public void stop() {
        Integer num;
        C29815DAz dAz = this.mImpl;
        synchronized (dAz) {
            if (dAz.A0N) {
                try {
                    DB3 db3 = dAz.A0G;
                    db3.A02.stop();
                    db3.A02.release();
                } catch (Exception e) {
                    C29815DAz.A01(dAz, e);
                    AnonymousClass0DB.A05(C29815DAz.A0Q, "LiveStreamMux Error stopping muxer ", e);
                }
            } else {
                AnonymousClass0DB.A04(C29815DAz.A0Q, "LiveStreamMux Never started muxer...Nothing to stop ");
            }
            if (!dAz.A0O) {
                num = Constants.A0Y;
            } else if (dAz.A0K instanceof DB5) {
                num = Constants.A0C;
            } else {
                num = Constants.A0N;
            }
            dAz.A0L = num;
            dAz.A0M = false;
            dAz.A0P = false;
            dAz.A0N = false;
            dAz.A02 = 0;
        }
    }

    public AndroidPlatformMediaMuxerHybrid(HybridData hybridData) {
        super(hybridData);
    }
}
