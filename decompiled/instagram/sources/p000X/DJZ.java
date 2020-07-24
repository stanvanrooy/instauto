package p000X;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;

/* renamed from: X.DJZ */
public final class DJZ implements BluetoothProfile.ServiceListener {
    public final /* synthetic */ DJT A00;

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        if (i == 1) {
            DJT djt = this.A00;
            djt.A01 = (BluetoothHeadset) bluetoothProfile;
            C29972DJj dJj = djt.A02;
            if (dJj != null) {
                dJj.BMU();
            }
        }
    }

    public final void onServiceDisconnected(int i) {
        if (i == 1) {
            DJT djt = this.A00;
            djt.A01 = null;
            C29972DJj dJj = djt.A02;
            if (dJj != null) {
                dJj.BMW();
            }
        }
    }

    public DJZ(DJT djt) {
        this.A00 = djt;
    }
}
