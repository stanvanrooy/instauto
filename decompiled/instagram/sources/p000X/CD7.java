package p000X;

import android.content.DialogInterface;
import com.facebook.C0003R;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CD7 */
public final class CD7 extends C17920r1 {
    public final /* synthetic */ C27398CBr A00;
    public final /* synthetic */ CGS A01;
    public final /* synthetic */ CD8 A02;

    public CD7(CD8 cd8, C27398CBr cBr, CGS cgs) {
        this.A02 = cd8;
        this.A00 = cBr;
        this.A01 = cgs;
    }

    public final void onFail(C43791v5 r6) {
        String str;
        int A03 = AnonymousClass0Z0.A03(320043222);
        Throwable th = r6.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        CCZ.A0C(this.A02.A04, this.A00, "initial_fetch", str);
        CCZ.A0D(this.A02.A04, this.A00, CF8.A00(Constants.A08), str);
        this.A01.BF1();
        AnonymousClass0Z0.A0A(720640321, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(1617830795);
        CFA cfa = (CFA) obj;
        int A032 = AnonymousClass0Z0.A03(1579514936);
        CCZ.A09(this.A02.A04, this.A00, "initial_fetch");
        if (cfa.A06) {
            CES ces = cfa.A02;
            AnonymousClass0a4.A06(ces);
            CD3 cd3 = this.A02.A04;
            cd3.A0X = ces.A09;
            cd3.A0Y = ces.A0C;
            cd3.A0S = ces.A07;
            cd3.A0f = Currency.getInstance(ces.A08);
            CD8 cd8 = this.A02;
            CD3 cd32 = cd8.A04;
            cd32.A01 = ces.A00;
            cd32.A00 = ces.A03;
            cd32.A0i = ces.A0F;
            cd32.A0y = ces.A0L;
            CCf cCf = ces.A04;
            cd32.A0A = cCf;
            String str = ces.A0E;
            cd32.A0U = str;
            cd32.A14 = ces.A0M;
            cd32.A11 = ces.A0N;
            cd32.A0t = ces.A0G;
            cd32.A0w = ces.A0I;
            cd32.A0C = ces.A05;
            cd32.A0c = str;
            cd32.A0B = cCf;
            String str2 = ces.A0A;
            cd32.A0b = str2;
            cd32.A03 = ces.A01;
            cd32.A04 = ces.A02;
            cd32.A0z = ces.A0H;
            cd32.A10 = ces.A0K;
            cd32.A0u = ces.A0J;
            cd8.A05.A0A(cd32, str2);
            CD8 cd82 = this.A02;
            CD3 cd33 = cd82.A04;
            cd33.A0P = ces.A06;
            cd82.A05.A06(cd33, cd33.A0C);
            CD8 cd83 = this.A02;
            CD3 cd34 = cd83.A04;
            if (cd34.A0y) {
                cd34.A0x = true;
                cd34.A0a = ces.A0D;
            }
            cd83.A05.A04(cd34, cd34.A03);
            CD8 cd84 = this.A02;
            CDA cda = cd84.A05;
            CD3 cd35 = cd84.A04;
            cda.A05(cd35, cd35.A04);
            CGJ cgj = cfa.A00;
            if (cgj != null) {
                Integer num = cgj.A00;
                if (num == Constants.ONE) {
                    CD3 cd36 = this.A02.A04;
                    cd36.A0p = true;
                    cd36.A0F = cgj;
                } else if (num == Constants.A0C) {
                    String str3 = cgj.A01;
                    if (str3 == null) {
                        str3 = "";
                    }
                    CD3 cd37 = this.A02.A04;
                    C27398CBr cBr = this.A00;
                    HashMap hashMap = new HashMap();
                    hashMap.put("coupon_enroll_failure_reason", str3);
                    AnonymousClass0P4 A002 = AnonymousClass2VV.A00(Constants.A06);
                    A002.A0G("step", cBr.toString());
                    A002.A0G("component", "coupon_enroll_failure_alert");
                    C06270Ok A003 = C06270Ok.A00();
                    A003.A0C(hashMap);
                    A002.A08("configurations", A003);
                    CCZ.A0G(cd37, A002);
                    C46431zj.A00(this.A02.A0D).A02(this.A02.A03);
                    AnonymousClass2OA r5 = new AnonymousClass2OA(this.A02.A03);
                    r5.A07(C0003R.string.promote_enroll_coupon_already_enrolled_dialog_title);
                    r5.A06(C0003R.string.promote_enroll_coupon_already_enrolled_dialog_subtitle);
                    if ("OFFER_ALREADY_CLAIMED".equalsIgnoreCase(str3)) {
                        r5.A07(C0003R.string.promote_enroll_coupon_already_enrolled_dialog_title);
                        r5.A06(C0003R.string.promote_enroll_coupon_already_enrolled_dialog_subtitle);
                    } else {
                        r5.A07(C0003R.string.promote_enroll_coupon_error_dialog_title);
                        r5.A06(C0003R.string.promote_enroll_coupon_error_dialog_subtitle);
                        r5.A0A(C0003R.string.learn_more, new CFG(this));
                    }
                    r5.A08(C0003R.string.f118ok, (DialogInterface.OnClickListener) null);
                    r5.A03().show();
                }
            }
            CD3 cd38 = this.A02.A04;
            List list = cfa.A05;
            cd38.A0k = list;
            if (!AnonymousClass0OX.A00(list)) {
                for (C27481CEx cEx : this.A02.A04.A0k) {
                    CFW cfw = cEx.A02;
                    if (CDV.A05(cfw)) {
                        Map map = this.A02.A04.A0l;
                        Integer num2 = cfw.A02;
                        AnonymousClass0a4.A06(num2);
                        map.put(CGU.A00(num2), cfw);
                    } else {
                        Map map2 = this.A02.A04.A0l;
                        String str4 = cfw.A03;
                        AnonymousClass0a4.A06(str4);
                        map2.put(str4, cfw);
                    }
                }
            }
            CD3 cd39 = this.A02.A04;
            cd39.A0K = cfa.A03;
            cd39.A13 = cfa.A07;
            if (ces.A0B != null) {
                CCZ.A08(cd39, this.A00, "igtv_link_alert");
                AnonymousClass2OA r1 = new AnonymousClass2OA(this.A02.A03);
                r1.A07(C0003R.string.promote_igtv_not_support_dialog_title);
                r1.A06(C0003R.string.promote_igtv_not_support_dialog_message);
                r1.A08(C0003R.string.close, (DialogInterface.OnClickListener) null);
                r1.A03().show();
            }
        }
        this.A01.BF2(cfa);
        AnonymousClass0Z0.A0A(387386200, A032);
        AnonymousClass0Z0.A0A(630053374, A03);
    }
}
