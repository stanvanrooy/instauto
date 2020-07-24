package p000X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.webrtc.MediaCodecVideoEncoder;

/* renamed from: X.DIS */
public abstract class DIS implements DIV {
    public DIU A00;
    public ByteBuffer A01;
    public DIU A02;
    public DIU A03;
    public ByteBuffer A04;
    public boolean A05;
    public DIU A06;

    public void A05() {
        if (this instanceof DIM) {
            DIM dim = (DIM) this;
            if (dim.A05) {
                dim.A05 = false;
                int i = dim.A02;
                int i2 = dim.A00.A00;
                dim.A06 = new byte[(i * i2)];
                dim.A01 = dim.A03 * i2;
            } else {
                dim.A01 = 0;
            }
            dim.A00 = 0;
        } else if (this instanceof DIL) {
            DIL dil = (DIL) this;
            if (dil.A05) {
                DIU diu = dil.A00;
                int i3 = diu.A00;
                dil.A00 = i3;
                long j = (long) diu.A03;
                int i4 = ((int) ((150000 * j) / 1000000)) * i3;
                if (dil.A07.length != i4) {
                    dil.A07 = new byte[i4];
                }
                int i5 = ((int) ((MediaCodecVideoEncoder.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS * j) / 1000000)) * i3;
                dil.A02 = i5;
                if (dil.A08.length != i5) {
                    dil.A08 = new byte[i5];
                }
            }
            dil.A03 = 0;
            dil.A04 = 0;
            dil.A01 = 0;
            dil.A06 = false;
        } else if (this instanceof DIN) {
            DIN din = (DIN) this;
            din.A00 = din.A01;
        }
    }

    public void A06() {
        if (this instanceof DIM) {
            DIM dim = (DIM) this;
            if (dim.A05) {
                int i = dim.A00;
                if (i > 0) {
                    dim.A04 += (long) (i / dim.A00.A00);
                }
                dim.A00 = 0;
            }
        } else if (this instanceof DIL) {
            DIL dil = (DIL) this;
            int i2 = dil.A01;
            if (i2 > 0) {
                DIL.A01(dil, dil.A07, i2);
            }
            if (!dil.A06) {
                dil.A04 += (long) (dil.A02 / dil.A00);
            }
        }
    }

    public final void BYo() {
        this.A05 = true;
        A06();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004f, code lost:
        if (r2 == 1073741824) goto L_0x0051;
     */
    public DIU A03(DIU diu) {
        int i;
        boolean z;
        if (!(this instanceof DIM)) {
            if (this instanceof DIL) {
                DIL dil = (DIL) this;
                if (diu.A02 == 2) {
                    i = dil.A05;
                }
            } else if (this instanceof DIO) {
                int i2 = diu.A02;
                if (i2 == 3 || i2 == 2 || i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                    if (i2 != 2) {
                        return new DIU(diu.A03, diu.A01, 2);
                    }
                    return DIU.A04;
                }
            } else if (this instanceof DIK) {
                int i3 = diu.A02;
                if (i3 != Integer.MIN_VALUE) {
                    z = false;
                }
                z = true;
                if (z) {
                    if (z) {
                        return new DIU(diu.A03, diu.A01, 4);
                    }
                    return DIU.A04;
                }
            } else if (!(this instanceof DIN)) {
                return DIU.A04;
            } else {
                int[] iArr = ((DIN) this).A01;
                if (iArr != null) {
                    if (diu.A02 == 2) {
                        int i4 = diu.A01;
                        int length = iArr.length;
                        boolean z2 = false;
                        if (i4 != length) {
                            z2 = true;
                        }
                        int i5 = 0;
                        while (i5 < length) {
                            int i6 = iArr[i5];
                            if (i6 < i4) {
                                boolean z3 = false;
                                if (i6 != i5) {
                                    z3 = true;
                                }
                                z2 |= z3;
                                i5++;
                            }
                        }
                        if (z2) {
                            return new DIU(diu.A03, length, 2);
                        }
                    }
                }
                return DIU.A04;
            }
            throw new DIZ(diu);
        }
        DIM dim = (DIM) this;
        if (diu.A02 == 2) {
            dim.A05 = true;
            if (dim.A03 != 0) {
                return diu;
            }
            i = dim.A02;
        }
        throw new DIZ(diu);
        if (i == 0) {
            return DIU.A04;
        }
        return diu;
    }

    public final ByteBuffer A04(int i) {
        if (this.A04.capacity() < i) {
            this.A04 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.A04.clear();
        }
        ByteBuffer byteBuffer = this.A04;
        this.A01 = byteBuffer;
        return byteBuffer;
    }

    public final DIU A9H(DIU diu) {
        this.A02 = diu;
        DIU A032 = A03(diu);
        this.A03 = A032;
        if (!Ae3()) {
            return DIU.A04;
        }
        return A032;
    }

    public ByteBuffer ARL() {
        ByteBuffer byteBuffer = this.A01;
        this.A01 = DIV.A00;
        return byteBuffer;
    }

    public boolean Ae3() {
        if (this instanceof DIL) {
            return ((DIL) this).A05;
        }
        if (this.A03 != DIU.A04) {
            return true;
        }
        return false;
    }

    public boolean AfJ() {
        if (!this.A05 || this.A01 != DIV.A00) {
            return false;
        }
        return true;
    }

    public final void flush() {
        this.A01 = DIV.A00;
        this.A05 = false;
        this.A00 = this.A02;
        this.A06 = this.A03;
        A05();
    }

    public DIS() {
        ByteBuffer byteBuffer = DIV.A00;
        this.A04 = byteBuffer;
        this.A01 = byteBuffer;
        DIU diu = DIU.A04;
        this.A02 = diu;
        this.A03 = diu;
        this.A00 = diu;
        this.A06 = diu;
    }
}
