package com.instagram.business.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.facebook.C0003R;
import com.instagram.business.activity.FbConnectPageActivity;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.registration.model.RegFlowExtras;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1HU;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass2NN;
import p000X.AnonymousClass3BL;
import p000X.AnonymousClass59W;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass61H;
import p000X.AnonymousClass62M;
import p000X.AnonymousClass62P;
import p000X.AnonymousClass62Q;
import p000X.AnonymousClass643;
import p000X.AnonymousClass645;
import p000X.AnonymousClass65P;
import p000X.C06270Ok;
import p000X.C06590Pq;
import p000X.C1190058s;
import p000X.C119945Cp;
import p000X.C119955Cq;
import p000X.C120565Fc;
import p000X.C128275eQ;
import p000X.C14100jl;
import p000X.C1414262u;
import p000X.C1416563w;
import p000X.C16310oO;
import p000X.C33831dZ;
import p000X.C52362Om;
import p000X.C62652o6;

public final class EditBusinessFBPageFragment extends AnonymousClass2NN implements AnonymousClass1HK, AnonymousClass1HM, C119955Cq, AnonymousClass65P {
    public View A00;
    public ImageView A01;
    public ViewSwitcher A02;
    public C1416563w A03;
    public AnonymousClass645 A04;
    public AnonymousClass645 A05;
    public AnonymousClass0C1 A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public TextView A0D;

    public static void A01(EditBusinessFBPageFragment editBusinessFBPageFragment, AnonymousClass645 r9) {
        EditBusinessFBPageFragment editBusinessFBPageFragment2 = editBusinessFBPageFragment;
        if (r9 == null || !r9.A00(editBusinessFBPageFragment.A06.A06)) {
            C119945Cp.A00(editBusinessFBPageFragment.getContext(), r9.A07, r9.A04, C14100jl.A00(editBusinessFBPageFragment.A06), editBusinessFBPageFragment.A08, "edit_profile_flow", editBusinessFBPageFragment2, editBusinessFBPageFragment.A06, editBusinessFBPageFragment2);
        } else {
            editBusinessFBPageFragment.A03(r9);
        }
    }

    public final void BJB() {
        this.A03.A03 = false;
        this.A02.setDisplayedChild(0);
    }

    public final void BJH() {
        this.A03.A03 = true;
        this.A02.setDisplayedChild(1);
    }

    public final String getModuleName() {
        return "edit_business_fb_page";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A02(EditBusinessFBPageFragment editBusinessFBPageFragment, String str) {
        if (editBusinessFBPageFragment.A0B) {
            AnonymousClass0C1 r6 = editBusinessFBPageFragment.A06;
            String str2 = editBusinessFBPageFragment.A08;
            String str3 = editBusinessFBPageFragment.A07;
            String A012 = C14100jl.A01(r6);
            AnonymousClass0P4 A002 = C1414262u.A00(Constants.A0j);
            A002.A0G("step", "create_page");
            A002.A0G("entry_point", str2);
            A002.A0G("fb_user_id", A012);
            A002.A0G("page_id", str3);
            A002.A0G("default_values", str);
            AnonymousClass0WN.A01(r6).BcG(A002);
        }
    }

    private void A03(AnonymousClass645 r6) {
        String str = r6.A08;
        String string = requireContext().getString(C0003R.string.page_is_already_linked_message, new Object[]{str});
        AnonymousClass3BL.A07(requireContext(), str);
        A04(r6.A07, string);
    }

    private void A04(String str, String str2) {
        String str3;
        AnonymousClass0C1 r6 = this.A06;
        String str4 = this.A08;
        AnonymousClass645 r0 = this.A05;
        if (r0 == null) {
            str3 = null;
        } else {
            str3 = r0.A07;
        }
        String A012 = C14100jl.A01(r6);
        C06270Ok A002 = C06270Ok.A00();
        A002.A09("page_id", str3);
        C06270Ok A003 = C06270Ok.A00();
        A003.A09("page_id", str);
        AnonymousClass0P4 A004 = C1414262u.A00(Constants.A14);
        A004.A0G("entry_point", str4);
        A004.A0G("fb_user_id", A012);
        A004.A0G("step", "page_change");
        A004.A08("default_values", A002);
        A004.A08("selected_values", A003);
        A004.A0G("error_message", str2);
        AnonymousClass0WN.A01(r6).BcG(A004);
    }

    public final void A06() {
        AnonymousClass0C1 r5 = this.A06;
        Context context = getContext();
        AnonymousClass643.A00(context, AnonymousClass1L8.A00(this), this.A06, new AnonymousClass62P(this, r5, context, this.A08, this.A04), (String) null);
    }

    public final void Aye() {
        String str;
        if (C1190058s.A04(this.A06)) {
            Context context = getContext();
            AnonymousClass0C1 r4 = this.A06;
            C1190058s.A03(context, r4, this, true, new AnonymousClass59W(this, context, r4, this, this.A08));
            return;
        }
        AnonymousClass645 r1 = this.A03.A00;
        AnonymousClass0C1 r42 = this.A06;
        String str2 = this.A08;
        List list = this.A0A;
        if (r1 == null) {
            str = null;
        } else {
            str = r1.A07;
        }
        AnonymousClass61H.A02(r42, "create_page", str2, list, str, C14100jl.A01(r42));
        String string = this.mArguments.getString("edit_profile_entry");
        this.A0B = true;
        this.A07 = null;
        AnonymousClass1HD A062 = C16310oO.A00.A00().A06(this.A08, string, (String) null, false, true, (RegFlowExtras) null, (PageSelectionOverrideData) null);
        A062.setTargetFragment(this, 0);
        C52362Om r2 = new C52362Om(getActivity(), this.A06);
        r2.A02 = A062;
        r2.A04 = "com.instagram.business.fragment.EditBusinessFBPageFragment";
        r2.A02();
    }

    public final void BDj(AnonymousClass645 r3) {
        if (r3.A00(this.A06.A06)) {
            A03(r3);
            return;
        }
        this.A05 = this.A04;
        this.A04 = r3;
        C1416563w r1 = this.A03;
        r1.A01 = r1.A00;
        r1.A00 = r3;
        C1416563w.A00(r1);
        A00();
    }

    public final void BJU(String str) {
        String str2;
        AnonymousClass0C1 r6 = this.A06;
        String str3 = this.A08;
        AnonymousClass645 r0 = this.A05;
        if (r0 == null) {
            str2 = null;
        } else {
            str2 = r0.A07;
        }
        String A012 = C14100jl.A01(r6);
        C06270Ok A002 = C06270Ok.A00();
        A002.A09("page_id", str2);
        C06270Ok A003 = C06270Ok.A00();
        A003.A09("page_id", str);
        AnonymousClass0P4 A004 = C1414262u.A00(Constants.A12);
        A004.A0G("entry_point", str3);
        A004.A0G("fb_user_id", A012);
        A004.A0G("step", "page_change");
        A004.A08("default_values", A002);
        A004.A08("selected_values", A003);
        AnonymousClass0WN.A01(r6).BcG(A004);
        this.A0C = true;
        if (!A05(this)) {
            getActivity().onBackPressed();
        }
    }

    public final void BmN(AnonymousClass645 r6) {
        String str;
        AnonymousClass645 r2;
        AnonymousClass645 r0 = this.A04;
        this.A05 = r0;
        C1416563w r4 = this.A03;
        if (r0 == null) {
            str = this.A09;
        } else {
            str = r0.A07;
        }
        if (str != null) {
            Iterator it = r4.A05.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r2 = (AnonymousClass645) it.next();
                if (r2.A07.equals(str)) {
                    break;
                }
            }
        }
        r2 = null;
        if (r2 != null) {
            r4.A01 = r4.A00;
            r4.A00 = r2;
        }
    }

    public final boolean onBackPressed() {
        if (!this.A0C) {
            AnonymousClass0C1 r5 = this.A06;
            String str = this.A08;
            String A012 = C14100jl.A01(r5);
            AnonymousClass0P4 A002 = C1414262u.A00(Constants.A0u);
            A002.A0G("entry_point", str);
            A002.A0G("fb_user_id", A012);
            A002.A0G("step", "page_change");
            AnonymousClass0WN.A01(r5).BcG(A002);
        }
        return A05(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0.A07.equals(r4.A09) != false) goto L_0x0019;
     */
    private void A00() {
        ViewSwitcher viewSwitcher;
        boolean z;
        if (isResumed() && (viewSwitcher = this.A02) != null) {
            AnonymousClass645 r0 = this.A04;
            if (r0 != null) {
                z = true;
            }
            z = false;
            viewSwitcher.setEnabled(z);
            TextView textView = this.A0D;
            ColorStateList textColors = textView.getTextColors();
            int i = 64;
            if (z) {
                i = 255;
            }
            textView.setTextColor(textColors.withAlpha(i));
        }
    }

    public static boolean A05(EditBusinessFBPageFragment editBusinessFBPageFragment) {
        String str;
        if (!(editBusinessFBPageFragment.getActivity() instanceof FbConnectPageActivity)) {
            return false;
        }
        Intent intent = new Intent();
        AnonymousClass645 r0 = editBusinessFBPageFragment.A04;
        if (r0 != null) {
            str = r0.A09;
        } else {
            str = editBusinessFBPageFragment.A06.A06.A2V;
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("page_name", str);
            editBusinessFBPageFragment.getActivity().setResult(-1, intent);
        }
        editBusinessFBPageFragment.getActivity().finish();
        return true;
    }

    public final void BJ3(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = getString(C0003R.string.error_msg_switch_page);
        }
        AnonymousClass5F9.A05(str);
        A04(str2, str);
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        r4.BlI(C0003R.string.your_facebook_pages);
        r4.BmB(C0003R.C0004drawable.instagram_arrow_back_24, new C120565Fc(this));
        C33831dZ r1 = new C33831dZ();
        r1.A03 = C0003R.layout.business_text_action_button;
        r1.A01 = C0003R.string.done;
        r1.A05 = new AnonymousClass62M(this);
        r1.A0A = true;
        ViewSwitcher viewSwitcher = (ViewSwitcher) r4.A4Q(r1.A00());
        this.A02 = viewSwitcher;
        TextView textView = (TextView) viewSwitcher.getChildAt(0);
        this.A0D = textView;
        textView.setText(C0003R.string.done);
        A00();
    }

    public final C06590Pq getSession() {
        return this.A06;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(2107892518);
        super.onCreate(bundle);
        this.A08 = this.mArguments.getString("entry_point");
        AnonymousClass1HU r3 = new AnonymousClass1HU();
        r3.A0C(new C128275eQ(getActivity()));
        registerLifecycleListenerSet(r3);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(this.mArguments);
        this.A06 = A062;
        this.A09 = A062.A06.A2U;
        this.A03 = new C1416563w(getContext(), this, true, (String) null, getString(C0003R.string.select_or_create_facebook_page), (CharSequence) null);
        this.A0A = new ArrayList();
        AnonymousClass0Z0.A09(-75179511, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(381946027);
        View inflate = layoutInflater.inflate(C0003R.layout.edit_business_fb_page_view, viewGroup, false);
        AnonymousClass0Z0.A09(1490347579, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-26026926);
        super.onResume();
        A00();
        AnonymousClass0Z0.A09(-540530219, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A00 = view.findViewById(C0003R.C0005id.page_list_group);
        this.A03.A02 = false;
        A06();
        setListAdapter(this.A03);
        C62652o6.A00(this.A03.isEmpty(), this.mView);
        this.A03.A02 = true;
        ImageView imageView = (ImageView) view.findViewById(C0003R.C0005id.refresh);
        this.A01 = imageView;
        imageView.setVisibility(8);
        this.A01.setOnClickListener(new AnonymousClass62Q(this));
    }
}
