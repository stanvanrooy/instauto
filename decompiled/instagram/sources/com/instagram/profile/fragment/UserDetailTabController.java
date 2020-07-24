package com.instagram.profile.fragment;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.instagram.common.p004ui.widget.adapterlayout.AdapterLinearLayout;
import com.instagram.p009ui.widget.nestablescrollingview.NestableViewPager;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.profile.p021ui.fadeinfollowbutton.FadeInFollowButton;
import com.instagram.profile.p021ui.refresh.RefreshableAppBarLayoutBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z1;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass12M;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1NR;
import p000X.AnonymousClass1OE;
import p000X.AnonymousClass1PM;
import p000X.AnonymousClass1US;
import p000X.AnonymousClass1WV;
import p000X.AnonymousClass1XK;
import p000X.AnonymousClass1XN;
import p000X.AnonymousClass2FD;
import p000X.AnonymousClass2KM;
import p000X.AnonymousClass2NS;
import p000X.AnonymousClass2NV;
import p000X.AnonymousClass382;
import p000X.AnonymousClass383;
import p000X.AnonymousClass388;
import p000X.AnonymousClass392;
import p000X.AnonymousClass393;
import p000X.AnonymousClass394;
import p000X.AnonymousClass395;
import p000X.AnonymousClass396;
import p000X.AnonymousClass3AD;
import p000X.AnonymousClass3BV;
import p000X.AnonymousClass3Bt;
import p000X.AnonymousClass9FF;
import p000X.C06220Of;
import p000X.C13300iJ;
import p000X.C13390iS;
import p000X.C137125t6;
import p000X.C145856Lm;
import p000X.C159946s7;
import p000X.C159966s9;
import p000X.C17430qE;
import p000X.C17510qM;
import p000X.C18600s7;
import p000X.C18830sU;
import p000X.C26571Ea;
import p000X.C27371Ho;
import p000X.C29551Qi;
import p000X.C31521Yp;
import p000X.C36841ih;
import p000X.C44611wS;
import p000X.C51052Iz;
import p000X.C52952Qw;
import p000X.C61532lx;
import p000X.C63522pc;
import p000X.C63532pd;
import p000X.C63542pe;
import p000X.C63562pg;
import p000X.C63572ph;
import p000X.C63602pk;
import p000X.C708738a;
import p000X.C709138e;
import p000X.C709838l;
import p000X.C709938n;
import p000X.C710138p;
import p000X.C710238q;
import p000X.C710338r;
import p000X.C710438s;
import p000X.C710538t;
import p000X.C710738v;
import p000X.C710838w;
import p000X.C710938x;
import p000X.C711138z;
import p000X.C711739g;
import p000X.C71413Ao;
import p000X.C71433Aq;

public class UserDetailTabController implements AnonymousClass1PM, C44611wS, C709938n, C63562pg {
    public int A00;
    public int A01;
    public AnonymousClass0C1 A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public int A08;
    public boolean A09;
    public boolean A0A;
    public final ViewTreeObserver.OnPreDrawListener A0B;
    public final C710538t A0C = new C710438s(this);
    public final C710738v A0D;
    public final C709138e A0E;
    public final C710938x A0F;
    public final C710838w A0G;
    public final AnonymousClass393 A0H;
    public final UserDetailFragment A0I;
    public final C710138p A0J = new C710138p();
    public final AnonymousClass1OE A0K;
    public final AnonymousClass1NR A0L;
    public final AnonymousClass1XK A0M;
    public final Runnable A0N = new C710338r(this);
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final C63572ph A0R;
    public final AnonymousClass392 A0S;
    public final C710238q A0T = new C710238q(this);
    public AdapterLinearLayout mAdapterLinearLayout;
    public AppBarLayout mAppBarLayout;
    public View mHeaderContainer;
    public FadeInFollowButton mOverFlowFollowButton;
    public View mPagerTabsContainer;
    public C26571Ea mPrivateProfileEmptyStateViewStubHolder;
    public AnonymousClass1XN mPullToRefresh;
    public View mPullToRefreshSpinnerContainer;
    public View mPullToRefreshSpinnerContainerBg;
    public AnonymousClass3AD mRefreshDrawable;
    public RefreshableAppBarLayoutBehavior mRefreshableLayoutBehavior;
    public C711739g mRootLayout;
    public TabLayout mTabLayout;
    public NestableViewPager mViewPager;

    public final void A0B() {
        this.A0E.A0L = true;
        this.A07 = true;
        if (!this.A09) {
            A00(this);
            this.A09 = true;
        }
        A01(this);
    }

    public final void onPageScrollStateChanged(int i) {
        if (i == 1) {
            this.A03 = "swipe";
        }
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public static void A00(UserDetailTabController userDetailTabController) {
        AnonymousClass1XN r1 = userDetailTabController.mPullToRefresh;
        if (!(r1 == null && userDetailTabController.mPullToRefreshSpinnerContainer == null) && userDetailTabController.A07) {
            if (userDetailTabController.A0O) {
                r1.setIsLoading(false);
            } else {
                userDetailTabController.mRefreshDrawable.A01(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                userDetailTabController.mRefreshDrawable.A03(false);
            }
            if (userDetailTabController.A0O) {
                userDetailTabController.mPullToRefresh.setIsLoading(false);
                return;
            }
            ((C51052Iz) userDetailTabController.mPullToRefreshSpinnerContainer.getLayoutParams()).A03 = 49;
            userDetailTabController.mRefreshDrawable.A05 = true;
        }
    }

    /* JADX WARNING: type inference failed for: r2v26, types: [X.2lx] */
    /* JADX WARNING: type inference failed for: r2v28, types: [X.395] */
    /* JADX WARNING: type inference failed for: r2v30, types: [X.395] */
    /* JADX WARNING: type inference failed for: r2v31, types: [X.6s7] */
    /* JADX WARNING: type inference failed for: r2v33, types: [X.6s9] */
    /* JADX WARNING: type inference failed for: r2v35, types: [X.395] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0214, code lost:
        if (r1.equals("profile_media_grid") == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0279, code lost:
        if (r3 != 1) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        if (r0 > 0) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a9, code lost:
        if (r1 == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01cb, code lost:
        if (r1.equals("profile_shop") == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d6, code lost:
        if (r1.equals("profile_igtv") == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e1, code lost:
        if (r1.equals("profile_collections") == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ec, code lost:
        if (r1.equals("profile_clips") == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f5, code lost:
        if (r1.equals("profile_media_photos_of_you") == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0200, code lost:
        if (r1.equals("profile_ar_effects") == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x020b, code lost:
        if (r1.equals("profile_guides") == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r1 == false) goto L_0x0020;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    public static void A01(UserDetailTabController userDetailTabController) {
        int i;
        boolean z;
        int i2;
        String str;
        char c;
        int hashCode;
        boolean z2;
        char c2;
        AnonymousClass394 r2;
        int i3;
        boolean z3;
        Integer num;
        UserDetailTabController userDetailTabController2 = userDetailTabController;
        if (userDetailTabController2.mViewPager != null) {
            C13300iJ A072 = userDetailTabController2.A07();
            boolean z4 = false;
            if (A072 != null && userDetailTabController2.A07) {
                C709138e r0 = userDetailTabController2.A0E;
                C13300iJ r1 = r0.A0F;
                if (r1 != null) {
                    boolean A022 = AnonymousClass388.A02(r0.A0D, r1);
                    z3 = true;
                }
                z3 = false;
                if (z3 && (userDetailTabController2.A0E.A09.A07 || ((num = A072.A1k) != null && num.intValue() > 0))) {
                    z4 = true;
                }
            }
            if (z4) {
                userDetailTabController2.mPagerTabsContainer.setVisibility(0);
                userDetailTabController2.mViewPager.setVisibility(0);
                AnonymousClass393 r9 = userDetailTabController2.A0H;
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add("profile_media_grid");
                if (A072.A04() > 0) {
                    arrayList.add("profile_igtv");
                }
                Context context = r9.A01;
                AnonymousClass0C1 r5 = r9.A06;
                Integer num2 = A072.A1s;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 0;
                }
                boolean z5 = true;
                boolean z6 = false;
                if (i > 0) {
                    z6 = true;
                }
                if (r5.A04().equals(A072.getId())) {
                    AnonymousClass12M A002 = AnonymousClass12M.A00(context, r5);
                    if (A002.A0A()) {
                        i3 = A002.A07.size();
                    } else {
                        i3 = 0;
                    }
                    if (!z6) {
                        z6 = false;
                    }
                    z6 = true;
                }
                if (!AnonymousClass1WV.A00(r5).A03 || !z6) {
                    z5 = false;
                }
                if (z5) {
                    arrayList.add("profile_clips");
                }
                Boolean bool = A072.A0o;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    z = true;
                }
                z = false;
                if (z) {
                    arrayList.add("profile_guides");
                }
                Integer A052 = C52952Qw.A05(A072, r9.A06);
                if (A052 == Constants.ONE || A052 == Constants.ZERO) {
                    AnonymousClass9FF A003 = AnonymousClass9FF.A00(r9.A06);
                    if (A003.A01 == null) {
                        A003.A01 = (Boolean) AnonymousClass0L6.A02(A003.A03, AnonymousClass0L7.MINISHOP_CONSUMPTION, "show_shop_tab", true, (AnonymousClass04H) null);
                    }
                    if (A003.A01.booleanValue()) {
                        arrayList.add("profile_shop");
                    }
                }
                Integer num3 = A072.A1a;
                if (num3 != null) {
                    i2 = num3.intValue();
                } else {
                    i2 = 0;
                }
                if (i2 > 0) {
                    arrayList.add("profile_ar_effects");
                }
                arrayList.add("profile_media_photos_of_you");
                List list = r9.A00;
                if (list == null) {
                    str = "created";
                } else {
                    AnonymousClass0a4.A06(list);
                    if (list.size() == arrayList.size()) {
                        int i4 = 0;
                        while (true) {
                            if (i4 < r9.A00.size()) {
                                if (!((AnonymousClass395) r9.A00.get(i4)).AXa().equals(arrayList.get(i4))) {
                                    break;
                                }
                                i4++;
                            } else {
                                z2 = false;
                                break;
                            }
                        }
                        if (!z2) {
                            str = "updated";
                        } else {
                            str = "no_change";
                            c = 65535;
                            hashCode = str.hashCode();
                            if (hashCode == -234430277) {
                                if (hashCode == 1028554472 && str.equals("created")) {
                                    c = 1;
                                }
                            } else if (str.equals("updated")) {
                                c = 0;
                            }
                            if (c != 0) {
                                userDetailTabController2.mViewPager.setCurrentItem(0);
                                C710738v r12 = userDetailTabController2.A0D;
                                r12.A00 = userDetailTabController2.A0H.A00;
                                r12.notifyDataSetChanged();
                                String str2 = userDetailTabController2.A04;
                                if (str2 != null) {
                                    C710738v r22 = userDetailTabController2.A0D;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= r22.A00.size()) {
                                            i5 = -1;
                                        } else if (!((AnonymousClass395) r22.A00.get(i5)).AXa().equals(str2)) {
                                            i5++;
                                        }
                                    }
                                    if (i5 != -1) {
                                        userDetailTabController2.mViewPager.setCurrentItem(i5);
                                    }
                                }
                                AppBarLayout appBarLayout = userDetailTabController2.mAppBarLayout;
                                if (appBarLayout != null && userDetailTabController2.A0P) {
                                    appBarLayout.A02(false, false);
                                }
                                userDetailTabController2.mViewPager.post(userDetailTabController2.A0N);
                                userDetailTabController2.A05 = false;
                            }
                            if (userDetailTabController2.A05) {
                                userDetailTabController2.A05 = true;
                                TabLayout tabLayout = userDetailTabController2.mTabLayout;
                                C71433Aq.A00(tabLayout, new C71413Ao(userDetailTabController2), tabLayout.getResources().getDimensionPixelSize(C0003R.dimen.profile_tab_start_end_padding), C06220Of.A09(userDetailTabController2.mTabLayout.getContext()));
                                if (userDetailTabController2.mTabLayout.getTabCount() == 3) {
                                    TabLayout tabLayout2 = userDetailTabController2.mTabLayout;
                                    if (tabLayout2.A0H == 1) {
                                        int dimensionPixelSize = tabLayout2.getResources().getDimensionPixelSize(C0003R.dimen.photo_grid_spacing);
                                        LinearLayout linearLayout = (LinearLayout) userDetailTabController2.mTabLayout.getChildAt(0);
                                        for (int i6 = 0; i6 < linearLayout.getChildCount() - 1; i6++) {
                                            ((LinearLayout.LayoutParams) linearLayout.getChildAt(i6).getLayoutParams()).setMarginEnd(dimensionPixelSize);
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                }
                r9.A00 = new ArrayList();
                for (String str3 : arrayList) {
                    List list2 = r9.A00;
                    switch (str3.hashCode()) {
                        case -2014282985:
                            c2 = 0;
                            break;
                        case -1020192691:
                            c2 = 7;
                            break;
                        case -907820214:
                            c2 = 6;
                            break;
                        case -770135420:
                            c2 = 5;
                            break;
                        case -729607923:
                            c2 = 2;
                            break;
                        case -453715969:
                            c2 = 4;
                            break;
                        case 1223564534:
                            c2 = 1;
                            break;
                        case 1223863244:
                            c2 = 3;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            Context context2 = r9.A01;
                            AnonymousClass0C1 r3 = r9.A06;
                            r2 = new AnonymousClass394(context2, r3, A072, C0003R.string.grid_tab_title, AnonymousClass382.FULL_AUDIENCE_MEDIA_GRID, r9.A07, r9.A02);
                            break;
                        case 1:
                            r2 = new C61532lx(r9.A01, r9.A06, A072);
                            break;
                        case 2:
                            r2 = C18600s7.A00.A02(r9.A01, r9.A06, A072);
                            break;
                        case 3:
                            C17510qM r17 = C17510qM.A00;
                            Context context3 = r9.A01;
                            AnonymousClass0C1 r15 = r9.A06;
                            UserDetailLaunchConfig userDetailLaunchConfig = r9.A05;
                            String str4 = userDetailLaunchConfig.A06;
                            C27371Ho r13 = r9.A03;
                            r2 = r17.A05(context3, r15, A072, str4, r13, userDetailLaunchConfig.A0B, userDetailLaunchConfig.A09, userDetailLaunchConfig.A0G, userDetailLaunchConfig.A00, userDetailLaunchConfig.A04);
                            break;
                        case 4:
                            C17430qE.A00.A02();
                            r2 = new C159946s7(r9.A01, r9.A06, A072);
                            break;
                        case 5:
                            r2 = r9.A04;
                            break;
                        case 6:
                            r2 = new C159966s9(r9.A01, r9.A06, A072);
                            break;
                        case 7:
                            r2 = C18830sU.A00.A01(r9.A01, r9.A06, A072);
                            break;
                        default:
                            throw new IllegalStateException(AnonymousClass000.A0E("Could not find provider for tab ", str3));
                    }
                    list2.add(r2);
                }
                c = 65535;
                hashCode = str.hashCode();
                if (hashCode == -234430277) {
                }
                if (c != 0) {
                }
                if (userDetailTabController2.A05) {
                }
            } else {
                userDetailTabController2.mPagerTabsContainer.setVisibility(8);
                userDetailTabController2.mViewPager.setVisibility(8);
                C710738v r14 = userDetailTabController2.A0D;
                r14.A00 = Collections.emptyList();
                r14.notifyDataSetChanged();
                userDetailTabController2.mViewPager.removeCallbacks(userDetailTabController2.A0N);
                userDetailTabController2.A0H.A00 = null;
                userDetailTabController2.BqS();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r1 == false) goto L_0x001d;
     */
    public static void A02(UserDetailTabController userDetailTabController, boolean z) {
        C13390iS r1;
        boolean z2;
        FadeInFollowButton fadeInFollowButton = userDetailTabController.mOverFlowFollowButton;
        if (fadeInFollowButton != null) {
            C13300iJ r0 = userDetailTabController.A0E.A0F;
            if (r0 != null) {
                r1 = r0.A0M;
            } else {
                r1 = C13390iS.FollowStatusUnknown;
            }
            if (r1 == C13390iS.FollowStatusNotFollowing) {
                C13300iJ A072 = userDetailTabController.A07();
                if (A072 != null) {
                    boolean A0e = A072.A0e();
                    z2 = true;
                }
                z2 = false;
                if (z2) {
                    return;
                }
                if (userDetailTabController.A06) {
                    fadeInFollowButton.A03(z);
                } else {
                    fadeInFollowButton.A04(z);
                }
            }
        }
    }

    public static boolean A03(UserDetailTabController userDetailTabController) {
        NestableViewPager nestableViewPager = userDetailTabController.mViewPager;
        if (nestableViewPager == null || nestableViewPager.getCurrentItem() <= -1 || userDetailTabController.A0D.getCount() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean A04(UserDetailTabController userDetailTabController) {
        C709138e r2 = userDetailTabController.A0E;
        if (!r2.A09.A07 || !AnonymousClass388.A01(r2.A0D, r2.A0F)) {
            return false;
        }
        return true;
    }

    public final int A05(AnonymousClass383 r5, String str) {
        C711138z A002 = C710938x.A00(this.A0F, r5);
        List list = A002.A02.A01;
        for (int i = 0; i < list.size(); i++) {
            if (((AnonymousClass1NJ) list.get(i)).getId().equals(str)) {
                int[] iArr = AnonymousClass3Bt.A00;
                AnonymousClass382 r3 = A002.A00;
                int i2 = iArr[r3.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    return i / AnonymousClass2NV.A02.A00;
                }
                throw new UnsupportedOperationException("getRowPosition for this profile tab mode unsupported " + r3);
            }
        }
        return -1;
    }

    public final C13300iJ A07() {
        return this.A0E.A0F;
    }

    public final void A08() {
        C710938x r3 = this.A0F;
        for (AnonymousClass383 A002 : r3.A03.keySet()) {
            C711138z A003 = C710938x.A00(r3, A002);
            A003.A02.A06();
            C711138z.A00(A003, (AnonymousClass1NJ) null);
        }
    }

    public final void A09() {
        AnonymousClass0Z1.A00(this.A0E, 1786395988);
        A0A();
    }

    public final void A0C(int i) {
        C709138e.A00(this.A0E);
        AnonymousClass394 r4 = this.A0H.A04;
        AnonymousClass382 r3 = r4.A06;
        boolean z = false;
        if (r3 == AnonymousClass382.PHOTOS_OF_YOU_MEDIA_GRID) {
            z = true;
        }
        AnonymousClass11J.A05(z, r3 + " does not support setting badge count externally");
        r4.A00 = i;
        AnonymousClass394.A01(r4);
    }

    public final void A0D(AnonymousClass2KM r2) {
        C709138e r0 = this.A0E;
        r0.A03 = r2;
        C709138e.A00(r0);
    }

    public final void A0E(AnonymousClass2FD r3) {
        C709138e r1 = this.A0E;
        r1.A06 = r3;
        if (r3 != null) {
            r1.A05.BBN(r3);
        }
        C709138e.A00(r1);
    }

    public final void A0F(C13300iJ r4) {
        C709138e r1 = this.A0E;
        r1.A0F = r4;
        if (r4 != null && !AnonymousClass388.A02(r1.A0D, r4)) {
            r1.A00.A02();
        }
        C709138e.A00(r1);
        if (r4 != null && !AnonymousClass388.A02(this.A02, r4)) {
            A08();
        }
        A01(this);
        C26571Ea r2 = this.mPrivateProfileEmptyStateViewStubHolder;
        if (r2 != null) {
            int i = 8;
            if (A04(this)) {
                i = 0;
            }
            r2.A02(i);
        }
        if (r4 != null && this.A0Q && !this.A09 && Constants.ZERO != r4.A1o && AnonymousClass388.A02(this.A02, r4)) {
            A0B();
        }
    }

    public final C36841ih APu(AnonymousClass1NJ r3) {
        AnonymousClass1PM r0;
        C710838w r1 = this.A0G;
        if (r1.A02) {
            WeakReference weakReference = r1.A01;
            if (weakReference != null) {
                r0 = (AnonymousClass1PM) weakReference.get();
            } else {
                r0 = null;
            }
        } else {
            r0 = r1.A00;
        }
        if (r0 != null) {
            return r0.APu(r3);
        }
        return null;
    }

    public final void AqE(AnonymousClass1NJ r3) {
        AnonymousClass1PM r0;
        C710838w r1 = this.A0G;
        if (r1.A02) {
            WeakReference weakReference = r1.A01;
            if (weakReference != null) {
                r0 = (AnonymousClass1PM) weakReference.get();
            } else {
                r0 = null;
            }
        } else {
            r0 = r1.A00;
        }
        if (r0 != null) {
            r0.AqE(r3);
        }
    }

    public final void BqS() {
        if (this.A09) {
            RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior = this.mRefreshableLayoutBehavior;
            refreshableAppBarLayoutBehavior.A04 = Constants.ONE;
            RefreshableAppBarLayoutBehavior.A02(refreshableAppBarLayoutBehavior);
            refreshableAppBarLayoutBehavior.A03.setIsLoading(false);
            for (C63542pe BPC : refreshableAppBarLayoutBehavior.A0D) {
                BPC.BPC();
            }
            this.mPullToRefresh.setIsLoading(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (r2.equals(r13) == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
        if (r2.equals(r13) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r6 == 1) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d6, code lost:
        if (r2.equals("tap_header") == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e3, code lost:
        if (r2.equals("tap_header") == false) goto L_0x0074;
     */
    public final void onPageSelected(int i) {
        char c;
        String str;
        char c2;
        int i2 = i;
        AnonymousClass3BV A012 = this.A0D.A01(i2);
        if (A012 != null) {
            if (A06() != null) {
                C709138e r0 = this.A0E;
                AnonymousClass382 A062 = A06();
                UserDetailDelegate userDetailDelegate = r0.A0B;
                if (userDetailDelegate != null) {
                    UserDetailTabController userDetailTabController = userDetailDelegate.A0I;
                    if (!C710938x.A00(userDetailTabController.A0F, A062.A00).A01) {
                        userDetailDelegate.A0H.A0P(true, A062);
                    }
                }
            }
            List list = this.A0H.A00;
            AnonymousClass0a4.A06(list);
            AnonymousClass395 r1 = (AnonymousClass395) list.get(i2);
            if (this.A03 != null) {
                AnonymousClass393 r02 = this.A0H;
                int i3 = this.A08;
                List list2 = r02.A00;
                AnonymousClass0a4.A06(list2);
                AnonymousClass395 r5 = (AnonymousClass395) list2.get(i3);
                C63572ph r10 = this.A0R;
                String AXc = r1.AXc();
                AnonymousClass0a4.A06(AXc);
                String str2 = this.A03;
                int hashCode = str2.hashCode();
                String str3 = "swipe";
                if (hashCode == -1436691799) {
                    c = 0;
                } else if (hashCode == 109854522) {
                    c = 1;
                }
                c = 65535;
                if (c != 0) {
                    if (c == 1) {
                        str = str3;
                    }
                    throw new IllegalStateException(AnonymousClass000.A0E("Unknown tab navigation type: ", str2));
                }
                str = "tab_header";
                AnonymousClass0a4.A06(str);
                if (hashCode == -1436691799) {
                    c2 = 0;
                } else if (hashCode == 109854522) {
                    c2 = 1;
                }
                c2 = 65535;
                if (c2 == 0) {
                    str3 = "tap_tab";
                }
                AnonymousClass0a4.A06(str3);
                String AOx = r1.AOx();
                String AFu = r5.AFu();
                AnonymousClass0a4.A06(AFu);
                String AFu2 = r1.AFu();
                AnonymousClass0a4.A06(AFu2);
                r10.Anj(AXc, str, str3, AOx, AFu, AFu2);
            }
            int i4 = this.A08;
            if (i4 != i2) {
                AnonymousClass3BV A013 = this.A0D.A01(i4);
                if (A013 != null) {
                    A013.BQq();
                }
                A012.BQk();
            }
            this.A08 = i2;
            r1.BQp(!this.A0A);
            A012.BQl();
            this.A0A = true;
        }
    }

    public final AnonymousClass382 A06() {
        if (!A03(this)) {
            return null;
        }
        C710738v r2 = this.A0D;
        return ((AnonymousClass395) r2.A00.get(this.mViewPager.getCurrentItem())).ASy();
    }

    public final void A0A() {
        AnonymousClass382 A062 = A06();
        if (A062 != null) {
            C711138z.A00(C710938x.A00(this.A0F, A062.A00), (AnonymousClass1NJ) null);
        }
    }

    public final AnonymousClass392 AJt() {
        return this.A0S;
    }

    public UserDetailTabController(Context context, boolean z, UserDetailFragment userDetailFragment, AnonymousClass2NS r40, C27371Ho r41, AnonymousClass2NV r42, AnonymousClass1AM r43, C709838l r44, AnonymousClass0C1 r45, C709138e r46, C63532pd r47, UserDetailFragment userDetailFragment2, AnonymousClass1US r49, AnonymousClass0RN r50, AnonymousClass1XK r51, UserDetailFragment userDetailFragment3, C63522pc r53, C708738a r54, C63572ph r55, C29551Qi r56, AnonymousClass1NR r57, AnonymousClass1OE r58, UserDetailLaunchConfig userDetailLaunchConfig, C63602pk r60, C137125t6 r61) {
        ViewTreeObserver.OnPreDrawListener r0;
        AnonymousClass0C1 r3 = r45;
        this.A02 = r3;
        this.A0M = r51;
        this.A0E = r46;
        this.A0I = userDetailFragment3;
        UserDetailLaunchConfig userDetailLaunchConfig2 = userDetailLaunchConfig;
        this.A04 = userDetailLaunchConfig2.A0C;
        this.A0P = userDetailLaunchConfig2.A0M;
        this.A0R = r55;
        this.A0L = r57;
        this.A0K = r58;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AnonymousClass382.FULL_AUDIENCE_MEDIA_GRID);
        arrayList.add(AnonymousClass382.PHOTOS_OF_YOU_MEDIA_GRID);
        this.A0Q = ((Boolean) AnonymousClass0L6.A02(this.A02, AnonymousClass0L7.CACHED_PROFILE_PAGE, "user_info", false, (AnonymousClass04H) null)).booleanValue();
        this.A0O = ((Boolean) AnonymousClass0L6.A02(this.A02, AnonymousClass0L7.PTR_SPINNER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        this.A0D = new C710738v(r43);
        this.A0G = new C710838w();
        Context context2 = context;
        UserDetailFragment userDetailFragment4 = userDetailFragment;
        C27371Ho r19 = r41;
        AnonymousClass2NV r12 = r42;
        boolean z2 = z;
        UserDetailFragment userDetailFragment5 = userDetailFragment4;
        C710938x r25 = new C710938x(context2, context2.getResources(), this, z2, userDetailFragment5, r40, r19, arrayList, r12, r3);
        this.A0F = r25;
        AnonymousClass1US r11 = r49;
        UserDetailFragment userDetailFragment6 = userDetailFragment2;
        C63532pd r9 = r47;
        C708738a r18 = r54;
        C63522pc r17 = r53;
        this.A0S = new AnonymousClass392(this, r9, userDetailFragment6, r11, r12, r50, userDetailFragment4, r25, r44, r17, r18, r19, r56, new C31521Yp(), new HashSet(), new HashSet(), new HashMap(), r60);
        this.A0H = new AnonymousClass393(r3, context2, r19, r25.A02.A07(), userDetailLaunchConfig2, z2, r61);
        if (((Boolean) AnonymousClass0L6.A02(this.A02, AnonymousClass0L7.USER_DETAIL_TAB_CONTROLLER_LEAK, "is_pre_draw_leak_fixed", false, (AnonymousClass04H) null)).booleanValue()) {
            r0 = new AnonymousClass396(this.A0T);
        } else {
            r0 = new C145856Lm(this);
        }
        this.A0B = r0;
    }
}
