package p000X;

import android.hardware.Sensor;
import android.os.Build;
import org.json.JSONObject;

/* renamed from: X.BOZ */
public final class BOZ implements BOT {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final String A08;
    public final String A09;

    public final boolean AfK(Object obj) {
        boolean z;
        boolean z2;
        BOZ boz = (BOZ) obj;
        if (this.A03 == boz.A03 && this.A04 == boz.A04) {
            float abs = Math.abs(this.A00 - boz.A00);
            float f = BQH.A0K;
            if (abs < f && this.A05 == boz.A05) {
                String str = this.A08;
                String str2 = boz.A08;
                if (str == null && str2 == null) {
                    z = true;
                } else if (str == null || str2 == null) {
                    z = false;
                } else {
                    z = str.equals(str2);
                }
                if (z && Math.abs(this.A01 - boz.A01) < f && Math.abs(this.A02 - boz.A02) < f && this.A06 == boz.A06) {
                    String str3 = this.A09;
                    String str4 = boz.A09;
                    if (str3 == null && str4 == null) {
                        z2 = true;
                    } else if (str3 == null || str4 == null) {
                        z2 = false;
                    } else {
                        z2 = str3.equals(str4);
                    }
                    if (!z2 || this.A07 != boz.A07) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int Boo() {
        return 27 + this.A08.length() + 1 + 4 + 1 + 4 + 1 + 4 + 3 + this.A09.length() + 3 + 4;
    }

    public final JSONObject BrR() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.A03);
            jSONObject.put("mad", this.A04);
            jSONObject.put("mr", (double) this.A00);
            jSONObject.put("mid", this.A05);
            jSONObject.put("n", this.A08);
            jSONObject.put("p", (double) this.A01);
            jSONObject.put("r", (double) this.A02);
            jSONObject.put("t", this.A06);
            jSONObject.put("ven", this.A09);
            jSONObject.put("ver", this.A07);
            return jSONObject;
        } catch (Throwable th) {
            C54802Yz.A00(th);
            return jSONObject;
        }
    }

    public BOZ(Sensor sensor) {
        int id;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        if (i < 24) {
            id = 0;
        } else {
            id = sensor.getId();
        }
        this.A03 = id;
        this.A04 = i >= 21 ? sensor.getMaxDelay() : i2;
        this.A00 = sensor.getMaximumRange();
        this.A05 = sensor.getMinDelay();
        this.A08 = sensor.getName();
        this.A01 = sensor.getPower();
        this.A02 = sensor.getResolution();
        this.A06 = sensor.getType();
        this.A09 = sensor.getVendor();
        this.A07 = sensor.getVersion();
    }
}
