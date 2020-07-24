package p000X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.igds.components.stepperheader.StepperHeader;
import com.instagram.p009ui.widget.radiogroup.IgRadioGroup;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import java.util.HashMap;

/* renamed from: X.CCI */
public final class CCI extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, C27516CGg {
    public View A00;
    public View A01;
    public ViewStub A02;
    public ViewStub A03;
    public TextView A04;
    public CD8 A05;
    public CD3 A06;
    public CDA A07;
    public StepperHeader A08;
    public AnonymousClass0C1 A09;
    public SpinnerImageView A0A;
    public boolean A0B;
    public C26915Bue A0C;

    public final String getModuleName() {
        return "promote_destination";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final boolean onBackPressed() {
        CCZ.A07(this.A06, C27398CBr.DESTINATION, "cancel_button");
        return false;
    }

    public final void BGX(CDA cda, Integer num) {
        if (num.intValue() == 0) {
            this.A0C.A01(this.A07.A03);
        }
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        r4.BlI(C0003R.string.promote_destination_screen_title);
        boolean z = this.A06.A12;
        int i = C0003R.C0004drawable.instagram_x_outline_24;
        if (z) {
            i = C0003R.C0004drawable.instagram_arrow_back_24;
        }
        r4.Bg9(i);
        C26915Bue bue = new C26915Bue(getContext(), r4);
        this.A0C = bue;
        if (this.A06.A0v) {
            bue.A00(Constants.A12, new C27401CBu(this));
        } else {
            bue.A00(Constants.ONE, new C27425CCt(this));
        }
        CDA cda = this.A07;
        if (cda != null) {
            this.A0C.A01(cda.A03);
        }
    }

    public final C06590Pq getSession() {
        return this.A09;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1425894120);
        View inflate = layoutInflater.inflate(C0003R.layout.promote_destination_view, viewGroup, false);
        AnonymousClass0Z0.A09(-1240214895, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1512964252);
        CCZ.A03(this.A06, C27398CBr.DESTINATION);
        this.A07.A0D(this);
        super.onDestroyView();
        AnonymousClass0Z0.A09(-766470075, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        FragmentActivity activity = getActivity();
        this.A06 = ((C945346y) activity).AT6();
        CDA AT7 = ((CC9) activity).AT7();
        this.A07 = AT7;
        AT7.A0C(this);
        AnonymousClass0C1 r2 = this.A06.A0Q;
        this.A09 = r2;
        FragmentActivity activity2 = getActivity();
        this.A05 = new CD8(r2, activity2, activity2);
        this.A03 = (ViewStub) view.findViewById(C0003R.C0005id.main_container_stub);
        this.A0A = (SpinnerImageView) view.findViewById(C0003R.C0005id.loading_spinner);
        ((BaseFragmentActivity) getActivity()).A0U();
        this.A0A.setLoadingStatus(C168617Hz.SUCCESS);
        View inflate = this.A03.inflate();
        this.A01 = inflate;
        this.A08 = (StepperHeader) inflate.findViewById(C0003R.C0005id.stepper_header);
        this.A02 = (ViewStub) this.A01.findViewById(C0003R.C0005id.education_bar_stub);
        if (this.A06.A0v) {
            this.A08.setVisibility(8);
        } else {
            this.A08.A04(0, this.A0B);
        }
        this.A08.A02();
        TextView textView = (TextView) this.A01.findViewById(C0003R.C0005id.promote_header);
        this.A04 = textView;
        textView.setText(C0003R.string.promote_destination_header);
        View view2 = this.A01;
        CD3 cd3 = this.A06;
        CDA cda = this.A07;
        FragmentActivity activity3 = getActivity();
        AnonymousClass11J.A00(activity3);
        IgRadioGroup igRadioGroup = (IgRadioGroup) view2.findViewById(C0003R.C0005id.destination_option_group);
        String AZn = cd3.A0Q.A06.AZn();
        CCK cck = new CCK(activity3, false);
        cck.setTag(CCN.PROFILE_VISITS);
        cck.setPrimaryText(activity3.getString(C0003R.string.promote_destination_profile_option));
        String concat = "@".concat(AZn);
        cck.setSecondaryText(concat);
        cck.A3h(new CCW(cck));
        CCK cck2 = new CCK(activity3, false);
        cck2.setTag(CCN.WEBSITE_CLICK);
        cck2.setPrimaryText(activity3.getString(C0003R.string.promote_destination_website_option));
        String A012 = C27411CCe.A01(activity3, cd3.A0U, cd3.A0A);
        if (!TextUtils.isEmpty(A012)) {
            cck2.setSecondaryText(A012);
        }
        CCG ccg = new CCG(activity3, cd3);
        cck2.setActionLabel(activity3.getString(C0003R.string.promote_edit), ccg);
        cck2.setSubtitleContainerOnClickListener(ccg);
        cck2.A3h(new CCP(cck2));
        CCK cck3 = new CCK(activity3, false);
        cck3.setTag(CCN.A02);
        cck3.setPrimaryText(activity3.getString(C0003R.string.promote_destination_direct_message_option));
        cck3.setSecondaryText(concat);
        cck3.A3h(new CCX(cck3));
        igRadioGroup.A02 = new CCJ(cda, cd3, cck2, activity3);
        igRadioGroup.removeAllViews();
        igRadioGroup.addView(cck);
        igRadioGroup.addView(cck2);
        igRadioGroup.addView(cck3);
        if (cda.A03) {
            igRadioGroup.A01(igRadioGroup.findViewWithTag(cd3.A0D).getId());
        } else {
            igRadioGroup.A01(-1);
        }
        View inflate2 = this.A02.inflate();
        this.A00 = inflate2;
        ((TextView) inflate2.findViewById(C0003R.C0005id.bottom_bar_text)).setText(C0003R.string.promote_destination_education_bar_text);
        this.A00.setOnClickListener(new C27393CBm(this));
        C16180oA A002 = C16180oA.A00(this.A09);
        if (!this.A06.A0q && (!A002.A00.getBoolean("has_seen_promote_nux", false) || this.A06.A0p)) {
            if (!A002.A00.getBoolean("has_seen_promote_nux", false) && !this.A06.A0p) {
                A002.A00.edit().putBoolean("has_seen_promote_nux", true).apply();
            }
            C16310oO.A00.A02();
            CCA cca = new CCA();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("step", C27398CBr.DESTINATION);
            bundle2.putBoolean("is_enter_flow_nux", true);
            cca.setArguments(bundle2);
            C52362Om r4 = new C52362Om(getActivity(), this.A09);
            r4.A02 = cca;
            r4.A05(C0003R.anim.bottom_in, C0003R.anim.top_out, C0003R.anim.top_in, C0003R.anim.bottom_out);
            r4.A04();
        }
        CD3 cd32 = this.A06;
        if (!cd32.A0q) {
            C27398CBr cBr = C27398CBr.DESTINATION;
            AnonymousClass0P4 A003 = AnonymousClass2VV.A00(Constants.ONE);
            A003.A0G("step", cBr.toString());
            CCZ.A0G(cd32, A003);
            this.A06.A0q = true;
        }
        CD3 cd33 = this.A06;
        CCN ccn = cd33.A0C;
        if (ccn == null || cd33.A0c == null || cd33.A0B == null) {
            CCZ.A04(cd33, C27398CBr.DESTINATION);
        } else {
            C27398CBr cBr2 = C27398CBr.DESTINATION;
            HashMap hashMap = new HashMap();
            hashMap.put("prefill_destination", ccn.toString());
            hashMap.put("prefill_website", cd33.A0c);
            hashMap.put("prefill_website_cta", cd33.A0B.toString());
            AnonymousClass0P4 A004 = AnonymousClass2VV.A00(Constants.A0Y);
            A004.A0G("step", cBr2.toString());
            C06270Ok A005 = C06270Ok.A00();
            A005.A0C(hashMap);
            A004.A08("configurations", A005);
            CCZ.A0G(cd33, A004);
        }
        super.onViewCreated(view, bundle);
    }
}
