package com.instagram.business.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.p015ui.BusinessNavBar;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass2A5;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass3AT;
import p000X.AnonymousClass4XV;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C13300iJ;
import p000X.C13510ie;
import p000X.C15890nh;
import p000X.C16310oO;
import p000X.C174207cO;
import p000X.C17850qu;
import p000X.C27341Hl;
import p000X.C29089Crh;
import p000X.C29100Crv;
import p000X.C29101Crw;
import p000X.C29108Cs3;
import p000X.C29109Cs4;
import p000X.C29114Cs9;
import p000X.C29121CsG;
import p000X.C29124CsJ;
import p000X.C29135CsU;
import p000X.C29138CsX;
import p000X.C29145Cse;
import p000X.C29146Csf;
import p000X.C52362Om;
import p000X.C57942f3;
import p000X.C58422fu;
import p000X.C68172yZ;

public class SupportServiceEditUrlFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM {
    public ActionButton A00;
    public C29109Cs4 A01;
    public AnonymousClass0C1 A02;
    public C68172yZ A03;
    public AnonymousClass2A5 A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public final Handler A0G = new Handler(Looper.getMainLooper());
    public BusinessNavBar mBusinessNavBar;
    public EditText mURLEditText;
    public TextView mURLTitleTextView;

    public final String getModuleName() {
        return "service_partner_edit_url";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static String A00(SupportServiceEditUrlFragment supportServiceEditUrlFragment) {
        if (supportServiceEditUrlFragment.A0C) {
            return supportServiceEditUrlFragment.A0D;
        }
        return supportServiceEditUrlFragment.A04.A00;
    }

    public static void A01(SupportServiceEditUrlFragment supportServiceEditUrlFragment) {
        String str = supportServiceEditUrlFragment.A09;
        if ("sticker".equals(str) || "business_hub".equals(str)) {
            supportServiceEditUrlFragment.getActivity().finish();
        } else {
            supportServiceEditUrlFragment.mFragmentManager.A0u(SupportLinksFragment.A08, 1);
        }
    }

    public static void A02(SupportServiceEditUrlFragment supportServiceEditUrlFragment) {
        if ("sticker".equals(supportServiceEditUrlFragment.A09)) {
            C52362Om r4 = new C52362Om(supportServiceEditUrlFragment.getActivity(), supportServiceEditUrlFragment.A02);
            r4.A02 = C16310oO.A00.A00().A02(supportServiceEditUrlFragment.A09, supportServiceEditUrlFragment.A0F, supportServiceEditUrlFragment.A04);
            r4.A08 = false;
            r4.A02();
            return;
        }
        A01(supportServiceEditUrlFragment);
    }

    public static void A03(SupportServiceEditUrlFragment supportServiceEditUrlFragment, C57942f3 r5) {
        AnonymousClass0C1 r3 = supportServiceEditUrlFragment.A02;
        C13300iJ r2 = r3.A06;
        AnonymousClass2A5 r1 = supportServiceEditUrlFragment.A04;
        if (r1.equals(AnonymousClass2A5.GIFT_CARD)) {
            r2.A0J = r5;
        } else if (r1.equals(AnonymousClass2A5.DELIVERY)) {
            r2.A0H = r5;
        } else if (r1.equals(AnonymousClass2A5.DONATION)) {
            r2.A0I = r5;
        }
        C13510ie.A00(r3).A03(r2);
    }

    public static void A04(SupportServiceEditUrlFragment supportServiceEditUrlFragment, String str) {
        AnonymousClass0C1 r0 = supportServiceEditUrlFragment.A02;
        String str2 = supportServiceEditUrlFragment.A05;
        AnonymousClass2A5 r4 = supportServiceEditUrlFragment.A04;
        C29100Crv crv = new C29100Crv(supportServiceEditUrlFragment, str);
        C15890nh r2 = new C15890nh(r0);
        r2.A09 = Constants.ONE;
        r2.A0C = "accounts/update_smb_partner/";
        r2.A06(C29135CsU.class, false);
        r2.A0G = true;
        r2.A09("smb_partner_type", r4.A00);
        r2.A09(IgReactNavigatorModule.URL, str);
        r2.A09("app_id", str2);
        C17850qu A032 = r2.A03();
        A032.A00 = crv;
        supportServiceEditUrlFragment.schedule(A032);
    }

    public static void A05(SupportServiceEditUrlFragment supportServiceEditUrlFragment, String str) {
        AnonymousClass2OA r4 = new AnonymousClass2OA(supportServiceEditUrlFragment.getActivity());
        if (TextUtils.isEmpty(str)) {
            AnonymousClass2A5 r1 = supportServiceEditUrlFragment.A04;
            if (r1.equals(AnonymousClass2A5.DONATION)) {
                r4.A07(C0003R.string.remove_link_donation_dialog_title);
                r4.A06(C0003R.string.remove_link_donation_dialog_message);
            } else if (r1.equals(AnonymousClass2A5.GIFT_CARD)) {
                r4.A07(C0003R.string.remove_link_dialog_title);
                r4.A06(C0003R.string.remove_link_gift_card_dialog_message);
            } else if (r1.equals(AnonymousClass2A5.DELIVERY)) {
                r4.A07(C0003R.string.remove_link_dialog_title);
                r4.A06(C0003R.string.remove_link_delivery_dialog_message);
            }
            r4.A0S(supportServiceEditUrlFragment.getString(C0003R.string.remove_label), new C29121CsG(supportServiceEditUrlFragment), true, Constants.A0Y);
        } else {
            AnonymousClass2A5 r12 = supportServiceEditUrlFragment.A04;
            if (r12.equals(AnonymousClass2A5.DONATION)) {
                r4.A07(C0003R.string.update_link_donations_dialog_title);
                r4.A06(C0003R.string.update_link_donations_dialog_message);
            } else if (r12.equals(AnonymousClass2A5.GIFT_CARD)) {
                r4.A07(C0003R.string.update_link_dialog_title);
                r4.A06(C0003R.string.update_link_gift_card_dialog_message);
            } else if (r12.equals(AnonymousClass2A5.DELIVERY)) {
                r4.A07(C0003R.string.update_link_dialog_title);
                r4.A06(C0003R.string.update_link_delivery_dialog_message);
            }
            r4.A0S(supportServiceEditUrlFragment.getString(C0003R.string.update_label), new C29145Cse(supportServiceEditUrlFragment, str), true, Constants.ZERO);
        }
        r4.A0N(supportServiceEditUrlFragment.getString(C0003R.string.cancel_label), new C29146Csf(supportServiceEditUrlFragment));
        r4.A03().show();
    }

    public static void A06(SupportServiceEditUrlFragment supportServiceEditUrlFragment, String str) {
        C29124CsJ.A03(supportServiceEditUrlFragment.A02, supportServiceEditUrlFragment, supportServiceEditUrlFragment.A04.A00, new C29108Cs3(supportServiceEditUrlFragment, str));
    }

    public static void A07(SupportServiceEditUrlFragment supportServiceEditUrlFragment, String str, boolean z) {
        TextView textView;
        Context context;
        int i;
        supportServiceEditUrlFragment.mURLTitleTextView.setText(str);
        if (z) {
            textView = supportServiceEditUrlFragment.mURLTitleTextView;
            context = supportServiceEditUrlFragment.getContext();
            i = C0003R.color.igds_error_or_destructive;
        } else {
            textView = supportServiceEditUrlFragment.mURLTitleTextView;
            context = supportServiceEditUrlFragment.getContext();
            i = C0003R.color.igds_secondary_text;
        }
        textView.setTextColor(C019000b.A00(context, i));
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        int i;
        if (this.A0B) {
            boolean equals = this.A09.equals("sticker");
            i = C0003R.string.edit_url_actionbar_title;
            if (equals) {
                i = C0003R.string.edit_sticker_actionbar_title;
            }
        } else {
            boolean equals2 = this.A09.equals("sticker");
            i = C0003R.string.action_button_actionbar_title;
            if (equals2) {
                i = C0003R.string.support_partner_selection_sticker_actionbar_title;
            }
        }
        this.A00 = r3.BmJ(getString(i), new C29101Crw(this));
        if (getParentFragmentManager().A0I() != 0) {
            r3.Bg9(C0003R.C0004drawable.instagram_arrow_back_24);
        }
    }

    public final boolean onBackPressed() {
        View view = this.mView;
        if (view != null) {
            C06220Of.A0E(view);
        }
        if (getParentFragmentManager().A0I() == 0) {
            getActivity().finish();
            return true;
        }
        AnonymousClass1AM r0 = this.mFragmentManager;
        if (r0 == null) {
            return true;
        }
        r0.A0W();
        return true;
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0067, code lost:
        if (p000X.AnonymousClass38B.A00(r1, true) == false) goto L_0x0069;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        int A022 = AnonymousClass0Z0.A02(264595987);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A02 = AnonymousClass0J1.A06(bundle2);
        this.A0F = bundle2.getString("args_session_id");
        this.A05 = bundle2.getString("APP_ID");
        this.A0A = bundle2.getString(AnonymousClass0C5.$const$string(169));
        this.A0E = bundle2.getString(AnonymousClass0C5.$const$string(171));
        this.A06 = bundle2.getString(AnonymousClass0C5.$const$string(144));
        String string = bundle2.getString("args_entry_point");
        this.A09 = string;
        AnonymousClass0C1 r1 = this.A02;
        this.A01 = new C29109Cs4(r1, this, this.A0F, string);
        if ("profile".equals(string)) {
            z = true;
        }
        z = false;
        this.A0C = z;
        String str = null;
        if (z) {
            String string2 = bundle2.getString("args_category_type");
            this.A0D = string2;
            AnonymousClass2A5 A002 = AnonymousClass2A5.A00(string2);
            if (A002 != null) {
                this.A04 = A002;
                C58422fu r0 = this.A02.A06.A0A;
                if (r0 != null) {
                    str = r0.A03;
                }
                this.A07 = str;
                if (r0 != null) {
                    this.A08 = r0.A04;
                }
                this.A0B = !TextUtils.isEmpty(this.A06);
            } else {
                throw new IllegalArgumentException("No SMBPartnerType for provided category type");
            }
        } else {
            this.A04 = (AnonymousClass2A5) bundle2.getSerializable(AnonymousClass0C5.$const$string(62));
            AnonymousClass2A5 r12 = this.A02.A06.A0G;
            if (r12 != null) {
                str = r12.A00;
            }
            this.A07 = str;
            if (r12 != null) {
                this.A08 = getString(new C29138CsX(r12).A02);
            }
            boolean z2 = false;
            if (AnonymousClass3AT.A00(this.A02.A06, this.A04) != null) {
                z2 = true;
            }
            this.A0B = z2;
        }
        AnonymousClass0Z0.A09(770879893, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(777482716);
        View inflate = layoutInflater.inflate(C0003R.layout.support_service_edit_url_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(1793741416, A022);
        return inflate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0187, code lost:
        if (r0 == false) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x01ad, code lost:
        if (r0 == false) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01af, code lost:
        r1 = null;
     */
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        C29109Cs4 cs4 = this.A01;
        String A002 = A00(this);
        boolean z = this.A0B;
        String str = this.A05;
        String str2 = this.A0A;
        String str3 = this.A06;
        C174207cO A0C2 = C174207cO.A00(cs4.A00).A0D(cs4.A01).A0G("add_url").A0E("view").A0F(cs4.A03).A0C(Boolean.valueOf(z));
        A0C2.A0H(cs4.A02);
        A0C2.A0I(A002);
        A0C2.A07("partner_id", Long.valueOf(Long.parseLong(str)));
        A0C2.A08("partner_name", str2);
        A0C2.A08(IgReactNavigatorModule.URL, str3);
        A0C2.A01();
        TextView textView = (TextView) view.findViewById(C0003R.C0005id.title);
        AnonymousClass2A5 r0 = this.A04;
        AnonymousClass2A5 r4 = AnonymousClass2A5.DONATION;
        boolean equals = r0.equals(r4);
        int i2 = C0003R.string.add_url_title;
        if (equals) {
            i2 = C0003R.string.add_donations_url_title;
        }
        textView.setText(getString(i2));
        TextView textView2 = (TextView) view.findViewById(C0003R.C0005id.subtitle);
        if (this.A09.equals("sticker")) {
            AnonymousClass2A5 r1 = this.A04;
            if (r1.equals(AnonymousClass2A5.GIFT_CARD)) {
                i = C0003R.string.service_selection_info_sticker_gift_cards;
            } else {
                boolean equals2 = r1.equals(AnonymousClass2A5.DELIVERY);
                i = C0003R.string.service_selection_info_sticker_delivery;
            }
        } else {
            AnonymousClass2A5 r12 = this.A04;
            if (r12.equals(AnonymousClass2A5.GIFT_CARD)) {
                i = C0003R.string.add_url_gift_card_subtitle;
            } else if (r12.equals(AnonymousClass2A5.DELIVERY)) {
                i = C0003R.string.add_url_delivery_subtitle;
            } else {
                boolean equals3 = r12.equals(r4);
                i = C0003R.string.add_url_donations_subtitle;
            }
        }
        Integer num = Integer.valueOf(i);
        String string = getString(C0003R.string.business_support_learn_more_text);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(num.intValue(), string));
        AnonymousClass4XV.A02(string, spannableStringBuilder, new C29089Crh(this, C019000b.A00(getContext(), C0003R.color.igds_link)));
        textView2.setText(spannableStringBuilder);
        textView2.setHighlightColor(0);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        EditText editText = (EditText) view.findViewById(C0003R.C0005id.url_edit_text);
        this.mURLEditText = editText;
        editText.setHint(this.A0E);
        if (!TextUtils.isEmpty(this.A06)) {
            this.mURLEditText.setText(this.A06);
        }
        this.mURLTitleTextView = (TextView) view.findViewById(C0003R.C0005id.edit_url_title);
        TextView textView3 = (TextView) view.findViewById(C0003R.C0005id.bottom_text);
        boolean equals4 = this.A04.equals(r4);
        int i3 = C0003R.string.add_url_footer;
        if (equals4) {
            i3 = C0003R.string.add_donations_url_footer;
        }
        textView3.setText(i3);
        if (this.A0B) {
            BusinessNavBar businessNavBar = (BusinessNavBar) view.findViewById(C0003R.C0005id.remove_action_bar);
            this.mBusinessNavBar = businessNavBar;
            businessNavBar.setVisibility(0);
            this.mBusinessNavBar.A02();
            this.mBusinessNavBar.A05(getString(C0003R.string.remove_partner_link), C019000b.A00(getContext(), C0003R.color.igds_error_or_destructive), getResources().getDimensionPixelSize(C0003R.dimen.font_small));
            this.mBusinessNavBar.setSecondaryButtonOnclickListeners(new C29114Cs9(this));
        }
        C68172yZ r2 = new C68172yZ(getContext());
        this.A03 = r2;
        r2.A00(getContext().getString(C0003R.string.processing));
        this.A03.setCancelable(false);
    }
}
