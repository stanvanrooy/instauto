package com.instagram.profile.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1US;
import p000X.AnonymousClass2NQ;
import p000X.AnonymousClass2NW;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass6L9;
import p000X.AnonymousClass6LB;
import p000X.AnonymousClass6LD;
import p000X.AnonymousClass6LE;
import p000X.AnonymousClass6LF;
import p000X.AnonymousClass6LH;
import p000X.C06590Pq;
import p000X.C120745Fv;
import p000X.C13300iJ;
import p000X.C13510ie;
import p000X.C145676Kq;
import p000X.C17850qu;
import p000X.C27341Hl;
import p000X.C31201Wx;
import p000X.C31221Wz;
import p000X.C44641wW;
import p000X.C51312Ke;
import p000X.C52152Nq;
import p000X.C96584Fr;

public class ProfileFollowRelationshipFragment extends C27341Hl implements C51312Ke, AnonymousClass2NQ, C96584Fr {
    public AnonymousClass6LB A00;
    public C145676Kq A01;
    public AnonymousClass0C1 A02;
    public C13300iJ A03;
    public List A04;
    public AnonymousClass1US A05;
    public C52152Nq A06;
    public boolean A07;
    public RecyclerView mRecyclerView;

    public final void AtV() {
    }

    public final void AtY(int i, int i2) {
    }

    public final String getModuleName() {
        return "following_sheet";
    }

    public final boolean AhU() {
        return C44641wW.A05((LinearLayoutManager) this.mRecyclerView.A0L);
    }

    public final void Aqq(AnonymousClass2NW r4) {
        AnonymousClass6L9 r2 = new AnonymousClass6L9(this);
        C31221Wz A012 = C31201Wx.A01(getContext());
        A012.A06(new AnonymousClass6LH(this, A012, r2));
        A012.A0B();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        super.onViewCreated(view2, bundle);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(C0003R.C0005id.profile_follow_rv);
        this.mRecyclerView = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        Context context = getContext();
        C13300iJ r5 = this.A03;
        C145676Kq r6 = this.A01;
        C145676Kq r7 = r6;
        AnonymousClass6LB r3 = new AnonymousClass6LB(context, r5, r6, r7, new AnonymousClass6LF(this, getActivity(), this.A02, this), this, this, this.A05, AnonymousClass1L8.A00(this), this, this.A02);
        this.A00 = r3;
        this.mRecyclerView.setAdapter(r3);
        this.A00.A0J();
        if (this.A07) {
            C52152Nq r32 = new C52152Nq(getContext(), this.A02, this.A00);
            this.A06 = r32;
            r32.A00();
            List list = this.A04;
            if (list == null || list.isEmpty()) {
                ArrayList<String> stringArrayList = this.mArguments.getStringArrayList("ProfileFollowRelationShipFragment.ARG_CHAINING_USER_IDS");
                if (stringArrayList == null || stringArrayList.isEmpty()) {
                    C17850qu A002 = C120745Fv.A00(this.A02, this.A03.getId());
                    A002.A00 = new AnonymousClass6LE(this);
                    schedule(A002);
                    return;
                }
                C17850qu A012 = C120745Fv.A01(this.A02, this.A03.getId(), stringArrayList);
                A012.A00 = new AnonymousClass6LD(this);
                schedule(A012);
                return;
            }
            AnonymousClass6LB r1 = this.A00;
            r1.A00 = this.A04;
            r1.A0J();
        }
    }

    public final AnonymousClass2OA AAQ(AnonymousClass2OA r1) {
        r1.A0K(this);
        return r1;
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1819302910);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A02 = AnonymousClass0J1.A06(bundle2);
        String string = bundle2.getString("ProfileFollowRelationshipFragment.ARG_DISPLAYED_USER_ID");
        this.A07 = bundle2.getBoolean("ProfileFollowRelationShipFragment.ARG_SHOW_USER_SUGGESTIONS");
        C13300iJ A023 = C13510ie.A00(this.A02).A02(string);
        this.A03 = A023;
        this.A05 = new AnonymousClass1US(getActivity(), this.A02);
        AnonymousClass0a4.A06(A023);
        AnonymousClass0Z0.A09(-1595881722, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1236451583);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_profile_follow_relationship_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(1381386518, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1117873501);
        super.onDestroyView();
        C52152Nq r0 = this.A06;
        if (r0 != null) {
            r0.A01();
        }
        this.mRecyclerView = null;
        AnonymousClass0Z0.A09(1212011419, A022);
    }
}
