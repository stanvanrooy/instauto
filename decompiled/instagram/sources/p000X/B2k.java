package p000X;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: X.B2k */
public final class B2k {
    public final Context A00;
    public final AudioManager A01;
    public final C23686AXx A02;

    public final C25134B2l A00() {
        if (this.A02.AeQ() && this.A02.AeR()) {
            return C25134B2l.BLUETOOTH;
        }
        if (this.A01.isSpeakerphoneOn()) {
            return C25134B2l.SPEAKERPHONE;
        }
        if (this.A01.isWiredHeadsetOn()) {
            return C25134B2l.HEADSET;
        }
        return C25134B2l.EARPIECE;
    }

    public B2k(Context context, AudioManager audioManager, C23686AXx aXx) {
        this.A00 = context;
        this.A01 = audioManager;
        this.A02 = aXx;
    }
}
