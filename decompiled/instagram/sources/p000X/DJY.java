package p000X;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;

/* renamed from: X.DJY */
public final class DJY implements BluetoothProfile.ServiceListener {
    public final /* synthetic */ DJU A00;

    public DJY(DJU dju) {
        this.A00 = dju;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        DJU dju = this.A00;
        dju.A01 = (BluetoothHeadset) bluetoothProfile;
        C29972DJj dJj = dju.A02;
        if (dJj != null) {
            dJj.BMU();
        }
    }

    public final void onServiceDisconnected(int i) {
        DJU dju = this.A00;
        dju.A01 = null;
        dju.A00 = null;
        C29972DJj dJj = dju.A02;
        if (dJj != null) {
            dJj.BMW();
        }
    }
}
