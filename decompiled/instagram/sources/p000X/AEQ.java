package p000X;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import com.facebook.cameracore.mediapipeline.dataproviders.volume.implementation.VolumeDataProviderImpl;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.AEQ */
public final class AEQ extends ContentObserver {
    public int A00;
    public boolean A01;
    public final AudioManager A02;
    public final Context A03;
    public final VolumeDataProviderImpl A04;

    public final boolean deliverSelfNotifications() {
        return false;
    }

    public AEQ(Handler handler, Context context, VolumeDataProviderImpl volumeDataProviderImpl) {
        super(handler);
        this.A03 = context;
        this.A04 = volumeDataProviderImpl;
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.A02 = audioManager;
        this.A00 = (audioManager.getStreamVolume(3) * 100) / 15;
        boolean z = this.A02.getRingerMode() == 0;
        this.A01 = z;
        this.A04.setData(this.A00, z);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        int streamVolume = (this.A02.getStreamVolume(3) * 100) / 15;
        boolean z2 = false;
        if (this.A02.getRingerMode() == 0) {
            z2 = true;
        }
        if (this.A00 != streamVolume || this.A01 != z2) {
            this.A00 = streamVolume;
            this.A01 = z2;
            this.A04.setData(streamVolume, z2);
        }
    }
}
