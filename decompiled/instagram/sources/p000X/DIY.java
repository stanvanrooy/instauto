package p000X;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: X.DIY */
public final class DIY {
    public long A00;
    public long A01;
    public long A02;
    public final AudioTimestamp A03 = new AudioTimestamp();
    public final AudioTrack A04;

    public DIY(AudioTrack audioTrack) {
        this.A04 = audioTrack;
    }
}
