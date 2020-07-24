package p000X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;

/* renamed from: X.DJT */
public final class DJT implements C23686AXx {
    public static final Class A0A = DJT.class;
    public int A00 = 0;
    public BluetoothHeadset A01;
    public C29972DJj A02;
    public BluetoothAdapter A03;
    public boolean A04;
    public final Context A05;
    public final BluetoothProfile.ServiceListener A06 = new DJZ(this);
    public final BroadcastReceiver A07 = new DJW(this);
    public final BroadcastReceiver A08 = new DJX(this);
    public final AudioManager A09;

    public final boolean AeQ() {
        boolean z = false;
        if (C019000b.A01(this.A05, "android.permission.BLUETOOTH") == 0) {
            z = true;
        }
        if (!z) {
            return false;
        }
        BluetoothAdapter bluetoothAdapter = this.A03;
        BluetoothHeadset bluetoothHeadset = this.A01;
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled() && this.A09.isBluetoothScoAvailableOffCall() && bluetoothHeadset != null && !bluetoothHeadset.getConnectedDevices().isEmpty();
    }

    public final void cleanup() {
        BluetoothHeadset bluetoothHeadset;
        BrW(false);
        try {
            this.A05.unregisterReceiver(this.A07);
        } catch (IllegalArgumentException unused) {
        }
        try {
            this.A05.unregisterReceiver(this.A08);
        } catch (IllegalArgumentException unused2) {
        }
        BluetoothAdapter bluetoothAdapter = this.A03;
        if (!(bluetoothAdapter == null || (bluetoothHeadset = this.A01) == null)) {
            bluetoothAdapter.closeProfileProxy(1, bluetoothHeadset);
        }
        this.A03 = null;
    }

    public final boolean AeR() {
        return this.A09.isBluetoothScoOn();
    }

    public final boolean BrW(boolean z) {
        boolean z2 = this.A04;
        if (z2 == z) {
            return z2;
        }
        if (z) {
            try {
                this.A09.startBluetoothSco();
                this.A09.setBluetoothScoOn(true);
            } catch (NullPointerException e) {
                AnonymousClass0DB.A05(A0A, "AudioManager#startBluetoothSco failed", e);
                return false;
            }
        } else {
            this.A09.setBluetoothScoOn(false);
            this.A09.stopBluetoothSco();
        }
        this.A04 = z;
        return z;
    }

    public DJT(Context context, AudioManager audioManager) {
        this.A05 = context;
        this.A09 = audioManager;
    }

    public final void AdW(C29972DJj dJj) {
        cleanup();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.A03 = defaultAdapter;
        if (defaultAdapter != null) {
            defaultAdapter.getProfileProxy(this.A05, this.A06, 1);
            this.A05.registerReceiver(this.A07, new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"));
            Intent registerReceiver = this.A05.registerReceiver(this.A08, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
            if (registerReceiver != null) {
                this.A00 = registerReceiver.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            }
        }
        this.A02 = dJj;
    }
}
