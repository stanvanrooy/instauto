package com.instagram.gallery.p034ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.gallery.Medium;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.p004ui.widget.recyclerview.RefreshableRecyclerViewLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0PB;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1LT;
import p000X.AnonymousClass1X4;
import p000X.AnonymousClass25I;
import p000X.AnonymousClass2xx;
import p000X.AnonymousClass3AD;
import p000X.AnonymousClass7H3;
import p000X.AnonymousClass7I8;
import p000X.AnonymousClass7I9;
import p000X.AnonymousClass81L;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C06420Oz;
import p000X.C06590Pq;
import p000X.C159486rK;
import p000X.C164436zp;
import p000X.C164446zq;
import p000X.C174757dM;
import p000X.C175327eH;
import p000X.C175337eI;
import p000X.C181127oJ;
import p000X.C181227oW;
import p000X.C181247oa;
import p000X.C181267oc;
import p000X.C181287oe;
import p000X.C181307og;
import p000X.C181317oh;
import p000X.C181327oi;
import p000X.C181337oj;
import p000X.C181427ot;
import p000X.C181587pA;
import p000X.C181647pG;
import p000X.C181687pK;
import p000X.C181757pR;
import p000X.C181817pX;
import p000X.C181837pZ;
import p000X.C181867pc;
import p000X.C181877pd;
import p000X.C197238cH;
import p000X.C26771Ff;
import p000X.C27341Hl;
import p000X.C33831dZ;
import p000X.C67852xw;
import p000X.C68172yZ;

/* renamed from: com.instagram.gallery.ui.MediaCollectionCardFragment */
public class MediaCollectionCardFragment extends C27341Hl implements C181317oh, AnonymousClass1HM, C181817pX, C175337eI, C181127oJ, C181867pc {
    public float A00;
    public GridLayoutManager A01;
    public C164446zq A02;
    public C175327eH A03;
    public C181427ot A04;
    public C181327oi A05;
    public AnonymousClass0C1 A06;
    public String A07;
    public String A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public ColorDrawable A0H;
    public Drawable A0I;
    public AnonymousClass7H3 A0J;
    public GalleryHomeTabbedFragment A0K;
    public C68172yZ A0L;
    public String A0M;
    public AnonymousClass1EW mActionBarService;
    public View mActionBarShadow;
    public View mActionBarView;
    public View mEmptyMessage;
    public C197238cH mFastScrollController;
    public C181647pG mGridInsetAdjustmentHelper;
    public AnonymousClass3AD mLoadingDrawable;
    public ImageView mLoadingSpinner;
    public View mMultiSelectButton;
    public C181877pd mPermissionController;
    public ViewGroup mPermissionsEmptyStateContainer;
    public RefreshableRecyclerViewLayout mRecyclerView;
    public TextView mTitleTextView;

    public final int AWg() {
        return 0;
    }

    public final void Ayo(ReboundViewPager reboundViewPager) {
    }

    public final void Ayp(C174757dM r1) {
    }

    public final void Ayq(C174757dM r1, Medium medium, int i) {
    }

    public final void B10() {
    }

    public final void BM9(C175327eH r1) {
    }

    public final String getModuleName() {
        return "card_details";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A01(MediaCollectionCardFragment mediaCollectionCardFragment) {
        int i;
        float f = mediaCollectionCardFragment.A00;
        int round = Math.round(f * 255.0f);
        float A022 = C06420Oz.A02(f, 0.5f, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, true);
        int round2 = Math.round(C06420Oz.A02(f, 0.5f, 1.0f, 255.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, true));
        int argb = Color.argb(255, round2, round2, round2);
        mediaCollectionCardFragment.mTitleTextView.setAlpha(A022);
        mediaCollectionCardFragment.A0I.setColorFilter(C26771Ff.A00(argb));
        AnonymousClass7H3 r2 = mediaCollectionCardFragment.A0J;
        if (r2.A05 != argb) {
            r2.A05 = argb;
            r2.A07 = C26771Ff.A00(argb);
            r2.invalidateSelf();
        }
        AnonymousClass7H3 r4 = mediaCollectionCardFragment.A0J;
        int i2 = 0;
        if (((float) round) / 255.0f <= 0.95f) {
            i = mediaCollectionCardFragment.A0E;
        } else {
            i = 0;
        }
        r4.A02 = i;
        r4.invalidateSelf();
        mediaCollectionCardFragment.A0H.setAlpha(round);
        View view = mediaCollectionCardFragment.mActionBarShadow;
        if (mediaCollectionCardFragment.A00 <= 0.9f) {
            i2 = 4;
        }
        view.setVisibility(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if ((!r0.A01) == false) goto L_0x0015;
     */
    private boolean A03() {
        boolean z;
        C181427ot r0 = this.A04;
        if (r0 == null || r0.A02 != Constants.A0C) {
            C181877pd r02 = this.mPermissionController;
            if (r02 != null) {
                z = true;
            }
            z = false;
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A4x(int i) {
        this.A0B = i;
        C181647pG r0 = this.mGridInsetAdjustmentHelper;
        if (r0 != null) {
            r0.A00(i);
        }
    }

    public final void At4(C181587pA r4) {
        int intValue;
        C181327oi r2 = this.A05;
        Integer num = (Integer) r2.A02.get(r4.A00.AOA());
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        if (intValue == -1) {
            return;
        }
        if (intValue > 100) {
            this.mRecyclerView.A0B(intValue, this.mActionBarView.getHeight());
        } else {
            this.mRecyclerView.A0C(intValue, this.mActionBarView.getHeight());
        }
    }

    public final void BAG(C181337oj r2) {
        this.A0K.A02();
    }

    public final void BBz(C175327eH r3) {
        View view = this.mMultiSelectButton;
        if (view != null) {
            view.setSelected(r3.A01);
        }
    }

    public final void BEA(boolean z) {
        if (z) {
            C181427ot r2 = this.A04;
            if (r2.A02 == Constants.ZERO) {
                r2.A02 = Constants.ONE;
                r2.A05.A02();
            }
            C181427ot r1 = this.A04;
            if (!r1.A07.contains(this)) {
                r1.A07.add(this);
                BTc(r1);
            }
        }
        A00();
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        C181427ot r0 = this.A04;
        C174757dM r02 = (C174757dM) r0.A03.get(this.A07);
        if (r02 != null) {
            r4.setTitle(r02.A04);
        }
        AnonymousClass2xx A002 = C67852xw.A00(Constants.ZERO);
        A002.A01(C019000b.A00(getContext(), C0003R.color.transparent));
        r4.BmE(A002.A00());
        C33831dZ r1 = new C33831dZ();
        r1.A04 = this.A0I;
        r1.A01 = C0003R.string.back;
        r1.A05 = new C181287oe(this);
        r4.A3K(r1.A00());
        C33831dZ r12 = new C33831dZ();
        r12.A04 = this.A0J;
        r12.A01 = C0003R.string.multi_select_button_label;
        r12.A05 = new C181267oc(this);
        ImageView A4J = r4.A4J(r12.A00());
        this.mMultiSelectButton = A4J;
        A4J.setBackground((Drawable) null);
        this.mMultiSelectButton.setSelected(this.A03.A01);
        View AFR = r4.AFR();
        this.mActionBarView = AFR;
        this.mActionBarShadow = r4.AFP();
        AFR.setBackgroundDrawable(this.A0H);
        this.mTitleTextView = r4.AYT();
        A01(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r1 == false) goto L_0x0012;
     */
    private void A00() {
        boolean z;
        if (isResumed()) {
            C181877pd r0 = this.mPermissionController;
            if (r0 != null) {
                boolean z2 = !r0.A01;
                z = true;
            }
            z = false;
            if (!z) {
                this.mPermissionsEmptyStateContainer.setVisibility(0);
                this.mEmptyMessage.setVisibility(8);
                this.mRecyclerView.setVisibility(8);
                this.mLoadingSpinner.setVisibility(8);
                this.mLoadingDrawable.A03(false);
            } else {
                if (this.A05.A01.isEmpty() && !A03()) {
                    this.mEmptyMessage.setVisibility(0);
                    this.mRecyclerView.setVisibility(8);
                    this.mLoadingSpinner.setVisibility(8);
                    this.mLoadingDrawable.A03(false);
                } else if (A03()) {
                    this.mLoadingDrawable.A01(1.0f);
                    this.mLoadingDrawable.A03(true);
                    this.mLoadingSpinner.setVisibility(0);
                    this.mEmptyMessage.setVisibility(8);
                    this.mRecyclerView.setVisibility(8);
                } else {
                    this.mRecyclerView.setVisibility(0);
                    this.mLoadingSpinner.setVisibility(8);
                    this.mLoadingDrawable.A03(false);
                    this.mEmptyMessage.setVisibility(8);
                }
                this.mPermissionsEmptyStateContainer.setVisibility(8);
            }
            this.mActionBarService.A0E();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r2.A08 >= (java.lang.System.currentTimeMillis() - 200)) goto L_0x001e;
     */
    private boolean A02() {
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout;
        boolean z;
        if (!(getActivity() == null || (refreshableRecyclerViewLayout = this.mRecyclerView) == null)) {
            if (refreshableRecyclerViewLayout.A0C == C164436zp.IDLE) {
                z = true;
            }
            z = false;
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int AcT(AnonymousClass7I9 r3) {
        int AOI = r3.AOI();
        if (AOI == 1) {
            return this.A0D;
        }
        if (AOI != 2) {
            if (AOI == 3) {
                return this.A09;
            }
            if (AOI != 4) {
                throw new IllegalStateException("invalid item type");
            }
        }
        return this.A0F;
    }

    public final void BBH(C181337oj r4, Medium medium) {
        if (A02()) {
            GalleryHomeTabbedFragment galleryHomeTabbedFragment = this.A0K;
            View view = r4.itemView;
            PointF pointF = r4.A01;
            if (pointF == null) {
                pointF = C181337oj.A0J;
            }
            galleryHomeTabbedFragment.A04(view, medium, pointF);
        }
    }

    public final void BBI(C181337oj r6, Medium medium) {
        if (A02()) {
            GalleryHomeTabbedFragment galleryHomeTabbedFragment = this.A0K;
            if (!galleryHomeTabbedFragment.A07()) {
                galleryHomeTabbedFragment.A05(medium, r6.A00, new C181837pZ(medium.AOA(), this.A0M, this.A0A));
            }
        }
    }

    public final void BTc(C181427ot r14) {
        List emptyList;
        List emptyList2;
        C181587pA r7;
        if (isResumed() && !A03()) {
            C181427ot r0 = this.A04;
            C174757dM r1 = (C174757dM) r0.A03.get(this.A07);
            if (r1 == null || !(r1 instanceof C174757dM)) {
                emptyList = Collections.emptyList();
            } else {
                emptyList = r1.A06;
            }
            C181427ot r02 = this.A04;
            C174757dM r4 = (C174757dM) r02.A03.get(this.A07);
            if (r4 != null) {
                Iterator it = emptyList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        r7 = null;
                        break;
                    }
                    Medium medium = (Medium) it.next();
                    if (AnonymousClass17M.A00(this.A08, medium.AOA())) {
                        r7 = new C181587pA(r4.A04, r4.A03, medium);
                        break;
                    }
                }
                this.A05.A00(emptyList, r7, (C181687pK) null, r4.A05, new ArrayList(), false, r4.A07);
            }
            this.mActionBarService.A0E();
            View findViewById = this.mView.findViewById(C0003R.C0005id.fast_scroll_container);
            C181427ot r03 = this.A04;
            C174757dM r12 = (C174757dM) r03.A03.get(this.A07);
            if (r12 == null || !(r12 instanceof C174757dM)) {
                emptyList2 = Collections.emptyList();
            } else {
                emptyList2 = r12.A06;
            }
            boolean z = false;
            if (emptyList2.size() >= 100) {
                z = true;
            }
            C164446zq r13 = this.A02;
            if (r13 != null) {
                this.mRecyclerView.A0E(r13);
            }
            C181227oW r15 = new C181227oW(this, z);
            this.A02 = r15;
            this.mRecyclerView.A0D(r15);
            if (z) {
                C181757pR r16 = new C181757pR(this.mRecyclerView);
                C181327oi r04 = this.A05;
                C197238cH A022 = C197238cH.A02(r16, r04, r04, findViewById, r04);
                this.mFastScrollController = A022;
                A022.A05 = new C181307og(this);
            } else {
                findViewById.setVisibility(8);
            }
            this.mGridInsetAdjustmentHelper.A00 = this.mFastScrollController;
        }
        A00();
    }

    public final C06590Pq getSession() {
        return this.A06;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1859885703);
        super.onCreate(bundle);
        this.A0K = (GalleryHomeTabbedFragment) this.mParentFragment;
        this.A06 = AnonymousClass0J1.A06(this.mArguments);
        C175327eH AMU = this.A0K.AMU();
        this.A03 = AMU;
        AMU.A04.add(this);
        this.A0C = Math.round(C06220Of.A03(getContext(), 1));
        this.A0G = C06220Of.A09(getContext()) / 3;
        Context context = getContext();
        this.A0H = new ColorDrawable(C019000b.A00(context, AnonymousClass1BA.A03(context, C0003R.attr.backgroundColorSecondary)));
        this.A0E = Math.round(C06220Of.A03(getContext(), 1));
        this.A0J = AnonymousClass7H3.A00(getContext(), AnonymousClass1BA.A03(getContext(), C0003R.attr.glyphColorPrimary));
        this.A0I = AnonymousClass1LT.A07(getContext(), C0003R.C0004drawable.instagram_arrow_back_24, C0003R.color.white, C0003R.C0004drawable.instagram_arrow_back_24, C0003R.color.white_50_transparent);
        Bundle bundle2 = this.mArguments;
        this.A07 = bundle2.getString("card_id");
        this.A08 = bundle2.getString("medium_id");
        this.A0A = bundle2.getInt("card_index");
        this.A0M = bundle2.getString("card_category");
        this.A09 = Math.round(((float) C06220Of.A09(getContext())) / 1.3333334f);
        this.A0D = this.A0G + this.A0C;
        this.A0F = getResources().getDimensionPixelSize(C0003R.dimen.section_header_height);
        Context context2 = getContext();
        int i = this.A0G;
        this.A05 = new C181327oi(context2, i, i, this.A06, this.A0K, this);
        C68172yZ r2 = new C68172yZ(getActivity());
        this.A0L = r2;
        r2.A00(getResources().getString(C0003R.string.loading));
        this.A04 = this.A0K.AMT();
        AnonymousClass0Z0.A09(1044633169, A022);
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return AnonymousClass81L.A01(getResources());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(329443057);
        View inflate = layoutInflater.inflate(C0003R.layout.gallery_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-1217128015, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1006383870);
        super.onDestroyView();
        this.A04.A07.remove(this);
        C164446zq r1 = this.A02;
        if (r1 != null) {
            this.mRecyclerView.A0E(r1);
        }
        MediaCollectionCardFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(-1246055038, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-1799878247);
        super.onResume();
        if (!AnonymousClass0PB.A06()) {
            AnonymousClass1X4.A04(getActivity().getWindow(), this.mView, false);
        }
        this.mPermissionController.A01();
        AnonymousClass0Z0.A09(1542324949, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mLoadingSpinner = (ImageView) view.findViewById(C0003R.C0005id.loading_spinner);
        AnonymousClass3AD r4 = new AnonymousClass3AD(getContext(), C0003R.color.transparent, C0003R.color.transparent, new int[]{C0003R.color.transparent, C0003R.color.grey_5}, 2.0f, 0);
        this.mLoadingDrawable = r4;
        this.mLoadingSpinner.setImageDrawable(r4);
        this.mPermissionsEmptyStateContainer = (ViewGroup) view.findViewById(C0003R.C0005id.permissions_empty_state_container);
        this.mEmptyMessage = view.findViewById(C0003R.C0005id.empty_message);
        this.mActionBarService = new AnonymousClass1EW((ViewGroup) view.findViewById(C0003R.C0005id.action_bar_container), new C181247oa(this));
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = (RefreshableRecyclerViewLayout) view.findViewById(C0003R.C0005id.recycler_view);
        this.mRecyclerView = refreshableRecyclerViewLayout;
        C159486rK.A01(refreshableRecyclerViewLayout);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3, 1);
        this.A01 = gridLayoutManager;
        gridLayoutManager.A23(new AnonymousClass25I(this));
        this.mRecyclerView.setLayoutManager(this.A01);
        this.mRecyclerView.setAdapter(this.A05);
        this.mRecyclerView.A0P.setItemViewCacheSize(4);
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout2 = this.mRecyclerView;
        refreshableRecyclerViewLayout2.A0P.A0r(new AnonymousClass7I8(getContext(), this.A0C, this.A05));
        this.mActionBarService.A0F(this);
        AnonymousClass1X4.A02(getActivity(), -16777216);
        AnonymousClass1X4.A03(getActivity(), false);
        this.mPermissionController = new C181877pd(getActivity(), this.mPermissionsEmptyStateContainer, this);
        C181647pG r1 = new C181647pG(this.mRecyclerView.A0P);
        r1.A00(this.A0B);
        this.mGridInsetAdjustmentHelper = r1;
    }
}
