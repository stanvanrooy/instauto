package p000X;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.1Rj  reason: invalid class name and case insensitive filesystem */
public final class C29821Rj extends C27291Hg implements AnonymousClass1E8, View.OnTouchListener, C29831Rk {
    public static final AnonymousClass1EA A0M = AnonymousClass1EA.A01(40.0d, 5.0d);
    public static final AnonymousClass1EA A0N = AnonymousClass1EA.A01(90.0d, 0.0d);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public Drawable A04;
    public View A05;
    public TouchInterceptorFrameLayout A06;
    public C29801Rh A07;
    public Integer A08 = Constants.ZERO;
    public boolean A09;
    public float A0A;
    public int A0B;
    public int A0C;
    public ViewGroup.LayoutParams A0D;
    public AnonymousClass1EK A0E;
    public C31831a3 A0F;
    public C38511lO A0G;
    public boolean A0H;
    public final ViewGroup A0I;
    public final AnonymousClass1EG A0J;
    public final PointF A0K;
    public final AnonymousClass1EG A0L;

    public final void BL0(C38511lO r1) {
    }

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A0H = true;
        this.A0G.A01(motionEvent);
        C29801Rh r2 = this.A07;
        if (!(r2 == null || motionEvent.getAction() == 6 || motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            C29791Rg.A00(r2.A00, false);
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3 || actionMasked == 6) && this.A08 == Constants.ONE) {
            this.A08 = Constants.A0C;
            this.A01 = this.A00;
            AnonymousClass1EG r22 = this.A0J;
            r22.A05(1.0d, true);
            r22.A07(this);
            r22.A03(0.0d);
            C29801Rh r4 = this.A07;
            if (r4 != null) {
                C29791Rg.A00(r4.A00, true);
                C29791Rg r0 = r4.A00;
                AnonymousClass1NJ r3 = r0.A03;
                if (r3 != null) {
                    AnonymousClass0C1 r23 = r0.A06;
                    C37141jB A012 = C37591ju.A01("zoom_duration", r3, r0.A05);
                    A012.A0B(r23, r3);
                    C29791Rg r8 = r4.A00;
                    A012.A14 = r8.A01;
                    A012.A04 = ((double) (System.currentTimeMillis() - r8.A02)) / 1000.0d;
                    C36901in.A0H(r8.A06, A012, r8.A03, r8.A05, r8.A00);
                    return true;
                }
            }
        }
        return true;
    }

    private void A00(float f) {
        this.A00 = f;
        Drawable drawable = this.A04;
        if (drawable != null) {
            drawable.setAlpha(Math.round(f * 255.0f));
        }
    }

    private void A02(float f, float f2) {
        PointF pointF = this.A0K;
        pointF.x = f;
        pointF.y = f2;
        this.A05.setPivotX(f);
        this.A05.setPivotY(f2);
    }

    public final void A03(C31831a3 r6, View view, C38511lO r8) {
        this.A08 = Constants.ONE;
        this.A0F = r6;
        C06220Of.A0K((View) r6, view.getMeasuredHeight());
        this.A0F.setHasTransientState(true);
        this.A05 = view;
        this.A0A = view.getTranslationY();
        this.A0D = view.getLayoutParams();
        this.A0G = r8;
        r8.A00(this);
        if (this.A0E == null) {
            this.A0E = C55872bY.A00(view);
        }
        AnonymousClass1EK r1 = this.A0E;
        if (r1 != null && this.A06 != null) {
            r1.requestDisallowInterceptTouchEvent(false);
            this.A0E.Adn(this);
            this.A0E.getParent().requestDisallowInterceptTouchEvent(true);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[1];
            this.A0E.getLocationInWindow(iArr);
            this.A0C = i - iArr[1];
            this.A0B = r6.indexOfChild(view);
            r6.ABv(view);
            r6.invalidate();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i;
            A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A06.setVisibility(0);
            this.A06.attachViewToParent(view, 0, layoutParams);
            this.A06.bringToFront();
            this.A0I.requestLayout();
            this.A0I.invalidate();
            A02(r8.A00.getFocusX(), r8.A00.getFocusY());
            AnonymousClass1EG r3 = this.A0L;
            r3.A05(1.0d, true);
            r3.A07(this);
            C29801Rh r0 = this.A07;
            if (r0 != null) {
                C29791Rg.A00(r0.A00, false);
            }
        }
    }

    public final boolean A04() {
        if (this.A08 == Constants.ZERO) {
            return true;
        }
        return false;
    }

    public final void Ayk(View view) {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) LayoutInflater.from(this.A0I.getContext()).inflate(C0003R.layout.zoom, this.A0I, false);
        this.A06 = touchInterceptorFrameLayout;
        touchInterceptorFrameLayout.Adn(new AnonymousClass1YM(this));
        this.A04 = this.A06.getBackground().mutate();
        this.A0I.addView(this.A06);
    }

    public final void Azh() {
        this.A0I.post(new C49912Ec(this));
    }

    public final boolean BKu(C38511lO r11) {
        float focusY;
        float focusX = r11.A00.getFocusX();
        if (this.A0H) {
            focusY = r11.A00.getFocusY() - ((float) this.A0C);
        } else {
            focusY = r11.A00.getFocusY();
        }
        float f = focusY + this.A0A;
        PointF pointF = this.A0K;
        float f2 = focusX - pointF.x;
        float f3 = f - pointF.y;
        float f4 = this.A02 + f2;
        this.A02 = f4;
        this.A03 += f3;
        float scaleX = f4 * this.A05.getScaleX();
        float scaleY = this.A03 * this.A05.getScaleY();
        this.A05.setTranslationX(scaleX);
        this.A05.setTranslationY(scaleY);
        A02(focusX, f);
        double A002 = this.A0L.A00() * ((double) r11.A00.getScaleFactor());
        if (A002 > 3.0d) {
            double A003 = this.A0L.A00();
            if (A002 > A003) {
                A002 = ((A002 - A003) * 0.30000001192092896d) + A003;
            }
        }
        this.A0L.A05(C27181Gu.A00(A002, 1.0d, 3.200000047683716d), true);
        return true;
    }

    public final boolean BKx(C38511lO r4) {
        float focusY;
        float focusX = r4.A00.getFocusX();
        if (this.A0H) {
            focusY = r4.A00.getFocusY() - ((float) this.A0C);
        } else {
            focusY = r4.A00.getFocusY();
        }
        A02(focusX, focusY + this.A0A);
        return true;
    }

    public final void BOH(AnonymousClass1EG r6) {
        if (this.A08 == Constants.A0C) {
            this.A0G.A01.remove(this);
            this.A0L.A08(this);
            this.A0J.A08(this);
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A06;
            if (touchInterceptorFrameLayout != null) {
                touchInterceptorFrameLayout.detachViewFromParent(this.A05);
                this.A06.setVisibility(8);
            }
            A02(((float) this.A05.getWidth()) / 2.0f, ((float) this.A05.getHeight()) / 2.0f);
            float f = this.A0A;
            this.A05.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A05.setTranslationY(f);
            A01(1.0f);
            if (this.A09) {
                this.A05.setAlpha(1.0f);
            }
            this.A0F.A67(this.A05, this.A0B, this.A0D);
            ViewGroup.LayoutParams layoutParams = this.A0D;
            if (layoutParams != null) {
                C06220Of.A0K((View) this.A0F, layoutParams.height);
            }
            this.A05.requestLayout();
            this.A0B = -1;
            this.A0D = null;
            this.A0C = 0;
            this.A02 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A0E.Adn((View.OnTouchListener) null);
            C29801Rh r0 = this.A07;
            this.A0E = null;
            this.A0G = null;
            this.A0H = false;
            this.A09 = false;
            this.A05 = null;
            this.A0F.requestDisallowInterceptTouchEvent(false);
            this.A0F.setHasTransientState(false);
            this.A0F = null;
            this.A08 = Constants.ZERO;
        }
    }

    public C29821Rj(ViewGroup viewGroup) {
        this.A0I = viewGroup;
        this.A0K = new PointF();
        AnonymousClass1EB A002 = AnonymousClass0P2.A00();
        AnonymousClass1EG A003 = A002.A00();
        A003.A06(A0N);
        this.A0L = A003;
        AnonymousClass1EG A004 = A002.A00();
        A004.A06(A0M);
        A004.A06 = true;
        this.A0J = A004;
    }

    private void A01(float f) {
        if (Float.isNaN(f)) {
            AnonymousClass0QD.A01("SimpleZoomableViewController", "updateScaleFactor() scale value is NaN resetting to default");
            f = 1.0f;
        }
        this.A05.setScaleX(f);
        this.A05.setScaleY(f);
        A00((float) C27181Gu.A01((double) f, 1.0d, 3.200000047683716d, 0.0d, 1.0d));
    }

    public final void BOK(AnonymousClass1EG r23) {
        float A002 = (float) r23.A00();
        if (this.A08 == Constants.ONE) {
            A01(A002);
        } else if (this.A09) {
            this.A05.setAlpha(A002);
            A00((float) C27181Gu.A01((double) A002, 0.0d, 1.0d, 0.0d, (double) this.A01));
        } else {
            double d = (double) A002;
            A01((float) C27181Gu.A01(d, 0.0d, 1.0d, 1.0d, this.A0L.A00()));
            double A003 = this.A0L.A00();
            this.A05.setTranslationX((float) C27181Gu.A01(d, 0.0d, 1.0d, 0.0d, A003 * ((double) this.A02)));
            View view = this.A05;
            view.setTranslationY((float) C27181Gu.A01(d, 0.0d, 1.0d, 0.0d, A003 * ((double) this.A03)));
        }
    }
}
