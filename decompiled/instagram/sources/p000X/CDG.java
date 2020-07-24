package p000X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgEditText;
import com.instagram.p009ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.CDG */
public final class CDG extends C27341Hl implements C60962kt, C27522CGm {
    public C27434CDc A00;
    public CD3 A01;
    public CCK A02;
    public IgEditText A03;
    public AnonymousClass0C1 A04;
    public IgRadioGroup A05;
    public CD8 A06;
    public CDA A07;

    public final boolean A55() {
        return true;
    }

    public final int AIh() {
        return -2;
    }

    public final int AYd() {
        return 0;
    }

    public final float AdY() {
        return 1.0f;
    }

    public final boolean AeS() {
        return true;
    }

    public final boolean AhU() {
        return true;
    }

    public final float Aol() {
        return 1.0f;
    }

    public final void AtY(int i, int i2) {
    }

    public final void B8h() {
    }

    public final void B8j(int i) {
    }

    public final boolean BmS() {
        return true;
    }

    public final String getModuleName() {
        return "quick_promote_save_setting_bottom_sheet";
    }

    public final void Aqn() {
        CDA cda = this.A07;
        CD3 cd3 = this.A01;
        cda.A07(cd3, cd3.A0E);
        if (this.A05.A00 == this.A02.getId()) {
            this.A07.A09(this.A01, (String) null);
        } else {
            String obj = this.A03.getText().toString();
            if (!AnonymousClass1BX.A00(obj)) {
                this.A01.A0V = obj;
                CDA.A00(this.A07, Constants.A05);
            }
            C06220Of.A0E(this.A03);
        }
        this.A06.A01(new CDL(this));
    }

    public final void AtV() {
        C06220Of.A0E(this.A03);
    }

    public static void A00(CDG cdg, String str) {
        Context context = cdg.getContext();
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                str = cdg.getString(C0003R.string.promote_review_create_promotion_error_message);
            }
            C53642Tq.A01(context, str, 0).show();
        }
    }

    public final int AGx(Context context) {
        return ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final View AXo() {
        return this.mView;
    }

    public final C06590Pq getSession() {
        return this.A04;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1539104529);
        View inflate = layoutInflater.inflate(C0003R.layout.quick_promote_save_setting_screen_bottom_sheet_view, viewGroup, false);
        AnonymousClass0Z0.A09(-657800793, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        C945346y r0 = (C945346y) activity;
        AnonymousClass0a4.A06(r0);
        CD3 AT6 = r0.AT6();
        this.A01 = AT6;
        CC9 cc9 = (CC9) activity;
        AnonymousClass0a4.A06(cc9);
        this.A07 = cc9.AT7();
        AnonymousClass0C1 r1 = AT6.A0Q;
        this.A04 = r1;
        AnonymousClass0a4.A06(activity);
        this.A06 = new CD8(r1, activity, activity);
        this.A03 = (IgEditText) view.findViewById(C0003R.C0005id.rename_edit_text);
        this.A05 = (IgRadioGroup) view.findViewById(C0003R.C0005id.save_options_group);
        C27434CDc cDc = new C27434CDc(view, C27398CBr.QUICK_PROMOTE_SAVE_SETTING);
        this.A00 = cDc;
        cDc.A00();
        C27433CDb.A00(this.A00, this, C0003R.string.quick_promote_confirm_button_text);
        this.A00.A02(false);
        this.A03.addTextChangedListener(new CFY(this));
        Context context = getContext();
        AnonymousClass0a4.A06(context);
        CCK cck = new CCK(context, false);
        cck.setPrimaryText((int) C0003R.string.quick_promote_save_option_text);
        this.A02 = cck;
        this.A05.addView(cck);
        IgRadioGroup igRadioGroup = this.A05;
        Context context2 = getContext();
        AnonymousClass0a4.A06(context2);
        CCK cck2 = new CCK(context2, false);
        cck2.setPrimaryText((int) C0003R.string.quick_promote_save_as_option_text);
        igRadioGroup.addView(cck2);
        IgRadioGroup igRadioGroup2 = this.A05;
        igRadioGroup2.A02 = new CF6(this);
        igRadioGroup2.A01(this.A02.getId());
    }
}
