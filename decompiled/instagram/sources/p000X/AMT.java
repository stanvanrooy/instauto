package p000X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.AMT */
public final class AMT implements CVA {
    public final /* synthetic */ C23467ANo A00;

    public AMT(C23467ANo aNo) {
        this.A00 = aNo;
    }

    public final void Acl() {
        this.A00.A09.A0H.A0F(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r3 == p000X.Constants.A0j) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0046, code lost:
        if (r3 == p000X.Constants.A0j) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0056, code lost:
        if (r3 == p000X.Constants.A0j) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r3 == p000X.Constants.A0j) goto L_0x0020;
     */
    public final void Bfo(boolean z) {
        boolean z2;
        Integer num;
        boolean z3;
        boolean z4;
        boolean z5;
        View view = this.A00.A09.A0H.A0K.A05.A05;
        if (view != null) {
            view.setActivated(z);
        }
        C23467ANo aNo = this.A00;
        if (z) {
            Integer num2 = aNo.A00;
            num = Constants.A0Y;
            if (num2 != num) {
                z4 = false;
            }
            z4 = true;
            if (!z4) {
                if (!(num2 == Constants.A0C || num2 == Constants.A0N)) {
                    z5 = false;
                }
                z5 = true;
                if (z5) {
                    num = Constants.A0j;
                }
                aNo.A00 = num;
                C23467ANo.A03(aNo);
            }
        }
        if (!z) {
            Integer num3 = aNo.A00;
            if (num3 != Constants.A0Y) {
                z2 = false;
            }
            z2 = true;
            if (z2) {
                num = Constants.A0C;
                if (!(num3 == num || num3 == Constants.A0N)) {
                    z3 = false;
                }
                z3 = true;
                if (!z3) {
                    num = Constants.ZERO;
                }
                aNo.A00 = num;
            }
        }
        C23467ANo.A03(aNo);
    }

    public final void Bok(int i) {
        String num;
        AMF amf = this.A00.A09;
        amf.A0H.A0F(true);
        if (i > 99) {
            num = AnonymousClass000.A0E(Integer.toString(99), "+");
        } else {
            num = Integer.toString(i);
        }
        TextView textView = amf.A0H.A0K.A05.A0A;
        if (textView != null) {
            textView.setText(num);
        }
    }
}
