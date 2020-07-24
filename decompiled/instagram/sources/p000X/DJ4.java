package p000X;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import androidx.media.AudioAttributesCompat;

/* renamed from: X.DJ4 */
public final class DJ4 implements DJI {
    public AudioFocusRequest A00;
    public final AudioManager A01;

    public final int A2G() {
        AudioFocusRequest audioFocusRequest = this.A00;
        if (audioFocusRequest == null) {
            return 0;
        }
        return this.A01.abandonAudioFocusRequest(audioFocusRequest);
    }

    public final int BdF(DJ5 dj5) {
        AudioAttributes audioAttributes;
        if (dj5.A00 == null) {
            AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(dj5.A01);
            AudioAttributesCompat audioAttributesCompat = dj5.A04;
            if (audioAttributesCompat != null) {
                audioAttributes = (AudioAttributes) audioAttributesCompat.A00.AGG();
            } else {
                audioAttributes = null;
            }
            dj5.A00 = builder.setAudioAttributes(audioAttributes).setAcceptsDelayedFocusGain(false).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(dj5.A02, dj5.A03).build();
        }
        AudioFocusRequest audioFocusRequest = dj5.A00;
        this.A00 = audioFocusRequest;
        return this.A01.requestAudioFocus(audioFocusRequest);
    }

    public DJ4(AudioManager audioManager) {
        this.A01 = audioManager;
    }
}
