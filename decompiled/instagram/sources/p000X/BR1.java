package p000X;

/* renamed from: X.BR1 */
public enum BR1 {
    ACCELEROMETER_SENSOR(1),
    GYROSCOPE_SENSOR(4),
    MAGNETOMETER_SENSOR(2),
    GEOMAGNETIC_ROTATION_SENSOR(20),
    ORIENTATION_SENSOR(0),
    PROXIMITY_SENSOR(8),
    STEP_DETECTOR_SENSOR(18),
    LIGHT_SENSOR(5),
    BAROMETER_SENSOR(6),
    AMBIENT_TEMPERATURE_SENSOR(13),
    RELATIVE_HUMIDITY_SENSOR(12);
    
    public int A00;

    /* access modifiers changed from: public */
    BR1(int i) {
        this.A00 = i;
    }
}
