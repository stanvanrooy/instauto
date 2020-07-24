package p000X;

import android.view.ViewStub;
import com.facebook.C0003R;
import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCall;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.B1F */
public final class B1F implements AnonymousClass2TQ {
    public final /* synthetic */ String A00;
    public final /* synthetic */ RequestAutofillJSBridgeCall A01;
    public final /* synthetic */ B12 A02;

    public final void B46(Throwable th) {
    }

    public B1F(B12 b12, RequestAutofillJSBridgeCall requestAutofillJSBridgeCall, String str) {
        this.A02 = b12;
        this.A01 = requestAutofillJSBridgeCall;
        this.A00 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    public final /* bridge */ /* synthetic */ void BPi(Object obj) {
        boolean z;
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            this.A02.A01.A01.A02.A01(false);
            C25116B1m.A01(this.A02.A02).A07(this.A01, Constants.A0B, new B1D(this));
            return;
        }
        C25116B1m.A01(this.A02.A02).A07(this.A01, Constants.A0A, new B1E(this));
        boolean z2 = false;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((BrowserExtensionsAutofillData) it.next()).AGO().containsKey((String) this.A01.A00("selectedAutoCompleteTag"))) {
                    z2 = true;
                    break;
                }
            } else {
                break;
            }
        }
        C25114B1k b1k = this.A02.A01;
        B1H b1h = new B1H(this);
        B1K b1k2 = b1k.A01;
        AnonymousClass0ZA.A0E(b1k2.A01, new B1I(b1k2, (ViewStub) b1k.mView.findViewById(C0003R.C0005id.instant_experiences_autofill_bar), list, b1h), 1553844216);
        if (z2 && !b1k.A04) {
            C16180oA A002 = C16180oA.A00(b1k.A03);
            if (A002.A00.getInt("ix_autofill_tooltip", 0) < 3) {
                A002.A00.edit().putInt("ix_autofill_tooltip", A002.A00.getInt("ix_autofill_tooltip", 0) + 1).apply();
                z = true;
                if (!z) {
                    b1k.mView.postDelayed(new B1G(b1k), 1000);
                    return;
                }
                return;
            }
        }
        z = false;
        if (!z) {
        }
    }
}
