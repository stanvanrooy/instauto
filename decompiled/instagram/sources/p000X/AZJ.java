package p000X;

import org.webrtc.AudioSource;
import org.webrtc.AudioTrack;
import org.webrtc.MediaConstraints;

/* renamed from: X.AZJ */
public final /* synthetic */ class AZJ implements Runnable {
    public final /* synthetic */ AZK A00;

    public /* synthetic */ AZJ(AZK azk) {
        this.A00 = azk;
    }

    public final void run() {
        AZK azk = this.A00;
        if (azk.A04 == null) {
            AudioSource createAudioSource = azk.A08.createAudioSource(new MediaConstraints());
            AnonymousClass0a4.A06(createAudioSource);
            azk.A04 = createAudioSource;
        }
        if (azk.A05 == null) {
            AudioTrack createAudioTrack = azk.A08.createAudioTrack(azk.A09.mo50739id(), azk.A04);
            azk.A05 = createAudioTrack;
            createAudioTrack.setEnabled(!azk.A0F);
        }
        azk.A09.setTrack(azk.A05, false);
    }
}
