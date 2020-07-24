package p000X;

import android.opengl.GLES20;

/* renamed from: X.DO3 */
public abstract class DO3 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final /* synthetic */ DNo A04;

    public void A00() {
        if (!(this instanceof DO2)) {
            DO1 do1 = (DO1) this;
            GLES20.glVertexAttribPointer(do1.A01, do1.A00, do1.A02, do1.A03, do1.A01.A00, do1.A00);
            GLES20.glEnableVertexAttribArray(do1.A01);
            return;
        }
        DO2 do2 = (DO2) this;
        GLES20.glVertexAttribPointer(do2.A01, do2.A00, do2.A02, do2.A03, do2.A01.A00, do2.A00);
        GLES20.glEnableVertexAttribArray(do2.A01);
    }

    public DO3(DNo dNo, AnonymousClass8UA r3, int i, int i2, boolean z) {
        this.A04 = dNo;
        this.A01 = r3.A00;
        this.A02 = i2;
        this.A00 = i;
        this.A03 = z;
    }
}
