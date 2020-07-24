package com.instagram.igtv.viewer.edit;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.model.mediasize.ExtendedImageUrl;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1PZ;
import p000X.AnonymousClass2UC;
import p000X.AnonymousClass2UD;
import p000X.AnonymousClass3AD;
import p000X.AnonymousClass77r;
import p000X.AnonymousClass77u;
import p000X.AnonymousClass7B9;
import p000X.AnonymousClass9LP;
import p000X.C06590Pq;
import p000X.C13150hy;
import p000X.C16160o8;
import p000X.C1646370j;
import p000X.C1663277i;
import p000X.C1663677m;
import p000X.C1663777o;
import p000X.C1663877p;
import p000X.C1663977q;
import p000X.C1664077s;
import p000X.C17850qu;
import p000X.C26571Ea;
import p000X.instagramComment;
import p000X.C36901in;
import p000X.C37141jB;
import p000X.C37591ju;
import p000X.C98234Mf;

public class IGTVEditMetadataFragment extends C1663277i implements AnonymousClass1HK {
    public Handler A00;
    public AnonymousClass1NJ A01;
    public C1646370j A02;
    public AnonymousClass0C1 A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = false;
    public View mMonetizationRowViewStub;
    public View mSaveButton;
    public View mView;

    public final String getModuleName() {
        return "igtv_edit_metadata_fragment";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        if (r1 == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010d, code lost:
        if (r5.A01() == false) goto L_0x010f;
     */
    public static void A00(IGTVEditMetadataFragment iGTVEditMetadataFragment, AnonymousClass1NJ r9) {
        boolean z;
        boolean z2;
        iGTVEditMetadataFragment.A01 = r9;
        ExtendedImageUrl A0S = r9.A0S(iGTVEditMetadataFragment.getContext());
        String str = iGTVEditMetadataFragment.A01.A2F;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        iGTVEditMetadataFragment.A0D(str);
        instagramComment r2 = iGTVEditMetadataFragment.A01.A0K;
        if (!(r2 == null || r9.A0K.commentText == null)) {
            str2 = r2.commentText;
        }
        iGTVEditMetadataFragment.A0C(str2);
        if (A0S != null && !TextUtils.isEmpty(A0S.AZc())) {
            C1663677m r3 = iGTVEditMetadataFragment.A03;
            if (r3 == null) {
                C13150hy.A03("mediaPreview");
            }
            String moduleName = iGTVEditMetadataFragment.getModuleName();
            C13150hy.A02(A0S, "typedUrl");
            C13150hy.A02(moduleName, "sourceModule");
            AnonymousClass3AD r1 = r3.A00;
            r1.A01(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            r1.A03(false);
            r3.A01.setUrl((ImageUrl) A0S, moduleName);
        }
        if (iGTVEditMetadataFragment.A01.A0V != null) {
            ViewGroup viewGroup = iGTVEditMetadataFragment.A00;
            if (viewGroup == null) {
                C13150hy.A03("seriesContainer");
            }
            viewGroup.setVisibility(8);
            TextView textView = iGTVEditMetadataFragment.A01;
            if (textView == null) {
                C13150hy.A03("currentSeriesInfo");
            }
            textView.setVisibility(8);
        }
        AnonymousClass77u r0 = iGTVEditMetadataFragment.A01.A0U;
        if (r0 != null) {
            boolean z3 = r0.A01;
            z = true;
        }
        z = false;
        iGTVEditMetadataFragment.A06 = z;
        if (C98234Mf.A00.A00(iGTVEditMetadataFragment.A03)) {
            AnonymousClass7B9 r5 = new AnonymousClass7B9(iGTVEditMetadataFragment.A03, iGTVEditMetadataFragment.requireContext());
            View A012 = new C26571Ea((ViewStub) iGTVEditMetadataFragment.mView.findViewById(C0003R.C0005id.monetization_container_stub)).A01();
            iGTVEditMetadataFragment.mMonetizationRowViewStub = A012;
            if (A012 != null) {
                TextView textView2 = (TextView) A012.findViewById(C0003R.C0005id.title);
                TextView textView3 = (TextView) iGTVEditMetadataFragment.mMonetizationRowViewStub.findViewById(C0003R.C0005id.description);
                if (!r5.A01()) {
                    textView2.setText(iGTVEditMetadataFragment.getString(C0003R.string.igtv_monetization_ineligible_account_title));
                    textView3.setMovementMethod(LinkMovementMethod.getInstance());
                    textView3.setText(r5.A00(true, "https://www.facebook.com/help/instagram/793848097773634", new C1663877p(iGTVEditMetadataFragment)));
                    return;
                }
                AnonymousClass1NJ r02 = iGTVEditMetadataFragment.A01;
                long A0D = r02.A0D();
                AnonymousClass9LP r7 = r02.A0U.A00;
                C13150hy.A02(r7, "brandSafetyStatus");
                if (r7 != AnonymousClass9LP.NO_MONETIZATION && r5.A02(A0D)) {
                    z2 = true;
                }
                z2 = false;
                if (z2) {
                    textView2.setText(iGTVEditMetadataFragment.getString(C0003R.string.igtv_allow_ads_toggle_title));
                    textView3.setText(iGTVEditMetadataFragment.getString(C0003R.string.igtv_allow_ads_toggle_description));
                    IgSwitch igSwitch = (IgSwitch) iGTVEditMetadataFragment.mMonetizationRowViewStub.findViewById(C0003R.C0005id.allow_ads_switch);
                    if (igSwitch != null) {
                        igSwitch.setEnabled(true);
                        igSwitch.setChecked(iGTVEditMetadataFragment.A06);
                        igSwitch.setToggleListener(new C1664077s(iGTVEditMetadataFragment));
                        igSwitch.setVisibility(0);
                    }
                    iGTVEditMetadataFragment.mMonetizationRowViewStub.findViewById(C0003R.C0005id.learn_more).setOnClickListener(new AnonymousClass77r(iGTVEditMetadataFragment));
                    iGTVEditMetadataFragment.mMonetizationRowViewStub.findViewById(C0003R.C0005id.learn_more).setVisibility(0);
                    return;
                }
                textView2.setText(iGTVEditMetadataFragment.getString(C0003R.string.igtv_monetization_ineligible_video_title));
                textView3.setMovementMethod(LinkMovementMethod.getInstance());
                textView3.setText(r5.A00(false, "https://help.instagram.com/2635536099905516", new C1663977q(iGTVEditMetadataFragment)));
                iGTVEditMetadataFragment.mMonetizationRowViewStub.setVisibility(0);
            }
        }
    }

    public static void A01(IGTVEditMetadataFragment iGTVEditMetadataFragment, String str, AnonymousClass2UD r5) {
        AnonymousClass2UC r2 = new AnonymousClass2UC(iGTVEditMetadataFragment.requireActivity(), iGTVEditMetadataFragment.A03, str, r5);
        r2.A04(iGTVEditMetadataFragment.getModuleName());
        r2.A01();
    }

    public static void A02(IGTVEditMetadataFragment iGTVEditMetadataFragment, boolean z) {
        iGTVEditMetadataFragment.A07 = z;
        if (iGTVEditMetadataFragment.mView != null) {
            AnonymousClass1EW.A03(iGTVEditMetadataFragment.getActivity()).setIsLoading(iGTVEditMetadataFragment.A07);
        }
    }

    public final boolean onBackPressed() {
        C1646370j.A00(this.A02, "tap_exit", this.A05);
        return false;
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-146939108);
        super.onCreate(bundle);
        this.A03 = AnonymousClass0J1.A06(this.mArguments);
        this.A00 = new Handler();
        Bundle bundle2 = this.mArguments;
        this.A04 = bundle2.getString("igtv_session_id_arg");
        this.A02 = new C1646370j(this.A03, this, bundle2.getString("igtv_session_id_arg"));
        String string = bundle2.getString("igtv_media_id_arg");
        this.A05 = string;
        C1646370j r2 = this.A02;
        C37141jB A032 = C37591ju.A03("igtv_composer_start", r2.A00);
        A032.A3l = r2.A02;
        A032.A3I = "edit";
        A032.A3v = string;
        A032.A2w = "tap_edit";
        C36901in.A03(AnonymousClass0WN.A01(r2.A01), A032.A03(), Constants.ZERO);
        AnonymousClass0Z0.A09(-805728, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(404020564);
        IGTVEditMetadataFragmentLifecycleUtil.cleanupReferences(this);
        super.onDestroyView();
        AnonymousClass0Z0.A09(792439332, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mView = view;
        AnonymousClass1NJ A022 = AnonymousClass1PZ.A00(this.A03).A02(this.A05);
        if (A022 == null) {
            A0D("");
            A0C("");
            C17850qu A032 = C16160o8.A03(this.A05, this.A03);
            A032.A00 = new C1663777o(this);
            schedule(A032);
            return;
        }
        A00(this, A022);
    }
}
