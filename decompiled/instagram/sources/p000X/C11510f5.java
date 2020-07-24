package p000X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.settings.common.PaymentOptionsFragment;

/* renamed from: X.0f5  reason: invalid class name and case insensitive filesystem */
public final class C11510f5 implements C11330en {
    public final boolean BdY() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        if (r2.equals("fbpay_hub") == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r2.equals("settings_payments") == false) goto L_0x001f;
     */
    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r7) {
        char c;
        String string = bundle.getString("PAYMENTS_URL_TYPE");
        int hashCode = string.hashCode();
        if (hashCode == -1467135838) {
            c = 1;
        } else if (hashCode == 1772780489) {
            c = 0;
        }
        c = 65535;
        if (c == 0) {
            C17480qJ.A00.A00();
            Bundle bundle2 = new Bundle();
            PaymentOptionsFragment paymentOptionsFragment = new PaymentOptionsFragment();
            paymentOptionsFragment.setArguments(bundle2);
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r7.getToken());
            paymentOptionsFragment.setArguments(bundle);
            C52362Om r0 = new C52362Om(fragmentActivity, r7);
            r0.A02 = paymentOptionsFragment;
            r0.A02();
        } else if (c == 1) {
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r7.getToken());
            C17480qJ.A00.A00();
            AnonymousClass1HD A00 = ((C26221Bhd) AnonymousClass11G.A04().A04.get()).A00("home", bundle);
            AnonymousClass0a4.A06(A00);
            C52362Om r02 = new C52362Om(fragmentActivity, r7);
            r02.A02 = A00;
            r02.A02();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (r6.equals("settings_payments") == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r6.equals("fbpay_hub") == false) goto L_0x003e;
     */
    public final Bundle A7i(String str, C06590Pq r9) {
        char c;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (!"ig".equalsIgnoreCase(scheme) && !"instagram".equalsIgnoreCase(scheme)) {
            return null;
        }
        Bundle bundle = new Bundle();
        String host = parse.getHost();
        int hashCode = host.hashCode();
        if (hashCode == -1467135838) {
            c = 1;
        } else if (hashCode == 1772780489) {
            c = 0;
        }
        c = 65535;
        if (c == 0) {
            bundle.putString("PAYMENTS_URL_TYPE", "settings_payments");
            return bundle;
        } else if (c != 1) {
            return null;
        } else {
            bundle.putString("PAYMENTS_URL_TYPE", "fbpay_hub");
            return bundle;
        }
    }
}
