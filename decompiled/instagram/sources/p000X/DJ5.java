package p000X;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.media.AudioAttributesCompat;

/* renamed from: X.DJ5 */
public final class DJ5 {
    public AudioFocusRequest A00;
    public final int A01 = 2;
    public final AudioManager.OnAudioFocusChangeListener A02;
    public final Handler A03;
    public final AudioAttributesCompat A04;

    public DJ5(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat) {
        this.A02 = onAudioFocusChangeListener;
        this.A03 = handler;
        this.A04 = audioAttributesCompat;
    }
}
