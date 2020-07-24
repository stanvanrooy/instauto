package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.p009ui.mediaactions.LikeActionView;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.AOT */
public final /* synthetic */ class AOT implements C28036CaK {
    public final /* synthetic */ C38031kc A00;
    public final /* synthetic */ C72063Dm A01;
    public final /* synthetic */ APT A02;

    public /* synthetic */ AOT(C72063Dm r1, APT apt, C38031kc r3) {
        this.A01 = r1;
        this.A02 = apt;
        this.A00 = r3;
    }

    public final void BMk(boolean z) {
        C72063Dm r4 = this.A01;
        APT apt = this.A02;
        C38031kc r3 = this.A00;
        if (z) {
            AOS aos = new AOS(r4.A0W.getContext(), r4.A07.A0D, Constants.ONE, r4);
            r4.A0F = aos;
            aos.A00.setVisibility(0);
            r4.A0F.A02 = new WeakReference(r4.A07.A0N);
            AOS aos2 = r4.A0F;
            LikeActionView likeActionView = r4.A07.A0N;
            C13150hy.A02(likeActionView, "supporterBigHeart");
            aos2.A01 = likeActionView;
            AKB akb = r4.A0G;
            if (akb != null) {
                akb.A0B = true;
                if (akb.A05 != null) {
                    AKB.A01(akb);
                }
            }
            A53 a53 = apt.A00;
            if (a53 == null) {
                C13150hy.A03("consumptionSheetConfig");
            }
            AOZ A002 = APY.A00();
            String str = a53.A00;
            if (str == null) {
                C13150hy.A03("description");
            }
            String str2 = apt.A02;
            if (str2 == null) {
                C13150hy.A03("digitalNonConsumableProductId");
            }
            String str3 = apt.A03;
            if (str3 == null) {
                C13150hy.A03("payeeId");
            }
            String str4 = r3.A0P;
            String id = r3.A0C.getId();
            String str5 = a53.A01;
            if (str5 == null) {
                C13150hy.A03("privacyDisclaimer");
            }
            List list = apt.A04;
            if (list == null) {
                C13150hy.A03("tierInfos");
            }
            String str6 = a53.A02;
            if (str6 == null) {
                C13150hy.A03(DialogModule.KEY_TITLE);
            }
            C13150hy.A02(str, "description");
            C13150hy.A02(str2, "digitalNonConsumableProductId");
            C13150hy.A02(str3, "payeeId");
            C13150hy.A02(str4, "mediaId");
            C13150hy.A02(id, "mediaOwnerId");
            C13150hy.A02(str5, "privacyDisclaimer");
            C13150hy.A02(list, "tierInfos");
            C13150hy.A02(str6, DialogModule.KEY_TITLE);
            AOV aov = (AOV) A002.A00.A02();
            if (aov != null) {
                C13150hy.A02(str, "<set-?>");
                aov.A00 = str;
                C13150hy.A02(str2, "<set-?>");
                aov.A01 = str2;
                C13150hy.A02(str3, "<set-?>");
                aov.A04 = str3;
                C13150hy.A02(str4, "<set-?>");
                aov.A02 = str4;
                C13150hy.A02(id, "<set-?>");
                aov.A03 = id;
                C13150hy.A02(str5, "<set-?>");
                aov.A05 = str5;
                C13150hy.A02(list, "<set-?>");
                aov.A08 = list;
                C13150hy.A02(str6, "<set-?>");
                aov.A06 = str6;
            }
            A002.A00.A05(r4.A0V, new C23484AOg(r4, apt, r3));
            AOS aos3 = r4.A0F;
            C212479Ej r2 = apt.A01;
            if (r2 == null) {
                C13150hy.A03("pinnedRowConfig");
            }
            aos3.A02(r2, r3.A0C.AZn(), ((AOV) A002.A00.A02()).A09);
            C2114199x A022 = C72063Dm.A02(r4);
            A022.A01.Bpg(A022.A00);
            AnonymousClass9A1 r1 = new AnonymousClass9A1();
            r1.A03(r3.A0P);
            r1.A04(r3.A0I);
            Integer num = Constants.ZERO;
            r1.A02(num);
            r1.A01(num);
            C131265jN A003 = r1.A00();
            C2114199x A023 = C72063Dm.A02(r4);
            Integer num2 = Constants.ZERO;
            A023.A00(num2, num2, A003);
            C72063Dm.A02(r4).A00(num2, num2, C72063Dm.A00(r4));
            return;
        }
        C72063Dm.A02(r4).A00(Constants.A0j, Constants.ZERO, C72063Dm.A00(r4));
    }
}
