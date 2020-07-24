package com.instagram.notifications.badging.p007ui.component;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.p009ui.widget.proxy.ProxyFrameLayout;
import java.util.Map;
import p000X.AnonymousClass100;
import p000X.AnonymousClass108;
import p000X.AnonymousClass10J;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass1G3;
import p000X.AnonymousClass1G4;
import p000X.AnonymousClass751;
import p000X.AnonymousClass752;
import p000X.AnonymousClass753;
import p000X.AnonymousClass754;
import p000X.AnonymousClass755;
import p000X.AnonymousClass756;
import p000X.AnonymousClass757;
import p000X.AnonymousClass758;
import p000X.AnonymousClass79W;
import p000X.AnonymousClass7BR;
import p000X.AnonymousClass872;
import p000X.BE1;
import p000X.C13150hy;
import p000X.C137125t6;
import p000X.C167517Dg;
import p000X.C183227s6;
import p000X.C18750sM;
import p000X.C234910p;
import p000X.C235110r;
import p000X.C25313BDk;
import p000X.C25314BDm;
import p000X.C29041Oj;
import p000X.C51712Lv;
import p000X.C56142c0;
import p000X.C56162c2;
import p000X.C56172c3;
import p000X.C56202c6;
import p000X.C58342fm;
import p000X.C97794Kl;

/* renamed from: com.instagram.notifications.badging.ui.component.ToastingBadge */
public final class ToastingBadge extends ProxyFrameLayout {
    public int A00;
    public AnonymousClass1G3 A01;
    public AnonymousClass1G3 A02;
    public AnonymousClass1G3 A03;
    public AnonymousClass108 A04;
    public C97794Kl A05;
    public C56202c6 A06;
    public final AnonymousClass1G4 A07;
    public final C235110r A08;
    public final boolean A09;
    public final TypedArray A0A;
    public final C56162c2 A0B;
    public final Map A0C;
    public final Map A0D;
    public final Map A0E;
    public final C18750sM A0F;
    public final C18750sM A0G;
    public final C18750sM A0H;
    public final C18750sM A0I;
    public final C18750sM A0J;
    public final C18750sM A0K;
    public final boolean A0L;
    public final boolean A0M;

    public ToastingBadge(Context context) {
        this(context, (AttributeSet) null, 0, 6, (AnonymousClass7BR) null);
    }

    public ToastingBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (AnonymousClass7BR) null);
    }

    private final ViewGroup getContainer() {
        return (ViewGroup) this.A0F.getValue();
    }

    private final Map getDisplayStyleToViewMap() {
        return (Map) this.A0G.getValue();
    }

    public static final View getLedBadge(ToastingBadge toastingBadge) {
        return (View) toastingBadge.A0H.getValue();
    }

    public static final IgTextView getNumberBadge(ToastingBadge toastingBadge) {
        return (IgTextView) toastingBadge.A0I.getValue();
    }

    public static final View getToastBadge(ToastingBadge toastingBadge) {
        return (View) toastingBadge.A0J.getValue();
    }

    public static final C25313BDk getViewModel(ToastingBadge toastingBadge) {
        return (C25313BDk) toastingBadge.A0K.getValue();
    }

    public static final void A02(ToastingBadge toastingBadge, boolean z) {
        Integer num;
        if (!z || !toastingBadge.isSelected() || toastingBadge.A0M) {
            View badge = toastingBadge.getBadge();
            if (badge != null) {
                num = Integer.valueOf(badge.getVisibility());
            } else {
                num = null;
            }
            int i = 8;
            if (z) {
                i = 0;
            }
            if (num == null || i != num.intValue()) {
                View badge2 = toastingBadge.getBadge();
                if (badge2 != null) {
                    badge2.setVisibility(i);
                }
                C25313BDk viewModel = getViewModel(toastingBadge);
                AnonymousClass10J r3 = viewModel.A00;
                if (r3 != null) {
                    viewModel.A0A.A02(r3, viewModel.A0E, AnonymousClass1G3.DOT);
                }
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view == null || view.getId() != C0003R.C0005id.wrapper) {
            ViewGroup container = getContainer();
            if (container != null) {
                container.addView(view, i, layoutParams);
                return;
            }
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final int getNumberCap() {
        return this.A00;
    }

    public final AnonymousClass1G3 getToastCappedFallbackDisplayStyle() {
        return this.A02;
    }

    public final AnonymousClass1G3 getToastFallbackDisplayStyle() {
        return this.A03;
    }

    public final C97794Kl getTooltipClickListener() {
        return this.A05;
    }

    public final AnonymousClass108 getUseCase() {
        AnonymousClass108 r1 = this.A04;
        if (r1 == null) {
            C13150hy.A03("useCase");
        }
        return r1;
    }

    public final void setLifecycleOwner(C137125t6 r2) {
        C13150hy.A02(r2, "lifecycleOwner");
        setupObservers(r2);
    }

    public final void setToastCappedFallbackDisplayStyle(AnonymousClass1G3 r2) {
        C13150hy.A02(r2, "<set-?>");
        this.A02 = r2;
    }

    public final void setToastFallbackDisplayStyle(AnonymousClass1G3 r2) {
        C13150hy.A02(r2, "<set-?>");
        this.A03 = r2;
    }

    public final void setUseCase(AnonymousClass108 r2) {
        C13150hy.A02(r2, "<set-?>");
        this.A04 = r2;
    }

    public static final void A00(ToastingBadge toastingBadge, AnonymousClass1G3 r6) {
        int i;
        View badge = toastingBadge.getBadge();
        if (badge != null) {
            i = badge.getVisibility();
        } else {
            i = 8;
        }
        toastingBadge.A01 = r6;
        for (Map.Entry entry : toastingBadge.getDisplayStyleToViewMap().entrySet()) {
            View view = (View) entry.getValue();
            if (view != null) {
                AnonymousClass1G3 r1 = (AnonymousClass1G3) entry.getKey();
                int i2 = 8;
                if (r1 == r6) {
                    i2 = i;
                }
                view.setVisibility(i2);
            }
        }
    }

    public static final void A01(ToastingBadge toastingBadge, AnonymousClass79W r6) {
        Context context = toastingBadge.getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null && !r6.A02) {
            C58342fm r3 = new C58342fm(toastingBadge);
            C56142c0 r1 = new C56142c0(activity, new AnonymousClass872(r6.A01));
            r1.A02(toastingBadge.getContainer());
            r1.A05 = toastingBadge.A0B;
            r1.A0B = true;
            C56172c3 r0 = C56172c3.A06;
            r1.A07 = r0;
            r1.A06 = r0;
            r1.A00 = r6.A00;
            r1.A09 = false;
            r1.A04 = r3;
            C56202c6 A002 = r1.A00();
            toastingBadge.A06 = A002;
            A002.A05();
        }
    }

    private final View getBadge() {
        return (View) getDisplayStyleToViewMap().get(this.A01);
    }

    public static final void setBadgeValue(ToastingBadge toastingBadge, String str) {
        IgTextView numberBadge = getNumberBadge(toastingBadge);
        if (numberBadge != null) {
            numberBadge.setText(str);
        }
    }

    private final void setupObservers(C137125t6 r3) {
        getViewModel(this).A09.A05(r3, new AnonymousClass758(this));
        getViewModel(this).A07.A05(r3, new AnonymousClass751(this));
        getViewModel(this).A06.A05(r3, new AnonymousClass752(this));
        if (this.A01 == AnonymousClass1G3.TOAST || this.A0L) {
            getViewModel(this).A08.A05(r3, new AnonymousClass753(this));
        }
    }

    public final boolean getTooltipVisible() {
        return getViewModel(this).A02;
    }

    public final void setNumberCap(int i) {
        this.A00 = i;
    }

    public final void setTooltipClickListener(C97794Kl r1) {
        this.A05 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToastingBadge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13150hy.A02(context, "context");
        this.A0C = C51712Lv.A06(C234910p.A00(0, AnonymousClass1G4.BOTTOM_NAVIGATION_BAR), C234910p.A00(1, AnonymousClass1G4.PROFILE_PAGE), C234910p.A00(2, AnonymousClass1G4.PROFILE_MENU), C234910p.A00(3, AnonymousClass1G4.ACCOUNT_SWITCHER), C234910p.A00(4, AnonymousClass1G4.ACTIVITY_FEED));
        this.A0D = C51712Lv.A06(C234910p.A00(0, AnonymousClass1G3.TOAST), C234910p.A00(1, AnonymousClass1G3.DOT), C234910p.A00(2, AnonymousClass1G3.NUMBERED));
        this.A0E = C51712Lv.A06(C234910p.A00(0, C56162c2.ABOVE_ANCHOR), C234910p.A00(1, C56162c2.BELOW_ANCHOR));
        this.A0G = C29041Oj.A00(new C167517Dg(this));
        Object obj = AnonymousClass100.A00.get(C235110r.class);
        if (obj != null) {
            this.A08 = (C235110r) obj;
            this.A0K = C29041Oj.A00(new C25314BDm(this));
            this.A0J = C29041Oj.A00(new AnonymousClass757(this));
            this.A0H = C29041Oj.A00(new AnonymousClass756(this));
            this.A0I = C29041Oj.A00(new AnonymousClass755(this));
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3p, 0, 0);
            this.A0A = obtainStyledAttributes;
            AnonymousClass1G3 r0 = (AnonymousClass1G3) this.A0D.get(Integer.valueOf(obtainStyledAttributes.getInt(1, -1)));
            this.A01 = r0 == null ? AnonymousClass1G3.DOT : r0;
            AnonymousClass1G3 r02 = (AnonymousClass1G3) this.A0D.get(Integer.valueOf(this.A0A.getInt(7, -1)));
            this.A03 = r02 == null ? this.A01 : r02;
            AnonymousClass1G3 r03 = (AnonymousClass1G3) this.A0D.get(Integer.valueOf(this.A0A.getInt(6, -1)));
            this.A02 = r03 == null ? this.A03 : r03;
            AnonymousClass1G4 r04 = (AnonymousClass1G4) this.A0C.get(Integer.valueOf(this.A0A.getInt(0, -1)));
            this.A07 = r04 == null ? AnonymousClass1G4.INVALID : r04;
            C56162c2 r05 = (C56162c2) this.A0E.get(Integer.valueOf(this.A0A.getInt(8, -1)));
            this.A0B = r05 == null ? C56162c2.ABOVE_ANCHOR : r05;
            this.A09 = this.A0A.getBoolean(2, false);
            this.A0M = this.A0A.getBoolean(5, false);
            this.A0L = this.A0A.getBoolean(4, false);
            this.A00 = this.A0A.getInt(3, 0);
            this.A0F = C29041Oj.A00(new AnonymousClass754(this));
            ProxyFrameLayout.inflate(context, C0003R.layout.dot_badge, this);
            this.A02.add(new BE1(this));
            this.A0A.recycle();
            return;
        }
        throw new C183227s6("null cannot be cast to non-null type com.instagram.notifications.badging.ui.viewmodel.ToastingBadgeViewModel.Factory");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToastingBadge(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass7BR r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
