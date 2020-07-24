package p000X;

import android.content.DialogInterface;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.AO8 */
public final class AO8 implements Runnable {
    public final /* synthetic */ AQ5 A00;
    public final /* synthetic */ Integer A01;

    public AO8(AQ5 aq5, Integer num) {
        this.A00 = aq5;
        this.A01 = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r7.A0A == p000X.Constants.A0Y) goto L_0x001c;
     */
    public final void run() {
        boolean z;
        AO9 ao9;
        int i;
        C23474ANw aNw;
        C23470ANr aNr = this.A00.A09;
        if (aNr != null) {
            Integer num = this.A01;
            if (num != Constants.ZERO && aNr.A00 > 60000) {
                z = true;
            }
            z = false;
            C23467ANo aNo = aNr.A08;
            if (aNo != null) {
                if (aNo.A05.A0Y.A0I()) {
                    switch (num.intValue()) {
                        case 0:
                            TextView textView = aNo.A0H.A04.A0B;
                            if (textView.getVisibility() == 0) {
                                C476624x.A08(true, textView);
                                break;
                            }
                            break;
                        case 1:
                            aNw = aNo.A0H;
                            i = -256;
                            break;
                        case 2:
                            aNw = aNo.A0H;
                            i = -65536;
                            break;
                    }
                    TextView textView2 = aNw.A04.A0B;
                    textView2.setTextColor(i);
                    C476624x.A09(true, textView2);
                }
                if (z && (ao9 = aNo.A08) != null && !ao9.A01) {
                    AnonymousClass2OA r5 = (AnonymousClass2OA) ao9.A06.getValue();
                    r5.A03 = ao9.A03.getResources().getString(C0003R.string.live_broadcast_audio_only_switch_prompt);
                    r5.A0U(true);
                    r5.A0V(true);
                    r5.A0S(ao9.A03.getResources().getString(C0003R.string.yes), new C23523APt(ao9), true, Constants.A0C);
                    r5.A0O(ao9.A03.getResources().getString(C0003R.string.f117no), (DialogInterface.OnClickListener) null);
                    r5.A03().show();
                    ao9.A01 = true;
                }
            }
        }
    }
}
