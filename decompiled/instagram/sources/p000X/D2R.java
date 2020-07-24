package p000X;

import com.facebook.video.heroplayer.service.HeroService;
import java.util.List;

/* renamed from: X.D2R */
public final class D2R implements Runnable {
    public final /* synthetic */ HeroService A00;
    public final /* synthetic */ D2I A01;

    public D2R(HeroService heroService, D2I d2i) {
        this.A00 = heroService;
        this.A01 = d2i;
    }

    public final void run() {
        D2I d2i = this.A01;
        if (d2i != null) {
            d2i.A00.evictAll();
            d2i.A01.evictAll();
        }
        List<C29654D3n> list = D3X.A01;
        synchronized (list) {
            for (C29654D3n d3n : list) {
                C29627D2k d2k = d3n.A01;
                d2k.A0O.clear();
                d2k.A07.release();
                d3n.A00.quit();
            }
            list.clear();
        }
        C29065CrI.A02.A02();
    }
}
