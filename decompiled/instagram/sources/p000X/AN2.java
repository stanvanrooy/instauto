package p000X;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.AN2 */
public final class AN2 implements C24154Aj4 {
    public C23467ANo A00;
    public Integer A01;
    public Runnable A02;
    public final AN3 A03;

    public final void Bdu() {
    }

    public final void pause() {
    }

    public static void A00(AN2 an2) {
        Runnable runnable = an2.A02;
        if (runnable != null) {
            runnable.run();
            an2.A02 = null;
        }
    }

    public final void A01(Bundle bundle) {
        if (!this.A03.A01() || this.A01 == Constants.A0Y) {
            this.A01 = Constants.A0Y;
            AN3 an3 = this.A03;
            AnonymousClass1HD ANb = an3.A03.ANb(bundle, an3.A00);
            if (ANb != null) {
                new AnonymousClass2TH(an3.A02).A00().A06(an3.A01, ANb);
                return;
            }
            return;
        }
        this.A03.A00();
        this.A02 = new AN8(this, bundle);
    }

    public final void A02(Bundle bundle) {
        Integer num;
        Integer num2;
        if (!this.A03.A01() || (num2 = this.A01) == Constants.ONE || num2 == Constants.A0C) {
            if (!this.A03.A01() || this.A01 != Constants.ONE) {
                num = Constants.ONE;
            } else {
                num = Constants.A0C;
            }
            this.A01 = num;
            AN3 an3 = this.A03;
            if (an3.A03.ApR(bundle) != null) {
                C31201Wx.A01(an3.A01).A07(new AMW(an3));
                return;
            }
            return;
        }
        this.A03.A00();
        this.A02 = new ANA(this, bundle);
    }

    public final void A03(String str, String str2, String str3, String str4, String str5, AnonymousClass0RN r17) {
        String str6 = str2;
        String str7 = str;
        String str8 = str3;
        String str9 = str4;
        AnonymousClass0RN r10 = r17;
        String str10 = str5;
        if (!this.A03.A01() || this.A01 == Constants.A0N) {
            this.A01 = Constants.A0N;
            AN3 an3 = this.A03;
            AnonymousClass1HD AUQ = an3.A03.AUQ(str7, str6, str8, str9, str10, r10);
            if (AUQ != null) {
                C31221Wz A012 = C31201Wx.A01(an3.A01);
                A012.A07(new AN1(an3));
                A012.A0F(AUQ);
                return;
            }
            return;
        }
        this.A03.A00();
        this.A02 = new AN9(this, str7, str6, str8, str9, str10, r10);
    }

    public final void A04(HashMap hashMap) {
        if (!this.A03.A01() || this.A01 == Constants.ZERO) {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : hashMap.entrySet()) {
                bundle.putCharSequence((String) entry.getKey(), (CharSequence) entry.getValue());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("IgReactFragment.ARGUMENT_APP_KEY", "CompassionResourceApp");
            bundle2.putInt("IgReactFragment.ARGUMENT_ORIENTATION", 1);
            bundle2.putBoolean("IgReactFragment.ARGUMENT_IS_INLINE_NAV_BAR_ENABLED", true);
            bundle2.putBundle("IgReactFragment.ARGUMENT_INITIAL_PROPS", bundle);
            this.A01 = Constants.ZERO;
            AN3 an3 = this.A03;
            AnonymousClass1HD AUs = an3.A03.AUs(bundle2, (int) (((float) C06220Of.A06(an3.A01)) * 0.6666667f));
            if (AUs != null) {
                C31221Wz A012 = C31201Wx.A01(an3.A01);
                A012.A07(new AMJ(an3));
                A012.A0F(AUs);
                return;
            }
            return;
        }
        this.A03.A00();
        this.A02 = new AN7(this, hashMap);
    }

    public final void destroy() {
        this.A03.A00 = null;
    }

    public AN2(AN3 an3) {
        this.A03 = an3;
        an3.A00 = this;
    }
}
