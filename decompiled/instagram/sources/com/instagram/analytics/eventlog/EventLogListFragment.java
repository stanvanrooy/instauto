package com.instagram.analytics.eventlog;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexStore;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.p009ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0RX;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass2NN;
import p000X.AnonymousClass5TJ;
import p000X.C06590Pq;
import p000X.C129605gd;
import p000X.C25737BXh;
import p000X.C25748BXs;
import p000X.C25750BXu;
import p000X.C25752BXx;
import p000X.C25753BXy;

public final class EventLogListFragment extends AnonymousClass2NN implements AnonymousClass1HK, AnonymousClass1HM, C129605gd, C25748BXs {
    public C25750BXu A00;
    public AnonymousClass0RX A01;
    public TypeaheadHeader A02;
    public String A03 = "";
    public C06590Pq A04;
    public final AnonymousClass5TJ A05 = new C25753BXy(this);

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.Bo6(true);
        r3.setTitle("Events List");
        r3.A4S("CLEAR LOGS", new C25752BXx(this));
    }

    public final String getModuleName() {
        return "events_list";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final boolean onBackPressed() {
        TypeaheadHeader typeaheadHeader = this.A02;
        if (typeaheadHeader == null) {
            return false;
        }
        typeaheadHeader.A01();
        return false;
    }

    public final void registerTextViewLogging(TextView textView) {
        AnonymousClass0WN.A01(this.A04).Ba2(textView);
    }

    public final void searchTextChanged(String str) {
        this.A03 = str;
        List<AnalyticsEventDebugInfo> A012 = this.A01.A01();
        if (!TextUtils.isEmpty(this.A03)) {
            String[] split = str.toLowerCase().trim().split("\\s+");
            ArrayList arrayList = new ArrayList();
            for (AnalyticsEventDebugInfo analyticsEventDebugInfo : A012) {
                int length = split.length;
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = true;
                        break;
                    }
                    if (!analyticsEventDebugInfo.A01.contains(split[i])) {
                        break;
                    }
                    i++;
                }
                if (z) {
                    arrayList.add(analyticsEventDebugInfo);
                }
            }
            this.A00.A01(arrayList);
            return;
        }
        this.A00.A01(A012);
    }

    public final void B2u(AnalyticsEventDebugInfo analyticsEventDebugInfo) {
        C25737BXh.A00(getActivity(), this.A04, analyticsEventDebugInfo).A02();
    }

    public final C06590Pq getSession() {
        return this.A04;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1615736047);
        super.onCreate(bundle);
        this.A04 = AnonymousClass0J1.A00(this.mArguments);
        AnonymousClass0RX A002 = AnonymousClass0RX.A00();
        this.A01 = A002;
        C25750BXu bXu = new C25750BXu(getContext(), A002.A01(), this, this.A05);
        this.A00 = bXu;
        setListAdapter(bXu);
        AnonymousClass0Z0.A09(-547921649, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1528049296);
        TypeaheadHeader typeaheadHeader = new TypeaheadHeader(layoutInflater.getContext());
        this.A02 = typeaheadHeader;
        typeaheadHeader.setDelegate(this);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        AnonymousClass0Z0.A09(1687399578, A022);
        return onCreateView;
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-1880443609);
        super.onPause();
        TypeaheadHeader typeaheadHeader = this.A02;
        if (typeaheadHeader != null) {
            typeaheadHeader.A01();
        }
        AnonymousClass0Z0.A09(-382181437, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-5564384);
        super.onResume();
        this.A00.A01(this.A01.A01());
        this.A02.A04(this.A03);
        AnonymousClass0Z0.A09(1125711930, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A02.A03(getContext().getString(C0003R.string.rageshake_search_event_logs_hint));
        getListView().setOnScrollListener(this.A02);
        getListView().setDescendantFocusability(DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
    }
}
