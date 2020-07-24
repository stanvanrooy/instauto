package p000X;

import android.media.MediaCodec;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.DLG */
public final class DLG {
    public double A00 = 1.0d;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public ByteBuffer A05;
    public final List A06;

    public final boolean A00() {
        boolean z;
        boolean z2 = !this.A06.isEmpty();
        for (DLH dlh : this.A06) {
            synchronized (dlh) {
                z = dlh.A06;
                try {
                    if (dlh.A06) {
                        z = dlh.A01.BqI();
                    }
                } finally {
                    dlh.A06 = false;
                    dlh.A07 = true;
                }
            }
            z2 &= z;
        }
        return z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    public final boolean A01(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        long j;
        boolean z;
        MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
        long j2 = bufferInfo2.presentationTimeUs;
        if (j2 < this.A03 || j2 < 0) {
            return false;
        }
        if (this.A00 != 1.0d) {
            if (this.A05 == null || byteBuffer.capacity() != this.A05.capacity()) {
                this.A05 = ByteBuffer.allocate(byteBuffer.capacity());
            }
            byteBuffer = this.A05;
        }
        long j3 = bufferInfo2.presentationTimeUs;
        this.A03 = j3;
        if (this.A01 == -1) {
            this.A01 = j3;
        }
        if (j3 != -1) {
            long j4 = this.A01;
            if (j4 != -1) {
                j = (long) (((double) (j3 - j4)) * this.A00);
                bufferInfo2.set(bufferInfo2.offset, bufferInfo2.size, j, bufferInfo2.flags);
                boolean z2 = true;
                for (DLH dlh : this.A06) {
                    if (!dlh.A06) {
                        DLH.A00(dlh);
                        DLH.A01(dlh);
                        if (!dlh.A06) {
                            z = false;
                            z2 &= z;
                        }
                    }
                    dlh.A01.BuT(byteBuffer, bufferInfo2);
                    z = true;
                    z2 &= z;
                }
                return z2;
            }
        }
        j = -1;
        bufferInfo2.set(bufferInfo2.offset, bufferInfo2.size, j, bufferInfo2.flags);
        boolean z22 = true;
        while (r3.hasNext()) {
        }
        return z22;
    }

    public final boolean A02(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        long j;
        MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
        int i = bufferInfo2.flags & 2;
        if (i == 0) {
            long j2 = bufferInfo2.presentationTimeUs;
            long j3 = this.A04;
            if (j2 <= j3 && j2 > 0) {
                return false;
            }
            if (i == 0 && this.A02 == -1) {
                this.A02 = j2;
            }
            if (j2 < 0) {
                Log.w("MuxerWrapperManager", String.format((Locale) null, "Video PTS negative - current pts %d last pts %d ", new Object[]{Long.valueOf(j2), Long.valueOf(j3)}));
                this.A04++;
            } else {
                this.A04 = j2;
            }
            long j4 = this.A04;
            if (j4 != -1) {
                long j5 = this.A02;
                if (j5 != -1) {
                    j = (long) (((double) (j4 - j5)) * this.A00);
                    bufferInfo2.set(bufferInfo2.offset, bufferInfo2.size, j, bufferInfo2.flags);
                }
            }
            j = -1;
            bufferInfo2.set(bufferInfo2.offset, bufferInfo2.size, j, bufferInfo2.flags);
        }
        boolean z2 = true;
        for (DLH dlh : this.A06) {
            if (!dlh.A06) {
                DLH.A00(dlh);
                DLH.A01(dlh);
                if (!dlh.A06) {
                    z = false;
                    z2 &= z;
                }
            }
            dlh.A01.Bui(byteBuffer, bufferInfo2);
            z = true;
            z2 &= z;
        }
        return z2;
    }

    public DLG(List list) {
        ArrayList arrayList = new ArrayList();
        this.A06 = arrayList;
        arrayList.addAll(list);
        this.A01 = -1;
        this.A03 = -1;
        this.A02 = -1;
        this.A04 = -1;
    }
}
