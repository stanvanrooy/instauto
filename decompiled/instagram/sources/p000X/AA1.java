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
import android.text.TextUtils;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.BaseViewManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.AA1 */
public final class AA1 extends HorizontalScrollView implements A6C {
    public static Field A0Y;
    public static boolean A0Z;
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public ValueAnimator A03;
    public C230379zz A04;
    public C23155AAf A05 = null;
    public A06 A06 = new A06(this);
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
    public String A0P = "hidden";
    public boolean A0Q;
    public boolean A0R = false;
    public boolean A0S;
    public final Rect A0T = new Rect();
    public final Rect A0U = new Rect();
    public final OverScroller A0V;
    public final AAJ A0W = new AAJ();
    public final C197358cT A0X = new C197358cT();

    public static void A05(AA1 aa1, int i, int i2) {
        View childAt = aa1.getChildAt(0);
        if (childAt == null || childAt.getWidth() == 0 || childAt.getHeight() == 0) {
            aa1.A0L = i;
            aa1.A0M = i2;
            return;
        }
        aa1.A0L = -1;
        aa1.A0M = -1;
    }

    private int A00(int i) {
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.A0H);
        int i2 = i;
        overScroller.fling(getPostAnimationScrollX(), getPostAnimationScrollY(), i2, 0, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0, 0, ((getWidth() - getPaddingStart()) - getPaddingEnd()) >> 1, 0);
        return overScroller.getFinalX();
    }

    private int A01(View view) {
        view.getDrawingRect(this.A0T);
        offsetDescendantRectToMyCoords(view, this.A0T);
        return computeScrollDeltaToGetChildRectOnScreen(this.A0T);
    }

    private void A03(int i, int i2) {
        if (this.A07 == null) {
            if (this.A0E) {
                A5x.A01(this, Constants.A0N, (float) i, (float) i2);
            }
            this.A0A = false;
            AA7 aa7 = new AA7(this);
            this.A07 = aa7;
            postOnAnimationDelayed(aa7, 20);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011b, code lost:
        if (r1 >= r7) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x014b, code lost:
        if (r1 == r5) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0162, code lost:
        if (r1 <= r6) goto L_0x011d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012f  */
    public static void A04(AA1 aa1, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int min;
        OverScroller overScroller;
        int i6;
        int i7 = i;
        AA1 aa12 = aa1;
        if (aa12.getChildCount() > 0) {
            if (aa12.A02 == 0 && aa12.A09 == null) {
                double snapInterval = (double) aa12.getSnapInterval();
                double postAnimationScrollX = (double) aa12.getPostAnimationScrollX();
                double A002 = (double) aa12.A00(i7);
                double d = postAnimationScrollX / snapInterval;
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
                if (d2 != postAnimationScrollX) {
                    aa12.A0A = true;
                    min = (int) d2;
                } else {
                    return;
                }
            } else {
                int max = Math.max(0, aa12.computeHorizontalScrollRange() - aa12.getWidth());
                int A003 = aa12.A00(i7);
                if (aa12.A0B) {
                    A003 = aa12.getScrollX();
                }
                int width = (aa12.getWidth() - aa12.getPaddingStart()) - aa12.getPaddingEnd();
                boolean z = false;
                if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                    z = true;
                }
                if (z) {
                    A003 = max - A003;
                    i7 = -i7;
                }
                List list = aa12.A09;
                if (list != null) {
                    i5 = ((Integer) list.get(0)).intValue();
                    List list2 = aa12.A09;
                    i4 = ((Integer) list2.get(list2.size() - 1)).intValue();
                    i2 = max;
                    i3 = 0;
                    for (int i8 = 0; i8 < aa12.A09.size(); i8++) {
                        int intValue = ((Integer) aa12.A09.get(i8)).intValue();
                        if (intValue <= A003 && A003 - intValue < A003 - i3) {
                            i3 = intValue;
                        }
                        if (intValue >= A003 && intValue - A003 < i2 - A003) {
                            i2 = intValue;
                        }
                    }
                } else {
                    double snapInterval2 = (double) aa12.getSnapInterval();
                    double d3 = ((double) A003) / snapInterval2;
                    i3 = (int) (Math.floor(d3) * snapInterval2);
                    i2 = Math.min((int) (Math.ceil(d3) * snapInterval2), max);
                    i4 = max;
                    i5 = 0;
                }
                int i9 = A003 - i3;
                int i10 = i2 - A003;
                int i11 = i2;
                if (i9 < i10) {
                    i11 = i3;
                }
                int scrollX = aa12.getScrollX();
                if (z) {
                    scrollX = max - scrollX;
                }
                if (!aa12.A0F && A003 >= i4) {
                    i11 = i4;
                } else if (aa12.A0G || A003 > i5) {
                    if (i7 > 0) {
                        i7 += (int) (((double) i10) * 10.0d);
                        i11 = i2;
                    } else if (i7 < 0) {
                        i7 -= (int) (((double) i9) * 10.0d);
                        i11 = i3;
                    }
                    min = Math.min(Math.max(0, i11), max);
                    if (z) {
                        min = max - min;
                        i7 = -i7;
                    }
                    overScroller = aa12.A0V;
                    if (overScroller != null) {
                        aa12.A0A = true;
                        int scrollX2 = aa12.getScrollX();
                        int scrollY = aa12.getScrollY();
                        if (i7 == 0) {
                            i7 = min - aa12.getScrollX();
                        }
                        if (min != 0) {
                            i6 = 0;
                        }
                        i6 = width >> 1;
                        overScroller.fling(scrollX2, scrollY, i7, 0, min, min, 0, 0, i6, 0);
                        aa12.postInvalidateOnAnimation();
                        return;
                    }
                } else {
                    i11 = i5;
                }
                i11 = A003;
                min = Math.min(Math.max(0, i11), max);
                if (z) {
                }
                overScroller = aa12.A0V;
                if (overScroller != null) {
                }
            }
            aa12.A08(min, aa12.getScrollY());
        }
    }

    public static void A06(AA1 aa1, int i, int i2) {
        if (aa1.A04 == null) {
            return;
        }
        if (i != aa1.A0J || i2 != aa1.A0K) {
            aa1.A0J = i;
            aa1.A0K = i2;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("contentOffsetLeft", (double) (((float) i) / AnonymousClass951.A01.density));
            writableNativeMap.putDouble("contentOffsetTop", (double) (((float) i2) / AnonymousClass951.A01.density));
        }
    }

    private OverScroller getOverScrollerFromParent() {
        if (!A0Z) {
            A0Z = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                A0Y = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                AnonymousClass0CH.A07("ReactNative", "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = A0Y;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(this);
            if (obj instanceof OverScroller) {
                return (OverScroller) obj;
            }
            AnonymousClass0CH.A07("ReactNative", "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e);
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
        return getWidth();
    }

    public final void A08(int i, int i2) {
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
        this.A03.addUpdateListener(new AAG(this));
        this.A03.addListener(new AAD(this));
        this.A03.start();
        A06(this, i, i2);
        A05(this, i, i2);
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

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (java.lang.Math.abs(r1) >= r5.A0T.width()) goto L_0x0042;
     */
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        boolean z;
        if (!this.A0C || this.A0R) {
            super.addFocusables(arrayList, i, i2);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i, i2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            boolean z2 = false;
            if (A01(view) == 0) {
                z2 = true;
            }
            if (!z2) {
                int A012 = A01(view);
                view.getDrawingRect(this.A0T);
                if (A012 != 0) {
                    z = true;
                }
                z = false;
                if (!z && !view.isFocused()) {
                }
            }
            arrayList.add(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (java.lang.Math.abs(r1) >= (r6.A0T.width() >> 1)) goto L_0x004c;
     */
    public final boolean arrowScroll(int i) {
        boolean z;
        if (!this.A0C) {
            return super.arrowScroll(i);
        }
        boolean z2 = true;
        this.A0R = true;
        if (getChildCount() > 0) {
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i);
            View childAt = getChildAt(0);
            if (childAt == null || findNextFocus == null || findNextFocus.getParent() != childAt) {
                A02(i);
            } else {
                boolean z3 = false;
                if (A01(findNextFocus) == 0) {
                    z3 = true;
                }
                if (!z3) {
                    int A012 = A01(findNextFocus);
                    findNextFocus.getDrawingRect(this.A0T);
                    if (A012 != 0) {
                        z = true;
                    }
                    z = false;
                    if (!z) {
                        A02(i);
                    }
                }
                findNextFocus.requestFocus();
            }
        } else {
            z2 = false;
        }
        this.A0R = false;
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r2.equals("visible") == false) goto L_0x0019;
     */
    public final void onDraw(Canvas canvas) {
        char c;
        getDrawingRect(this.A0U);
        String str = this.A0P;
        if (str.hashCode() == 466743410) {
            c = 0;
        }
        c = 65535;
        if (c != 0) {
            canvas.clipRect(this.A0U);
        }
        super.onDraw(canvas);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r1 != false) goto L_0x002a;
     */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        String str;
        if (this.A0D) {
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    A6A.A00(this).AvQ(motionEvent);
                    A5x.A01(this, Constants.ZERO, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    this.A0Q = true;
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
        A06(this, i5, i6);
        A05(this, i5, i6);
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int computeHorizontalScrollRange;
        OverScroller overScroller = this.A0V;
        if (overScroller != null && !overScroller.isFinished() && this.A0V.getCurrX() != this.A0V.getFinalX() && i >= (computeHorizontalScrollRange = computeHorizontalScrollRange() - getWidth())) {
            this.A0V.abortAnimation();
            i = computeHorizontalScrollRange;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    public final void requestChildFocus(View view, View view2) {
        int A012;
        if (!(view2 == null || this.A0C || (A012 = A01(view2)) == 0)) {
            scrollBy(A012, 0);
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
        OverScroller overScroller = this.A0V;
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
        this.A0P = str;
        invalidate();
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.A0N == null) {
            this.A0N = new Rect();
        }
        this.A0S = z;
        BsX();
    }

    public AA1(Context context, C23155AAf aAf) {
        super(context);
        this.A05 = aAf;
        this.A0V = getOverScrollerFromParent();
    }

    private void A02(int i) {
        int i2;
        int width = getWidth();
        int scrollX = getScrollX();
        int i3 = scrollX / width;
        if (scrollX % width != 0) {
            i3++;
        }
        if (i == 17) {
            i2 = i3 - 1;
        } else {
            i2 = i3 + 1;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        A08(i2 * width, getScrollY());
        A03(0, 0);
    }

    public final void A07() {
        awakenScrollBars();
    }

    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0Z0.A03(-1650577479);
        if (this.A0I != 0) {
            View childAt = getChildAt(0);
            if (!(this.A0O == null || childAt == null || childAt.getRight() >= getWidth())) {
                this.A0O.setBounds(childAt.getRight(), 0, getWidth(), getHeight());
                this.A0O.draw(canvas);
            }
        }
        super.draw(canvas);
        AnonymousClass0Z0.A0A(237597778, A032);
    }

    public final boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.A0D || (keyCode != 21 && keyCode != 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public final void fling(int i) {
        int abs = (int) (((float) Math.abs(i)) * Math.signum(this.A0W.A00));
        if (this.A0C) {
            A04(this, abs);
        } else if (this.A0V != null) {
            this.A0V.fling(getScrollX(), getScrollY(), abs, 0, 0, Integer.MAX_VALUE, 0, 0, ((getWidth() - getPaddingStart()) - getPaddingEnd()) >> 1, 0);
            AnonymousClass1E1.A0I(this);
        } else {
            super.fling(abs);
        }
        A03(abs, 0);
    }

    public final boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    public boolean getRemoveClippedSubviews() {
        return this.A0S;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(-818833530);
        super.onAttachedToWindow();
        if (this.A0S) {
            BsX();
        }
        AnonymousClass0Z0.A0D(-1295617610, A062);
    }

    public final void onMeasure(int i, int i2) {
        A6B.A00(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.A0A = true;
        if (this.A0W.A00(i, i2)) {
            if (this.A0S) {
                BsX();
            }
            AAJ aaj = this.A0W;
            A5x.A01(this, Constants.A0C, aaj.A00, aaj.A01);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(40050644);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A0S) {
            BsX();
        }
        AnonymousClass0Z0.A0D(-2071627398, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0Z0.A05(-1057741643);
        if (!this.A0D) {
            AnonymousClass0Z0.A0C(1008481836, A052);
            return false;
        }
        this.A0X.A00(motionEvent);
        if ((motionEvent.getAction() & 255) == 1 && this.A0Q) {
            A06(this, getScrollX(), getScrollY());
            C197358cT r0 = this.A0X;
            float f = r0.A00;
            float f2 = r0.A01;
            A5x.A01(this, Constants.ONE, f, f2);
            this.A0Q = false;
            A03(Math.round(f), Math.round(f2));
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0Z0.A0C(380229871, A052);
        return onTouchEvent;
    }

    public final boolean pageScroll(int i) {
        boolean pageScroll = super.pageScroll(i);
        if (this.A0C && pageScroll) {
            A03(0, 0);
        }
        return pageScroll;
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
