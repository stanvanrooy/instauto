package com.instagram.music.search;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1N4;
import p000X.AnonymousClass3EO;
import p000X.AnonymousClass8BP;
import p000X.C12810hQ;
import p000X.C12890hY;
import p000X.C13460iZ;
import p000X.C15890nh;
import p000X.C1899589u;
import p000X.C197828dH;
import p000X.C197858dK;
import p000X.C197888dO;
import p000X.C197898dQ;
import p000X.C197908dR;
import p000X.C197998dc;
import p000X.C198028df;
import p000X.C217579Zw;
import p000X.C256419q;
import p000X.C27291Hg;
import p000X.C27341Hl;
import p000X.C29081On;
import p000X.C29091Oo;
import p000X.C29621Qp;
import p000X.C32741bm;
import p000X.C34571ex;
import p000X.C61622m6;
import p000X.C80173ek;
import p000X.C85393nH;

public class MusicOverlayResultsListController extends C27291Hg implements C32741bm {
    public int A00;
    public int A01;
    public C197908dR A02;
    public final C27341Hl A03;
    public final C1899589u A04;
    public final C34571ex A05;
    public final MusicBrowseCategory A06;
    public final C80173ek A07;
    public final C197998dc A08;
    public final C197828dH A09;
    public final AnonymousClass0C1 A0A;
    public final String A0B;
    public final List A0C = new ArrayList();
    public final int A0D;
    public final C29091Oo A0E;
    public final AnonymousClass3EO A0F;
    public final Set A0G = new HashSet();
    public final boolean A0H;
    public C256419q mDropFrameWatcher;
    public LinearLayoutManager mLayoutManager;
    public View mParentView;
    public RecyclerView mRecyclerView;

    public final void B5Q(AnonymousClass1HD r1) {
    }

    public static int A00(MusicOverlayResultsListController musicOverlayResultsListController, AnonymousClass8BP r4) {
        for (int A1g = musicOverlayResultsListController.mLayoutManager.A1g(); A1g <= musicOverlayResultsListController.mLayoutManager.A1h(); A1g++) {
            if (((C198028df) musicOverlayResultsListController.A08.A09.get(A1g)).A01(musicOverlayResultsListController.A0A, r4)) {
                return A1g;
            }
        }
        return -1;
    }

    public final void A01() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.requestFocus();
        }
    }

    public final void A02(MusicBrowseCategory musicBrowseCategory) {
        C197898dQ A002 = C197898dQ.A00(this.A0A, musicBrowseCategory, (MusicAttributionConfig) null, this.A05, this.A0B, this.A04, this.A0D);
        A002.A01 = this.A09;
        A002.A00 = this.A0F;
        AnonymousClass1HD r1 = this.A03;
        if (this.A0H) {
            r1 = r1.mParentFragment;
        }
        if (r1 != null) {
            AnonymousClass1AM r0 = r1.mFragmentManager;
            int i = r1.mFragmentId;
            AnonymousClass1H6 A0Q = r0.A0Q();
            A0Q.A02(i, A002);
            A0Q.A08((String) null);
            A0Q.A0A();
        }
    }

    public final void A03(AnonymousClass8BP r12) {
        if (!this.A0G.contains(r12.A09)) {
            this.A0G.add(r12.A09);
            AnonymousClass0C1 r1 = this.A0A;
            MusicBrowseCategory musicBrowseCategory = this.A06;
            String str = this.A0B;
            C34571ex r10 = this.A05;
            C85393nH.A00(r1).AmT(r12.A09, r12.A0A, r12.A08, musicBrowseCategory.A01, musicBrowseCategory.A02, str, r12.A04, this.A04, r10);
        }
    }

    public final void A04(List list, boolean z) {
        C197998dc r1;
        if (z) {
            r1 = this.A08;
            r1.A07.clear();
        } else {
            r1 = this.A08;
        }
        r1.A07.addAll(list);
        C197998dc.A00(r1);
    }

    public final void Azd() {
        if (!this.A0C.isEmpty()) {
            C34571ex r1 = this.A05;
            AnonymousClass0C1 r0 = this.A0A;
            String str = this.A0B;
            List<AnonymousClass8BP> list = this.A0C;
            C15890nh r5 = new C15890nh(r0);
            r5.A09 = Constants.ONE;
            r5.A0C = "music/search_session_tracking/";
            r5.A09("product", r1.A00());
            r5.A09("browse_session_id", str);
            r5.A06(AnonymousClass1N4.class, false);
            try {
                StringWriter stringWriter = new StringWriter();
                C13460iZ A052 = C12890hY.A00.A05(stringWriter);
                A052.A0S();
                for (AnonymousClass8BP r2 : list) {
                    A052.A0T();
                    A052.A0H("audio_asset_id", r2.A09);
                    A052.A0H("alacorn_session_id", r2.A04);
                    A052.A0H("type", "song_selection");
                    A052.A0Q();
                }
                A052.A0P();
                A052.close();
                r5.A09("search_sessions", stringWriter.toString());
            } catch (IOException e) {
                AnonymousClass0QD.A06("MusicSearchApiUtil", "Failed to generate search session data", e);
            }
            C12810hQ.A02(r5.A03());
        }
    }

    public final void Azh() {
        this.mRecyclerView.A0V();
        C197828dH r0 = this.A09;
        if (r0 != null) {
            r0.A03.remove(this);
        }
        this.A03.unregisterLifecycleListener(this.mDropFrameWatcher);
        this.A03.removeFragmentVisibilityListener(this);
        MusicOverlayResultsListControllerLifecycleUtil.cleanupReferences(this);
    }

    public final void B5O(AnonymousClass1HD r2) {
        this.A07.A05();
    }

    public final void BE0() {
        this.A07.A05();
    }

    public final void BVf(View view, Bundle bundle) {
        this.mParentView = view;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.music_list);
        this.mRecyclerView = recyclerView;
        recyclerView.setAdapter(this.A08);
        this.mRecyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.mLayoutManager = linearLayoutManager;
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        C256419q r4 = new C256419q(this.A03.getActivity(), this.A0A, new C197888dO(this), 23592974);
        this.mDropFrameWatcher = r4;
        this.A03.registerLifecycleListener(r4);
        this.mRecyclerView.A0w(this.mDropFrameWatcher);
        this.mRecyclerView.A0w(new C197858dK(this));
        this.mRecyclerView.A0w(new C61622m6(this.A0E, C29621Qp.SEARCH_RESULTS, this.mLayoutManager));
        this.mRecyclerView.setItemAnimator(new C217579Zw());
        RecyclerView recyclerView2 = this.mRecyclerView;
        recyclerView2.setPadding(recyclerView2.getPaddingLeft(), this.mRecyclerView.getPaddingTop(), this.mRecyclerView.getPaddingRight(), this.A0D);
        C197828dH r0 = this.A09;
        if (r0 != null) {
            r0.A03.add(this);
        }
        this.A03.addFragmentVisibilityListener(this);
    }

    public MusicOverlayResultsListController(C27341Hl r10, AnonymousClass0C1 r11, C34571ex r12, String str, MusicBrowseCategory musicBrowseCategory, C1899589u r15, C197828dH r16, AnonymousClass3EO r17, MusicAttributionConfig musicAttributionConfig, C80173ek r19, C29091Oo r20, C29081On r21, boolean z, int i) {
        this.A03 = r10;
        this.A0A = r11;
        this.A05 = r12;
        this.A0B = str;
        this.A06 = musicBrowseCategory;
        this.A04 = r15;
        C197828dH r7 = r16;
        this.A09 = r7;
        this.A0F = r17;
        C80173ek r4 = r19;
        this.A07 = r4;
        this.A0E = r20;
        this.A0H = z;
        this.A0D = i;
        C197998dc r1 = new C197998dc(r10.getContext(), r11, r4, this, r21, r7, musicAttributionConfig);
        this.A08 = r1;
        r1.setHasStableIds(true);
    }
}
