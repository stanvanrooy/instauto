package p000X;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.util.Vector;

/* renamed from: X.DNo */
public class DNo {
    public final int A00;
    public final Vector A01 = new Vector();
    public final AnonymousClass8U1 A02;

    public final void A00() {
        for (int i = 0; i < this.A01.size(); i++) {
            ((DO3) this.A01.get(i)).A00();
        }
    }

    public final void A01() {
        for (int i = 0; i < this.A01.size(); i++) {
            GLES20.glDisableVertexAttribArray(((DO3) this.A01.get(i)).A01);
        }
    }

    public void A02(AnonymousClass8UA r15, int i, int i2, boolean z, int i3) {
        int i4 = i;
        AnonymousClass8UA r3 = r15;
        int i5 = i2;
        int i6 = i3;
        boolean z2 = z;
        if (!(this instanceof C30036DNq)) {
            this.A01.add(new DO2(this, r3, i4, i5, z2, i6));
            return;
        }
        C30036DNq dNq = (C30036DNq) this;
        ByteBuffer asReadOnlyBuffer = dNq.A00.asReadOnlyBuffer();
        asReadOnlyBuffer.position(i6);
        dNq.A01.add(new DO1(dNq, r15, i4, i5, z2, asReadOnlyBuffer));
    }

    public final void A03(String str, int i, int i2, boolean z, int i3) {
        AnonymousClass8UA r1 = (AnonymousClass8UA) this.A02.A01.get(str);
        if (r1 != null) {
            A02(r1, i, i2, z, i3);
        }
    }

    public DNo(AnonymousClass8U1 r2, int i) {
        this.A00 = i;
        this.A02 = r2;
    }
}
