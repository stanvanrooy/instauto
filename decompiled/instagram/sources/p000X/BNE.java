package p000X;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Process;

/* renamed from: X.BNE */
public final class BNE extends BOA {
    public final BluetoothAdapter A00;

    public BNE(Context context, BQH bqh) {
        super(context, bqh);
        BluetoothAdapter bluetoothAdapter;
        if (context.checkPermission("android.permission.BLUETOOTH", Process.myPid(), Process.myUid()) == 0) {
            bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        } else {
            bluetoothAdapter = null;
        }
        this.A00 = bluetoothAdapter;
    }
}
