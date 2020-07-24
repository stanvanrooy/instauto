package com.instagram.igtv.browse;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.p004ui.widget.recyclerview.RefreshableRecyclerViewLayout;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.igtv.logging.IGTVLaunchAnalytics;
import com.instagram.igtv.search.IGTVSearchController;
import com.instagram.modal.ModalActivity;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass14J;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1GZ;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1I6;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1LR;
import p000X.AnonymousClass1LT;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1PZ;
import p000X.AnonymousClass1X4;
import p000X.AnonymousClass25A;
import p000X.AnonymousClass2J5;
import p000X.AnonymousClass2JK;
import p000X.AnonymousClass2JU;
import p000X.AnonymousClass2JV;
import p000X.AnonymousClass2xx;
import p000X.AnonymousClass3AD;
import p000X.AnonymousClass3D6;
import p000X.AnonymousClass3DC;
import p000X.AnonymousClass3ID;
import p000X.AnonymousClass40t;
import p000X.AnonymousClass5F4;
import p000X.AnonymousClass67G;
import p000X.AnonymousClass710;
import p000X.AnonymousClass712;
import p000X.AnonymousClass713;
import p000X.AnonymousClass714;
import p000X.AnonymousClass716;
import p000X.AnonymousClass717;
import p000X.AnonymousClass719;
import p000X.AnonymousClass71A;
import p000X.AnonymousClass71B;
import p000X.AnonymousClass71C;
import p000X.AnonymousClass71D;
import p000X.AnonymousClass71E;
import p000X.AnonymousClass71F;
import p000X.AnonymousClass71G;
import p000X.AnonymousClass71H;
import p000X.AnonymousClass71I;
import p000X.AnonymousClass71J;
import p000X.AnonymousClass71K;
import p000X.AnonymousClass71L;
import p000X.AnonymousClass71M;
import p000X.AnonymousClass71N;
import p000X.AnonymousClass72M;
import p000X.AnonymousClass7F9;
import p000X.C019000b;
import p000X.C06080Nr;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C13300iJ;
import p000X.C156816ms;
import p000X.C162826x8;
import p000X.C162896xF;
import p000X.C163066xX;
import p000X.C163646yV;
import p000X.C163726yd;
import p000X.C163926yy;
import p000X.C164446zq;
import p000X.C1645670c;
import p000X.C1645970f;
import p000X.C1646170h;
import p000X.C1646570n;
import p000X.C1646670o;
import p000X.C1647170t;
import p000X.C1647670y;
import p000X.C168617Hz;
import p000X.C17660qb;
import p000X.C17870qw;
import p000X.C179807m1;
import p000X.C18980sj;
import p000X.C25921Ax;
import p000X.C26761Fe;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C28051Kf;
import p000X.C28351Lj;
import p000X.C28511Ma;
import p000X.C32611bY;
import p000X.C32631ba;
import p000X.C32711bj;
import p000X.C33431cu;
import p000X.C33831dZ;
import p000X.C36791ic;
import p000X.C37141jB;
import p000X.C52902Qq;
import p000X.C58442fx;
import p000X.C59032gv;
import p000X.C67852xw;

public class IGTVBrowseFragment extends C27341Hl implements AnonymousClass1I6, C27371Ho, AnonymousClass1HK, AnonymousClass71F, C1645970f, AnonymousClass1HM, C156816ms, C179807m1, C33431cu, AnonymousClass71L, C163066xX {
    public int A00 = 0;
    public C1646670o A01;
    public C58442fx A02;
    public AnonymousClass1LR A03;
    public IGTVSearchController A04;
    public AnonymousClass0C1 A05;
    public String A06;
    public boolean A07;
    public int A08;
    public AnonymousClass1GZ A09;
    public AnonymousClass71M A0A;
    public C1647670y A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public View mActionBarShadow;
    public TextView mActionBarTitleTextView;
    public View mActionBarView;
    public C28051Kf mAutoplayingUnitViewpointManager;
    public AnonymousClass71N mBrowseAutoplayingUnit;
    public GridLayoutManager mGridLayoutManager;
    public RefreshableRecyclerViewLayout mGridRecyclerView;
    public C164446zq mGridRecyclerViewScrollListener = new C1646170h(this);
    public C28051Kf mGridViewpointManager;
    public View mLoadingShimmer;
    public AnonymousClass714 mLoadingShimmerHolder;
    public SpinnerImageView mLoadingSpinner;
    public C32611bY mPendingMediaObserver;
    public TouchInterceptorFrameLayout mRootContainer;
    public AnonymousClass25A mSpanSizeLookup = new AnonymousClass71A(this);

    public final boolean Ae1() {
        return true;
    }

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final void BBr() {
        Context context = getContext();
        Resources resources = getResources();
        CharSequence[] charSequenceArr = {resources.getString(C0003R.string.igtv_view_profile), resources.getString(C0003R.string.igtv_account_settings_menu_option)};
        AnonymousClass5F4 r2 = new AnonymousClass5F4(context);
        r2.A0A(charSequenceArr, new AnonymousClass716(this, context, charSequenceArr));
        r2.A09(true);
        r2.A0A.setOnDismissListener(new AnonymousClass71B(this));
        this.mBrowseAutoplayingUnit.A07("dialog");
        r2.A00().show();
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final boolean shouldCreatePictureInPictureBackdrop() {
        return false;
    }

    public static void A00(IGTVBrowseFragment iGTVBrowseFragment) {
        Bundle bundle = iGTVBrowseFragment.mArguments;
        boolean z = !iGTVBrowseFragment.A01.A00;
        String string = bundle.getString("browse_autoplaying_unit_stripped_media_id");
        AnonymousClass2J5 A012 = AnonymousClass2J5.A01(iGTVBrowseFragment.A05);
        Context context = iGTVBrowseFragment.getContext();
        AnonymousClass1L8 A002 = AnonymousClass1L8.A00(iGTVBrowseFragment);
        if (!z) {
            string = null;
        }
        C28351Lj.A00(context, A002, AnonymousClass2J5.A00(A012, false, new AnonymousClass2JK(iGTVBrowseFragment), string));
    }

    public static void A01(IGTVBrowseFragment iGTVBrowseFragment) {
        Integer num;
        AnonymousClass1LR r2 = iGTVBrowseFragment.A03;
        List A002 = C1647170t.A00(r2.A02, C36791ic.A00(iGTVBrowseFragment.A05));
        if (A002.size() > 1) {
            num = Constants.ONE;
        } else if (A002.size() == 1 && ((AnonymousClass2JU) A002.get(0)).A02 == AnonymousClass2JV.AUTOPLAYING_UNIT) {
            iGTVBrowseFragment.mBrowseAutoplayingUnit.A06(C1646570n.A00(iGTVBrowseFragment.A05, ((AnonymousClass2JU) A002.get(0)).A00, iGTVBrowseFragment.getResources()));
            A00(iGTVBrowseFragment);
            num = Constants.ZERO;
        } else {
            AnonymousClass1NJ A022 = AnonymousClass1PZ.A00(iGTVBrowseFragment.A05).A02(iGTVBrowseFragment.mArguments.getString("browse_autoplaying_unit_media_id"));
            if (A022 != null) {
                iGTVBrowseFragment.mBrowseAutoplayingUnit.A06(C1646570n.A00(iGTVBrowseFragment.A05, A022, iGTVBrowseFragment.getResources()));
            }
            A00(iGTVBrowseFragment);
            return;
        }
        A03(iGTVBrowseFragment, num);
    }

    public static void A02(IGTVBrowseFragment iGTVBrowseFragment, View view) {
        IGTVBrowseFragment iGTVBrowseFragment2 = iGTVBrowseFragment;
        IGTVSearchController iGTVSearchController = new IGTVSearchController(iGTVBrowseFragment2, (ViewGroup) view.findViewById(C0003R.C0005id.search_container), iGTVBrowseFragment.A05, iGTVBrowseFragment2, (AnonymousClass67G) null, iGTVBrowseFragment.A00, 0);
        iGTVBrowseFragment2.A04 = iGTVSearchController;
        iGTVBrowseFragment2.registerLifecycleListener(iGTVSearchController);
    }

    public static void A03(IGTVBrowseFragment iGTVBrowseFragment, Integer num) {
        AnonymousClass2JU r5;
        if (num == Constants.ONE) {
            AnonymousClass1LR r3 = iGTVBrowseFragment.A03;
            ArrayList arrayList = new ArrayList(C1647170t.A00(r3.A02, C36791ic.A00(iGTVBrowseFragment.A05)));
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r5 = null;
                    break;
                }
                r5 = (AnonymousClass2JU) it.next();
                if (r5.A02 == AnonymousClass2JV.AUTOPLAYING_UNIT) {
                    it.remove();
                    break;
                }
            }
            if (r5 != null) {
                iGTVBrowseFragment.mBrowseAutoplayingUnit.A06(C1646570n.A00(iGTVBrowseFragment.A05, r5.A00, iGTVBrowseFragment.getResources()));
            }
            C1646670o r32 = iGTVBrowseFragment.A01;
            boolean z = false;
            if (iGTVBrowseFragment.A03.A00 != null) {
                z = true;
            }
            r32.A03(arrayList, z, true);
            iGTVBrowseFragment.mBrowseAutoplayingUnit.A03 = iGTVBrowseFragment.A01.A00;
            iGTVBrowseFragment.mLoadingShimmerHolder.A01();
            iGTVBrowseFragment.mLoadingSpinner.setLoadingStatus(C168617Hz.SUCCESS);
            iGTVBrowseFragment.mGridRecyclerView.setVisibility(0);
            if (iGTVBrowseFragment.A0D) {
                BaseFragmentActivity.A00(AnonymousClass1EW.A03(iGTVBrowseFragment.getActivity()));
            }
        } else if (iGTVBrowseFragment.A01.getItemCount() == 0) {
            if (num == Constants.A0C) {
                iGTVBrowseFragment.mLoadingShimmerHolder.A01();
                iGTVBrowseFragment.mLoadingSpinner.setLoadingStatus(C168617Hz.FAILED);
                iGTVBrowseFragment.mLoadingSpinner.setOnClickListener(new AnonymousClass71J(iGTVBrowseFragment));
            } else if (num == Constants.ZERO) {
                iGTVBrowseFragment.mLoadingShimmerHolder.A00();
                iGTVBrowseFragment.mLoadingSpinner.setLoadingStatus(C168617Hz.SUCCESS);
            }
            iGTVBrowseFragment.mGridRecyclerView.setVisibility(8);
        }
        if (iGTVBrowseFragment.isResumed()) {
            iGTVBrowseFragment.mBrowseAutoplayingUnit.A09(false);
        }
    }

    private void A04(C13300iJ r10) {
        C52902Qq A012 = C52902Qq.A01(this.A05, r10.getId(), "igtv_viewer_username_row", getModuleName());
        A012.A0C = "profile_igtv";
        A012.A0N = true;
        new C59032gv(this.A05, ModalActivity.class, "profile", C18980sj.A00.A00().A00(A012.A03()), getActivity()).A06(getActivity().getApplicationContext());
    }

    public final boolean AhW() {
        return this.A04.A03();
    }

    public final void As2() {
        new C59032gv(this.A05, ModalActivity.class, AnonymousClass0C5.$const$string(93), new Bundle(), getActivity()).A07(this, 1);
    }

    public final void Av0(C58442fx r9, AnonymousClass2JV r10, int i, int i2) {
        String str;
        if (r10 == AnonymousClass2JV.CHANNEL) {
            str = r9.AI0();
        } else {
            str = null;
        }
        C1647670y r4 = this.A0B;
        String str2 = r10.A00;
        AnonymousClass1NJ APe = r9.APe();
        C37141jB A002 = C1647670y.A00(r4, "igtv_video_tap");
        A002.A0B(r4.A00, APe);
        A002.A3f = r4.A02;
        A002.A3B = str;
        A002.A1a = i;
        A002.A34 = str2;
        A002.A1b = i2;
        C1647670y.A01(r4, A002.A03());
        AnonymousClass1NJ APe2 = r9.APe();
        AnonymousClass3D6 A082 = C17660qb.A00.A08(this.A05);
        C32631ba A012 = A082.A01(APe2, getResources());
        A082.A04(Collections.singletonList(A012));
        if (r10 == AnonymousClass2JV.AUTOPLAYING_UNIT) {
            C58442fx A042 = A012.A04(this.A05, 0, false);
            A042.Bgs(r9.AJT());
            A042.Bfn(true);
        }
        C163646yV r3 = new C163646yV(new C28511Ma(this.A0C), System.currentTimeMillis());
        r3.A05 = this.A06;
        r3.A09 = A012.A02;
        r3.A0A = APe2.getId();
        r3.A0E = true;
        r3.A0G = true;
        r3.A0M = true;
        r3.A0H = true;
        r3.A00(getActivity(), this.A05, A082);
    }

    public final void B86(C58442fx r5) {
        C1647670y r3 = this.A0B;
        AnonymousClass1NJ APe = r5.APe();
        C37141jB A002 = C1647670y.A00(r3, AnonymousClass40t.$const$string(249));
        A002.A0B(r3.A00, APe);
        C1647670y.A01(r3, A002.A03());
        C28351Lj.A00(getActivity(), AnonymousClass1L8.A00(this), AnonymousClass3DC.A01(this.A05, r5.APe()));
    }

    public final void BLW() {
        this.A09.A00(Constants.A0N);
        C1647670y r2 = this.A0B;
        C37141jB A002 = C1647670y.A00(r2, "igtv_search");
        A002.A2w = "search_start";
        C1647670y.A01(r2, A002.A03());
        this.A04.A02(this);
    }

    public final void BMd() {
        A04(this.A05.A06);
    }

    public final void BTe() {
        this.A09.A00(Constants.A0Y);
        if (AnonymousClass71N.A05(getContext())) {
            AnonymousClass1X4.A02(getActivity(), this.mBrowseAutoplayingUnit.A0F);
        }
        this.A0A.BTe();
    }

    public final void BUL(C13300iJ r3, String str) {
        C1647670y r1 = this.A0B;
        C37141jB A002 = C1647670y.A00(r1, "igtv_search_select_channel");
        A002.A3B = str;
        C1647670y.A01(r1, A002.A03());
        A04(r3);
    }

    public final String getModuleName() {
        return this.A0B.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-966838874);
        Bundle bundle2 = this.mArguments;
        this.A05 = AnonymousClass0J1.A06(bundle2);
        Context context = getContext();
        super.onCreate(bundle);
        this.A06 = bundle2.getString("igtv_session_id_arg");
        C1645670c r2 = (C1645670c) new C25921Ax(this).A00(C1645670c.class);
        AnonymousClass1LR r1 = r2.A00;
        if (r1 == null) {
            r1 = C163726yd.A05;
            C163726yd.A05 = null;
        }
        if (r1 == null) {
            r1 = new AnonymousClass1LR(this.A05);
        }
        r2.A00 = r1;
        this.A03 = r1;
        String string = bundle2.getString("igtv_base_analytics_module_arg");
        this.A0C = string;
        this.A0B = new C1647670y(this.A05, this, this.A06, new C28511Ma(Constants.A0N, string).A01());
        this.mGridViewpointManager = C28051Kf.A00();
        this.mAutoplayingUnitViewpointManager = C28051Kf.A00();
        this.A0D = C06080Nr.A06(context);
        this.A08 = C019000b.A00(context, C0003R.color.black);
        AnonymousClass3ID r13 = new AnonymousClass3ID(this.A05, this, this, this.mGridViewpointManager, new AnonymousClass71C(this));
        C162826x8 A002 = C162826x8.A00(this, this.A05, this, this.A06, this.mGridViewpointManager);
        this.A01 = new C1646670o(this.A05, getResources(), this, this, this, this, this.A03.A00(), r13, A002, this, this, getActivity(), this.A0B);
        AnonymousClass0Z0.A09(-1740107779, A022);
    }

    public final void onPictureInPictureModeChanged(boolean z) {
        if (z) {
            this.mBrowseAutoplayingUnit.A07("pip_enter");
        } else {
            this.mBrowseAutoplayingUnit.A08("pip_exit");
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        super.onViewCreated(view2, bundle);
        Context context = getContext();
        this.A0E = AnonymousClass7F9.A01(context, this.A05);
        this.mRootContainer = (TouchInterceptorFrameLayout) view2.findViewById(C0003R.C0005id.root_container);
        this.mLoadingSpinner = (SpinnerImageView) view2.findViewById(C0003R.C0005id.fetch_spinner);
        this.mLoadingShimmer = view2.findViewById(C0003R.C0005id.loading_shimmer);
        ViewGroup viewGroup = ((BaseFragmentActivity) getActivity()).AFO().A07;
        this.mActionBarView = viewGroup.findViewById(C0003R.C0005id.action_bar_wrapper);
        this.mActionBarShadow = viewGroup.findViewById(C0003R.C0005id.action_bar_shadow);
        this.mActionBarTitleTextView = (TextView) viewGroup.findViewById(C0003R.C0005id.action_bar_textview_title);
        this.mGridRecyclerView = (RefreshableRecyclerViewLayout) view2.findViewById(C0003R.C0005id.tv_guide_grid_recycler_view);
        View findViewById = view2.findViewById(C0003R.C0005id.autoplaying_unit_container);
        C162896xF r15 = new C162896xF(this.A05, this, this, this.A06, this.mAutoplayingUnitViewpointManager);
        FragmentActivity activity = getActivity();
        AnonymousClass0C1 r8 = this.A05;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.mRootContainer;
        View view3 = this.mActionBarView;
        View view4 = this.mActionBarShadow;
        TextView textView = this.mActionBarTitleTextView;
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = this.mGridRecyclerView;
        String str = this.A06;
        boolean z = false;
        if (r8.A06.A04() > 0) {
            z = true;
        }
        this.mBrowseAutoplayingUnit = new AnonymousClass71N(activity, this, r8, touchInterceptorFrameLayout, findViewById, view3, view4, textView, refreshableRecyclerViewLayout, r15, this, str, this, z);
        int A012 = this.A01.A01(context);
        this.mLoadingShimmerHolder = new AnonymousClass714(this.mLoadingShimmer, A012, Math.round(((float) A012) * 0.643f), Math.round(C06220Of.A03(context, 1)));
        this.mPendingMediaObserver = new C32611bY(this.A05, this.A01, this.A03.A00());
        this.mGridLayoutManager = new GridLayoutManager(2);
        int A032 = (int) C06220Of.A03(context, 1);
        GridLayoutManager gridLayoutManager = this.mGridLayoutManager;
        gridLayoutManager.A23(this.mSpanSizeLookup);
        this.mGridRecyclerView.setLayoutManager(gridLayoutManager);
        this.mGridRecyclerView.setAdapter(this.A01);
        this.mGridRecyclerView.A0D(this.mGridRecyclerViewScrollListener);
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout2 = this.mGridRecyclerView;
        refreshableRecyclerViewLayout2.A0P.A0r(new AnonymousClass717(this, context, A032));
        this.mGridRecyclerView.A0B = new AnonymousClass712(this);
        AnonymousClass3AD A002 = C163926yy.A00(context);
        int A033 = (int) C06220Of.A03(context, 70);
        A002.A05(A033);
        A002.A02(A033);
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getActivity().getWindow().getDecorView();
            AnonymousClass1E1.A0c(decorView, new AnonymousClass710(this, context, A002));
            AnonymousClass1E1.A0J(decorView);
            if (AnonymousClass71N.A05(context)) {
                AnonymousClass1X4.A02(getActivity(), this.mBrowseAutoplayingUnit.A0G);
            }
        } else {
            A02(this, view2);
            C06220Of.A0S(this.mLoadingSpinner, (AnonymousClass1BA.A02(context, C0003R.attr.actionBarHeight) + AnonymousClass71N.A00(context)) - (C06220Of.A06(context) / 2));
            RefreshableRecyclerViewLayout refreshableRecyclerViewLayout3 = this.mGridRecyclerView;
            refreshableRecyclerViewLayout3.A05 = (int) C06220Of.A03(context, 15);
            refreshableRecyclerViewLayout3.A0A = A002;
            refreshableRecyclerViewLayout3.A0O.setImageDrawable(A002);
        }
        C06220Of.A0S(this.mLoadingShimmer, AnonymousClass71N.A00(context) + A032);
        this.mGridViewpointManager.A04(C32711bj.A00(this), this.mGridRecyclerView.A0P);
        this.mAutoplayingUnitViewpointManager.A04(C32711bj.A00(this), findViewById);
        IGTVLaunchAnalytics iGTVLaunchAnalytics = (IGTVLaunchAnalytics) this.mArguments.getParcelable("igtv_launch_analytics");
        C1647670y r3 = this.A0B;
        C37141jB A003 = C1647670y.A00(r3, "igtv_browse_entry");
        if (iGTVLaunchAnalytics != null) {
            Boolean bool = iGTVLaunchAnalytics.A01;
            if (bool != null) {
                A003.A2I = Boolean.valueOf(bool.booleanValue());
            }
            String str2 = iGTVLaunchAnalytics.A04;
            if (str2 != null) {
                A003.A3v = str2;
            }
        }
        C1647670y.A01(r3, A003.A03());
        A01(this);
        this.mPendingMediaObserver.A02();
        this.A09 = new AnonymousClass1GZ("igtv_browse");
        this.A0A = new AnonymousClass71M(getActivity(), this.A05, this.A06);
    }

    public final String AVo() {
        return this.A06;
    }

    public final boolean Ah0() {
        AnonymousClass72M r0 = AnonymousClass713.A00().A00;
        if (r0 == null || !r0.A04()) {
            return false;
        }
        return true;
    }

    public final boolean AiQ() {
        return isResumed();
    }

    public final void Ast() {
        ((Activity) getContext()).onBackPressed();
    }

    public final void Azy(PendingMedia pendingMedia, int i) {
        C17870qw.A00(getContext(), this.A05).A0G(pendingMedia, this);
        PendingMediaStore.A01(this.A05).A09();
    }

    public final void B0D() {
        AnonymousClass1EW.A03(getActivity()).A07.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 21) {
            this.mBrowseAutoplayingUnit.A09(false);
        }
        this.mBrowseAutoplayingUnit.A08("resume");
    }

    public final void BK2(PendingMedia pendingMedia) {
        if (!C17870qw.A00(getActivity(), this.A05).A0M(pendingMedia.A1h, AnonymousClass71K.A00)) {
            AnonymousClass0QD.A02(AnonymousClass40t.$const$string(94), AnonymousClass000.A0E(AnonymousClass0C5.$const$string(44), pendingMedia.A1h));
        }
    }

    public final void BLZ() {
        AnonymousClass1EW.A03(getActivity()).A07.setVisibility(8);
        AnonymousClass1X4.A02(getActivity(), this.mBrowseAutoplayingUnit.A0F);
        this.mBrowseAutoplayingUnit.A07("fragment_paused");
    }

    public final void configureActionBar(AnonymousClass1EX r7) {
        Context context = getContext();
        AnonymousClass2xx A002 = C67852xw.A00(Constants.ZERO);
        A002.A01(C019000b.A00(context, C0003R.color.transparent));
        A002.A06 = this.mBrowseAutoplayingUnit.A0G;
        r7.BmE(A002.A00());
        r7.BlI(C0003R.string.igtv_app_name);
        AnonymousClass71N r3 = this.mBrowseAutoplayingUnit;
        boolean z = false;
        if (this.A03.A00().A03(this.A05) > 0) {
            z = true;
        }
        if (!r3.A0e) {
            C33831dZ r1 = new C33831dZ();
            r1.A04 = r3.A0K;
            r1.A01 = C0003R.string.igtv_upload_flow_prev;
            r1.A05 = new AnonymousClass71H(r3);
            r7.A3K(r1.A00());
        }
        if (r3.A0e) {
            if (!r3.A05 && z) {
                r3.A05 = z;
                r3.A00 = AnonymousClass1LT.A07(context, C0003R.C0004drawable.instagram_more_vertical_outline_24, C0003R.color.white, C0003R.C0004drawable.instagram_more_vertical_outline_24, C0003R.color.white_50_transparent);
            }
            C33831dZ r12 = new C33831dZ();
            r12.A04 = r3.A00;
            r12.A01 = C0003R.string.view_profile;
            r12.A05 = new AnonymousClass71D(r3);
            r7.A4J(r12.A00());
        } else if (r3.A0b.A06.A04() > 0 || r3.A02) {
            r3.A02 = true;
            C33831dZ r13 = new C33831dZ();
            r13.A04 = r3.A0L;
            r13.A01 = C0003R.string.view_profile;
            r13.A05 = new AnonymousClass71I(r3);
            r7.A4J(r13.A00());
        }
        C33831dZ r14 = new C33831dZ();
        r14.A04 = r3.A0N;
        r14.A01 = C0003R.string.igtv_upload_flow_prev;
        r14.A05 = new AnonymousClass71E(r3);
        r7.A4J(r14.A00());
        C33831dZ r15 = new C33831dZ();
        r15.A04 = r3.A0M;
        r15.A01 = C0003R.string.igtv_tv_guide_search_text;
        r15.A05 = new AnonymousClass71G(r3);
        r7.A4J(r15.A00());
        this.mActionBarView.setPadding(0, this.A00, 0, 0);
        ((ViewGroup.MarginLayoutParams) this.mActionBarShadow.getLayoutParams()).topMargin += this.A00;
        this.mBrowseAutoplayingUnit.A09(false);
    }

    public final C06590Pq getSession() {
        return this.A05;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1247705842);
        getContext().getTheme().applyStyle(C0003R.style.igtv_browse_search, true);
        View inflate = layoutInflater.inflate(C0003R.layout.igtv_browse, viewGroup, false);
        AnonymousClass0Z0.A09(417884050, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-546091892);
        super.onDestroy();
        unregisterLifecycleListener(this.A04);
        this.A04 = null;
        IGTVBrowseFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(-1428505015, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-125663691);
        if (this.A0E) {
            int i = this.A00;
            if (Build.VERSION.SDK_INT >= 21) {
                View decorView = getActivity().getWindow().getDecorView();
                AnonymousClass1E1.A0c(decorView, new AnonymousClass719(i));
                AnonymousClass1E1.A0J(decorView);
            }
            this.mActionBarView.setPadding(0, 0, 0, 0);
            ((ViewGroup.MarginLayoutParams) this.mActionBarShadow.getLayoutParams()).topMargin -= i;
            this.A00 = 0;
        }
        super.onDestroyView();
        C1647670y r1 = this.A0B;
        C1647670y.A01(r1, C1647670y.A00(r1, "igtv_browse_exit").A03());
        AnonymousClass71N r4 = this.mBrowseAutoplayingUnit;
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = this.mGridRecyclerView;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = r4.A0X;
        if (touchInterceptorFrameLayout != null) {
            touchInterceptorFrameLayout.removeCallbacks(r4.A0d);
        }
        r4.A0a.A02();
        refreshableRecyclerViewLayout.A0E(r4.A0W);
        this.mGridRecyclerView.A0E(this.mGridRecyclerViewScrollListener);
        this.mGridRecyclerView.A0B = null;
        C32611bY r0 = this.mPendingMediaObserver;
        r0.A01.A03(AnonymousClass14J.class, r0.A00);
        AnonymousClass0Z0.A09(1107747869, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(305683762);
        super.onPause();
        if (this.A0E) {
            AnonymousClass713.A00().A01.remove(this);
        }
        if (this.A0D && AnonymousClass71N.A05(getContext())) {
            AnonymousClass1X4.A02(getActivity(), this.A08);
        }
        C26761Fe.A00(this.A05).A0K();
        this.mBrowseAutoplayingUnit.A07("fragment_paused");
        AnonymousClass0Z0.A09(336057733, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-1920618793);
        super.onResume();
        if (this.A0E) {
            AnonymousClass713.A00().A01.add(this);
        }
        C58442fx r1 = this.A02;
        if (r1 != null) {
            this.mBrowseAutoplayingUnit.A06(r1);
            this.A02 = null;
        }
        if (this.A0D && Build.VERSION.SDK_INT >= 21) {
            this.mBrowseAutoplayingUnit.A09(false);
        }
        this.mBrowseAutoplayingUnit.A08("resume");
        this.mPendingMediaObserver.A03();
        IGTVSearchController iGTVSearchController = this.A04;
        if (iGTVSearchController != null && iGTVSearchController.A03()) {
            BLZ();
        }
        AnonymousClass0Z0.A09(-1023764742, A022);
    }
}
