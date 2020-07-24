package p000X;

import android.media.AudioManager;

/* renamed from: X.DJG */
public final class DJG implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ DJE A00;

    public final void onAudioFocusChange(int i) {
        if (i == -3 || i == -2) {
            this.A00.A02.BSb();
        } else if (i == -1) {
            this.A00.A02.BAL();
        } else if (i == 1) {
            this.A00.A02.B5f();
        }
    }

    public DJG(DJE dje) {
        this.A00 = dje;
    }
}
