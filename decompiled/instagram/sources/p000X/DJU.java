package p000X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;

/* renamed from: X.DJU */
public final class DJU implements C23686AXx {
    public BluetoothAdapter A00;
    public BluetoothHeadset A01;
    public C29972DJj A02;
    public DJV A03;
    public boolean A04;
    public final Context A05;
    public final AudioManager A06;

    public final void cleanup() {
        BluetoothHeadset bluetoothHeadset;
        this.A02 = null;
        if (this.A04) {
            if (this.A06.isBluetoothScoOn()) {
                this.A06.setBluetoothScoOn(false);
            }
            this.A06.stopBluetoothSco();
            this.A04 = false;
        }
        try {
            DJV djv = this.A03;
            if (djv != null) {
                this.A05.unregisterReceiver(djv);
                this.A03 = null;
            }
        } catch (IllegalArgumentException unused) {
        }
        BluetoothAdapter bluetoothAdapter = this.A00;
        if (!(bluetoothAdapter == null || (bluetoothHeadset = this.A01) == null)) {
            bluetoothAdapter.closeProfileProxy(1, bluetoothHeadset);
        }
        this.A01 = null;
        this.A00 = null;
    }

    public final boolean AeQ() {
        if (!(this.A00 == null || this.A01 == null)) {
            boolean z = false;
            if (C019000b.A01(this.A05, "android.permission.BLUETOOTH") == 0) {
                z = true;
            }
            if (!z || this.A01.getConnectedDevices().size() <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean BrW(boolean z) {
        this.A06.isBluetoothScoOn();
        if (z) {
            if (AeQ()) {
                this.A06.startBluetoothSco();
                this.A06.setMode(2);
                this.A04 = true;
            } else {
                this.A04 = false;
            }
        } else if (this.A04) {
            if (this.A06.isBluetoothScoOn()) {
                this.A06.setBluetoothScoOn(false);
            }
            this.A06.stopBluetoothSco();
            this.A04 = false;
        }
        return this.A04;
    }

    public DJU(Context context, AudioManager audioManager) {
        this.A05 = context;
        this.A06 = audioManager;
    }

    public final void AdW(C29972DJj dJj) {
        cleanup();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.A00 = defaultAdapter;
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            this.A00 = null;
        } else {
            this.A00.getProfileProxy(this.A05, new DJY(this), 1);
        }
        if (this.A03 == null) {
            this.A03 = new DJV(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            this.A05.registerReceiver(this.A03, intentFilter);
        }
        this.A02 = dJj;
    }

    public final boolean AeR() {
        return this.A04;
    }
}
