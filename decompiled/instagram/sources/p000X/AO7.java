package p000X;

import android.view.View;
import com.instagram.video.live.livewith.fragment.IgLiveWithGuestFragment;

/* renamed from: X.AO7 */
public final class AO7 implements C34861fQ {
    public IgLiveWithGuestFragment A00;
    public final ANQ A01;

    public final void A00(boolean z) {
        View view = this.A01.A00;
        if (view.getVisibility() == 8) {
            return;
        }
        if (z) {
            C476624x.A08(true, this.A01.A00);
            return;
        }
        view.setVisibility(8);
    }

    public final void BA5(View view) {
        IgLiveWithGuestFragment igLiveWithGuestFragment = this.A00;
        if (igLiveWithGuestFragment != null && view == this.A01.A02) {
            igLiveWithGuestFragment.A0E.A01();
        }
    }

    public final boolean BR2(View view) {
        IgLiveWithGuestFragment igLiveWithGuestFragment = this.A00;
        if (igLiveWithGuestFragment == null) {
            return false;
        }
        ANQ anq = this.A01;
        if (view == anq.A00) {
            IgLiveWithGuestFragment.A00(igLiveWithGuestFragment);
            return true;
        } else if (view != anq.A01) {
            return true;
        } else {
            igLiveWithGuestFragment.A0E.A04(new C23499AOv(igLiveWithGuestFragment).A01(), igLiveWithGuestFragment.A0H);
            AnonymousClass7E0 r2 = igLiveWithGuestFragment.A09;
            AnonymousClass0WN.A01(r2.A0A).BcG(AnonymousClass7E0.A00(r2, Constants.A08));
            return true;
        }
    }

    public AO7(ANQ anq) {
        this.A01 = anq;
        C35651gi r1 = new C35651gi(anq.A00);
        r1.A05 = this;
        r1.A00();
        C35651gi r12 = new C35651gi(this.A01.A01);
        r12.A05 = this;
        r12.A00();
    }
}
