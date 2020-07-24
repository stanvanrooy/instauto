package p000X;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.DNU */
public class DNU {
    public int A00;
    public C192588Li A01;
    public DO6 A02;
    public final int A03;
    public final ByteBuffer A04;

    public void A00(int i, int i2) {
        if (!(this instanceof C30042DNw)) {
            int position = this.A04.position();
            this.A04.position(i);
            GLES20.glBufferSubData(34962, i, i2, this.A04);
            this.A04.position(position);
            this.A00 = Math.max(i + i2, this.A00);
        }
    }

    public final void finalize() {
        C192588Li r2 = this.A01;
        r2.A02.add(new DOD(this.A03));
    }

    public DNU(DO6 do6) {
        this.A01 = do6.A00;
        int[] iArr = {0};
        GLES20.glGenBuffers(1, iArr, 0);
        this.A03 = iArr[0];
        this.A04 = ByteBuffer.allocateDirect(1048576).order(ByteOrder.nativeOrder());
        this.A00 = 0;
        GLES20.glBindBuffer(34962, this.A03);
        GLES20.glBufferData(34962, 1048576, (Buffer) null, 35048);
        GLES20.glBindBuffer(34962, 0);
        this.A02 = do6;
    }

    public DNU(ByteBuffer byteBuffer) {
        if (!byteBuffer.order().equals(ByteOrder.nativeOrder())) {
            AnonymousClass0DB.A0D("MappedBuffer", "MappedBuffer storage MUST be in native order");
        }
        int[] iArr = {0};
        GLES20.glGenBuffers(1, iArr, 0);
        this.A03 = iArr[0];
        this.A04 = null;
        this.A00 = 0;
    }
}
