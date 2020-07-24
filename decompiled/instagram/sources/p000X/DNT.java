package p000X;

import android.graphics.Color;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: X.DNT */
public abstract class DNT extends DNV {
    public DNU A00;
    public float A01;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public FloatBuffer A05;
    public final int A06;
    public final int A07;
    public final float[] A08;
    public final /* synthetic */ DNW A09;

    public void A02() {
        if (!(this instanceof DNQ)) {
            DNR dnr = (DNR) this;
            DME AVx = dnr.A00.A02.AVx();
            float f = dnr.A01;
            AVx.A03 = f;
            dnr.A02 = Math.min(((int) Math.floor((double) (AVx.A02 / f))) + 1, dnr.A07);
            int i = dnr.A04;
            while (true) {
                int i2 = dnr.A02;
                if (i < i2) {
                    AVx.A00(i, dnr.A08);
                    float[] fArr = dnr.A08;
                    fArr[4] = (float) i;
                    fArr[5] = dnr.A01;
                    int i3 = dnr.A02;
                    fArr[6] = Float.intBitsToFloat(Color.argb(Color.alpha(i3), Color.blue(i3), Color.green(i3), Color.red(i3)));
                    dnr.A05.put(dnr.A08);
                    i++;
                } else {
                    dnr.A04 = i2;
                    return;
                }
            }
        } else {
            DNQ dnq = (DNQ) this;
            DME AVx2 = dnq.A00.A02.AVx();
            float f2 = dnq.A01;
            AVx2.A03 = f2;
            dnq.A02 = Math.min(((int) Math.floor((double) (AVx2.A02 / f2))) + 1, dnq.A07);
            int i4 = dnq.A04;
            while (true) {
                int i5 = dnq.A02;
                if (i4 < i5) {
                    AVx2.A00(i4, dnq.A08);
                    float[] fArr2 = dnq.A08;
                    fArr2[2] = (float) i4;
                    fArr2[3] = dnq.A01;
                    int i6 = dnq.A02;
                    fArr2[4] = Float.intBitsToFloat(Color.argb(Color.alpha(i6), Color.blue(i6), Color.green(i6), Color.red(i6)));
                    dnq.A05.put(dnq.A08, 0, 5);
                    i4++;
                } else {
                    dnq.A04 = i5;
                    return;
                }
            }
        }
    }

    public DNT(DNW dnw, int i) {
        this.A09 = dnw;
        this.A06 = i << 2;
        this.A08 = new float[Math.max(4, i)];
        DO6 do6 = (DO6) dnw.AIr().A00(DO6.class);
        DNU dnu = (DNU) do6.A01.poll();
        dnu = dnu == null ? new DNU(do6) : dnu;
        this.A00 = dnu;
        FloatBuffer asFloatBuffer = dnu.A04.asFloatBuffer();
        this.A05 = asFloatBuffer;
        this.A07 = asFloatBuffer.remaining() / i;
    }

    public static void A00(DNT dnt, int i, int i2) {
        if (i2 != 0) {
            dnt.A00.A00();
            DNW dnw = dnt.A09;
            AnonymousClass8U4 r1 = dnw.A02;
            r1.A00 = FloatBuffer.wrap(dnw.A07);
            r1.A01();
            DNW dnw2 = dnt.A09;
            AnonymousClass8U6 r2 = dnw2.A04;
            if (r2 != null) {
                r2.A02(dnt.A01 * dnw2.A00);
            }
            DNW dnw3 = dnt.A09;
            AnonymousClass8U6 r12 = dnw3.A03;
            if (r12 != null) {
                r12.A02(dnw3.A00);
            }
            AnonymousClass8U3 r6 = dnt.A09.A05;
            if (r6 != null) {
                int i3 = dnt.A02;
                r6.A02(((float) Color.red(i3)) / 255.0f, ((float) Color.green(i3)) / 255.0f, ((float) Color.blue(i3)) / 255.0f, dnt.A00);
            }
            dnt.A09.A01.A02();
            GLES20.glBindBuffer(34962, dnt.A00.A03);
            dnt.A09.A04.A00();
            DNU dnu = dnt.A00;
            int i4 = dnt.A06;
            dnu.A00(i * i4, i4 * i2);
            GLES20.glDrawArrays(0, i, i2);
            GLES20.glBindBuffer(34962, 0);
            dnt.A09.A04.A01();
        }
    }

    public final void A9j(DMK dmk) {
        this.A09.A02.Bhj(dmk);
        A02();
    }

    public final void ADG(DMK dmk) {
        this.A09.A02.Bhj(dmk);
        this.A09.A02.A9C(dmk.A00);
        A02();
        GLES20.glBindBuffer(34962, this.A00.A03);
        DNU dnu = this.A00;
        int i = this.A03;
        int i2 = this.A06;
        dnu.A00(i * i2, (this.A02 - i) * i2);
        GLES20.glBindBuffer(34962, 0);
        DNU dnu2 = this.A00;
        ByteBuffer asReadOnlyBuffer = dnu2.A04.asReadOnlyBuffer();
        asReadOnlyBuffer.rewind();
        asReadOnlyBuffer.limit(dnu2.A00);
        ByteBuffer order = ByteBuffer.allocateDirect(dnu2.A00).order(ByteOrder.nativeOrder());
        order.put(asReadOnlyBuffer);
        order.rewind();
        C30042DNw dNw = new C30042DNw(order);
        DNU dnu3 = this.A00;
        DO6 do6 = dnu3.A02;
        if (do6 != null) {
            do6.A01.add(dnu3);
        }
        this.A00 = dNw;
        this.A05 = null;
    }

    public final void BqC(DMK dmk) {
        this.A09.A02.BpV(dmk);
        A02();
    }

    public final void A01(C30030DNi dNi) {
        super.A01(dNi);
        this.A01 = dNi.AWQ() * this.A09.A00;
    }
}
