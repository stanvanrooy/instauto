package p000X;

import android.media.MediaPlayer;

/* renamed from: X.DEF */
public final class DEF implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ DD0 A00;

    public DEF(DD0 dd0) {
        this.A00 = dd0;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        DD0 dd0 = this.A00;
        MediaPlayer mediaPlayer2 = dd0.A00;
        if (mediaPlayer2 == null) {
            return true;
        }
        mediaPlayer2.release();
        dd0.A00 = null;
        return true;
    }
}
