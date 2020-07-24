package com.instagram.archive.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;
import com.instagram.p009ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass172;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass2NF;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass3DK;
import p000X.AnonymousClass3DN;
import p000X.AnonymousClass5DP;
import p000X.AnonymousClass5ET;
import p000X.AnonymousClass5N7;
import p000X.AnonymousClass5O4;
import p000X.AnonymousClass5O5;
import p000X.AnonymousClass5O6;
import p000X.AnonymousClass5O9;
import p000X.AnonymousClass5OW;
import p000X.AnonymousClass5OX;
import p000X.AnonymousClass5Oa;
import p000X.AnonymousClass5Od;
import p000X.AnonymousClass5Oe;
import p000X.AnonymousClass6K4;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C122805Ny;
import p000X.C122845Of;
import p000X.C122855Og;
import p000X.C122865Oh;
import p000X.C122875Ok;
import p000X.C122895Om;
import p000X.C122905Op;
import p000X.C122965Ox;
import p000X.C124335Uj;
import p000X.C1429669n;
import p000X.C160316si;
import p000X.C160406sr;
import p000X.C161466ui;
import p000X.C16270oK;
import p000X.C16330oQ;
import p000X.C17020pY;
import p000X.C17510qM;
import p000X.C23300zv;
import p000X.C26441Dh;
import p000X.C27341Hl;
import p000X.C52362Om;
import p000X.C52382Oo;

public class ManageHighlightsFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, C160406sr, AnonymousClass2NF, AnonymousClass5O9, AnonymousClass5N7, AnonymousClass5O5, C122905Op {
    public AnonymousClass5O6 A00;
    public C122845Of A01;
    public AnonymousClass5DP A02;
    public AnonymousClass0C1 A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public List A07;
    public final C11200ea A08 = new AnonymousClass5Od(this);
    public C122875Ok mAddHashtagsRowController;
    public C160316si mLocationSuggestionsRow;
    public AnonymousClass5ET mShoppingAutohighlightSettingRowController;
    public AnonymousClass3DK mTabbedFragmentController;

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public static void A00(ManageHighlightsFragment manageHighlightsFragment) {
        AnonymousClass5O6.A03(manageHighlightsFragment.A03);
        manageHighlightsFragment.A00 = null;
        if (!manageHighlightsFragment.A06) {
            synchronized (C1429669n.class) {
                if (C1429669n.A01 != null) {
                    C1429669n.A01 = null;
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1HD AAG(Object obj) {
        switch (((C122845Of) obj).ordinal()) {
            case 0:
                C124335Uj r1 = new C124335Uj();
                r1.setArguments(this.mArguments);
                return r1;
            case 1:
                Bundle bundle = this.mArguments;
                bundle.putSerializable("highlight_management_source", this.A02);
                bundle.putBoolean("hide_footer", true);
                C16270oK.A00.A01();
                ArchiveReelFragment archiveReelFragment = new ArchiveReelFragment();
                archiveReelFragment.setArguments(bundle);
                return archiveReelFragment;
            default:
                throw new IllegalArgumentException("invalid position");
        }
    }

    public final AnonymousClass3DN AB4(Object obj) {
        return AnonymousClass3DN.A00(((C122845Of) obj).A00);
    }

    public final void B6T(List list) {
        this.A00.A04 = list;
    }

    public final void B9o() {
        this.A00.A01 = null;
    }

    public final void B9r() {
        C52362Om r4 = new C52362Om(getActivity(), this.A03);
        C16330oQ.A00.A03();
        r4.A02 = C161466ui.A00(AnonymousClass6K4.A00(Constants.A0N), (Location) null, -1);
        r4.A02();
    }

    public final void B9s(Venue venue, int i) {
        this.A00.A01 = venue;
        C160316si r1 = this.mLocationSuggestionsRow;
        r1.A01 = venue;
        if (venue != null) {
            C160316si.A00(r1, Constants.ONE);
        }
    }

    public final /* bridge */ /* synthetic */ void BQo(Object obj) {
        C122845Of r4 = (C122845Of) obj;
        if (isResumed() && r4 != this.A01) {
            C26441Dh.A00(this.A03).A07(this, this.mFragmentManager.A0I(), getModuleName());
            ((C52382Oo) this.mTabbedFragmentController.A02(this.A01)).BDV();
            this.A01 = r4;
            C26441Dh.A00(this.A03).A06(this);
            ((C52382Oo) this.mTabbedFragmentController.A02(this.A01)).BDh();
        }
    }

    public final String getModuleName() {
        if (this.A01 == C122845Of.SELECTED) {
            return "edit_reel_highlights";
        }
        return "reel_highlights_gallery";
    }

    public final boolean onBackPressed() {
        AnonymousClass5O6 r0;
        if (this.A05) {
            this.A05 = false;
            return false;
        }
        if (this.A06 && (r0 = this.A00) != null) {
            if (!r0.A04().A00()) {
                AnonymousClass2OA r2 = new AnonymousClass2OA(getContext());
                r2.A07(C0003R.string.suggested_highlight_discard_changes_dialog_title);
                r2.A06(C0003R.string.suggested_highlight_discard_changes_dialog_body);
                r2.A09(C0003R.string.suggested_highlight_discard_changes_dialog_discard_button, new AnonymousClass5Oe(this));
                r2.A0A(C0003R.string.suggested_highlight_discard_changes_dialog_keep_button, (DialogInterface.OnClickListener) null);
                r2.A03().show();
                return true;
            }
            A00(this);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x005e, code lost:
        if (r3 == p000X.AnonymousClass172.A0B) goto L_0x0060;
     */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        View inflate;
        EditText editText;
        View view2 = view;
        super.onViewCreated(view2, bundle);
        AnonymousClass3DK r3 = new AnonymousClass3DK(this, getChildFragmentManager(), (ViewPager) view2.findViewById(C0003R.C0005id.tabs_viewpager), (FixedTabBar) view2.findViewById(C0003R.C0005id.fixed_tabbar_view), this.A07);
        this.mTabbedFragmentController = r3;
        C122845Of r2 = C122845Of.SELECTED;
        r3.A03(r2);
        this.A01 = r2;
        this.A00.A06.add(this);
        FrameLayout frameLayout = (FrameLayout) view2.findViewById(C0003R.C0005id.edit_highlights_metadata_container);
        Reel A0G = C17020pY.A00().A0Q(this.A03).A0G(this.A04);
        this.A00.A07(A0G);
        AnonymousClass172 r32 = A0G.A0I;
        if (r32 != AnonymousClass172.SHOPPING_AUTOHIGHLIGHT) {
            z = false;
        }
        z = true;
        AnonymousClass5O6 r5 = this.A00;
        ImageUrl imageUrl = r5.A00.A02;
        if (imageUrl == null) {
            imageUrl = new SimpleImageUrl("");
        }
        C122895Om r33 = new C122895Om(imageUrl, r5.A02, !z);
        if (z || !((Boolean) AnonymousClass0L6.A02(this.A03, AnonymousClass0L7.JP_HIGHLIGHTS_METADATA, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            inflate = LayoutInflater.from(frameLayout.getContext()).inflate(C0003R.layout.layout_edit_highlights_metadata, frameLayout, false);
            inflate.setTag(new C122855Og(inflate.findViewById(C0003R.C0005id.highlight_cover_container), (CircularImageView) inflate.findViewById(C0003R.C0005id.highlight_cover_image), inflate.findViewById(C0003R.C0005id.highlight_title_container), (EditText) inflate.findViewById(C0003R.C0005id.highlight_title), (TextView) inflate.findViewById(C0003R.C0005id.edit_cover_link)));
            Context context = getContext();
            AnonymousClass0C1 r8 = this.A03;
            C122855Og r7 = (C122855Og) inflate.getTag();
            CircularImageView circularImageView = r7.A04;
            ImageUrl imageUrl2 = r33.A00;
            circularImageView.setImageRenderer(new AnonymousClass5Oa(r8, context));
            circularImageView.setUrl(imageUrl2);
            r7.A03.setEnabled(!AnonymousClass5O6.A00(r8).A05.isEmpty());
            r7.A00.setOnClickListener(new AnonymousClass5OX(r8, this));
            if (r33.A02) {
                r7.A01.setVisibility(0);
                r7.A02.setText(r33.A01);
                EditText editText2 = r7.A02;
                editText2.setSelection(editText2.getText().length());
                editText = r7.A02;
            } else {
                r7.A01.setVisibility(8);
                frameLayout.addView(inflate);
                this.mShoppingAutohighlightSettingRowController = C17510qM.A00.A0c(requireContext(), this, this.A03, this, AnonymousClass1L8.A00(this), A0G, (ViewStub) view2.findViewById(C0003R.C0005id.shopping_autohighlight_setting_row_stub));
            }
        } else {
            inflate = LayoutInflater.from(frameLayout.getContext()).inflate(C0003R.layout.layout_edit_highlights_metadata_redesign, frameLayout, false);
            View findViewById = inflate.findViewById(C0003R.C0005id.highlight_cover_container);
            AnonymousClass0a4.A06(findViewById);
            View findViewById2 = inflate.findViewById(C0003R.C0005id.highlight_cover_image);
            AnonymousClass0a4.A06(findViewById2);
            View findViewById3 = inflate.findViewById(C0003R.C0005id.highlight_title);
            AnonymousClass0a4.A06(findViewById3);
            View findViewById4 = inflate.findViewById(C0003R.C0005id.edit_cover_link);
            AnonymousClass0a4.A06(findViewById4);
            inflate.setTag(new C122865Oh(findViewById, (CircularImageView) findViewById2, (EditText) findViewById3, (TextView) findViewById4));
            View findViewById5 = inflate.findViewById(C0003R.C0005id.metadata_location_row);
            AnonymousClass0a4.A06(findViewById5);
            C160316si r6 = new C160316si(findViewById5);
            this.mLocationSuggestionsRow = r6;
            r6.A01(this, this.A00.A01);
            View findViewById6 = inflate.findViewById(C0003R.C0005id.metadata_hashtag_row);
            AnonymousClass0a4.A06(findViewById6);
            AnonymousClass0C1 r82 = this.A03;
            AnonymousClass0C1 r16 = r82;
            this.mAddHashtagsRowController = new C122875Ok(this, findViewById6, r16, getModuleName(), this.A00.A04, getResources().getString(C0003R.string.add_hashtags_notice));
            Context context2 = getContext();
            AnonymousClass0C1 r83 = this.A03;
            C122865Oh r72 = (C122865Oh) inflate.getTag();
            CircularImageView circularImageView2 = r72.A03;
            ImageUrl imageUrl3 = r33.A00;
            circularImageView2.setImageRenderer(new AnonymousClass5Oa(r83, context2));
            circularImageView2.setUrl(imageUrl3);
            r72.A02.setEnabled(!AnonymousClass5O6.A00(r83).A05.isEmpty());
            r72.A00.setOnClickListener(new AnonymousClass5OW(r83, this));
            r72.A01.setText(r33.A01);
            EditText editText3 = r72.A01;
            editText3.setSelection(editText3.getText().length());
            editText = r72.A01;
        }
        editText.addTextChangedListener(new AnonymousClass5O4(editText, this));
        frameLayout.addView(inflate);
        this.mShoppingAutohighlightSettingRowController = C17510qM.A00.A0c(requireContext(), this, this.A03, this, AnonymousClass1L8.A00(this), A0G, (ViewStub) view2.findViewById(C0003R.C0005id.shopping_autohighlight_setting_row_stub));
    }

    public final void A51(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            trim = getString(C0003R.string.highlights_name_hint);
        }
        AnonymousClass5O6.A00(this.A03).A02 = trim;
        BaseFragmentActivity.A00(AnonymousClass1EW.A03(getActivity()));
    }

    public final void AzX() {
        getActivity().setResult(-1);
        getActivity().finish();
    }

    public final void BB5() {
        BaseFragmentActivity.A00(AnonymousClass1EW.A03(getActivity()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r1 == false) goto L_0x0026;
     */
    public final void configureActionBar(AnonymousClass1EX r4) {
        boolean z;
        AnonymousClass5O6 r0;
        r4.BlI(C0003R.string.highlights_management_title);
        r4.Bo6(true);
        r4.Bo0(false);
        if (this.A06 && (r0 = this.A00) != null) {
            boolean isEmpty = r0.A05.keySet().isEmpty();
            z = false;
        }
        z = true;
        if (!z) {
            r4.A4R(getResources().getString(C0003R.string.done));
        } else {
            r4.A4S(getResources().getString(C0003R.string.done), new C122805Ny(this));
        }
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-510116525);
        super.onCreate(bundle);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(this.mArguments);
        this.A03 = A062;
        AnonymousClass5O6.A03(A062);
        this.A00 = AnonymousClass5O6.A00(this.A03);
        this.A04 = this.mArguments.getString("edit_highlights_reel_id");
        this.A06 = this.mArguments.getBoolean("edit_highlights_is_suggested_highlight", false);
        this.A02 = (AnonymousClass5DP) this.mArguments.getSerializable("highlight_management_source");
        ArrayList arrayList = new ArrayList();
        this.A07 = arrayList;
        arrayList.add(C122845Of.SELECTED);
        this.A07.add(C122845Of.ARCHIVE);
        C23300zv.A00(this.A03).A02(C122965Ox.class, this.A08);
        AnonymousClass0Z0.A09(384228140, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-2122518221);
        View inflate = layoutInflater.inflate(C0003R.layout.archive_tabbed_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(1175930167, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-1699358563);
        super.onDestroy();
        C23300zv.A00(this.A03).A03(C122965Ox.class, this.A08);
        AnonymousClass0Z0.A09(1208224728, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-2051229930);
        super.onDestroyView();
        AnonymousClass5O6 r0 = this.A00;
        if (r0 != null) {
            r0.A06.remove(this);
        }
        AnonymousClass0Z0.A09(2114966907, A022);
    }

    public final void BDg(Object obj, int i, float f, float f2) {
    }
}
