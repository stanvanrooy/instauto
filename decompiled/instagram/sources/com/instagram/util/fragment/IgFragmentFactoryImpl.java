package com.instagram.util.fragment;

import android.os.Bundle;
import com.instagram.brandedcontent.violation.BrandedContentNotificationFragment;
import com.instagram.genericsurvey.fragment.AdBakeOffFragment;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;
import com.instagram.urlhandler.ShortUrlReelLoadingFragment;
import java.util.ArrayList;
import java.util.HashMap;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass2KG;
import p000X.AnonymousClass2UZ;
import p000X.AnonymousClass4CL;
import p000X.AnonymousClass5CJ;
import p000X.AnonymousClass5RO;
import p000X.AnonymousClass5Wm;
import p000X.AnonymousClass91D;
import p000X.AnonymousClass9IW;
import p000X.C05230Is;
import p000X.C109184n4;
import p000X.C119715Bq;
import p000X.C128695f7;
import p000X.C129335gB;
import p000X.C132695li;
import p000X.C1425067o;
import p000X.C146766Pb;
import p000X.C146776Pc;
import p000X.C147906Tv;
import p000X.C207668vd;
import p000X.C227439qV;
import p000X.C25751BXv;
import p000X.C53722Ua;
import p000X.C53742Uc;
import p000X.CAL;

public final class IgFragmentFactoryImpl extends AnonymousClass2UZ {
    public final AnonymousClass1HD A0N(String str, String str2) {
        return A0P(str, str2, (String) null, (String) null);
    }

    public final AnonymousClass1HD A01() {
        return new C207668vd();
    }

    public final AnonymousClass1HD A02() {
        return new C1425067o();
    }

    public final AnonymousClass1HD A03() {
        return new AnonymousClass5Wm();
    }

    public final AnonymousClass1HD A04() {
        return new C119715Bq();
    }

    public final AnonymousClass1HD A05() {
        return new AnonymousClass4CL();
    }

    public final AnonymousClass1HD A06() {
        return new AnonymousClass5CJ();
    }

    public final AnonymousClass1HD A07() {
        return new C132695li();
    }

    public final AnonymousClass1HD A08() {
        return new C146766Pb();
    }

    public final AnonymousClass1HD A09() {
        return new C147906Tv();
    }

    public final AnonymousClass1HD A0A() {
        return new ShortUrlReelLoadingFragment();
    }

    public final AnonymousClass1HD A0B(Bundle bundle) {
        AnonymousClass91D r0 = new AnonymousClass91D();
        r0.setArguments(bundle);
        return r0;
    }

    public final AnonymousClass1HD A0C(Bundle bundle) {
        BrandedContentNotificationFragment brandedContentNotificationFragment = new BrandedContentNotificationFragment();
        brandedContentNotificationFragment.setArguments(bundle);
        return brandedContentNotificationFragment;
    }

    public final AnonymousClass1HD A0D(Bundle bundle) {
        C128695f7 r0 = new C128695f7();
        r0.setArguments(bundle);
        return r0;
    }

    public final AnonymousClass1HD A0E(Bundle bundle) {
        C129335gB r0 = new C129335gB();
        r0.setArguments(bundle);
        return r0;
    }

    public final AnonymousClass1HD A0F(AnonymousClass0C1 r5) {
        C109184n4 r3 = new C109184n4();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r5.getToken());
        r3.setArguments(bundle);
        return r3;
    }

    public final AnonymousClass1HD A0G(AnonymousClass0C1 r5, String str) {
        AnonymousClass5RO r3 = new AnonymousClass5RO();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r5.getToken());
        bundle.putString("FeaturedUserFragment.EXTRA_USER_NAME", str);
        r3.setArguments(bundle);
        return r3;
    }

    public final AnonymousClass1HD A0H(AnonymousClass0C1 r3, String str, int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("media_id", str);
        bundle.putInt("position", i);
        bundle.putInt("carousel_index", i2);
        C05230Is.A00(r3, bundle);
        AnonymousClass9IW r0 = new AnonymousClass9IW();
        r0.setArguments(bundle);
        return r0;
    }

    public final AnonymousClass1HD A0I(String str) {
        C146776Pc r0 = new C146776Pc();
        r0.A04 = str;
        return r0.A01();
    }

    public final AnonymousClass1HD A0J(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("media_id", str);
        C25751BXv bXv = new C25751BXv();
        bXv.setArguments(bundle);
        return bXv;
    }

    public final AnonymousClass1HD A0K(String str) {
        AdBakeOffFragment adBakeOffFragment = new AdBakeOffFragment();
        Bundle bundle = new Bundle();
        bundle.putString("AdBakeOffFragment.EXTRA_DATA_TOKEN", str);
        adBakeOffFragment.setArguments(bundle);
        return adBakeOffFragment;
    }

    public final AnonymousClass1HD A0L(String str, int i, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString("AdHideReasonsFragment.AD_ID", str4);
        bundle.putString("AdHideReasonsFragment.FEED_ITEM_ID", str);
        bundle.putString("AdHideReasonsFragment.TOKEN", str2);
        bundle.putString("AdHideReasonsFragment.SOURCE", str3);
        bundle.putInt("AdHideReasonsFragment.MEDIA_AD_CAROUSEL_INDEX", i);
        AnonymousClass91D r0 = new AnonymousClass91D();
        r0.setArguments(bundle);
        return r0;
    }

    public final AnonymousClass1HD A0M(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("AdHideReasonsFragment.FEED_ITEM_ID", str);
        bundle.putString("AdHideReasonsFragment.TOKEN", str2);
        bundle.putBoolean("AdHideReasonsFragment.IS_SURVEY", true);
        AnonymousClass91D r0 = new AnonymousClass91D();
        r0.setArguments(bundle);
        return r0;
    }

    public final AnonymousClass1HD A0O(String str, String str2) {
        Bundle bundle = new Bundle();
        C53742Uc r0 = new C53742Uc(str);
        r0.A03 = str2;
        bundle.putParcelable("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", r0.A00());
        C227439qV r02 = new C227439qV();
        r02.setArguments(bundle);
        return r02;
    }

    public final AnonymousClass1HD A0P(String str, String str2, String str3, String str4) {
        GenericSurveyFragment genericSurveyFragment = new GenericSurveyFragment();
        Bundle bundle = new Bundle();
        bundle.putString("GenericSurveyFragment.SURVEY_TYPE", str);
        bundle.putString("GenericSurveyFragment.EXTRA_DATA_TOKEN", str2);
        bundle.putString("GenericSurveyFragment.ARGUMENTS_TRACKING_TOKEN", str3);
        bundle.putString("GenericSurveyFragment.ARGUMENTS_PARENT_MEDIA_ID", str4);
        genericSurveyFragment.setArguments(bundle);
        return genericSurveyFragment;
    }

    public final AnonymousClass1HD A0Q(String str, ArrayList arrayList, String str2, boolean z, String str3, HashMap hashMap) {
        Bundle bundle = new Bundle();
        bundle.putString("ContextualFeedFragment.ARGUMENT_MEDIA_INITIAL_POSITION", str);
        bundle.putStringArrayList("ContextualFeedFragment.ARGUMENT_MEDIA_ID_LIST", arrayList);
        bundle.putString("ContextualFeedFragment.ARGUMENT_FEED_TITLE", str2);
        bundle.putBoolean("ContextualFeedFragment.ARGUMENT_IS_EXPLORE_ATTRIBUTION_VISIBLE", z);
        bundle.putString("ContextualFeedFragment.ARGUMENT_MODULE_NAME", str3);
        bundle.putSerializable("ContextualFeedFragment.ARGUMENT_NAVIGATION_EVENT_EXTRA", hashMap);
        AnonymousClass2KG r0 = new AnonymousClass2KG();
        r0.setArguments(bundle);
        return r0;
    }

    public final AnonymousClass1HD A0R(String str, boolean z) {
        CAL cal = new CAL();
        Bundle bundle = new Bundle();
        bundle.putString("CanvasFragment.ARGUMENTS_CANVAS_ID", str);
        bundle.putBoolean("CanvasFragment.ARGUMENTS_CANVAS_ANIMATE", false);
        bundle.putBoolean("CanvasFragment.ARGUMENTS_CANVAS_FORCE_REFRESH", z);
        cal.setArguments(bundle);
        return cal;
    }

    public final C53722Ua A0S() {
        return new C53722Ua();
    }

    public final C146776Pc A0T(String str) {
        C146776Pc r0 = new C146776Pc();
        r0.A04 = str;
        return r0;
    }
}
