package com.instagram.business.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass2A5;
import p000X.AnonymousClass38B;
import p000X.AnonymousClass3AT;
import p000X.C06590Pq;
import p000X.C27341Hl;
import p000X.C27868CUi;
import p000X.C29104Crz;
import p000X.C29109Cs4;
import p000X.C29110Cs5;
import p000X.C29120CsF;
import p000X.C29124CsJ;
import p000X.C29138CsX;
import p000X.C57942f3;

public class SupportLinksFragment extends C27341Hl implements AnonymousClass1HM {
    public static final String A08 = AnonymousClass000.A0E(SupportLinksFragment.class.getName(), ".BACK_STACK");
    public C29109Cs4 A00;
    public AnonymousClass0C1 A01;
    public String A02;
    public String A03;
    public boolean A04;
    public LayoutInflater A05;
    public List A06;
    public boolean A07;
    public View mLoadingIndicator;
    public ViewGroup mPartnerTypeRowsContainer;
    public ViewGroup mProfileDisplayRow;
    public View mSelectButtonRow;

    public final String getModuleName() {
        return "support_links_fragment";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static View A00(SupportLinksFragment supportLinksFragment, String str, String str2) {
        View inflate = supportLinksFragment.A05.inflate(C0003R.layout.setup_action_button_row, supportLinksFragment.mPartnerTypeRowsContainer, false);
        View findViewById = inflate.findViewById(C0003R.C0005id.row_multiple_title);
        AnonymousClass0a4.A06(findViewById);
        TextView textView = (TextView) findViewById.findViewById(C0003R.C0005id.row_title);
        AnonymousClass0a4.A06(textView);
        TextView textView2 = (TextView) findViewById.findViewById(C0003R.C0005id.row_subtitle);
        AnonymousClass0a4.A06(textView2);
        TextView textView3 = (TextView) inflate.findViewById(C0003R.C0005id.row_single_title);
        AnonymousClass0a4.A06(textView3);
        if (!TextUtils.isEmpty(str2)) {
            textView.setText(str);
            textView2.setText(str2);
            findViewById.setVisibility(0);
            textView3.setVisibility(8);
        } else {
            textView3.setText(str);
            findViewById.setVisibility(8);
            textView3.setVisibility(0);
        }
        supportLinksFragment.mPartnerTypeRowsContainer.addView(inflate);
        return inflate;
    }

    public static void A01(SupportLinksFragment supportLinksFragment) {
        boolean A09;
        if (supportLinksFragment.A07) {
            A09 = supportLinksFragment.A04;
        } else {
            A09 = AnonymousClass3AT.A09(supportLinksFragment.A01.A06);
        }
        if (A09) {
            String A012 = AnonymousClass3AT.A01(supportLinksFragment.getContext(), supportLinksFragment.A01);
            TextView textView = (TextView) supportLinksFragment.mProfileDisplayRow.findViewById(C0003R.C0005id.shown_button_text);
            AnonymousClass0a4.A06(textView);
            textView.setText(A012);
            supportLinksFragment.mProfileDisplayRow.setVisibility(0);
            supportLinksFragment.mSelectButtonRow.setVisibility(8);
            return;
        }
        supportLinksFragment.mSelectButtonRow.setVisibility(0);
        supportLinksFragment.mProfileDisplayRow.setVisibility(8);
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        r4.BmG(C0003R.string.support_links_setup_actionbar_title, C0003R.C0004drawable.instagram_arrow_back_24, new C27868CUi(this)).setEnabled(true);
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(545035804);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A01 = AnonymousClass0J1.A06(bundle2);
        this.A02 = bundle2.getString("args_entry_point");
        this.A03 = bundle2.getString("args_session_id");
        boolean A002 = AnonymousClass38B.A00(this.A01, true);
        this.A07 = A002;
        if (!A002) {
            this.A06 = new ArrayList();
            AnonymousClass0C1 r3 = this.A01;
            AnonymousClass0L7 r2 = AnonymousClass0L7.SMB_SUPPORT_LINK;
            if (((Boolean) AnonymousClass0L6.A02(r3, r2, "has_gift_card_option", false, (AnonymousClass04H) null)).booleanValue()) {
                this.A06.add(AnonymousClass2A5.GIFT_CARD);
            }
            if (((Boolean) AnonymousClass0L6.A02(this.A01, r2, "has_food_delivery_option", false, (AnonymousClass04H) null)).booleanValue()) {
                this.A06.add(AnonymousClass2A5.DELIVERY);
            }
            if (AnonymousClass38B.A01(this.A01)) {
                this.A06.add(AnonymousClass2A5.DONATION);
            }
        }
        this.A00 = new C29109Cs4(this.A01, this, this.A03, this.A02);
        this.A04 = false;
        AnonymousClass0Z0.A09(-1761377935, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1521402440);
        View inflate = layoutInflater.inflate(C0003R.layout.support_links_setup_fragment, viewGroup, false);
        this.A05 = layoutInflater;
        AnonymousClass0Z0.A09(-1380120416, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C0003R.C0005id.action_button_section_title);
        AnonymousClass0a4.A06(findViewById);
        this.mSelectButtonRow = findViewById;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C0003R.C0005id.profile_display_options_row);
        AnonymousClass0a4.A06(viewGroup);
        this.mProfileDisplayRow = viewGroup;
        A01(this);
        this.mProfileDisplayRow.setOnClickListener(new C29120CsF(this));
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(C0003R.C0005id.partner_type_rows_container);
        AnonymousClass0a4.A06(viewGroup2);
        this.mPartnerTypeRowsContainer = viewGroup2;
        this.mLoadingIndicator = view.findViewById(C0003R.C0005id.loading_spinner);
        if (this.A07) {
            C29124CsJ.A00(this.A01, this, new C29104Crz(this));
            return;
        }
        this.mPartnerTypeRowsContainer.removeAllViews();
        for (AnonymousClass2A5 r3 : this.A06) {
            String A022 = AnonymousClass3AT.A02(getContext(), r3);
            C57942f3 A002 = AnonymousClass3AT.A00(this.A01.A06, r3);
            if (A002 == null) {
                str = null;
            } else {
                str = A002.A02;
            }
            View A003 = A00(this, A022, str);
            ImageView imageView = (ImageView) A003.findViewById(C0003R.C0005id.action_glyph);
            AnonymousClass0a4.A06(imageView);
            imageView.setImageResource(new C29138CsX(r3).A01);
            A003.setOnClickListener(new C29110Cs5(this, r3));
        }
        this.A00.A0A(AnonymousClass3AT.A09(this.A01.A06));
    }
}
