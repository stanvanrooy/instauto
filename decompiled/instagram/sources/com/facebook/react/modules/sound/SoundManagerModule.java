package com.facebook.react.modules.sound;

import android.media.AudioManager;
import com.facebook.fbreact.specs.NativeSoundManagerSpec;
import com.facebook.react.module.annotations.ReactModule;
import org.webrtc.MediaStreamTrack;
import p000X.A44;

@ReactModule(name = "SoundManager")
public class SoundManagerModule extends NativeSoundManagerSpec {
    public static final String NAME = "SoundManager";

    public String getName() {
        return NAME;
    }

    public void playTouchSound() {
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager != null) {
            audioManager.playSoundEffect(0);
        }
    }

    public SoundManagerModule(A44 a44) {
        super(a44);
    }
}
