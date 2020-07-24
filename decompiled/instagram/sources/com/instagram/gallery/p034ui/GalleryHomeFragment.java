package com.instagram.gallery.p034ui;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.facebook.C0003R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.p004ui.widget.recyclerview.RefreshableRecyclerViewLayout;
import com.instagram.p009ui.widget.mediapicker.Folder;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0PB;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass14J;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1X4;
import p000X.AnonymousClass25J;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass3AD;
import p000X.AnonymousClass3XB;
import p000X.AnonymousClass7I8;
import p000X.AnonymousClass7I9;
import p000X.AnonymousClass81L;
import p000X.C06220Of;
import p000X.C06270Ok;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C159486rK;
import p000X.C164436zp;
import p000X.C164446zq;
import p000X.C174757dM;
import p000X.C175327eH;
import p000X.C175347eJ;
import p000X.C180987o3;
import p000X.C181127oJ;
import p000X.C181237oY;
import p000X.C181257ob;
import p000X.C181297of;
import p000X.C181317oh;
import p000X.C181327oi;
import p000X.C181337oj;
import p000X.C181417os;
import p000X.C181427ot;
import p000X.C181587pA;
import p000X.C181647pG;
import p000X.C181687pK;
import p000X.C181707pM;
import p000X.C181757pR;
import p000X.C181787pU;
import p000X.C181797pV;
import p000X.C181817pX;
import p000X.C181837pZ;
import p000X.C181867pc;
import p000X.C181877pd;
import p000X.C181987pp;
import p000X.C182627r2;
import p000X.C185947ww;
import p000X.C197238cH;
import p000X.C23300zv;
import p000X.C27341Hl;

/* renamed from: com.instagram.gallery.ui.GalleryHomeFragment */
public class GalleryHomeFragment extends C27341Hl implements AnonymousClass1HK, C181317oh, C181817pX, C181127oJ, C181867pc {
    public int A00;
    public C181327oi A01;
    public GalleryHomeTabbedFragment A02;
    public AnonymousClass0C1 A03;
    public int A04;
    public int A05 = 0;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public long A0B;
    public C11200ea A0C;
    public C164446zq A0D;
    public C175327eH A0E;
    public boolean A0F;
    public final List A0G = new ArrayList();
    public View mEmptyMessage;
    public C197238cH mFastScrollController;
    public C181647pG mGridInsetAdjustmentHelper;
    public GridLayoutManager mLayoutManager;
    public AnonymousClass3AD mLoadingDrawable;
    public ImageView mLoadingSpinner;
    public C181877pd mPermissionController;
    public ViewGroup mPermissionsEmptyStateContainer;
    public RefreshableRecyclerViewLayout mRecyclerView;

    public final void At4(C181587pA r1) {
    }

    public final String getModuleName() {
        return "gallery_home_photos_tab";
    }

    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r2.A08 >= (java.lang.System.currentTimeMillis() - 200)) goto L_0x0018;
     */
    private boolean A01() {
        boolean z;
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = this.mRecyclerView;
        if (refreshableRecyclerViewLayout != null) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if ((!r0.A01) == false) goto L_0x0019;
     */
    public final boolean A02() {
        boolean z;
        C181427ot AMT = this.A02.AMT();
        if (AMT == null || AMT.A02 != Constants.A0C) {
            C181877pd r0 = this.mPermissionController;
            if (r0 != null) {
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
        this.A06 = i;
        C181647pG r0 = this.mGridInsetAdjustmentHelper;
        if (r0 != null) {
            r0.A00(i);
        }
    }

    public final void Ayp(C174757dM r6) {
        if (r6.A02.endsWith("_moment_card")) {
            Context context = getContext();
            C181797pV r3 = new C181797pV(this);
            AnonymousClass2OA r2 = new AnonymousClass2OA(context);
            r2.A0U(true);
            r2.A0V(true);
            r2.A07(C0003R.string.hide_card_dialog_title);
            r2.A06(C0003R.string.hide_card_dialog_message);
            r2.A0A(C0003R.string.hide_card_dialog_positive_button_label, new C181417os(context, r6, r3));
            r2.A09(C0003R.string.cancel, new C181787pU());
            r2.A03().show();
        }
    }

    public final void Ayq(C174757dM r7, Medium medium, int i) {
        String str;
        GalleryHomeTabbedFragment galleryHomeTabbedFragment = this.A02;
        if (!galleryHomeTabbedFragment.A07() && isResumed() && Constants.ZERO.intValue() == 0) {
            C181987pp A012 = C181987pp.A01(galleryHomeTabbedFragment.A03);
            C06270Ok A002 = C06270Ok.A00();
            A002.A07("index", Integer.valueOf(i));
            AnonymousClass0P4 A003 = C181987pp.A00(A012, "ig_feed_gallery_select_card_stack", 2);
            A003.A08("extra_data", A002);
            C181987pp.A02(A012, A003);
            C180987o3 r4 = galleryHomeTabbedFragment.mCardFragmentNavigator;
            Bundle bundle = new Bundle();
            bundle.putString("card_id", r7.A02);
            bundle.putString("medium_id", medium.AOA());
            bundle.putInt("card_index", i);
            String str2 = r7.A02;
            if (AnonymousClass17M.A00(str2, "faces_card")) {
                str = "faces";
            } else if (AnonymousClass17M.A00(str2, "on_this_day_card")) {
                str = "on_this_day";
            } else if (str2 == null || !str2.endsWith("_moment_card")) {
                str = "unknown";
            } else {
                str = "moment";
            }
            bundle.putString("card_category", str);
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r4.A08.mArguments.getString("IgSessionManager.SESSION_TOKEN_KEY"));
            MediaCollectionCardFragment mediaCollectionCardFragment = new MediaCollectionCardFragment();
            mediaCollectionCardFragment.setArguments(bundle);
            r4.A02 = false;
            AnonymousClass1H6 A0Q = r4.A06.A0Q();
            A0Q.A08("card_navigation_back_stack");
            A0Q.A02(r4.A05.getId(), mediaCollectionCardFragment);
            A0Q.A09();
            r4.A07.postDelayed(r4.A0A, 100);
        }
    }

    public final void B10() {
        C185947ww.A00(this.A03, new C182627r2());
    }

    public final void BAG(C181337oj r2) {
        this.A02.A02();
    }

    public final void BEA(boolean z) {
        if (z) {
            C181427ot AMT = this.A02.AMT();
            if (AMT.A02 == Constants.ZERO) {
                AMT.A02 = Constants.ONE;
                AMT.A05.A02();
            }
            if (!AMT.A07.contains(this)) {
                AMT.A07.add(this);
                BTc(AMT);
            }
        }
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        if (r15.A0F != false) goto L_0x0093;
     */
    public final void BTc(C181427ot r16) {
        boolean z;
        boolean z2;
        C181687pK r10;
        int i;
        this.A00 = PendingMediaStore.A01(this.A03).A07(Constants.A03).size();
        if (isResumed() && !A02()) {
            Folder currentFolder = this.A02.getCurrentFolder();
            if (currentFolder != null) {
                Iterator it = this.A02.getFolders().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Folder folder = (Folder) it.next();
                    if (folder.A01 == currentFolder.A01) {
                        currentFolder = folder;
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (currentFolder == null || !z) {
                currentFolder = (Folder) this.A02.getFolders().get(0);
            }
            GalleryHomeTabbedFragment galleryHomeTabbedFragment = this.A02;
            galleryHomeTabbedFragment.A04 = currentFolder;
            boolean z3 = false;
            if (currentFolder.A01 == -1) {
                z3 = true;
            }
            List arrayList = new ArrayList();
            for (C174757dM add : galleryHomeTabbedFragment.AMT().A03.values()) {
                arrayList.add(add);
            }
            if (arrayList.size() >= 3 && z3) {
                z2 = true;
            }
            z2 = false;
            if (z2 && ((Boolean) AnonymousClass0L6.A02(this.A03, AnonymousClass0L7.FS_NEW_GALLERY, "shuffle_cards", false, (AnonymousClass04H) null)).booleanValue()) {
                C175347eJ.A00(this.A03, arrayList);
            }
            if (!z3 || (i = this.A00) <= 0 || this.A0F) {
                r10 = null;
            } else {
                r10 = new C181687pK(i);
            }
            C181327oi r7 = this.A01;
            List A002 = currentFolder.A00();
            C181707pM r11 = new C181707pM(this);
            if (!z2) {
                arrayList = Collections.emptyList();
            }
            r7.A00(A002, (C181587pA) null, r10, r11, arrayList, z2, !z3);
            this.A0G.clear();
        }
        A00();
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
                if (this.A01.A01.isEmpty() && !A02()) {
                    this.mEmptyMessage.setVisibility(0);
                    this.mRecyclerView.setVisibility(8);
                    this.mLoadingSpinner.setVisibility(8);
                    this.mLoadingDrawable.A03(false);
                } else if (A02()) {
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
            this.A02.A03();
        }
    }

    public final int AWg() {
        return this.A05;
    }

    public final int AcT(AnonymousClass7I9 r3) {
        int AOI = r3.AOI();
        if (AOI == 0) {
            return this.A04;
        }
        if (AOI == 1) {
            return this.A08;
        }
        if (AOI == 2 || AOI == 4) {
            return this.A09;
        }
        throw new IllegalStateException("invalid item type");
    }

    public final void Ayo(ReboundViewPager reboundViewPager) {
        this.A05 = reboundViewPager.getCurrentDataIndex();
    }

    public final void BBH(C181337oj r4, Medium medium) {
        if (A01()) {
            GalleryHomeTabbedFragment galleryHomeTabbedFragment = this.A02;
            View view = r4.itemView;
            PointF pointF = r4.A01;
            if (pointF == null) {
                pointF = C181337oj.A0J;
            }
            galleryHomeTabbedFragment.A04(view, medium, pointF);
        }
    }

    public final void BBI(C181337oj r4, Medium medium) {
        if (A01()) {
            GalleryHomeTabbedFragment galleryHomeTabbedFragment = this.A02;
            if (!galleryHomeTabbedFragment.A07()) {
                galleryHomeTabbedFragment.A05(medium, r4.A00, (C181837pZ) null);
            }
        }
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        long currentTimeMillis;
        int A022 = AnonymousClass0Z0.A02(1381480249);
        super.onCreate(bundle);
        this.A02 = (GalleryHomeTabbedFragment) this.mParentFragment;
        Bundle bundle2 = this.mArguments;
        if (bundle == null || bundle.getLong("gallery_launched_at") == 0) {
            currentTimeMillis = System.currentTimeMillis();
        } else {
            currentTimeMillis = bundle.getLong("gallery_launched_at");
        }
        this.A0B = currentTimeMillis;
        C175347eJ.A00 = currentTimeMillis;
        this.A03 = AnonymousClass0J1.A06(bundle2);
        this.A0F = bundle2.getBoolean("arg_add_to_album");
        this.A0E = this.A02.AMU();
        this.A07 = Math.round(C06220Of.A03(getContext(), 1));
        this.A0A = C06220Of.A09(getContext()) / 3;
        int A002 = C159486rK.A00(getContext());
        int i = this.A07;
        this.A04 = A002 + (i << 1);
        this.A08 = this.A0A + i;
        this.A09 = getResources().getDimensionPixelSize(C0003R.dimen.section_header_height);
        Context context = getContext();
        int i2 = this.A0A;
        this.A01 = new C181327oi(context, i2, i2, this.A03, this.A02, this);
        this.A0C = new C181237oY(this);
        AnonymousClass0Z0.A09(1351067712, A022);
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return AnonymousClass81L.A01(getResources());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-895118210);
        View inflate = layoutInflater.inflate(C0003R.layout.gallery_home, viewGroup, false);
        AnonymousClass0Z0.A09(-527253469, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-540472367);
        super.onDestroyView();
        this.A02.AMT().A07.remove(this);
        this.mRecyclerView.A0E(this.A0D);
        GalleryHomeFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(-473163441, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(1986336123);
        super.onPause();
        AnonymousClass3XB.A01(this.A02.AMT().A05);
        C23300zv.A00(this.A03).A03(AnonymousClass14J.class, this.A0C);
        AnonymousClass0Z0.A09(-1671796690, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(408055666);
        super.onResume();
        AnonymousClass3XB r1 = this.A02.AMT().A05;
        if (r1.A05) {
            AnonymousClass3XB.A00(r1);
        }
        if (!AnonymousClass0PB.A06()) {
            AnonymousClass1X4.A04(getActivity().getWindow(), this.mView, false);
        }
        C23300zv.A00(this.A03).A02(AnonymousClass14J.class, this.A0C);
        this.mPermissionController.A01();
        AnonymousClass0Z0.A09(-1184344315, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("gallery_launched_at", this.A0B);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mLoadingSpinner = (ImageView) view.findViewById(C0003R.C0005id.loading_spinner);
        AnonymousClass3AD r4 = new AnonymousClass3AD(getContext(), C0003R.color.transparent, C0003R.color.transparent, new int[]{C0003R.color.transparent, C0003R.color.grey_5}, 2.0f, 0);
        this.mLoadingDrawable = r4;
        this.mLoadingSpinner.setImageDrawable(r4);
        this.mPermissionsEmptyStateContainer = (ViewGroup) view.findViewById(C0003R.C0005id.permissions_empty_state_container);
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = (RefreshableRecyclerViewLayout) view.findViewById(C0003R.C0005id.recycler_view);
        this.mRecyclerView = refreshableRecyclerViewLayout;
        C159486rK.A01(refreshableRecyclerViewLayout);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3, 1);
        this.mLayoutManager = gridLayoutManager;
        gridLayoutManager.A23(new AnonymousClass25J(this));
        this.mRecyclerView.setLayoutManager(this.mLayoutManager);
        this.mRecyclerView.setAdapter(this.A01);
        this.mRecyclerView.A0P.setItemViewCacheSize(4);
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout2 = this.mRecyclerView;
        refreshableRecyclerViewLayout2.A0P.A0r(new AnonymousClass7I8(getContext(), this.A07, this.A01));
        C181757pR r42 = new C181757pR(this.mRecyclerView);
        C181327oi r3 = this.A01;
        C197238cH A022 = C197238cH.A02(r42, r3, r3, view.findViewById(C0003R.C0005id.fast_scroll_container), this.A01);
        this.mFastScrollController = A022;
        A022.A05 = new C181297of(this);
        C181257ob r1 = new C181257ob(this);
        this.A0D = r1;
        this.mRecyclerView.A0D(r1);
        View findViewById = view.findViewById(C0003R.C0005id.empty_message);
        this.mEmptyMessage = findViewById;
        ((TextView) findViewById.findViewById(C0003R.C0005id.empty_message_title)).setText(C0003R.string.gallery_empty_state_title);
        ((TextView) this.mEmptyMessage.findViewById(C0003R.C0005id.empty_message_description)).setText(C0003R.string.gallery_empty_state_description);
        AnonymousClass1X4.A02(getActivity(), -16777216);
        AnonymousClass1X4.A03(getActivity(), false);
        this.mPermissionController = new C181877pd(getActivity(), this.mPermissionsEmptyStateContainer, this);
        C181647pG r12 = new C181647pG(this.mRecyclerView.A0P);
        r12.A00 = this.mFastScrollController;
        r12.A00(this.A06);
        this.mGridInsetAdjustmentHelper = r12;
    }
}
