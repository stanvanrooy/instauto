package com.instagram.archive.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.forker.Process;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelChainingConfig;
import com.instagram.p009ui.emptystaterow.EmptyStateView;
import com.instagram.p009ui.widget.refresh.RefreshableListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HL;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1HO;
import p000X.AnonymousClass1I1;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1N4;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass1UY;
import p000X.AnonymousClass1UZ;
import p000X.AnonymousClass1W5;
import p000X.AnonymousClass2MW;
import p000X.AnonymousClass2NN;
import p000X.AnonymousClass2Oq;
import p000X.AnonymousClass2PB;
import p000X.AnonymousClass37K;
import p000X.AnonymousClass38Z;
import p000X.AnonymousClass39L;
import p000X.AnonymousClass3IB;
import p000X.AnonymousClass5Ba;
import p000X.AnonymousClass5DB;
import p000X.AnonymousClass5DP;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass5FB;
import p000X.AnonymousClass5O6;
import p000X.AnonymousClass5O9;
import p000X.AnonymousClass5OL;
import p000X.AnonymousClass5OP;
import p000X.AnonymousClass5V8;
import p000X.AnonymousClass5VB;
import p000X.AnonymousClass5VE;
import p000X.AnonymousClass5VR;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C120575Fe;
import p000X.C122735Nr;
import p000X.C122765Nu;
import p000X.C122775Nv;
import p000X.C124345Uk;
import p000X.C124355Ul;
import p000X.C124365Un;
import p000X.C124375Uo;
import p000X.C124405Ur;
import p000X.C124435Uu;
import p000X.C124475Uy;
import p000X.C124545Vg;
import p000X.C124565Vi;
import p000X.C124625Vo;
import p000X.C12810hQ;
import p000X.C15890nh;
import p000X.C16170o9;
import p000X.C16180oA;
import p000X.C17020pY;
import p000X.C17710qg;
import p000X.C17850qu;
import p000X.C197238cH;
import p000X.C197318cP;
import p000X.C27301Hh;
import p000X.C28341Li;
import p000X.C28591Mi;
import p000X.C28691Ms;
import p000X.C33971dn;
import p000X.C39941no;
import p000X.C43041tf;
import p000X.C43791v5;
import p000X.C52382Oo;
import p000X.C59012gt;
import p000X.C61472lr;
import p000X.C62652o6;

public class ArchiveReelFragment extends AnonymousClass2NN implements C28591Mi, AnonymousClass1HK, C61472lr, AnonymousClass1HL, C52382Oo, AbsListView.OnScrollListener, AnonymousClass1HM, AnonymousClass1W5, AnonymousClass1HO, C124625Vo, AnonymousClass5O9 {
    public AnonymousClass5V8 A00;
    public AnonymousClass5DP A01;
    public C28341Li A02;
    public AnonymousClass1UY A03;
    public AnonymousClass0C1 A04;
    public Runnable A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public View A0D;
    public C122735Nr A0E;
    public AnonymousClass5OL A0F;
    public C27301Hh A0G;
    public C197238cH A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final Map A0M = new LinkedHashMap();
    public final AnonymousClass1I1 A0N = new AnonymousClass1I1();
    public EmptyStateView mEmptyStateView;
    public C124565Vi mHideAnimationCoordinator;
    public AnonymousClass5VR mReelLoader;

    public final boolean AhS() {
        return true;
    }

    public final void B4J(C17710qg r1) {
    }

    public final void B4l(Reel reel, C59012gt r2) {
    }

    public final void B8a(String str) {
    }

    public final void B8b(String str) {
    }

    public final void BAa(String str, String str2) {
    }

    public final void BAi(String str, String str2) {
    }

    public final void BB6(String str, String str2) {
    }

    public final void BBC(String str, String str2) {
    }

    public final void BDV() {
    }

    public final void BDh() {
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    private void A00() {
        this.A02.A02(AnonymousClass39L.A03(this.A04, Constants.A0N, false, this.A0L, this.A0J, false), this);
    }

    public static void A02(ArchiveReelFragment archiveReelFragment) {
        EmptyStateView emptyStateView = archiveReelFragment.mEmptyStateView;
        AnonymousClass2Oq r2 = AnonymousClass2Oq.ERROR;
        emptyStateView.A0H(C0003R.C0004drawable.loadmore_icon_refresh_compound, r2);
        archiveReelFragment.mEmptyStateView.A0K(new C124375Uo(archiveReelFragment), r2);
        switch (archiveReelFragment.A04.A06.A07().ordinal()) {
            case 0:
                EmptyStateView emptyStateView2 = archiveReelFragment.mEmptyStateView;
                AnonymousClass2Oq r22 = AnonymousClass2Oq.EMPTY;
                emptyStateView2.A0J(C0003R.string.stories_archive_home_empty_state_title_active, r22);
                archiveReelFragment.mEmptyStateView.A0I(C0003R.string.stories_archive_home_empty_state_subtitle_active, r22);
                archiveReelFragment.mEmptyStateView.A0G(C0003R.string.stories_archive_home_empty_state_button_active, r22);
                archiveReelFragment.mEmptyStateView.A0L(new AnonymousClass5DB(archiveReelFragment), r22);
                break;
            case 1:
                EmptyStateView emptyStateView3 = archiveReelFragment.mEmptyStateView;
                AnonymousClass2Oq r23 = AnonymousClass2Oq.EMPTY;
                emptyStateView3.A0J(C0003R.string.stories_archive_home_empty_state_title_inactive, r23);
                archiveReelFragment.mEmptyStateView.A0I(C0003R.string.stories_archive_home_empty_state_subtitle_inactive, r23);
                archiveReelFragment.mEmptyStateView.A0G(C0003R.string.stories_archive_home_empty_state_button_inactive, r23);
                archiveReelFragment.mEmptyStateView.A0L(new C120575Fe(archiveReelFragment), r23);
                break;
            case 2:
                EmptyStateView emptyStateView4 = archiveReelFragment.mEmptyStateView;
                AnonymousClass2Oq r24 = AnonymousClass2Oq.EMPTY;
                emptyStateView4.A0J(C0003R.string.stories_archive_home_empty_state_title_active, r24);
                archiveReelFragment.mEmptyStateView.A0I(C0003R.string.stories_archive_home_empty_state_subtitle_active, r24);
                ((AnonymousClass2PB) archiveReelFragment.mEmptyStateView.A01.get(r24)).A09 = "";
                break;
        }
        archiveReelFragment.mEmptyStateView.A0H(C0003R.C0004drawable.empty_state_private, AnonymousClass2Oq.EMPTY);
    }

    public static void A03(ArchiveReelFragment archiveReelFragment) {
        C122735Nr r4 = archiveReelFragment.A0E;
        if (r4 != null) {
            List A002 = C17020pY.A00().A0O(r4.A07).A00();
            if (!A002.isEmpty()) {
                Collections.sort(A002, Reel.A01(r4.A07, A002));
                r4.A04.Bk5(A002);
                if (r4.A00 > 0) {
                    AnonymousClass0C1 r1 = r4.A07;
                    long j = ((Reel) A002.get(0)).A03;
                    C15890nh r5 = new C15890nh(r1);
                    r5.A09 = Constants.ONE;
                    r5.A0C = "highlights/suggestions/mark_seen/";
                    r5.A06(AnonymousClass1N4.class, false);
                    r5.A09("timestamp", Long.toString(j));
                    r5.A0G = true;
                    C17850qu A032 = r5.A03();
                    A032.A00 = new C122775Nv(r4);
                    C12810hQ.A02(A032);
                }
            } else if (!r4.A04.A0B.isEmpty()) {
                r4.A04.A02();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass2MW r12 : archiveReelFragment.A0M.values()) {
            C124475Uy r2 = (C124475Uy) r12.A00;
            Reel reel = (Reel) r12.A01;
            if (!reel.A0k(archiveReelFragment.A04)) {
                int i = 0;
                if (!reel.A0l(archiveReelFragment.A04)) {
                    while (i < reel.A07(archiveReelFragment.A04)) {
                        arrayList.add(new AnonymousClass5VB(reel.A0C(archiveReelFragment.A04, i), reel, i, r2.A01, Constants.A0C));
                        i++;
                    }
                } else {
                    while (i < r2.A00) {
                        arrayList.add(new AnonymousClass5VB((C39941no) null, reel, i, r2.A01, Constants.ONE));
                        i++;
                    }
                }
            }
        }
        AnonymousClass5V8 r42 = archiveReelFragment.A00;
        r42.A07.A06();
        r42.A0B.clear();
        int size = arrayList.size();
        if (size > 9) {
            int i2 = size % 3;
            int i3 = 3 - i2;
            if (i2 == 0) {
                i3 = 0;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                r42.A07.A0A(new AnonymousClass5VB((C39941no) null, (Reel) null, 0, 0, Constants.ZERO));
            }
        }
        r42.A07.A0F(arrayList);
        r42.A00();
        A04(archiveReelFragment);
    }

    public static void A04(ArchiveReelFragment archiveReelFragment) {
        EmptyStateView emptyStateView;
        AnonymousClass2Oq r0;
        AnonymousClass2Oq r02;
        EmptyStateView emptyStateView2 = archiveReelFragment.mEmptyStateView;
        if (emptyStateView2 != null) {
            if (archiveReelFragment.AgL()) {
                r02 = AnonymousClass2Oq.LOADING;
            } else {
                boolean z = false;
                if (archiveReelFragment.A02.A00 == Constants.ONE) {
                    z = true;
                }
                if (z) {
                    r02 = AnonymousClass2Oq.ERROR;
                } else {
                    if (archiveReelFragment.A00.isEmpty()) {
                        emptyStateView = archiveReelFragment.mEmptyStateView;
                        r0 = AnonymousClass2Oq.EMPTY;
                    } else {
                        emptyStateView = archiveReelFragment.mEmptyStateView;
                        r0 = AnonymousClass2Oq.GONE;
                    }
                    emptyStateView.A0M(r0);
                    archiveReelFragment.mEmptyStateView.A0F();
                }
            }
            emptyStateView2.A0M(r02);
            archiveReelFragment.mEmptyStateView.A0F();
        }
    }

    public final boolean AgL() {
        if (this.A02.A00 == Constants.ZERO) {
            return true;
        }
        return false;
    }

    public final void AsA(Reel reel, List list, C124545Vg r16, int i, int i2, int i3, boolean z) {
        int i4 = i3;
        Reel reel2 = reel;
        if (this.A0I) {
            C39941no A0C2 = reel.A0C(this.A04, i4);
            if (A0C2.A12() || z) {
                AnonymousClass5OL r4 = this.A0F;
                AnonymousClass1NJ r3 = A0C2.A08;
                boolean z2 = false;
                if (r3.APx() == MediaType.PHOTO) {
                    z2 = true;
                }
                r4.A00(z2, r3);
                return;
            }
            Context context = getContext();
            boolean A14 = A0C2.A14();
            int i5 = C0003R.string.highlights_edit_photo_cannot_be_selected;
            if (A14) {
                i5 = C0003R.string.highlights_edit_video_cannot_be_selected;
            }
            AnonymousClass5F9.A01(context, i5, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel A0G2 = C17020pY.A00().A0Q(this.A04).A0G((String) it.next());
            if (A0G2 != null) {
                arrayList.add(A0G2);
            }
        }
        if (this.A03 == null) {
            this.A03 = new AnonymousClass1UY(this.A04, new AnonymousClass1UZ(this), this);
        }
        AnonymousClass1UY r5 = this.A03;
        r5.A0A = this.A07;
        r5.A04 = new C124565Vi(getActivity(), getListView(), this.A00, this);
        r5.A0B = this.A04.A04();
        r5.A05(r16, reel2, arrayList, arrayList, AnonymousClass1OY.ARCHIVE, i4, (ReelChainingConfig) null);
    }

    public final /* bridge */ /* synthetic */ void B4M(C28691Ms r8) {
        List list;
        List list2;
        C124435Uu r82 = (C124435Uu) r8;
        C124435Uu.A00(r82, this.A04, Constants.ZERO, this.A0M);
        AnonymousClass3IB r0 = r82.A01;
        int i = 0;
        if (!(r0 == null || (list2 = r0.A01) == null)) {
            for (int i2 = 0; i2 < list2.size(); i2++) {
                C17020pY.A00().A0Q(this.A04).A0F((C33971dn) list2.get(i2), true);
            }
        }
        C124405Ur r2 = r82.A00;
        if (!(r2 == null || (list = r2.A00) == null || list.isEmpty())) {
            this.A00.A00 = (AnonymousClass1NJ) r2.A00.get(0);
        }
        A03(this);
        A01(this.mView);
        int count = this.A00.getCount();
        int i3 = count - 1;
        if (!this.A09 && count > 0) {
            this.A09 = true;
            C16180oA A002 = C16180oA.A00(this.A04);
            if (!this.A0A) {
                boolean z = false;
                if (A002.A00.getInt("stories_archive_privacy_banner_view_count", 0) < 3) {
                    z = true;
                }
                if (!z) {
                    i = this.mView.getHeight();
                }
            }
            getListView().setSelectionFromTop(i3, i);
        }
        String str = this.A06;
        if (str != null) {
            AnonymousClass5V8 r22 = this.A00;
            if (r22.A07.A03.containsKey(str)) {
                AnonymousClass5VE r1 = r22.A07;
                AnonymousClass5O6.A00(r22.A01).A06(((AnonymousClass5VB) r1.A04(((Integer) r1.A02.get(str)).intValue())).A02);
            }
        }
    }

    public final void B8c(String str, boolean z) {
        Reel A0G2;
        if (this.A0M.containsKey(str) && !z && (A0G2 = C17020pY.A00().A0Q(this.A04).A0G(str)) != null && !A0G2.A0l(this.A04)) {
            A03(this);
        }
    }

    public final void configureActionBar(AnonymousClass1EX r7) {
        if (this.A00.AVc().isEmpty()) {
            r7.BlI(C0003R.string.create_highlights_title);
            r7.A4R(getResources().getString(C0003R.string.next));
        } else {
            r7.setTitle(getResources().getString(C0003R.string.highlights_selected_title, new Object[]{Integer.valueOf(this.A00.AVc().size())}));
            r7.A4S(getResources().getString(C0003R.string.next), new AnonymousClass5FB(this));
        }
        r7.Bo6(true);
    }

    public final String getModuleName() {
        if (this.A0I) {
            return "reel_highlights_gallery";
        }
        return "archive_stories_tab";
    }

    public final boolean onBackPressed() {
        if (!this.A08 || !C16170o9.A00()) {
            return false;
        }
        C16170o9.A00.A01(getActivity(), this.A04, "317728068821307");
        return false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C122735Nr r0 = this.A0E;
        if (r0 != null) {
            bundle.putString("launched_suggested_highlights_reel_id", r0.A01);
        }
        super.onSaveInstanceState(bundle);
    }

    private void A01(View view) {
        int i;
        ListView listView = getListView();
        listView.setVerticalScrollBarEnabled(false);
        ViewStub viewStub = (ViewStub) view.findViewById(C0003R.C0005id.fast_scroll_container);
        if (viewStub != null) {
            this.A0D = viewStub.inflate();
        }
        int A002 = C124345Uk.A00(getContext());
        AnonymousClass5V8 r6 = this.A00;
        int count = r6.getCount();
        if (count > 0) {
            View view2 = r6.getView(count - 1, (View) null, getListView());
            view2.measure(View.MeasureSpec.makeMeasureSpec(C06220Of.A09(getContext()), Process.WAIT_RESULT_TIMEOUT), View.MeasureSpec.makeMeasureSpec(0, 0));
            i = view2.getMeasuredHeight();
        } else {
            i = 0;
        }
        C197238cH r1 = this.A0H;
        if (r1 != null) {
            this.A0N.A0C(r1);
        }
        C124365Un r62 = new C124365Un(listView);
        AnonymousClass5V8 r7 = this.A00;
        C197238cH r4 = new C197238cH(new C197318cP(r62, r7, A002, i), r62, r7, r7, this.A0D);
        this.A0H = r4;
        this.A0N.A0B(r4);
    }

    public final C27301Hh AMt() {
        return this.A0G;
    }

    public final void B4I(C43791v5 r4) {
        AnonymousClass5F9.A01(getActivity(), C0003R.string.could_not_refresh_feed, 0);
        A04(this);
    }

    public final void B4K() {
        ((RefreshableListView) getListView()).setIsLoading(false);
        C62652o6.A00(false, this.mView);
    }

    public final void B4L() {
        if (getListViewSafe() != null) {
            ((RefreshableListView) getListViewSafe()).setIsLoading(true);
        }
        A04(this);
    }

    public final void B4N(C28691Ms r1) {
    }

    public final void BB5() {
        AnonymousClass1EW.A03(getActivity()).A0E();
    }

    public final void BHS(Reel reel) {
        A03(this);
    }

    public final void BHt(Reel reel) {
        A03(this);
    }

    public final void BZS(boolean z) {
        A00();
    }

    public final void Bel() {
        C43041tf.A00(this, getListView());
    }

    public final C06590Pq getSession() {
        return this.A04;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C16170o9 r3;
        FragmentActivity activity;
        AnonymousClass0C1 r1;
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 401) {
            if (i2 == -1) {
                this.A05 = new AnonymousClass5Ba(this, intent.getParcelableArrayListExtra("ReelNotificationUtil.ARGUMENTS_REEL_SHARE_STORY_TARGETS"), intent.getParcelableArrayListExtra("ReelNotificationUtil.ARGUMENTS_REEL_SHARE_DIRECT_TARGETS"));
                if (C16170o9.A00()) {
                    r3 = C16170o9.A00;
                    activity = getActivity();
                    r1 = this.A04;
                    str = "337086033562830";
                } else {
                    return;
                }
            } else if (C16170o9.A00()) {
                r3 = C16170o9.A00;
                activity = getActivity();
                r1 = this.A04;
                str = "309151609683923";
            } else {
                return;
            }
            r3.A01(activity, r1, str);
        }
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass38Z r12;
        int A022 = AnonymousClass0Z0.A02(-1131953374);
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        this.A0J = this.mArguments.getBoolean("is_in_archive_home", false);
        this.A0I = this.mArguments.getBoolean("archive_multi_select_mode", false);
        this.A0K = this.mArguments.getBoolean("is_standalone_reel_archive", false);
        this.A0A = this.mArguments.getBoolean("hide_footer", false);
        this.A06 = this.mArguments.getString("initial_selected_media_id");
        this.A01 = (AnonymousClass5DP) this.mArguments.getSerializable("highlight_management_source");
        this.A0L = this.mArguments.getBoolean("suggested_highlights_enabled", false);
        this.A0B = this.mArguments.getBoolean("is_archive_home_badged", false);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(this.mArguments);
        this.A04 = A062;
        if (bundle == null && this.A0K) {
            AnonymousClass5O6.A03(A062);
        }
        if (this.A0L) {
            this.A0E = new C122735Nr(new C122765Nu(this), getContext(), this, getActivity(), this.A04, this, new AnonymousClass1UY(this.A04, new AnonymousClass1UZ(this), this), bundle2, C17020pY.A00().A0R().A00);
            C17020pY.A00().A0R().A00 = 0;
        }
        AnonymousClass5OP r2 = new AnonymousClass5OP(this);
        C124355Ul r1 = new C124355Ul(this);
        Context context = getContext();
        this.A0F = new AnonymousClass5OL(r2, r1, context);
        FragmentActivity activity = getActivity();
        AnonymousClass0C1 r6 = this.A04;
        boolean z = this.A0K;
        boolean z2 = this.A0J;
        boolean z3 = this.A0A;
        C122735Nr r13 = this.A0E;
        if (r13 != null) {
            r12 = r13.A04;
        } else {
            r12 = null;
        }
        AnonymousClass5V8 r22 = new AnonymousClass5V8(activity, this, context, r6, this, this, z, z2, z3, r12);
        this.A00 = r22;
        setListAdapter(r22);
        AnonymousClass5V8 r23 = this.A00;
        r23.A02 = this.A0I;
        r23.A00();
        this.A07 = UUID.randomUUID().toString();
        this.A02 = new C28341Li(getContext(), this.A04, AnonymousClass1L8.A00(this));
        this.A0C = getResources().getDimensionPixelSize(C0003R.dimen.top_tabbar_height);
        this.A0G = new C27301Hh(getContext());
        A00();
        AnonymousClass0Z0.A09(-259044417, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1345131084);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_feed, viewGroup, false);
        AnonymousClass0Z0.A09(1289206806, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1553111013);
        super.onDestroyView();
        ArchiveReelFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(111825219, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-589546467);
        super.onPause();
        C17020pY.A00().A0M(this.A04).A05(this);
        this.A0N.A0C(this.A0G);
        this.A0N.A0C(this.mReelLoader);
        C197238cH r1 = this.A0H;
        if (r1 != null) {
            this.A0N.A0C(r1);
        }
        AnonymousClass5O6.A00(this.A04).A06.remove(this);
        AnonymousClass5O6 A002 = AnonymousClass5O6.A00(this.A04);
        A002.A06.remove(this.A00);
        AnonymousClass0Z0.A09(-1347532810, A022);
    }

    public final void onResume() {
        int i;
        boolean z;
        int A022 = AnonymousClass0Z0.A02(1709929027);
        super.onResume();
        AnonymousClass5O6.A00(this.A04).A06.add(this);
        AnonymousClass5O6 A002 = AnonymousClass5O6.A00(this.A04);
        A002.A06.add(this.A00);
        Runnable runnable = this.A05;
        if (runnable != null) {
            runnable.run();
        }
        C122735Nr r4 = this.A0E;
        if (r4 != null) {
            if (r4.A01 == null || r4.A02) {
                z = false;
            } else {
                Iterator it = C17020pY.A00().A0O(r4.A07).A00().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Reel) it.next()).getId().equals(r4.A01)) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            if (z) {
                getActivity().finish();
                i = -688615862;
                AnonymousClass0Z0.A09(i, A022);
            }
        }
        C17020pY.A00().A0M(this.A04).A04(this);
        this.A0N.A0B(this.A0G);
        this.A0N.A0B(this.mReelLoader);
        C197238cH r1 = this.A0H;
        if (r1 != null) {
            this.A0N.A0B(r1);
        }
        C122735Nr r2 = this.A0E;
        if (r2 != null) {
            r2.A01 = null;
            r2.A02 = false;
            r2.A06.A03(AnonymousClass37K.class, r2);
        }
        A02(this);
        A03(this);
        i = 1200465864;
        AnonymousClass0Z0.A09(i, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0Z0.A03(-1571032066);
        this.A0N.onScroll(absListView, i, i2, i3);
        AnonymousClass0Z0.A0A(881284529, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = AnonymousClass0Z0.A03(-1078772019);
        this.A0N.onScrollStateChanged(absListView, i);
        AnonymousClass0Z0.A0A(904329432, A032);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mEmptyStateView = (EmptyStateView) getListView().getEmptyView();
        this.A0G.A0D(getScrollingViewProxy(), this.A00, this.A0C);
        RefreshableListView refreshableListView = (RefreshableListView) getListView();
        refreshableListView.AC3();
        boolean z = false;
        refreshableListView.setDrawBorder(false);
        refreshableListView.setOnScrollListener(this);
        if (AgL() && !this.A00.isEmpty()) {
            z = true;
        }
        C62652o6.A00(z, this.mView);
        A04(this);
        this.mReelLoader = new AnonymousClass5VR(this.A00, this.A04, this);
        A01(view);
    }
}
