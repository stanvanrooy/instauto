package com.instagram.common.p004ui.widget.recyclerview;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.CameraVideoCapturer;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1E9;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EB;
import p000X.AnonymousClass1EC;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1EI;
import p000X.AnonymousClass1PH;
import p000X.AnonymousClass26O;
import p000X.AnonymousClass2KD;
import p000X.AnonymousClass2MW;
import p000X.AnonymousClass3AE;
import p000X.AnonymousClass7Jv;
import p000X.AnonymousClass7Jx;
import p000X.C06220Of;
import p000X.C06420Oz;
import p000X.C159426rE;
import p000X.C164436zp;
import p000X.C164446zq;
import p000X.C1662776z;
import p000X.C169017Ju;
import p000X.C169037Jy;
import p000X.C169047Jz;
import p000X.C256319p;
import p000X.C31341Xr;
import p000X.C31391Ya;

/* renamed from: com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout */
public class RefreshableRecyclerViewLayout extends FrameLayout implements AnonymousClass1E8, AnonymousClass1E9, AnonymousClass2KD {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public Scroller A09;
    public AnonymousClass3AE A0A;
    public C169047Jz A0B;
    public C164436zp A0C;
    public Object A0D;
    public Method A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public C31341Xr A0J;
    public C159426rE A0K;
    public Runnable A0L;
    public boolean A0M;
    public boolean A0N;
    public final ImageView A0O;
    public final RecyclerView A0P;
    public final AnonymousClass1EG A0Q;
    public final AnonymousClass1EG A0R;
    public final List A0S;
    public final Handler A0T;
    public final AnonymousClass1EI A0U;
    public final AnonymousClass26O A0V;
    public final Runnable A0W;
    public final Runnable A0X;

    public final void A0D(C164446zq r4) {
        int i = 0;
        while (true) {
            if (i < this.A0S.size()) {
                if (r4.equals(((AnonymousClass2MW) this.A0S.get(i)).A00)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            C1662776z r2 = new C1662776z(this, r4);
            this.A0S.add(new AnonymousClass2MW(r4, r2));
            this.A0P.A0w(r2);
        }
    }

    public final void At8(AnonymousClass1EC r1) {
    }

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOH(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        float f3;
        this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        boolean z = false;
        if (this.A06 == 0) {
            z = true;
        }
        if (!z) {
            f = f2;
        }
        if (A08()) {
            f3 = this.A02;
        } else {
            f3 = this.A01;
        }
        float abs = Math.abs(f);
        if (abs > f3) {
            f = (f / abs) * f3;
        }
        if (A08()) {
            this.A0H = true;
            A01();
            this.A0R.A03(0.0d);
            this.A0R.A04((double) (-f));
            return true;
        }
        A03(this.A00, f);
        return true;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        this.A0H = false;
        A01();
        this.A0R.A02();
        this.A0F = true;
        setItemAnimationsEnabled(false);
        return true;
    }

    /* renamed from: com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout$SavedState */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(289);
        public Parcelable A00;

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.A00, i);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.A00 = parcel.readParcelable(SavedState.class.getClassLoader());
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        if ((r4 / ((float) r8)) < com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x0029;
     */
    private int A00(int i, boolean z) {
        float f;
        boolean z2;
        C159426rE r3 = this.A0K;
        if (r3 != null) {
            f = r3.AWB(this, (float) this.A0R.A00());
        } else if (this.A03 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || !A09()) {
            f = 0.1f;
        } else {
            f = C06420Oz.A02(this.A03, 0.25f, 1.0f, 1.0f, 0.1f, true);
        }
        float min = Math.min(f, 1.0f);
        AnonymousClass1EG r32 = this.A0R;
        float A002 = (float) r32.A00();
        if (A002 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            z2 = false;
        }
        z2 = true;
        float f2 = (float) i;
        if (z2) {
            f2 *= min;
        }
        if (!z || z2 || Math.abs(A002) > ((float) Math.abs(i))) {
            r32.A05((double) (A002 - f2), true);
            return i;
        }
        r32.A05(0.0d, true);
        return Math.round(A002);
    }

    private void A01() {
        Scroller scroller = this.A09;
        if (scroller != null) {
            scroller.setFinalY(scroller.getCurrY());
            this.A09.abortAnimation();
            this.A09.forceFinished(true);
            return;
        }
        this.A0Q.A02();
    }

    private void A03(float f, float f2) {
        Scroller scroller = this.A09;
        if (scroller != null) {
            scroller.fling(0, Math.round(f), 0, Math.round(-f2), 0, 0, Process.WAIT_RESULT_STOPPED, Integer.MAX_VALUE);
            if (this.A0L == null) {
                this.A0L = new AnonymousClass7Jv(this);
            }
            postOnAnimation(this.A0L);
            return;
        }
        AnonymousClass1EG r3 = this.A0Q;
        r3.A05((double) f, true);
        r3.A04((double) (-f2));
    }

    private void A04(int i, int i2) {
        Method method;
        Object obj = this.A0D;
        if (obj != null && (method = this.A0E) != null) {
            try {
                method.invoke(obj, new Object[]{this.A0P, Integer.valueOf(i), Integer.valueOf(i2)});
            } catch (Exception e) {
                AnonymousClass0DB.A0G("RefreshableRecyclerViewLayout", "error accessing GapWorker", e);
                AnonymousClass0QD.A0A("RefreshableRecyclerView#GapWorkerAccessFailed", e);
            }
        }
    }

    public static void A05(RefreshableRecyclerViewLayout refreshableRecyclerViewLayout) {
        if (refreshableRecyclerViewLayout.A0G) {
            long currentTimeMillis = System.currentTimeMillis() - refreshableRecyclerViewLayout.A07;
            if (currentTimeMillis < 800) {
                AnonymousClass0ZA.A08(refreshableRecyclerViewLayout.A0T, refreshableRecyclerViewLayout.A0W);
                AnonymousClass0ZA.A09(refreshableRecyclerViewLayout.A0T, refreshableRecyclerViewLayout.A0W, 800 - currentTimeMillis, 638464056);
                return;
            }
            refreshableRecyclerViewLayout.A0G = false;
            refreshableRecyclerViewLayout.A0A.A03(false);
            refreshableRecyclerViewLayout.setItemAnimationsEnabled(true);
            refreshableRecyclerViewLayout.A0R.A03((double) refreshableRecyclerViewLayout.getOverScrollRestTarget());
            refreshableRecyclerViewLayout.A02();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r1 != false) goto L_0x0023;
     */
    public static void A06(RefreshableRecyclerViewLayout refreshableRecyclerViewLayout) {
        boolean z;
        C164436zp r0;
        boolean A092;
        if (refreshableRecyclerViewLayout.A0F) {
            r0 = C164436zp.DRAGGING;
        } else {
            if (refreshableRecyclerViewLayout.A0R.A09()) {
                Scroller scroller = refreshableRecyclerViewLayout.A09;
                if (scroller != null) {
                    A092 = scroller.isFinished();
                } else {
                    A092 = refreshableRecyclerViewLayout.A0Q.A09();
                }
                boolean z2 = !A092;
                z = false;
            }
            z = true;
            if (z) {
                r0 = C164436zp.COASTING;
            } else {
                refreshableRecyclerViewLayout.setScrollState(C164436zp.IDLE);
                refreshableRecyclerViewLayout.setItemAnimationsEnabled(true);
                return;
            }
        }
        refreshableRecyclerViewLayout.setScrollState(r0);
        refreshableRecyclerViewLayout.setItemAnimationsEnabled(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r1 == r0) goto L_0x001d;
     */
    private boolean A08() {
        boolean z;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A0P.A0L;
        int A1g = linearLayoutManager.A1g();
        int A1h = linearLayoutManager.A1h();
        int itemCount = this.A0P.A0J.getItemCount() - 1;
        if (A1g != 0) {
            z = false;
        }
        z = true;
        if (this.A0R.A0B(0.0d) || this.A0P.A0B == 0 || !z) {
            return false;
        }
        return true;
    }

    private boolean A09() {
        if (this.A0B == null || this.A0A == null || this.A0P.getChildCount() <= 0) {
            return false;
        }
        return true;
    }

    private float getCoastingValue() {
        Scroller scroller = this.A09;
        if (scroller != null) {
            return (float) scroller.getCurrY();
        }
        return (float) this.A0Q.A00();
    }

    private float getCoastingVelocity() {
        Scroller scroller = this.A09;
        if (scroller == null) {
            return (float) this.A0Q.A09.A01;
        }
        int i = 1;
        if (scroller.getStartY() > this.A09.getFinalY()) {
            i = -1;
        }
        return this.A09.getCurrVelocity() * ((float) i);
    }

    private float getOverScrollRestTarget() {
        if (this.A0G) {
            return getRefreshingScrollPosition();
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    private float getRefreshingScrollPosition() {
        int height;
        boolean z = false;
        if (this.A06 == 0) {
            z = true;
        }
        if (z) {
            height = this.A0O.getWidth();
        } else {
            height = this.A0O.getHeight();
        }
        return (float) (height + this.A05);
    }

    private void setItemAnimationsEnabled(boolean z) {
        C31341Xr r0;
        RecyclerView recyclerView = this.A0P;
        C31341Xr r02 = recyclerView.A0K;
        if (r02 != null) {
            this.A0J = r02;
        }
        if (z) {
            r0 = this.A0J;
        } else {
            r0 = null;
        }
        recyclerView.setItemAnimator(r0);
    }

    private void setScrollState(C164436zp r6) {
        if (r6 != this.A0C) {
            this.A08 = System.currentTimeMillis();
            this.A0C = r6;
            for (int i = 0; i < this.A0S.size(); i++) {
                C164436zp r2 = this.A0C;
                int A032 = AnonymousClass0Z0.A03(373499187);
                ((C1662776z) ((AnonymousClass2MW) this.A0S.get(i)).A01).A00.A01(r2);
                AnonymousClass0Z0.A0A(2131744890, A032);
            }
        }
    }

    public final void A0E(C164446zq r5) {
        Iterator it = this.A0S.iterator();
        while (it.hasNext()) {
            AnonymousClass2MW r2 = (AnonymousClass2MW) it.next();
            if (((C164446zq) r2.A00).equals(r5)) {
                this.A0P.A0x((C256319p) r2.A01);
                it.remove();
                return;
            }
        }
    }

    public final void BOK(AnonymousClass1EG r9) {
        AnonymousClass1EG r2 = this.A0R;
        if (r9 == r2) {
            float A002 = (float) r2.A00();
            if (this.A0H && !this.A0G && r2.A01 == ((double) getOverScrollRestTarget())) {
                AnonymousClass1EG r1 = this.A0R;
                if (r1.A0A()) {
                    this.A0H = false;
                    this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    A03(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) r1.A09.A01);
                    this.A0R.A05(0.0d, true);
                    A002 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                }
            }
            boolean z = false;
            if (this.A06 == 0) {
                z = true;
            }
            if (z) {
                if (this.A0I) {
                    this.A0P.setTranslationX(A002);
                }
            } else if (this.A0I) {
                this.A0P.setTranslationY(A002);
            }
            for (int i = 0; i < this.A0S.size(); i++) {
                ((C1662776z) ((AnonymousClass2MW) this.A0S.get(i)).A01).onScrolled(this.A0P, 0, 0);
            }
            A02();
        } else if (r9 == this.A0Q) {
            A07(this);
        }
    }

    public int getNestedScrollAxes() {
        AnonymousClass1EI r0 = this.A0U;
        return r0.A01 | r0.A00;
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        boolean z = false;
        if (this.A06 == 0) {
            z = true;
        }
        if (!z) {
            i3 = i4;
        }
        A00(i3, false);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.A0U.A01 = i;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (Build.VERSION.SDK_INT <= 22) {
            super.onRestoreInstanceState(View.BaseSavedState.EMPTY_STATE);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
        this.A0P.A0L.A1O(((SavedState) parcelable).A00);
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.A00 = this.A0P.A0L.A1D();
        return savedState;
    }

    public final void onStopNestedScroll(View view) {
        this.A0U.A01 = 0;
        this.A0F = false;
        if (this.A03 < 1.0f || !A09()) {
            A05(this);
        } else if (!this.A0G) {
            this.A07 = System.currentTimeMillis();
            setItemAnimationsEnabled(false);
            this.A0G = true;
            C169047Jz r0 = this.A0B;
            if (r0 != null) {
                r0.AtA();
            }
            this.A0A.A03(true);
            this.A0R.A03((double) getOverScrollRestTarget());
            A02();
        }
        this.A0R.A03((double) getOverScrollRestTarget());
        A02();
    }

    public void setAdapter(AnonymousClass1PH r2) {
        this.A0P.setAdapter(r2);
    }

    public void setItemAnimator(C31341Xr r2) {
        this.A0P.setItemAnimator(r2);
    }

    public void setLayoutManager(C31391Ya r3) {
        if (r3 instanceof LinearLayoutManager) {
            this.A06 = ((LinearLayoutManager) r3).A00;
            this.A0P.setLayoutManager(r3);
            return;
        }
        throw new IllegalArgumentException("layoutManager must be an instanceof LinearLayoutManager");
    }

    private void A02() {
        float f;
        float translationY;
        if (!A09()) {
            this.A0O.setVisibility(8);
        } else if (this.A0F || this.A04 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            float f2 = (float) this.A05;
            boolean z = false;
            if (this.A06 == 0) {
                z = true;
            }
            if (z) {
                int width = this.A0O.getWidth();
                if (width != this.A0A.getIntrinsicWidth()) {
                    this.A0O.setLayoutParams(new FrameLayout.LayoutParams(this.A0A.getIntrinsicWidth(), -1));
                    width = this.A0A.getIntrinsicWidth();
                }
                f = (float) (-width);
                translationY = this.A0P.getTranslationX() + f;
                this.A0O.setTranslationX(((float) this.A05) + translationY);
            } else {
                int height = this.A0O.getHeight();
                if (height != this.A0A.getIntrinsicHeight()) {
                    this.A0O.setLayoutParams(new FrameLayout.LayoutParams(-1, this.A0A.getIntrinsicHeight()));
                    height = this.A0A.getIntrinsicHeight();
                }
                f = (float) (-height);
                translationY = this.A0P.getTranslationY() + f;
                this.A0O.setTranslationY(((float) this.A05) + translationY);
            }
            float A022 = C06420Oz.A02(translationY, f, f2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, false);
            this.A04 = C06420Oz.A00(A022, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
            this.A03 = A022;
            ImageView imageView = this.A0O;
            int i = 4;
            if (A022 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                i = 0;
            }
            imageView.setVisibility(i);
            C169047Jz r1 = this.A0B;
            if (r1 != null) {
                r1.BHx(this.A04);
            }
            this.A0A.A01(this.A04);
        }
    }

    public static void A07(RefreshableRecyclerViewLayout refreshableRecyclerViewLayout) {
        boolean A092;
        float coastingValue = refreshableRecyclerViewLayout.getCoastingValue();
        int round = Math.round(refreshableRecyclerViewLayout.A00 - coastingValue);
        boolean z = false;
        if (refreshableRecyclerViewLayout.A06 == 0) {
            z = true;
        }
        if (!z || !refreshableRecyclerViewLayout.A0P.canScrollHorizontally(round)) {
            boolean z2 = false;
            if (refreshableRecyclerViewLayout.A06 == 0) {
                z2 = true;
            }
            if (z2 || !refreshableRecyclerViewLayout.A0P.canScrollVertically(round)) {
                Scroller scroller = refreshableRecyclerViewLayout.A09;
                if (scroller != null) {
                    A092 = scroller.isFinished();
                } else {
                    A092 = refreshableRecyclerViewLayout.A0Q.A09();
                }
                if (!A092) {
                    float coastingVelocity = refreshableRecyclerViewLayout.getCoastingVelocity();
                    refreshableRecyclerViewLayout.A01();
                    AnonymousClass1EG r2 = refreshableRecyclerViewLayout.A0R;
                    r2.A04((double) coastingVelocity);
                    r2.A03((double) refreshableRecyclerViewLayout.getOverScrollRestTarget());
                }
            } else {
                refreshableRecyclerViewLayout.A0P.scrollBy(0, round);
                refreshableRecyclerViewLayout.A04(0, round);
            }
        } else {
            refreshableRecyclerViewLayout.A0P.scrollBy(round, 0);
            refreshableRecyclerViewLayout.A04(round, 0);
        }
        refreshableRecyclerViewLayout.A00 = coastingValue;
    }

    private float getRefreshProgress() {
        return this.A04;
    }

    public final void A0A() {
        A05(this);
        this.A0A.A00();
        this.A0R.A03((double) getOverScrollRestTarget());
        setItemAnimationsEnabled(true);
    }

    public final void A0B(int i, int i2) {
        A01();
        this.A0R.A05(0.0d, true);
        if (i2 != -1) {
            ((LinearLayoutManager) this.A0P.A0L).A1v(i, i2);
        } else {
            this.A0P.A0g(i);
        }
    }

    public final void A0C(int i, int i2) {
        A01();
        this.A0R.A05(0.0d, true);
        if (i2 != -1) {
            AnonymousClass26O r0 = this.A0V;
            r0.A00 = i2;
            r0.A00 = i;
            ((LinearLayoutManager) this.A0P.A0L).A0t(r0);
            return;
        }
        this.A0P.A0h(i);
    }

    public RecyclerView getRecyclerView() {
        return this.A0P;
    }

    public C164436zp getScrollState() {
        return this.A0C;
    }

    public final void onAttachedToWindow() {
        int i;
        int A062 = AnonymousClass0Z0.A06(1046087597);
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT < 21) {
            i = 1216161592;
        } else {
            post(new C169017Ju(this));
            i = 2033705808;
        }
        AnonymousClass0Z0.A0D(i, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-620280144);
        super.onDetachedFromWindow();
        this.A0Q.A02();
        this.A0R.A02();
        AnonymousClass0Z0.A0D(1229215183, A062);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            this.A0F = false;
            post(this.A0X);
        }
        return false;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A02();
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3;
        if (A08()) {
            boolean z = false;
            if (this.A06 == 0) {
                z = true;
            }
            if (!z) {
                i = i2;
            }
            i3 = A00(i, true);
        } else {
            i3 = 0;
        }
        if (i3 > 0) {
            requestDisallowInterceptTouchEvent(true);
        }
        if (iArr != null) {
            boolean z2 = false;
            if (this.A06 == 0) {
                z2 = true;
            }
            int i4 = 0;
            if (z2) {
                i4 = i3;
            }
            iArr[0] = i4;
            if (z2) {
                i3 = 0;
            }
            iArr[1] = i3;
        }
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setClipChildren(boolean z) {
        super.setClipChildren(z);
        this.A0M = z;
        RecyclerView recyclerView = this.A0P;
        if (recyclerView != null) {
            recyclerView.setClipChildren(z);
        }
    }

    public void setClipToPadding(boolean z) {
        super.setClipToPadding(z);
        this.A0N = z;
        RecyclerView recyclerView = this.A0P;
        if (recyclerView != null) {
            recyclerView.setClipToPadding(z);
        }
    }

    public final void ArN(AnonymousClass1EC r1) {
        A06(this);
    }

    public void setOverScrollDelegate(C159426rE r1) {
        this.A0K = r1;
    }

    public void setRefreshDelegate(C169047Jz r1) {
        this.A0B = r1;
    }

    public void setTranslateOverscroll(boolean z) {
        this.A0I = z;
    }

    public RefreshableRecyclerViewLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public RefreshableRecyclerViewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RefreshableRecyclerViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0T = new Handler();
        this.A0W = new AnonymousClass7Jx(this);
        this.A0X = new C169037Jy(this);
        this.A0S = new ArrayList();
        this.A0C = C164436zp.IDLE;
        this.A0I = true;
        setClipChildren(false);
        setClipToPadding(false);
        this.A0U = new AnonymousClass1EI();
        this.A0V = new AnonymousClass26O(context);
        AnonymousClass1EB A002 = AnonymousClass0P2.A00();
        AnonymousClass1EG A003 = A002.A00();
        A003.A06(AnonymousClass1EA.A01(25.0d, 9.5d));
        A003.A00 = 0.5d;
        A003.A02 = 50.0d;
        A003.A07(this);
        this.A0R = A003;
        AnonymousClass1EG A004 = A002.A00();
        A004.A06(AnonymousClass1EA.A01(0.0d, 0.3499999940395355d));
        A004.A00 = 0.5d;
        A004.A02 = 50.0d;
        A004.A07(this);
        this.A0Q = A004;
        A002.A01(this);
        this.A02 = C06220Of.A03(context, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
        this.A01 = C06220Of.A03(context, CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS);
        RecyclerView recyclerView = new RecyclerView(context);
        this.A0P = recyclerView;
        recyclerView.setClipChildren(this.A0M);
        this.A0P.setClipToPadding(this.A0N);
        addView(this.A0P);
        ImageView imageView = new ImageView(context);
        this.A0O = imageView;
        imageView.setVisibility(8);
        addView(this.A0O);
        A02();
    }
}
