package p000X;

import android.content.Context;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.p009ui.mediaactions.LikeActionView;
import java.lang.ref.WeakReference;

/* renamed from: X.AO2 */
public final class AO2 implements C228659vP {
    public final /* synthetic */ BaseFragmentActivity A00;
    public final /* synthetic */ C72063Dm A01;
    public final /* synthetic */ AOU A02;
    public final /* synthetic */ APS A03;
    public final /* synthetic */ String A04;

    public AO2(AOU aou, String str, APS aps, C72063Dm r4, BaseFragmentActivity baseFragmentActivity) {
        this.A02 = aou;
        this.A04 = str;
        this.A03 = aps;
        this.A01 = r4;
        this.A00 = baseFragmentActivity;
    }

    public final void BGh(Integer num) {
        C13150hy.A02(num, "resultCode");
        AOU aou = this.A02;
        String str = this.A04;
        ((AOZ) aou.A04.getValue()).A01(false);
        AOU.A00(aou, Constants.A0u, str);
        this.A00.A0X(this.A02.A02);
    }

    public final void BGj(C28027CaB caB) {
        C13150hy.A02(caB, "purchase");
        AOU aou = this.A02;
        String str = this.A04;
        C23334AIl aIl = this.A03.A00;
        if (aIl == null) {
            C13150hy.A03("supportTier");
        }
        C72063Dm r9 = this.A01;
        ((AOZ) aou.A04.getValue()).A01(false);
        C38031kc r0 = r9.A01;
        if (r0 != null) {
            C23495AOr aOr = r0.A0B;
            C23495AOr aOr2 = aOr;
            if (aOr != null) {
                aOr.A00 = aIl;
                aOr2.A01 = null;
                AKB akb = r9.A0G;
                if (akb != null) {
                    akb.A06 = aIl;
                    akb.A0M.A08 = aIl;
                    AK9 ak9 = akb.A0L;
                    AJX ajx = new AJX();
                    C13300iJ r1 = ak9.A0L.A06;
                    C13150hy.A02(r1, "<set-?>");
                    ajx.A00 = r1;
                    C13150hy.A02(aIl, "<set-?>");
                    ajx.A01 = aIl;
                    ak9.A0J(ajx);
                }
                AOS aos = r9.A0F;
                if (aos != null) {
                    aos.A00.setVisibility(8);
                    AOS aos2 = r9.A0F;
                    C13150hy.A02(aIl, "supportTier");
                    WeakReference weakReference = aos2.A02;
                    if (weakReference != null) {
                        LikeActionView likeActionView = aos2.A01;
                        if (likeActionView != null) {
                            Context context = aos2.A06;
                            C13150hy.A02(context, "context");
                            C13150hy.A02(aIl, "supportTier");
                            likeActionView.setImageDrawable(C019000b.A03(context, C23332AIj.A00(aIl, false)));
                        }
                        AnonymousClass29R r12 = new AnonymousClass29R();
                        r12.A00(weakReference);
                        r12.A02(false, true, true);
                    }
                }
                C72063Dm.A04(r9);
            }
        }
        AOU.A00(aou, Constants.A0Y, str);
        C2114199x A002 = C2114299y.A00(aou.A01);
        A002.A01.ADB(A002.A00);
        this.A00.A0X(this.A02.A02);
    }
}
