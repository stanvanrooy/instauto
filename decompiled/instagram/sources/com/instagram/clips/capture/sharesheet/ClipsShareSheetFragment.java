package com.instagram.clips.capture.sharesheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgCheckBox;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.analytics.ShareMediaLoggingInfo;
import com.instagram.p009ui.widget.textview.IgAutoCompleteTextView;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.List;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass12M;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass2L7;
import p000X.AnonymousClass5F9;
import p000X.C06590Pq;
import p000X.C167957Fb;
import p000X.C184107tq;
import p000X.C184117ts;
import p000X.C184177ty;
import p000X.C184207u1;
import p000X.C184217u2;
import p000X.C27341Hl;
import p000X.C28351Lj;
import p000X.C35651gi;
import p000X.C67672xe;
import p000X.C67682xf;
import p000X.C76683Wv;
import p000X.C86833pk;

public final class ClipsShareSheetFragment extends C27341Hl implements C76683Wv {
    public ClipsShareHomeFragment A00;
    public ClipsShareSheetController A01;
    public ShareMediaLoggingInfo A02;
    public AnonymousClass12M A03;
    public AnonymousClass2L7 A04;
    public AnonymousClass2L7 A05;
    public PendingMedia A06;
    public PendingMediaStore A07;
    public AnonymousClass0C1 A08;

    public final void B11(List list) {
    }

    public final void BUJ(AnonymousClass2L7 r1) {
    }

    public final String getModuleName() {
        return "clips_share_sheet";
    }

    public static void A00(ClipsShareSheetFragment clipsShareSheetFragment, String str) {
        try {
            AnonymousClass2L7 A052 = clipsShareSheetFragment.A03.A05(str);
            clipsShareSheetFragment.A04 = A052;
            clipsShareSheetFragment.A02 = A052.A02;
            clipsShareSheetFragment.A06 = clipsShareSheetFragment.A07.A04(A052.A06);
        } catch (C86833pk e) {
            AnonymousClass5F9.A00(clipsShareSheetFragment.getContext(), e.A00);
            AnonymousClass0QD.A0A("com.instagram.clips.capture.sharesheet.ClipsShareSheetFragment", e);
        }
    }

    public final void B3x(Throwable th) {
        AnonymousClass5F9.A01(getContext(), C0003R.string.sharesheet_save_draft_failed_message, 1);
    }

    public final C06590Pq getSession() {
        return this.A08;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1708119908);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle2);
        this.A08 = A062;
        this.A03 = AnonymousClass12M.A00(getActivity(), A062);
        this.A07 = PendingMediaStore.A01(this.A08);
        A00(this, bundle2.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_DRAFT_INFO_SESSION_ID "));
        this.A05 = this.A04;
        this.A01 = new ClipsShareSheetController(this, this.A08, this);
        AnonymousClass0Z0.A09(-1702923892, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1287887578);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_sharesheet_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(246543166, A022);
        return inflate;
    }

    public final void onDestroyView() {
        AnonymousClass2L7 r0;
        int A022 = AnonymousClass0Z0.A02(229524532);
        super.onDestroyView();
        AnonymousClass2L7 r2 = this.A05;
        if (!(r2 == null || (r0 = this.A04) == null || r2 == r0)) {
            this.A03.A08(r2, false, false);
            this.A07.A0C(this.A04.A06);
        }
        this.A03.A07(this);
        ClipsShareSheetControllerLifecycleUtil.cleanupReferences(this.A01);
        AnonymousClass0Z0.A09(-2022143684, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A03.A06(this);
        ClipsShareSheetController clipsShareSheetController = this.A01;
        Button button = (Button) view.findViewById(C0003R.C0005id.share_button);
        clipsShareSheetController.mShareButton = button;
        button.setOnClickListener(new C184117ts(clipsShareSheetController));
        Button button2 = (Button) view.findViewById(C0003R.C0005id.save_draft_button);
        clipsShareSheetController.mSaveDraftButton = button2;
        button2.setOnClickListener(new C184107tq(clipsShareSheetController));
        IgAutoCompleteTextView igAutoCompleteTextView = (IgAutoCompleteTextView) view.findViewById(C0003R.C0005id.caption_input_text_view);
        clipsShareSheetController.mCaptionInputTextView = igAutoCompleteTextView;
        igAutoCompleteTextView.setOnFocusChangeListener(new C184207u1(clipsShareSheetController));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C0003R.C0005id.cover_photo_preview);
        clipsShareSheetController.mCoverPhotoContainer = viewGroup;
        C35651gi r1 = new C35651gi(viewGroup);
        r1.A05 = new C167957Fb(clipsShareSheetController);
        r1.A07 = true;
        r1.A03 = 0.95f;
        r1.A00();
        clipsShareSheetController.mThumbnailImage = (IgImageView) clipsShareSheetController.mCoverPhotoContainer.findViewById(C0003R.C0005id.clip_thumbnail_image);
        clipsShareSheetController.mPublicSharingView = view.findViewById(C0003R.C0005id.public_share_options_container);
        clipsShareSheetController.mPrivateSharingView = view.findViewById(C0003R.C0005id.private_share_options_container);
        clipsShareSheetController.mPublicSharingView.setVisibility(8);
        clipsShareSheetController.mPrivateSharingView.setVisibility(8);
        switch (clipsShareSheetController.A08.A06.A1o.intValue()) {
            case 0:
            case 2:
                clipsShareSheetController.mPrivateSharingView.setVisibility(0);
                break;
            case 1:
                clipsShareSheetController.mPublicSharingView.setVisibility(0);
                View findViewById = clipsShareSheetController.mPublicSharingView.findViewById(C0003R.C0005id.share_to_feed_checkbox_container);
                IgCheckBox igCheckBox = (IgCheckBox) clipsShareSheetController.mPublicSharingView.findViewById(C0003R.C0005id.share_to_feed_checkbox);
                findViewById.setOnClickListener(new C184217u2(clipsShareSheetController, igCheckBox));
                boolean z = !((Boolean) AnonymousClass0L6.A02(clipsShareSheetController.A08, AnonymousClass0L7.SUNDIAL_V2_SHARE_SHEET_SHARE_TO_EXPLORE, "should_share_to_explore_only", false, (AnonymousClass04H) null)).booleanValue();
                igCheckBox.setChecked(z);
                ClipsShareSheetController.A00(clipsShareSheetController, z);
                igCheckBox.setOnCheckedChangeListener(new C184177ty(clipsShareSheetController));
                break;
        }
        IgAutoCompleteTextView igAutoCompleteTextView2 = clipsShareSheetController.mCaptionInputTextView;
        igAutoCompleteTextView2.setAlwaysShowWhenEnoughToFilter(true);
        if (clipsShareSheetController.A00 == null) {
            Context context = clipsShareSheetController.A04;
            clipsShareSheetController.A00 = C67682xf.A00(context, clipsShareSheetController.A08, new C28351Lj(context, AnonymousClass1L8.A00(clipsShareSheetController.A06)), (List) null, false, "clips_edit_page", (C67672xe) null);
        }
        igAutoCompleteTextView2.setAdapter(clipsShareSheetController.A00);
        clipsShareSheetController.mCaptionInputTextView.addTextChangedListener(clipsShareSheetController.A05);
        this.A01.A01(this.A06);
    }
}
