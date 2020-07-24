package com.instagram.clips.capture.sharesheet.coverphoto;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.PendingMedia;
import java.io.IOException;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass7FP;
import p000X.AnonymousClass7FQ;
import p000X.AnonymousClass7FR;
import p000X.AnonymousClass7FS;
import p000X.AnonymousClass7GQ;
import p000X.AnonymousClass810;
import p000X.AnonymousClass817;
import p000X.AnonymousClass87W;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C12670hC;
import p000X.C183617sm;
import p000X.C187737zw;
import p000X.C27291Hg;

public class ClipsCoverPhotoPickerController extends C27291Hg implements AnonymousClass810 {
    public int A00 = Math.round(((float) (C06220Of.A09(this.A07) >> 1)) / 0.5625f);
    public int A01;
    public int A02;
    public int A03 = this.A07.getResources().getDimensionPixelOffset(C0003R.dimen.cover_photo_picker_filmstrip_frame_height);
    public AnonymousClass7GQ A04;
    public C187737zw A05;
    public Integer A06;
    public final Context A07;
    public final AnonymousClass7FQ A08;
    public final PendingMedia A09;
    public final AnonymousClass0C1 A0A;
    public final String A0B;
    public final boolean A0C;
    public ViewGroup mAddFromGalleryButton;
    public FrameLayout mCoverPhotoContainer;
    public FrameLayout mCoverPhotoContainerVideoPreview;
    public IgImageView mCurrentCoverPhotoImage;
    public LinearLayout mFilmStripFramesContainer;
    public SeekBar mSeekBar;

    public final void BPE() {
    }

    private void A00() {
        boolean z;
        switch (this.A06.intValue()) {
            case 0:
                this.A04.A07 = false;
                this.mFilmStripFramesContainer.setAlpha(1.0f);
                z = true;
                break;
            case 1:
                this.A04.A07 = true;
                this.mFilmStripFramesContainer.setAlpha(0.5f);
                z = !this.A09.A1g.equals(this.A0B);
                break;
            default:
                return;
        }
        this.mCoverPhotoContainer.post(new AnonymousClass7FS(this, z));
    }

    public final void AyT() {
        C12670hC.A04(new AnonymousClass7FR(this));
    }

    public final void BE0() {
        C187737zw r1 = this.A05;
        AnonymousClass87W r0 = r1.A0A.A06;
        if (r0 != null) {
            r0.A01();
        }
        AnonymousClass817 r02 = r1.A0E;
        if (r02 != null) {
            r02.A01();
        }
    }

    public final void BJx() {
        this.A05.A01();
    }

    public final void BOf() {
        if (this.A06 == Constants.ONE) {
            this.A06 = Constants.ZERO;
            this.mCurrentCoverPhotoImage.setImageBitmap((Bitmap) null);
            A00();
        }
    }

    public ClipsCoverPhotoPickerController(Context context, PendingMedia pendingMedia, AnonymousClass0C1 r7, AnonymousClass7FQ r8) {
        this.A07 = context;
        this.A09 = pendingMedia;
        this.A0A = r7;
        this.A08 = r8;
        this.A0B = pendingMedia.A1g;
        this.A0C = pendingMedia.A2r;
        this.A01 = C06220Of.A09(context) >> 1;
        Resources resources = this.A07.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C0003R.dimen.cover_photo_picker_filmstrip_frame_width);
        int A072 = C06220Of.A07(this.A07) - (resources.getDimensionPixelOffset(C0003R.dimen.cover_photo_picker_seekbar_horizontal_margin) << 1);
        this.A02 = A072 / Math.round(((float) A072) / ((float) dimensionPixelOffset));
    }

    public final void Azh() {
        ClipsCoverPhotoPickerControllerLifecycleUtil.cleanupReferences(this);
    }

    public final void BVf(View view, Bundle bundle) {
        AnonymousClass817 r15;
        Integer num;
        View view2 = view;
        this.mCoverPhotoContainer = (FrameLayout) view2.findViewById(C0003R.C0005id.cover_photo_container);
        this.mCoverPhotoContainerVideoPreview = (FrameLayout) view2.findViewById(C0003R.C0005id.cover_photo_video_preview_container);
        this.mCurrentCoverPhotoImage = (IgImageView) view2.findViewById(C0003R.C0005id.current_cover_photo);
        this.mFilmStripFramesContainer = (LinearLayout) view2.findViewById(C0003R.C0005id.filmstrip_frames_container);
        this.mSeekBar = (SeekBar) view2.findViewById(C0003R.C0005id.seekbar);
        ViewGroup viewGroup = (ViewGroup) view2.findViewById(C0003R.C0005id.add_from_gallery);
        this.mAddFromGalleryButton = viewGroup;
        viewGroup.setOnClickListener(new AnonymousClass7FP(this));
        C06220Of.A0V(this.mCoverPhotoContainer, this.A01, this.A00);
        int dimensionPixelOffset = this.A03 + this.A07.getResources().getDimensionPixelOffset(C0003R.dimen.seekbar_scrubber_filmstrip_vertical_overshoot);
        C06220Of.A0K(this.mSeekBar, dimensionPixelOffset);
        Resources resources = this.A07.getResources();
        AnonymousClass7GQ r2 = new AnonymousClass7GQ(resources);
        Context context = this.A07;
        r2.A04 = C019000b.A00(context, AnonymousClass1BA.A03(context, C0003R.attr.glyphColorPrimary));
        r2.A02 = (float) resources.getDimensionPixelOffset(C0003R.dimen.seekbar_scrubber_outline_width);
        r2.A01 = (float) resources.getDimensionPixelOffset(C0003R.dimen.seekbar_scrubber_inner_outline_width);
        r2.A00 = (float) resources.getDimensionPixelOffset(C0003R.dimen.seekbar_scrubber_corner_radius);
        r2.A05 = this.A02;
        r2.A03 = dimensionPixelOffset;
        this.A04 = r2;
        this.mSeekBar.setThumb(r2);
        this.mSeekBar.setProgress(0);
        this.mSeekBar.setMax(this.A09.A0l.AKe());
        try {
            ClipInfo clipInfo = this.A09.A0l;
            clipInfo.A05 = -1;
            r15 = new AnonymousClass817(new C183617sm(clipInfo), this.A02, this.A03, 4, false);
        } catch (IOException e) {
            AnonymousClass0QD.A05("ClipsCoverPhotoPickerController", "Video frame generator setup failed", e);
            r15 = null;
        }
        this.A05 = new C187737zw(this.A07, this.A0A, this.mCoverPhotoContainerVideoPreview, this.mSeekBar, this.A04, this.mFilmStripFramesContainer, 0.5625f, this.A09, this, this.A02, this.A03, this.A01, this.A00, r15);
        this.mSeekBar.setProgress(this.A09.A05);
        PendingMedia pendingMedia = this.A09;
        if (!TextUtils.isEmpty(pendingMedia.A1g)) {
            if (!this.A09.A1g.equals(this.A0B) || this.A06 == null) {
                this.mCurrentCoverPhotoImage.setImageURI(Uri.parse(pendingMedia.A1g));
                num = Constants.ONE;
            }
            A00();
        }
        num = Constants.ZERO;
        this.A06 = num;
        A00();
    }
}
