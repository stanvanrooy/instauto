package p000X;

import android.content.Intent;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.DisplayCutout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1Rn  reason: invalid class name and case insensitive filesystem */
public final class C29851Rn extends C27291Hg implements AnonymousClass1E8 {
    public static final AnonymousClass1EA A0S = AnonymousClass1EA.A00(5.0d, 20.0d);
    public boolean A00;
    public Drawable A01;
    public View A02;
    public TouchInterceptorFrameLayout A03;
    public C31831a3 A04;
    public AnonymousClass1NJ A05;
    public C27371Ho A06;
    public AnonymousClass1PL A07;
    public AnonymousClass1VM A08;
    public C36841ih A09;
    public AnonymousClass2E3 A0A;
    public Integer A0B = Constants.ZERO;
    public boolean A0C;
    public boolean A0D;
    public int A0E;
    public int A0F;
    public View A0G;
    public ViewGroup.LayoutParams A0H;
    public AnonymousClass1UP A0I;
    public boolean A0J;
    public boolean A0K;
    public final DataSetObserver A0L = new C29861Ro(this);
    public final ViewGroup A0M;
    public final FragmentActivity A0N;
    public final AnonymousClass1RJ A0O;
    public final AnonymousClass0C1 A0P;
    public final AnonymousClass1EG A0Q;
    public final AnonymousClass1EG A0R;

    public final void A04(AnonymousClass1NJ r12, C36841ih r13, AnonymousClass1UP r14, View view, C31831a3 r16, AnonymousClass2E3 r17, C27371Ho r18) {
        int i;
        String str;
        Window window;
        DisplayCutout displayCutout;
        this.A0C = true;
        this.A0A = r17;
        this.A0B = Constants.ONE;
        this.A0I = r14;
        this.A05 = r12;
        this.A09 = r13;
        this.A0G = view;
        this.A04 = r16;
        this.A06 = r18;
        r13.A0N(false);
        r13.A0q = true;
        AnonymousClass2WU.A01.A00 = this;
        boolean A0G2 = this.A0O.A0G();
        this.A0J = A0G2;
        if (!A0G2) {
            A02(this);
        } else {
            C36841ih r1 = this.A09;
            if (true != r1.A10) {
                r1.A10 = true;
                C36841ih.A01(r1, 2);
            }
            C36841ih r15 = this.A09;
            if (true != r15.A0d) {
                r15.A0d = true;
                C36841ih.A01(r15, 3);
            }
        }
        this.A0E = this.A04.indexOfChild(this.A0G);
        this.A0H = this.A0G.getLayoutParams();
        int[] iArr = new int[2];
        this.A0G.getLocationInWindow(iArr);
        this.A0F = iArr[1];
        this.A04.setHasTransientState(true);
        this.A04.ABv(this.A0G);
        this.A04.invalidate();
        this.A03.setVisibility(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int i2 = this.A0F;
        if (Build.VERSION.SDK_INT < 28 || (window = this.A0N.getWindow()) == null || (displayCutout = window.getDecorView().getRootWindowInsets().getDisplayCutout()) == null) {
            i = 0;
        } else {
            i = displayCutout.getSafeInsetTop();
        }
        layoutParams.topMargin = i2 + i;
        this.A03.attachViewToParent(this.A0G, 0, layoutParams);
        this.A03.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.A02.getLayoutParams();
        layoutParams2.topMargin = this.A0G.getHeight();
        this.A02.setLayoutParams(layoutParams2);
        this.A02.setVisibility(0);
        this.A0M.requestLayout();
        this.A0M.invalidate();
        this.A0K = AnonymousClass1X4.A06(this.A0N.getWindow(), this.A03);
        AnonymousClass1X4.A04(this.A0N.getWindow(), this.A03, false);
        this.A0O.A0B = true;
        this.A00 = false;
        this.A07.registerDataSetObserver(this.A0L);
        this.A0D = false;
        AnonymousClass1EG r5 = this.A0R;
        r5.A05(0.0d, true);
        r5.A07(this);
        r5.A03(1.0d);
        AnonymousClass0C1 r3 = this.A0P;
        AnonymousClass0WN.A01(r3);
        AnonymousClass1NJ r52 = this.A05;
        C27371Ho r6 = this.A06;
        C36841ih r0 = this.A09;
        int AHt = r0.AHt();
        int position = r0.getPosition();
        String A002 = A00(this);
        if (this.A0A == AnonymousClass2E3.A01) {
            str = "webclick";
        } else {
            str = null;
        }
        C36901in.A0K(r3, "wam_launch", r52, r6, AHt, position, A002, str);
    }

    public final void Ar3(int i, int i2, Intent intent) {
    }

    public final void AyU() {
    }

    public final void Azd() {
    }

    public final void BE0() {
    }

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public static String A00(C29851Rn r2) {
        if (r2.A0A == AnonymousClass2E3.A01) {
            return r2.A0I.A0A;
        }
        return null;
    }

    private void A01() {
        C36841ih r1 = this.A09;
        r1.A0q = false;
        r1.A0N(true);
        if (!this.A0J && !this.A0D) {
            this.A0O.A0F("context_switch");
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A03;
        if (touchInterceptorFrameLayout != null) {
            touchInterceptorFrameLayout.detachViewFromParent(this.A0G);
            this.A03.setVisibility(8);
        }
        this.A0G.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        if (this.A00) {
            this.A0G.setAlpha(1.0f);
        } else {
            this.A04.A67(this.A0G, this.A0E, this.A0H);
            this.A0G.requestLayout();
        }
        this.A0G = null;
        this.A0E = -1;
        this.A0H = null;
        this.A04.requestDisallowInterceptTouchEvent(false);
        this.A04 = null;
        this.A00 = false;
        this.A05 = null;
        this.A09 = null;
        this.A0I = null;
        this.A06 = null;
        this.A0B = Constants.ZERO;
        this.A0C = false;
        AnonymousClass2WU.A01.A00 = null;
    }

    public static void A02(C29851Rn r10) {
        C32151ag r3 = (C32151ag) ((View) r10.A04).getTag();
        if (r10.A08 == null) {
            r10.A08 = new AnonymousClass1VM();
        }
        r10.A08.A01(r3.A0G, r3.A0D, r10.A0O.Aa7(r10.A09.getPosition(), r10.A05), r10.A05, r10.A09);
        C36841ih r1 = r10.A09;
        if (true != r1.A10) {
            r1.A10 = true;
            C36841ih.A01(r1, 2);
        }
        C36841ih r12 = r10.A09;
        if (true != r12.A0d) {
            r12.A0d = true;
            C36841ih.A01(r12, 3);
        }
        r10.A0O.A0D(r10.A05, r10.A09, r3, true);
    }

    public static void A03(C29851Rn r4, boolean z) {
        r4.A0B = Constants.A0Y;
        if (z) {
            AnonymousClass1X4.A04(r4.A0N.getWindow(), r4.A03, r4.A0K);
            AnonymousClass1EG r3 = r4.A0Q;
            r3.A05(1.0d, true);
            r3.A07(r4);
            r3.A03(0.0d);
            return;
        }
        r4.A01();
    }

    public final void Ayk(View view) {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) LayoutInflater.from(this.A0M.getContext()).inflate(C0003R.layout.watchandmore_container, this.A0M, false);
        this.A03 = touchInterceptorFrameLayout;
        touchInterceptorFrameLayout.Adn(new AnonymousClass1YL(this));
        ViewGroup.LayoutParams layoutParams = this.A03.getLayoutParams();
        layoutParams.height = this.A0N.getResources().getDisplayMetrics().heightPixels;
        this.A03.setLayoutParams(layoutParams);
        this.A02 = this.A03.findViewById(C0003R.C0005id.loading_spinner);
        this.A01 = this.A03.getBackground().mutate();
        this.A0M.addView(this.A03);
    }

    public final void Azh() {
        this.A0M.post(new C49902Eb(this));
    }

    public final void BJx() {
        if (this.A0B == Constants.A0N) {
            A03(this, !this.A0D);
        }
    }

    public final void BOH(AnonymousClass1EG r7) {
        List emptyList;
        Integer num = this.A0B;
        if (num == Constants.ONE) {
            Bundle bundle = new Bundle();
            bundle.putInt("com.instagram.watchandmore.CONFIG_VIDEO_HEIGHT", this.A0G.getHeight());
            if (this.A0A == AnonymousClass2E3.A01) {
                AnonymousClass2UC r3 = new AnonymousClass2UC(this.A0N, this.A0P, A00(this), AnonymousClass2UD.WATCH_AND_MORE_CTA);
                r3.A05 = this.A0I.A07;
                if (C30671Ut.A0D(this.A0P, this.A05) != null) {
                    emptyList = C30671Ut.A0D(this.A0P, this.A05);
                } else {
                    emptyList = Collections.emptyList();
                }
                r3.A06 = Collections.unmodifiableList(emptyList);
                C22340yF r0 = C22340yF.A00;
                AnonymousClass0a4.A06(r0);
                r3.A01 = r0.A00();
                r3.A00 = bundle;
                r3.A04("watch_browse");
                r3.A0B.A00.putString("TrackingInfo.ARG_BROWSER_MODULE_NAME", "watch_browse");
                r3.A09 = false;
                r3.A02(this.A05.APo());
                r3.A01();
            }
            this.A02.setVisibility(8);
        } else if (num == Constants.A0Y) {
            A01();
        }
    }

    public C29851Rn(FragmentActivity fragmentActivity, AnonymousClass0C1 r6, AnonymousClass1PL r7, AnonymousClass1RJ r8) {
        this.A0N = fragmentActivity;
        this.A0P = r6;
        this.A0O = r8;
        this.A07 = r7;
        this.A0M = (ViewGroup) (fragmentActivity.getParent() != null ? fragmentActivity.getParent() : fragmentActivity).getWindow().getDecorView();
        AnonymousClass1EB A002 = AnonymousClass0P2.A00();
        AnonymousClass1EG A003 = A002.A00();
        AnonymousClass1EA r2 = A0S;
        A003.A06(r2);
        A003.A06 = true;
        this.A0R = A003;
        AnonymousClass1EG A004 = A002.A00();
        A004.A06(r2);
        A004.A06 = true;
        this.A0Q = A004;
    }

    public final void BOK(AnonymousClass1EG r14) {
        float A002 = (float) r14.A00();
        Integer num = this.A0B;
        if (num == Constants.ONE || num == Constants.A0Y) {
            if (num == Constants.A0Y && this.A00) {
                this.A0G.setAlpha(A002);
            }
            this.A0G.setTranslationY((float) C27181Gu.A01((double) A002, 0.0d, 1.0d, 0.0d, (double) (-this.A0F)));
            Drawable drawable = this.A01;
            if (drawable != null) {
                drawable.setAlpha(Math.round(A002 * 255.0f));
            }
        }
    }
}
