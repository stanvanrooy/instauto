package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: X.DD8 */
public final class DD8 extends DDK implements C29868DEd {
    public C29023Cqb[] A00;
    public DDK[] A01;
    public byte[] A02;
    public String[] A03;

    public final void A00(DDT ddt) {
        if (ddt.A02 == null) {
            ddt.A02 = new ArrayList();
        }
        ddt.A02.add(this);
        C29023Cqb[] cqbArr = this.A00;
        if (cqbArr != null) {
            for (C29023Cqb cqb : cqbArr) {
                if (ddt.A01 == null) {
                    ddt.A01 = new ArrayList();
                }
                ddt.A01.add(cqb);
            }
        }
        byte[] bArr = this.A02;
        if (bArr != null) {
            byte[] bArr2 = ddt.A03;
            if (bArr2 != null) {
                int length = bArr.length;
                int length2 = bArr2.length;
                int i = 0;
                if (length > length2) {
                    while (i < length2) {
                        byte b = bArr[i];
                        byte b2 = bArr2[i];
                        if (b <= b2) {
                            b = b2;
                        }
                        bArr[i] = b;
                        i++;
                    }
                } else if (length < length2) {
                    while (i < length) {
                        byte b3 = bArr[i];
                        byte b4 = bArr2[i];
                        if (b3 <= b4) {
                            b3 = b4;
                        }
                        bArr2[i] = b3;
                        i++;
                    }
                }
            }
            ddt.A03 = bArr;
        }
        DDK[] ddkArr = this.A01;
        if (ddkArr != null) {
            for (DDK ddk : ddkArr) {
                ((DD8) ddk).A00(ddt);
            }
        }
        ((C29843DDe) this.A02).A01(this, ddt, this.A03);
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }

    public final void ABR(ByteBuffer byteBuffer, int i) {
        C29868DEd dEd;
        Class<DDQ> cls = DDQ.class;
        int A002 = DD7.A00(byteBuffer, i, 0);
        if (A002 != 0) {
            dEd = cls.newInstance();
            dEd.ABR(byteBuffer, A002);
        } else {
            dEd = null;
        }
        DDQ ddq = (DDQ) dEd;
        if (ddq != null) {
            this.A03 = ddq;
            float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            int A003 = DD7.A00(byteBuffer, i, 1);
            if (A003 != 0) {
                f = byteBuffer.getFloat(A003);
            }
            this.A01 = f;
            float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            int A004 = DD7.A00(byteBuffer, i, 2);
            if (A004 != 0) {
                f2 = byteBuffer.getFloat(A004);
            }
            this.A00 = f2;
            C29846DDh dDh = (C29846DDh) DD7.A01(byteBuffer, i, 4, C29843DDe.class);
            if (dDh != null) {
                this.A02 = dDh;
                this.A00 = (C29023Cqb[]) DD7.A05(byteBuffer, i, 5, DD6.class);
                this.A01 = (DDK[]) DD7.A05(byteBuffer, i, 6, DD8.class);
                this.A03 = DD7.A06(byteBuffer, i, 7);
                this.A02 = DD7.A03(byteBuffer, i, 9);
                this.A04 = (C29877DEm[]) DD7.A05(byteBuffer, i, 10, DDH.class);
                return;
            }
            throw new IllegalArgumentException("root layer cannot be null");
        }
        throw new IllegalArgumentException("size cannot be null");
    }
}
