package com.instagram.profile.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.p009ui.menu.CheckRadioButton;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass4R0;
import p000X.AnonymousClass4XV;
import p000X.AnonymousClass5PJ;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C115664xw;
import p000X.C115684y0;
import p000X.C115694y1;
import p000X.C115704y2;
import p000X.C115714y3;
import p000X.C116024yZ;
import p000X.C14090jk;
import p000X.C27341Hl;
import p000X.C97024Hk;

public class AccountPrivacyOptionSheetFragment extends C27341Hl {
    public C116024yZ A00;
    public AnonymousClass0C1 A01;
    public AnonymousClass5PJ A02;
    public boolean A03;
    public TextView mFooterButton;
    public TextView mPrivacyStatusTextView;
    public CheckRadioButton mPrivateCheckButton;
    public CheckRadioButton mPublicCheckButton;
    public ScrollView mScrollView;

    public final String getModuleName() {
        return "account_privacy_option_sheet";
    }

    public static void A00(AccountPrivacyOptionSheetFragment accountPrivacyOptionSheetFragment) {
        boolean A022 = C14090jk.A02(accountPrivacyOptionSheetFragment.A01);
        int i = C0003R.string.account_privacy_option_status_public;
        if (A022) {
            i = C0003R.string.account_privacy_option_status_private;
        }
        accountPrivacyOptionSheetFragment.mPrivacyStatusTextView.setText(Html.fromHtml(accountPrivacyOptionSheetFragment.getString(C0003R.string.account_privacy_option_status, accountPrivacyOptionSheetFragment.getString(i))));
        accountPrivacyOptionSheetFragment.mPublicCheckButton.setChecked(!accountPrivacyOptionSheetFragment.A03);
        accountPrivacyOptionSheetFragment.mPrivateCheckButton.setChecked(accountPrivacyOptionSheetFragment.A03);
        boolean z = false;
        if (accountPrivacyOptionSheetFragment.A03 != C14090jk.A02(accountPrivacyOptionSheetFragment.A01)) {
            z = true;
        }
        TextView textView = accountPrivacyOptionSheetFragment.mFooterButton;
        int i2 = C0003R.string.cancel;
        if (z) {
            i2 = C0003R.string.save;
        }
        textView.setText(i2);
        TextView textView2 = accountPrivacyOptionSheetFragment.mFooterButton;
        Context context = accountPrivacyOptionSheetFragment.getContext();
        int i3 = C0003R.color.grey_9;
        if (z) {
            i3 = C0003R.color.white;
        }
        textView2.setTextColor(C019000b.A00(context, i3));
        TextView textView3 = accountPrivacyOptionSheetFragment.mFooterButton;
        int i4 = C0003R.C0004drawable.button_white_background_no_rounding;
        if (z) {
            i4 = C0003R.C0004drawable.button_blue_background_no_rounding;
        }
        textView3.setBackgroundResource(i4);
        if (z) {
            accountPrivacyOptionSheetFragment.mFooterButton.setOnClickListener(new C115664xw(accountPrivacyOptionSheetFragment));
        } else {
            accountPrivacyOptionSheetFragment.mFooterButton.setOnClickListener(new C97024Hk(accountPrivacyOptionSheetFragment));
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("is_private_selected", this.A03);
        super.onSaveInstanceState(bundle);
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        boolean A022;
        int A023 = AnonymousClass0Z0.A02(1828263197);
        super.onCreate(bundle);
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(this.mArguments);
        this.A01 = A06;
        if (bundle != null) {
            A022 = bundle.getBoolean("is_private_selected");
        } else {
            A022 = C14090jk.A02(A06);
        }
        this.A03 = A022;
        this.A02 = new AnonymousClass5PJ(this, new C115704y2());
        AnonymousClass0Z0.A09(1237148963, A023);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1444021567);
        View inflate = layoutInflater.inflate(C0003R.layout.fragment_account_privacy_option_sheet, viewGroup, false);
        this.mScrollView = (ScrollView) inflate.findViewById(C0003R.C0005id.scroll_view);
        this.mPrivacyStatusTextView = (TextView) inflate.findViewById(C0003R.C0005id.privacy_status);
        this.mPublicCheckButton = (CheckRadioButton) inflate.findViewById(C0003R.C0005id.public_check_button);
        this.mPrivateCheckButton = (CheckRadioButton) inflate.findViewById(C0003R.C0005id.private_check_button);
        this.mFooterButton = (TextView) inflate.findViewById(C0003R.C0005id.footer_button);
        C115684y0 r3 = new C115684y0(this);
        C115694y1 r1 = new C115694y1(this);
        this.mPublicCheckButton.setOnClickListener(r3);
        this.mPrivateCheckButton.setOnClickListener(r1);
        inflate.findViewById(C0003R.C0005id.public_option_container).setOnClickListener(r3);
        inflate.findViewById(C0003R.C0005id.private_option_container).setOnClickListener(r1);
        String string = getString(C0003R.string.account_privacy_option_settings_noun);
        AnonymousClass4XV.A01((TextView) inflate.findViewById(C0003R.C0005id.settings_text), string, getString(C0003R.string.account_privacy_option_settings_full_text, string), new AnonymousClass4R0(this, C019000b.A00(getContext(), C0003R.color.blue_5)));
        new C115714y3(AnonymousClass0QT.A00(this.A01, this).A02("ig_privacy_sheet_shown")).A01();
        AnonymousClass0Z0.A09(-2022970286, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(591142435);
        super.onResume();
        A00(this);
        AnonymousClass0Z0.A09(688033671, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0Z0.A02(-944652601);
        super.onStop();
        C116024yZ r1 = this.A00;
        if (r1 != null) {
            r1.A00 = null;
        }
        AnonymousClass0Z0.A09(-135518243, A022);
    }
}
