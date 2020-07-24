package com.instagram.feed.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.typedurl.ImageUrl;
import p000X.Constants;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass0jO;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass1PD;
import p000X.AnonymousClass1ZA;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C13880jN;
import p000X.C25913Bc3;
import p000X.C31851a7;
import p000X.C31871a9;
import p000X.C31881aA;
import p000X.C31891aB;
import p000X.C31911aD;
import p000X.C32021aP;
import p000X.C34191eE;
import p000X.C38591lW;
import p000X.C38631la;
import p000X.C38661ld;

public class IgProgressImageView extends FrameLayout {
    public static final Object A0H = new Object();
    public ImageView.ScaleType A00;
    public ProgressBar A01;
    public TextView A02;
    public ColorFilterAlphaImageView A03;
    public C31881aA A04;
    public IgImageView A05;
    public boolean A06;
    public boolean A07;
    public float A08 = 1.0f;
    public Integer A09 = Constants.ZERO;
    public Integer A0A;
    public String A0B;
    public boolean A0C = true;
    public boolean A0D;
    public final SparseArray A0E = new SparseArray();
    public final SparseArray A0F = new SparseArray();
    public final AnonymousClass0jO A0G = C13880jN.A00;

    public final void A07(String str, String str2, boolean z) {
        A02(this, str, (ImageUrl) null, str2, z);
    }

    public void setAspectRatio(float f) {
        boolean z = false;
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            z = true;
        }
        AnonymousClass0a4.A0B(z, "Aspect ratio must be greater than 0");
        this.A08 = f;
    }

    public static void A00(IgProgressImageView igProgressImageView) {
        IgImageView igImageView = igProgressImageView.A05;
        if (igImageView.getTypedUrl() != null) {
            AnonymousClass0a4.A07(igImageView.A0J, "Cannot retry if url not set");
            String str = igImageView.A0J;
            ImageUrl imageUrl = igImageView.A09;
            AnonymousClass0a4.A06(str);
            IgImageView.A01(igImageView, str, imageUrl, (String) null, false, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r4.A0C == false) goto L_0x0012;
     */
    public static void A01(IgProgressImageView igProgressImageView, Integer num) {
        int i;
        if (igProgressImageView.A0A != num) {
            igProgressImageView.A0A = num;
            ProgressBar progressBar = igProgressImageView.A01;
            int i2 = 0;
            if (num == Constants.ZERO) {
                i = 0;
            }
            i = 8;
            progressBar.setVisibility(i);
            if (igProgressImageView.A09 == Constants.ONE) {
                ColorFilterAlphaImageView colorFilterAlphaImageView = igProgressImageView.A03;
                if (igProgressImageView.A0A != Constants.A0N) {
                    i2 = 8;
                }
                colorFilterAlphaImageView.setVisibility(i2);
                return;
            }
            TextView textView = igProgressImageView.A02;
            if (igProgressImageView.A0A != Constants.A0N) {
                i2 = 8;
            }
            textView.setVisibility(i2);
        }
    }

    public static void A02(IgProgressImageView igProgressImageView, String str, ImageUrl imageUrl, String str2, boolean z) {
        igProgressImageView.A0G.A03(igProgressImageView, AnonymousClass1ZA.Unset);
        igProgressImageView.A0G.A03(igProgressImageView, AnonymousClass1ZA.LoadingData);
        A01(igProgressImageView, Constants.ZERO);
        if (imageUrl != null) {
            igProgressImageView.A05.A09(imageUrl.AZc(), imageUrl, str2, z);
        } else if (str != null) {
            igProgressImageView.A05.A09(str, (ImageUrl) null, str2, z);
        }
    }

    private AnonymousClass1ZA getUIContentState() {
        switch (this.A0A.intValue()) {
            case 0:
            case 1:
                return AnonymousClass1ZA.LoadingData;
            case 2:
                return AnonymousClass1ZA.ShowingData;
            case 3:
                return AnonymousClass1ZA.FailedToLoad;
            default:
                return AnonymousClass1ZA.Unset;
        }
    }

    private void setUrlOrTypedUrlWithFallback(String str, ImageUrl imageUrl, String str2, ImageUrl imageUrl2, String str3) {
        this.A0G.A03(this, AnonymousClass1ZA.Unset);
        this.A0G.A03(this, AnonymousClass1ZA.LoadingData);
        this.A07 = false;
        A01(this, Constants.ZERO);
        C38661ld r1 = new C38661ld(this);
        if (imageUrl == null || imageUrl2 == null) {
            this.A05.setUrlWithFallback(str, str2, str3, (C31881aA) r1);
        } else {
            this.A05.setUrlWithFallback(imageUrl, imageUrl2, str3, (C31881aA) r1);
        }
    }

    public final void A03() {
        this.A0G.A03(this, AnonymousClass1ZA.Unset);
        this.A07 = false;
        A01(this, Constants.ZERO);
        this.A01.setProgress(0);
        this.A05.A04();
    }

    public final void A04(int i) {
        this.A0E.delete(i);
    }

    public final void A05(int i, C38591lW r3) {
        this.A0E.put(i, r3);
    }

    public final boolean A08() {
        IgImageView igImageView = this.A05;
        if (igImageView.A0L || igImageView.A0K || igImageView.A01 > 0 || igImageView.A0M) {
            return true;
        }
        return false;
    }

    public int getCurrentScans() {
        return this.A05.A01;
    }

    public IgImageView getIgImageView() {
        return this.A05;
    }

    public final void onMeasure(int i, int i2) {
        if (this.A0D) {
            int size = View.MeasureSpec.getSize(i);
            int i3 = (int) (((float) size) / this.A08);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
            this.A05.measure(i, makeMeasureSpec);
            this.A01.measure(i, (int) C06220Of.A03(getContext(), 10));
            if (this.A09 == Constants.ONE) {
                this.A03.measure(i, makeMeasureSpec);
            } else {
                this.A02.measure(i, makeMeasureSpec);
            }
            setMeasuredDimension(size, i3);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setAdjustViewBounds(boolean z) {
        this.A05.setAdjustViewBounds(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r4 == false) goto L_0x000d;
     */
    public void setEnableProgressBar(boolean z) {
        int i;
        this.A0C = z;
        ProgressBar progressBar = this.A01;
        if (this.A0A == Constants.ZERO) {
            i = 0;
        }
        i = 8;
        progressBar.setVisibility(i);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.A05.setImageBitmap(bitmap);
        A01(this, Constants.A0C);
    }

    public void setImageRenderer(AnonymousClass1PD r2) {
        this.A05.setImageRenderer(r2);
    }

    public void setIndeterminateProgressBarDrawable(Drawable drawable) {
        this.A01.setIndeterminateDrawable(drawable);
    }

    public void setMiniPreviewBlurRadius(int i) {
        this.A05.setMiniPreviewBlurRadius(i);
    }

    public void setMiniPreviewPayload(String str) {
        this.A05.setMiniPreviewPayload(str);
    }

    public void setProgressBarDrawable(Drawable drawable) {
        this.A01.setProgressDrawable(drawable);
    }

    public void setProgressBarGravity(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A01.getLayoutParams();
        layoutParams.gravity = i;
        this.A01.setLayoutParams(layoutParams);
    }

    public void setProgressBarIndeterminate(boolean z) {
        this.A01.setIndeterminate(z);
    }

    public void setProgressiveImageConfig(C38631la r2) {
        this.A05.setProgressiveImageConfig(r2);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        this.A05.setScaleType(scaleType);
    }

    public final void A06(AttributeSet attributeSet) {
        removeAllViews();
        if (attributeSet != null) {
            Context context = getContext();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2N);
            this.A0B = obtainStyledAttributes.getString(6);
            this.A06 = obtainStyledAttributes.getBoolean(2, false);
            this.A0D = obtainStyledAttributes.getBoolean(3, false);
            this.A00 = ImageView.ScaleType.values()[obtainStyledAttributes.getInt(0, ImageView.ScaleType.FIT_XY.ordinal())];
            this.A09 = Constants.ZERO(2)[obtainStyledAttributes.getInt(7, 0)];
            if (this.A06) {
                getContext();
                this.A05 = new CircularImageView(context);
            } else {
                getContext();
                IgImageView igImageView = new IgImageView(context);
                this.A05 = igImageView;
                igImageView.setScaleType(this.A00);
            }
            IgImageView igImageView2 = this.A05;
            igImageView2.A0D = new C31851a7(this);
            igImageView2.A0N = true;
            igImageView2.setOnLoadListener(new C31871a9(this));
            igImageView2.A0E = new C31891aB(this);
            igImageView2.A0C = new C31911aD(this);
            igImageView2.setAdjustViewBounds(obtainStyledAttributes.getBoolean(1, false));
            IgImageView igImageView3 = this.A05;
            igImageView3.setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(5, igImageView3.getMaxWidth()));
            IgImageView igImageView4 = this.A05;
            igImageView4.setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(4, igImageView4.getMaxHeight()));
            obtainStyledAttributes.recycle();
        }
        Context context2 = getContext();
        IgProgressImageViewProgressBar igProgressImageViewProgressBar = new IgProgressImageViewProgressBar(context2, (AttributeSet) null, 16842872);
        this.A01 = igProgressImageViewProgressBar;
        igProgressImageViewProgressBar.setIndeterminate(false);
        ProgressBar progressBar = this.A01;
        getContext();
        progressBar.setProgressDrawable(C019000b.A03(context2, C0003R.C0004drawable.feed_image_determinate_progress));
        this.A01.setMax(100);
        if (this.A09 == Constants.ONE) {
            getContext();
            ColorFilterAlphaImageView colorFilterAlphaImageView = new ColorFilterAlphaImageView(context2);
            this.A03 = colorFilterAlphaImageView;
            colorFilterAlphaImageView.setImageResource(C0003R.C0004drawable.refresh_big);
            this.A03.setNormalColorFilter(-1);
            this.A03.setOnClickListener(new C34191eE(this));
        } else {
            getContext();
            TextView textView = new TextView(context2);
            this.A02 = textView;
            textView.setText(C0003R.string.tap_to_reload);
            this.A02.setGravity(17);
            this.A02.setOnClickListener(new C32021aP(this));
        }
        addView(this.A05, new FrameLayout.LayoutParams(-1, -1, 17));
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1, 17));
        if (this.A09 == Constants.ONE) {
            int dimension = (int) this.A03.getResources().getDimension(C0003R.dimen.retry_icon_size);
            addView(this.A03, new FrameLayout.LayoutParams(dimension, dimension, 17));
        } else {
            addView(this.A02, new FrameLayout.LayoutParams(-1, -2, 17));
        }
        A01(this, Constants.ZERO);
        this.A07 = false;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(-144968289);
        super.onAttachedToWindow();
        this.A0G.A04(this, this.A0B);
        this.A0G.A03(this, getUIContentState());
        AnonymousClass0Z0.A0D(275576131, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-1485281054);
        super.onDetachedFromWindow();
        this.A0G.A02(this);
        AnonymousClass0Z0.A0D(-1860593333, A062);
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
    }

    public void setFitAspectRatio(boolean z) {
        this.A0D = z;
    }

    public void setOnFallbackListener(C31881aA r1) {
        this.A04 = r1;
    }

    public IgProgressImageView(Context context) {
        super(context);
        A06((AttributeSet) null);
    }

    public IgProgressImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A06(attributeSet);
    }

    public void setPlaceHolderColor(int i) {
        this.A05.setPlaceHolderColor(i);
    }

    public void setPlaceHolderColor(ColorDrawable colorDrawable) {
        this.A05.setPlaceHolderColor(colorDrawable);
    }

    public void setUrl(ImageUrl imageUrl) {
        A02(this, imageUrl.AZc(), imageUrl, (String) null, false);
    }

    public void setUrl(ImageUrl imageUrl, String str) {
        A02(this, imageUrl.AZc(), imageUrl, str, false);
    }

    public void setUrl(String str) {
        A07(str, (String) null, false);
    }

    public void setUrl(String str, String str2) {
        A07(str, str2, false);
    }

    public void setUrlWithFallback(ImageUrl imageUrl, ImageUrl imageUrl2, String str) {
        setUrlOrTypedUrlWithFallback(imageUrl.AZc(), imageUrl, imageUrl2.AZc(), imageUrl2, str);
    }

    public void setUrlWithFallback(String str, String str2, String str3) {
        setUrlOrTypedUrlWithFallback(str, (ImageUrl) null, str2, (ImageUrl) null, str3);
    }
}
