package com.instagram.video.live.livewith.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.legacy.widget.Space;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.slidecontentlayout.SlideContentLayout;
import java.util.HashSet;
import p000X.A52;
import p000X.AMD;
import p000X.AMI;
import p000X.AN2;
import p000X.AN3;
import p000X.AN4;
import p000X.ANI;
import p000X.ANQ;
import p000X.ANR;
import p000X.AO0;
import p000X.AO7;
import p000X.AOD;
import p000X.AOH;
import p000X.APD;
import p000X.APR;
import p000X.APV;
import p000X.AQ3;
import p000X.ARC;
import p000X.AWM;
import p000X.AXY;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1X4;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass3Di;
import p000X.AnonymousClass7E0;
import p000X.C06590Pq;
import p000X.C13300iJ;
import p000X.C13510ie;
import p000X.C15780nW;
import p000X.C16500oh;
import p000X.C191188Ff;
import p000X.C191448Gg;
import p000X.C199318fw;
import p000X.C204278oZ;
import p000X.C205638rB;
import p000X.C225999o8;
import p000X.C227589qk;
import p000X.C23293AGs;
import p000X.C23471ANt;
import p000X.C23472ANu;
import p000X.C23499AOv;
import p000X.C23502AOy;
import p000X.C23516APm;
import p000X.C23524APu;
import p000X.C23525APv;
import p000X.C23553AQx;
import p000X.C23724Aa8;
import p000X.C23825Abt;
import p000X.C23826Abu;
import p000X.C23836Ac4;
import p000X.C26301Cs;
import p000X.C27341Hl;
import p000X.C33251cc;
import p000X.C476624x;
import p000X.C62742oI;
import p000X.C72723Gt;
import p000X.C72733Gu;
import p000X.C72773Gy;
import p000X.CVK;
import p000X.CVR;

public class IgLiveWithGuestFragment extends C27341Hl implements AnonymousClass1HK, ARC, C191448Gg, C225999o8 {
    public View A00;
    public LinearLayout A01;
    public C191188Ff A02;
    public C72723Gt A03;
    public AnonymousClass0C1 A04;
    public C72733Gu A05;
    public C13300iJ A06;
    public AOD A07;
    public CVK A08;
    public AnonymousClass7E0 A09;
    public C23825Abt A0A;
    public AN2 A0B;
    public AMI A0C;
    public C23553AQx A0D;
    public C23471ANt A0E;
    public C23472ANu A0F;
    public AO7 A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K;
    public AO0 A0L;
    public AXY A0M;
    public boolean A0N;
    public final AnonymousClass3Di A0O = new C23524APu(this);
    public final Runnable A0P = new C23293AGs(this);
    public final Runnable A0Q = new APD(this);
    public final AN4 A0R = new C227589qk(this);

    public final void B1l(long j) {
    }

    public final void B8g(int i, boolean z) {
        if (i > 0) {
            this.A0G.A00(true);
            CVK cvk = this.A08;
            if (cvk != null) {
                cvk.A06.AiZ();
                return;
            }
            return;
        }
        CVK cvk2 = this.A08;
        if (cvk2 != null) {
            cvk2.A06.AiY();
        }
        if (this.A0J) {
            View view = this.A0G.A01.A00;
            if (view.getVisibility() != 0) {
                C476624x.A09(true, view);
            }
        }
    }

    public final String getModuleName() {
        return "live_cobroadcast";
    }

    public static void A00(IgLiveWithGuestFragment igLiveWithGuestFragment) {
        AnonymousClass2OA r4 = new AnonymousClass2OA(igLiveWithGuestFragment.getContext());
        r4.A03 = igLiveWithGuestFragment.getContext().getString(C0003R.string.live_cobroadcast_leave_dialog_message, new Object[]{igLiveWithGuestFragment.A06.AZn()});
        r4.A0P(igLiveWithGuestFragment.getContext().getString(C0003R.string.live_cobroadcast_leave_dialog_confirm), new C23525APv(igLiveWithGuestFragment));
        r4.A0N(igLiveWithGuestFragment.getContext().getString(C0003R.string.cancel), (DialogInterface.OnClickListener) null);
        r4.A0U(true);
        r4.A0V(true);
        r4.A03().show();
    }

    public static void A01(IgLiveWithGuestFragment igLiveWithGuestFragment, A52 a52, Exception exc) {
        Integer num;
        Integer num2;
        if (exc == null) {
            AMI ami = igLiveWithGuestFragment.A0C;
            boolean Aec = igLiveWithGuestFragment.A02.Aec();
            AMD amd = ami.A03;
            View view = amd.A0K.A05.A01;
            if (view != null) {
                view.animate().rotationBy(-180.0f).start();
            }
            amd.A0I(Aec);
            AnonymousClass7E0 r3 = igLiveWithGuestFragment.A09;
            if (a52.A04) {
                num2 = Constants.ZERO;
            } else {
                num2 = Constants.ONE;
            }
            r3.A0E.incrementAndGet();
            AnonymousClass0P4 A002 = AnonymousClass7E0.A00(r3, Constants.A04);
            A002.A0G("camera", AQ3.A00(num2));
            AnonymousClass0WN.A01(r3.A0A).BcG(A002);
        }
        AnonymousClass7E0 r1 = igLiveWithGuestFragment.A09;
        if (igLiveWithGuestFragment.A02.Aec()) {
            num = Constants.ZERO;
        } else {
            num = Constants.ONE;
        }
        r1.A02 = num;
    }

    public static void A02(IgLiveWithGuestFragment igLiveWithGuestFragment, boolean z, Bundle bundle) {
        Intent intent;
        if (bundle != null) {
            intent = new Intent();
            intent.putExtras(bundle);
        } else {
            intent = null;
        }
        igLiveWithGuestFragment.A0K = true;
        FragmentActivity activity = igLiveWithGuestFragment.getActivity();
        if (activity != null) {
            int i = 0;
            if (z) {
                i = -1;
            }
            activity.setResult(i, intent);
            activity.onBackPressed();
        }
    }

    public final void A03(boolean z) {
        int A032 = this.A0A.A03(C23826Abu.ACTIVE) + this.A0A.A03(C23826Abu.STALLED);
        C23825Abt abt = this.A0A;
        abt.A03.A02(this.A0H, Constants.ZERO, Integer.valueOf(A032), new C204278oZ(this, z));
    }

    public final void Atj(C23724Aa8 aa8) {
        this.A0E.A03(aa8);
    }

    public final void B69(Integer num, C13300iJ r4) {
        throw new IllegalStateException("Guests cannot select candidates to invite");
    }

    public final void BL3() {
        C23553AQx aQx = this.A0D;
        if (aQx != null) {
            aQx.A06.Br7(new APV(this));
        }
    }

    public final void BW6(int i, int i2, Integer num) {
        AnonymousClass7E0 r3 = this.A09;
        AnonymousClass0P4 A002 = AnonymousClass7E0.A00(r3, Constants.A09);
        A002.A0E("num_viewers", Integer.valueOf(i));
        AnonymousClass0WN.A01(r3.A0A).BcG(A002);
    }

    public final boolean onBackPressed() {
        boolean z;
        if (this.A0K) {
            return false;
        }
        C23472ANu aNu = this.A0F;
        if (aNu != null) {
            if (C23472ANu.A03(aNu)) {
                aNu.A04();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        A00(this);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x00d9, code lost:
        if (r3.A02.A0B() == false) goto L_0x00db;
     */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        View view2 = view;
        super.onViewCreated(view2, bundle);
        this.A00 = view2;
        C23825Abt abt = this.A0A;
        C23836Ac4 ac4 = new C23836Ac4(view2);
        AnonymousClass0a4.A06(ac4);
        abt.A00 = ac4;
        this.A03 = new C72723Gt(view2);
        HashSet hashSet = new HashSet();
        hashSet.add(this.A04.A06);
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C0003R.C0005id.iglive_surface_view_frame);
        this.A01 = linearLayout;
        C23553AQx aQx = this.A0D;
        if (aQx != null) {
            C23502AOy aOy = new C23502AOy(linearLayout, true);
            aQx.A06 = aOy;
            C199318fw r4 = new C199318fw(aQx.A03);
            Space space = new Space(aQx.A03);
            aQx.A03 = space;
            aOy.A01(space);
            aOy.A01(r4);
            r4.A2j(new C23516APm(aQx));
            C23553AQx aQx2 = this.A0D;
            aQx2.A06.AuV(this.A01);
        }
        CVK A012 = C16500oh.A00.A01(this.A04, this.A0O, CVR.A03, (SlideContentLayout) view2.findViewById(C0003R.C0005id.interactivity_livewith_question_sticker_container), this.mFragmentManager);
        this.A08 = A012;
        A012.A03(this.A0H);
        A012.A01();
        this.A08.A02(new ANR(this));
        C72773Gy.A03(this.A04, this.A03, hashSet, this.A06, false, false, (String) null, (View.OnClickListener) null, (View.OnClickListener) null);
        AO7 ao7 = new AO7(new ANQ(view2));
        this.A0G = ao7;
        ao7.A00 = this;
        ao7.A01.A01.setVisibility(8);
        this.A05 = C72733Gu.A00(view2, C0003R.C0005id.iglive_livewith_capture_end_stub);
        ViewGroup viewGroup = (ViewGroup) this.A00;
        AnonymousClass0C1 r7 = this.A04;
        C13300iJ r8 = r7.A06;
        AOD aod = this.A07;
        if (aod.A08) {
            z = true;
        }
        z = false;
        this.A0C = new AMI(viewGroup, this, r7, r8, z, new ANI(this), this.A0O, new AOH(this), new C23499AOv(this));
        AnonymousClass0C1 r42 = this.A04;
        this.A0B = new AN2(new AN3(r42, getActivity(), this.A0R));
        C23472ANu aNu = new C23472ANu(r42, this, view2, new C23499AOv(this));
        this.A0F = aNu;
        aNu.A0B = null;
        C23471ANt aNt = new C23471ANt(getActivity(), (ViewGroup) this.A00, this.A01, this.A02, this.A0C, this.A0D, aNu, this.A09, this.A07, this.A04, this);
        this.A0E = aNt;
        aNt.A02();
        this.A0E.A01 = this;
    }

    public final C06590Pq getSession() {
        return this.A04;
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        int A022 = AnonymousClass0Z0.A02(-562708065);
        super.onCreate(bundle);
        this.A04 = AnonymousClass0J1.A06(this.mArguments);
        this.A0H = this.mArguments.getString("args.broadcast_id");
        this.A0I = this.mArguments.getString("args.media_id");
        this.A06 = C13510ie.A00(this.A04).A02(this.mArguments.getString("args.broadcaster_id"));
        String string = this.mArguments.getString("args.tracking_token");
        this.A0N = this.mArguments.getBoolean("args.live_trace_enabled", false);
        Context context = getContext();
        AnonymousClass1L8 A002 = AnonymousClass1L8.A00(this);
        AnonymousClass0C1 r3 = this.A04;
        String string2 = this.mArguments.getString("args.server_info");
        AXY axy = new AXY(context, A002, r3);
        axy.A01 = string2;
        this.A0M = axy;
        axy.A00 = this.A0H;
        AnonymousClass0C1 r4 = this.A04;
        Context context2 = getContext();
        this.A09 = new AnonymousClass7E0(r4, context2, new C15780nW(context2), this, this.A0H, this.A06.getId(), this.A0I, string, this.mArguments.getString("args.invite_type"));
        this.A0L = new AO0(this.A04, getContext(), this);
        this.A07 = new AOD(getContext(), this.A04, this.mArguments.getString("IgLiveCapture.ARGUMENTS_KEY_EXTRA_FACE_EFFECT_ID"), new APR(this));
        C191188Ff A012 = C62742oI.A01(getContext(), this.A04, "live_with_guest");
        this.A02 = A012;
        AnonymousClass7E0 r2 = this.A09;
        if (A012.Aec()) {
            num = Constants.ZERO;
        } else {
            num = Constants.ONE;
        }
        r2.A02 = num;
        C23553AQx aQx = new C23553AQx(getContext().getApplicationContext(), this.A04, this.A0H, this.A0M, this, this.A02, this.A07.A02, this.A09, this.A0L, this.mArguments.getBoolean("args.camera_front_facing", true));
        this.A0D = aQx;
        aQx.A0A = this.A0N;
        C23825Abt abt = new C23825Abt(this.A04, this.A0M, new C205638rB(this));
        this.A0A = abt;
        abt.A07(this.A0H);
        AnonymousClass7E0 r42 = this.A09;
        Integer num2 = r42.A03;
        Integer num3 = Constants.ZERO;
        if (num2 == num3) {
            AnonymousClass0P4 A013 = AnonymousClass7E0.A01(r42, num3);
            AWM.A01(A013, r42.A07, r42.A01);
            AnonymousClass0WN.A01(r42.A0A).BcG(A013);
            r42.A03 = Constants.ONE;
        } else {
            AnonymousClass7E0.A04(r42, num3, "entering guest screen");
        }
        AnonymousClass0Z0.A09(1333341712, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1328268431);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_iglive_livewith, viewGroup, false);
        AnonymousClass0Z0.A09(1584960340, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(1913164800);
        super.onDestroy();
        C23553AQx aQx = this.A0D;
        if (aQx != null) {
            aQx.A08();
            this.A0D = null;
        }
        C23825Abt abt = this.A0A;
        if (abt != null) {
            abt.A05();
            this.A0A = null;
        }
        this.A03 = null;
        this.A09 = null;
        AnonymousClass0Z0.A09(1682248150, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-702546022);
        super.onDestroyView();
        this.A0E.A05.setOnTouchListener((View.OnTouchListener) null);
        this.A0E.A01 = null;
        this.A01 = null;
        this.A0C = null;
        this.A03.A00();
        this.A0E.A00();
        this.A05 = null;
        this.A00 = null;
        this.A0M = null;
        this.A0B = null;
        this.A0F.A0B = null;
        AnonymousClass1X4.A04(getRootActivity().getWindow(), this.mView, true);
        CVK cvk = this.A08;
        if (cvk != null) {
            cvk.destroy();
        }
        this.A08 = null;
        this.A0G.A00 = null;
        this.A0G = null;
        AnonymousClass0Z0.A09(1888326848, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-1072450154);
        super.onPause();
        AnonymousClass7E0 r0 = this.A09;
        AnonymousClass0ZA.A08(r0.A08, r0.A0C);
        C33251cc.A01().A02 = false;
        C23553AQx aQx = this.A0D;
        if (aQx != null) {
            aQx.A0A();
            AnonymousClass7E0 r2 = this.A09;
            Integer num = Constants.A0j;
            AnonymousClass0WN.A01(r2.A0A).BcG(AnonymousClass7E0.A02(r2, num, num));
        }
        AnonymousClass0Z0.A09(851617183, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-206341143);
        super.onResume();
        AnonymousClass1X4.A04(getRootActivity().getWindow(), this.mView, false);
        AnonymousClass7E0 r1 = this.A09;
        r1.A0B.A01();
        if (r1.A05) {
            AnonymousClass7E0.A03(r1);
        }
        C33251cc.A01().A02 = true;
        C23553AQx aQx = this.A0D;
        if (aQx != null) {
            aQx.A09 = false;
            if (!aQx.A07) {
                if (aQx.A02 != null) {
                    C23553AQx.A02(aQx);
                }
                aQx.A0L.A01();
            }
            AnonymousClass7E0 r3 = this.A09;
            Integer num = Constants.A0j;
            if (r3.A03 == Constants.A0C) {
                AnonymousClass0WN.A01(r3.A0A).BcG(AnonymousClass7E0.A02(r3, Constants.A0u, num));
            }
        }
        AnonymousClass0Z0.A09(1094330358, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0Z0.A02(1997203768);
        super.onStart();
        C23471ANt aNt = this.A0E;
        aNt.A07.BOP(aNt.A04);
        if (getRootActivity() instanceof C26301Cs) {
            ((C26301Cs) getRootActivity()).Bl6(8);
        }
        AnonymousClass0Z0.A09(1436640564, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0Z0.A02(1787113565);
        super.onStop();
        this.A0E.A07.BP6();
        if (getRootActivity() instanceof C26301Cs) {
            ((C26301Cs) getRootActivity()).Bl6(0);
        }
        AnonymousClass0Z0.A09(-1321532387, A022);
    }
}
