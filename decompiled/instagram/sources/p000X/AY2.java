package p000X;

import android.media.AudioManager;

/* renamed from: X.AY2 */
public final class AY2 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ AY0 A00;

    public final void onAudioFocusChange(int i) {
        AY4 ay4;
        if (i == -3 || i == -2 || i == -1) {
            AY4 ay42 = this.A00.A0B;
            if (ay42 != null) {
                ay42.AsW(i);
            }
        } else if ((i == 1 || i == 2) && (ay4 = this.A00.A0B) != null) {
            ay4.AsV();
        }
    }

    public AY2(AY0 ay0) {
        this.A00 = ay0;
    }
}
