package p000X;

import android.media.MediaPlayer;

/* renamed from: X.DEH */
public final class DEH implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ C29838DCz A00;

    public DEH(C29838DCz dCz) {
        this.A00 = dCz;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C29838DCz dCz = this.A00;
        MediaPlayer mediaPlayer2 = dCz.A01;
        if (mediaPlayer2 == null) {
            return true;
        }
        mediaPlayer2.release();
        dCz.A01 = null;
        return true;
    }
}
