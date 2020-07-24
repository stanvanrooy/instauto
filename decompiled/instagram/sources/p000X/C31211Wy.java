package p000X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.1Wy  reason: invalid class name and case insensitive filesystem */
public final class C31211Wy extends C31221Wz implements AnonymousClass1E8 {
    public float A00;
    public int A01 = -1;
    public View.OnClickListener A02;
    public AnonymousClass1AM A03;
    public TouchInterceptorFrameLayout A04;
    public AnonymousClass8DT A05;
    public C60972ku A06;
    public AnonymousClass2MC A07;
    public C190468Ca A08 = null;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public AnonymousClass1HD A0D;
    public boolean A0E = true;
    public boolean A0F;
    public boolean A0G;
    public final Activity A0H;
    public final View A0I;
    public final AnonymousClass1EG A0J;
    public final C06590Pq A0K;
    public final TouchInterceptorFrameLayout A0L;
    public final Map A0M = new WeakHashMap();
    public final Set A0N = new HashSet();
    public final AnonymousClass1X1 A0O;

    public final void A0C() {
        this.A0B = true;
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    private void A00() {
        this.A04.Adn(new AnonymousClass8CU(this));
        this.A0L.Adn((View.OnTouchListener) null);
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01("IgBottomSheetNavigator::restoreSiblingsImportantForAccessibilityValues", -1708981716);
        }
        try {
            for (View view : this.A0M.keySet()) {
                view.setImportantForAccessibility(((Integer) this.A0M.get(view)).intValue());
            }
            this.A0M.clear();
            AnonymousClass8DT r2 = this.A05;
            if (r2 != null) {
                r2.A0D.A0D.clear();
                r2.A05.BbF(r2);
                r2.A05.BP6();
                r2.A0E.AtV();
                View AXo = r2.A0E.AXo();
                if (AXo instanceof ViewGroup) {
                    AXo.setVisibility(4);
                    ((ViewGroup) AXo).removeAllViews();
                }
                C190468Ca r0 = r2.A0F;
                if (r0 != null) {
                    r0.AtZ();
                }
                r2.A04 = 1;
                this.A05 = null;
            }
            AnonymousClass0ZA.A0E(new Handler(Looper.getMainLooper()), new AnonymousClass8CV(this), -1228881543);
        } finally {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(1107429783);
            }
        }
    }

    public static void A01(C31211Wy r6, AnonymousClass1HD r7) {
        String str;
        if (!r6.A09) {
            AnonymousClass1HD r5 = r6.A0D;
            if (r5 != null && (r5 instanceof AnonymousClass0RN)) {
                AnonymousClass0RN r52 = (AnonymousClass0RN) r5;
                AnonymousClass1AM r4 = r6.A03;
                C06590Pq r2 = r6.A0K;
                if (C61012ky.A00(Constants.ONE, r2, r6.A0B)) {
                    C26441Dh.A00(r2).A08(r52, r4.A0I(), (String) null, new AnonymousClass48D());
                }
            }
            r6.A0D = null;
            r6.A0A = true;
            AnonymousClass2MC r0 = r6.A07;
            if (r0 != null) {
                r0.B0E();
            }
            ((AnonymousClass1HH) r7).unregisterLifecycleListener(r6.A0O);
            if (r6.A0G && r7.getActivity() != null) {
                r7.requireActivity().finish();
            }
            C60972ku r1 = r6.A06;
            if (r1 == null || !r1.A02) {
                if (r1 == null) {
                    StringBuilder sb = new StringBuilder("mShowing: ");
                    sb.append(r6.A0C);
                    sb.append(", mBottomSheetContainer: ");
                    if (r6.A0L.getVisibility() == 0) {
                        str = "visible";
                    } else {
                        str = "invisible";
                    }
                    sb.append(str);
                    AnonymousClass0QD.A01("BottomSheetNavigator", sb.toString());
                }
                r6.A00();
                return;
            }
            r6.A09 = true;
            r6.A0J.A03(0.0d);
            AnonymousClass1EG r3 = r6.A0J;
            if (r3.A00() == 0.0d) {
                r6.BOH(r3);
            }
            AnonymousClass8DT r02 = r6.A05;
            if (r02 != null) {
                r02.A0D.A03((double) AnonymousClass8DT.A02(r02));
            }
        }
    }

    public final int A03() {
        return this.A04.getHeight();
    }

    public final AnonymousClass1HD A04() {
        return this.A03.A0L(C0003R.C0005id.layout_container_bottom_sheet);
    }

    public final C31221Wz A06(AnonymousClass2MC r3) {
        if (r3 == null && !this.A0C && !this.A0A) {
            Log.w("BottomSheetNavigator", "You don't have to null out the Listener manually");
        }
        this.A07 = r3;
        return this;
    }

    public final C31221Wz A07(C38691lg r2) {
        this.A0N.add(r2);
        return this;
    }

    public final C31221Wz A08(C38691lg r2) {
        if (this.A0N.contains(r2)) {
            this.A0N.remove(r2);
        }
        return this;
    }

    public final void A09() {
        AnonymousClass8DT r1 = this.A05;
        if (r1 != null) {
            r1.A04 = 3;
            r1.A0D.A03((double) AnonymousClass8DT.A01(r1));
        }
    }

    public final void A0A() {
        AnonymousClass8DT r5 = this.A05;
        if (r5 != null) {
            float A002 = (float) r5.A0D.A00();
            float A003 = (float) C27181Gu.A00((double) A002, (double) AnonymousClass8DT.A00(r5), (double) AnonymousClass8DT.A01(r5));
            if (A002 != A003) {
                r5.A0D.A03((double) A003);
            }
        }
    }

    public final void A0D() {
        AnonymousClass8DT r1 = this.A05;
        if (r1 != null) {
            r1.A04 = 2;
            r1.A0D.A03((double) AnonymousClass8DT.A00(r1));
        }
    }

    public final void A0H(AnonymousClass1HD r10, int i, boolean z, C06270Ok r13) {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout;
        if (!this.A0C) {
            AnonymousClass1AM r1 = this.A03;
            if (!AnonymousClass1H4.A00(r1) && AnonymousClass1H4.A01(r1)) {
                Bundle bundle = r10.mArguments;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                if (bundle.getString("IgSessionManager.SESSION_TOKEN_KEY") == null) {
                    C05230Is.A00(this.A0K, bundle);
                }
                if (r13 != null) {
                    bundle.putSerializable("BottomSheetNavigator.ARG_EXTRA_BUNDLE", AnonymousClass0RA.A04(r13));
                }
                r10.setArguments(bundle);
                if (r10.getTargetFragment() != null) {
                    AnonymousClass0QD.A02(getClass().getSimpleName(), "Currently we don't support setTargetFragment(T38697510), instead use BottomSheetResultHandler.");
                }
                this.A0C = true;
                if (this.A06 == null) {
                    this.A06 = new C60972ku(true, true, z);
                    if (i == -1) {
                        i = C0003R.color.bottomsheet_background_dimmer_color;
                    }
                }
                if (this.A0E) {
                    C60982kv r12 = new C60982kv(this);
                    this.A02 = r12;
                    this.A0I.setOnClickListener(r12);
                }
                ViewGroup.LayoutParams layoutParams = this.A0L.getLayoutParams();
                int i2 = layoutParams.height;
                if (r10 instanceof C60962kt) {
                    C60962kt r7 = (C60962kt) r10;
                    if (r7.AdY() <= r7.Aol()) {
                        this.A05 = new AnonymousClass8DT(this.A0L, r7, new AnonymousClass8DW(this, r10, r7), this.A08);
                        layoutParams.height = r7.AIh();
                    } else {
                        throw new IllegalArgumentException("Initial opening ratio cannot be greater than maximum opening ratio.");
                    }
                } else {
                    layoutParams.height = -2;
                    this.A05 = null;
                }
                if (i2 != layoutParams.height) {
                    this.A0L.setLayoutParams(layoutParams);
                }
                if (this.A0F) {
                    touchInterceptorFrameLayout = this.A0L;
                } else {
                    touchInterceptorFrameLayout = this.A04;
                }
                touchInterceptorFrameLayout.A00(new C60992kw(this, touchInterceptorFrameLayout), new C61002kx(this));
                if (((Boolean) AnonymousClass0L6.A00(this.A0K, AnonymousClass0L7.BOTTOM_SHEETS_TALKBACK_MODAL, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A01("IgBottomSheetNavigator::markSiblingsNotImportantForAccessibility", -601401998);
                    }
                    try {
                        ViewParent parent = this.A04.getParent();
                        if (parent instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) parent;
                            int childCount = viewGroup.getChildCount();
                            for (int i3 = 0; i3 < childCount; i3++) {
                                View childAt = viewGroup.getChildAt(i3);
                                if (childAt != this.A04) {
                                    this.A0M.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                                    childAt.setImportantForAccessibility(4);
                                }
                            }
                        }
                    } finally {
                        if (C06530Pk.A00) {
                            AnonymousClass0ZB.A00(-463870230);
                        }
                    }
                }
                this.A0J.A07(this);
                ((AnonymousClass1HH) r10).registerLifecycleListener(this.A0O);
                this.A01 = AnonymousClass1X4.A00(this.A0H);
                if (AnonymousClass1X0.A00(this.A0K).booleanValue()) {
                    this.A04.setVisibility(0);
                }
                Activity activity = this.A0H;
                C06590Pq r2 = this.A0K;
                if (C61012ky.A00(Constants.ZERO, r2, this.A0B)) {
                    C26441Dh.A00(r2).A04(activity, (String) null, new C61022kz());
                }
                this.A0D = r10;
                AnonymousClass1H6 A0Q = this.A03.A0Q();
                A0Q.A04(C0003R.C0005id.layout_container_bottom_sheet, r10, "BottomSheetConstants.FRAGMENT_TAG");
                A0Q.A08("BottomSheetConstants.FRAGMENT_TAG");
                A0Q.A09();
                this.A03.A0U();
                if (i != -1) {
                    Activity activity2 = this.A0H;
                    AnonymousClass1X4.A02(activity2, C019000b.A00(activity2, i));
                }
            }
        }
    }

    public final void A0I(AnonymousClass1HD r5, AnonymousClass1AM r6, Integer num) {
        if (r5 instanceof AnonymousClass0RN) {
            AnonymousClass0RN r52 = (AnonymousClass0RN) r5;
            C06590Pq r1 = this.A0K;
            if (C61012ky.A00(num, r1, this.A0B)) {
                C26441Dh.A00(r1).A08(r52, r6.A0I(), (String) null, new AnonymousClass48D());
            }
        }
    }

    public final void A0J(AnonymousClass1HD r1, C190468Ca r2) {
        this.A08 = r2;
        A0F(r1);
    }

    public final void A0K(boolean z) {
        AnonymousClass8DT r4 = this.A05;
        if (r4 != null && AnonymousClass8DT.A04(r4)) {
            AnonymousClass1EG r3 = r4.A0D;
            r3.A05(r3.A00(), true);
            if (z) {
                float A012 = AnonymousClass8DT.A01(r4);
                r4.A0D.A03((double) A012);
                int i = 2;
                if (A012 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    i = 3;
                }
                r4.A04 = i;
            }
        }
    }

    public final boolean A0P() {
        return this.A0A;
    }

    public final boolean A0Q() {
        return this.A0C;
    }

    public final void BOF(AnonymousClass1EG r6) {
        if (r6.A01 == 1.0d) {
            if (!AnonymousClass1X0.A00(this.A0K).booleanValue()) {
                this.A0L.setVisibility(0);
                this.A0I.setVisibility(0);
            }
            this.A0I.setClickable(this.A0E);
            this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            return;
        }
        this.A00 = this.A0L.getTranslationY();
    }

    public final void BOH(AnonymousClass1EG r6) {
        if (r6.A01 == 0.0d) {
            if (A0P()) {
                Activity activity = (Activity) this.A0L.getContext();
                int i = this.A01;
                if (i != -1) {
                    AnonymousClass1X4.A02(activity, i);
                    this.A01 = -1;
                }
            }
            A00();
        }
    }

    public C31211Wy(Activity activity, C06590Pq r8, AnonymousClass1AM r9) {
        this.A0H = activity;
        this.A0K = r8;
        this.A03 = r9;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) activity.findViewById(C0003R.C0005id.bottom_sheet_container);
        this.A04 = touchInterceptorFrameLayout;
        if (touchInterceptorFrameLayout == null) {
            this.A04 = (TouchInterceptorFrameLayout) ((ViewStub) activity.findViewById(C0003R.C0005id.bottom_sheet_container_stub)).inflate();
        }
        View findViewById = this.A04.findViewById(C0003R.C0005id.background_dimmer);
        this.A0I = findViewById;
        findViewById.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A0L = (TouchInterceptorFrameLayout) this.A04.findViewById(C0003R.C0005id.layout_container_bottom_sheet);
        if (AnonymousClass1X0.A00(this.A0K).booleanValue()) {
            this.A04.setVisibility(8);
            this.A0L.setVisibility(0);
        } else {
            this.A0I.setVisibility(8);
        }
        AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
        A002.A05(0.0d, true);
        A002.A06(AnonymousClass1EA.A01(40.0d, 7.0d));
        A002.A06 = true;
        this.A0J = A002;
        AnonymousClass1X1 r0 = new AnonymousClass1X1();
        this.A0O = r0;
        r0.A00.add(new AnonymousClass1X2(this));
        C26441Dh.A00(r8).A09.add("bottom_sheet_component");
    }

    public final void A0B() {
        AnonymousClass1HD A042 = A04();
        if (A042 != null) {
            A01(this, A042);
        }
    }

    public final boolean A0O() {
        AnonymousClass1HD A042 = A04();
        boolean z = false;
        if (A042 == null) {
            return false;
        }
        if ((A042 instanceof AnonymousClass1HK) && ((AnonymousClass1HK) A042).onBackPressed()) {
            z = true;
        }
        if (!z) {
            A01(this, A042);
        }
        return true;
    }

    public final void BOK(AnonymousClass1EG r9) {
        float A002 = (float) r9.A00();
        if (this.A06.A00) {
            double d = r9.A01;
            if (d == 0.0d || d == 1.0d) {
                this.A0I.setAlpha(A002);
            }
        }
        double d2 = r9.A01;
        if ((d2 == 0.0d && this.A06.A02) || (d2 == 1.0d && this.A06.A01)) {
            float height = (float) this.A0L.getHeight();
            float f = this.A00;
            float f2 = ((1.0f - A002) * (height - f)) + f;
            this.A0L.setTranslationY(f2);
            for (C38691lg BEj : this.A0N) {
                BEj.BEj((int) f2, 0);
            }
        }
    }

    public final C31221Wz A05(C60972ku r1) {
        this.A06 = r1;
        return this;
    }

    public final void A0E(int i) {
        this.A01 = i;
    }

    public final void A0G(AnonymousClass1HD r1) {
        this.A0D = r1;
    }

    public final void A0L(boolean z) {
        this.A0E = z;
    }

    public final void A0M(boolean z) {
        this.A0F = z;
    }

    public final void A0N(boolean z) {
        this.A0G = z;
    }
}
