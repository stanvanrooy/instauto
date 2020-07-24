package p000X;

import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* renamed from: X.DB1 */
public final class DB1 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ MediaFormat A03;
    public final /* synthetic */ C29814DAy A04;
    public final /* synthetic */ C29815DAz A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ ByteBuffer A07;

    public DB1(C29815DAz dAz, ByteBuffer byteBuffer, int i, int i2, long j, MediaFormat mediaFormat, Integer num, C29814DAy dAy) {
        this.A05 = dAz;
        this.A07 = byteBuffer;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j;
        this.A03 = mediaFormat;
        this.A06 = num;
        this.A04 = dAy;
    }

    public final void run() {
        C29815DAz dAz = this.A05;
        ByteBuffer byteBuffer = this.A07;
        C29815DAz.A02(dAz, byteBuffer, 0, byteBuffer.capacity(), this.A01, this.A00, this.A02, this.A03, this.A06, this.A04);
        this.A05.mPendingJobs.decrementAndGet();
    }
}
