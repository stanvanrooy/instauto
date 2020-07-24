package com.instagram.clips.drafts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.creation.capture.quickcapture.analytics.ShareMediaLoggingInfo;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass12M;
import p000X.AnonymousClass1DU;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass2L7;
import p000X.AnonymousClass40t;
import p000X.AnonymousClass56E;
import p000X.AnonymousClass7FO;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C140455zU;
import p000X.C184477uU;
import p000X.C184497uX;
import p000X.C184517uZ;
import p000X.C184527ua;
import p000X.C184557ud;
import p000X.C184567uf;
import p000X.C184577ug;
import p000X.C184587uh;
import p000X.C184677uq;
import p000X.C184737uw;
import p000X.C184767uz;
import p000X.C18600s7;
import p000X.C19020sn;
import p000X.C26321Cu;
import p000X.C26421Df;
import p000X.C27341Hl;
import p000X.C28351Lj;
import p000X.C59032gv;
import p000X.C68172yZ;

public class ClipsDraftsFragment extends C27341Hl implements AnonymousClass1HM, C184737uw {
    public AnonymousClass12M A00;
    public C184677uq A01;
    public AnonymousClass0C1 A02;
    public Button mDiscardDrafts;
    public View mDiscardDraftsDivider;
    public RecyclerView mRecyclerView;

    public final void configureActionBar(AnonymousClass1EX r4) {
        r4.Bo6(true);
        boolean z = this.A01.A00;
        int i = C0003R.string.drafts_fragments_actionbar_select_action;
        if (z) {
            i = C0003R.string.drafts_fragments_actionbar_cancel_action;
        }
        r4.A4H(i, new C184497uX(this));
        r4.BlI(C0003R.string.drafts_fragments_actionbar_title);
        r4.Bo0(true);
    }

    public final String getModuleName() {
        return "clips_drafts_fragment";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(ClipsDraftsFragment clipsDraftsFragment, AnonymousClass2L7 r8) {
        AnonymousClass56E A03 = C19020sn.A00.A04().A03(clipsDraftsFragment.A02);
        A03.A00.putBoolean("DirectPrivateStoryRecipientFragment.IS_DISPLAYED_IN_PARENT_FRAGMENT", true);
        A03.A00.putBoolean(AnonymousClass40t.$const$string(73), true);
        A03.A00.putParcelable(AnonymousClass40t.$const$string(72), IngestSessionShim.A00(Collections.singletonList(new C140455zU(r8.A06, true))));
        ShareMediaLoggingInfo shareMediaLoggingInfo = r8.A02;
        if (shareMediaLoggingInfo != null) {
            A03.A00.putParcelableArrayList(AnonymousClass40t.$const$string(198), new ArrayList(Collections.singletonList(shareMediaLoggingInfo)));
        }
        C184477uU A012 = C18600s7.A00.A01(clipsDraftsFragment.A02, r8.A05);
        A012.A00.putBoolean("ClipsConstants.ARG_CLIPS_SHARE_SHEET_IS_IN_EDIT_DRAFT_MODE ", true);
        Bundle bundle = new Bundle();
        AnonymousClass11J.A00(A012.A00.getString("IgSessionManager.SESSION_TOKEN_KEY"));
        bundle.putAll(A012.A00);
        bundle.putAll(A03.A00);
        new C59032gv(clipsDraftsFragment.A02, ModalActivity.class, "clips_share_sheet", bundle, clipsDraftsFragment.getActivity()).A07(clipsDraftsFragment, 9583);
    }

    public final void Awg(AnonymousClass2L7 r8) {
        if (r8.A06 == null || (PendingMediaStore.A01(this.A02).A04(r8.A06) == null && ((Boolean) AnonymousClass0L6.A02(this.A02, AnonymousClass0L7.REELS_V2_CONFIG, "is_clips_drafts_pending_media_fix_enabled", false, (AnonymousClass04H) null)).booleanValue())) {
            C68172yZ r3 = new C68172yZ(getRootActivity());
            r3.A00(getString(C0003R.string.loading));
            r3.show();
            C184577ug r6 = new C184577ug(AnonymousClass1L8.A00(this), getRootActivity(), this.A02);
            C184557ud r5 = new C184557ud(this, r8, r3);
            AudioOverlayTrack audioOverlayTrack = r8.A04;
            if (audioOverlayTrack != null) {
                C184527ua r4 = new C184527ua(r6.A00, r6.A02, audioOverlayTrack, new C184567uf(r6, r8, r5));
                r4.A04.A01(r4.A01, r4.A02, r4.A03);
                return;
            }
            C28351Lj.A00(r6.A00, r6.A01, new C184767uz(r6, r8, r5));
            return;
        }
        A00(this, r8);
    }

    public final void BC1(Set set) {
        int size = set.size();
        if (size > 0) {
            if (this.mDiscardDrafts.getVisibility() == 8) {
                this.mDiscardDraftsDivider.setVisibility(0);
                this.mDiscardDrafts.setVisibility(0);
            }
            this.mDiscardDrafts.setText(getResources().getString(C0003R.string.drafts_fragments_discard_button_text, new Object[]{Integer.valueOf(size)}));
            return;
        }
        this.mDiscardDraftsDivider.setVisibility(8);
        this.mDiscardDrafts.setVisibility(8);
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass1DU r0;
        super.onActivityResult(i, i2, intent);
        if (i == 9583 && i2 == 9683) {
            boolean booleanExtra = intent.getBooleanExtra("ClipsConstants.CLIPS_NAVIGATE_TO_FEED_AFTER_SHARE", false);
            C26321Cu r1 = (C26321Cu) C26421Df.A00();
            if (r1 != null) {
                r1.Bel();
                if (booleanExtra) {
                    r0 = AnonymousClass1DU.FEED;
                } else {
                    r0 = AnonymousClass1DU.SEARCH;
                }
                r1.Bl5(r0);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1542286321);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        Context context = getContext();
        AnonymousClass0a4.A06(context);
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(bundle2);
        this.A02 = A06;
        this.A00 = AnonymousClass12M.A00(context, A06);
        C184677uq r5 = new C184677uq(getContext(), (C06220Of.A09(context) - (C184587uh.A00(context) * 2)) / 3, Math.round(((float) ((C06220Of.A09(context) - (C184587uh.A00(context) * 2)) / 3)) / 0.6f), this);
        this.A01 = r5;
        this.A00.A06(r5);
        AnonymousClass0Z0.A09(-727369700, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(929473187);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_clips_drafts_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-2030285079, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(375622500);
        super.onDestroyView();
        this.A00.A07(this.A01);
        ClipsDraftsFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(-1254733322, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context context = getContext();
        AnonymousClass0a4.A06(context);
        this.mRecyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.recycler_view);
        this.mDiscardDrafts = (Button) view.findViewById(C0003R.C0005id.discard_drafts);
        this.mDiscardDraftsDivider = view.findViewById(C0003R.C0005id.discard_drafts_divider);
        this.mRecyclerView.setLayoutManager(new GridLayoutManager(3));
        this.mRecyclerView.A0r(new AnonymousClass7FO(C184587uh.A00(context), true));
        this.mRecyclerView.setAdapter(this.A01);
        this.mDiscardDrafts.setOnClickListener(new C184517uZ(this));
    }
}
