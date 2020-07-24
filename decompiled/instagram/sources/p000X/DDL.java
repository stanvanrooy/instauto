package p000X;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.DDL */
public final class DDL implements C29871DEg, C29872DEh {
    public int A00 = 0;
    public float[] A01;

    public final void ABl(ByteBuffer byteBuffer, int i) {
        float[] A05 = C29825DCj.A05(byteBuffer, i, 0);
        this.A01 = A05;
        if (A05 != null) {
            this.A00 = A05.length;
        }
    }

    public final float[] A00() {
        float[] fArr = this.A01;
        if (fArr == null) {
            return null;
        }
        int i = this.A00;
        if (i == fArr.length) {
            return fArr;
        }
        return Arrays.copyOfRange(fArr, 0, i);
    }

    public final /* bridge */ /* synthetic */ Object Ado(Object obj, Object obj2, float f) {
        DDL ddl = (DDL) obj;
        DDL ddl2 = (DDL) obj2;
        if (!(this.A01 == null || ddl.A00() == null)) {
            if (ddl2.A00() == null || ddl2.A00().length < this.A01.length) {
                ddl2.A01 = new float[this.A01.length];
            }
            ddl2.A00 = this.A01.length;
            for (int i = 0; i < this.A01.length; i++) {
                float[] A002 = ddl2.A00();
                float f2 = ddl.A00()[i];
                float f3 = this.A01[i];
                A002[i] = ((f2 - f3) * f) + f3;
            }
        }
        return ddl2;
    }
}
