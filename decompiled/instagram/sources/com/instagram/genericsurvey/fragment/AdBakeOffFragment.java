package com.instagram.genericsurvey.fragment;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.p009ui.viewpager.BakeOffViewPager;
import com.instagram.p009ui.widget.fixedtabbar.FixedTabBar;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass6WS;
import p000X.AnonymousClass6WT;
import p000X.AnonymousClass6WV;
import p000X.AnonymousClass6YB;
import p000X.AnonymousClass6YC;
import p000X.AnonymousClass6YE;
import p000X.AnonymousClass6YK;
import p000X.AnonymousClass6YM;
import p000X.AnonymousClass6ZK;
import p000X.AnonymousClass6a3;
import p000X.AnonymousClass6a9;
import p000X.C06590Pq;
import p000X.C149176Zo;
import p000X.C149196Zq;
import p000X.C149206Zr;
import p000X.C149236Zu;
import p000X.C149286Zz;
import p000X.C149336aA;
import p000X.C149396aG;
import p000X.C149446aL;
import p000X.C149456aM;
import p000X.C149486aP;
import p000X.C15890nh;
import p000X.C15960no;
import p000X.C17020pY;
import p000X.C17040pa;
import p000X.C17850qu;
import p000X.C26301Cs;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C34071dx;
import p000X.C37141jB;
import p000X.C37591ju;
import p000X.C52362Om;
import p000X.C53642Tq;
import p000X.C64922sG;

public class AdBakeOffFragment extends C27341Hl implements C27371Ho, AnonymousClass1HK, AnonymousClass1HM, C149486aP, AnonymousClass6YE {
    public int A00;
    public C53642Tq A01;
    public C149336aA A02;
    public C149446aL A03;
    public AnonymousClass0C1 A04;
    public String A05;
    public String A06;
    public final String A07 = UUID.randomUUID().toString();
    public final List A08 = new ArrayList();
    public final List A09 = new ArrayList();
    public final Set A0A = new HashSet();
    public C149236Zu mAnswerButtonController;
    public BakeoffFeedPairSectionController mBakeoffFeedPairSectionController;
    public AnonymousClass6YM mBakeoffStoryPairSectionController;
    public ViewGroup mContentContainer;
    public SpinnerImageView mLoadingSpinner;
    public C149206Zr mNavbarController;
    public ViewGroup mRetryView;
    public ViewStub mRetryViewStub;

    public final boolean Ago() {
        return false;
    }

    public final boolean Ahq() {
        return true;
    }

    public final void AwM() {
    }

    public final String getModuleName() {
        return "hot_or_not";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(AdBakeOffFragment adBakeOffFragment) {
        AnonymousClass0C1 r0 = adBakeOffFragment.A04;
        String str = adBakeOffFragment.A06;
        C15890nh r2 = new C15890nh(r0);
        r2.A09 = Constants.A0N;
        r2.A0C = "survey/get/";
        r2.A09("type", "bakeoff");
        r2.A09("timezone_offset", Long.toString(C15960no.A00().longValue()));
        r2.A0A("extra_data_token", str);
        r2.A06(AnonymousClass6a3.class, false);
        C17850qu A032 = r2.A03();
        A032.A00 = new C149196Zq(adBakeOffFragment);
        adBakeOffFragment.schedule(A032);
    }

    public static void A01(AdBakeOffFragment adBakeOffFragment) {
        String str;
        adBakeOffFragment.mLoadingSpinner.setVisibility(8);
        adBakeOffFragment.mContentContainer.setVisibility(0);
        String str2 = adBakeOffFragment.A03.A04;
        if ("bakeoff_feed_item".equals(str2)) {
            BakeoffFeedPairSectionController bakeoffFeedPairSectionController = adBakeOffFragment.mBakeoffFeedPairSectionController;
            ViewGroup viewGroup = adBakeOffFragment.mContentContainer;
            View inflate = LayoutInflater.from(bakeoffFeedPairSectionController.A01).inflate(C0003R.layout.bakeoff_feed_pair_section, viewGroup, false);
            FixedTabBar fixedTabBar = (FixedTabBar) inflate.findViewById(C0003R.C0005id.hon_tabbar);
            bakeoffFeedPairSectionController.mFixedTabBar = fixedTabBar;
            fixedTabBar.setDelegate(bakeoffFeedPairSectionController);
            fixedTabBar.setTabs(new AnonymousClass6WS(bakeoffFeedPairSectionController));
            bakeoffFeedPairSectionController.mFragmentPager = (BakeOffViewPager) inflate.findViewById(C0003R.C0005id.layout_container_main);
            viewGroup.addView(inflate);
            viewGroup.invalidate();
            BakeoffFeedPairSectionController bakeoffFeedPairSectionController2 = adBakeOffFragment.mBakeoffFeedPairSectionController;
            bakeoffFeedPairSectionController2.mFragmentPager.setAdapter(bakeoffFeedPairSectionController2.mPagerAdapter);
            bakeoffFeedPairSectionController2.mFragmentPager.A0K(new AnonymousClass6WV(bakeoffFeedPairSectionController2));
            bakeoffFeedPairSectionController2.mFragmentPager.A0K(bakeoffFeedPairSectionController2.mFixedTabBar);
            bakeoffFeedPairSectionController2.mFragmentPager.setVisibility(0);
            BakeoffFeedPairSectionController bakeoffFeedPairSectionController3 = adBakeOffFragment.mBakeoffFeedPairSectionController;
            bakeoffFeedPairSectionController3.A00 = (List) adBakeOffFragment.A09.get(adBakeOffFragment.A00);
            bakeoffFeedPairSectionController3.mPagerAdapter.notifyDataSetChanged();
            adBakeOffFragment.mAnswerButtonController.A00(inflate);
        } else if ("bakeoff_reel".equals(str2)) {
            AnonymousClass6YM r5 = adBakeOffFragment.mBakeoffStoryPairSectionController;
            ViewGroup viewGroup2 = adBakeOffFragment.mContentContainer;
            View inflate2 = LayoutInflater.from(r5.A05).inflate(C0003R.layout.bakeoff_story_pair_section, viewGroup2, false);
            View findViewById = inflate2.findViewById(C0003R.C0005id.reel_preview_hint_container);
            r5.A00 = findViewById;
            AnonymousClass6YK r1 = new AnonymousClass6YK();
            r1.A00 = (TextView) findViewById.findViewById(C0003R.C0005id.hint);
            findViewById.setTag(r1);
            FixedTabBar fixedTabBar2 = (FixedTabBar) inflate2.findViewById(C0003R.C0005id.hon_tabbar);
            r5.A04 = fixedTabBar2;
            fixedTabBar2.setDelegate(r5);
            fixedTabBar2.setTabs(new AnonymousClass6WT(r5));
            r5.A01 = inflate2.findViewById(C0003R.C0005id.reel_preview_left);
            r5.A02 = inflate2.findViewById(C0003R.C0005id.reel_preview_right);
            View view = r5.A01;
            view.setTag(AnonymousClass6YB.A00(view));
            View view2 = r5.A02;
            view2.setTag(AnonymousClass6YB.A00(view2));
            r5.A03 = inflate2.findViewById(C0003R.C0005id.reel_previews_container);
            viewGroup2.addView(inflate2);
            viewGroup2.invalidate();
            adBakeOffFragment.mBakeoffStoryPairSectionController.A01((List) adBakeOffFragment.A09.get(adBakeOffFragment.A00));
            adBakeOffFragment.mBakeoffStoryPairSectionController.A00();
            adBakeOffFragment.mAnswerButtonController.A00(adBakeOffFragment.mContentContainer);
        }
        C149236Zu r7 = adBakeOffFragment.mAnswerButtonController;
        C149456aM r6 = adBakeOffFragment.A03.A00;
        r7.A00.getPaint().setFakeBoldText(true);
        r7.A00.setText(r6.A02);
        int i = 0;
        for (TextView textView : r7.A06) {
            int i2 = i + 1;
            if (i == 0) {
                str = r6.A00;
            } else if (i == 1) {
                str = r6.A01;
            } else if (i == 2) {
                str = r6.A03;
            } else {
                textView.getPaint().setFakeBoldText(true);
                textView.setOnTouchListener(new C149286Zz(r7, textView, i));
                textView.setOnClickListener(new C149176Zo(r7, i));
                i = i2;
            }
            textView.setText(str);
            textView.getPaint().setFakeBoldText(true);
            textView.setOnTouchListener(new C149286Zz(r7, textView, i));
            textView.setOnClickListener(new C149176Zo(r7, i));
            i = i2;
        }
        adBakeOffFragment.mAnswerButtonController.A01(false);
        A02(adBakeOffFragment, 0, true, true);
    }

    public static void A02(AdBakeOffFragment adBakeOffFragment, int i, boolean z, boolean z2) {
        if ("bakeoff_feed_item".equals(adBakeOffFragment.A03.A04)) {
            if (z2) {
                BakeoffFeedPairSectionController bakeoffFeedPairSectionController = adBakeOffFragment.mBakeoffFeedPairSectionController;
                AlphaAnimation alphaAnimation = new AlphaAnimation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
                alphaAnimation.setDuration(400);
                alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                bakeoffFeedPairSectionController.mFragmentPager.startAnimation(alphaAnimation);
            }
            adBakeOffFragment.A0A.add(String.valueOf(i));
            adBakeOffFragment.mBakeoffFeedPairSectionController.setMode(i);
            if (z && (!adBakeOffFragment.A09.isEmpty())) {
                AnonymousClass1NJ r6 = ((AnonymousClass6ZK) ((List) adBakeOffFragment.A09.get(adBakeOffFragment.A00)).get(i)).A02;
                String str = adBakeOffFragment.A07;
                String A002 = C149396aG.A00(adBakeOffFragment.A03, adBakeOffFragment.A00);
                String APo = r6.APo();
                AnonymousClass0C1 r1 = adBakeOffFragment.A04;
                C37141jB A032 = C37591ju.A03(AnonymousClass000.A0E("instagram_survey_", "media_impression"), adBakeOffFragment);
                A032.A4c = str;
                A032.A46 = A002;
                A032.A3v = APo;
                AnonymousClass0WN.A01(r1).BdB(A032.A03());
                String str2 = adBakeOffFragment.A05;
                AnonymousClass0C1 r2 = adBakeOffFragment.A04;
                C37141jB A033 = C37591ju.A03(AnonymousClass000.A0E("instagram_survey_", "bakeoff_action"), adBakeOffFragment);
                A033.A0B(r2, r6);
                A033.A2w = "switch";
                A033.A48 = (String) adBakeOffFragment.A08.get(adBakeOffFragment.A00);
                A033.A4d = str2;
                AnonymousClass0WN.A01(r2).BdB(A033.A03());
            }
        } else {
            AnonymousClass6YM r62 = adBakeOffFragment.mBakeoffStoryPairSectionController;
            Set set = adBakeOffFragment.A0A;
            for (int i2 = 0; i2 < r62.A06.size(); i2++) {
                if (set.contains(((Reel) r62.A06.get(i2)).getId())) {
                    FixedTabBar fixedTabBar = r62.A04;
                    int i3 = i2;
                    if (fixedTabBar.A07) {
                        i3 = (fixedTabBar.A05.size() - 1) - i2;
                    }
                    ((View) fixedTabBar.A05.get(i3)).setSelected(true);
                }
            }
        }
        C149236Zu r3 = adBakeOffFragment.mAnswerButtonController;
        boolean z3 = false;
        if (adBakeOffFragment.A0A.size() == ((List) adBakeOffFragment.A09.get(adBakeOffFragment.A00)).size()) {
            z3 = true;
        }
        r3.A01(z3);
    }

    public final void A03(String str) {
        String str2 = this.A07;
        String A002 = C149396aG.A00(this.A03, this.A00);
        AnonymousClass0C1 r2 = this.A04;
        C37141jB A032 = C37591ju.A03(AnonymousClass000.A0E("instagram_survey_", "exit_event"), this);
        A032.A4c = str2;
        A032.A46 = A002;
        A032.A3U = str;
        AnonymousClass0WN.A01(r2).BdB(A032.A03());
        if (!str.equals("back_button")) {
            if (this.mFragmentManager.A0I() == 0) {
                FragmentActivity activity = getActivity();
                if (activity instanceof ModalActivity) {
                    activity.finish();
                    return;
                }
            }
            this.mFragmentManager.A0W();
        }
    }

    public final void Avl() {
        A03("close_button");
    }

    public final void Avq() {
        A03("done_button");
    }

    public final void BHk(Reel reel, AnonymousClass6YC r9, List list) {
        String str;
        String str2 = this.A07;
        String A002 = C149396aG.A00(this.A03, this.A00);
        AnonymousClass0C1 r1 = this.A04;
        if (reel == null || reel.A0l(r1)) {
            str = "";
        } else {
            str = reel.A0C(r1, 0).A08.APo();
        }
        AnonymousClass0C1 r3 = this.A04;
        C37141jB A032 = C37591ju.A03(AnonymousClass000.A0E("instagram_survey_", "media_impression"), this);
        A032.A4c = str2;
        A032.A46 = A002;
        A032.A3v = str;
        AnonymousClass0WN.A01(r3).BdB(A032.A03());
        this.A0A.add(reel.getId());
        C17040pa A0J = C17020pY.A00().A0J();
        C64922sG A0K = C17020pY.A00().A0K();
        A0K.A0P(list, reel.getId(), this.A04);
        A0K.A06(AnonymousClass1OY.BAKEOFF);
        A0K.A0J(this.A07);
        AnonymousClass1HD A012 = A0J.A01(A0K.A00());
        C52362Om r2 = new C52362Om(getActivity(), this.A04);
        r2.A02 = A012;
        r2.A04 = "ReelViewerFragment.BACK_STACK_NAME";
        r2.A02();
    }

    public final void configureActionBar(AnonymousClass1EX r8) {
        AnonymousClass1EX r2 = r8;
        this.mNavbarController.A01(r8);
        if (!this.A09.isEmpty()) {
            this.mNavbarController.A02(r2, this.A03.A02, false, true, false);
            this.mNavbarController.A00(this.A00, 0, this.A09.size());
        }
    }

    public final boolean onBackPressed() {
        A03("back_button");
        C34071dx A0T = C17020pY.A00().A0T(getActivity());
        if (A0T == null || !A0T.A0b()) {
            return false;
        }
        return true;
    }

    public final C06590Pq getSession() {
        return this.A04;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(340336413);
        super.onCreate(bundle);
        this.A06 = this.mArguments.getString("AdBakeOffFragment.EXTRA_DATA_TOKEN");
        this.A04 = AnonymousClass0J1.A06(this.mArguments);
        this.mNavbarController = new C149206Zr(this, getResources());
        this.mBakeoffFeedPairSectionController = new BakeoffFeedPairSectionController(this, getChildFragmentManager(), this.A04, getContext());
        Context context = getContext();
        this.mBakeoffStoryPairSectionController = new AnonymousClass6YM(this, context, this.A04);
        this.mAnswerButtonController = new C149236Zu(this, context);
        C149336aA r0 = new C149336aA();
        this.A02 = r0;
        registerLifecycleListener(r0);
        A00(this);
        AnonymousClass0Z0.A09(-411579094, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1646194751);
        View inflate = layoutInflater.inflate(C0003R.layout.fragment_bakeoff, viewGroup, false);
        this.mContentContainer = (ViewGroup) inflate.findViewById(C0003R.C0005id.content_container);
        this.mRetryViewStub = (ViewStub) inflate.findViewById(C0003R.C0005id.hon_retry);
        this.mLoadingSpinner = (SpinnerImageView) inflate.findViewById(C0003R.C0005id.loading_spinner);
        AnonymousClass0Z0.A09(-165966369, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-747023049);
        super.onDestroy();
        AdBakeOffFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(1619897403, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-862421504);
        super.onDestroyView();
        AnonymousClass0Z0.A09(-714016331, A022);
    }

    public final void onResume() {
        C34071dx A0T;
        int A022 = AnonymousClass0Z0.A02(1915298365);
        super.onResume();
        C34071dx A0T2 = C17020pY.A00().A0T(getActivity());
        if (!(A0T2 == null || !A0T2.A0a() || (A0T = C17020pY.A00().A0T(getActivity())) == null)) {
            A0T.A0U((RectF) null, (RectF) null, new AnonymousClass6a9(this));
        }
        if (getRootActivity() instanceof C26301Cs) {
            ((C26301Cs) getRootActivity()).Bl6(8);
        }
        AnonymousClass0Z0.A09(-110589235, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0Z0.A02(-117066865);
        super.onStop();
        if (getRootActivity() instanceof C26301Cs) {
            ((C26301Cs) getRootActivity()).Bl6(0);
        }
        AnonymousClass0Z0.A09(-1732084279, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!this.A09.isEmpty()) {
            A01(this);
        }
    }
}
