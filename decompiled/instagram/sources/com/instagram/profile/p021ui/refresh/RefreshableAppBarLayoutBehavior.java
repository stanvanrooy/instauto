package com.instagram.profile.p021ui.refresh;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1XN;
import p000X.AnonymousClass3AJ;
import p000X.AnonymousClass3AK;
import p000X.AnonymousClass3AZ;
import p000X.C44611wS;
import p000X.C63542pe;
import p000X.C710538t;

/* renamed from: com.instagram.profile.ui.refresh.RefreshableAppBarLayoutBehavior */
public class RefreshableAppBarLayoutBehavior extends AppBarLayout.Behavior implements C44611wS, AnonymousClass1E8, C710538t {
    public float A00;
    public float A01;
    public float A02;
    public AnonymousClass1XN A03;
    public Integer A04 = Constants.ONE;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public int A09;
    public View A0A;
    public boolean A0B;
    public final AnonymousClass3AK A0C;
    public final List A0D = new ArrayList();
    public final List A0E = new ArrayList();
    public final List A0F = new ArrayList();
    public final AnonymousClass1EG A0G;

    public final void A0a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            this.A07 = true;
        }
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.A0a(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
    }

    public final boolean A0c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        this.A0B = false;
        return super.A0c(coordinatorLayout, appBarLayout, view, view2, i, i2) || this.A06;
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageSelected(int i) {
    }

    private void A00() {
        float min = Math.min(1.0f, ((float) this.A09) / this.A02);
        for (C63542pe BLK : this.A0D) {
            BLK.BLK(min, this.A09);
        }
    }

    public static void A02(RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior) {
        double d;
        if (refreshableAppBarLayoutBehavior.A09 > 0) {
            refreshableAppBarLayoutBehavior.A05 = true;
            refreshableAppBarLayoutBehavior.A0G.A07(refreshableAppBarLayoutBehavior);
            AnonymousClass1EG r4 = refreshableAppBarLayoutBehavior.A0G;
            r4.A06(AnonymousClass1EA.A01(70.0d, 11.0d));
            r4.A02 = 1.0d;
            r4.A00 = 0.5d;
            if (refreshableAppBarLayoutBehavior.A04 == Constants.ZERO) {
                d = (double) refreshableAppBarLayoutBehavior.A02;
            } else {
                d = 0.0d;
            }
            r4.A03(d);
        }
    }

    public final /* bridge */ /* synthetic */ boolean A0H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        if (this.A07) {
            this.A08 = true;
        }
        return super.A0H(coordinatorLayout, appBarLayout, motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r1 != 3) goto L_0x0012;
     */
    public final /* bridge */ /* synthetic */ boolean A0I(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float rawY = motionEvent.getRawY();
                    float f = this.A01;
                    if (f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        this.A01 = rawY;
                    } else if (rawY > f && this.A06) {
                        float f2 = rawY - f;
                        if (!this.A05) {
                            A01((int) f2);
                        }
                        this.A01 = rawY;
                        return true;
                    }
                }
            }
            A02(this);
            this.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        return super.A0I(coordinatorLayout, appBarLayout, motionEvent);
    }

    public final /* bridge */ /* synthetic */ boolean A0M(CoordinatorLayout coordinatorLayout, View view, int i) {
        return A0M(coordinatorLayout, (AppBarLayout) view, i);
    }

    public final void A0Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
        if (!this.A08 && !this.A05) {
            this.A0B = true;
            if (!this.A06 || i2 != 0 || i4 >= 0 || i5 != 0) {
                super.A0Z(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
            } else {
                A01(i4);
            }
        }
    }

    public final void BDD(AppBarLayout appBarLayout, int i) {
        if (i == 0) {
            this.A03.AD3();
        } else {
            this.A03.AC3();
        }
        boolean z = true;
        if (AnonymousClass3AZ.A00(appBarLayout, i) != 1) {
            z = false;
        }
        this.A06 = z;
    }

    public final void BOF(AnonymousClass1EG r3) {
        if (this.A04 == Constants.ZERO) {
            this.A03.setIsLoading(true);
            for (C63542pe BHw : this.A0D) {
                BHw.BHw();
            }
        }
    }

    public final void BOH(AnonymousClass1EG r4) {
        this.A09 = (int) r4.A01;
        this.A05 = false;
        A00();
    }

    public final void BOK(AnonymousClass1EG r5) {
        this.A0A.setTranslationY((float) ((int) r5.A00()));
        int A002 = (int) r5.A00();
        for (View translationY : this.A0E) {
            translationY.setTranslationY((float) A002);
        }
    }

    public RefreshableAppBarLayoutBehavior(View view, AnonymousClass3AJ r4) {
        AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
        A002.A06 = true;
        this.A0G = A002;
        this.A0C = new AnonymousClass3AK(this, r4, view);
    }

    private void A01(int i) {
        int abs = Math.abs(i);
        int i2 = this.A09;
        if (((float) i2) < this.A00) {
            this.A09 = i2 + abs;
        }
        this.A0A.setTranslationY((float) this.A09);
        int i3 = this.A09;
        for (View translationY : this.A0E) {
            translationY.setTranslationY((float) i3);
        }
        this.A0G.A05((double) this.A09, true);
        A00();
        if (((float) this.A09) >= this.A02) {
            this.A04 = Constants.ZERO;
            this.A03.setIsLoading(true);
        }
        if (((float) this.A09) >= this.A00) {
            A02(this);
        }
    }

    public final boolean A0Q(int i) {
        return super.A0Q(i);
    }

    public final void A0Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        A02(this);
        this.A07 = false;
        this.A08 = false;
        if (this.A0B) {
            this.A0B = false;
        }
        super.A0Y(coordinatorLayout, appBarLayout, view, i);
    }

    public final boolean A0b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
        appBarLayout.A01(this);
        this.A0A = appBarLayout;
        this.A0C.A00 = appBarLayout;
        return super.A0M(coordinatorLayout, appBarLayout, i);
    }

    public final boolean A0d(int i) {
        return super.A0Q(i);
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }
}
