package com.instagram.direct.fragment.visual;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass4KU;
import p000X.AnonymousClass4PN;
import p000X.C06590Pq;
import p000X.C15890nh;
import p000X.C17850qu;
import p000X.C27341Hl;
import p000X.C98274Mk;
import p000X.C98284Mm;
import p000X.C98304Mo;
import p000X.C98334Mr;

public class DirectVisualMessageActionLogPriorityFragment extends C27341Hl {
    public View.OnClickListener A00;
    public C98304Mo A01;
    public C06590Pq A02;
    public C98274Mk A03;
    public SpinnerImageView mSpinner;

    public final String getModuleName() {
        return "direct_story_action_log_priority_fragment";
    }

    public static void A00(DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment) {
        C98274Mk r5 = directVisualMessageActionLogPriorityFragment.A03;
        AnonymousClass0C1 r0 = r5.A02;
        String str = r5.A04;
        String str2 = r5.A03;
        C15890nh r2 = new C15890nh(r0);
        r2.A09 = Constants.A0N;
        r2.A0E("direct_v2/visual_action_log/%s/item/%s/", str, str2);
        r2.A06(AnonymousClass4PN.class, false);
        C17850qu A032 = r2.A03();
        A032.A00 = new C98284Mm(r5, r5.A02);
        directVisualMessageActionLogPriorityFragment.schedule(A032);
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1684508102);
        super.onCreate(bundle);
        this.A02 = AnonymousClass0J1.A00(this.mArguments);
        this.A03 = new C98274Mk(this.mArguments, this, getContext());
        this.A01 = new C98334Mr(this);
        AnonymousClass0Z0.A09(-531196968, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1685277967);
        View inflate = layoutInflater.inflate(C0003R.layout.fragment_direct_recycler_view_with_header, viewGroup, false);
        AnonymousClass0Z0.A09(2110200656, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1042420617);
        super.onDestroyView();
        this.mSpinner = null;
        AnonymousClass0Z0.A09(-1676227200, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.A0w(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.A01);
        this.mSpinner = (SpinnerImageView) view.findViewById(C0003R.C0005id.direct_recycler_view_spinner);
        view.findViewById(C0003R.C0005id.header_done_button).setOnClickListener(new AnonymousClass4KU(this));
        A00(this);
    }
}
