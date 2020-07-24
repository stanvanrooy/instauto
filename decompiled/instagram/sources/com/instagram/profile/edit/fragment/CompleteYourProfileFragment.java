package com.instagram.profile.edit.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.profile.edit.controller.EditProfileFieldsController;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass2UH;
import p000X.AnonymousClass50I;
import p000X.AnonymousClass50K;
import p000X.AnonymousClass61R;
import p000X.AnonymousClass62H;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C115574xn;
import p000X.C116784zr;
import p000X.C12810hQ;
import p000X.C13300iJ;
import p000X.C137435te;
import p000X.C137445tf;
import p000X.C137455tg;
import p000X.C137465th;
import p000X.C137485tj;
import p000X.C137495tk;
import p000X.C137505tl;
import p000X.C137515tm;
import p000X.C137525tn;
import p000X.C14100jl;
import p000X.C1412261x;
import p000X.C17850qu;
import p000X.C23300zv;
import p000X.C27341Hl;
import p000X.C31121Wn;
import p000X.C33231ca;
import p000X.C68172yZ;

public class CompleteYourProfileFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass50I, AnonymousClass1HM {
    public C31121Wn A00;
    public AnonymousClass61R A01;
    public C116784zr A02;
    public EditProfileFieldsController A03;
    public AnonymousClass0C1 A04;
    public C13300iJ A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = true;
    public AnonymousClass2UH A09;
    public String A0A;
    public final C11200ea A0B = new C137455tg(this);
    public final C137505tl A0C = new C137505tl(this);
    public IgImageView mAvatarImageView;
    public TextView mChangeAvatarButton;
    public ActionButton mSaveButton;

    public final View.OnClickListener AMO() {
        return null;
    }

    public final View.OnClickListener AZo() {
        return null;
    }

    public final boolean Af3() {
        return false;
    }

    public final boolean Af4() {
        return false;
    }

    public final String getModuleName() {
        return "complete_your_profile_fragment";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static C1412261x A00(CompleteYourProfileFragment completeYourProfileFragment) {
        C1412261x r1 = new C1412261x("profile_completion");
        r1.A04 = C14100jl.A01(completeYourProfileFragment.A04);
        r1.A01 = completeYourProfileFragment.A0A;
        return r1;
    }

    public static void A01(CompleteYourProfileFragment completeYourProfileFragment) {
        if (completeYourProfileFragment.mView != null && completeYourProfileFragment.A02 != null) {
            A03(completeYourProfileFragment);
            completeYourProfileFragment.A0C.BhN(false);
            completeYourProfileFragment.A03.A02((Bundle) null, completeYourProfileFragment.A02);
            completeYourProfileFragment.A0C.BhN(true);
            A02(completeYourProfileFragment);
        }
    }

    public static void A02(CompleteYourProfileFragment completeYourProfileFragment) {
        ActionButton actionButton = completeYourProfileFragment.mSaveButton;
        if (actionButton != null && completeYourProfileFragment.mView != null) {
            actionButton.setEnabled(completeYourProfileFragment.A03.A04());
        }
    }

    public static void A03(CompleteYourProfileFragment completeYourProfileFragment) {
        IgImageView igImageView = completeYourProfileFragment.mAvatarImageView;
        if (igImageView != null) {
            igImageView.setUrl(completeYourProfileFragment.A05.ASv(), completeYourProfileFragment.getModuleName());
        }
        if (completeYourProfileFragment.mChangeAvatarButton == null) {
            return;
        }
        if (TextUtils.isEmpty(completeYourProfileFragment.A05.A2b)) {
            completeYourProfileFragment.mChangeAvatarButton.setText(C0003R.string.add_profile_photo_title);
        } else {
            completeYourProfileFragment.mChangeAvatarButton.setText(C0003R.string.change_profile_photo);
        }
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        this.mSaveButton = r4.BmJ("", new C137435te(this));
        A02(this);
        r4.BmC(C0003R.C0004drawable.instagram_x_outline_24, new C137465th(this), C0003R.string.close);
    }

    public final boolean onBackPressed() {
        AnonymousClass61R r1;
        if (!this.A08 || (r1 = this.A01) == null) {
            return false;
        }
        r1.Ajn(A00(this).A00());
        return false;
    }

    public final AnonymousClass50K ASt() {
        return this.A0C;
    }

    public final C06590Pq getSession() {
        return this.A04;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A00.A05(i, i2, intent);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A09 = AnonymousClass62H.A01(getActivity());
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1466685548);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle2);
        this.A04 = A062;
        EditProfileFieldsController editProfileFieldsController = new EditProfileFieldsController(A062, AnonymousClass1L8.A00(this));
        this.A03 = editProfileFieldsController;
        registerLifecycleListener(editProfileFieldsController);
        this.A05 = this.A04.A06;
        this.A0A = bundle2.getString("entry_point");
        boolean z = false;
        this.A07 = bundle2.getBoolean("ARG_CHECKLIST_ITEM_COMPLETED", false);
        if (bundle2.getString("edit_profile_entry") != null) {
            z = true;
        }
        AnonymousClass61R A002 = AnonymousClass62H.A00(this.A04, this, z, this.A09);
        this.A01 = A002;
        if (A002 != null) {
            A002.AnW(A00(this).A00());
        }
        this.A00 = new C31121Wn(this.A04, this, getActivity().A05(), this.A05, new C137525tn(this), new C137515tm(this), Constants.A10);
        C68172yZ r3 = new C68172yZ(getContext());
        r3.A00(getString(C0003R.string.loading));
        C17850qu A052 = C115574xn.A05(this.A04);
        A052.A00 = new C137445tf(this, r3);
        C12810hQ.A02(A052);
        AnonymousClass0Z0.A09(1360781239, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1359328329);
        View inflate = layoutInflater.inflate(C0003R.layout.fragment_complete_your_profile, viewGroup, false);
        this.A03.A03(getActivity(), inflate, this, false, false);
        ((TextView) inflate.findViewById(C0003R.C0005id.title)).setText(C0003R.string.complete_your_profile_title);
        ((TextView) inflate.findViewById(C0003R.C0005id.subtitle)).setText(C0003R.string.complete_your_profile_subtitle);
        AnonymousClass0Z0.A09(2016693768, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1774528546);
        super.onDestroyView();
        C23300zv.A00(this.A04).A03(C33231ca.class, this.A0B);
        AnonymousClass0Z0.A09(-2105393123, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-2060869903);
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.getWindow().setSoftInputMode(48);
        }
        AnonymousClass0Z0.A09(1939939026, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-1557717387);
        super.onResume();
        A02(this);
        getActivity().getWindow().setSoftInputMode(32);
        AnonymousClass0Z0.A09(254190277, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        IgImageView igImageView = (IgImageView) view.findViewById(C0003R.C0005id.avatar_imageview);
        this.mAvatarImageView = igImageView;
        igImageView.setVisibility(0);
        this.mAvatarImageView.setOnClickListener(new C137485tj(this));
        TextView textView = (TextView) view.findViewById(C0003R.C0005id.change_avatar_button);
        this.mChangeAvatarButton = textView;
        textView.setVisibility(0);
        this.mChangeAvatarButton.setOnClickListener(new C137495tk(this));
        A01(this);
        EditProfileFieldsController editProfileFieldsController = this.A03;
        if (this.A05.A1b == Constants.A0C) {
            editProfileFieldsController.mNameField.setLabelText(editProfileFieldsController.mActivity.getString(C0003R.string.business_name));
        }
        editProfileFieldsController.mWebsiteField.setLabelText(editProfileFieldsController.mActivity.getString(C0003R.string.website_optional));
        C23300zv.A00(this.A04).A02(C33231ca.class, this.A0B);
    }
}
