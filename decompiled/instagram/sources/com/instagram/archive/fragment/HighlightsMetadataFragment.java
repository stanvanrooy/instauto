package com.instagram.archive.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass5DP;
import p000X.AnonymousClass5O1;
import p000X.AnonymousClass5O6;
import p000X.AnonymousClass5OR;
import p000X.AnonymousClass5OU;
import p000X.AnonymousClass5Oa;
import p000X.C06590Pq;
import p000X.C122935Os;
import p000X.C27341Hl;

public class HighlightsMetadataFragment extends C27341Hl implements AnonymousClass1HM {
    public AnonymousClass5O1 A00;
    public AnonymousClass0C1 A01;
    public AnonymousClass5O6 A02;
    public IgImageView mCoverImageView;
    public View mEditCoverImageButton;

    public final String getModuleName() {
        return "reel_highlights_cover_title";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.setTitle(getResources().getString(C0003R.string.name_title));
        boolean z = false;
        if (this.mFragmentManager.A0I() > 0) {
            z = true;
        }
        r3.Bo6(z);
        r3.A4I(getResources().getString(C0003R.string.done), new AnonymousClass5OR(this));
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(225840519);
        super.onCreate(bundle);
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(this.mArguments);
        this.A01 = A06;
        this.A02 = AnonymousClass5O6.A00(A06);
        AnonymousClass5O1 r3 = new AnonymousClass5O1(this.A01, getActivity(), this.mFragmentManager, AnonymousClass1L8.A00(this), this.A02, (AnonymousClass5DP) this.mArguments.getSerializable("highlight_management_source"));
        this.A00 = r3;
        registerLifecycleListener(r3);
        AnonymousClass0Z0.A09(-2051257162, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-674533194);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_highlights_metadata_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-1354970823, A022);
        return inflate;
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0Z0.A02(16514081);
        super.onResume();
        AnonymousClass5O6 r3 = this.A02;
        C122935Os r0 = r3.A00;
        boolean z = true;
        if (r0 != null && ((str = r0.A03) == null || r3.A05.containsKey(str))) {
            z = false;
        }
        if (z) {
            this.A02.A05(getActivity());
        }
        FragmentActivity activity = getActivity();
        AnonymousClass0C1 r32 = this.A01;
        IgImageView igImageView = this.mCoverImageView;
        ImageUrl imageUrl = this.A02.A00.A02;
        if (imageUrl == null) {
            imageUrl = new SimpleImageUrl("");
        }
        igImageView.setImageRenderer(new AnonymousClass5Oa(r32, activity));
        igImageView.setUrl(imageUrl);
        AnonymousClass0Z0.A09(-1999090712, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mCoverImageView = (IgImageView) view.findViewById(C0003R.C0005id.highlight_cover_image);
        View findViewById = view.findViewById(C0003R.C0005id.edit_highlight_cover_button);
        this.mEditCoverImageButton = findViewById;
        AnonymousClass5OU r1 = new AnonymousClass5OU(this);
        findViewById.setOnClickListener(r1);
        this.mCoverImageView.setOnClickListener(r1);
    }
}
