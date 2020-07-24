package p000X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.SystemClock;
import java.util.ArrayList;

/* renamed from: X.BOD */
public final class BOD implements C25584BQq {
    public final /* synthetic */ BNE A00;

    public BOD(BNE bne) {
        this.A00 = bne;
    }

    public final C25521BOf ADg() {
        BNE bne = this.A00;
        BluetoothAdapter bluetoothAdapter = bne.A00;
        if (bluetoothAdapter == null) {
            return bne.A05(Constants.ONE);
        }
        ArrayList arrayList = new ArrayList();
        for (BluetoothDevice boe : bluetoothAdapter.getBondedDevices()) {
            arrayList.add(new BOE(boe));
        }
        return new BOP(SystemClock.elapsedRealtime(), this.A00.A01(), arrayList, Constants.A0j);
    }
}
