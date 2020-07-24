package p000X;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;

/* renamed from: X.CD6 */
public final class CD6 extends C17920r1 {
    public final /* synthetic */ CC4 A00;

    public CD6(CC4 cc4) {
        this.A00 = cc4;
    }

    public final void onFail(C43791v5 r6) {
        String str;
        int A03 = AnonymousClass0Z0.A03(435285030);
        Throwable th = r6.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        CCZ.A0C(this.A00.A0A, C27398CBr.AUDIENCE, "audience_fetch", str);
        this.A00.A05.A10();
        AnonymousClass1HD A01 = C16310oO.A00.A02().A01(Constants.A08);
        CC4 cc4 = this.A00;
        C52362Om r2 = new C52362Om(cc4.A04, cc4.A0H);
        r2.A02 = A01;
        if (this.A00.A0B == C26905BuU.HEC_APPEAL) {
            r2.A08 = false;
        }
        r2.A02();
        AnonymousClass0Z0.A0A(-1987687091, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(2079401778);
        super.onFinish();
        CC4.A05(this.A00, true);
        AnonymousClass0Z0.A0A(1171544735, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(-2040136823);
        super.onStart();
        CC4.A05(this.A00, false);
        AnonymousClass0Z0.A0A(-260774819, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ImmutableList A01;
        ImmutableList A012;
        int A03 = AnonymousClass0Z0.A03(551679214);
        CFZ cfz = (CFZ) obj;
        int A032 = AnonymousClass0Z0.A03(1020994133);
        CGB cgb = cfz.A00;
        if (cgb != null) {
            CCZ.A0C(this.A00.A0A, C27398CBr.AUDIENCE, "audience_fetch", cgb.A03);
            if (cgb.A01 == Constants.A15 && ((Boolean) AnonymousClass0L6.A02(this.A00.A0H, AnonymousClass0L7.DEPRECATED_TARGETING_DIALOG, "should_show_deprecated_targeting_dialog", false, (AnonymousClass04H) null)).booleanValue()) {
                C51512Ky r1 = new C51512Ky();
                r1.A07 = Constants.A0C;
                r1.A09 = cgb.A02;
                r1.A00 = 3000;
                C11130eT.A01.BXT(new C33441cv(r1.A00()));
            } else if (C27500CFq.A00(this.A00.A0H).booleanValue()) {
                this.A00.A05.A10();
                AnonymousClass1HD A02 = C16310oO.A00.A02().A02(cgb.A01);
                CC4 cc4 = this.A00;
                C52362Om r2 = new C52362Om(cc4.A04, cc4.A0H);
                r2.A02 = A02;
                r2.A02();
                AnonymousClass0Z0.A0A(762768928, A032);
                AnonymousClass0Z0.A0A(2012905995, A03);
            }
        } else {
            List list = cfz.A01;
            if (list != null) {
                A01 = ImmutableList.A09(list);
            } else {
                A01 = ImmutableList.A01();
            }
            if (A01 == null) {
                this.A00.A05.A10();
                AnonymousClass1HD A013 = C16310oO.A00.A02().A01(Constants.A08);
                CC4 cc42 = this.A00;
                C52362Om r22 = new C52362Om(cc42.A04, cc42.A0H);
                r22.A02 = A013;
                r22.A02();
                AnonymousClass0Z0.A0A(1635496635, A032);
                AnonymousClass0Z0.A0A(2012905995, A03);
            }
        }
        CD3 cd3 = this.A00.A0A;
        List list2 = cfz.A01;
        if (list2 != null) {
            A012 = ImmutableList.A09(list2);
        } else {
            A012 = ImmutableList.A01();
        }
        cd3.A0h = A012;
        CD3 cd32 = this.A00.A0A;
        cd32.A0z = cfz.A02;
        for (CFW cfw : cd32.A0h) {
            if (CDV.A05(cfw)) {
                Map map = this.A00.A0A.A0l;
                Integer num = cfw.A02;
                AnonymousClass11J.A00(num);
                map.put(CGU.A00(num), cfw);
            } else {
                Map map2 = this.A00.A0A.A0l;
                String str = cfw.A03;
                AnonymousClass11J.A00(str);
                map2.put(str, cfw);
            }
        }
        CD3 cd33 = this.A00.A0A;
        CCZ.A0F(cd33, C27398CBr.AUDIENCE, cd33.A0l.keySet());
        CC4 cc43 = this.A00;
        cc43.A0C.A03(cc43.A0A);
        AnonymousClass0Z0.A0A(-2092465468, A032);
        AnonymousClass0Z0.A0A(2012905995, A03);
    }
}
