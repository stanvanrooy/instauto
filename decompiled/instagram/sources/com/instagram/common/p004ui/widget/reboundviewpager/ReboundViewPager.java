package com.instagram.common.p004ui.widget.reboundviewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass1YC;
import p000X.AnonymousClass1bM;
import p000X.AnonymousClass3E5;
import p000X.AnonymousClass8AL;
import p000X.C113854uy;
import p000X.C206918uM;
import p000X.C256519s;
import p000X.C27181Gu;
import p000X.C30778Djs;
import p000X.C31831a3;
import p000X.C32451bH;
import p000X.C32461bI;
import p000X.C32471bJ;
import p000X.C32481bK;
import p000X.C32491bL;
import p000X.C32501bN;
import p000X.C32511bO;
import p000X.C32521bP;
import p000X.C32531bQ;
import p000X.C44381w4;
import p000X.C44391w5;
import p000X.C44451wB;
import p000X.C50982Iq;
import p000X.C92803zk;

/* renamed from: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager */
public class ReboundViewPager extends FrameLayout implements C31831a3, AnonymousClass1E8, GestureDetector.OnGestureListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public View A0C;
    public AccessibilityManager A0D;
    public C44391w5 A0E;
    public C32491bL A0F;
    public AnonymousClass3E5 A0G;
    public C32521bP A0H;
    public AnonymousClass1bM A0I;
    public C32501bN A0J;
    public C113854uy A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public int[] A0T;
    public int[] A0U;
    public float A0V;
    public float A0W;
    public float A0X;
    public float A0Y;
    public int A0Z;
    public int A0a;
    public int A0b;
    public int A0c;
    public int A0d;
    public C30778Djs A0e;
    public C32481bK A0f;
    public Boolean A0g;
    public Integer A0h;
    public Integer A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public final C92803zk A0q;
    public final List A0r;
    public final List A0s;
    public final List A0t;
    public final Map A0u;
    public final Map A0v;
    public final Map A0w;
    public final float[] A0x;
    public final int A0y;
    public final GestureDetector A0z;
    public final Scroller A10;
    public final C32461bI A11;
    public final List A12;
    public final List A13;
    public final List A14;
    public final List A15;
    public final List A16;
    public final Map A17;

    public static void A04(ReboundViewPager reboundViewPager, float f, double d, boolean z) {
        reboundViewPager.A03((AnonymousClass1EA) reboundViewPager.A0v.get(C32471bJ.PAGING), f, d, z);
    }

    private boolean A08(float f, float f2) {
        if (f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return f2 >= getMinimumOffset();
        }
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return f2 <= getMaximumOffset();
        }
        if (f2 < getMinimumOffset() || f2 > getMaximumOffset()) {
            return false;
        }
        return true;
    }

    public final void A0D(float f) {
        A0G(f, true, false);
    }

    public final void A0H(int i) {
        A04(this, (float) i, (double) BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, true);
    }

    public final void A0I(int i) {
        A04(this, (float) i, 0.0d, false);
    }

    public final void A67(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, 0, layoutParams);
    }

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setTouchSlopDp(int i) {
        this.A0X = TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025 A[RETURN] */
    private int A00(float f) {
        float f2 = this.A00 + f;
        int AEY = this.A0H.AEY(f2, this);
        int Aid = this.A0H.Aid(f2, this);
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            if (A0O()) {
                return Aid;
            }
            return AEY;
        } else if (f >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return this.A06;
        } else {
            if (A0O()) {
            }
        }
        return Aid;
    }

    private View A01(C44451wB r10) {
        Object remove;
        C44391w5 r0;
        Map map = (Map) this.A0u.get(Integer.valueOf(r10.A02));
        if (map != null) {
            if (this.A0o && (r0 = this.A0E) != null && r0.hasStableIds()) {
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((C44451wB) entry.getKey()).A03 == r10.A03) {
                        it.remove();
                        remove = entry.getValue();
                        break;
                    }
                }
            } else {
                View view = (View) map.remove(r10);
                if (view != null) {
                    return view;
                }
                Iterator it2 = map.keySet().iterator();
                if (it2.hasNext()) {
                    remove = map.remove((C44451wB) it2.next());
                }
            }
            return (View) remove;
        }
        return null;
    }

    private void A02(MotionEvent motionEvent) {
        if (!this.A0k && !this.A0j) {
            float rawX = this.A0V - motionEvent.getRawX();
            float rawY = this.A0W - motionEvent.getRawY();
            boolean z = false;
            if (Math.sqrt((double) ((rawX * rawX) + (rawY * rawY))) > ((double) this.A0X)) {
                z = true;
            }
            double degrees = Math.toDegrees(Math.atan((double) Math.abs(rawY / rawX)));
            if (!z) {
                return;
            }
            if (A0N() || degrees < ((double) (this.A0B >> 1))) {
                this.A0j = true;
            } else {
                this.A0k = true;
            }
        }
    }

    private void A03(AnonymousClass1EA r5, float f, double d, boolean z) {
        ((AnonymousClass1EG) this.A0q.get()).A06(r5);
        if (!this.A0L) {
            if (f < getMinimumOffset()) {
                f = getMinimumOffset();
            } else if (f > getMaximumOffset()) {
                f = getMaximumOffset();
            }
        }
        if (this.A00 != f) {
            if (z) {
                setScrollState(C32501bN.SETTLING);
                ((AnonymousClass1EG) this.A0q.get()).A05((double) this.A00, true);
                ((AnonymousClass1EG) this.A0q.get()).A04(-d);
                ((AnonymousClass1EG) this.A0q.get()).A03((double) f);
            } else {
                setScrollState(C32501bN.SETTLING);
                AnonymousClass1EG r3 = (AnonymousClass1EG) this.A0q.get();
                r3.A05((double) f, true);
                r3.A02();
            }
        }
        if (((AnonymousClass1EG) this.A0q.get()).A09()) {
            setScrollState(C32501bN.IDLE);
        }
    }

    public static void A05(ReboundViewPager reboundViewPager, boolean z, boolean z2) {
        float f = reboundViewPager.A00;
        if (!reboundViewPager.A0L) {
            if (f < reboundViewPager.getMinimumOffset()) {
                f = reboundViewPager.getMinimumOffset();
            } else if (f > reboundViewPager.getMaximumOffset()) {
                f = reboundViewPager.getMaximumOffset();
            }
        }
        reboundViewPager.A0G(f, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012b, code lost:
        if (r1 == false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b7, code lost:
        if (r1 == false) goto L_0x01b9;
     */
    private void A06(List list, List list2, List list3, boolean z) {
        boolean z2;
        C113854uy r0;
        boolean z3;
        this.A14.addAll(this.A12);
        this.A12.clear();
        for (int i = 0; i < list.size(); i++) {
            int intValue = ((Integer) list.get(i)).intValue();
            int intValue2 = ((Integer) list2.get(i)).intValue();
            boolean z4 = this.A0Q;
            long itemId = this.A0E.getItemId(intValue);
            int i2 = intValue;
            if (this.A0L) {
                i2 = intValue2;
            }
            C44451wB r4 = new C44451wB(z4, itemId, i2, this.A0E.getItemViewType(intValue));
            this.A12.add(r4);
            this.A14.remove(r4);
        }
        for (int i3 = 0; i3 < this.A14.size(); i3++) {
            C44451wB r5 = (C44451wB) this.A14.get(i3);
            View view = (View) this.A17.get(r5);
            if (view != null) {
                int i4 = r5.A02;
                Map map = (Map) this.A0u.get(Integer.valueOf(i4));
                if (map == null) {
                    map = new LinkedHashMap();
                    this.A0u.put(Integer.valueOf(i4), map);
                }
                map.put(r5, view);
                this.A0w.remove(view);
                this.A17.remove(r5);
            }
        }
        this.A14.clear();
        for (int i5 = 0; i5 < this.A12.size(); i5++) {
            C44451wB r7 = (C44451wB) this.A12.get(i5);
            int intValue3 = ((Integer) list.get(i5)).intValue();
            int intValue4 = ((Integer) list2.get(i5)).intValue();
            View view2 = (View) this.A17.get(r7);
            int i6 = 1;
            if (z) {
                if (view2 == null) {
                    view2 = A01(r7);
                }
                if (view2 == null) {
                    this.A0Z++;
                }
                view2 = this.A0E.getView(intValue3, view2, this);
            }
            if (view2 == null) {
                View A012 = A01(r7);
                if (A012 == null) {
                    this.A0Z++;
                }
                view2 = this.A0E.getView(intValue3, A012, this);
            }
            this.A17.put(r7, view2);
            this.A0w.put(view2, r7);
            if (intValue4 == this.A05) {
                this.A0C = view2;
            }
            if (view2.getParent() == null) {
                addView(view2);
            }
            C32521bP r2 = this.A0H;
            if (A0O()) {
                i6 = -1;
            }
            r2.BXS(this, view2, ((float) i6) * ((Float) list3.get(i5)).floatValue(), intValue3);
            AccessibilityManager accessibilityManager = this.A0D;
            if (accessibilityManager != null) {
                boolean isEnabled = accessibilityManager.isEnabled();
                z3 = true;
            }
            z3 = false;
            if (z3 && this.A0K != null) {
                setAccessibilityImportanceForView(view2);
                C206918uM r3 = this.A0K.A00;
                AnonymousClass1YC A092 = AnonymousClass1E1.A09(view2);
                if (!(A092 == null || A092 == r3)) {
                    r3.A00.put(view2, A092);
                }
                AnonymousClass1E1.A0b(view2, r3);
            }
        }
        for (Map values : this.A0u.values()) {
            for (View view3 : values.values()) {
                if (view3.getParent() == this) {
                    int size = this.A0t.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((C256519s) this.A0t.get(i7)).BVp(view3);
                    }
                    removeView(view3);
                }
                if (this.A0w.containsKey(view3)) {
                    this.A17.remove((C44451wB) this.A0w.remove(view3));
                }
                AccessibilityManager accessibilityManager2 = this.A0D;
                if (accessibilityManager2 != null) {
                    boolean isEnabled2 = accessibilityManager2.isEnabled();
                    z2 = true;
                }
                z2 = false;
                if (z2 && (r0 = this.A0K) != null) {
                    AnonymousClass1E1.A0b(view3, (AnonymousClass1YC) r0.A00.A00.remove(view3));
                }
            }
        }
    }

    private boolean A07(float f) {
        boolean z;
        if (this.A0I == AnonymousClass1bM.VERTICAL) {
            z = this.A0p;
        } else {
            z = this.A0l;
        }
        boolean z2 = false;
        if (!z || this.A0E == null) {
            return false;
        }
        if (this.A0G != null) {
            int A002 = A00(f);
            if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                int i = A002 + 1;
                if (A002 >= 0 && i < this.A0E.getCount()) {
                    z2 = true;
                }
                if (z2) {
                    return this.A0G.A7b(A002, i);
                }
            } else if (f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                int i2 = A002 - 1;
                if (i2 >= 0 && A002 < this.A0E.getCount()) {
                    z2 = true;
                }
                if (z2) {
                    return this.A0G.A7a(A002, i2);
                }
            }
            return this.A0G.A7c();
        }
        return true;
    }

    private void setScrollState(C32501bN r7) {
        int i;
        int i2;
        C32501bN r5 = this.A0J;
        if (r7 != r5) {
            if (r7 != C32501bN.IDLE || (i2 = this.A06) == (i = this.A09)) {
                i = -1;
            } else {
                this.A09 = i2;
            }
            this.A0J = r7;
            for (int i3 = 0; i3 < this.A0t.size(); i3++) {
                C256519s r1 = (C256519s) this.A0t.get(i3);
                if (i != -1) {
                    r1.BDi(this.A06, i);
                }
                r1.BLO(this.A0J, r5);
            }
        }
    }

    public final float A09(float f) {
        float f2 = this.A00;
        float f3 = f2 % 1.0f;
        if (f3 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            f3 += 1.0f;
        }
        float f4 = f2 + (1.0f - f3) + ((float) 0);
        A04(this, f4, (double) f, true);
        return f4;
    }

    public final float A0A(float f) {
        float f2 = this.A00;
        float f3 = f2 % 1.0f;
        if (f3 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            f3 += 1.0f;
        }
        int i = (f3 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 1 : (f3 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 0 : -1));
        float f4 = -f3;
        if (i == 0) {
            f4 = -1.0f;
        }
        float f5 = (f2 + f4) - ((float) 0);
        A04(this, f5, (double) f, true);
        return f5;
    }

    public final View A0B(int i) {
        for (C44451wB r1 : this.A17.keySet()) {
            if (r1.A01 == i) {
                return (View) this.A17.get(r1);
            }
        }
        return null;
    }

    public final void A0C() {
        this.A0t.clear();
    }

    public final void A0E(float f) {
        float A092;
        float pageSize = (float) (this.A0a / getPageSize());
        float pageSize2 = (float) (this.A0b / getPageSize());
        float f2 = -f;
        boolean z = false;
        if (A07(f2 / ((float) getPageSize())) && Math.abs(f) > pageSize2) {
            z = true;
        }
        switch (this.A0f.ordinal()) {
            case 1:
                if (z) {
                    if (f > pageSize2) {
                        if (f > pageSize) {
                            f = pageSize;
                        }
                        A092 = A0A(f);
                    } else if (f < (-pageSize2)) {
                        float f3 = -pageSize;
                        if (f < f3) {
                            f = f3;
                        }
                        A092 = A09(f);
                    } else {
                        return;
                    }
                    A0J(this.A0d, (int) A092);
                    return;
                } else if (((AnonymousClass1EG) this.A0q.get()).A09() || this.A0P) {
                    A0H(this.A05);
                    int i = this.A0d;
                    int i2 = this.A05;
                    if (i != i2) {
                        A0J(i, i2);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                this.A10.fling(Math.round(this.A00 * ((float) getPageSize())), 0, Math.round(f2 * ((float) getPageSize())), 0, Process.WAIT_RESULT_STOPPED, Integer.MAX_VALUE, 0, 0);
                A03((AnonymousClass1EA) this.A0v.get(C32471bJ.WHEEL_OF_FORTUNE), (float) Math.round(((float) this.A10.getFinalX()) / ((float) getPageSize())), (double) f, true);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r3 > getMaximumOffset()) goto L_0x0013;
     */
    public final void A0F(float f, boolean z) {
        boolean z2;
        C32501bN r1;
        if (!z) {
            if (f >= getMinimumOffset()) {
                z2 = true;
            }
            z2 = false;
            if (!(z2 || (r1 = this.A0J) == C32501bN.SETTLING || r1 == C32501bN.DRAGGING)) {
                return;
            }
        }
        A0G(f, false, true);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x023b, code lost:
        r0 = r6.A0U;
        r1 = r6.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0251, code lost:
        r2 = r0[r1];
        r0 = r6.A0T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0255, code lost:
        r1 = r0[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0259, code lost:
        if (r1 == r6.A05) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0261, code lost:
        if (r1 >= r6.A0E.getCount()) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0264, code lost:
        if (r1 > -1) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0268, code lost:
        if (r6.A0L == false) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x026c, code lost:
        if (r2 == r6.A06) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x026e, code lost:
        r6.A05 = r1;
        r6.A06 = r2;
        A06(r6.A16, r6.A13, r6.A15, r19);
        r8 = r6.A00;
        r10 = r6.A0H.AEY(r5, r6);
        r9 = r6.A0H.Aid(r5, r6);
        r1 = r6.A0H.AEY(r8, r6);
        r8 = r6.A0H.Aid(r8, r6);
        r11 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x029c, code lost:
        if (A0O() == false) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x029e, code lost:
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02a3, code lost:
        if (A0O() == false) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02a5, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02a6, code lost:
        r10 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02ab, code lost:
        if (A0O() == false) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ad, code lost:
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02b2, code lost:
        if (A0O() == false) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02b4, code lost:
        r8 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02b5, code lost:
        r6.A0r.clear();
        r6.A0s.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02bf, code lost:
        if (r10 >= r11) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02c1, code lost:
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02c2, code lost:
        if (r2 >= r11) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02c4, code lost:
        r6.A0r.add(java.lang.Integer.valueOf(r2));
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02d0, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02d9, code lost:
        if (r11 >= r10) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02db, code lost:
        if (r11 >= r10) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02dd, code lost:
        if (r11 > r9) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02df, code lost:
        r6.A0s.add(java.lang.Integer.valueOf(r11));
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02eb, code lost:
        if (r8 >= r9) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02ed, code lost:
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02ee, code lost:
        if (r2 <= r8) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02f0, code lost:
        if (r2 < r9) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02f2, code lost:
        r6.A0s.add(java.lang.Integer.valueOf(r2));
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02fe, code lost:
        if (r8 <= r9) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0300, code lost:
        if (r8 <= r9) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0302, code lost:
        if (r8 < r10) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0304, code lost:
        r6.A0r.add(java.lang.Integer.valueOf(r8));
        r8 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0310, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0317, code lost:
        if (r8 >= r6.A0r.size()) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0319, code lost:
        r2 = ((java.lang.Integer) r6.A0r.get(r8)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0325, code lost:
        if (r2 < 0) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x032d, code lost:
        if (r2 < r6.A0E.getCount()) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0331, code lost:
        if (r6.A0L != false) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0333, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0336, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x033d, code lost:
        if (r1 >= r6.A0t.size()) goto L_0x0333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x033f, code lost:
        ((p000X.C256519s) r6.A0t.get(r1)).BDW(r2);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x034d, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0354, code lost:
        if (r8 >= r6.A0s.size()) goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0356, code lost:
        r2 = ((java.lang.Integer) r6.A0s.get(r8)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0362, code lost:
        if (r2 < 0) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x036a, code lost:
        if (r2 < r6.A0E.getCount()) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x036e, code lost:
        if (r6.A0L != false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0370, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0373, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x037a, code lost:
        if (r1 >= r6.A0t.size()) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x037c, code lost:
        ((p000X.C256519s) r6.A0t.get(r1)).BDX(r2);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0390, code lost:
        if (r7 >= r6.A0t.size()) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0392, code lost:
        r2 = (p000X.C256519s) r6.A0t.get(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x039a, code lost:
        if (r4 == false) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x039c, code lost:
        r2.BDU(r6.A06, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03a1, code lost:
        r2.BLD(r6.A00, r5, r6.A0J);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        throw new java.lang.IllegalArgumentException("Invalid BufferBias");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        r10 = r6.A0x;
        r10 = (int) (java.lang.Math.ceil((double) r10[1]) - java.lang.Math.floor((double) r10[0]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a6, code lost:
        r2 = r6.A0U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
        if (r8 >= r2.length) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
        r3 = (float) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ac, code lost:
        if (r8 != r10) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b2, code lost:
        if (r6.A0F != p000X.C32491bL.A03) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00de, code lost:
        if (r6.A0N != false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0170, code lost:
        if (r3 > r6.A0x[1]) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0172, code lost:
        r6.A0T[r8] = r9;
        r1 = r6.A0E.getCount();
        r0 = r9 % r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x017e, code lost:
        if (r0 >= 0) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0180, code lost:
        r0 = r0 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0181, code lost:
        r2[r8] = r0;
        r8 = r8 + 1;
        r6.A0A = r8;
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0194, code lost:
        r9 = (int) r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c7  */
    public final void A0G(float f, boolean z, boolean z2) {
        float[] fArr;
        float f2;
        int i;
        int i2;
        int[] iArr;
        int[] iArr2;
        float f3;
        float f4;
        double d;
        int i3;
        float f5;
        C44391w5 r3 = this.A0E;
        if (r3 != null) {
            float f6 = this.A00;
            float f7 = f;
            if (f != f6 || !z2) {
                this.A00 = f7;
                int i4 = 0;
                boolean z3 = true;
                if ((f >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && f <= ((float) (r3.getCount() - 1))) || this.A0L) {
                    this.A07 = this.A0H.AEY(f7, this);
                    this.A08 = this.A0H.Aid(f7, this);
                } else if (f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    this.A07 = 0;
                    this.A08 = 0;
                } else {
                    this.A07 = this.A0E.getCount() - 1;
                    this.A08 = this.A0E.getCount() - 1;
                }
                C32491bL r32 = this.A0F;
                C32491bL r2 = C32491bL.BIAS_FORWARD;
                if (r32 == r2) {
                    float f8 = this.A00;
                    if (f8 > f6) {
                        if (this.A0O && f8 > this.A03) {
                            this.A0O = false;
                            this.A0N = true;
                        } else if (this.A0N && f8 >= this.A03 + 1.0f) {
                            this.A0N = false;
                        }
                    } else if (f8 < f6 && this.A0N && f8 <= this.A03) {
                        this.A0N = false;
                        this.A0O = true;
                    }
                }
                if (r32 == r2) {
                    if (this.A0O) {
                        fArr = this.A0x;
                        fArr[0] = this.A00;
                        f5 = this.A03;
                    } else if (this.A0N) {
                        fArr = this.A0x;
                        fArr[0] = this.A03;
                        f5 = this.A00;
                    }
                    f2 = f5 + ((float) this.A04);
                    fArr[1] = f2 + 1.0f;
                    if (this.A0E.getCount() != 0) {
                        int i5 = 0;
                        switch (this.A0F.ordinal()) {
                            case 0:
                            case 3:
                                d = Math.floor((double) this.A0x[0]);
                            case 1:
                                i3 = Math.round(this.A0x[0]);
                                break;
                            case 2:
                                double d2 = (double) this.A0x[0];
                                d = Math.ceil(d2);
                                if (d == d2) {
                                    i3 = ((int) d) + 1;
                                    break;
                                }
                        }
                    }
                    this.A16.clear();
                    this.A13.clear();
                    this.A15.clear();
                    if (this.A0A > 0) {
                        if (this.A0F == C32491bL.BIAS_FORWARD) {
                            float f9 = this.A00;
                            float floor = f9 - ((float) ((int) Math.floor((double) f9)));
                            if (!this.A0O) {
                                f3 = -floor;
                            }
                            f4 = -floor;
                        } else {
                            f3 = -(this.A0x[0] - ((float) this.A0T[0]));
                            f4 = f3 - ((float) this.A04);
                        }
                        for (int i6 = 0; i6 < this.A0A; i6++) {
                            int i7 = this.A0U[i6];
                            int i8 = this.A0T[i6];
                            float f10 = ((float) i6) + f4;
                            if (i7 < this.A0E.getCount()) {
                                boolean z4 = false;
                                if (this.A0L || (i8 >= 0 && i8 < this.A0E.getCount())) {
                                    float f11 = (float) i8;
                                    float f12 = 1.0f + f11;
                                    float[] fArr2 = this.A0x;
                                    float f13 = fArr2[0];
                                    float f14 = fArr2[1];
                                    if (this.A0F != C32491bL.BIAS_END ? !((f13 > f11 || f11 >= f14) && (f13 > f12 || f12 >= f14)) : !((f13 > f11 || f11 > f14) && (f13 > f12 || f12 > f14))) {
                                        z4 = true;
                                    }
                                }
                                if (z4) {
                                    this.A16.add(Integer.valueOf(i7));
                                    this.A13.add(Integer.valueOf(i8));
                                    this.A15.add(Float.valueOf(f10));
                                }
                            }
                        }
                    }
                    int i9 = this.A06;
                    float f15 = this.A00;
                    float abs = Math.abs(f15 - ((float) ((int) Math.floor((double) f15))));
                    switch (this.A0F.ordinal()) {
                        case 0:
                            if (abs > 0.5f) {
                                int[] iArr3 = this.A0U;
                                int i10 = this.A04;
                                i = iArr3[i10 + 1];
                                iArr = this.A0T;
                                i2 = i10 + 1;
                                break;
                            }
                            break;
                        case 1:
                            break;
                        case 2:
                            if (abs < 0.5f) {
                                int[] iArr4 = this.A0U;
                                int i11 = this.A04;
                                i = iArr4[i11 - 1];
                                iArr = this.A0T;
                                i2 = i11 - 1;
                                break;
                            }
                            break;
                        case 3:
                            if (this.A0O || this.A0N) {
                                i2 = 0;
                            } else {
                                i2 = this.A04;
                            }
                            if (abs <= 0.5f) {
                                iArr2 = this.A0U;
                                break;
                            } else {
                                iArr2 = this.A0U;
                                i2++;
                                break;
                            }
                            break;
                    }
                }
                fArr = this.A0x;
                float f16 = this.A00;
                float f17 = (float) this.A04;
                fArr[0] = f16 - f17;
                f2 = f16 + f17;
                fArr[1] = f2 + 1.0f;
                if (this.A0E.getCount() != 0) {
                }
                this.A16.clear();
                this.A13.clear();
                this.A15.clear();
                if (this.A0A > 0) {
                }
                int i92 = this.A06;
                float f152 = this.A00;
                float abs2 = Math.abs(f152 - ((float) ((int) Math.floor((double) f152))));
                switch (this.A0F.ordinal()) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
            }
        }
    }

    public final void A0J(int i, int i2) {
        for (C256519s BQW : this.A0t) {
            BQW.BQW(i, i2);
        }
    }

    public final void A0K(C44391w5 r4, float f) {
        this.A03 = f;
        this.A0Z = 0;
        C44391w5 r1 = this.A0E;
        if (r1 != null) {
            r1.BsA(this.A11);
        }
        if (this.A0E != r4) {
            List list = Collections.EMPTY_LIST;
            A06(list, list, list, false);
        }
        this.A0E = r4;
        r4.BZv(this.A11);
        A0D(f);
        this.A09 = this.A06;
    }

    public final void A0L(C256519s r2) {
        if (!this.A0t.contains(r2)) {
            this.A0t.add(r2);
        }
    }

    public final void A0M(C256519s r2) {
        this.A0t.remove(r2);
    }

    public final boolean A0N() {
        if (this.A0J != C32501bN.IDLE) {
            return true;
        }
        return false;
    }

    public final boolean A0O() {
        boolean z;
        if (this.A0I != AnonymousClass1bM.HORIZONTAL) {
            return this.A0m;
        }
        if (this.A0g == null) {
            if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
                boolean z2 = false;
                if (getResources().getConfiguration().getLayoutDirection() == 1) {
                    z2 = true;
                }
                z = Boolean.valueOf(z2);
            } else {
                z = false;
            }
            this.A0g = z;
        }
        if (this.A0g.booleanValue() == this.A0m) {
            return false;
        }
        return true;
    }

    public final void BOH(AnonymousClass1EG r5) {
        if (this.A0J == C32501bN.SETTLING) {
            A0F((float) r5.A01, false);
            setScrollState(C32501bN.IDLE);
        }
    }

    public final void BOK(AnonymousClass1EG r5) {
        AnonymousClass1EG r2;
        float maximumOffset;
        if (this.A0J == C32501bN.SETTLING) {
            A0F((float) r5.A00(), false);
            float f = this.A00;
            if (f < getMinimumOffset()) {
                ((AnonymousClass1EG) this.A0q.get()).A06((AnonymousClass1EA) this.A0v.get(C32471bJ.PAGING));
                r2 = (AnonymousClass1EG) this.A0q.get();
                maximumOffset = getMinimumOffset();
            } else if (f > getMaximumOffset()) {
                ((AnonymousClass1EG) this.A0q.get()).A06((AnonymousClass1EA) this.A0v.get(C32471bJ.PAGING));
                r2 = (AnonymousClass1EG) this.A0q.get();
                maximumOffset = getMaximumOffset();
            } else {
                return;
            }
            r2.A03((double) maximumOffset);
        }
    }

    public final boolean canScrollHorizontally(int i) {
        int i2 = 0;
        if (!this.A0l || this.A0I == AnonymousClass1bM.VERTICAL) {
            return false;
        }
        if (this.A0L) {
            C44391w5 r0 = this.A0E;
            if (r0 == null || r0.getCount() <= 1) {
                return false;
            }
            return true;
        }
        if (i != 0) {
            i2 = 1;
            if (i < 0) {
                i2 = -1;
            }
        }
        float f = (float) i2;
        if (A0O()) {
            f = (float) (-i2);
        }
        return A08(f, this.A00 + (f / ((float) getPageSize())));
    }

    public final boolean canScrollVertically(int i) {
        int i2 = 0;
        if (!this.A0p || this.A0I == AnonymousClass1bM.HORIZONTAL) {
            return false;
        }
        if (this.A0L) {
            C44391w5 r0 = this.A0E;
            if (r0 == null || r0.getCount() <= 1) {
                return false;
            }
            return true;
        }
        if (i != 0) {
            i2 = 1;
            if (i < 0) {
                i2 = -1;
            }
        }
        float f = (float) i2;
        if (A0O()) {
            f = (float) (-i2);
        }
        return A08(f, this.A00 + (f / ((float) getPageSize())));
    }

    public Adapter getAdapter() {
        C44391w5 r1 = this.A0E;
        if (r1 instanceof C44381w4) {
            return ((C44381w4) r1).A00;
        }
        return r1;
    }

    public boolean getCarouselModeEnabled() {
        return this.A0L;
    }

    public View getCurrentActiveView() {
        return this.A0C;
    }

    public int getCurrentDataIndex() {
        C44391w5 r1 = this.A0E;
        if (r1 == null) {
            return -1;
        }
        if (this.A0L) {
            return this.A06;
        }
        return (int) C27181Gu.A00((double) this.A05, 0.0d, (double) (r1.getCount() - 1));
    }

    public float getCurrentOffset() {
        return this.A00;
    }

    public int getCurrentRawDataIndex() {
        return this.A05;
    }

    public int getCurrentWrappedDataIndex() {
        return this.A06;
    }

    public int getFirstVisiblePosition() {
        return this.A07;
    }

    public int getLastVisiblePosition() {
        return this.A08;
    }

    public float getMaximumOffset() {
        int i;
        int max;
        if (this.A0L) {
            return Float.MAX_VALUE;
        }
        Integer num = this.A0h;
        if (num != null) {
            max = num.intValue();
        } else {
            C44391w5 r0 = this.A0E;
            if (r0 != null) {
                i = r0.getCount();
            } else {
                i = 0;
            }
            max = Math.max(i - 1, 0);
        }
        return (float) max;
    }

    public float getMinimumOffset() {
        if (this.A0L) {
            return -3.4028235E38f;
        }
        Integer num = this.A0i;
        if (num != null) {
            return (float) num.intValue();
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public float getOffsetFromCurrentDataIndex() {
        return this.A00 - ((float) this.A09);
    }

    public int getPageSize() {
        int i = this.A0c;
        if (i != -1) {
            return i;
        }
        if (this.A0I == AnonymousClass1bM.VERTICAL) {
            return getHeight();
        }
        return getWidth();
    }

    public float getPageSpacing() {
        return this.A02;
    }

    public boolean getReverseLayout() {
        return this.A0m;
    }

    public AnonymousClass1bM getScrollDirection() {
        return this.A0I;
    }

    public C32481bK getScrollMode() {
        return this.A0f;
    }

    public C32501bN getScrollState() {
        return this.A0J;
    }

    public boolean getUseStableIdForRecycledView() {
        return this.A0o;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.A0I == AnonymousClass1bM.VERTICAL) {
            f = f2;
            if (A0O()) {
                f = -f2;
            }
        } else if (A0O()) {
            f = -f;
        }
        this.A0Y = f / ((float) getPageSize());
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r1 != 3) goto L_0x0026;
     */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.A0f == C32481bK.DISABLED || !this.A0H.Bra(this, motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    A02(motionEvent);
                    float rawX = motionEvent.getRawX() - this.A0V;
                    float rawY = motionEvent.getRawY() - this.A0W;
                    if ((!this.A0j || this.A0I != AnonymousClass1bM.HORIZONTAL) && (!this.A0k || this.A0I != AnonymousClass1bM.VERTICAL)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    AnonymousClass1bM r0 = this.A0I;
                    AnonymousClass1bM r5 = AnonymousClass1bM.VERTICAL;
                    if (r0 != r5) {
                        rawY = rawX;
                    }
                    if (z) {
                        boolean z4 = true;
                        if ((!this.A0S || !this.A0R) && !this.A0L) {
                            if (!A0O() ? rawY >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER : rawY <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            int i = this.A05;
                            if (i == 0) {
                                if (!z2) {
                                    z3 = this.A0S;
                                }
                            } else if (i == this.A0E.getCount() - 1 && z2) {
                                z3 = this.A0R;
                            }
                            if (!z3) {
                                z4 = false;
                            }
                        }
                        if (z4 && (this.A0I == r5 || !C50982Iq.A00(this, false, (int) rawX, (int) motionEvent.getX(), (int) motionEvent.getY()))) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            if (!this.A0M) {
                                return true;
                            }
                            setScrollState(C32501bN.IDLE);
                            ((AnonymousClass1EG) this.A0q.get()).A02();
                            this.A0M = false;
                            return true;
                        }
                    }
                }
            }
            A0E(this.A0Y);
            this.A0P = false;
        } else {
            this.A0j = false;
            this.A0k = false;
            this.A0n = false;
            this.A0Y = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A0V = motionEvent.getRawX();
            this.A0W = motionEvent.getRawY();
            this.A0M = true;
            this.A0d = this.A05;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (r1 > getMaximumOffset()) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0080, code lost:
        if (r0 >= 0) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0084, code lost:
        if (r1 == false) goto L_0x0086;
     */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        boolean z2;
        C44391w5 r0;
        boolean z3;
        if (this.A0k && this.A0I == AnonymousClass1bM.HORIZONTAL) {
            return false;
        }
        if (this.A0j && this.A0I == AnonymousClass1bM.VERTICAL) {
            return false;
        }
        if (!this.A0n) {
            this.A0n = true;
            return true;
        }
        if (this.A0I == AnonymousClass1bM.VERTICAL) {
            f = f2;
            if (A0O()) {
                f = -f2;
            }
        } else if (A0O()) {
            f = -f;
        }
        float pageSize = f / ((float) getPageSize());
        if (A07(pageSize)) {
            setScrollState(C32501bN.DRAGGING);
            if (!this.A0L) {
                float f3 = this.A00 + pageSize;
                if (f3 >= getMinimumOffset()) {
                    z3 = true;
                }
                z3 = false;
                if (!z3) {
                    pageSize *= this.A01;
                }
            }
            A0F(this.A00 + pageSize, false);
        } else if (this.A0G != null) {
            if (pageSize != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                float f4 = this.A00 + pageSize;
                if (f4 >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && (r0 = this.A0E) != null) {
                    int i = (f4 > ((float) r0.getCount()) ? 1 : (f4 == ((float) r0.getCount()) ? 0 : -1));
                    z2 = true;
                }
                z2 = false;
                z = true;
            }
            z = false;
            if (z) {
                int A002 = A00(pageSize);
                float f5 = this.A00 + (pageSize * this.A01);
                if (this.A0G.A7m(A002, f5)) {
                    A0F(f5, false);
                    setScrollState(C32501bN.DRAGGING);
                    this.A0P = true;
                    return true;
                }
            }
        }
        return true;
    }

    public void setAccessibilityDelegateCompat(C113854uy r1) {
        this.A0K = r1;
        AnonymousClass1E1.A0b(this, r1);
    }

    public void setCarouselModeEnabled(boolean z) {
        this.A0L = z;
        A05(this, false, true);
    }

    public void setDraggingEnabled(boolean z) {
        this.A0l = z;
        this.A0p = z;
    }

    public void setExtraBufferSize(int i) {
        this.A04 = i;
        int max = Math.max(1, i << 1) + 1;
        this.A0U = new int[max];
        this.A0T = new int[max];
        A05(this, false, true);
    }

    public void setOvershootClampingEnabled(boolean z) {
        ((AnonymousClass1EG) this.A0q.get()).A06 = z;
    }

    public void setPageSpacing(float f) {
        this.A02 = f;
        A05(this, true, false);
    }

    public void setRestDisplacementThreshold(double d) {
        ((AnonymousClass1EG) this.A0q.get()).A00 = d;
    }

    public void setRestSpeedThreshold(double d) {
        ((AnonymousClass1EG) this.A0q.get()).A02 = d;
    }

    public void setScrollMode(C32481bK r4) {
        AnonymousClass1EG r2;
        Map map;
        C32471bJ r0;
        if (r4 == C32481bK.DISCRETE_PAGING) {
            r2 = (AnonymousClass1EG) this.A0q.get();
            map = this.A0v;
            r0 = C32471bJ.PAGING;
        } else {
            r2 = (AnonymousClass1EG) this.A0q.get();
            map = this.A0v;
            r0 = C32471bJ.WHEEL_OF_FORTUNE;
        }
        r2.A06((AnonymousClass1EA) map.get(r0));
        this.A0f = r4;
    }

    public void setSpringConfig(C32471bJ r2, AnonymousClass1EA r3) {
        this.A0v.put(r2, r3);
    }

    public static void setAccessibilityImportanceForView(View view) {
        if (view.getImportantForAccessibility() == 0) {
            AnonymousClass1E1.A0V(view, 1);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(1619856179);
        super.onSizeChanged(i, i2, i3, i4);
        A05(this, true, false);
        AnonymousClass0Z0.A0D(1171587877, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r1 != 3) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r8.A0z.onTouchEvent(r9) != false) goto L_0x0025;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int A052 = AnonymousClass0Z0.A05(-1068678586);
        if (this.A0f == C32481bK.DISABLED) {
            i = 989236866;
        } else {
            boolean z2 = true;
            if (!super.onTouchEvent(motionEvent)) {
                z = false;
            }
            z = true;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        float abs = Math.abs(motionEvent.getRawX() - this.A0V);
                        float abs2 = Math.abs(motionEvent.getRawY() - this.A0W);
                        AnonymousClass1bM r0 = this.A0I;
                        AnonymousClass1bM r1 = AnonymousClass1bM.HORIZONTAL;
                        if (r0 != r1 || abs2 <= abs || abs2 <= 30.0f) {
                            A02(motionEvent);
                            if ((this.A0j && this.A0I == r1) || (this.A0k && this.A0I == AnonymousClass1bM.VERTICAL)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                if (this.A0M) {
                                    setScrollState(C32501bN.IDLE);
                                    ((AnonymousClass1EG) this.A0q.get()).A02();
                                    this.A0M = false;
                                }
                            }
                        } else {
                            i = 1566743885;
                        }
                    }
                    z2 = z;
                }
                A0E(this.A0Y);
                z2 = z;
            } else {
                z2 = this.A0H.Bra(this, motionEvent.getX(), motionEvent.getY());
            }
            AnonymousClass0Z0.A0C(-1875835739, A052);
            return z2;
        }
        AnonymousClass0Z0.A0C(i, A052);
        return false;
    }

    public void setOverScrollOnEdgeItems(boolean z) {
        setOverScrollOnStartItem(z);
        this.A0R = z;
    }

    public final void ABv(View view) {
        super.detachViewFromParent(view);
    }

    public void setBufferBias(C32491bL r1) {
        this.A0F = r1;
    }

    public void setCustomMaximumOffset(Integer num) {
        this.A0h = num;
    }

    public void setCustomMinimumOffset(Integer num) {
        this.A0i = num;
    }

    public void setDraggingController(AnonymousClass3E5 r1) {
        this.A0G = r1;
    }

    public void setHorizontalDraggingEnabled(boolean z) {
        this.A0l = z;
    }

    public void setItemAddressOptEnabled(boolean z) {
        this.A0Q = z;
    }

    public void setItemPositioner(C32521bP r1) {
        this.A0H = r1;
    }

    public void setMaximumFlingVelocity(int i) {
        this.A0a = i;
    }

    public void setMinPagingVelocity(int i) {
        this.A0b = i;
    }

    public void setOnSizeChangedListener(C30778Djs djs) {
        this.A0e = djs;
    }

    public void setOutOfBoundsDragSlipRatio(float f) {
        this.A01 = f;
    }

    public void setOverScrollOnEndItem(boolean z) {
        this.A0R = z;
    }

    public void setOverScrollOnStartItem(boolean z) {
        this.A0S = z;
    }

    public void setOverridePageSize(int i) {
        this.A0c = i;
    }

    public void setReverseLayout(boolean z) {
        this.A0m = z;
    }

    public void setScrollDirection(AnonymousClass1bM r1) {
        this.A0I = r1;
    }

    public void setUseStableIdForRecycledView(boolean z) {
        this.A0o = z;
    }

    public void setVerticalDraggingEnabled(boolean z) {
        this.A0p = z;
    }

    public void setXDraggingRange(int i) {
        this.A0B = i;
    }

    public ReboundViewPager(Context context) {
        this(context, (AttributeSet) null);
    }

    public ReboundViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public ReboundViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0x = new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER};
        this.A16 = new ArrayList();
        this.A13 = new ArrayList();
        this.A15 = new ArrayList();
        this.A17 = new HashMap();
        this.A0w = new HashMap();
        this.A0u = new HashMap();
        this.A12 = new ArrayList();
        this.A14 = new ArrayList();
        this.A0t = new CopyOnWriteArrayList();
        this.A11 = new C32451bH(this);
        this.A0r = new ArrayList();
        this.A0s = new ArrayList();
        this.A0v = new EnumMap(C32471bJ.class);
        this.A07 = -1;
        this.A08 = -1;
        this.A0O = true;
        this.A0N = false;
        this.A0l = true;
        this.A0p = true;
        this.A0c = -1;
        this.A0f = C32481bK.DISCRETE_PAGING;
        this.A0M = false;
        this.A0S = true;
        this.A0R = true;
        this.A01 = 0.25f;
        this.A0F = C32491bL.BIAS_START;
        this.A0I = AnonymousClass1bM.HORIZONTAL;
        this.A0o = false;
        this.A0m = false;
        for (C32471bJ r2 : C32471bJ.values()) {
            this.A0v.put(r2, r2.A00);
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A31);
        try {
            float dimension = obtainStyledAttributes.getDimension(0, applyDimension);
            obtainStyledAttributes.recycle();
            setPageSpacing(dimension);
            this.A0X = TypedValue.applyDimension(1, 8.0f, displayMetrics);
            this.A0B = 90;
            setScrollState(C32501bN.IDLE);
            A0G(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, true, false);
            setExtraBufferSize(1);
            GestureDetector gestureDetector = new GestureDetector(context, this, new Handler(Looper.getMainLooper()));
            this.A0z = gestureDetector;
            gestureDetector.setIsLongpressEnabled(false);
            this.A0y = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
            this.A0a = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            this.A0b = this.A0y;
            this.A0H = new C32511bO();
            Context context2 = getContext();
            Scroller scroller = new Scroller(context2);
            this.A10 = scroller;
            scroller.setFriction(0.1f);
            this.A0q = AnonymousClass8AL.A00(new C32531bQ(this));
            getContext();
            this.A0D = (AccessibilityManager) context2.getSystemService("accessibility");
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setAdapter(C44391w5 r2) {
        A0K(r2, this.A00);
    }

    public void setAdapter(Adapter adapter) {
        setAdapter((C44391w5) new C44381w4(adapter));
    }
}
