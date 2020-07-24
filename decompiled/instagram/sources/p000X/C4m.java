package p000X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.facebook.C0003R;
import com.facebook.smartcapture.p011ui.IdCaptureUi;
import com.facebook.smartcapture.p011ui.ResourcesButton;
import com.facebook.smartcapture.p011ui.ResourcesTextView;
import java.util.Arrays;

/* renamed from: X.C4m */
public final class C4m extends C5C {
    public Bitmap A00;
    public FrameLayout A01;
    public FrameLayout A02;
    public FrameLayout A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public ImageView A07;
    public LinearLayout A08;
    public ProgressBar A09;
    public ResourcesButton A0A;
    public ResourcesButton A0B;
    public ResourcesTextView A0C;
    public ResourcesTextView A0D;
    public ResourcesTextView A0E;
    public ResourcesTextView A0F;
    public B7F A0G;
    public String A0H;
    public boolean A0I = false;
    public Point[] A0J;
    public ImageView A0K;
    public C27237C4e A0L;
    public C27242C4l A0M;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-631015450);
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(C0003R.layout.default_photo_review_fragment, viewGroup, false);
        this.A02 = frameLayout;
        this.A01 = (FrameLayout) layoutInflater.inflate(C0003R.layout.photo_review_full, frameLayout, false);
        FrameLayout frameLayout2 = this.A02;
        AnonymousClass0Z0.A09(386002183, A022);
        return frameLayout2;
    }

    public final void onStart() {
        int A022 = AnonymousClass0Z0.A02(373062709);
        super.onStart();
        if (this.A00 == null) {
            C29484Cyd.A00(new C4o(this), C29484Cyd.A0D).A05(new C27245C4v(this), C29484Cyd.A0C);
        }
        AnonymousClass0Z0.A09(-769808181, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C27242C4l c4l;
        super.onViewCreated(view, bundle);
        this.A04 = (ImageView) C26970BvZ.A00(view, C0003R.C0005id.iv_photo_review);
        this.A0K = (ImageView) C26970BvZ.A00(view, C0003R.C0005id.iv_photo_review_expand);
        this.A09 = (ProgressBar) C26970BvZ.A00(view, C0003R.C0005id.pb_photo_review_loading);
        this.A06 = (ImageView) C26970BvZ.A00(this.A01, C0003R.C0005id.iv_photo_review_full);
        this.A05 = (ImageView) C26970BvZ.A00(view, C0003R.C0005id.iv_photo_review_back_button);
        this.A07 = (ImageView) C26970BvZ.A00(this.A01, C0003R.C0005id.iv_photo_review_full_close);
        this.A08 = (LinearLayout) C26970BvZ.A00(view, C0003R.C0005id.ll_photo_review_text);
        this.A0E = (ResourcesTextView) C26970BvZ.A00(view, C0003R.C0005id.tv_photo_review_header);
        this.A0F = (ResourcesTextView) C26970BvZ.A00(view, C0003R.C0005id.tv_photo_review_title);
        this.A0C = (ResourcesTextView) C26970BvZ.A00(view, C0003R.C0005id.tv_photo_review_body);
        this.A0D = (ResourcesTextView) C26970BvZ.A00(view, C0003R.C0005id.tv_photo_review_body_info);
        this.A03 = (FrameLayout) C26970BvZ.A00(view, C0003R.C0005id.fl_privacy_disclaimer_container);
        this.A0B = (ResourcesButton) C26970BvZ.A00(view, C0003R.C0005id.btn_next);
        this.A0A = (ResourcesButton) C26970BvZ.A00(view, C0003R.C0005id.btn_retake_photo);
        Context requireContext = requireContext();
        if (this.A03 != null) {
            this.A07.setImageDrawable(C019000b.A03(requireContext, C0003R.C0004drawable.instagram_chevron_left_outline_24));
            Drawable A032 = C019000b.A03(requireContext, C0003R.C0004drawable.instagram_chevron_left_outline_24);
            if (A032 != null) {
                this.A05.setImageDrawable(A032);
            }
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0L = (C27237C4e) bundle2.getSerializable("capture_mode");
            this.A0M = (C27242C4l) bundle2.getSerializable("capture_stage");
            this.A0H = bundle2.getString("photo_file_path");
            Parcelable[] parcelableArray = bundle2.getParcelableArray("skewed_crop_points");
            if (parcelableArray != null) {
                this.A0J = (Point[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Point[].class);
            }
        }
        C27237C4e c4e = this.A0L;
        if (!(c4e == null || (c4l = this.A0M) == null)) {
            if (c4e == C27237C4e.FRONT_AND_BACK && c4l == C27242C4l.ID_FRONT_SIDE) {
                this.A0B.setText(C0003R.string.next_button_text_frond_and_back);
            } else {
                this.A0D.setVisibility(8);
                this.A0B.setText(C0003R.string.next_button_text);
            }
        }
        this.A0A.setOnClickListener(new C51(this));
        this.A05.setOnClickListener(new C55(this));
        this.A04.setOnClickListener(new C27246C4w(this));
        C26970BvZ.A00(this.A01, C0003R.C0005id.iv_photo_review_full_close).setOnClickListener(new C5E(this));
        this.A0B.setOnClickListener(new C5A(this));
        C213009Go.A03(requireContext(), this.A09);
        AnonymousClass1E1.A0X(this.A0K, ColorStateList.valueOf(C213009Go.A00(requireContext(), C0003R.attr.sc_accent_deemphasized)));
        Context requireContext2 = requireContext();
        if (C213009Go.A04(requireContext2, C0003R.attr.id_photo_review_hide_header)) {
            this.A0E.setVisibility(8);
        }
        if (C213009Go.A04(requireContext2, C0003R.attr.id_photo_review_centered_text)) {
            this.A0F.setGravity(49);
            this.A0C.setGravity(49);
            this.A0D.setGravity(49);
        }
        TypedValue typedValue = new TypedValue();
        requireContext2.getTheme().resolveAttribute(C0003R.attr.id_photo_review_title_text, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.length() > 0) {
            this.A0F.setText(charSequence);
        }
        TypedValue typedValue2 = new TypedValue();
        requireContext2.getTheme().resolveAttribute(C0003R.attr.id_photo_review_body_text, typedValue2, true);
        CharSequence charSequence2 = typedValue2.string;
        if (charSequence2 != null && charSequence2.length() > 0) {
            this.A0C.setText(charSequence2);
        }
        IdCaptureUi idCaptureUi = this.A02;
        if (idCaptureUi != null) {
            View ARu = idCaptureUi.ARu(requireContext2);
            if (ARu != null) {
                this.A03.addView(ARu);
            } else {
                this.A02.removeView(this.A03);
            }
        }
    }
}
