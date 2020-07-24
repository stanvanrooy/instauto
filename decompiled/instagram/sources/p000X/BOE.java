package p000X;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import org.json.JSONObject;

/* renamed from: X.BOE */
public final class BOE implements BOT {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;

    public final boolean AfK(Object obj) {
        BOE boe = (BOE) obj;
        String str = this.A05;
        if (((str == null && boe.A05 == null) || str.equals(boe.A05)) && this.A03 == boe.A03 && this.A04 == boe.A04 && this.A00 == boe.A00 && this.A01 == boe.A01 && this.A02 == boe.A02) {
            return true;
        }
        return false;
    }

    public final int Boo() {
        String str = this.A05;
        int i = 0;
        if (str != null) {
            i = 1 + str.length();
        }
        return i + 6 + 5 + 6 + 7 + 6;
    }

    public final JSONObject BrR() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("n", this.A05);
        jSONObject.put("st", this.A03);
        jSONObject.put("t", this.A04);
        jSONObject.put("dc", this.A00);
        jSONObject.put("mdc", this.A01);
        jSONObject.put("se", this.A02);
        return jSONObject;
    }

    public BOE(BluetoothDevice bluetoothDevice) {
        this.A05 = bluetoothDevice.getName();
        this.A03 = bluetoothDevice.getBondState();
        this.A04 = bluetoothDevice.getType();
        this.A00 = bluetoothDevice.getBluetoothClass().getDeviceClass();
        this.A01 = bluetoothDevice.getBluetoothClass().getMajorDeviceClass();
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        int i = 0;
        for (int i2 = 0; i2 < 31; i2++) {
            int i3 = 1 << i2;
            if (bluetoothClass.hasService(i3)) {
                i |= i3;
            }
        }
        this.A02 = i;
    }
}
