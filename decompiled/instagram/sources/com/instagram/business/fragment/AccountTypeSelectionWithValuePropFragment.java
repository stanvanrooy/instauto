package com.instagram.business.fragment;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.business.p015ui.BusinessNavBar;
import java.util.HashMap;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass2UH;
import p000X.AnonymousClass61R;
import p000X.AnonymousClass624;
import p000X.AnonymousClass62B;
import p000X.AnonymousClass62C;
import p000X.AnonymousClass62D;
import p000X.AnonymousClass62E;
import p000X.AnonymousClass62F;
import p000X.AnonymousClass62H;
import p000X.AnonymousClass63U;
import p000X.AnonymousClass63X;
import p000X.C019000b;
import p000X.C05000Hl;
import p000X.C06590Pq;
import p000X.C134405oU;
import p000X.C140685zs;
import p000X.C1412261x;
import p000X.C27341Hl;
import p000X.C30248DXi;

public class AccountTypeSelectionWithValuePropFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, AnonymousClass63X {
    public AnonymousClass61R A00;
    public AnonymousClass63U A01;
    public AnonymousClass0C1 A02;
    public Integer A03;
    public String A04;
    public boolean A05;
    public RadioButton mBusinessRadioButton;
    public AnonymousClass2UH mController;
    public RadioButton mCreatorRadioButton;

    public final void AC1() {
    }

    public final void ACw() {
    }

    public final void BLe() {
    }

    public final String getModuleName() {
        return "account_type_selection_with_value_prop_fragment";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    private C1412261x A00() {
        C1412261x r2 = new C1412261x("account_type_selection_with_value_prop");
        r2.A01 = this.A04;
        r2.A04 = AnonymousClass62H.A06(this.A02, this.mController);
        return r2;
    }

    public static void A02(AccountTypeSelectionWithValuePropFragment accountTypeSelectionWithValuePropFragment, String str) {
        AnonymousClass61R r1;
        if (!accountTypeSelectionWithValuePropFragment.A05 && (r1 = accountTypeSelectionWithValuePropFragment.A00) != null) {
            C1412261x A002 = accountTypeSelectionWithValuePropFragment.A00();
            A002.A00 = str;
            r1.Ano(A002.A00());
        }
    }

    public final void BFZ() {
        Integer num;
        AnonymousClass61R A002;
        A02(this, "continue");
        AnonymousClass2UH r3 = this.mController;
        if (r3 != null) {
            if (this.A03 == Constants.A0N) {
                num = Constants.A0C;
            } else {
                num = Constants.ZERO;
            }
            r3.Bha(num);
            this.mController.AoZ();
            AnonymousClass61R r1 = this.A00;
            if (r1 != null) {
                r1.AlP(A00().A00());
            }
            AnonymousClass2UH r0 = this.mController;
            if (r0 != null && (A002 = C30248DXi.A00(this.A02, this, num, r0.Aad())) != null) {
                A002.Al6(A00().A00());
            }
        }
    }

    public final boolean onBackPressed() {
        AnonymousClass61R r1 = this.A00;
        if (r1 != null) {
            r1.Ajn(A00().A00());
        }
        AnonymousClass2UH r0 = this.mController;
        if (r0 == null) {
            return false;
        }
        r0.Be6();
        return true;
    }

    private void A01(ViewGroup viewGroup, Integer num) {
        for (C140685zs r3 : AnonymousClass624.A00(num, getContext()).A04) {
            View inflate = getLayoutInflater().inflate(C0003R.layout.stacked_value_props_row, viewGroup, false);
            String str = r3.A03;
            String str2 = r3.A02;
            Drawable A032 = C019000b.A03(getContext(), r3.A01);
            TextView textView = (TextView) inflate.findViewById(C0003R.C0005id.title);
            textView.setText(str);
            textView.setTypeface(Typeface.create("sans-serif-medium", 0));
            ((TextView) inflate.findViewById(C0003R.C0005id.subtitle)).setText(str2);
            ((ImageView) inflate.findViewById(C0003R.C0005id.icon)).setImageDrawable(A032);
            viewGroup.addView(inflate);
        }
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.BmK(C0003R.string.account_type_selection_title);
        r3.BmB(C0003R.C0004drawable.instagram_arrow_back_24, new AnonymousClass62D(this));
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.mController = AnonymousClass62H.A01(getActivity());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0069, code lost:
        if (((java.lang.Boolean) p000X.C134405oU.A00(new p000X.C05000Hl("is_prefill_option_enabled", r6, false, (java.lang.String[]) null, (p000X.AnonymousClass04H) null), r3, true)).booleanValue() == false) goto L_0x006b;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        int A022 = AnonymousClass0Z0.A02(91722242);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        this.A02 = AnonymousClass0J1.A06(bundle2);
        String string = bundle2.getString("entry_point");
        AnonymousClass0a4.A06(string);
        this.A04 = string;
        AnonymousClass2UH r0 = this.mController;
        if (r0 != null) {
            this.A00 = C30248DXi.A00(this.A02, this, r0.ALv(), r0.Aad());
        }
        if (this.A03 == null) {
            AnonymousClass0C1 r3 = this.A02;
            AnonymousClass0L7 r6 = AnonymousClass0L7.SMB_GROWTH_ANDROID_DETERMINE_BUSINESS_CREATOR_LAUNCHER;
            if (((Boolean) C134405oU.A00(new C05000Hl("is_enabled", r6, false, (String[]) null, (AnonymousClass04H) null), r3, true)).booleanValue()) {
                z = true;
            }
            z = false;
            if (z) {
                this.A03 = this.A02.A06.A1p;
            }
        }
        AnonymousClass0Z0.A09(542121870, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0Z0.A02(-1576793065);
        this.A05 = true;
        View inflate = layoutInflater.inflate(C0003R.layout.account_type_selection_with_value_prop_fragment, viewGroup, false);
        AnonymousClass63U r1 = new AnonymousClass63U(this, (BusinessNavBar) inflate.findViewById(C0003R.C0005id.navigation_bar));
        this.A01 = r1;
        registerLifecycleListener(r1);
        this.A01.A01.setPrimaryButtonEnabled(false);
        View findViewById = inflate.findViewById(C0003R.C0005id.card_business);
        View findViewById2 = inflate.findViewById(C0003R.C0005id.card_creator);
        View findViewById3 = findViewById.findViewById(C0003R.C0005id.container_value_prop);
        View findViewById4 = findViewById2.findViewById(C0003R.C0005id.container_value_prop);
        this.mBusinessRadioButton = (RadioButton) findViewById.findViewById(C0003R.C0005id.radio_account_type);
        this.mCreatorRadioButton = (RadioButton) findViewById2.findViewById(C0003R.C0005id.radio_account_type);
        this.mBusinessRadioButton.setOnClickListener(new AnonymousClass62B(this, findViewById3, findViewById4));
        this.mCreatorRadioButton.setOnClickListener(new AnonymousClass62C(this, findViewById4, findViewById3));
        findViewById.setOnClickListener(new AnonymousClass62E(this));
        findViewById2.setOnClickListener(new AnonymousClass62F(this));
        ((TextView) findViewById.findViewById(C0003R.C0005id.text_card_title)).setText(C0003R.string.account_type_business_card_title);
        ((TextView) findViewById.findViewById(C0003R.C0005id.text_card_description)).setText(C0003R.string.account_type_business_card_description);
        ((TextView) findViewById2.findViewById(C0003R.C0005id.text_card_title)).setText(C0003R.string.account_type_creator_card_title);
        ((TextView) findViewById2.findViewById(C0003R.C0005id.text_card_description)).setText(C0003R.string.account_type_creator_card_description);
        A01((ViewGroup) findViewById.findViewById(C0003R.C0005id.container_value_prop), Constants.A0C);
        A01((ViewGroup) findViewById2.findViewById(C0003R.C0005id.container_value_prop), Constants.A0N);
        if (this.A00 != null) {
            C1412261x A002 = A00();
            Integer num = this.A03;
            if (num != null) {
                HashMap hashMap = new HashMap();
                switch (num.intValue()) {
                    case 1:
                        str = "personal";
                        break;
                    case 2:
                        str = "business";
                        break;
                    case 3:
                        str = "media_creator";
                        break;
                    default:
                        str = "";
                        break;
                }
                hashMap.put("selected_account", str);
                A002.A07 = hashMap;
            }
            this.A00.AnW(A002.A00());
        }
        AnonymousClass0Z0.A09(1212975437, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(742351192);
        super.onDestroyView();
        unregisterLifecycleListener(this.A01);
        AnonymousClass0Z0.A09(-1605486242, A022);
    }

    public final void onViewStateRestored(Bundle bundle) {
        RadioButton radioButton;
        int A022 = AnonymousClass0Z0.A02(1603878491);
        super.onViewStateRestored(bundle);
        Integer num = this.A03;
        if (num != null) {
            switch (num.intValue()) {
                case 2:
                    radioButton = this.mBusinessRadioButton;
                    break;
                case 3:
                    radioButton = this.mCreatorRadioButton;
                    break;
            }
            radioButton.performClick();
        }
        this.A05 = false;
        AnonymousClass0Z0.A09(-864341355, A022);
    }
}
