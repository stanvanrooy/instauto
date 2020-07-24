package p000X;

import android.text.TextUtils;
import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCall;
import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.B12 */
public final class B12 extends B1U {
    public final C25092B0c A00;
    public final C25114B1k A01;
    public final AnonymousClass0C1 A02;
    public final Executor A03;

    public final /* bridge */ /* synthetic */ void A02(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        List A012;
        RequestAutofillJSBridgeCall requestAutofillJSBridgeCall = (RequestAutofillJSBridgeCall) instantExperiencesJSBridgeCall;
        super.A02(requestAutofillJSBridgeCall);
        String join = TextUtils.join(",", new ArrayList(requestAutofillJSBridgeCall.A04()));
        C25116B1m.A01(this.A02).A07(requestAutofillJSBridgeCall, Constants.A09, new B18(this, join));
        C25092B0c b0c = this.A00;
        String str = (String) requestAutofillJSBridgeCall.A00("selectedAutoCompleteTag");
        Set A04 = requestAutofillJSBridgeCall.A04();
        C14440kc r4 = new C14440kc();
        AnonymousClass0Z9.A03(b0c.A03, new C25098B0i(b0c, new C25094B0e(b0c, str, r4)), 1347574424);
        ArrayList arrayList = new ArrayList();
        if (NameAutofillData.A00.contains(str)) {
            A012 = b0c.A01.A02();
        } else if (TelephoneAutofillData.A01.contains(str)) {
            A012 = b0c.A01.A03();
        } else if (AddressAutofillData.A00.contains(str)) {
            A012 = b0c.A01.A00();
        } else {
            A012 = b0c.A01.A01();
        }
        arrayList.addAll(A012);
        AnonymousClass93N r42 = new AnonymousClass93N(ImmutableList.A02(Arrays.asList(new C14490kj[]{r4, AnonymousClass2MU.A00(arrayList)})));
        B0r b0r = new B0r(b0c, A04);
        Executor executor = b0c.A02;
        AnonymousClass0a4.A06(b0r);
        C206108s0 r2 = new C206108s0(r42, b0r);
        r42.A3T(r2, C206128s2.A00(executor, r2));
        AnonymousClass2MU.A03(r2, new B1F(this, requestAutofillJSBridgeCall, join), this.A03);
    }

    public B12(AnonymousClass0C1 r2, Executor executor, C25114B1k b1k, AV6 av6, C25092B0c b0c) {
        super(C25116B1m.A01(r2), av6);
        this.A02 = r2;
        this.A03 = executor;
        this.A00 = b0c;
        this.A01 = b1k;
    }
}
