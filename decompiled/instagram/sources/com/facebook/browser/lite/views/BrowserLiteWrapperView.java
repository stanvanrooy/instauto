package com.facebook.browser.lite.views;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AQ8;
import p000X.ARQ;
import p000X.ASB;
import p000X.ATp;
import p000X.AUM;
import p000X.AUN;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EB;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1X4;
import p000X.AnonymousClass2LX;
import p000X.AnonymousClass7OW;
import p000X.C019000b;

public class BrowserLiteWrapperView extends FrameLayout {
    public static final AnonymousClass1EA A0C = AnonymousClass1EA.A01(50.0d, 5.0d);
    public static final AnonymousClass1EA A0D = AnonymousClass1EA.A01(30.0d, 7.0d);
    public int A00;
    public int A01;
    public ArgbEvaluator A02;
    public View A03;
    public View A04;
    public ASB A05;
    public AnonymousClass1EG A06;
    public boolean A07;
    public int A08;
    public ARQ A09;
    public ATp A0A;
    public final AnonymousClass2LX A0B = new AUM(this);

    private void A00() {
        int i;
        Activity activity = this.A05.getActivity();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.A08 = displayMetrics.heightPixels;
        if (!this.A05.getIntent().getBooleanExtra("extra_hide_system_status_bar", false)) {
            int i2 = this.A08;
            Activity activity2 = this.A05.getActivity();
            int identifier = activity2.getResources().getIdentifier(AnonymousClass0C5.$const$string(38), "dimen", "android");
            if (identifier > 0) {
                i = activity2.getResources().getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            this.A08 = i2 - i;
        }
        ViewGroup.LayoutParams layoutParams = this.A03.getLayoutParams();
        layoutParams.height = -1;
        this.A03.setLayoutParams(layoutParams);
    }

    private void setStatusBarColor(int i) {
        AnonymousClass1X4.A02(this.A05.getActivity(), i);
    }

    private void setupBackgroundProtectionAlpha(float f) {
        this.A03.setAlpha(f);
    }

    public final void A04(float f, boolean z, Runnable runnable, double d) {
        if (!this.A07) {
            if (f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            } else if (f > ((float) getHeight())) {
                f = (float) getHeight();
            }
            if (!z) {
                this.A06.A05((double) f, true);
            } else {
                this.A06.A04(d);
                this.A06.A03((double) f);
            }
            setStatusBarColor(((Integer) this.A02.evaluate(f / ((float) getHeight()), Integer.valueOf(this.A00), Integer.valueOf(this.A01))).intValue());
            if (runnable != null) {
                this.A06.A07(new AUN(this, runnable));
            }
        }
    }

    public final void A05(ATp aTp, ASB asb, ARQ arq) {
        int A002;
        this.A0A = aTp;
        this.A04 = findViewById(C0003R.C0005id.browser_container);
        this.A05 = asb;
        this.A09 = arq;
        this.A02 = new ArgbEvaluator();
        Activity activity = this.A05.getActivity();
        this.A01 = C019000b.A00(activity, C0003R.color.transparent);
        if (this.A05.getIntent().getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_IAB_FULLSCREEN_EXPERIENCE", false)) {
            A002 = AnonymousClass1X4.A00(this.A05.getActivity());
        } else {
            A002 = C019000b.A00(activity, C0003R.color.black_70_transparent);
        }
        this.A00 = A002;
        this.A03 = findViewById(C0003R.C0005id.browser_background_protection);
        A00();
        setupBackgroundProtectionAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        AnonymousClass1EG A003 = new AnonymousClass1EB(AnonymousClass7OW.A00()).A00();
        A003.A06(A0D);
        A003.A06 = true;
        A003.A07(this.A0B);
        this.A06 = A003;
    }

    public int getChromeContainerHeight() {
        return this.A09.A02.getHeightPx();
    }

    public int[] getChromeContainerLocationInWindow() {
        View AIC = this.A05.AIC();
        if (AIC == null) {
            return null;
        }
        int[] iArr = new int[2];
        AIC.getLocationInWindow(iArr);
        return iArr;
    }

    public int getWebViewScrollY() {
        AQ8 AYf = this.A0A.AYf();
        if (AYf == null) {
            return -1;
        }
        return AYf.A03();
    }

    public void setWebViewScrollY(int i) {
        AQ8 AYf = this.A0A.AYf();
        if (AYf != null) {
            AYf.A0X(i);
        }
    }

    public final void A01() {
        A00();
        this.A07 = false;
        setStatusBarColor(this.A00);
        this.A06.A03(0.0d);
    }

    public final void A02() {
        A00();
        setupBackgroundProtectionAlpha(0.7f);
    }

    public final void A03() {
        A00();
        setupBackgroundProtectionAlpha(0.7f);
    }

    public int getUsableScreenHeight() {
        return this.A08;
    }

    public BrowserLiteWrapperView(Context context) {
        super(context);
    }

    public BrowserLiteWrapperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
