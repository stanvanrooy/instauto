package p000X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.facebook.react.uimanager.BaseViewManager;
import java.lang.ref.WeakReference;

/* renamed from: X.C4W */
public final class C4W implements SensorEventListener {
    public final /* synthetic */ C27235C4c A00;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        C27235C4c c4c;
        WeakReference weakReference;
        C27251C5d c5d;
        boolean z = false;
        int i = 0;
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        while (true) {
            c4c = this.A00;
            float[] fArr = c4c.A04;
            if (i >= fArr.length) {
                break;
            }
            float[] fArr2 = sensorEvent.values;
            float f2 = (fArr[i] * 0.8f) + (fArr2[i] * 0.19999999f);
            fArr[i] = f2;
            f += Math.abs(fArr2[i] - f2);
            i++;
        }
        if (f < 0.65f) {
            z = true;
        }
        if (!(z == c4c.A02 || (weakReference = c4c.A01) == null || (c5d = (C27251C5d) weakReference.get()) == null)) {
            C4X c4x = (C4X) c5d.A00.A0C.get();
            if (c5d.A00.A01 == Constants.A0u && c4x != null) {
                c4x.BkZ(z);
            }
        }
        this.A00.A02 = z;
    }

    public C4W(C27235C4c c4c) {
        this.A00 = c4c;
    }
}
