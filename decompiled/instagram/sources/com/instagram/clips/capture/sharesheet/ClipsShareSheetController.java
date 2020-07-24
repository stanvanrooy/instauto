package com.instagram.clips.capture.sharesheet;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.p009ui.widget.textview.IgAutoCompleteTextView;
import com.instagram.pendingmedia.model.PendingMedia;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1L8;
import p000X.C08480Xf;
import p000X.C184087tl;
import p000X.C184097tm;
import p000X.C184197u0;
import p000X.C28351Lj;
import p000X.C67682xf;

public class ClipsShareSheetController {
    public C67682xf A00;
    public Integer A01;
    public String A02;
    public C184097tm A03;
    public final Context A04;
    public final TextWatcher A05 = new C184197u0(this);
    public final AnonymousClass1HD A06;
    public final ClipsShareSheetFragment A07;
    public final AnonymousClass0C1 A08;
    public IgAutoCompleteTextView mCaptionInputTextView;
    public ViewGroup mCoverPhotoContainer;
    public View mPrivateSharingView;
    public View mPublicSharingView;
    public Button mSaveDraftButton;
    public Button mShareButton;
    public IgImageView mThumbnailImage;

    public static void A00(ClipsShareSheetController clipsShareSheetController, boolean z) {
        if (z) {
            clipsShareSheetController.A01 = Constants.ZERO;
            clipsShareSheetController.mShareButton.setText(C0003R.string.sharesheet_share_button_label);
            return;
        }
        clipsShareSheetController.A01 = Constants.ONE;
        clipsShareSheetController.mShareButton.setText(C0003R.string.sharesheet_share_to_explore_button_label);
    }

    public final void A01(PendingMedia pendingMedia) {
        this.mCaptionInputTextView.setText(pendingMedia.A1T);
        if (TextUtils.isEmpty(pendingMedia.A1g)) {
            this.mShareButton.setEnabled(false);
            C184097tm r3 = new C184097tm(this.A04, AnonymousClass1L8.A00(this.A06), this);
            this.A03 = r3;
            C28351Lj.A00(r3.A00, r3.A01, new C184087tl(r3, pendingMedia));
            return;
        }
        String str = pendingMedia.A1g;
        this.mShareButton.setEnabled(true);
        this.mThumbnailImage.setImageURI(C08480Xf.A00(str));
    }

    public ClipsShareSheetController(AnonymousClass1HD r2, AnonymousClass0C1 r3, ClipsShareSheetFragment clipsShareSheetFragment) {
        this.A06 = r2;
        this.A08 = r3;
        this.A07 = clipsShareSheetFragment;
        Context context = r2.getContext();
        AnonymousClass0a4.A06(context);
        this.A04 = context;
    }
}
