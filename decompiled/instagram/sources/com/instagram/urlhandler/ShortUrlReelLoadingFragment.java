package com.instagram.urlhandler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass6U0;
import p000X.AnonymousClass6U4;
import p000X.C06590Pq;
import p000X.C168617Hz;
import p000X.C17850qu;
import p000X.C27341Hl;
import p000X.C33431cu;

public class ShortUrlReelLoadingFragment extends C27341Hl implements C33431cu {
    public AnonymousClass0C1 A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public SpinnerImageView mLoadingSpinner;

    public final boolean Ae1() {
        return true;
    }

    public final String getModuleName() {
        return "short_url_reel_loading_fragment";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        r4.Bgz(C0003R.layout.action_bar_title_logo, getResources().getDimensionPixelSize(C0003R.dimen.action_bar_item_padding), 0);
        r4.Bo6(true);
    }

    public final C06590Pq getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0Z0.A02(1093598984);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0J1.A06(this.mArguments);
        String string = this.mArguments.getString("com.instagram.url.constants.ARGUMENTS_KEY_REEL_SHORT_URL");
        if (string != null) {
            C17850qu A002 = AnonymousClass6U4.A00(this.A00, string);
            A002.A00 = new AnonymousClass6U0(this, string);
            schedule(A002);
        }
        AnonymousClass0Z0.A09(2123274985, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0Z0.A02(97141266);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_loading_spinner, viewGroup, false);
        AnonymousClass0Z0.A09(-2033194381, A02);
        return inflate;
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0Z0.A02(-2945900);
        super.onDestroyView();
        this.mLoadingSpinner = null;
        AnonymousClass0Z0.A09(428156710, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SpinnerImageView spinnerImageView = (SpinnerImageView) view.findViewById(C0003R.C0005id.loading_spinner);
        this.mLoadingSpinner = spinnerImageView;
        spinnerImageView.setLoadingStatus(C168617Hz.LOADING);
    }
}
