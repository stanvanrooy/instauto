package p000X;

import android.graphics.Bitmap;

/* renamed from: X.DNW */
public class DNW extends AnonymousClass8UN {
    public float A00;
    public DO9 A01;
    public boolean A02;
    public boolean A03;
    public DNo A04;
    public final AnonymousClass8EG A05;

    public final C30037DNr AAf() {
        C30033DNl dnq;
        if (this.A03) {
            dnq = new DNR(this);
        } else {
            dnq = new DNQ(this);
        }
        dnq.A01(this);
        return dnq;
    }

    public float APd() {
        if (this instanceof C30039DNt) {
            return 120.0f;
        }
        if (this instanceof C30044DNy) {
            return 40.0f;
        }
        if (!(this instanceof DMJ)) {
            return 64.0f;
        }
        return 16.0f;
    }

    public float AQK() {
        if ((this instanceof C30039DNt) || (this instanceof C30044DNy)) {
            return 8.0f;
        }
        if (!(this instanceof DMJ)) {
            return 1.0f;
        }
        return 6.0f;
    }

    public final float AWQ() {
        DO9 do9 = this.A01;
        if (do9 == null) {
            return super.AWQ();
        }
        float f = (this.A03 * do9.A03) + do9.A02;
        float f2 = do9.A01;
        float f3 = do9.A00;
        if (f < f2) {
            return f2;
        }
        if (f > f3) {
            return f3;
        }
        return f;
    }

    public boolean Acr() {
        if (this instanceof C30039DNt) {
            return true;
        }
        boolean z = this instanceof C30044DNy;
        return false;
    }

    public void AdK(C192588Li r14) {
        DNo dNo;
        if (this.A06 == null) {
            super.AdK(r14);
            this.A00 = r14.A00.getResources().getDisplayMetrics().density;
            AnonymousClass8U1 r0 = this.A01;
            if (r0 != null) {
                AnonymousClass8UA r1 = (AnonymousClass8UA) r0.A01.get("aVelocity");
                boolean z = false;
                if (r1 != null) {
                    z = true;
                }
                this.A03 = z;
                if (z) {
                    dNo = new DNo(this.A01, 28);
                    dNo.A03("aPosition", 2, 5126, false, 0);
                    dNo.A03("aVelocity", 2, 5126, false, 8);
                    dNo.A03("aTime", 1, 5126, false, 16);
                    dNo.A03("aSize", 1, 5126, false, 20);
                    dNo.A03("aColor", 4, 5121, true, 24);
                } else {
                    dNo = new DNo(this.A01, 20);
                    dNo.A03("aPosition", 2, 5126, false, 0);
                    dNo.A03("aTime", 1, 5126, false, 8);
                    dNo.A03("aSize", 1, 5126, false, 12);
                    dNo.A03("aColor", 4, 5121, true, 16);
                }
                this.A04 = dNo;
                AnonymousClass8EG r02 = this.A05;
                if (r02 != null) {
                    r02.A01(r14);
                    this.A01.A03("sBrush", this.A05.A00);
                }
            }
        }
    }

    public float AK1() {
        return super.AK1();
    }

    public final boolean Afy() {
        return this.A02;
    }

    public final boolean isValid() {
        if (super.isValid()) {
            boolean z = false;
            if (this.A05.A00 != 0) {
                z = true;
            }
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public DNW(String str, int i, int i2, int i3) {
        super(str);
        this.A00 = i2;
        this.A01 = i;
        this.A05 = new AnonymousClass8EG(i3);
        this.A02 = new DML();
    }

    public DNW(String str, Bitmap bitmap) {
        super(str);
        AnonymousClass8EG r0;
        if (bitmap != null) {
            r0 = new AnonymousClass8EG(bitmap);
        } else {
            r0 = null;
        }
        this.A05 = r0;
        this.A02 = new DML();
    }
}
