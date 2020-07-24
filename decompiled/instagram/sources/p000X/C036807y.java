package p000X;

import android.hardware.Sensor;
import android.os.Build;

/* renamed from: X.07y  reason: invalid class name and case insensitive filesystem */
public final class C036807y {
    public static boolean A00(Sensor sensor) {
        if (Build.VERSION.SDK_INT < 21 || !sensor.isWakeUpSensor()) {
            return false;
        }
        return true;
    }
}
