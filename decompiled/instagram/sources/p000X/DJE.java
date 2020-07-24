package p000X;

import android.media.AudioManager;

/* renamed from: X.DJE */
public final class DJE {
    public DJ5 A00;
    public final DJ6 A01;
    public final DJH A02;

    public DJE(AudioManager audioManager, DJH djh) {
        this.A01 = new DJ6(audioManager);
        this.A02 = djh;
    }
}
