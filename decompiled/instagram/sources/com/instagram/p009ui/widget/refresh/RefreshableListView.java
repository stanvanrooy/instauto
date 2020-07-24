package com.instagram.p009ui.widget.refresh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EG;
import p000X.C019000b;
import p000X.C157726oS;
import p000X.C256119n;
import p000X.C26771Ff;
import p000X.C27611In;
import p000X.C31171Wu;
import p000X.C42771tE;

/* renamed from: com.instagram.ui.widget.refresh.RefreshableListView */
public class RefreshableListView extends ListView implements AnonymousClass1E8, C31171Wu {
    public static boolean A0P;
    public static boolean A0Q;
    public int A00;
    public AbsListView.OnScrollListener A01;
    public C27611In A02;
    public C42771tE A03;
    public Runnable A04;
    public float A05;
    public int A06;
    public int A07;
    public Paint A08;
    public Paint A09;
    public Drawable A0A;
    public LayerDrawable A0B;
    public View.OnClickListener A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final AlphaAnimation A0J = new AlphaAnimation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
    public final ColorFilter A0K;
    public final ColorFilter A0L;
    public final AlphaAnimation A0M = new AlphaAnimation(-0.2f, 0.2f);
    public final Transformation A0N = new Transformation();
    public final AnonymousClass1EG A0O = AnonymousClass0P2.A00().A00();

    public final void AC3() {
        this.A0G = false;
    }

    public final void AEf() {
        setIsLoading(true);
        if (this.A04 == null) {
            C157726oS r0 = new C157726oS(this);
            this.A04 = r0;
            post(r0);
        }
    }

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas);
        if (this.A0G && A05()) {
            canvas.save();
            canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) (this.A06 + getScrollY()));
            if (this.A09 != null) {
                canvas2.drawRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) getWidth(), (float) (-getScrollY()), this.A09);
            }
            if (this.A0E && (-getScrollY()) > this.A07) {
                canvas2.drawLine(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) (-getScrollY()), (float) getWidth(), (float) (-getScrollY()), this.A08);
            }
            canvas.translate((float) ((getWidth() - this.A00) >> 1), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            canvas.clipRect(0, 0, getWidth(), -getScrollY());
            if (this.A0M.getTransformation(getDrawingTime(), this.A0N)) {
                float abs = 1.2f - Math.abs(this.A0N.getAlpha());
                float f = (float) (this.A00 >> 1);
                canvas.scale(abs, abs, f, f);
            }
            if (this.A03 == C42771tE.PULLING_TO_REFRESH) {
                this.A0B.draw(canvas);
            } else if (this.A0J.getTransformation(getDrawingTime(), this.A0N)) {
                int i = this.A00;
                float min = Math.min(1.0f, (((float) (-getScrollY())) * 1.0f) / ((float) i));
                float f2 = (float) (i >> 1);
                canvas.scale(min, min, f2, f2);
                this.A0A.setLevel((int) (this.A0N.getAlpha() * 10000.0f));
                this.A0A.draw(canvas);
                AnonymousClass1E1.A0I(this);
            }
            canvas.restore();
        }
    }

    public void setupAndEnableRefresh(View.OnClickListener onClickListener) {
        this.A0G = true;
        this.A0C = onClickListener;
    }

    private void A01() {
        if (this.A03 != C42771tE.PULLING_TO_REFRESH && this.A0F && getVisibility() == 0 && A05()) {
            this.A0J.setDuration(700);
            this.A0J.setInterpolator(new LinearInterpolator());
            this.A0J.setRepeatCount(-1);
            this.A0J.setStartTime(-1);
            this.A0J.start();
        }
    }

    public static void A03(RefreshableListView refreshableListView) {
        double d;
        AnonymousClass1EG r4 = refreshableListView.A0O;
        r4.A06(AnonymousClass1EA.A01(70.0d, 11.0d));
        r4.A02 = 1.0d;
        r4.A00 = 0.5d;
        r4.A07(refreshableListView);
        refreshableListView.A0O.A05((double) refreshableListView.getScrollY(), true);
        AnonymousClass1EG r2 = refreshableListView.A0O;
        if (refreshableListView.A03 == C42771tE.REFRESHING) {
            d = (double) (-refreshableListView.A00);
        } else {
            d = 0.0d;
        }
        r2.A03(d);
    }

    private void setState(C42771tE r2) {
        this.A03 = r2;
        switch (r2.ordinal()) {
            case 0:
                this.A0J.cancel();
                return;
            case 1:
                A01();
                return;
            case 2:
                A03(this);
                return;
            default:
                return;
        }
    }

    public final void AD3() {
        if (this.A0C != null) {
            this.A0G = true;
        }
    }

    public final boolean AhA() {
        return this.A0G;
    }

    public final void BOH(AnonymousClass1EG r3) {
        AbsListView.OnScrollListener onScrollListener;
        if (A0Q && (onScrollListener = this.A01) != null) {
            onScrollListener.onScrollStateChanged(this, 0);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A0I) {
            return false;
        }
        boolean z = true;
        if (motionEvent.getAction() == 0 && A05()) {
            this.A0H = true;
        }
        if (this.A03 != C42771tE.REFRESHING || !A05()) {
            z = false;
        }
        if (z) {
            if (this.A05 == -1.0f) {
                this.A05 = motionEvent.getRawY();
            }
            onTouchEvent(motionEvent);
            return false;
        }
        this.A05 = motionEvent.getRawY();
        if (!A0P || C256119n.A04(this)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        AbsListView.OnScrollListener onScrollListener;
        if (this.A03 != C42771tE.COLLAPSING && !z2) {
            super.onOverScrolled(i, i2, z, z2);
        }
        if (A0Q && (onScrollListener = this.A01) != null) {
            onScrollListener.onScrollStateChanged(this, 1);
        }
    }

    public void setInvertProgressDrawable(boolean z) {
        ColorFilter colorFilter;
        Drawable findDrawableByLayerId = this.A0B.findDrawableByLayerId(C0003R.C0005id.refreshable_progress_background);
        Drawable findDrawableByLayerId2 = this.A0B.findDrawableByLayerId(C0003R.C0005id.refreshable_progress_track);
        if (z) {
            findDrawableByLayerId.setColorFilter(this.A0L);
            colorFilter = this.A0K;
        } else {
            findDrawableByLayerId.setColorFilter(this.A0K);
            colorFilter = this.A0L;
        }
        findDrawableByLayerId2.setColorFilter(colorFilter);
    }

    public void setIsLoading(boolean z) {
        C42771tE r0;
        if (z) {
            setState(C42771tE.REFRESHING);
            invalidate();
            return;
        }
        Runnable runnable = this.A04;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.A04 = null;
        }
        if (!A05()) {
            r0 = C42771tE.PULLING_TO_REFRESH;
        } else {
            r0 = C42771tE.COLLAPSING;
        }
        setState(r0);
    }

    public void setProgressDrawableAlpha(int i) {
        this.A0B.setAlpha(i);
    }

    public void setPullToRefreshBackgroundColor(int i) {
        Paint paint = new Paint();
        this.A09 = paint;
        paint.setColor(i);
    }

    private void A00() {
        this.A00 = getResources().getDimensionPixelSize(C0003R.dimen.refreshable_drawable_size);
        Context context = getContext();
        LayerDrawable layerDrawable = (LayerDrawable) C019000b.A03(context, C0003R.C0004drawable.refreshable_progress_drawable);
        this.A0B = layerDrawable;
        int i = this.A00;
        layerDrawable.setBounds(0, 0, i, i);
        getContext();
        Drawable A032 = C019000b.A03(context, C0003R.C0004drawable.refreshable_spinner_drawable);
        this.A0A = A032;
        int i2 = this.A00;
        A032.setBounds(0, 0, i2, i2);
        Paint paint = new Paint();
        this.A08 = paint;
        getContext();
        paint.setColor(AnonymousClass1BA.A01(context, C0003R.attr.dividerColor));
        this.A08.setStrokeWidth(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        getContext();
        this.A07 = ViewConfiguration.get(context).getScaledOverflingDistance();
    }

    private void A02() {
        this.A0B.setLevel((int) (Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, getScrollAsFactorOfProgressDrawableSize()) * 10000.0f));
        if ((this.A02 == null || this.A0D) && this.A03 == C42771tE.PULLING_TO_REFRESH && this.A0B.getLevel() >= 10000) {
            this.A0M.setDuration(300);
            this.A0M.setStartTime(-1);
            this.A0M.start();
            setState(C42771tE.REFRESHING);
            this.A0C.onClick(this);
        } else if (this.A03 != C42771tE.REFRESHING) {
        } else {
            if (!this.A0J.hasStarted() || this.A0J.hasEnded()) {
                A01();
            }
        }
    }

    private float getScrollAsFactorOfProgressDrawableSize() {
        float f = (float) (-getScrollY());
        float f2 = (float) this.A00;
        return (f - (0.4f * f2)) / f2;
    }

    public final boolean A04() {
        if (getFirstVisiblePosition() != 0 || getChildCount() == 0 || getChildAt(0).getTop() < getPaddingTop()) {
            return false;
        }
        return true;
    }

    public final boolean A05() {
        if (getScrollY() < 0) {
            return true;
        }
        return false;
    }

    public final void BOK(AnonymousClass1EG r5) {
        A02();
        scrollTo(0, (int) r5.A00());
        if (!A05() && this.A03 == C42771tE.COLLAPSING) {
            setState(C42771tE.PULLING_TO_REFRESH);
        }
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(72929578);
        super.onAttachedToWindow();
        this.A0F = true;
        A01();
        AnonymousClass0Z0.A0D(-1009905561, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-1521583130);
        super.onDetachedFromWindow();
        this.A0F = false;
        this.A0J.cancel();
        AnonymousClass1EG r3 = this.A0O;
        r3.A08(this);
        r3.A05(this.A0O.A01, true);
        AnonymousClass0Z0.A0D(977747204, A062);
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        if (A05() && !A04()) {
            setScrollY(0);
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r9.getAction() == 1) goto L_0x0022;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int A052 = AnonymousClass0Z0.A05(69097984);
        boolean z3 = false;
        if (!this.A0I) {
            i = -544755739;
        } else {
            if (motionEvent.getAction() != 3) {
                z = false;
            }
            z = true;
            this.A0D = z;
            if (this.A0G) {
                float rawY = motionEvent.getRawY();
                if (this.A03 != C42771tE.COLLAPSING) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        if ((A04() && rawY > this.A05) || A05()) {
                            float f = rawY - this.A05;
                            float f2 = (float) (-getScrollY());
                            float f3 = (float) this.A00;
                            if (f2 < f3 * 1.4f) {
                                i2 = (int) (-(f2 + f));
                            } else {
                                i2 = (int) (-Math.sqrt((double) Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (f * f3 * 1.4f) + ((float) (getScrollY() * getScrollY())))));
                            }
                            scrollTo(0, Math.min(0, i2));
                            A02();
                            z2 = true;
                            this.A05 = rawY;
                            if (z2 || super.onTouchEvent(motionEvent)) {
                                z3 = true;
                            }
                            i = -211447861;
                        } else if (this.A0H) {
                            this.A0H = false;
                            motionEvent.setAction(0);
                        }
                    } else if ((actionMasked == 1 || actionMasked == 3) && A05()) {
                        A03(this);
                        motionEvent.setAction(3);
                    }
                }
                z2 = false;
                this.A05 = rawY;
                z3 = true;
                i = -211447861;
            } else {
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                AnonymousClass0Z0.A0C(52075533, A052);
                return onTouchEvent;
            }
        }
        AnonymousClass0Z0.A0C(i, A052);
        return z3;
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        AlphaAnimation alphaAnimation = this.A0J;
        if (alphaAnimation == null) {
            return;
        }
        if (i == 0) {
            A01();
        } else {
            alphaAnimation.cancel();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        int A062 = AnonymousClass0Z0.A06(550934797);
        int scrollY = getScrollY();
        super.onWindowFocusChanged(z);
        setScrollY(scrollY);
        AnonymousClass0Z0.A0D(1731029879, A062);
    }

    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        C27611In r1 = this.A02;
        if (r1 != null) {
            r1.BYa(getScrollAsFactorOfProgressDrawableSize());
        }
        AbsListView.OnScrollListener onScrollListener = this.A01;
        if (onScrollListener != null) {
            onScrollListener.onScroll(this, getFirstVisiblePosition(), getChildCount(), getCount());
        }
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        super.setOnScrollListener(onScrollListener);
        this.A01 = onScrollListener;
    }

    public static void setAsyncVMInterceptTouchFixEnabled(boolean z) {
        A0P = z;
    }

    public void setDrawBorder(boolean z) {
        this.A0E = z;
    }

    public void setDrawableTopOffset(int i) {
        this.A06 = i;
    }

    public void setPullDownProgressDelegate(C27611In r1) {
        this.A02 = r1;
    }

    public RefreshableListView(Context context) {
        super(context);
        Context context2 = getContext();
        this.A0K = C26771Ff.A00(C019000b.A00(context2, C0003R.color.refreshable_progress_drawable_background));
        getContext();
        this.A0L = C26771Ff.A00(C019000b.A00(context2, C0003R.color.refreshable_progress_drawable_track));
        this.A03 = C42771tE.PULLING_TO_REFRESH;
        this.A05 = -1.0f;
        this.A0I = true;
        this.A0E = true;
        A00();
    }

    public RefreshableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        this.A0K = C26771Ff.A00(C019000b.A00(context2, C0003R.color.refreshable_progress_drawable_background));
        getContext();
        this.A0L = C26771Ff.A00(C019000b.A00(context2, C0003R.color.refreshable_progress_drawable_track));
        this.A03 = C42771tE.PULLING_TO_REFRESH;
        this.A05 = -1.0f;
        this.A0I = true;
        this.A0E = true;
        A00();
    }

    public RefreshableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = getContext();
        this.A0K = C26771Ff.A00(C019000b.A00(context2, C0003R.color.refreshable_progress_drawable_background));
        getContext();
        this.A0L = C26771Ff.A00(C019000b.A00(context2, C0003R.color.refreshable_progress_drawable_track));
        this.A03 = C42771tE.PULLING_TO_REFRESH;
        this.A05 = -1.0f;
        this.A0I = true;
        this.A0E = true;
        A00();
    }
}
