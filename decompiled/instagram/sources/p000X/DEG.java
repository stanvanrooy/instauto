package p000X;

import android.media.MediaPlayer;

/* renamed from: X.DEG */
public final class DEG implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ C29838DCz A00;

    public DEG(C29838DCz dCz) {
        this.A00 = dCz;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C29838DCz dCz = this.A00;
        MediaPlayer mediaPlayer2 = dCz.A01;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            dCz.A01 = null;
        }
    }
}
