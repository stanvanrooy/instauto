package p000X;

import android.os.Looper;
import com.facebook.video.heroplayer.service.HeroService;

/* renamed from: X.D3J */
public final class D3J implements Runnable {
    public final /* synthetic */ Looper A00;
    public final /* synthetic */ HeroService A01;

    public D3J(HeroService heroService, Looper looper) {
        this.A01 = heroService;
        this.A00 = looper;
    }

    public final void run() {
        if (this.A01.A0S.A15) {
            boolean z = this.A01.A0S.A1s;
            C29734D6y.A04("video/avc");
            C29734D6y.A04("audio/mp4a-latm");
            if (z) {
                C29734D6y.A04("video/x-vnd.on2.vp9");
            }
        }
        this.A00.quit();
    }
}
