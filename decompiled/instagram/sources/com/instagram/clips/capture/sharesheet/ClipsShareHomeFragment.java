package com.instagram.clips.capture.sharesheet;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass12M;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1WV;
import p000X.AnonymousClass26T;
import p000X.AnonymousClass2L7;
import p000X.AnonymousClass2NF;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass3DK;
import p000X.AnonymousClass3DN;
import p000X.AnonymousClass56D;
import p000X.AnonymousClass5F9;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C1179054k;
import p000X.C184147tv;
import p000X.C184157tw;
import p000X.C184187tz;
import p000X.C27341Hl;
import p000X.C84313lS;
import p000X.C85393nH;
import p000X.C86103oU;
import p000X.C86833pk;

public class ClipsShareHomeFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, AnonymousClass2NF {
    public AnonymousClass2L7 A00;
    public AnonymousClass0C1 A01;
    public AnonymousClass12M A02;
    public boolean A03;
    public final List A04 = new ArrayList();
    public AnonymousClass3DK mTabbedFragmentController;

    public final void configureActionBar(AnonymousClass1EX r4) {
        r4.Bo6(true);
        boolean z = false;
        if (this.A04.size() < 2) {
            z = true;
        }
        r4.Bo0(z);
        if (this.A03) {
            r4.A4H(C0003R.string.edit, new C184157tw(this));
        }
        r4.BlI(C0003R.string.sharesheet_fragment_actionbar_text);
    }

    public final String getModuleName() {
        return "clips_share_sheet";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public static C1179054k A00(ClipsShareHomeFragment clipsShareHomeFragment) {
        AnonymousClass1HD r1;
        if (clipsShareHomeFragment.A04.contains(C184187tz.STORY)) {
            r1 = clipsShareHomeFragment.mTabbedFragmentController.A02(C184187tz.STORY);
        } else {
            r1 = null;
        }
        if (r1 instanceof C1179054k) {
            return (C1179054k) r1;
        }
        return null;
    }

    private void A01(String str) {
        try {
            this.A00 = this.A02.A05(str);
        } catch (C86833pk e) {
            AnonymousClass5F9.A00(getContext(), e.A00);
            AnonymousClass0QD.A0A("com.instagram.clips.capture.sharesheet.ClipsShareHomeFragment", e);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1HD AAG(Object obj) {
        switch (((C184187tz) obj).ordinal()) {
            case 0:
                ClipsShareSheetFragment clipsShareSheetFragment = new ClipsShareSheetFragment();
                clipsShareSheetFragment.A00 = this;
                clipsShareSheetFragment.setArguments(this.mArguments);
                return clipsShareSheetFragment;
            case 1:
                AnonymousClass0C1 r1 = this.A01;
                AnonymousClass56D r3 = new AnonymousClass56D(this.mArguments);
                r3.A00.putString("IgSessionManager.SESSION_TOKEN_KEY", r1.getToken());
                return r3.A00();
            default:
                throw new IllegalArgumentException("invalid Clips share tab.");
        }
    }

    public final AnonymousClass3DN AB4(Object obj) {
        return AnonymousClass3DN.A00(((C184187tz) obj).A00);
    }

    public final /* bridge */ /* synthetic */ void BQo(Object obj) {
        switch (((C184187tz) obj).ordinal()) {
            case 0:
                C85393nH.A00(this.A01).AkF();
                return;
            case 1:
                C85393nH.A00(this.A01).AkI();
                return;
            default:
                return;
        }
    }

    public final boolean onBackPressed() {
        Intent intent;
        boolean z;
        if (!this.A03) {
            AnonymousClass12M.A04(this.A02, this.A00.A05, true);
        }
        if (A02()) {
            C1179054k A002 = A00(this);
            if (A002 != null) {
                intent = A002.A04.A0D();
            } else {
                intent = null;
            }
            intent.putExtra("ClipsConstants.CLIPS_DID_SHARE_EPHEMERAL_CONTENT", true);
        } else {
            intent = null;
        }
        ClipsShareSheetFragment clipsShareSheetFragment = (ClipsShareSheetFragment) this.mTabbedFragmentController.A02(C184187tz.CLIPS);
        boolean z2 = this.A03;
        C184147tv r5 = new C184147tv(this, intent);
        if (!z2 || clipsShareSheetFragment.A05 == clipsShareSheetFragment.A04) {
            z = false;
        } else {
            AnonymousClass2OA r2 = new AnonymousClass2OA(clipsShareSheetFragment.getContext());
            r2.A07(C0003R.string.sharesheet_discard_draft_dialog_title);
            r2.A06(C0003R.string.sharesheet_discard_draft_dialog_message);
            r2.A0D(C0003R.string.sharesheet_discard_draft_button, r5, Constants.A0Y);
            r2.A08(C0003R.string.sharesheet_discard_draft_cancel_button, (DialogInterface.OnClickListener) null);
            r2.A0U(true);
            r2.A0V(true);
            r2.A03().show();
            z = true;
        }
        if (!z) {
            FragmentActivity activity = getActivity();
            AnonymousClass0a4.A06(activity);
            activity.setResult(0, intent);
            activity.finish();
        }
        return true;
    }

    public final boolean A02() {
        C1179054k A002 = A00(this);
        if (A002 == null || !A002.A04.A0D.A08()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void BDg(Object obj, int i, float f, float f2) {
        TextView textView;
        if (A02()) {
            int indexOf = this.A04.indexOf(C184187tz.STORY);
            C1179054k A002 = A00(this);
            if (A002 != null && (textView = A002.A04.A04) != null) {
                if (i == indexOf - 1) {
                    textView.setTranslationX((1.0f - f) * ((float) C06220Of.A09(getContext())));
                } else if (i == indexOf) {
                    textView.setTranslationX(-f2);
                }
            }
        }
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9686 && i2 == -1) {
            A01(this.A00.A05);
            ClipsShareSheetFragment clipsShareSheetFragment = (ClipsShareSheetFragment) this.mTabbedFragmentController.A02(C184187tz.CLIPS);
            AnonymousClass2L7 r0 = clipsShareSheetFragment.A04;
            if (r0 != null) {
                ClipsShareSheetFragment.A00(clipsShareSheetFragment, r0.A05);
                clipsShareSheetFragment.A01.A01(clipsShareSheetFragment.A06);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-334155982);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(bundle2);
        this.A01 = A06;
        this.A02 = AnonymousClass12M.A00(getActivity(), A06);
        boolean z = bundle2.getBoolean("ClipsConstants.ARG_CLIPS_SHARE_SHEET_IS_IN_EDIT_DRAFT_MODE ");
        this.A03 = z;
        if (z) {
            C85393nH.A01(this.A01, (AnonymousClass0RN) null);
            C85393nH.A00(this.A01).AnN(C86103oU.A02("clips_draft"), (String) null, (String) null, AnonymousClass26T.A00(getActivity()), 18);
        }
        A01(bundle2.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_DRAFT_INFO_SESSION_ID "));
        this.A04.add(C184187tz.CLIPS);
        if (!this.A03 || AnonymousClass1WV.A00(this.A01).A01) {
            this.A04.add(C184187tz.STORY);
        }
        AnonymousClass0Z0.A09(-549366097, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1061054313);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_clips_sharesheet_home_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-682184114, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1484774959);
        super.onDestroyView();
        if (this.A03) {
            C85393nH.A00(this.A01).Akw();
            this.A01.BbT(C84313lS.class);
        }
        this.mTabbedFragmentController = null;
        AnonymousClass0Z0.A09(-1123704305, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass3DK r1 = new AnonymousClass3DK(this, getChildFragmentManager(), (ViewPager) view.findViewById(C0003R.C0005id.tabs_viewpager), (FixedTabBar) view.findViewById(C0003R.C0005id.fixed_tabbar_view), this.A04);
        this.mTabbedFragmentController = r1;
        r1.A03(C184187tz.CLIPS);
        boolean z = false;
        if (this.A04.size() < 2) {
            z = true;
        }
        if (z) {
            this.mTabbedFragmentController.A01.setVisibility(8);
        }
    }
}
