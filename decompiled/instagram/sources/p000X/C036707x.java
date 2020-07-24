package p000X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: X.07x  reason: invalid class name and case insensitive filesystem */
public final class C036707x {
    public final Sensor A00;
    public final SensorEventListener A01;

    public C036707x(SensorEventListener sensorEventListener, Sensor sensor) {
        this.A01 = sensorEventListener;
        this.A00 = sensor;
    }
}
