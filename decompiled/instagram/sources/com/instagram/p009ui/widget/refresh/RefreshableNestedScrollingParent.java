package com.instagram.p009ui.widget.refresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1E9;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1EI;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass1SD;
import p000X.C27611In;
import p000X.C31231Xb;
import p000X.C31241Xc;
import p000X.C31251Xd;
import p000X.C32861by;
import p000X.C32891c1;

/* renamed from: com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent */
public class RefreshableNestedScrollingParent extends FrameLayout implements AnonymousClass1E8, AnonymousClass1E9, AnonymousClass1SD {
    public C27611In A00;
    public boolean A01;
    public int A02;
    public int A03;
    public int A04;
    public View A05;
    public C32861by A06;
    public C32891c1 A07;
    public C31251Xd A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final float A0C;
    public final int A0D;
    public final C31231Xb A0E;
    public final AnonymousClass1EI A0F;
    public final AnonymousClass1EG A0G;

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOH(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public static void A00(RefreshableNestedScrollingParent refreshableNestedScrollingParent, boolean z, boolean z2) {
        float f;
        View view;
        if (!refreshableNestedScrollingParent.A0B) {
            if (refreshableNestedScrollingParent.A01 != z) {
                refreshableNestedScrollingParent.A01 = z;
                C31251Xd r0 = refreshableNestedScrollingParent.A08;
                if (r0 != null) {
                    r0.BiF(z);
                }
            }
            if (z2) {
                if (z) {
                    f = (float) refreshableNestedScrollingParent.A0D;
                } else {
                    f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                }
                AnonymousClass1EG r3 = refreshableNestedScrollingParent.A0G;
                float A002 = (float) r3.A00();
                r3.A03((double) f);
                if (A002 != f && (view = refreshableNestedScrollingParent.A05) != null && (view instanceof AnonymousClass1SD) && !z) {
                    ((AnonymousClass1SD) view).stopNestedScroll();
                }
            }
        }
    }

    private void A01(boolean z) {
        C32861by r0 = this.A06;
        if (r0 == null) {
            return;
        }
        if (z) {
            r0.AD3();
        } else {
            r0.AC3();
        }
    }

    public final boolean A02() {
        if (this.A0G.A00() > ((double) this.A0D)) {
            return true;
        }
        return false;
    }

    public final void BOK(AnonymousClass1EG r6) {
        View view = this.A05;
        if (view != null) {
            float A002 = (float) r6.A00();
            float f = -A002;
            if (this.A04 == 0) {
                f = A002;
            }
            if (!this.A0B) {
                view.setTranslationY(f);
                invalidate(0, 0, getWidth(), (int) A002);
            }
            if (A002 >= ((float) this.A0D) && !this.A01 && this.A07 != null && this.A0A && !this.A0B) {
                A00(this, true, false);
                this.A07.BHw();
            }
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this.A05 != null) {
            canvas.save();
            if (!this.A0B) {
                canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A03);
                C31251Xd r4 = this.A08;
                if (r4 != null) {
                    View view = this.A05;
                    int i = this.A0D;
                    r4.Bbh(this, view, canvas2, i, (float) (this.A0G.A00() / ((double) i)), this.A0A);
                }
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A0E.A05(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.A0E.A04(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A0E.A08(i, i2, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.A0E.A07(i, i2, i3, i4, iArr);
    }

    public int getNestedScrollAxes() {
        AnonymousClass1EI r0 = this.A0F;
        return r0.A01 | r0.A00;
    }

    public final boolean hasNestedScrollingParent() {
        if (C31231Xb.A00(this.A0E, 0) != null) {
            return true;
        }
        return false;
    }

    public final boolean isNestedScrollingEnabled() {
        return this.A0E.A02;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (this.A09) {
            iArr[0] = 0;
            iArr[1] = 0;
            A01(true);
            return;
        }
        AnonymousClass1EG r5 = this.A0G;
        float A002 = (float) r5.A00();
        int i3 = -i2;
        if (this.A04 == 0) {
            i3 = i2;
        }
        if (A002 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || i3 <= 0) {
            A01(false);
        } else {
            float max = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A002 - ((float) i3));
            r5.A05((double) max, true);
            int i4 = (int) (A002 - max);
            if (this.A04 != 0) {
                i4 = -i4;
            }
            iArr[1] = i4;
            A01(true);
        }
        dispatchNestedPreScroll(i, i2, iArr, (int[]) null);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (!this.A09) {
            AnonymousClass1EG r5 = this.A0G;
            float A002 = (float) r5.A00();
            int i5 = -i4;
            if (this.A04 == 0) {
                i5 = i4;
            }
            float f = (float) i5;
            float f2 = A002 - f;
            float f3 = ((float) this.A0D) * this.A0C;
            if (f2 > f3) {
                f2 = A002 + (A002 - ((float) Math.sqrt((double) Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (f * f3) + (A002 * A002)))));
            }
            float max = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f2);
            r5.A05((double) max, true);
            int i6 = (int) (max - A002);
            if (this.A04 != 0) {
                i6 = -i6;
            }
            int i7 = i;
            dispatchNestedScroll(i7, i6, i3, i4 - i6, (int[]) null);
            C27611In r1 = this.A00;
            if (r1 != null) {
                r1.BYa(max / ((float) this.A0D));
            }
        }
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        if (!this.A0B) {
            this.A02 = (int) this.A0G.A00();
        }
        this.A05 = view2;
        this.A0F.A01 = i;
        startNestedScroll(2);
        this.A0A = true;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || !isEnabled()) {
            return false;
        }
        return true;
    }

    public final void onStopNestedScroll(View view) {
        AnonymousClass1EG r3 = this.A0G;
        if (((double) this.A02) != r3.A00() && r3.A09()) {
            if (!this.A0B) {
                setRefreshing(A02());
            } else {
                A01(true);
            }
        }
        this.A0F.A01 = 0;
        stopNestedScroll();
        this.A0A = false;
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.A0E.A03(z);
    }

    public void setPTRSpinnerListener(C32861by r2) {
        this.A06 = r2;
        this.A0B = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r6.A0G.A00() != 0.0d) goto L_0x0013;
     */
    public void setRefreshing(boolean z) {
        boolean z2;
        if (!this.A0B) {
            if (z) {
                z2 = false;
            }
            z2 = true;
            A00(this, z, z2);
        }
    }

    public final boolean startNestedScroll(int i) {
        return this.A0E.A06(i, 0);
    }

    public final void stopNestedScroll() {
        this.A0E.A02(0);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(-607004218);
        super.onAttachedToWindow();
        this.A0G.A07(this);
        AnonymousClass0Z0.A0D(-966360282, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-749896235);
        super.onDetachedFromWindow();
        this.A0G.A08(this);
        C31251Xd r1 = this.A08;
        if (r1 != null && !this.A0B) {
            r1.Azl(this);
        }
        AnonymousClass0Z0.A0D(1851313911, A062);
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void setForceDisableNestedScrolling(boolean z) {
        this.A09 = z;
    }

    public void setListener(C32891c1 r1) {
        this.A07 = r1;
    }

    public void setPullDownProgressDelegate(C27611In r1) {
        this.A00 = r1;
    }

    public void setRefreshDrawableVerticalOffset(int i) {
        this.A03 = i;
    }

    public void setRenderer(C31251Xd r1) {
        this.A08 = r1;
    }

    public void setScrollDirection(int i) {
        this.A04 = i;
    }

    public RefreshableNestedScrollingParent(Context context) {
        this(context, (AttributeSet) null);
    }

    public RefreshableNestedScrollingParent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RefreshableNestedScrollingParent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = 0;
        this.A0F = new AnonymousClass1EI();
        this.A0E = new C31231Xb(this);
        AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
        A002.A06 = true;
        this.A0G = A002;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A36, 0, 0);
        try {
            this.A04 = obtainStyledAttributes.getInt(2, 0);
            this.A0D = obtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(C0003R.dimen.refreshable_drawable_size));
            this.A0C = obtainStyledAttributes.getFloat(0, 1.4f);
            setRenderer(new C31241Xc(this, obtainStyledAttributes.getBoolean(3, true)));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
