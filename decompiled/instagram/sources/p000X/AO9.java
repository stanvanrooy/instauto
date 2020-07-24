package p000X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.C0003R;

/* renamed from: X.AO9 */
public final class AO9 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final C18750sM A04;
    public final C18750sM A05;
    public final C18750sM A06 = C18730sK.A00(new APK(this));
    public final AnonymousClass79M A07;
    public final C23470ANr A08;

    public final void A01() {
        C476624x.A09(false, (ImageView) this.A04.getValue());
    }

    public AO9(View view, C23470ANr aNr, AnonymousClass79M r5) {
        C13150hy.A02(view, "view");
        C13150hy.A02(aNr, "audioInteractor");
        C13150hy.A02(r5, "liveBroadcastWaterfall");
        this.A08 = aNr;
        this.A07 = r5;
        Context context = view.getContext();
        C13150hy.A01(context, "view.context");
        this.A03 = context;
        this.A05 = C18730sK.A00(new C23517APn(view));
        C18750sM A002 = C18730sK.A00(new AnonymousClass70T(view));
        this.A04 = A002;
        C35651gi r1 = new C35651gi((ImageView) A002.getValue());
        r1.A05 = new C23496AOs(this);
        r1.A00();
    }

    public static final void A00(AO9 ao9, boolean z) {
        Integer num;
        if (ao9.A02 != z) {
            ao9.A02 = z;
            ao9.A07.A0B(AnonymousClass000.A0S("toggleAudioOnly: ", z));
            ao9.A07.A0E = z;
            if (ao9.A02) {
                if (!((C72733Gu) ao9.A05.getValue()).A02()) {
                    C35651gi r3 = new C35651gi(((C72733Gu) ao9.A05.getValue()).A01().findViewById(C0003R.C0005id.audio_only_off_button));
                    r3.A05 = new APJ(ao9);
                    r3.A00();
                }
                C476624x.A09(true, ((C72733Gu) ao9.A05.getValue()).A01());
                C476624x.A08(true, (ImageView) ao9.A04.getValue());
            } else {
                C476624x.A08(true, ((C72733Gu) ao9.A05.getValue()).A01());
                C476624x.A09(true, (ImageView) ao9.A04.getValue());
            }
            C23470ANr aNr = ao9.A08;
            if (z && aNr.A0A == Constants.A0C) {
                num = Constants.A0N;
            } else if (!z && aNr.A0A == Constants.A0N) {
                num = Constants.A0C;
            } else {
                return;
            }
            aNr.A05(num);
        }
    }

    public final void A02(boolean z) {
        if (z != this.A00) {
            this.A00 = z;
            this.A07.A0B(AnonymousClass000.A0S("toggleAudioMute: ", z));
            this.A07.A0D = z;
            ImageView imageView = (ImageView) this.A04.getValue();
            boolean z2 = this.A00;
            int i = C0003R.C0004drawable.microphone_on;
            if (z2) {
                i = C0003R.C0004drawable.microphone_off;
            }
            imageView.setImageResource(i);
            AQ5 aq5 = this.A08.A0g;
            aq5.A0L = z;
            ARK ark = aq5.A0B;
            if (ark != null) {
                ark.Bg3(z);
            }
        }
    }
}
