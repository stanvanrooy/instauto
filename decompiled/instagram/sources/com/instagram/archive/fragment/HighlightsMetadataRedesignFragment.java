package com.instagram.archive.fragment;

import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.venue.Venue;
import java.util.ArrayList;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass5DP;
import p000X.AnonymousClass5O1;
import p000X.AnonymousClass5O6;
import p000X.AnonymousClass5OS;
import p000X.AnonymousClass5Oa;
import p000X.AnonymousClass6K4;
import p000X.C06340Or;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C122825Ob;
import p000X.C122835Oc;
import p000X.C122875Ok;
import p000X.C122905Op;
import p000X.C122935Os;
import p000X.C122965Ox;
import p000X.C160316si;
import p000X.C160406sr;
import p000X.C161466ui;
import p000X.C16330oQ;
import p000X.C23300zv;
import p000X.C27341Hl;
import p000X.C34151eA;
import p000X.C34181eD;
import p000X.C52362Om;

public class HighlightsMetadataRedesignFragment extends C27341Hl implements AnonymousClass1HM, C160406sr, C122905Op {
    public C11200ea A00 = new C122835Oc(this);
    public AnonymousClass5O6 A01;
    public AnonymousClass5O1 A02;
    public AnonymousClass0C1 A03;
    public C122875Ok mAddHashtagsRowController;
    public IgImageView mCoverImageView;
    public View mEditCoverImageButton;
    public C160316si mLocationSuggestionsRow;

    public final String getModuleName() {
        return "reel_highlights_cover_title";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void B6T(List list) {
        this.A01.A04 = list;
    }

    public final void B9o() {
        this.A01.A01 = null;
    }

    public final void B9r() {
        C52362Om r4 = new C52362Om(getActivity(), this.A03);
        C16330oQ.A00.A03();
        r4.A02 = C161466ui.A00(AnonymousClass6K4.A00(Constants.A0N), (Location) null, -1);
        r4.A02();
    }

    public final void B9s(Venue venue, int i) {
        this.A01.A01 = venue;
        C160316si r1 = this.mLocationSuggestionsRow;
        r1.A01 = venue;
        if (venue != null) {
            C160316si.A00(r1, Constants.ONE);
        }
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.setTitle(getResources().getString(C0003R.string.name_title));
        boolean z = false;
        if (this.mFragmentManager.A0I() > 0) {
            z = true;
        }
        r3.Bo6(z);
        r3.A4I(getResources().getString(C0003R.string.done), new AnonymousClass5OS(this));
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(720316204);
        super.onCreate(bundle);
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(this.mArguments);
        this.A03 = A06;
        this.A01 = AnonymousClass5O6.A00(A06);
        AnonymousClass5O1 r4 = new AnonymousClass5O1(this.A03, getActivity(), this.mFragmentManager, AnonymousClass1L8.A00(this), this.A01, (AnonymousClass5DP) this.mArguments.getSerializable("highlight_management_source"));
        this.A02 = r4;
        registerLifecycleListener(r4);
        C23300zv.A00(this.A03).A02(C122965Ox.class, this.A00);
        AnonymousClass0Z0.A09(-70138728, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(889583687);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_highlights_metadata_redesign_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(1031664121, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-570657843);
        super.onDestroy();
        C23300zv.A00(this.A03).A03(C122965Ox.class, this.A00);
        AnonymousClass0Z0.A09(-1903156735, A022);
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0Z0.A02(719940108);
        super.onResume();
        AnonymousClass5O6 r3 = this.A01;
        C122935Os r0 = r3.A00;
        boolean z = true;
        if (r0 != null && ((str = r0.A03) == null || r3.A05.containsKey(str))) {
            z = false;
        }
        if (z) {
            this.A01.A05(getActivity());
        }
        FragmentActivity activity = getActivity();
        AnonymousClass0C1 r32 = this.A03;
        IgImageView igImageView = this.mCoverImageView;
        ImageUrl imageUrl = this.A01.A00.A02;
        if (imageUrl == null) {
            imageUrl = new SimpleImageUrl("");
        }
        igImageView.setImageRenderer(new AnonymousClass5Oa(r32, activity));
        igImageView.setUrl(imageUrl);
        AnonymousClass0Z0.A09(-1020276507, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C0003R.C0005id.highlight_cover_image);
        AnonymousClass0a4.A06(findViewById);
        this.mCoverImageView = (IgImageView) findViewById;
        View findViewById2 = view.findViewById(C0003R.C0005id.edit_highlight_cover_button);
        AnonymousClass0a4.A06(findViewById2);
        this.mEditCoverImageButton = findViewById2;
        C122825Ob r1 = new C122825Ob(this);
        findViewById2.setOnClickListener(r1);
        this.mCoverImageView.setOnClickListener(r1);
        View findViewById3 = view.findViewById(C0003R.C0005id.metadata_location_row);
        AnonymousClass0a4.A06(findViewById3);
        C160316si r12 = new C160316si(findViewById3);
        this.mLocationSuggestionsRow = r12;
        r12.A01(this, this.A01.A01);
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass1NJ A18 : new ArrayList(this.A01.A07.values())) {
            List A182 = A18.A18(C34181eD.LOCATION);
            if (A182 != null && !A182.isEmpty()) {
                arrayList.add(((C34151eA) A182.get(0)).A0I);
            }
        }
        if (!arrayList.isEmpty()) {
            this.mLocationSuggestionsRow.A02(arrayList);
            C160316si r13 = this.mLocationSuggestionsRow;
            C160316si.A00(r13, r13.A02);
        }
        View findViewById4 = view.findViewById(C0003R.C0005id.metadata_hashtag_row);
        AnonymousClass0a4.A06(findViewById4);
        this.mAddHashtagsRowController = new C122875Ok(this, findViewById4, this.A03, getModuleName(), this.A01.A04, getResources().getString(C0003R.string.add_hashtags_notice));
        C06340Or.A03((TextView) view.findViewById(C0003R.C0005id.disclaimer_row), getResources().getDimensionPixelSize(C0003R.dimen.redesign_disclaimer_line_height));
    }
}
