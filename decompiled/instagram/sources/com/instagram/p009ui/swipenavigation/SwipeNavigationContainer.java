package com.instagram.p009ui.swipenavigation;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.facebook.systrace.Systrace;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1DZ;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1E9;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1EI;
import p000X.AnonymousClass2TV;
import p000X.AnonymousClass7S4;
import p000X.C06400Ox;
import p000X.C06530Pk;
import p000X.C27101Gm;
import p000X.C27161Gs;
import p000X.C27171Gt;
import p000X.C27181Gu;
import p000X.C50982Iq;
import p000X.C698533x;

/* renamed from: com.instagram.ui.swipenavigation.SwipeNavigationContainer */
public class SwipeNavigationContainer extends FrameLayout implements AnonymousClass1E8, AnonymousClass1E9, GestureDetector.OnGestureListener {
    public static final AnonymousClass1EA A0b = AnonymousClass1EA.A01(40.0d, 8.0d);
    public float A00;
    public float A01;
    public AnonymousClass1DZ A02;
    public C27101Gm A03;
    public C27101Gm A04;
    public C27101Gm A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public int A0F;
    public Bundle A0G;
    public AnonymousClass7S4 A0H;
    public C27161Gs A0I;
    public C698533x A0J;
    public AnonymousClass2TV A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public boolean A0R;
    public boolean A0S;
    public final float A0T;
    public final int A0U;
    public final RectF A0V;
    public final AnonymousClass1EG A0W;
    public final int A0X;
    public final GestureDetector A0Y;
    public final AnonymousClass1EI A0Z;
    public final boolean A0a;

    private float A00(float f) {
        double d;
        double d2;
        float f2;
        if (f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            d = (double) f;
            d2 = (double) getStartMostEnabledPanel().A00;
            f2 = this.A03.A00;
        } else {
            C27101Gm endMostEnabledPanel = getEndMostEnabledPanel();
            d = (double) f;
            d2 = (double) this.A03.A00;
            f2 = endMostEnabledPanel.A00;
        }
        return (float) C27181Gu.A00(d, d2, (double) f2);
    }

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A0E = Math.min(-f, (float) this.A0X) / ((float) getWidth());
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 1) != 0;
    }

    /* renamed from: com.instagram.ui.swipenavigation.SwipeNavigationContainer$SavedState */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(84);
        public final float A00;

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.A00);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.A00 = parcel.readFloat();
        }

        public SavedState(Parcelable parcelable, float f) {
            super(parcelable);
            this.A00 = f;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f4, code lost:
        if (r9 > r1) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r4.A03 == null) goto L_0x000b;
     */
    private void A01() {
        boolean z;
        float max;
        float min;
        Bundle bundle;
        if (this.A02 != null) {
            z = true;
        }
        z = false;
        if (z) {
            int width = getWidth();
            float clampedPosition = getClampedPosition();
            C27101Gm startMostEnabledPanel = getStartMostEnabledPanel();
            C27101Gm endMostEnabledPanel = getEndMostEnabledPanel();
            int width2 = startMostEnabledPanel.A01.getWidth();
            float f = (float) width;
            float f2 = (float) (-width2);
            float min2 = Math.min(Math.max(clampedPosition * f, f2), (float) endMostEnabledPanel.A01.getWidth());
            float f3 = 1.0f * (f2 - min2);
            View view = startMostEnabledPanel.A01;
            if (this.A0a) {
                f3 = -f3;
            }
            view.setTranslationX(f3);
            View view2 = this.A03.A01;
            float f4 = -min2;
            if (this.A0a) {
                f4 = min2;
            }
            view2.setTranslationX(1.0f * f4);
            float abs = 1.0f * ((Math.abs(endMostEnabledPanel.A00) * f) - min2);
            View view3 = endMostEnabledPanel.A01;
            if (this.A0a) {
                abs = -abs;
            }
            view3.setTranslationX(abs);
            if (clampedPosition == this.A0C && min2 == this.A0B) {
                C27161Gs r1 = this.A0I;
                if (r1 != null) {
                    if (clampedPosition == endMostEnabledPanel.A00 && (bundle = this.A0G) != null) {
                        r1.B3M(clampedPosition, bundle);
                        this.A0G = null;
                    }
                    C27161Gs r6 = this.A0I;
                    float f5 = startMostEnabledPanel.A00;
                    C27171Gt r7 = new C27171Gt();
                    r7.A00 = f5;
                    r7.A0B = false;
                    r7.A09 = this.A0M;
                    r7.A04 = this.A0L;
                    String str = this.A0O;
                    String str2 = this.A0P;
                    r7.A07 = str;
                    r7.A08 = str2;
                    String str3 = this.A0N;
                    int i = this.A0F;
                    r7.A06 = str3;
                    r7.A01 = i;
                    r7.A0A = this.A0Q;
                    r7.A02 = this.A0H;
                    r6.BEm(f5, r7);
                }
            } else {
                this.A0C = clampedPosition;
                this.A0B = min2;
                C27161Gs r8 = this.A0I;
                if (r8 != null) {
                    float f6 = startMostEnabledPanel.A00;
                    if (clampedPosition >= f6) {
                        f6 = endMostEnabledPanel.A00;
                    }
                    clampedPosition = f6;
                    float f7 = min2;
                    if (this.A0a) {
                        f7 = -min2;
                    }
                    r8.BEn(clampedPosition, f7, this.A0M, this.A0K, this.A0L, this.A0O, this.A0P, this.A0N, this.A0F, this.A0Q, this.A0H);
                }
            }
            if (this.A0a) {
                max = Math.max(min2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                min = Math.min(f, min2 + f);
            } else {
                max = Math.max(-min2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                min = Math.min(f, f - min2);
            }
            this.A0V.set(max, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, min, (float) getHeight());
        }
    }

    private float getClampedPosition() {
        return A00((float) this.A0W.A00());
    }

    private C27101Gm getEndMostEnabledPanel() {
        C27101Gm r0 = this.A04;
        if (r0 == null) {
            return this.A03;
        }
        return r0;
    }

    private C27101Gm getStartMostEnabledPanel() {
        C27101Gm r0 = this.A05;
        if (r0 == null) {
            return this.A03;
        }
        return r0;
    }

    private void setEndPanelExtraParameter(C27171Gt r4) {
        if (r4.A05 != null) {
            Bundle bundle = new Bundle();
            this.A0G = bundle;
            bundle.putString("filter_type", r4.A05);
        }
    }

    private void setInternalPosition(C27171Gt r5) {
        if (C06530Pk.A00) {
            Systrace.A01(1, "igcam_swipe_anim", 0);
        }
        this.A0M = r5.A09;
        this.A0K = r5.A03;
        this.A0L = r5.A04;
        this.A0O = r5.A07;
        this.A0P = r5.A08;
        this.A0N = r5.A06;
        this.A0F = r5.A01;
        this.A0Q = r5.A0A;
        this.A0H = r5.A02;
        float A002 = A00(r5.A00);
        if (r5.A0B) {
            this.A0W.A03((double) A002);
        } else {
            this.A0W.A05((double) A002, true);
            BOH(this.A0W);
        }
        setEndPanelExtraParameter(r5);
    }

    public final void A02(float f) {
        float f2;
        C27161Gs r2;
        if (this.A0a) {
            f = -f;
        }
        this.A0W.A04((double) f);
        String str = "swipe";
        if (this.A08) {
            f2 = this.A03.A00;
            str = "tap_partially_visible_panel";
        } else {
            C27101Gm startMostEnabledPanel = getStartMostEnabledPanel();
            C27101Gm endMostEnabledPanel = getEndMostEnabledPanel();
            float A002 = (float) this.A0W.A00();
            f2 = endMostEnabledPanel.A00;
            if (A002 <= f2) {
                f2 = startMostEnabledPanel.A00;
                if (A002 >= f2) {
                    if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        f2 = ((float) Math.floor((double) A002)) + 1.0f;
                    } else if (f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        f2 = ((float) Math.ceil((double) A002)) - 1.0f;
                    } else {
                        f2 = (float) Math.round(A002);
                    }
                }
            }
        }
        if (!(A00(this.A09) == f2 || (r2 = this.A0I) == null || this.A0J != null)) {
            C698533x r0 = new C698533x(f2);
            this.A0J = r0;
            r2.BCy(r0.A00, r0.A01);
        }
        C27171Gt r1 = new C27171Gt();
        r1.A00 = f2;
        r1.A0B = true;
        r1.A09 = str;
        setInternalPosition(r1);
        this.A08 = false;
    }

    public final void BOH(AnonymousClass1EG r5) {
        if (C06530Pk.A00) {
            Systrace.A03(1, "igcam_swipe_anim", 0);
        }
        C27161Gs r0 = this.A0I;
        if (r0 != null) {
            r0.BCx();
        }
    }

    public int getNestedScrollAxes() {
        AnonymousClass1EI r0 = this.A0Z;
        return r0.A01 | r0.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r1 == false) goto L_0x0019;
     */
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2 = this.A0R;
        boolean z3 = false;
        if (i != 0) {
            z3 = true;
        }
        boolean z4 = z2 | z3;
        this.A0R = z4;
        if (!z4 && i3 != 0) {
            AnonymousClass1DZ r0 = this.A02;
            if (r0 != null) {
                boolean Ahz = r0.Ahz((MotionEvent) null);
                z = true;
            }
            z = false;
            if (z) {
                C27171Gt r3 = new C27171Gt();
                r3.A00 = ((float) this.A0W.A00()) + (((float) i3) / ((float) getWidth()));
                r3.A0B = false;
                r3.A09 = "swipe";
                setInternalPosition(r3);
            }
        }
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.A0Z.A01 = i;
        this.A0D = getClampedPosition();
        this.A0R = false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A0W.A05((double) savedState.A00, true);
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.A07) {
            return false;
        }
        if (!this.A0S) {
            this.A0S = true;
            return true;
        }
        float width = f / ((float) getWidth());
        C27171Gt r4 = new C27171Gt();
        float A002 = (float) this.A0W.A00();
        if (this.A0a) {
            width = -width;
        }
        r4.A00 = A002 + width;
        r4.A0B = false;
        r4.A09 = "swipe";
        setInternalPosition(r4);
        return true;
    }

    public final void onStopNestedScroll(View view) {
        this.A0Z.A01 = 0;
        A02(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public void setListener(C27161Gs r2) {
        if (this.A0I != r2) {
            this.A0I = r2;
            this.A0C = Float.MAX_VALUE;
            this.A0B = Float.MAX_VALUE;
        }
    }

    public void setPosition(C27171Gt r4) {
        C27161Gs r2 = this.A0I;
        if (r2 != null && r4.A0B) {
            r2.BCy(r4.A00, r4.A09);
        }
        setInternalPosition(r4);
    }

    public float getPosition() {
        return getClampedPosition();
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(972910576);
        super.onAttachedToWindow();
        this.A0W.A07(this);
        A01();
        AnonymousClass0Z0.A0D(1531959936, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-182695494);
        super.onDetachedFromWindow();
        this.A0W.A08(this);
        AnonymousClass0Z0.A0D(1549773247, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
        if (r1 == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f0, code lost:
        if (r1 == getEndMostEnabledPanel().A00) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0111, code lost:
        if (r9.A0V.contains(r4, r3) == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0114, code lost:
        if (r0 != false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012a, code lost:
        if (r1 >= ((float) getWidth())) goto L_0x012c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        boolean z6 = false;
        if (actionMasked == 0) {
            this.A06 = false;
            this.A07 = false;
            this.A0E = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A09 = getClampedPosition();
            this.A00 = motionEvent.getRawX();
            this.A01 = motionEvent.getRawY();
            this.A0A = motionEvent.getRawX();
            this.A0W.A02();
            this.A08 = false;
            float clampedPosition = getClampedPosition();
            if (!(clampedPosition == this.A03.A00 || clampedPosition == getStartMostEnabledPanel().A00)) {
                z = false;
            }
            z = true;
            if (z) {
                this.A0S = false;
                float f = this.A00;
                float f2 = this.A01;
                if (this.A0V.width() < ((float) getWidth())) {
                    z3 = true;
                }
                z3 = false;
            } else {
                this.A0S = true;
            }
            z6 = true;
            float width = this.A0V.width();
            if (width > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                z2 = true;
            }
            z2 = false;
            if (!z2) {
                this.A0J = null;
            }
            this.A02.Aqr(motionEvent);
            return z6;
        } else if (actionMasked != 2) {
            return false;
        } else {
            if (!this.A07 && !this.A06) {
                float abs = Math.abs(this.A00 - motionEvent.getRawX());
                float abs2 = Math.abs(this.A01 - motionEvent.getRawY());
                float f3 = this.A0T;
                boolean z7 = false;
                boolean z8 = false;
                if (abs > f3) {
                    z8 = true;
                }
                if (abs2 > f3) {
                    z7 = true;
                }
                double degrees = Math.toDegrees(Math.atan((double) Math.abs(abs2 / abs)));
                if (z7 && degrees >= ((double) (((float) this.A0U) / 2.0f))) {
                    this.A07 = true;
                } else if (z8 && degrees < ((double) (((float) this.A0U) / 2.0f))) {
                    this.A06 = true;
                }
            }
            if (!this.A06) {
                return false;
            }
            boolean z9 = false;
            if (motionEvent.getPointerCount() > 1) {
                z9 = true;
            }
            if (!z9) {
                AnonymousClass1DZ r0 = this.A02;
                if (r0 != null) {
                    boolean Ahz = r0.Ahz(motionEvent);
                    z5 = true;
                }
                z5 = false;
                if (z5) {
                    getClampedPosition();
                    z4 = !C50982Iq.A00(this, false, (int) (motionEvent.getRawX() - this.A0A), (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    if (z4) {
                        return false;
                    }
                    this.A0A = motionEvent.getRawX();
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            }
            z4 = false;
            if (z4) {
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A01();
        this.A0K = null;
        this.A0L = null;
        this.A0O = null;
        this.A0P = null;
        this.A0N = null;
        this.A0F = -1;
        this.A0Q = null;
        this.A0H = null;
    }

    public final void onMeasure(int i, int i2) {
        int max = Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight());
        C27101Gm r1 = this.A05;
        if (r1 != null) {
            r1.A01.getLayoutParams().width = Math.min((int) (Math.abs(r1.A00) * ((float) max)), Integer.MAX_VALUE);
        }
        C27101Gm r12 = this.A04;
        if (r12 != null) {
            r12.A01.getLayoutParams().width = Math.min((int) (Math.abs(r12.A00) * ((float) max)), Integer.MAX_VALUE);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1 == false) goto L_0x0016;
     */
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        boolean z;
        if (getClampedPosition() != this.A0D) {
            AnonymousClass1DZ r0 = this.A02;
            if (r0 != null) {
                boolean Ahz = r0.Ahz((MotionEvent) null);
                z = true;
            }
            z = false;
            if (z) {
                iArr[0] = i;
                C27171Gt r3 = new C27171Gt();
                r3.A00 = ((float) this.A0W.A00()) + (((float) i) / ((float) getWidth()));
                r3.A0B = false;
                r3.A09 = "swipe";
                setInternalPosition(r3);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getClampedPosition());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r4.A0V.contains(r3, r2) == false) goto L_0x0020;
     */
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean z;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (this.A0V.width() < ((float) getWidth())) {
            z = true;
        }
        z = false;
        if (!z) {
            return false;
        }
        this.A08 = true;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r0 != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1 == false) goto L_0x001c;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        int A052 = AnonymousClass0Z0.A05(805481628);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (getChildCount() != 0) {
            AnonymousClass1DZ r0 = this.A02;
            if (r0 != null) {
                boolean Ahz = r0.Ahz(motionEvent);
                z = true;
            }
            z = false;
            if (z) {
                if (!this.A0Y.onTouchEvent(motionEvent)) {
                    boolean z2 = onTouchEvent;
                    onTouchEvent = false;
                }
                onTouchEvent = true;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 1 || actionMasked == 3) {
                    A02(this.A0E);
                }
                i = -135379567;
                AnonymousClass0Z0.A0C(i, A052);
                return onTouchEvent;
            }
        }
        i = -411788747;
        AnonymousClass0Z0.A0C(i, A052);
        return onTouchEvent;
    }

    public final void BOK(AnonymousClass1EG r1) {
        A01();
    }

    public SwipeNavigationContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public SwipeNavigationContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeNavigationContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0M = NetInfoModule.CONNECTION_TYPE_NONE;
        this.A0G = null;
        this.A0C = Float.MAX_VALUE;
        this.A0B = Float.MAX_VALUE;
        this.A0V = new RectF();
        this.A0Y = new GestureDetector(context, this);
        this.A0T = (float) ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.A0X = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
        A002.A06 = true;
        A002.A06(A0b);
        A002.A00 = 0.0010000000474974513d;
        A002.A02 = 1.0d;
        this.A0W = A002;
        this.A0U = 70;
        this.A0a = C06400Ox.A02(context);
        this.A0J = null;
        this.A0Z = new AnonymousClass1EI();
    }
}
