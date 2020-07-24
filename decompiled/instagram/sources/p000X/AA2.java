package p000X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.BaseViewManager;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: X.AA2 */
public final class AA2 extends ScrollView implements A6C, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener {
    public static Field A0X;
    public static boolean A0Y;
    public int A00;
    public int A01;
    public int A02 = 0;
    public ValueAnimator A03;
    public C230379zz A04;
    public C23155AAf A05 = null;
    public A06 A06;
    public Runnable A07;
    public String A08;
    public List A09;
    public boolean A0A;
    public boolean A0B = false;
    public boolean A0C = false;
    public boolean A0D = true;
    public boolean A0E;
    public boolean A0F = true;
    public boolean A0G = true;
    public float A0H = 0.985f;
    public int A0I = 0;
    public int A0J = -1;
    public int A0K = -1;
    public int A0L = -1;
    public int A0M = -1;
    public Rect A0N;
    public Drawable A0O;
    public View A0P;
    public String A0Q = "hidden";
    public boolean A0R;
    public boolean A0S;
    public final Rect A0T = new Rect();
    public final OverScroller A0U;
    public final AAJ A0V = new AAJ();
    public final C197358cT A0W = new C197358cT();

    public static void A04(AA2 aa2, int i, int i2) {
        View childAt = aa2.getChildAt(0);
        if (childAt == null || childAt.getWidth() == 0 || childAt.getHeight() == 0) {
            aa2.A0L = i;
            aa2.A0M = i2;
            return;
        }
        aa2.A0L = -1;
        aa2.A0M = -1;
    }

    private int A00(int i) {
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.A0H);
        int i2 = i;
        overScroller.fling(getPostAnimationScrollX(), getPostAnimationScrollY(), 0, i2, 0, 0, 0, getMaxScrollY(), 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) >> 1);
        return overScroller.getFinalY();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r1 != false) goto L_0x000f;
     */
    private void A01() {
        boolean z;
        String str;
        C23155AAf aAf = this.A05;
        if (!(aAf == null || (str = this.A08) == null)) {
            boolean isEmpty = str.isEmpty();
            z = true;
        }
        z = false;
        if (z) {
            AnonymousClass0FY.A00(aAf);
            AnonymousClass0FY.A00(this.A08);
        }
    }

    private void A02(int i, int i2) {
        if (this.A07 == null) {
            if (this.A0E) {
                A01();
                A5x.A01(this, Constants.A0N, (float) i, (float) i2);
            }
            this.A0A = false;
            AA8 aa8 = new AA8(this);
            this.A07 = aa8;
            postOnAnimationDelayed(aa8, 20);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0123, code lost:
        if (r1 == r2) goto L_0x0125;
     */
    public static void A03(AA2 aa2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        AA2 aa22 = aa2;
        if (aa2.getChildCount() <= 0) {
            return;
        }
        if (aa2.A02 == 0 && aa2.A09 == null) {
            double snapInterval = (double) aa2.getSnapInterval();
            double postAnimationScrollY = (double) aa2.getPostAnimationScrollY();
            double A002 = (double) aa2.A00(i7);
            double d = postAnimationScrollY / snapInterval;
            int floor = (int) Math.floor(d);
            int ceil = (int) Math.ceil(d);
            int round = (int) Math.round(d);
            int round2 = (int) Math.round(A002 / snapInterval);
            if (i > 0 && ceil == floor) {
                ceil++;
            } else if (i < 0 && floor == ceil) {
                floor--;
            }
            if (i > 0 && round < ceil && round2 > floor) {
                round = ceil;
            } else if (i < 0 && round > floor && round2 < ceil) {
                round = floor;
            }
            double d2 = ((double) round) * snapInterval;
            if (d2 != postAnimationScrollY) {
                aa2.A0A = true;
                aa2.A07(aa2.getScrollX(), (int) d2);
                return;
            }
            return;
        }
        int maxScrollY = aa2.getMaxScrollY();
        int A003 = aa2.A00(i7);
        if (aa2.A0B) {
            A003 = aa2.getScrollY();
        }
        int height = (aa2.getHeight() - aa2.getPaddingBottom()) - aa2.getPaddingTop();
        List list = aa2.A09;
        if (list != null) {
            i5 = ((Integer) list.get(0)).intValue();
            List list2 = aa2.A09;
            i4 = ((Integer) list2.get(list2.size() - 1)).intValue();
            i2 = maxScrollY;
            i3 = 0;
            for (int i8 = 0; i8 < aa2.A09.size(); i8++) {
                int intValue = ((Integer) aa2.A09.get(i8)).intValue();
                if (intValue <= A003 && A003 - intValue < A003 - i3) {
                    i3 = intValue;
                }
                if (intValue >= A003 && intValue - A003 < i2 - A003) {
                    i2 = intValue;
                }
            }
        } else {
            double snapInterval2 = (double) aa2.getSnapInterval();
            double d3 = ((double) A003) / snapInterval2;
            i3 = (int) (Math.floor(d3) * snapInterval2);
            i2 = Math.min((int) (Math.ceil(d3) * snapInterval2), maxScrollY);
            i4 = maxScrollY;
            i5 = 0;
        }
        int i9 = A003 - i3;
        int i10 = i2 - A003;
        int i11 = i2;
        if (i9 < i10) {
            i11 = i3;
        }
        if (aa2.A0F || A003 < i4) {
            if (aa2.A0G || A003 > i5) {
                if (i > 0) {
                    i7 = i + ((int) (((double) i10) * 10.0d));
                    A003 = i2;
                } else if (i < 0) {
                    i7 = i - ((int) (((double) i9) * 10.0d));
                    A003 = i3;
                } else {
                    A003 = i11;
                }
            } else if (aa2.getScrollY() > i5) {
                A003 = i5;
            }
        } else if (aa2.getScrollY() < i4) {
            A003 = i4;
        }
        int min = Math.min(Math.max(0, A003), maxScrollY);
        OverScroller overScroller = aa2.A0U;
        if (overScroller != null) {
            aa2.A0A = true;
            int scrollX = aa2.getScrollX();
            int scrollY = aa2.getScrollY();
            if (i7 == 0) {
                i7 = min - aa2.getScrollY();
            }
            if (min != 0) {
                i6 = 0;
            }
            i6 = height >> 1;
            overScroller.fling(scrollX, scrollY, 0, i7, 0, 0, min, min, 0, i6);
            aa22.postInvalidateOnAnimation();
            return;
        }
        aa2.A07(aa2.getScrollX(), min);
    }

    public static void A05(AA2 aa2, int i, int i2) {
        if (aa2.A04 == null) {
            return;
        }
        if (i != aa2.A0J || i2 != aa2.A0K) {
            aa2.A0J = i;
            aa2.A0K = i2;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("contentOffsetLeft", (double) (((float) i) / AnonymousClass951.A01.density));
            writableNativeMap.putDouble("contentOffsetTop", (double) (((float) i2) / AnonymousClass951.A01.density));
        }
    }

    private int getMaxScrollY() {
        return Math.max(0, this.A0P.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private OverScroller getOverScrollerFromParent() {
        if (!A0Y) {
            A0Y = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                A0X = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                AnonymousClass0CH.A07("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = A0X;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(this);
            if (obj instanceof OverScroller) {
                return (OverScroller) obj;
            }
            AnonymousClass0CH.A07("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to get mScroller from ScrollView!", e);
        }
    }

    private int getPostAnimationScrollX() {
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return getScrollX();
        }
        return this.A00;
    }

    private int getPostAnimationScrollY() {
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return getScrollY();
        }
        return this.A01;
    }

    private int getSnapInterval() {
        int i = this.A02;
        if (i != 0) {
            return i;
        }
        return getHeight();
    }

    public final void A07(int i, int i2) {
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.A00 = i;
        this.A01 = i2;
        ValueAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("scrollX", new int[]{getScrollX(), i}), PropertyValuesHolder.ofInt("scrollY", new int[]{getScrollY(), i2})});
        this.A03 = ofPropertyValuesHolder;
        Context context = getContext();
        if (!A5x.A01) {
            A5x.A01 = true;
            try {
                A5x.A00 = new AAO(context).A00();
            } catch (Throwable unused) {
            }
        }
        ofPropertyValuesHolder.setDuration((long) A5x.A00);
        this.A03.addUpdateListener(new AAH(this));
        this.A03.addListener(new AAE(this));
        this.A03.start();
        A05(this, i, i2);
        A04(this, i, i2);
    }

    public final void AIH(Rect rect) {
        Rect rect2 = this.A0N;
        AnonymousClass0FY.A00(rect2);
        rect.set(rect2);
    }

    public final void BsX() {
        if (this.A0S) {
            AnonymousClass0FY.A00(this.A0N);
            C23086A5z.A00(this, this.A0N);
            View childAt = getChildAt(0);
            if (childAt instanceof A6C) {
                ((A6C) childAt).BsX();
            }
        }
    }

    public final void fling(int i) {
        float signum = Math.signum(this.A0V.A01);
        if (signum == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            signum = Math.signum((float) i);
        }
        int abs = (int) (((float) Math.abs(i)) * signum);
        if (this.A0C) {
            A03(this, abs);
        } else if (this.A0U != null) {
            this.A0U.fling(getScrollX(), getScrollY(), 0, abs, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) >> 1);
            AnonymousClass1E1.A0I(this);
        } else {
            super.fling(abs);
        }
        A02(0, abs);
    }

    public final void onChildViewAdded(View view, View view2) {
        this.A0P = view2;
        view2.addOnLayoutChangeListener(this);
    }

    public final void onChildViewRemoved(View view, View view2) {
        this.A0P.removeOnLayoutChangeListener(this);
        this.A0P = null;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0D) {
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    A6A.A00(this).AvQ(motionEvent);
                    A5x.A01(this, Constants.ZERO, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    this.A0R = true;
                    A01();
                    return true;
                }
            } catch (IllegalArgumentException e) {
                AnonymousClass0CH.A0A("ReactNative", "Error intercepting touch event.", e);
            }
        }
        return false;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.A0L;
        if (i5 == -1) {
            i5 = getScrollX();
        }
        int i6 = this.A0M;
        if (i6 == -1) {
            i6 = getScrollY();
        }
        scrollTo(i5, i6);
        A05(this, i5, i6);
        A04(this, i5, i6);
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int maxScrollY;
        if (this.A0P != null && getScrollY() > (maxScrollY = getMaxScrollY())) {
            int scrollX = getScrollX();
            scrollTo(scrollX, maxScrollY);
            A05(this, scrollX, maxScrollY);
            A04(this, scrollX, maxScrollY);
        }
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int maxScrollY;
        OverScroller overScroller = this.A0U;
        if (!(overScroller == null || this.A0P == null || overScroller.isFinished() || this.A0U.getCurrY() == this.A0U.getFinalY() || i2 < (maxScrollY = getMaxScrollY()))) {
            this.A0U.abortAnimation();
            i2 = maxScrollY;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    public final void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            Rect rect = new Rect();
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
            if (computeScrollDeltaToGetChildRectOnScreen != 0) {
                scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
            }
        }
        super.requestChildFocus(view, view2);
    }

    public void setBackgroundColor(int i) {
        this.A06.A02(i);
    }

    public void setBorderRadius(float f) {
        this.A06.A01(f);
    }

    public void setBorderStyle(String str) {
        A06.A00(this.A06).A0B(str);
    }

    public void setDecelerationRate(float f) {
        this.A0H = f;
        OverScroller overScroller = this.A0U;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f);
        }
    }

    public void setEndFillColor(int i) {
        if (i != this.A0I) {
            this.A0I = i;
            this.A0O = new ColorDrawable(i);
        }
    }

    public void setOverflow(String str) {
        this.A0Q = str;
        invalidate();
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.A0N == null) {
            this.A0N = new Rect();
        }
        this.A0S = z;
        BsX();
    }

    public AA2(A3N a3n, C23155AAf aAf) {
        super(a3n);
        this.A05 = aAf;
        this.A06 = new A06(this);
        this.A0U = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
    }

    public final void A06() {
        awakenScrollBars();
    }

    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0Z0.A03(739393162);
        char c = 0;
        if (this.A0I != 0) {
            View childAt = getChildAt(0);
            if (!(this.A0O == null || childAt == null || childAt.getBottom() >= getHeight())) {
                this.A0O.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
                this.A0O.draw(canvas);
            }
        }
        getDrawingRect(this.A0T);
        String str = this.A0Q;
        if (str.hashCode() != 466743410 || !str.equals("visible")) {
            c = 65535;
        }
        if (c != 0) {
            canvas.clipRect(this.A0T);
        }
        super.draw(canvas);
        AnonymousClass0Z0.A0A(360257451, A032);
    }

    public final boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.A0D || (keyCode != 19 && keyCode != 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public final boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    public boolean getRemoveClippedSubviews() {
        return this.A0S;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(670490985);
        super.onAttachedToWindow();
        if (this.A0S) {
            BsX();
        }
        AnonymousClass0Z0.A0D(1464318912, A062);
    }

    public final void onMeasure(int i, int i2) {
        A6B.A00(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.A0A = true;
        if (this.A0V.A00(i, i2)) {
            if (this.A0S) {
                BsX();
            }
            AAJ aaj = this.A0V;
            A5x.A01(this, Constants.A0C, aaj.A00, aaj.A01);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(-1625298251);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A0S) {
            BsX();
        }
        AnonymousClass0Z0.A0D(1270583747, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0Z0.A05(1393234498);
        if (!this.A0D) {
            AnonymousClass0Z0.A0C(631435889, A052);
            return false;
        }
        this.A0W.A00(motionEvent);
        if ((motionEvent.getAction() & 255) == 1 && this.A0R) {
            A05(this, getScrollX(), getScrollY());
            C197358cT r0 = this.A0W;
            float f = r0.A00;
            float f2 = r0.A01;
            A5x.A01(this, Constants.ONE, f, f2);
            this.A0R = false;
            A02(Math.round(f), Math.round(f2));
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0Z0.A0C(-1648213983, A052);
        return onTouchEvent;
    }

    public void setDisableIntervalMomentum(boolean z) {
        this.A0B = z;
    }

    public void setPagingEnabled(boolean z) {
        this.A0C = z;
    }

    public void setScrollEnabled(boolean z) {
        this.A0D = z;
    }

    public void setScrollPerfTag(String str) {
        this.A08 = str;
    }

    public void setSendMomentumEvents(boolean z) {
        this.A0E = z;
    }

    public void setSnapInterval(int i) {
        this.A02 = i;
    }

    public void setSnapOffsets(List list) {
        this.A09 = list;
    }

    public void setSnapToEnd(boolean z) {
        this.A0F = z;
    }

    public void setSnapToStart(boolean z) {
        this.A0G = z;
    }
}
