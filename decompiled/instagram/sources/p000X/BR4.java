package p000X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: X.BR4 */
public final class BR4 implements SensorEventListener {
    public final SensorEventListener A00;

    public final void onAccuracyChanged(Sensor sensor, int i) {
        try {
            this.A00.onAccuracyChanged(sensor, i);
        } catch (Throwable th) {
            C54802Yz.A00(th);
        }
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        try {
            this.A00.onSensorChanged(sensorEvent);
        } catch (Throwable th) {
            C54802Yz.A00(th);
        }
    }

    public BR4(SensorEventListener sensorEventListener) {
        this.A00 = sensorEventListener;
    }
}
