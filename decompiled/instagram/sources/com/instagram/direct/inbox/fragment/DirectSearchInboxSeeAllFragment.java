package com.instagram.direct.inbox.fragment;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass2M0;
import p000X.AnonymousClass2MG;
import p000X.AnonymousClass2MJ;
import p000X.AnonymousClass2MK;
import p000X.AnonymousClass31A;
import p000X.AnonymousClass338;
import p000X.AnonymousClass339;
import p000X.AnonymousClass3LX;
import p000X.AnonymousClass469;
import p000X.AnonymousClass48A;
import p000X.AnonymousClass4VJ;
import p000X.C04280Di;
import p000X.C06590Pq;
import p000X.C105304ge;
import p000X.C109414nS;
import p000X.C109424nT;
import p000X.C109444nV;
import p000X.C109454nW;
import p000X.C109464nX;
import p000X.C109474nZ;
import p000X.C109744o7;
import p000X.C27341Hl;
import p000X.C68832zy;
import p000X.C690430t;
import p000X.C697433m;
import p000X.C697533n;

public class DirectSearchInboxSeeAllFragment extends C27341Hl implements AnonymousClass0RN, AnonymousClass31A, AnonymousClass1HM {
    public AnonymousClass2MG A00;
    public ArrayList A01;
    public ArrayList A02;
    public ArrayList A03;
    public int A04;
    public RectF A05;
    public AnonymousClass0QT A06;
    public C697433m A07;
    public C109744o7 A08;
    public DirectThreadKey A09;
    public AnonymousClass0C1 A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public RecyclerView mRecyclerView;

    public final void BQ1(DirectShareTarget directShareTarget, String str, int i, View view, C105304ge r5) {
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.Bnz(true);
        r3.setTitle(this.A0C);
        r3.Bo6(true);
    }

    public final String getModuleName() {
        return "DIRECT_SEARCH_INBOX_SELL_ALL_FRAGMENT";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void BMr(int i, DirectShareTarget directShareTarget, String str, C105304ge r22) {
        DirectShareTarget directShareTarget2 = directShareTarget;
        DirectThreadKey directThreadKey = directShareTarget2.A00;
        if (directThreadKey == null) {
            AnonymousClass0QD.A02("DirectSearchInboxSeeAllFragment", "thread key should never be null");
            return;
        }
        C109744o7 r1 = this.A08;
        if (r1 != null) {
            r1.A01(directShareTarget2);
        }
        C697433m r3 = this.A07;
        int i2 = i;
        if (r3 != null) {
            r3.A02(this.A0A, directShareTarget2, (long) this.A04, (long) i2);
            this.A07.A01(this.A0A, directShareTarget2, (long) this.A04);
        } else {
            AnonymousClass3LX.A0E(this.A0A, this, directThreadKey, (long) i2, (long) this.A04);
        }
        AnonymousClass48A.A00(getContext(), this.A0A, this.A06, getActivity(), directShareTarget2.A05(), directThreadKey.A00, this.A0D, (AnonymousClass2M0) null, str, getModuleName(), new C109424nT(this));
    }

    public final void BQ2(DirectShareTarget directShareTarget, RectF rectF, String str) {
        Context context = getContext();
        boolean isResumed = isResumed();
        AnonymousClass0C1 r2 = this.A0A;
        AnonymousClass48A.A01(context, isResumed, r2, getActivity(), AnonymousClass469.A03(r2, directShareTarget), rectF, str, this.A09, this.A0D, this.A05, (AnonymousClass2M0) null);
        FragmentActivity activity = getActivity();
        AnonymousClass0a4.A06(activity);
        activity.setResult(-1);
        getActivity().finish();
    }

    public final C06590Pq getSession() {
        return this.A0A;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1766147028);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        this.A0A = AnonymousClass0J1.A06(bundle2);
        this.A0C = bundle2.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_TITLE");
        this.A04 = bundle2.getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY_LENGTH");
        this.A01 = bundle2.getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_FACEBOOK_FRIENDS");
        this.A02 = bundle2.getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_FACEBOOK_NON_FRIENDS");
        this.A03 = bundle2.getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_INSTAGRAM_NON_CONTACTS");
        this.A0D = bundle2.getString("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_SESSION_ID");
        this.A09 = (DirectThreadKey) bundle2.getParcelable("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_THREAD_KEY");
        this.A05 = (RectF) bundle2.getParcelable(AnonymousClass0C5.$const$string(5));
        this.A0B = C690430t.A00(this.A0A);
        this.A06 = AnonymousClass0QT.A00(this.A0A, this);
        if (bundle2.getBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_LOGGING_REWRITE_ENABLED")) {
            this.A07 = (C697433m) this.A0A.AVA(C697433m.class, new C697533n());
        }
        if (bundle2.getBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_RECENT_SEARCHES_ENABLED")) {
            this.A08 = C109744o7.A00(this.A0A);
        }
        AnonymousClass0Z0.A09(1399014554, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass2MK r4;
        int A022 = AnonymousClass0Z0.A02(-1795662520);
        View inflate = layoutInflater.inflate(C0003R.layout.inbox_search_see_all_fragment, viewGroup, false);
        this.mRecyclerView = (RecyclerView) inflate.findViewById(C0003R.C0005id.recycler_view);
        AnonymousClass2MJ A002 = AnonymousClass2MG.A00(getActivity());
        if (((Boolean) AnonymousClass0L6.A02(this.A0A, AnonymousClass0L7.DIRECT_INBOX_SCROLL_PERF_IMPROVEMENTS, "new_layout_for_search_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            r4 = new AnonymousClass338(this, this.A0A, this.A0B);
        } else {
            r4 = new AnonymousClass339(this, this.A0A, this.A0B);
        }
        A002.A01(r4);
        A002.A01(new C04280Di());
        this.A00 = A002.A00();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager());
        this.mRecyclerView.setAdapter(this.A00);
        C68832zy r42 = new C68832zy();
        ArrayList arrayList = this.A01;
        int i = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            r42.A01(new C109414nS(Constants.A0N, (C109474nZ) null, (Object) null));
            r42.A02(AnonymousClass4VJ.A00(this.A01, 0, C109454nW.A00));
            i = 0 + this.A01.size();
        }
        ArrayList arrayList2 = this.A03;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            r42.A01(new C109414nS(Constants.A0Y, (C109474nZ) null, (Object) null));
            r42.A02(AnonymousClass4VJ.A00(this.A03, i, C109444nV.A00));
            i += this.A03.size();
        }
        ArrayList arrayList3 = this.A02;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            r42.A01(new C109414nS(Constants.A0j, (C109474nZ) null, (Object) null));
            r42.A02(AnonymousClass4VJ.A00(this.A02, i, C109464nX.A00));
        }
        this.A00.A06(r42);
        AnonymousClass0Z0.A09(-1659185192, A022);
        return inflate;
    }
}
