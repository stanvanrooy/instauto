package com.instagram.creation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.creation.base.CreationSession;
import com.instagram.p009ui.emptystaterow.EmptyStateView;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass2NN;
import p000X.AnonymousClass2NV;
import p000X.AnonymousClass814;
import p000X.C06590Pq;
import p000X.C160646tG;
import p000X.C160656tH;
import p000X.C161106u5;
import p000X.C182797rM;

public class ThumbnailPreviewFragment extends AnonymousClass2NN {
    public static final AnonymousClass2NV A03 = AnonymousClass2NV.A01;
    public C160646tG A00;
    public AnonymousClass0C1 A01;
    public C161106u5 A02;
    public View mContainer;
    public EmptyStateView mEmptyStateView;

    public final String getModuleName() {
        return "metadata_thumbnail_preview";
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1504068968);
        super.onCreate(bundle);
        CreationSession AJ7 = ((C182797rM) getContext()).AJ7();
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(bundle2);
        this.A01 = A06;
        Context context = getContext();
        C161106u5 r6 = (C161106u5) context;
        this.A02 = r6;
        this.A00 = new C160646tG(context, AJ7, A06, r6, A03, this);
        AnonymousClass0Z0.A09(-858169238, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1484800811);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(C0003R.layout.fragment_thumbnail_preview, viewGroup, false);
        AnonymousClass0Z0.A09(1575442222, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1707289080);
        super.onDestroyView();
        ThumbnailPreviewFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(536000550, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-1326168773);
        super.onPause();
        for (AnonymousClass814 A032 : this.A00.A01.A03) {
            A032.A03();
        }
        AnonymousClass0Z0.A09(-1133041808, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(1933910440);
        super.onResume();
        for (AnonymousClass814 A05 : this.A00.A01.A03) {
            A05.A05();
        }
        AnonymousClass0Z0.A09(963987410, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mContainer = view;
        this.mEmptyStateView = (EmptyStateView) getListView().getEmptyView();
        this.A02.BZq(new C160656tH(this));
    }
}
