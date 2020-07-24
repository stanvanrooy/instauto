package p000X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: X.BRQ */
public final class BRQ implements SensorEventListener {
    public Sensor A00;
    public SensorManager A01;
    public final AV4 A02;
    public final BRR A03 = new BRR();

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009e, code lost:
        if (r3.A00 < ((r7 >> 1) + (r7 >> 2))) goto L_0x00a0;
     */
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        boolean z;
        BRS brs;
        BRS brs2;
        SensorEvent sensorEvent2 = sensorEvent;
        float[] fArr = sensorEvent2.values;
        boolean z2 = false;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        if (Math.sqrt((double) ((f * f) + (f2 * f2) + (f3 * f3))) > 13.0d) {
            z2 = true;
        }
        long j = sensorEvent2.timestamp;
        BRR brr = this.A03;
        long j2 = j - 500000000;
        while (true) {
            i = brr.A01;
            if (i < 4 || (brs2 = brr.A03) == null || j2 - brs2.A00 <= 0) {
                BRT brt = brr.A04;
                BRS brs3 = brt.A00;
            } else {
                if (brs2.A02) {
                    brr.A00--;
                }
                brr.A01 = i - 1;
                BRS brs4 = brs2.A01;
                brr.A03 = brs4;
                if (brs4 == null) {
                    brr.A02 = null;
                }
                BRT brt2 = brr.A04;
                brs2.A01 = brt2.A00;
                brt2.A00 = brs2;
            }
        }
        BRT brt3 = brr.A04;
        BRS brs32 = brt3.A00;
        if (brs32 == null) {
            brs32 = new BRS();
        } else {
            brt3.A00 = brs32.A01;
        }
        brs32.A00 = j;
        brs32.A02 = z2;
        brs32.A01 = null;
        BRS brs5 = brr.A02;
        if (brs5 != null) {
            brs5.A01 = brs32;
        }
        brr.A02 = brs32;
        if (brr.A03 == null) {
            brr.A03 = brs32;
        }
        int i2 = i + 1;
        brr.A01 = i2;
        if (z2) {
            brr.A00++;
        }
        if (!(brs32 == null || (brs = brr.A03) == null || j - brs.A00 < 250000000)) {
            z = true;
        }
        z = false;
        if (z) {
            while (true) {
                BRS brs6 = brr.A03;
                if (brs6 != null) {
                    brr.A03 = brs6.A01;
                    brs6.A01 = brt3.A00;
                    brt3.A00 = brs6;
                } else {
                    brr.A02 = null;
                    brr.A01 = 0;
                    brr.A00 = 0;
                    this.A02.AcS();
                    return;
                }
            }
        }
    }

    public BRQ(AV4 av4) {
        this.A02 = av4;
    }
}
