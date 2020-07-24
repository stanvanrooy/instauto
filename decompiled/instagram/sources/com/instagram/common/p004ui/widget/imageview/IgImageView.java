package com.instagram.common.p004ui.widget.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.lang.ref.WeakReference;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass12C;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass18C;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass1GA;
import p000X.AnonymousClass1GB;
import p000X.AnonymousClass1GC;
import p000X.AnonymousClass1GD;
import p000X.AnonymousClass1GE;
import p000X.AnonymousClass1GH;
import p000X.AnonymousClass1GK;
import p000X.AnonymousClass1PD;
import p000X.AnonymousClass3WW;
import p000X.AnonymousClass98T;
import p000X.C169377Lu;
import p000X.C177437hx;
import p000X.C31861a8;
import p000X.C31881aA;
import p000X.C31901aC;
import p000X.C31921aE;
import p000X.C37371jY;
import p000X.C38631la;
import p000X.C51442Kr;

/* renamed from: com.instagram.common.ui.widget.imageview.IgImageView */
public class IgImageView extends ImageView {
    public static C169377Lu A0X;
    public static boolean A0Y;
    public static C177437hx A0Z;
    public float A00 = -1.0f;
    public int A01;
    public int A02 = 1;
    public int A03 = 3;
    public Bitmap A04;
    public AnonymousClass1GK A05;
    public AnonymousClass1GK A06;
    public C38631la A07;
    public C51442Kr A08 = null;
    public ImageUrl A09;
    public C31881aA A0A;
    public C31881aA A0B;
    public C31921aE A0C;
    public C31861a8 A0D;
    public C31901aC A0E;
    public AnonymousClass3WW A0F;
    public AnonymousClass1PD A0G;
    public String A0H = null;
    public String A0I;
    public String A0J;
    public boolean A0K;
    public boolean A0L = false;
    public boolean A0M;
    public boolean A0N = false;
    public int A0O;
    public int A0P;
    public Drawable A0Q;
    public boolean A0R;
    public final AnonymousClass18C A0S = new AnonymousClass1GD(this);
    public final AnonymousClass18C A0T = new AnonymousClass1GC(this);
    public final AnonymousClass1GA A0U = new AnonymousClass1GA(this);
    public final AnonymousClass1GB A0V = new AnonymousClass1GB(this);
    public final AnonymousClass1GE A0W = new AnonymousClass1GE(this);

    public static void A01(IgImageView igImageView, String str, ImageUrl imageUrl, String str2, boolean z, boolean z2) {
        AnonymousClass1GH A0E2;
        Bitmap bitmap;
        AnonymousClass0a4.A06(str);
        if (!AnonymousClass17M.A00(igImageView.A0J, str) || !igImageView.A0L || (bitmap = igImageView.A04) == null) {
            C177437hx r1 = A0Z;
            if (r1 != null) {
                r1.updateUrl(igImageView, igImageView.A0J, str);
            }
            igImageView.A04();
            igImageView.A0J = str;
            igImageView.A09 = imageUrl;
            if (imageUrl != null) {
                A0E2 = AnonymousClass12C.A0c.A0D(imageUrl, str2);
            } else if (str != null) {
                A0E2 = AnonymousClass12C.A0c.A0E(str, str2);
            } else {
                throw new IllegalStateException("call buildAndQueueRequest without url");
            }
            A0E2.A0G = false;
            C38631la r0 = igImageView.A07;
            if (r0 != null) {
                A0E2.A04 = r0;
                A0E2.A0C = new WeakReference(igImageView.A0V);
            }
            if (A0Y) {
                A0E2.A0A = new WeakReference(igImageView.A0W);
            }
            A0E2.A02(igImageView.A0S);
            A0E2.A01 = igImageView.A02;
            A0E2.A00 = igImageView.A00;
            A0E2.A0I = igImageView.A0N;
            A0E2.A0E = z;
            A0E2.A0B = new WeakReference(igImageView.A0U);
            A0E2.A06 = igImageView.A0I;
            A0E2.A02 = igImageView.A03;
            A0E2.A0J = false;
            A0E2.A0H = z2;
            igImageView.A06 = A0E2.A00();
            AnonymousClass3WW r02 = igImageView.A0F;
            if (r02 != null) {
                r02.BJH();
            }
            igImageView.A06.A04();
            return;
        }
        C31881aA r3 = igImageView.A0B;
        if (r3 != null) {
            r3.B9O(new C37371jY(bitmap, igImageView.A0J, igImageView.A0H));
        }
        Bitmap bitmap2 = igImageView.A04;
        AnonymousClass1PD r03 = igImageView.A0G;
        if (r03 != null) {
            r03.Bbj(igImageView, bitmap2);
        } else {
            igImageView.setImageBitmap(bitmap2);
        }
    }

    public final void A04() {
        this.A04 = null;
        this.A0L = false;
        this.A06 = null;
        this.A05 = null;
        this.A0K = false;
        this.A0M = false;
        this.A01 = 0;
        this.A08 = null;
        this.A0H = null;
        A05();
    }

    public final void A06(ImageUrl imageUrl, String str, boolean z) {
        A01(this, imageUrl.AZc(), imageUrl, str, false, z);
    }

    public void A08(String str, int i) {
        AnonymousClass0a4.A06(str);
        this.A05 = null;
        this.A02 = Math.max(i, 1);
        AnonymousClass0a4.A06(str);
        A01(this, str, (ImageUrl) null, (String) null, false, false);
    }

    public final void A09(String str, ImageUrl imageUrl, String str2, boolean z) {
        AnonymousClass0a4.A06(str);
        A01(this, str, imageUrl, str2, z, false);
    }

    public static void setDebugOverlayDrawer(C169377Lu r1) {
        if (A0Y) {
            A0X = r1;
        }
    }

    public static void setDebuggable(boolean z) {
        A0Y = z;
        if (!z) {
            A0Z = null;
            A0X = null;
        }
    }

    public final Long A03(StringBuilder sb) {
        Bitmap bitmap;
        if (!this.A0L || (bitmap = this.A04) == null) {
            return null;
        }
        int[] iArr = new int[72];
        Bitmap.createScaledBitmap(bitmap, 9, 8, true).getPixels(iArr, 0, 9, 0, 0, 9, 8);
        AnonymousClass0a4.A09(true);
        for (int i = 0; i < 8; i++) {
            for (int i2 = 0; i2 < 9; i2++) {
                String hexString = Integer.toHexString(AnonymousClass98T.A00(iArr[(i * 9) + i2]));
                StringBuilder sb2 = sb;
                if (hexString.length() < 2) {
                    sb2.append("0");
                }
                sb2.append(hexString);
            }
        }
        AnonymousClass0a4.A0D(true, "Invalid pixels array length. Expected: %d. Got %d", 72, 72);
        long j = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i3 * 9;
            int A002 = AnonymousClass98T.A00(iArr[i4]);
            int i5 = 1;
            while (i5 < 9) {
                int A003 = AnonymousClass98T.A00(iArr[i4 + i5]);
                long j2 = j << 1;
                int i6 = 0;
                if (A002 <= A003) {
                    i6 = 1;
                }
                j = j2 | ((long) i6);
                i5++;
                A002 = A003;
            }
        }
        return Long.valueOf(j);
    }

    public final void A05() {
        setImageDrawable(this.A0Q);
    }

    public int getCurrentScans() {
        return this.A01;
    }

    public ImageUrl getTypedUrl() {
        ImageUrl imageUrl = this.A09;
        if (imageUrl == null) {
            return new SimpleImageUrl(this.A0J);
        }
        return imageUrl;
    }

    public void onMeasure(int i, int i2) {
        if (this.A0R) {
            i2 = i;
        }
        super.onMeasure(i, i2);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2J);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        int color = obtainStyledAttributes.getColor(2, 0);
        if (color != 0) {
            this.A0Q = new ColorDrawable(color);
        }
        this.A0R = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
    }

    public void A07(ImageUrl imageUrl, boolean z) {
        AnonymousClass0a4.A06(imageUrl);
        String AZc = imageUrl.AZc();
        AnonymousClass0a4.A06(AZc);
        this.A05 = null;
        A09(AZc, imageUrl, (String) null, z);
    }

    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (Build.VERSION.SDK_INT < 23 && drawable == getDrawable() && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth != this.A0P || intrinsicHeight != this.A0O) {
                this.A0P = intrinsicWidth;
                this.A0O = intrinsicHeight;
                setSelected(false);
            }
        }
    }

    public void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(-830384259);
        super.onAttachedToWindow();
        C177437hx r0 = A0Z;
        if (r0 != null) {
            r0.registerView(this);
        }
        AnonymousClass0Z0.A0D(880139788, A062);
    }

    public void onDetachedFromWindow() {
        AnonymousClass1GK r0;
        int A062 = AnonymousClass0Z0.A06(181573684);
        super.onDetachedFromWindow();
        if (!this.A0L && (r0 = this.A06) != null) {
            r0.A03();
        }
        C177437hx r02 = A0Z;
        if (r02 != null) {
            r02.unregisterView(this);
        }
        AnonymousClass0Z0.A0D(-961628347, A062);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C169377Lu r2 = A0X;
        if (r2 != null) {
            r2.drawOverlay(canvas, this, this.A08, this.A04);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null) {
            this.A0P = drawable.getIntrinsicWidth();
            this.A0O = drawable.getIntrinsicHeight();
        }
    }

    public static void setDebugImageViewsTracker(C177437hx r0) {
        A0Z = r0;
    }

    public void setImageDecodeAspectRatio(float f) {
        this.A00 = f;
    }

    public void setImageRenderer(AnonymousClass1PD r1) {
        this.A0G = r1;
    }

    public void setMiniPreviewBlurRadius(int i) {
        this.A03 = i;
    }

    public void setMiniPreviewLoadListener(C31921aE r1) {
        this.A0C = r1;
    }

    public void setMiniPreviewPayload(String str) {
        this.A0I = str;
    }

    public void setOnFallbackListener(C31881aA r1) {
        this.A0A = r1;
    }

    public void setOnLoadListener(C31881aA r1) {
        this.A0B = r1;
    }

    public void setProgressListener(C31861a8 r1) {
        this.A0D = r1;
    }

    public void setProgressiveImageConfig(C38631la r1) {
        this.A07 = r1;
    }

    public void setProgressiveImageListener(C31901aC r1) {
        this.A0E = r1;
    }

    public void setReportProgress(boolean z) {
        this.A0N = z;
    }

    public void setRequestStartListener(AnonymousClass3WW r1) {
        this.A0F = r1;
    }

    public IgImageView(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public IgImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public IgImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public void setPlaceHolderColor(int i) {
        this.A0Q = new ColorDrawable(i);
    }

    public void setPlaceHolderColor(ColorDrawable colorDrawable) {
        if (this.A0Q != colorDrawable) {
            this.A0Q = colorDrawable;
        }
    }

    public void setUrl(ImageUrl imageUrl) {
        AnonymousClass0a4.A06(imageUrl);
        A07(imageUrl, false);
    }

    public void setUrl(ImageUrl imageUrl, String str) {
        A09(imageUrl.AZc(), imageUrl, str, false);
    }

    public void setUrl(String str) {
        AnonymousClass0a4.A06(str);
        AnonymousClass0a4.A06(str);
        this.A05 = null;
        A09(str, (ImageUrl) null, (String) null, false);
    }

    public void setUrl(String str, String str2) {
        A09(str, (ImageUrl) null, str2, false);
    }

    public void setUrlWithFallback(ImageUrl imageUrl, ImageUrl imageUrl2, String str, C31881aA r11) {
        AnonymousClass0a4.A06(imageUrl);
        AnonymousClass0a4.A06(imageUrl2);
        setUrlWithFallback(imageUrl.AZc(), imageUrl, imageUrl2.AZc(), imageUrl2, str, r11);
    }

    private void setUrlWithFallback(String str, ImageUrl imageUrl, String str2, ImageUrl imageUrl2, String str3, C31881aA r8) {
        AnonymousClass1GH A0E2;
        AnonymousClass0a4.A06(str);
        A09(str, imageUrl, str3, false);
        if (str2 != null) {
            if (imageUrl2 != null) {
                A0E2 = AnonymousClass12C.A0c.A0D(imageUrl2, str3);
            } else {
                A0E2 = AnonymousClass12C.A0c.A0E(str2, str3);
            }
            A0E2.A02(this.A0T);
            A0E2.A0J = true;
            AnonymousClass1GK A002 = A0E2.A00();
            this.A05 = A002;
            this.A0A = r8;
            A002.A04();
        }
    }

    public void setUrlWithFallback(String str, String str2, String str3, C31881aA r11) {
        setUrlWithFallback(str, (ImageUrl) null, str2, (ImageUrl) null, str3, r11);
    }
}
