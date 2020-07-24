package p000X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.common.util.JSONUtil;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.payments.checkout.model.CheckoutData;

/* renamed from: X.0pV  reason: invalid class name and case insensitive filesystem */
public final class C16990pV extends C17000pW {
    public C28408CgQ A00;
    public C112184sC A01;

    public final void A01(FragmentActivity fragmentActivity, CheckoutLaunchParams checkoutLaunchParams, AnonymousClass0C1 r10, Integer num) {
        A00(fragmentActivity, checkoutLaunchParams, r10, num, (AnonymousClass2TI) null, (C51312Ke) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00df, code lost:
        if (r8 != false) goto L_0x00f4;
     */
    private void A00(FragmentActivity fragmentActivity, CheckoutLaunchParams checkoutLaunchParams, AnonymousClass0C1 r12, Integer num, AnonymousClass2TI r14, C51312Ke r15) {
        C112204sE r1 = new C112204sE();
        r1.A02 = "checkout_init";
        r1.A00 = checkoutLaunchParams.A00;
        r1.A01 = checkoutLaunchParams.A01;
        r1.A03 = checkoutLaunchParams.A03;
        this.A01 = new C112184sC(r12, C17000pW.A01, new C112194sD(r1));
        if (((Boolean) AnonymousClass0L6.A02(r12, AnonymousClass0L7.PURX_NATIVE_CHECKOUT, "use_native_checkout", false, (AnonymousClass04H) null)).booleanValue()) {
            C52362Om r4 = new C52362Om(fragmentActivity, r12);
            if (this.A00 == null) {
                this.A00 = new C28408CgQ();
            }
            C223689kB r3 = new C223689kB();
            Bundle bundle = new Bundle();
            bundle.putParcelable("checkout_launch_param", checkoutLaunchParams);
            r3.setArguments(bundle);
            r4.A02 = r3;
            r4.A02();
            C112214sF r32 = new C112214sF();
            r32.A00.put("is_native", String.valueOf(true));
            this.A01.A00("checkout_module", "init", r32);
            return;
        }
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r12, AnonymousClass0L7.PURX_NATIVE_CHECKOUT, "use_native_checkoutinfo_load", false, (AnonymousClass04H) null)).booleanValue();
        bundle3.putBoolean("prefetch_checkout_info", booleanValue);
        if (booleanValue) {
            boolean booleanValue2 = ((Boolean) AnonymousClass9DN.A00(r12, new C05000Hl("enabled", AnonymousClass0L7.PREFETCH_CHECKOUT_INFO_FROM_BAG, false, (String[]) null, (AnonymousClass04H) null))).booleanValue();
            C223009j1 A002 = C223009j1.A00();
            if (num.equals(Constants.ZERO)) {
                boolean z = A002.A02;
                if (booleanValue2) {
                    C112214sF r6 = new C112214sF();
                    r6.A00.put("is_using_prefetched_data", String.valueOf(!z));
                    this.A01.A00("checkout_information", "api_init", r6);
                }
                if (!z) {
                }
            }
            C223679kA r33 = new C223679kA();
            r33.A00 = checkoutLaunchParams;
            C223009j1.A00().A01(new CheckoutData(r33), r12, fragmentActivity);
            bundle2.putBoolean("useNativeCheckoutInfoLoad", true);
        }
        bundle2.putString("checkoutConfiguration", checkoutLaunchParams.A02);
        bundle2.putString("igUserId", r12.A04());
        bundle2.putString("checkoutSessionId", checkoutLaunchParams.A00);
        bundle2.putString("riskFeatures", JSONUtil.A00(new BRE(fragmentActivity).A01).toString());
        C53832Un newReactNativeLauncher = C16920pO.getInstance().newReactNativeLauncher(r12);
        newReactNativeLauncher.BkI("IgPaymentsShoppingCheckoutRoute");
        newReactNativeLauncher.Bl2("payments_checkout");
        newReactNativeLauncher.Bl1(37355529);
        newReactNativeLauncher.Bl0(bundle3);
        newReactNativeLauncher.Bfp("payments_checkout");
        newReactNativeLauncher.Bjt(bundle2);
        if (r14 == null) {
            newReactNativeLauncher.Aig(fragmentActivity);
            return;
        }
        Bundle A70 = newReactNativeLauncher.A70();
        AnonymousClass2TH r42 = new AnonymousClass2TH(r12);
        r42.A0L = fragmentActivity.getString(C0003R.string.checkout);
        r42.A00 = 0.66f;
        r42.A0T = true;
        r42.A0F = r15;
        int[] iArr = AnonymousClass2TH.A0d;
        r42.A01(iArr[0], iArr[1], iArr[2], iArr[3]);
        C16920pO.getInstance().getFragmentFactory();
        C227489qa r0 = new C227489qa();
        r0.setArguments(A70);
        r14.A08(r42, r0);
    }

    public final void A02(FragmentActivity fragmentActivity, CheckoutLaunchParams checkoutLaunchParams, AnonymousClass0C1 r3, Integer num, AnonymousClass2TI r5, C51312Ke r6) {
        A00(fragmentActivity, checkoutLaunchParams, r3, num, r5, r6);
    }
}
