package p000X;

import android.graphics.Rect;
import java.nio.ByteBuffer;

/* renamed from: X.DC0 */
public final class DC0 {
    public final int A00;
    public final int A01;
    public final Rect A02;
    public final DC2 A03;
    public final DC2 A04;
    public final DBz A05;
    public final ByteBuffer A06;

    public DC0(DBz dBz, ByteBuffer byteBuffer, DC2 dc2, DC2 dc22, Rect rect, int i, int i2) {
        this.A05 = dBz;
        this.A06 = byteBuffer;
        this.A04 = dc2;
        this.A03 = dc22;
        this.A02 = rect;
        this.A00 = i;
        this.A01 = i2;
    }
}
