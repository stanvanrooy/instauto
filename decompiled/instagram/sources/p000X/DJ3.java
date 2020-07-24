package p000X;

import android.media.AudioManager;

/* renamed from: X.DJ3 */
public final class DJ3 implements DJI {
    public DJ5 A00;
    public final AudioManager A01;

    public final int A2G() {
        DJ5 dj5 = this.A00;
        if (dj5 == null) {
            return 0;
        }
        return this.A01.abandonAudioFocus(dj5.A02);
    }

    public final int BdF(DJ5 dj5) {
        this.A00 = dj5;
        return this.A01.requestAudioFocus(dj5.A02, dj5.A04.A00.AOy(), dj5.A01);
    }

    public DJ3(AudioManager audioManager) {
        this.A01 = audioManager;
    }
}
