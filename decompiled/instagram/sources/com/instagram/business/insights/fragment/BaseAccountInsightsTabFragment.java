package com.instagram.business.insights.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.C06590Pq;
import p000X.C27282C6u;
import p000X.C27283C6v;
import p000X.C27289C7d;
import p000X.C27341Hl;
import p000X.C27355CAa;
import p000X.C73;

public abstract class BaseAccountInsightsTabFragment extends C27341Hl {
    public C27355CAa A00;
    public ViewStub mContentViewStub;
    public View mErrorView;
    public SpinnerImageView mLoading;
    public IgTextView mTextViewErrorMessage;

    public void A05() {
        if (this instanceof InsightsContentFragment) {
            C27289C7d c7d = ((InsightsContentFragment) this).A00;
            if (c7d != null) {
                c7d.A01();
            }
        } else if (!(this instanceof InsightsAudienceFragment)) {
            AccountInsightsActivityFragment accountInsightsActivityFragment = (AccountInsightsActivityFragment) this;
            accountInsightsActivityFragment.A07();
            C27282C6u c6u = accountInsightsActivityFragment.A00;
            if (c6u != null) {
                c6u.A01();
            }
        } else {
            C27283C6v c6v = ((InsightsAudienceFragment) this).A00;
            if (c6v != null) {
                c6v.A02();
            }
        }
    }

    public final void A06() {
        this.mLoading.setVisibility(8);
        this.mErrorView.setVisibility(0);
        this.mTextViewErrorMessage.setVisibility(8);
        this.mContentViewStub.setVisibility(8);
    }

    public final void A07() {
        this.mLoading.setVisibility(0);
        this.mErrorView.setVisibility(8);
        this.mTextViewErrorMessage.setVisibility(8);
        this.mContentViewStub.setVisibility(8);
    }

    public C06590Pq getSession() {
        Bundle bundle = this.mArguments;
        AnonymousClass0a4.A06(bundle);
        return AnonymousClass0J1.A06(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0Z0.A02(-360132371);
        View inflate = layoutInflater.inflate(C0003R.layout.base_account_insights_tab_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(1287937225, A02);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mLoading = (SpinnerImageView) view.findViewById(C0003R.C0005id.account_insights_tab_loading_spinner);
        this.mErrorView = view.findViewById(C0003R.C0005id.account_insights_tab_error_view);
        this.mContentViewStub = (ViewStub) view.findViewById(C0003R.C0005id.content_view_stub);
        this.mTextViewErrorMessage = (IgTextView) view.findViewById(C0003R.C0005id.account_insights_tab_single_error_message);
        view.findViewById(C0003R.C0005id.error_loading_retry).setOnClickListener(new C73(this));
    }
}
