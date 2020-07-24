package p000X;

import org.json.JSONObject;

/* renamed from: X.0gV  reason: invalid class name and case insensitive filesystem */
public final class C12290gV {
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03 = 0;
    public int A04;
    public int A05 = 0;
    public int A06 = 0;
    public boolean A07 = false;
    public boolean A08 = false;
    public boolean A09 = false;
    public int[] A0A = {-1, -1};
    public int[] A0B = {-1, -1};
    public int[] A0C = {-1, -1};
    public int[] A0D = {-1, -1};
    public int A0E = 0;
    public int A0F = 0;

    private boolean A00(int[] iArr, int i) {
        int i2;
        int i3;
        this.A0E = i;
        if (iArr == null) {
            i2 = 2;
        } else {
            int i4 = iArr[0];
            if (i4 <= 0 || (i3 = iArr[1]) <= 0) {
                i2 = 3;
            } else {
                this.A0F = 4;
                if (i4 <= i3) {
                    return true;
                }
                return false;
            }
        }
        this.A0F = i2;
        return false;
    }

    public final int A01(double d) {
        int[] iArr = this.A0A;
        int i = iArr[1];
        int i2 = iArr[0];
        return (i2 + ((int) (((double) (i - i2)) * d))) / 1000;
    }

    public final int A02(double d) {
        int[] iArr = this.A0B;
        int i = iArr[1];
        int i2 = iArr[0];
        return (i2 + ((int) (((double) (i - i2)) * d))) / 1000;
    }

    public final int A03(double d) {
        int[] iArr = this.A0C;
        int i = iArr[1];
        int i2 = iArr[0];
        return (i2 + ((int) (((double) (i - i2)) * d))) / 1000;
    }

    public final boolean A04() {
        if (this.A02 <= 0) {
            this.A0F = 1;
            return false;
        } else if (!this.A07) {
            return A00(this.A0B, 0);
        } else {
            if (!A00(this.A0C, 1) || !A00(this.A0A, 2)) {
                return false;
            }
            return true;
        }
    }

    public final String toString() {
        if (!A04()) {
            return AnonymousClass000.A07("invalid_", this.A0F, "_", this.A0E);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cores", this.A02);
            jSONObject.put("is_biglittle", this.A07);
            if (this.A07) {
                jSONObject.put("little_freq_min", this.A0C[0]);
                jSONObject.put("little_freq_max", this.A0C[1]);
                jSONObject.put("big_freq_min", this.A0A[0]);
                jSONObject.put("big_freq_max", this.A0A[1]);
                jSONObject.put("little_cores", this.A03);
                jSONObject.put("big_cores", this.A00);
                int i = this.A05;
                if (i != 0) {
                    jSONObject.put("mid_cores", i);
                }
                jSONObject.put("little_index", this.A04);
                jSONObject.put("big_index", this.A01);
            } else {
                jSONObject.put("freq_min", this.A0B[0]);
                jSONObject.put("freq_max", this.A0B[1]);
            }
            jSONObject.put("prebuild", this.A09);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
