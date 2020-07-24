package p000X;

import android.app.Fragment;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.SystemClock;

/* renamed from: X.AV3 */
public final class AV3 extends Fragment implements AV4 {
    public C23627AUp A00;
    public int A01;
    public long A02;
    public long A03;
    public final BRQ A04 = new BRQ(this);

    public final void AcS() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.A02 < 500) {
            this.A01++;
        } else {
            this.A01 = 1;
        }
        this.A02 = elapsedRealtime;
        if (this.A01 >= 2 && getFragmentManager().findFragmentByTag("dump_debug_info_dialog_fragment") == null) {
            if (this.A02 - this.A03 <= 1000) {
                BRQ brq = this.A04;
                Sensor sensor = brq.A00;
                if (sensor != null) {
                    brq.A01.unregisterListener(brq, sensor);
                    AnonymousClass07N.A00.A06(brq, sensor);
                    brq.A01 = null;
                    brq.A00 = null;
                    return;
                }
                return;
            }
            this.A00.show(getFragmentManager(), "dump_debug_info_dialog_fragment");
            new Thread(new AV5(this)).start();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00 = new C23627AUp();
    }

    public final void onPause() {
        super.onPause();
        BRQ brq = this.A04;
        Sensor sensor = brq.A00;
        if (sensor != null) {
            brq.A01.unregisterListener(brq, sensor);
            AnonymousClass07N.A00.A06(brq, sensor);
            brq.A01 = null;
            brq.A00 = null;
        }
        if (getFragmentManager().findFragmentByTag("dump_debug_info_dialog_fragment") != null) {
            getFragmentManager().beginTransaction().remove(this.A00).commit();
        }
    }

    public final void onResume() {
        super.onResume();
        this.A03 = SystemClock.elapsedRealtime();
        SensorManager sensorManager = (SensorManager) getActivity().getSystemService("sensor");
        BRQ brq = this.A04;
        if (brq.A00 == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            brq.A00 = defaultSensor;
            if (defaultSensor != null) {
                brq.A01 = sensorManager;
                AnonymousClass0ZH.A01(sensorManager, brq, defaultSensor, 0);
            }
        }
    }
}
