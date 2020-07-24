package com.instagram.showreelnative.p037ui.reels;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.facebook.C0003R;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.feed.widget.IgProgressImageViewProgressBar;
import p000X.AnonymousClass0C1;
import p000X.C019000b;
import p000X.C05770Lw;
import p000X.C168417Hf;
import p000X.C2105296c;
import p000X.C2105496e;
import p000X.C2105596f;
import p000X.C28089CbD;
import p000X.C28865Cnz;
import p000X.C28924Cp0;
import p000X.C28934CpA;
import p000X.C39941no;

/* renamed from: com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView */
public class IgShowreelNativeProgressView extends FrameLayout {
    public static final int A0A = IgShowreelNativeProgressView.class.hashCode();
    public int A00 = 0;
    public ProgressBar A01;
    public ColorFilterAlphaImageView A02;
    public C39941no A03;
    public C28865Cnz A04;
    public C28089CbD A05;
    public AnonymousClass0C1 A06;
    public C2105496e A07;
    public C168417Hf A08;
    public boolean A09;

    public void setAnimation(AnonymousClass0C1 r7, C39941no r8, C28865Cnz cnz, C28089CbD cbD) {
        this.A03 = null;
        this.A04 = null;
        this.A05 = null;
        this.A01.setProgress(0);
        this.A07.reset();
        A01(this, 0);
        this.A06 = r7;
        this.A03 = r8;
        this.A04 = cnz;
        this.A05 = cbD;
        this.A07.setAnimation(r7, r8, cnz, cbD);
        if (C05770Lw.A00().A00.getBoolean("showreel_native_visual_indicator_enabled", false)) {
            if (this.A08 == null) {
                C168417Hf r3 = new C168417Hf(getContext());
                this.A08 = r3;
                addView(r3, new FrameLayout.LayoutParams(-1, -1, 17));
            }
            this.A08.setVisibility(0);
            return;
        }
        C168417Hf r1 = this.A08;
        if (r1 != null) {
            r1.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r4.A09 == false) goto L_0x0011;
     */
    public static void A01(IgShowreelNativeProgressView igShowreelNativeProgressView, int i) {
        int i2;
        if (igShowreelNativeProgressView.A00 != i) {
            igShowreelNativeProgressView.A00 = i;
            ProgressBar progressBar = igShowreelNativeProgressView.A01;
            int i3 = 0;
            if (i == 1) {
                i2 = 0;
            }
            i2 = 8;
            progressBar.setVisibility(i2);
            ColorFilterAlphaImageView colorFilterAlphaImageView = igShowreelNativeProgressView.A02;
            if (igShowreelNativeProgressView.A00 != 3) {
                i3 = 8;
            }
            colorFilterAlphaImageView.setVisibility(i3);
        }
    }

    public ImageView getImageView() {
        return this.A07.getDefaultImageView();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r4 == false) goto L_0x000c;
     */
    public void setEnableProgressBar(boolean z) {
        int i;
        this.A09 = z;
        ProgressBar progressBar = this.A01;
        if (this.A00 == 1) {
            i = 0;
        }
        i = 8;
        progressBar.setVisibility(i);
    }

    public void setInteractivityListener(C28934CpA cpA) {
        this.A07.setInteractivityListener(cpA);
    }

    public void setPlaceHolderColor(int i) {
        this.A07.setPlaceHolderColor(i);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        this.A07.getDefaultImageView().setScaleType(scaleType);
    }

    private void A00() {
        removeAllViews();
        Context context = getContext();
        C28924Cp0 cp0 = new C28924Cp0(context);
        this.A07 = cp0;
        cp0.A3k(A0A, new C2105596f(this));
        getContext();
        IgProgressImageViewProgressBar igProgressImageViewProgressBar = new IgProgressImageViewProgressBar(context, (AttributeSet) null, 16842872);
        this.A01 = igProgressImageViewProgressBar;
        igProgressImageViewProgressBar.setIndeterminate(true);
        ProgressBar progressBar = this.A01;
        getContext();
        progressBar.setProgressDrawable(C019000b.A03(context, C0003R.C0004drawable.feed_image_determinate_progress));
        ProgressBar progressBar2 = this.A01;
        getContext();
        progressBar2.setIndeterminateDrawable(C019000b.A03(context, C0003R.C0004drawable.reel_image_indeterminate_progress));
        getContext();
        ColorFilterAlphaImageView colorFilterAlphaImageView = new ColorFilterAlphaImageView(context);
        this.A02 = colorFilterAlphaImageView;
        colorFilterAlphaImageView.setImageResource(C0003R.C0004drawable.refresh_big);
        this.A02.setNormalColorFilter(-1);
        this.A02.setOnClickListener(new C2105296c(this));
        addView((View) this.A07, new FrameLayout.LayoutParams(-1, -1, 17));
        addView(this.A01, new FrameLayout.LayoutParams(-1, -2, 17));
        int dimension = (int) this.A02.getResources().getDimension(C0003R.dimen.retry_icon_size);
        addView(this.A02, new FrameLayout.LayoutParams(dimension, dimension, 17));
    }

    public IgShowreelNativeProgressView(Context context) {
        super(context);
        A00();
    }

    public IgShowreelNativeProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public IgShowreelNativeProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
