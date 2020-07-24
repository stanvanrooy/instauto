package p000X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: X.13l  reason: invalid class name and case insensitive filesystem */
public abstract class C241413l implements SensorEventListener {
    public C241513m A00 = new C241513m();

    public abstract void A00();

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (r7.A02 > 65.214226f) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        if (r7.A02 < -65.214226f) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        r5.A01 = p000X.Constants.ZERO;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0083, code lost:
        r5.A01 = p000X.Constants.A0C;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008a, code lost:
        r5.A01 = p000X.Constants.ONE;
        r3 = r3 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002b  */
    public final void onSensorChanged(SensorEvent sensorEvent) {
        C241513m r5;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        C241513m r3 = this.A00;
        int A002 = r3.A02.A00();
        if (A002 == 0) {
            r3.A00 = sensorEvent.timestamp + 1000000000;
        } else if ((sensorEvent.timestamp >= r3.A00 || A002 >= 32) && A002 >= 10) {
            AnonymousClass21o r2 = (AnonymousClass21o) r3.A02.A01();
            float[] fArr = sensorEvent.values;
            r2.A00 = fArr[0];
            r2.A01 = fArr[1];
            r2.A02 = fArr[2];
            r3.A02.A05(r2);
            r5 = this.A00;
            z = false;
            i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < r5.A02.A00()) {
                AnonymousClass21o r7 = (AnonymousClass21o) r5.A02.A02(i);
                float f = r7.A00;
                if (f <= 13.042845f && r7.A01 <= 65.214226f) {
                    z2 = false;
                }
                z2 = true;
                if (f >= -13.042845f && r7.A01 >= -65.214226f) {
                    z3 = false;
                }
                z3 = true;
                switch (r5.A01.intValue()) {
                    case 0:
                        if (!z2) {
                            if (!z3) {
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (!z3) {
                            if (z2) {
                                break;
                            }
                        }
                        break;
                    case 2:
                        if (!z2) {
                            if (z3) {
                                break;
                            }
                        }
                        break;
                }
            }
            if (i2 >= 2 && i3 >= 2) {
                z = true;
            }
            if (!z) {
                this.A00.A02.A04();
                A00();
                return;
            }
            return;
        }
        r3.A02.A05(new AnonymousClass21o(sensorEvent));
        r5 = this.A00;
        z = false;
        i = 0;
        int i22 = 0;
        int i32 = 0;
        while (i < r5.A02.A00()) {
        }
        z = true;
        if (!z) {
        }
    }
}
