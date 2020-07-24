package p000X;

import android.media.AudioManager;
import android.os.Build;

/* renamed from: X.DJ6 */
public final class DJ6 {
    public final DJI A00;

    public DJ6(AudioManager audioManager) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.A00 = new DJ4(audioManager);
        } else {
            this.A00 = new DJ3(audioManager);
        }
    }
}
