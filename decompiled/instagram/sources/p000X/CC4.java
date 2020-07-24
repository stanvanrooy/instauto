package p000X;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgSimpleImageView;
import com.instagram.igds.components.stepperheader.StepperHeader;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.CC4 */
public final class CC4 extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, C27516CGg {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public FragmentActivity A04;
    public AnonymousClass1AM A05;
    public CD8 A06;
    public C26915Bue A07;
    public CDC A08;
    public C27416CCk A09;
    public CD3 A0A;
    public C26905BuU A0B;
    public CDA A0C;
    public IgSimpleImageView A0D;
    public IgSimpleImageView A0E;
    public IgSwitch A0F;
    public C56202c6 A0G;
    public AnonymousClass0C1 A0H;
    public boolean A0I;
    public boolean A0J;
    public View A0K;
    public ViewStub A0L;
    public ViewStub A0M;
    public TextView A0N;
    public C17920r1 A0O = new CD6(this);
    public AnonymousClass2TI A0P;
    public StepperHeader A0Q;
    public SpinnerImageView A0R;
    public SpinnerImageView A0S;

    public final String getModuleName() {
        return "promote_audience";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    private void A00() {
        View view;
        this.A0S.setLoadingStatus(C168617Hz.SUCCESS);
        View inflate = this.A0M.inflate();
        this.A0R = (SpinnerImageView) inflate.findViewById(C0003R.C0005id.audience_list_loading_spinner);
        this.A0L = (ViewStub) inflate.findViewById(C0003R.C0005id.education_bar_stub);
        StepperHeader stepperHeader = (StepperHeader) inflate.findViewById(C0003R.C0005id.stepper_header);
        this.A0Q = stepperHeader;
        if (this.A0B == C26905BuU.HEC_APPEAL || this.A0A.A0v) {
            stepperHeader.setVisibility(8);
        } else {
            stepperHeader.A04(1, this.A0I);
            this.A0Q.A02();
        }
        TextView textView = (TextView) inflate.findViewById(C0003R.C0005id.promote_header);
        this.A0N = textView;
        textView.setText(C0003R.string.promote_audience_header);
        this.A00 = inflate.findViewById(C0003R.C0005id.create_audience_row);
        this.A03 = inflate.findViewById(C0003R.C0005id.promote_special_requirement_switch_row);
        boolean z = this.A0J;
        int i = C0003R.C0005id.promote_special_requirement_down_button_row;
        if (z) {
            i = C0003R.C0005id.promote_special_requirement_second_row;
        }
        this.A02 = inflate.findViewById(i);
        CD3 cd3 = this.A0A;
        if (!cd3.A0v && (this.A0B == C26905BuU.HEC_APPEAL || cd3.A0z)) {
            this.A03.setVisibility(0);
            ((TextView) this.A03.findViewById(C0003R.C0005id.primary_text)).setText(C0003R.string.promote_special_requirement_switch_button_title);
            TextView textView2 = (TextView) this.A03.findViewById(C0003R.C0005id.secondary_text);
            textView2.setText(C0003R.string.promote_special_requirement_switch_button_subtitle);
            textView2.setVisibility(0);
            this.A09 = new C27416CCk();
            IgSwitch igSwitch = (IgSwitch) this.A03.findViewById(C0003R.C0005id.promote_row_switch);
            this.A0F = igSwitch;
            igSwitch.setToggleListener(new CC5(this));
            this.A0E = (IgSimpleImageView) this.A03.findViewById(C0003R.C0005id.promote_row_drop_down_icon);
            this.A01 = this.A02.findViewById(C0003R.C0005id.promote_special_requirement_divider);
            this.A0D = (IgSimpleImageView) this.A02.findViewById(C0003R.C0005id.promote_row_with_down_button);
            if (this.A0J) {
                this.A0E.setVisibility(0);
                this.A01.setVisibility(0);
                this.A0F.setVisibility(8);
                this.A03.setOnClickListener(new CC6(this));
            } else {
                this.A0E.setVisibility(8);
                this.A01.setVisibility(8);
                this.A0F.setVisibility(0);
                this.A0D.setVisibility(0);
            }
            CCZ.A08(this.A0A, C27398CBr.AUDIENCE, "regulated_category_switch");
            this.A02.setOnClickListener(new CC8(this));
            if (this.A0A.A0O != null) {
                this.A0F.setChecked(true);
                A01();
            }
            if (this.A0J) {
                A02();
            }
        }
        CD3 cd32 = this.A0A;
        CDA cda = this.A0C;
        FragmentActivity activity = getActivity();
        AnonymousClass11J.A00(activity);
        CDC cdc = new CDC(inflate, cd32, cda, activity);
        this.A08 = cdc;
        cdc.A02();
        TextView textView3 = (TextView) this.A00.findViewById(C0003R.C0005id.primary_text);
        textView3.setText(C0003R.string.promote_create_new_audience_title);
        textView3.setVisibility(0);
        TextView textView4 = (TextView) this.A00.findViewById(C0003R.C0005id.secondary_text);
        textView4.setText(C0003R.string.promote_create_new_audience_subtitle);
        textView4.setVisibility(0);
        this.A00.setOnClickListener(new CBZ(this));
        View inflate2 = this.A0L.inflate();
        this.A0K = inflate2;
        ((TextView) inflate2.findViewById(C0003R.C0005id.bottom_bar_text)).setText(C0003R.string.promote_audience_education_bar_text);
        this.A0K.setOnClickListener(new C27392CBl(this));
        if (this.A0B == C26905BuU.HEC_APPEAL) {
            C16180oA A002 = C16180oA.A00(this.A0H);
            if (this.A0J) {
                view = this.A0E;
            } else {
                view = this.A0F;
            }
            if (view != null && !A002.A00.getBoolean("has_seen_hec_appeal_tooltip", false)) {
                if (this.A0G == null) {
                    C56142c0 r3 = new C56142c0(getActivity(), new AnonymousClass95U((int) C0003R.string.promote_audience_hec_appeal_tooltip));
                    r3.A02(view);
                    r3.A05 = C56162c2.ABOVE_ANCHOR;
                    this.A0G = r3.A00();
                }
                view.post(new CBX(this, A002));
            }
        }
    }

    private void A01() {
        View view = this.A02;
        if (view != null && !this.A0J) {
            if (this.A0A.A0O == null) {
                view.setVisibility(8);
                return;
            }
            view.setVisibility(0);
            ((TextView) this.A02.findViewById(C0003R.C0005id.promote_row_with_down_primary_text)).setText(this.A0A.A0O.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (r1 != false) goto L_0x0070;
     */
    private void A02() {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        View view = this.A02;
        if (view != null) {
            CD3 cd3 = this.A0A;
            Map map = cd3.A0o;
            CC7 cc7 = CC7.CREDIT;
            if (map.containsKey(cc7)) {
                z = ((Boolean) cd3.A0o.get(cc7)).booleanValue();
            } else {
                z = false;
            }
            int i2 = 8;
            if (!z) {
                CD3 cd32 = this.A0A;
                Map map2 = cd32.A0o;
                CC7 cc72 = CC7.EMPLOYMENT;
                if (map2.containsKey(cc72)) {
                    z6 = ((Boolean) cd32.A0o.get(cc72)).booleanValue();
                } else {
                    z6 = false;
                }
                if (!z6) {
                    CD3 cd33 = this.A0A;
                    Map map3 = cd33.A0o;
                    CC7 cc73 = CC7.HOUSING;
                    if (map3.containsKey(cc73)) {
                        z7 = ((Boolean) cd33.A0o.get(cc73)).booleanValue();
                    } else {
                        z7 = false;
                    }
                    if (!z7) {
                        CD3 cd34 = this.A0A;
                        Map map4 = cd34.A0o;
                        CC7 cc74 = CC7.POLITICAL;
                        if (map4.containsKey(cc74)) {
                            z8 = ((Boolean) cd34.A0o.get(cc74)).booleanValue();
                        } else {
                            z8 = false;
                        }
                        i = 8;
                    }
                }
            }
            i = 0;
            view.setVisibility(i);
            View findViewById = this.A02.findViewById(C0003R.C0005id.promote_special_requirement_secondary_row_credit);
            if (findViewById != null) {
                CD3 cd35 = this.A0A;
                Map map5 = cd35.A0o;
                CC7 cc75 = CC7.CREDIT;
                if (map5.containsKey(cc75)) {
                    z5 = ((Boolean) cd35.A0o.get(cc75)).booleanValue();
                } else {
                    z5 = false;
                }
                int i3 = 8;
                if (z5) {
                    i3 = 0;
                }
                findViewById.setVisibility(i3);
            }
            View findViewById2 = this.A02.findViewById(C0003R.C0005id.promote_special_requirement_secondary_row_employment);
            if (findViewById2 != null) {
                CD3 cd36 = this.A0A;
                Map map6 = cd36.A0o;
                CC7 cc76 = CC7.EMPLOYMENT;
                if (map6.containsKey(cc76)) {
                    z4 = ((Boolean) cd36.A0o.get(cc76)).booleanValue();
                } else {
                    z4 = false;
                }
                int i4 = 8;
                if (z4) {
                    i4 = 0;
                }
                findViewById2.setVisibility(i4);
            }
            View findViewById3 = this.A02.findViewById(C0003R.C0005id.promote_special_requirement_secondary_row_housing);
            if (findViewById3 != null) {
                CD3 cd37 = this.A0A;
                Map map7 = cd37.A0o;
                CC7 cc77 = CC7.HOUSING;
                if (map7.containsKey(cc77)) {
                    z3 = ((Boolean) cd37.A0o.get(cc77)).booleanValue();
                } else {
                    z3 = false;
                }
                int i5 = 8;
                if (z3) {
                    i5 = 0;
                }
                findViewById3.setVisibility(i5);
            }
            View findViewById4 = this.A02.findViewById(C0003R.C0005id.promote_special_requirement_secondary_row_political);
            if (findViewById4 != null) {
                CD3 cd38 = this.A0A;
                Map map8 = cd38.A0o;
                CC7 cc78 = CC7.POLITICAL;
                if (map8.containsKey(cc78)) {
                    z2 = ((Boolean) cd38.A0o.get(cc78)).booleanValue();
                } else {
                    z2 = false;
                }
                if (z2) {
                    i2 = 0;
                }
                findViewById4.setVisibility(i2);
            }
        }
    }

    public static void A03(CC4 cc4) {
        AnonymousClass2TI A002 = new AnonymousClass2TH(cc4.A0H).A00();
        FragmentActivity activity = cc4.getActivity();
        AnonymousClass11J.A00(activity);
        AnonymousClass2TI A022 = A002.A02(activity, cc4.A09);
        cc4.A0P = A022;
        cc4.A09.A04 = A022;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r4.A0A.A0O != null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r1.A01 == false) goto L_0x000e;
     */
    public static void A04(CC4 cc4) {
        boolean z;
        boolean z2;
        CDA cda = cc4.A0C;
        boolean z3 = true;
        if (cda != null && cda.A02) {
            z = true;
        }
        z = false;
        if (cc4.A0B == C26905BuU.HEC_APPEAL) {
            z2 = false;
        }
        z2 = true;
        C26915Bue bue = cc4.A07;
        if (!z || !z2) {
            z3 = false;
        }
        bue.A01(z3);
    }

    public static void A05(CC4 cc4, boolean z) {
        CDC cdc = cc4.A08;
        if (cdc != null && cc4.A00 != null) {
            if (z) {
                cc4.A0R.setLoadingStatus(C168617Hz.SUCCESS);
                cc4.A08.A06.setVisibility(0);
                if (cc4.A0A.A0O == null) {
                    cc4.A00.setVisibility(0);
                } else {
                    cc4.A00.setVisibility(8);
                }
            } else {
                cdc.A06.setVisibility(8);
                cc4.A00.setVisibility(8);
                cc4.A0R.setLoadingStatus(C168617Hz.LOADING);
            }
        }
    }

    public final boolean onBackPressed() {
        CCZ.A07(this.A0A, C27398CBr.AUDIENCE, "back_button");
        return false;
    }

    public final void BGX(CDA cda, Integer num) {
        IgSwitch igSwitch;
        switch (num.intValue()) {
            case 1:
                if (cda.A00) {
                    CDC cdc = this.A08;
                    if (cdc != null) {
                        cdc.A02();
                        return;
                    } else {
                        A00();
                        return;
                    }
                } else {
                    this.A06.A03(this.A0O);
                    return;
                }
            case 2:
                if (this.A07 != null) {
                    A04(this);
                    return;
                }
                return;
            case C120125Dh.VIEW_TYPE_BANNER:
                if (this.A0J) {
                    A02();
                    this.A0C.A01();
                    AnonymousClass0ZA.A0E(new Handler(), new AnonymousClass6PS(this), 1270409046);
                    return;
                }
                this.A0C.A01();
                A01();
                if (this.A03.getVisibility() == 0 && this.A0P != null) {
                    if (!(this.A0A.A0O == null || (igSwitch = this.A0F) == null)) {
                        igSwitch.setChecked(true);
                    }
                    AnonymousClass0ZA.A0E(new Handler(), new AnonymousClass6PS(this), 1270409046);
                    this.A0P.A04();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        r4.BlI(C0003R.string.promote_audience_screen_title);
        r4.Bo6(true);
        C26915Bue bue = new C26915Bue(getContext(), r4);
        this.A07 = bue;
        if (this.A0A.A0v) {
            bue.A00(Constants.A12, new C27402CBv(this));
        } else if (this.A0B == C26905BuU.HEC_APPEAL) {
            bue.A00(Constants.A12, new CC3(this));
        } else {
            bue.A00(Constants.ONE, new C27403CBw(this));
        }
        A04(this);
    }

    public final C06590Pq getSession() {
        return this.A0H;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-182518220);
        FragmentActivity activity = getActivity();
        AnonymousClass11J.A01(activity, "Fragment Activity should not be null in onCreate, which happens after onAttach");
        this.A04 = activity;
        this.A05 = activity.A05();
        super.onCreate(bundle);
        AnonymousClass0Z0.A09(-151255263, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-273394222);
        View inflate = layoutInflater.inflate(C0003R.layout.promote_audience_view, viewGroup, false);
        AnonymousClass0Z0.A09(-1356755969, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1659107221);
        this.A0R = null;
        this.A08 = null;
        this.A02 = null;
        this.A0C.A0D(this);
        CCZ.A03(this.A0A, C27398CBr.AUDIENCE);
        super.onDestroyView();
        AnonymousClass0Z0.A09(1970606577, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        FragmentActivity activity = getActivity();
        CD3 AT6 = ((C945346y) activity).AT6();
        this.A0A = AT6;
        this.A0C = ((CC9) activity).AT7();
        AnonymousClass0C1 r0 = AT6.A0Q;
        this.A0H = r0;
        this.A0J = C24001AgJ.A00(r0);
        this.A0C.A0C(this);
        this.A06 = new CD8(this.A0A.A0Q, getActivity(), this);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0B = (C26905BuU) bundle2.getSerializable("promoteLaunchOrigin");
        }
        this.A0M = (ViewStub) view.findViewById(C0003R.C0005id.main_container_stub);
        SpinnerImageView spinnerImageView = (SpinnerImageView) view.findViewById(C0003R.C0005id.loading_spinner);
        this.A0S = spinnerImageView;
        if (this.A0C.A00) {
            A00();
        } else {
            spinnerImageView.setLoadingStatus(C168617Hz.LOADING);
            this.A06.A03(this.A0O);
        }
        CD3 cd3 = this.A0A;
        String str = cd3.A0b;
        if (str != null) {
            C27398CBr cBr = C27398CBr.AUDIENCE;
            HashMap hashMap = new HashMap();
            hashMap.put("prefill_audience", str);
            AnonymousClass0P4 A002 = AnonymousClass2VV.A00(Constants.A0Y);
            A002.A0G("step", cBr.toString());
            C06270Ok A003 = C06270Ok.A00();
            A003.A0C(hashMap);
            A002.A08("configurations", A003);
            CCZ.A0G(cd3, A002);
        } else {
            CCZ.A04(cd3, C27398CBr.AUDIENCE);
        }
        super.onViewCreated(view, bundle);
    }
}
