package p000X;

import com.facebook.C0003R;
import com.instagram.business.instantexperiences.p028ui.InstantExperiencesAutofillBar;

/* renamed from: X.B1G */
public final class B1G implements Runnable {
    public final /* synthetic */ C25114B1k A00;

    public B1G(C25114B1k b1k) {
        this.A00 = b1k;
    }

    public final void run() {
        C25114B1k b1k = this.A00;
        InstantExperiencesAutofillBar instantExperiencesAutofillBar = b1k.A01.A00;
        if (instantExperiencesAutofillBar != null) {
            C56142c0 r4 = new C56142c0(b1k.getActivity(), new AnonymousClass95U((CharSequence) b1k.getResources().getString(C0003R.string.instant_experiences_from_your_fb_profile)));
            r4.A05 = C56162c2.ABOVE_ANCHOR;
            r4.A01(0, this.A00.getResources().getDimensionPixelSize(C0003R.dimen.instant_experiences_tooltip_offset), true, instantExperiencesAutofillBar);
            r4.A07 = C56172c3.A05;
            r4.A09 = true;
            r4.A00().A05();
            C25114B1k b1k2 = this.A00;
            b1k2.A04 = true;
            C25116B1m.A01(b1k2.A03).A04(this.A00.A00, Constants.A0E);
        }
    }
}
