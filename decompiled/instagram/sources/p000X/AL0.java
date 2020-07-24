package p000X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.PopupWindow;
import com.facebook.C0003R;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* renamed from: X.AL0 */
public final class AL0 extends C23718AZy {
    public final /* synthetic */ C72063Dm A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AL0(C72063Dm r1, String str) {
        super(str);
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void A00(Aa0 aa0) {
        Integer num;
        int i;
        ALQ alq;
        int A02;
        C23840AcB acB = (C23840AcB) aa0;
        C72063Dm r1 = this.A00;
        if (r1.A01 != null) {
            C23398AKx aKx = r1.A0C;
            if (aKx != null) {
                C23399AKy aKy = aKx.A01;
                aKy.A03.setTouchInterceptor((View.OnTouchListener) null);
                aKy.A03.dismiss();
            }
            if (r1.A0B == null) {
                C38031kc r3 = r1.A01;
                r1.A0B = new AL4(r3, r1.A0X, r1.A0V, r1.A0W, r3.A0C, new C23400AKz(r1.A07.A0D), new ALP(r1.A07.A04));
            }
            r1.A0G.A0M.A0J(false, false);
            AL4 al4 = r1.A0B;
            C13300iJ r6 = r1.A0X.A06;
            C227689qu r32 = new C227689qu(r1);
            boolean z = r1.A0Q;
            String str = acB.A00.A0P;
            al4.A03 = str;
            al4.A04 = acB.A01;
            AL1 al1 = al4.A09;
            al1.A03 = str;
            if (z) {
                num = Constants.ONE;
            } else {
                num = Constants.ZERO;
            }
            al1.A00 = Long.valueOf(SystemClock.elapsedRealtime());
            AnonymousClass0P4 A002 = AL1.A00(al1, Constants.ZERO);
            A002.A0G("invite_type", ALR.A00(num));
            AnonymousClass0WN.A01(al1.A04).BcG(A002);
            Context context = al4.A06.getContext();
            ALA ala = new ALA(al4, r32);
            C38031kc r12 = acB.A00;
            C13300iJ r8 = r12.A0C;
            if (z) {
                C23400AKz aKz = al4.A0A;
                ALO alo = new ALO(al4, context);
                C06220Of.A0E(aKz.A01);
                AL2 al2 = aKz.A02;
                al2.A08.setText(aKz.A00.getString(C0003R.string.live_cobroadcast_request_accepted, new Object[]{r8.AZn()}));
                al2.A07.setText(aKz.A00.getString(C0003R.string.live_cobroadcast_request_accepted_subtitle));
                View view = aKz.A01;
                AL7 al7 = new AL7(aKz, ala);
                al2.A01 = false;
                al2.A09.setUrl(r6.ASv());
                al2.A0A.setVisibility(8);
                al2.A03.setOnClickListener(new ALH(al2));
                al2.A04.setOnClickListener(new ALC(al2));
                al2.A05.setOnDismissListener(al7);
                al2.A05.setOutsideTouchable(true);
                al2.A05.setSoftInputMode(16);
                al2.A05.setTouchInterceptor(new ALL(al2));
                al2.A05.setAnimationStyle(C0003R.style.PopupAnimationStyle);
                PopupWindow popupWindow = al2.A05;
                if (C64972sL.A03(alo.A00)) {
                    if (C64972sL.A04(alo.A00)) {
                        A02 = C64972sL.A01(alo.A00) - alo.A01.A0A.A02.A02.getLayoutParams().height;
                    } else {
                        A02 = C64972sL.A02(alo.A00, (C50282Fr) null);
                    }
                    i = A02 + C27141Gq.A00;
                } else {
                    i = 0;
                }
                popupWindow.showAtLocation(view, 80, 0, i);
                ObjectAnimator objectAnimator = al2.A00;
                if (objectAnimator != null) {
                    objectAnimator.removeAllListeners();
                    al2.A00.cancel();
                }
                ObjectAnimator ofInt = ObjectAnimator.ofInt(al2.A06, ReactProgressBarViewManager.PROP_PROGRESS, new int[]{0, 500});
                al2.A00 = ofInt;
                ofInt.setDuration(AL2.A0B);
                al2.A00.setInterpolator(new LinearInterpolator());
                al2.A00.addListener(new ALI(al2));
                al2.A00.start();
                if (al4.A00 == null) {
                    al4.A00 = C62742oI.A01(al4.A06.getContext(), al4.A07, "live_with_join_flow");
                }
                C23400AKz aKz2 = al4.A0A;
                C191188Ff r33 = al4.A00;
                if (z) {
                    alq = aKz2.A02;
                } else {
                    alq = aKz2.A03;
                }
                alq.AHi().setVisibility(0);
                if (alq.AHi().A01()) {
                    C23400AKz.A00(aKz2, alq, r33, alq.AHi().getWidth(), alq.AHi().getHeight());
                } else {
                    alq.AHi().setSurfaceTextureListener(new C191248Fl(aKz2, alq, r33));
                }
            } else {
                C23400AKz aKz3 = al4.A0A;
                String str2 = r12.A0S;
                C06220Of.A0E(aKz3.A01);
                String AZn = r8.AZn();
                C23399AKy aKy2 = aKz3.A03;
                aKy2.A04.setText(aKz3.A00.getString(C0003R.string.live_join_cobroadcast_invitation_attribution, new Object[]{AZn}));
                aKy2.A07.setText(C98584Nr.A00(aKz3.A00, r6, r8, str2));
                aKy2.A06.setText(aKz3.A00.getString(C0003R.string.live_join_cobroadcast_invite, new Object[]{AZn}));
                aKy2.A00(aKz3.A01, r8, r6, new AL3(aKz3, ala));
            }
            if (al4.A02 == null) {
                al4.A02 = new AL8(al4, al4.A0B);
            }
            C23300zv.A00(al4.A07).A02(C23721Aa5.class, al4.A02);
            AnonymousClass0ZA.A09(al4.A05, ala.A01, AL4.A0D, -562234661);
        }
    }
}
