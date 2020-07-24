package p000X;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.flipper.core.StateSummary;
import com.google.common.collect.ImmutableMap;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.HashMap;

/* renamed from: X.AP1 */
public final class AP1 implements View.OnClickListener {
    public final /* synthetic */ APS A00;
    public final /* synthetic */ AP0 A01;
    public final /* synthetic */ C23485AOh A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public AP1(C23485AOh aOh, AP0 ap0, String str, APS aps, String str2, String str3) {
        this.A02 = aOh;
        this.A01 = ap0;
        this.A05 = str;
        this.A00 = aps;
        this.A03 = str2;
        this.A04 = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ef, code lost:
        if (r11.A06 == false) goto L_0x00f1;
     */
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        int A052 = AnonymousClass0Z0.A05(1688298189);
        C31221Wz A012 = C31201Wx.A01(this.A02.getContext());
        if (A012 != null) {
            A012.A0B();
        }
        C72063Dm r14 = this.A01.A00;
        if (r14 == null) {
            C13150hy.A03("delegate");
        }
        APS aps = this.A00;
        String str = this.A05;
        String str2 = this.A03;
        String str3 = this.A04;
        boolean z3 = this.A01.A01;
        AOU aou = r14.A0J;
        FragmentActivity fragmentActivity = r14.A0V;
        C13150hy.A02(fragmentActivity, "activity");
        C13150hy.A02(aps, "tierInfo");
        C13150hy.A02(str, "price");
        C13150hy.A02(str2, "productId");
        C13150hy.A02(str3, "payeeId");
        C13150hy.A02(r14, "delegate");
        ((AOZ) aou.A04.getValue()).A01(true);
        BaseFragmentActivity baseFragmentActivity = (BaseFragmentActivity) fragmentActivity;
        baseFragmentActivity.A0W(aou.A02);
        HashMap hashMap = new HashMap();
        hashMap.put("price", str);
        APS aps2 = aps;
        AP6 ap6 = r2;
        AP6 ap62 = new AP6(fragmentActivity, aps.A00(), Constants.ZERO, new AO2(aou, str, aps2, r14, baseFragmentActivity));
        ap62.A02 = ImmutableMap.A01(hashMap);
        ap62.A07 = z3;
        ap6.A05 = AnonymousClass000.A0O("{\"product_id\":\"", str2, "\", \"payee_id\":\"", str3, "\"}");
        AP4 ap4 = new AP4(ap6);
        C27990CZa cZa = (C27990CZa) aou.A03.getValue();
        ImmutableMap immutableMap = ap4.A01;
        if (immutableMap == null) {
            immutableMap = ImmutableMap.A01(new HashMap());
        }
        HashMap hashMap2 = new HashMap(immutableMap);
        hashMap2.put(StateSummary.$const$string(56), ap4.A05);
        hashMap2.put(C27998CZi.SOURCE.A00, cZa.A01.A00);
        String str4 = ap4.A05;
        int i = ap4.A00;
        Integer num = ap4.A03;
        C228659vP r0 = ap4.A02;
        String str5 = ap4.A04;
        C23521APr aPr = new C23521APr(cZa, r0);
        boolean z4 = false;
        if (cZa.A00.asBoolean(false)) {
            z4 = true;
        }
        if (z4) {
            z = true;
        }
        z = false;
        if (z) {
            hashMap2.put(C27998CZi.IS_MOCK_PURCHASE.A00, "true");
            cZa.A05.A06(C27998CZi.ACTION_PURCHASE_INITIATED, ImmutableMap.A01(hashMap2));
            AnonymousClass2OA r10 = new AnonymousClass2OA(cZa.A04);
            r10.A06(C0003R.string.payments_inapp_test_payment_alert_text);
            C27990CZa cZa2 = cZa;
            r10.A0A(C0003R.string.f118ok, new C27991CZb(cZa2, str4, num, str5, aPr, hashMap2));
            r10.A09(C0003R.string.cancel, (DialogInterface.OnClickListener) null);
            r10.A0E(new AP3(cZa, hashMap2, aPr));
            r10.A03().show();
            z2 = true;
        } else {
            cZa.A05.A06(C27998CZi.ACTION_PURCHASE_INITIATED, ImmutableMap.A01(hashMap2));
            boolean z5 = false;
            if (cZa.A00.asBoolean(false)) {
                z5 = true;
            }
            if (z5) {
                cZa.A07.A00 = true;
                CZW czw = cZa.A02;
                CZW.A06(czw, new CZY(czw, cZa.A04, str4, num, i, new C27992CZc(cZa, hashMap2, aPr, str4), str5));
                z2 = true;
            } else {
                hashMap2.putAll(CZU.A03("Payments are not enabled"));
                cZa.A05.A06(C27998CZi.ACTION_PURCHASE_FAILED, ImmutableMap.A01(hashMap2));
                z2 = false;
            }
        }
        if (!z2) {
            ((AOZ) aou.A04.getValue()).A01(false);
            AOU.A00(aou, Constants.A0u, str);
            baseFragmentActivity.A0X(aou.A02);
        }
        AP0 ap0 = this.A01;
        Integer num2 = Constants.A0C;
        String str6 = this.A05;
        C2114199x A002 = C2114299y.A00((AnonymousClass0C1) ap0.A05.getValue());
        Integer num3 = Constants.ZERO;
        Object A022 = ((AOZ) ap0.A03.getValue()).A00.A02();
        if (A022 == null) {
            C13150hy.A00();
        }
        AOV aov = (AOV) A022;
        AnonymousClass9A1 r2 = new AnonymousClass9A1();
        r2.A03(aov.A02);
        r2.A04(aov.A03);
        C13150hy.A02(str6, "amountUSD");
        r2.A00.put("amount_usd", str6);
        r2.A02(num3);
        r2.A01(num3);
        A002.A00(num2, num3, r2.A00());
        AnonymousClass0Z0.A0C(-926117056, A052);
    }
}
