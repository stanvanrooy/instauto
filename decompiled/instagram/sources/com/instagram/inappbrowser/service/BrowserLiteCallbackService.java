package com.instagram.inappbrowser.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.C0003R;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.ipc.AutofillOptOutCallback;
import com.facebook.browser.lite.ipc.AutofillScriptCallback;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCallData;
import com.facebook.iabeventlogging.model.IABCopyLinkEvent;
import com.facebook.iabeventlogging.model.IABDialogActionEvent;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABLandingPageFinishedEvent;
import com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent;
import com.facebook.iabeventlogging.model.IABLandingPageStartedEvent;
import com.facebook.iabeventlogging.model.IABLandingPageViewEndedEvent;
import com.facebook.iabeventlogging.model.IABLaunchEvent;
import com.facebook.iabeventlogging.model.IABOpenExternalEvent;
import com.facebook.iabeventlogging.model.IABRefreshEvent;
import com.facebook.iabeventlogging.model.IABReportStartEvent;
import com.facebook.iabeventlogging.model.IABWebviewEndEvent;
import com.google.common.collect.ImmutableMap;
import com.instagram.bugreporter.BugReport;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.BugReporterActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentBackgroundModalActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000X.ASE;
import p000X.ASK;
import p000X.ATJ;
import p000X.Constants;
import p000X.AnonymousClass00B;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0QV;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1PZ;
import p000X.AnonymousClass25V;
import p000X.AnonymousClass295;
import p000X.AnonymousClass2WV;
import p000X.AnonymousClass40t;
import p000X.Az3;
import p000X.Az6;
import p000X.Az7;
import p000X.Az8;
import p000X.C05680Ln;
import p000X.C05700Lp;
import p000X.C06360Ot;
import p000X.C08480Xf;
import p000X.C120125Dh;
import p000X.C12670hC;
import p000X.C157326nk;
import p000X.C157336nl;
import p000X.C16180oA;
import p000X.C17850qu;
import p000X.C193418Ps;
import p000X.C207878vz;
import p000X.C207908w2;
import p000X.C23592ASr;
import p000X.C24090Ahp;
import p000X.C242713y;
import p000X.C25026AyK;
import p000X.C25030AyO;
import p000X.C25031AyP;
import p000X.C25032AyQ;
import p000X.C25033AyR;
import p000X.C25036AyU;
import p000X.C25037AyV;
import p000X.C25042Aya;
import p000X.C25047Ayf;
import p000X.C25058Ays;
import p000X.C25059Ayt;
import p000X.C25060Ayu;
import p000X.C25061Ayv;
import p000X.C25062Ayw;
import p000X.C25063Ayx;
import p000X.C25064Ayy;
import p000X.C25066Az0;
import p000X.C25067Az1;
import p000X.C25068Az2;
import p000X.C25069Az4;
import p000X.C25070Az5;
import p000X.C25077AzJ;
import p000X.C25078AzK;
import p000X.C30671Ut;
import p000X.C37141jB;
import p000X.C37591ju;
import p000X.C486228u;
import p000X.C59032gv;

public class BrowserLiteCallbackService extends Service {
    public final C157326nk A00 = new C157326nk(this);

    public final class BrowserLiteCallbackImpl extends BrowserLiteCallback.Stub {
        public C25037AyV A00 = new C25037AyV();
        public final AnonymousClass0C1 A01 = AnonymousClass0J1.A05();

        public final void BGx(Map map) {
            int A03 = AnonymousClass0Z0.A03(1745688191);
            Map map2 = map;
            Uri uri = (Uri) map2.get("screenshot_uri");
            Map map3 = (Map) map2.get("debug_info_map");
            if (uri == null || map3 == null) {
                C12670hC.A04(new C25026AyK(this));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(uri.getEncodedPath());
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : map3.entrySet()) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
                BugReport bugReport = new BugReport((String) null, arrayList, new ArrayList(), (String) null, (String) null, this.A01.A04(), (String) null, "rage_shake", hashMap, (String) null);
                Context applicationContext = BrowserLiteCallbackService.this.getApplicationContext();
                String string = applicationContext.getString(C0003R.string.bugreporter_rageshake_hint);
                applicationContext.getString(C0003R.string.bugreporter_disclaimer, new Object[]{AnonymousClass1BA.A06(applicationContext)});
                BugReportComposerViewModel bugReportComposerViewModel = new BugReportComposerViewModel(string, "", applicationContext.getString(C0003R.string.rageshake_title), true, false);
                Intent intent = new Intent(BrowserLiteCallbackService.this, BugReporterActivity.class);
                intent.setFlags(268435456);
                intent.putExtra(AnonymousClass40t.$const$string(58), bugReport);
                intent.putExtra(AnonymousClass40t.$const$string(59), bugReportComposerViewModel);
                intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", this.A01.getToken());
                AnonymousClass1BH.A03(intent, BrowserLiteCallbackService.this);
            }
            AnonymousClass0Z0.A0A(120088671, A03);
        }

        public /* synthetic */ BrowserLiteCallbackImpl() {
            int A03 = AnonymousClass0Z0.A03(220814266);
            AnonymousClass0Z0.A0A(-371672025, A03);
            AnonymousClass0Z0.A0A(1359642406, AnonymousClass0Z0.A03(-936980901));
        }

        public final void B6s(IABEvent iABEvent, Bundle bundle) {
            int i;
            Long l;
            Long l2;
            Long l3;
            IABEvent iABEvent2 = iABEvent;
            int A03 = AnonymousClass0Z0.A03(1155162834);
            iABEvent2.toString();
            AnonymousClass2WV r11 = new AnonymousClass2WV(bundle);
            if (r11.A00.getBoolean("TrackingInfo.SKIP_IAB_EVENTS", false)) {
                i = -898510184;
            } else {
                String A002 = r11.A00();
                AnonymousClass1NJ A022 = AnonymousClass1PZ.A00(this.A01).A02(A002);
                String A003 = A00(r11);
                String string = r11.A00.getString("TrackingInfo.ARG_AD_ID");
                if (string == null && A022 != null) {
                    string = C30671Ut.A02(this.A01, A022);
                }
                String str = iABEvent2.A03;
                double d = (double) iABEvent2.A01;
                AnonymousClass0QT A012 = AnonymousClass0QT.A01(this.A01, new C25032AyQ(this, r11), AnonymousClass0QV.A06);
                switch (iABEvent2.A02.ordinal()) {
                    case 0:
                        IABWebviewEndEvent iABWebviewEndEvent = (IABWebviewEndEvent) iABEvent2;
                        BrowserLiteCallbackService.this.A00.obtainMessage(4, iABWebviewEndEvent.A00, -1, r11.A01()).sendToTarget();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = iABWebviewEndEvent.A0J.iterator();
                        while (it.hasNext()) {
                            List list = (List) it.next();
                            arrayList.add(Arrays.asList(new Double[]{Double.valueOf(((Long) list.get(0)).doubleValue()), Double.valueOf(((Long) list.get(1)).doubleValue())}));
                        }
                        long j = -1;
                        if (A022 != null) {
                            try {
                                j = Long.parseLong(A022.A0c(this.A01).getId());
                            } catch (NumberFormatException e) {
                                AnonymousClass0QD.A05("IAB Logging", "error parsing user id", e);
                            }
                        }
                        C25063Ayx ayx = new C25063Ayx(A012.A02("iab_webview_end"));
                        ayx.A08("iab_session_id", str);
                        ayx.A08("m_pk", A002);
                        ayx.A07("ig_media_author_id", Long.valueOf(j));
                        ayx.A08(AnonymousClass0C5.$const$string(391), r11.A00.getString(AnonymousClass0C5.$const$string(50)));
                        ayx.A08(AnonymousClass0C5.$const$string(387), r11.A00.getString("TrackingInfo.ARG_REEL_TRAY_SESSION_ID"));
                        ayx.A08("click_source", iABWebviewEndEvent.A0D);
                        ayx.A05("user_click_ts", Double.valueOf((double) iABWebviewEndEvent.A0A));
                        ayx.A05("browser_open_ts", Double.valueOf((double) iABWebviewEndEvent.A05));
                        ayx.A08("initial_land_url", iABWebviewEndEvent.A0H);
                        ayx.A08("initial_url", iABWebviewEndEvent.A0I);
                        ayx.A05("web_request_started_ts", Double.valueOf((double) iABWebviewEndEvent.A0B));
                        ayx.A09("background_time_pairs", arrayList);
                        ayx.A05("landing_page_dom_content_loaded_ts", Double.valueOf((double) iABWebviewEndEvent.A06));
                        ayx.A07("scroll_ready_ts", Long.valueOf(iABWebviewEndEvent.A09));
                        ayx.A05("landing_page_loaded_ts", Double.valueOf((double) iABWebviewEndEvent.A07));
                        ayx.A05("landing_page_end_view_ts", Double.valueOf((double) iABWebviewEndEvent.A08));
                        ayx.A05("browser_close_ts", Double.valueOf((double) iABWebviewEndEvent.A04));
                        ayx.A07("interaction_count", Long.valueOf((long) iABWebviewEndEvent.A01));
                        ayx.A07("landing_page_status_code", Long.valueOf((long) iABWebviewEndEvent.A02));
                        ayx.A07("ssl_error_code", Long.valueOf((long) iABWebviewEndEvent.A03));
                        ayx.A07("dismiss_method", Long.valueOf((long) iABWebviewEndEvent.A00));
                        ayx.A05("event_ts", Double.valueOf(d));
                        ayx.A08("tracking_token", A003);
                        ayx.A01();
                        break;
                    case 1:
                        IABLaunchEvent iABLaunchEvent = (IABLaunchEvent) iABEvent2;
                        int A032 = AnonymousClass0Z0.A03(-56679569);
                        Long l4 = null;
                        try {
                            if (!TextUtils.isEmpty(A002)) {
                                String[] split = A002.split("_");
                                l = Long.valueOf(Long.parseLong(split[0]));
                                try {
                                    if (split.length > 1) {
                                        l2 = Long.valueOf(Long.parseLong(split[1]));
                                    } else {
                                        l2 = null;
                                    }
                                } catch (NumberFormatException e2) {
                                    e = e2;
                                    l2 = null;
                                    AnonymousClass0QD.A05("IAB Logging", "error parsing post id, author id or ad id", e);
                                    C25036AyU ayU = new C25036AyU(l, l2, l4);
                                    AnonymousClass0Z0.A0A(1393908253, A032);
                                    C25062Ayw ayw = new C25062Ayw(A012.A02("iab_launch"));
                                    ayw.A08("iab_session_id", str);
                                    ayw.A08("click_source", iABLaunchEvent.A02);
                                    ayw.A08("initial_url", iABLaunchEvent.A03);
                                    ayw.A05("user_click_ts", Double.valueOf((double) iABLaunchEvent.A01));
                                    ayw.A07("flags", Long.valueOf(iABLaunchEvent.A00));
                                    ayw.A05("event_ts", Double.valueOf(d));
                                    ayw.A08("tracking_token", A003);
                                    ayw.A07("post_id", ayU.A02);
                                    ayw.A07("ig_media_author_id", ayU.A01);
                                    ayw.A07("ad_id", ayU.A00);
                                    ayw.A01();
                                    i = -1653277753;
                                    AnonymousClass0Z0.A0A(i, A03);
                                }
                            } else {
                                l2 = null;
                                l = null;
                            }
                            if (string != null) {
                                try {
                                    l4 = Long.valueOf(Long.parseLong(string));
                                } catch (NumberFormatException e3) {
                                    e = e3;
                                }
                            }
                        } catch (NumberFormatException e4) {
                            e = e4;
                            l2 = null;
                            l = null;
                            AnonymousClass0QD.A05("IAB Logging", "error parsing post id, author id or ad id", e);
                            C25036AyU ayU2 = new C25036AyU(l, l2, l4);
                            AnonymousClass0Z0.A0A(1393908253, A032);
                            C25062Ayw ayw2 = new C25062Ayw(A012.A02("iab_launch"));
                            ayw2.A08("iab_session_id", str);
                            ayw2.A08("click_source", iABLaunchEvent.A02);
                            ayw2.A08("initial_url", iABLaunchEvent.A03);
                            ayw2.A05("user_click_ts", Double.valueOf((double) iABLaunchEvent.A01));
                            ayw2.A07("flags", Long.valueOf(iABLaunchEvent.A00));
                            ayw2.A05("event_ts", Double.valueOf(d));
                            ayw2.A08("tracking_token", A003);
                            ayw2.A07("post_id", ayU2.A02);
                            ayw2.A07("ig_media_author_id", ayU2.A01);
                            ayw2.A07("ad_id", ayU2.A00);
                            ayw2.A01();
                            i = -1653277753;
                            AnonymousClass0Z0.A0A(i, A03);
                        }
                        C25036AyU ayU22 = new C25036AyU(l, l2, l4);
                        AnonymousClass0Z0.A0A(1393908253, A032);
                        C25062Ayw ayw22 = new C25062Ayw(A012.A02("iab_launch"));
                        ayw22.A08("iab_session_id", str);
                        ayw22.A08("click_source", iABLaunchEvent.A02);
                        ayw22.A08("initial_url", iABLaunchEvent.A03);
                        ayw22.A05("user_click_ts", Double.valueOf((double) iABLaunchEvent.A01));
                        ayw22.A07("flags", Long.valueOf(iABLaunchEvent.A00));
                        ayw22.A05("event_ts", Double.valueOf(d));
                        ayw22.A08("tracking_token", A003);
                        ayw22.A07("post_id", ayU22.A02);
                        ayw22.A07("ig_media_author_id", ayU22.A01);
                        ayw22.A07("ad_id", ayU22.A00);
                        ayw22.A01();
                    case 2:
                        C25060Ayu ayu = new C25060Ayu(A012.A02("iab_landing_page_started"));
                        ayu.A08("iab_session_id", str);
                        ayu.A08("initial_url", ((IABLandingPageStartedEvent) iABEvent2).A00);
                        ayu.A05("event_ts", Double.valueOf(d));
                        ayu.A08("tracking_token", A003);
                        ayu.A01();
                        break;
                    case 3:
                        this.A00.A01 = SystemClock.elapsedRealtime();
                        IABLandingPageInteractiveEvent iABLandingPageInteractiveEvent = (IABLandingPageInteractiveEvent) iABEvent2;
                        C25059Ayt ayt = new C25059Ayt(A012.A02("iab_landing_page_interactive"));
                        ayt.A08("iab_session_id", str);
                        ayt.A08("initial_url", iABLandingPageInteractiveEvent.A03);
                        ayt.A08("initial_land_url", iABLandingPageInteractiveEvent.A02);
                        if (r11.A00.containsKey("TrackingInfo.ARG_BROWSER_HISTORY_LINK_ID")) {
                            l3 = Long.valueOf(r11.A00.getLong("TrackingInfo.ARG_BROWSER_HISTORY_LINK_ID"));
                        } else {
                            l3 = null;
                        }
                        ayt.A07("browser_history_link_id", l3);
                        ayt.A05("event_ts", Double.valueOf(d));
                        ayt.A08("tracking_token", A003);
                        ayt.A07(AnonymousClass0C5.$const$string(287), Long.valueOf((long) iABLandingPageInteractiveEvent.A01));
                        ayt.A07("page_content_width", Long.valueOf((long) iABLandingPageInteractiveEvent.A00));
                        ayt.A01();
                        break;
                    case 4:
                        IABLandingPageFinishedEvent iABLandingPageFinishedEvent = (IABLandingPageFinishedEvent) iABEvent2;
                        C25058Ays ays = new C25058Ays(A012.A02("iab_landing_page_finished"));
                        ays.A08("iab_session_id", str);
                        ays.A08("initial_url", iABLandingPageFinishedEvent.A01);
                        ays.A08("initial_land_url", iABLandingPageFinishedEvent.A00);
                        ays.A05("event_ts", Double.valueOf(d));
                        ays.A08("tracking_token", A003);
                        ays.A01();
                        break;
                    case 5:
                        C25061Ayv ayv = new C25061Ayv(A012.A02("iab_landing_page_view_ended"));
                        ayv.A08("iab_session_id", str);
                        ayv.A08("initial_url", ((IABLandingPageViewEndedEvent) iABEvent2).A00);
                        ayv.A05("event_ts", Double.valueOf(d));
                        ayv.A08("tracking_token", A003);
                        ayv.A01();
                        break;
                    case 6:
                        IABOpenExternalEvent iABOpenExternalEvent = (IABOpenExternalEvent) iABEvent2;
                        Az6 az6 = new Az6(A012.A02("iab_open_external"));
                        az6.A08("iab_session_id", str);
                        az6.A08("reason", iABOpenExternalEvent.A00);
                        az6.A08("target_url", iABOpenExternalEvent.A01);
                        az6.A05("event_ts", Double.valueOf(d));
                        az6.A08("tracking_token", A003);
                        az6.A01();
                        break;
                    case 7:
                        Az8 az8 = new Az8(A012.A02("iab_copy_link"));
                        az8.A08("iab_session_id", str);
                        az8.A08("target_url", ((IABCopyLinkEvent) iABEvent2).A00);
                        az8.A05("event_ts", Double.valueOf(d));
                        az8.A08("tracking_token", A003);
                        az8.A01();
                        break;
                    case 8:
                        C25070Az5 az5 = new C25070Az5(A012.A02("iab_open_menu"));
                        az5.A08("iab_session_id", str);
                        az5.A05("event_ts", Double.valueOf(d));
                        az5.A08("tracking_token", A003);
                        az5.A01();
                        break;
                    case 10:
                        IABReportStartEvent iABReportStartEvent = (IABReportStartEvent) iABEvent2;
                        Az3 az3 = new Az3(A012.A02("iab_report_start"));
                        az3.A08("iab_session_id", str);
                        az3.A08("target_url", iABReportStartEvent.A02);
                        az3.A08("click_source", iABReportStartEvent.A00);
                        az3.A05("event_ts", Double.valueOf(d));
                        az3.A08("tracking_token", A003);
                        az3.A01();
                        break;
                    case C120125Dh.VIEW_TYPE_BANNER:
                        C25069Az4 az4 = new C25069Az4(A012.A02("iab_refresh"));
                        az4.A08("iab_session_id", str);
                        az4.A08("refresh_from_type", ((IABRefreshEvent) iABEvent2).A00);
                        az4.A05("event_ts", Double.valueOf(d));
                        az4.A08("tracking_token", A003);
                        az4.A01();
                        break;
                    case C120125Dh.VIEW_TYPE_BADGE:
                        IABDialogActionEvent iABDialogActionEvent = (IABDialogActionEvent) iABEvent2;
                        Az7 az7 = new Az7(A012.A02("iab_dialog_action"));
                        az7.A08("dialog_type", iABDialogActionEvent.A00);
                        az7.A04("dialog_action", Boolean.valueOf(iABDialogActionEvent.A01));
                        az7.A01();
                        break;
                    case 16:
                        break;
                    default:
                        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("encountered unsupported IABEvent");
                        AnonymousClass0Z0.A0A(353641258, A03);
                        throw unsupportedOperationException;
                }
                i = -1653277753;
            }
            AnonymousClass0Z0.A0A(i, A03);
        }

        private String A00(AnonymousClass2WV r4) {
            int i;
            int A03 = AnonymousClass0Z0.A03(388804878);
            String string = r4.A00.getString("TrackingInfo.ARG_TRACKING_TOKEN");
            if (string != null) {
                i = -1130447203;
            } else {
                AnonymousClass1NJ A022 = AnonymousClass1PZ.A00(this.A01).A02(r4.A00());
                if (A022 != null) {
                    string = A022.AYw();
                } else {
                    string = null;
                }
                i = -449139813;
            }
            AnonymousClass0Z0.A0A(i, A03);
            return string;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0035, code lost:
            if (android.os.Build.VERSION.SDK_INT < ((java.lang.Integer) p000X.AnonymousClass0L6.A03(r7.A01, r6, "min_sdk", 0, (p000X.AnonymousClass04H) null)).intValue()) goto L_0x0037;
         */
        private boolean A01() {
            boolean z;
            int A03 = AnonymousClass0Z0.A03(-1195527385);
            AnonymousClass0C1 r2 = this.A01;
            AnonymousClass0L7 r6 = AnonymousClass0L7.IN_PROCESS_IAB;
            if (((Boolean) AnonymousClass0L6.A03(r2, r6, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                z = true;
            }
            z = false;
            AnonymousClass0Z0.A0A(-933476011, A03);
            return z;
        }

        public final void A6u(String str, Map map, Bundle bundle) {
            AnonymousClass2WV r5;
            String str2;
            ASE ase;
            int A03 = AnonymousClass0Z0.A03(1053677530);
            if (bundle != null) {
                r5 = new AnonymousClass2WV(bundle);
            } else {
                r5 = new AnonymousClass2WV();
            }
            if (str.equals("INTEGRITY_LOGGER")) {
                AnonymousClass1NJ A022 = AnonymousClass1PZ.A00(this.A01).A02(r5.A00());
                if (A022 != null) {
                    str2 = C30671Ut.A02(this.A01, A022);
                } else {
                    str2 = null;
                }
                C25064Ayy ayy = new C25064Ayy(AnonymousClass0QT.A00(this.A01, new C157336nl(r5.A01(), (String) null)).A02("si_native_webview_redirect"));
                if (ayy.A0B() && (ase = (ASE) map.get("INTEGRITY_LOGGER")) != null) {
                    ayy.A08(AnonymousClass0C5.$const$string(371), ase.A02);
                    List<C23592ASr> unmodifiableList = Collections.unmodifiableList(ase.A06);
                    ArrayList arrayList = new ArrayList();
                    for (C23592ASr aSr : unmodifiableList) {
                        C25078AzK azK = new C25078AzK();
                        azK.A03("domain", aSr.A00);
                        azK.A03("md5Domain", aSr.A01);
                        azK.A03(IgReactNavigatorModule.URL, aSr.A03);
                        azK.A03("md5Path", aSr.A02);
                        arrayList.add(azK);
                    }
                    ayy.A09("redirect_chain", arrayList);
                    List unmodifiableList2 = Collections.unmodifiableList(ase.A07);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = unmodifiableList2.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw null;
                    }
                    ayy.A09("safe_browsing", arrayList2);
                    ayy.A09("request_domains", new ArrayList(Collections.unmodifiableSet(ase.A0C)));
                    ayy.A0A("resources_mime_type_count", Collections.unmodifiableMap(ase.A0A));
                    ayy.A09("images_url", new ArrayList(Collections.unmodifiableSet(ase.A0B)));
                    ayy.A04("is_page_loaded", ase.A00);
                    ayy.A08("sim_hash", ase.A03);
                    ayy.A08("sim_hash_text", ase.A05);
                    ayy.A08("sim_hash_dom", ase.A04);
                    ayy.A07("page_size", ase.A01);
                    ayy.A08("ad_id", str2);
                    ayy.A0A("html_tag_counts", Collections.unmodifiableMap(ase.A08));
                    Map unmodifiableMap = Collections.unmodifiableMap(ase.A09);
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : unmodifiableMap.entrySet()) {
                        Object key = entry.getKey();
                        C25077AzJ azJ = new C25077AzJ();
                        azJ.A01(IgReactMediaPickerNativeModule.WIDTH, Long.valueOf(((ASK) entry.getValue()).A01).longValue());
                        azJ.A01(IgReactMediaPickerNativeModule.HEIGHT, Long.valueOf(((ASK) entry.getValue()).A00).longValue());
                        hashMap.put(key, azJ);
                    }
                    ayy.A0A("images_sizes", hashMap);
                    ayy.A01();
                }
            }
            AnonymousClass0Z0.A0A(579497391, A03);
        }

        public final void A8T(Bundle bundle) {
            AnonymousClass0Z0.A0A(-37096398, AnonymousClass0Z0.A03(2139039858));
        }

        public final void ADy(AutofillScriptCallback autofillScriptCallback) {
            int A03 = AnonymousClass0Z0.A03(14631190);
            BrowserLiteCallbackService browserLiteCallbackService = BrowserLiteCallbackService.this;
            AnonymousClass0C1 r2 = this.A01;
            autofillScriptCallback.AuF(((C486228u) r2.AVA(C486228u.class, new AnonymousClass295(browserLiteCallbackService, r2))).A00.getString("autofill_js", ""));
            AnonymousClass0Z0.A0A(-670200692, A03);
        }

        public final PrefetchCacheEntry ASV(String str) {
            AnonymousClass0Z0.A0A(-2143678621, AnonymousClass0Z0.A03(652565983));
            return null;
        }

        public final List ASW() {
            int A03 = AnonymousClass0Z0.A03(-2116518670);
            ArrayList arrayList = new ArrayList();
            AnonymousClass0Z0.A0A(1634670910, A03);
            return arrayList;
        }

        public final void AbB(String str) {
            AnonymousClass0Z0.A0A(27819589, AnonymousClass0Z0.A03(1191894845));
        }

        public final int AbN(String str) {
            int i;
            int A03 = AnonymousClass0Z0.A03(-1751463733);
            if (str == null) {
                i = -699488041;
            } else {
                try {
                    Uri parse = Uri.parse(str);
                    Intent parseUri = Intent.parseUri(str, 1);
                    if (parse.getHost() == null || parseUri.getScheme() == null || parseUri.getPackage() == null || !parse.getHost().equalsIgnoreCase("instagram.com") || !parseUri.getScheme().equalsIgnoreCase("https") || !parseUri.getPackage().equalsIgnoreCase("com.instagram.android")) {
                        i = -1003852109;
                    } else {
                        parseUri.addFlags(268435456);
                        parseUri.addCategory("android.intent.category.BROWSABLE");
                        parseUri.setComponent((ComponentName) null);
                        parseUri.setSelector((Intent) null);
                        AnonymousClass1BH.A0C(parseUri, BrowserLiteCallbackService.this);
                        AnonymousClass0Z0.A0A(-796324464, A03);
                        return 1;
                    }
                } catch (URISyntaxException unused) {
                    AnonymousClass0Z0.A0A(-1151432773, A03);
                    return 0;
                }
            }
            AnonymousClass0Z0.A0A(i, A03);
            return 0;
        }

        public final boolean AbP(String str) {
            int A03 = AnonymousClass0Z0.A03(-1799363167);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setFlags(268435456);
            AnonymousClass1BH.A0D(intent, BrowserLiteCallbackService.this.getApplicationContext());
            AnonymousClass0Z0.A0A(-2016910954, A03);
            return true;
        }

        public final boolean AbS(String str, String str2, String str3, String str4, String str5) {
            AnonymousClass0Z0.A0A(49723364, AnonymousClass0Z0.A03(-319905470));
            return false;
        }

        public final boolean AbT(String str) {
            AnonymousClass0Z0.A0A(891571372, AnonymousClass0Z0.A03(-1208131281));
            return false;
        }

        public final void AbV(String str, String str2) {
            AnonymousClass0Z0.A0A(661319706, AnonymousClass0Z0.A03(-764356639));
        }

        public final boolean AbY(String str, String str2) {
            AnonymousClass0Z0.A0A(-801746046, AnonymousClass0Z0.A03(-1686733816));
            return false;
        }

        public final void Aii(String str) {
            AnonymousClass0Z0.A0A(1108537867, AnonymousClass0Z0.A03(-897528866));
        }

        public final void AjU(String str, Map map) {
            AnonymousClass0Z0.A0A(-181662019, AnonymousClass0Z0.A03(1181091863));
        }

        public final void Alz(String str, long j, long j2, long j3, long j4, long j5, int i, boolean z, boolean z2, boolean z3, Map map, boolean z4, String str2, Map map2) {
            int A03 = AnonymousClass0Z0.A03(-533364577);
            if (!((Boolean) AnonymousClass0L6.A02(this.A01, AnonymousClass0L7.AD_IAB_QPL_KILL_SWITCH, "is_enabled", true, (AnonymousClass04H) null)).booleanValue()) {
                if (map2 != null) {
                    for (Map.Entry entry : map2.entrySet()) {
                        AnonymousClass00B.A01.markerPoint(19791876, 0, (String) entry.getKey(), (String) null, ((Long) entry.getValue()).longValue());
                    }
                }
                AnonymousClass00B.A01.markerEnd(19791876, 2);
            }
            AnonymousClass0Z0.A0A(-1135667992, A03);
        }

        public final void Amz(Map map) {
            AnonymousClass0Z0.A0A(1270938907, AnonymousClass0Z0.A03(-1859661392));
        }

        public final String Aos(String str) {
            int A03 = AnonymousClass0Z0.A03(-1873604304);
            if (str != null) {
                try {
                    Uri A002 = C08480Xf.A00(str);
                    if (A002 != null) {
                        String host = A002.getHost();
                        String path = A002.getPath();
                        if (host != null && path != null && host.endsWith(AnonymousClass0C5.$const$string(40)) && path.startsWith("/browser/closeWindow")) {
                            ATJ.A01(BrowserLiteCallbackService.this.getApplicationContext(), "ACTION_CLOSE_BROWSER", (Bundle) null, A01());
                        }
                    }
                } catch (SecurityException e) {
                    AnonymousClass0QD.A01("IAB Logging", e.getMessage());
                } catch (IllegalArgumentException unused) {
                }
            }
            AnonymousClass0Z0.A0A(-553905829, A03);
            return null;
        }

        public final void AqG(Bundle bundle) {
            AnonymousClass0Z0.A0A(1258691220, AnonymousClass0Z0.A03(1947487564));
        }

        public final void Asq(String str, AutofillOptOutCallback autofillOptOutCallback) {
            int A03 = AnonymousClass0Z0.A03(600523107);
            AnonymousClass0C1 r7 = this.A01;
            if (r7 != null) {
                C25047Ayf ayf = new C25047Ayf(C06360Ot.formatString("{\"key\":\"%s\",\"is_new_domain_opt_out\":%b}", str, (Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.IAB_AUTOFILL_DOMAIN_OPT_OUT, AnonymousClass0C5.$const$string(96), false, (AnonymousClass04H) null)));
                AnonymousClass25V A002 = AnonymousClass25V.A00(this.A01);
                A002.A03(ayf);
                A002.A04(Constants.ZERO);
                C17850qu A022 = A002.A02(Constants.ONE);
                A022.A00 = new C25033AyR(this, autofillOptOutCallback, str);
                C05700Lp.A00().ADc(new C25030AyO(this, A022));
            }
            AnonymousClass0Z0.A0A(851638773, A03);
        }

        public final void AyW(String str, Bundle bundle) {
            AnonymousClass0Z0.A0A(1943583170, AnonymousClass0Z0.A03(298492839));
        }

        public final void B33(String str, String str2, Map map, Bundle bundle) {
            int A03 = AnonymousClass0Z0.A03(-2017911798);
            AnonymousClass2WV r1 = new AnonymousClass2WV(bundle);
            C25037AyV ayV = this.A00;
            Context applicationContext = BrowserLiteCallbackService.this.getApplicationContext();
            AnonymousClass0C1 r6 = this.A01;
            boolean z = false;
            if (r1.A00.getString("TrackingInfo.ARG_AD_ID") != null) {
                z = true;
            }
            long j = ayV.A01;
            long j2 = 0;
            if (j > 0) {
                j2 = (SystemClock.elapsedRealtime() - j) - ayV.A00;
            }
            if (z) {
                AnonymousClass0L7 r3 = AnonymousClass0L7.IAB_EXIT_SURVEY;
                if (j2 >= ((long) ((Integer) AnonymousClass0L6.A02(r6, r3, "dwell_time_ms", 30000, (AnonymousClass04H) null)).intValue()) && ((Boolean) AnonymousClass0L6.A02(r6, r3, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    AnonymousClass0a4.A06(r6);
                    C207878vz r12 = new C207878vz(applicationContext, r6);
                    r12.A00 = C207908w2.LAUNCH_EXIT_SURVEY;
                    AnonymousClass1BH.A03(r12.A00(), applicationContext);
                }
            }
            AnonymousClass0Z0.A0A(-1006195755, A03);
        }

        public final void B3J(String str) {
            int A03 = AnonymousClass0Z0.A03(-1843404699);
            if ("BrowserLiteIntent.InstagramExtras.EXTRA_ERROR_SCREEN_ENABLED".equals(str)) {
                C05680Ln.AG8.A02(this.A01);
            }
            AnonymousClass0Z0.A0A(-1755510600, A03);
        }

        public final void B4w() {
            AnonymousClass0Z0.A0A(-983310826, AnonymousClass0Z0.A03(1063276521));
        }

        public final void B6p(String str, List list) {
            AnonymousClass0Z0.A0A(1147059999, AnonymousClass0Z0.A03(824087382));
        }

        public final void B8Y(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback) {
            int A03 = AnonymousClass0Z0.A03(1682378903);
            Context applicationContext = BrowserLiteCallbackService.this.getApplicationContext();
            String str = browserLiteJSBridgeCall.A04;
            if ("saveAutofillData".equals(str)) {
                ImmutableMap immutableMap = ((SaveAutofillDataJSBridgeCallData) browserLiteJSBridgeCall.A02.getParcelable("saveAutofillDataData")).A00;
                if (immutableMap != null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : immutableMap.entrySet()) {
                        if (!((ArrayList) entry.getValue()).isEmpty()) {
                            hashMap.put(entry.getKey(), ((ArrayList) entry.getValue()).get(0));
                        }
                    }
                    C242713y.A00(applicationContext, this.A01).A03(new AutofillData((Map) hashMap));
                }
            } else if ("requestAutoFill".equals(str)) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS", new ArrayList(C242713y.A00(applicationContext, this.A01).A02()));
                browserLiteJSBridgeCallback.AuE(browserLiteJSBridgeCall, 0, bundle);
            }
            AnonymousClass0Z0.A0A(-452306381, A03);
        }

        public final void BDZ(String str, int i) {
            AnonymousClass0Z0.A0A(1107846194, AnonymousClass0Z0.A03(1488185448));
        }

        public final void BDc(String str, Bundle bundle, int i, long j) {
            AnonymousClass0Z0.A0A(2094223085, AnonymousClass0Z0.A03(-544469479));
        }

        public final void BDl(String str, String str2, Bundle bundle) {
            AnonymousClass0Z0.A0A(1651273422, AnonymousClass0Z0.A03(696749261));
        }

        public final void BE2(String str, boolean z) {
            int A03 = AnonymousClass0Z0.A03(-929818373);
            this.A00.A02 = SystemClock.elapsedRealtime();
            BrowserLiteCallbackService.this.A00.obtainMessage(3, Boolean.valueOf(z)).sendToTarget();
            AnonymousClass0Z0.A0A(828243820, A03);
        }

        public final void BJz(String str, Bundle bundle) {
            String A012;
            int A03 = AnonymousClass0Z0.A03(-1972229208);
            C25037AyV ayV = this.A00;
            long j = ayV.A02;
            if (j > 0) {
                ayV.A00 += SystemClock.elapsedRealtime() - j;
                ayV.A02 = -1;
            }
            AnonymousClass2WV r7 = new AnonymousClass2WV(bundle);
            Bundle bundle2 = new Bundle();
            if (((Boolean) AnonymousClass0L6.A02(this.A01, AnonymousClass0L7.USE_WEB_VIEW_DEST_MODULE, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                A012 = r7.A00.getString("TrackingInfo.ARG_BROWSER_MODULE_NAME", "in_app_browser_v2");
            } else {
                A012 = r7.A01();
            }
            bundle2.putString("moduleName", A012);
            if (((Boolean) AnonymousClass0L6.A02(this.A01, AnonymousClass0L7.USE_WEB_VIEW_DEST_URL, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                bundle2.putString(IgReactNavigatorModule.URL, str);
            }
            Message obtainMessage = BrowserLiteCallbackService.this.A00.obtainMessage(2);
            obtainMessage.setData(bundle2);
            obtainMessage.sendToTarget();
            AnonymousClass0Z0.A0A(745656846, A03);
        }

        public final void BLU(String str) {
            AnonymousClass0Z0.A0A(72863120, AnonymousClass0Z0.A03(433296765));
        }

        public final void BMU() {
            AnonymousClass0Z0.A0A(-1273892345, AnonymousClass0Z0.A03(563091827));
        }

        public final void BTn(Bundle bundle, String str) {
            AnonymousClass0Z0.A0A(1780130566, AnonymousClass0Z0.A03(-959712689));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
            r0 = -1844709435;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
            r4 = p000X.AnonymousClass0P4.A00(r0, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0181, code lost:
            r4 = r0.A03();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x03d1, code lost:
            p000X.AnonymousClass0WN.A01(r10.A01).BcG(r4);
         */
        public final void BTq(Map map, Bundle bundle) {
            AnonymousClass2WV r0;
            byte b;
            byte b2;
            C37141jB r02;
            String str;
            int i;
            int A03 = AnonymousClass0Z0.A03(1090651581);
            Map map2 = map;
            String str2 = (String) map2.get("action");
            if (str2 != null) {
                Bundle bundle2 = bundle;
                if (bundle == null) {
                    r0 = new AnonymousClass2WV();
                } else {
                    r0 = new AnonymousClass2WV(bundle2);
                }
                Long l = null;
                C157336nl r6 = new C157336nl(r0.A01(), (String) null);
                char c = 65535;
                switch (str2.hashCode()) {
                    case -1401623561:
                        if (str2.equals("ACTION_GO_FORWARD")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1345844387:
                        if (str2.equals("ACTION_REPORT")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 26614404:
                        if (str2.equals("COPY_LINK")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 139450422:
                        if (str2.equals("BrowserLiteIntent.IAB_AUTOFILL_INTERACTION")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 355631317:
                        if (str2.equals("ACTION_GO_BACK")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1042493085:
                        if (str2.equals("iabProcessStart")) {
                            c = 10;
                            break;
                        }
                        break;
                    case 1205853038:
                        if (str2.equals("SHARE_VIA")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1207141188:
                        if (str2.equals("ACTION_EDIT_AUTOFILL_SETTINGS")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1398948562:
                        if (str2.equals("ACTION_OPEN_WITH")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1796890997:
                        if (str2.equals("ACTION_SEND_IN_DIRECT")) {
                            c = 8;
                            break;
                        }
                        break;
                    case 1803427515:
                        if (str2.equals("REFRESH")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        str = "browser_back";
                        break;
                    case 1:
                        str = "browser_forward";
                        break;
                    case 2:
                        ATJ.A01(BrowserLiteCallbackService.this.getApplicationContext(), "ACTION_REFRESH_TOP_WEBVIEW", (Bundle) null, A01());
                        break;
                    case 3:
                        if (map2.get("destination") != null) {
                            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("browser_open_link", r6);
                            A002.A0G("destination", (String) map2.get("destination"));
                            A002.A0H("click_id", (String) map2.get("click_id"));
                            AnonymousClass0WN.A01(this.A01).BcG(A002);
                            break;
                        }
                        break;
                    case 4:
                        if (map2.get(IgReactNavigatorModule.URL) != null) {
                            String str3 = (String) map2.get(IgReactNavigatorModule.URL);
                            String str4 = (String) map2.get("click_id");
                            if ("BrowserLiteIntent.InstagramExtras.EXTRA_FOLLOWING_PAGE".equals((String) map2.get("BrowserLiteIntent.InstagramExtras.EXTRA_PAGE_TYPE")) && str4 != null) {
                                str3 = Uri.parse(str3).buildUpon().appendQueryParameter("fbclid", str4).build().toString();
                            }
                            BrowserLiteCallbackService.this.A00.obtainMessage(0, str3).sendToTarget();
                            r02 = C37591ju.A03("browser_copy_link", r6);
                            r02.A53 = str3;
                            r02.A3m = str4;
                            break;
                        }
                        break;
                    case 5:
                        Bundle bundle3 = new Bundle();
                        bundle3.putStringArrayList("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS", new ArrayList(C242713y.A00(BrowserLiteCallbackService.this.getApplicationContext(), this.A01).A02()));
                        bundle3.putString("BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE", "iab_overflow_menu");
                        bundle3.putInt("BrowserLiteIntent.InstagramExtras.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS_INDEX", 0);
                        C59032gv.A03(ModalActivity.class, "edit_autofill_entry", bundle3, BrowserLiteCallbackService.this.getApplicationContext());
                        break;
                    case 6:
                        if (map2.get(IgReactNavigatorModule.URL) != null) {
                            String str5 = (String) map2.get(IgReactNavigatorModule.URL);
                            BrowserLiteCallbackService.this.A00.obtainMessage(1, str5).sendToTarget();
                            String A003 = A00(r0);
                            C25068Az2 az2 = new C25068Az2(AnonymousClass0QT.A00(this.A01, r6).A02("iab_share"));
                            az2.A08("iab_session_id", (String) map2.get("BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID"));
                            az2.A08("target_url", str5);
                            az2.A08("tracking_token", A003);
                            az2.A08("sharing_type", "default_share_sheet");
                            az2.A05("event_ts", Double.valueOf((double) System.currentTimeMillis()));
                            az2.A01();
                            r02 = C37591ju.A03("browser_share_via", r6);
                            r02.A53 = str5;
                            break;
                        }
                        break;
                    case 7:
                        Bundle bundle4 = new Bundle();
                        bundle4.putString(AnonymousClass0C5.$const$string(66), "start_website_report");
                        bundle4.putString(AnonymousClass0C5.$const$string(67), BrowserLiteCallbackService.this.getString(C0003R.string.in_app_browser_menu_item_report_website));
                        bundle4.putString("media_id", r0.A00());
                        bundle4.putString(IgReactNavigatorModule.URL, (String) map2.get("current_url"));
                        bundle4.putString("initial_url", (String) map2.get(IgReactNavigatorModule.URL));
                        bundle4.putBoolean(AnonymousClass0C5.$const$string(88), true);
                        bundle4.putBundle("tracking", bundle2);
                        C59032gv.A03(TransparentBackgroundModalActivity.class, AnonymousClass0C5.$const$string(65), bundle4, BrowserLiteCallbackService.this.getApplicationContext());
                        break;
                    case 8:
                        String A004 = r0.A00();
                        String str6 = (String) map2.get(IgReactNavigatorModule.URL);
                        String A005 = A00(r0);
                        String str7 = (String) map2.get("BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID");
                        C25067Az1 az1 = new C25067Az1(AnonymousClass0QT.A00(this.A01, r6).A02("iab_share_open"));
                        az1.A08("target_url", str6);
                        az1.A08("share_sheet_type", C193418Ps.$const$string(148));
                        az1.A08("iab_session_id", str7);
                        az1.A08("tracking_token", A005);
                        az1.A05("event_ts", Double.valueOf((double) System.currentTimeMillis()));
                        az1.A01();
                        Context applicationContext = BrowserLiteCallbackService.this.getApplicationContext();
                        AnonymousClass0C1 r1 = this.A01;
                        AnonymousClass0a4.A06(r1);
                        C207878vz r2 = new C207878vz(applicationContext, r1);
                        r2.A00 = C207908w2.SHARE_IN_DIRECT;
                        r2.A05 = !r0.A00.getBoolean(AnonymousClass0C5.$const$string(180));
                        r2.A04 = str6;
                        r2.A02 = A004;
                        r2.A03 = A005;
                        r2.A01 = str7;
                        AnonymousClass1BH.A03(r2.A00(), BrowserLiteCallbackService.this.getApplicationContext());
                        break;
                    case 9:
                        String str8 = (String) map2.get("user_action");
                        if ("NOT_NOW_CLICK".equals(str8)) {
                            C16180oA A006 = C16180oA.A00(this.A01);
                            int i2 = A006.A00.getInt("browser_consecutive_decline_autofill", 0) + 1;
                            A006.A00.edit().putInt("browser_consecutive_decline_autofill", i2).apply();
                            if (i2 >= 5) {
                                C37141jB A032 = C37591ju.A03("iab_autofill_interaction", r6);
                                A032.A2w = "USER_PERMANENT_OPTOUT";
                                AnonymousClass0WN.A01(this.A01).BcG(A032.A03());
                            }
                        } else if (C24090Ahp.A01.contains(str8)) {
                            C16180oA.A00(this.A01).A00.edit().putInt("browser_consecutive_decline_autofill", 0).apply();
                        }
                        C37141jB A033 = C37591ju.A03("iab_autofill_interaction", r6);
                        A033.A2w = str8;
                        AnonymousClass0P4 r4 = A033.A03();
                        r4.A0H("iab_session_id", (String) map2.get("iab_session_id"));
                        r4.A0H("form_completion_duration", (String) map2.get("form_completion_duration"));
                        r4.A0H("selected_field_tag", (String) map2.get("selected_field_tag"));
                        r4.A0H("requested_fields", (String) map2.get("requested_fields"));
                        r4.A0H("available_fields", (String) map2.get("available_fields"));
                        r4.A0H("previous_fields", (String) map2.get("previous_fields"));
                        r4.A0H("new_fields", (String) map2.get("new_fields"));
                        r4.A0H("edited_fields", (String) map2.get("edited_fields"));
                        r4.A0H("event_times", (String) map2.get("event_times"));
                        r4.A0H("current_url", (String) map2.get("current_url"));
                        r4.A0H("form_session_id", (String) map2.get("form_session_id"));
                        if (map2.get("index") != null) {
                            String valueOf = String.valueOf(map2.get("index"));
                            String str9 = valueOf;
                            AnonymousClass0a4.A06(valueOf);
                            if (!valueOf.isEmpty()) {
                                int i3 = 0;
                                if (valueOf.charAt(0) == '-') {
                                    i3 = 1;
                                }
                                int length = valueOf.length();
                                if (i3 != length) {
                                    int i4 = i3 + 1;
                                    char charAt = valueOf.charAt(i3);
                                    if (charAt < 128) {
                                        b = C25042Aya.A00[charAt];
                                    } else {
                                        b = -1;
                                    }
                                    if (b >= 0 && b < 10) {
                                        long j = (long) (-b);
                                        long j2 = (long) 10;
                                        long j3 = Long.MIN_VALUE / j2;
                                        while (true) {
                                            if (i4 < length) {
                                                int i5 = i4 + 1;
                                                char charAt2 = str9.charAt(i4);
                                                if (charAt2 < 128) {
                                                    b2 = C25042Aya.A00[charAt2];
                                                } else {
                                                    b2 = -1;
                                                }
                                                if (b2 >= 0 && b2 < 10 && j >= j3) {
                                                    long j4 = j * j2;
                                                    long j5 = (long) b2;
                                                    if (j4 >= j5 - Long.MIN_VALUE) {
                                                        j = j4 - j5;
                                                        i4 = i5;
                                                    }
                                                }
                                            } else if (i3 != 0) {
                                                l = Long.valueOf(j);
                                            } else if (j != Long.MIN_VALUE) {
                                                l = Long.valueOf(-j);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (l != null) {
                            r4.A0F("index", l);
                            break;
                        }
                        break;
                    case 10:
                        C25066Az0 az0 = new C25066Az0(AnonymousClass0QT.A01(this.A01, new C25031AyP(this, r0), AnonymousClass0QV.A06).A02("ig_iab_proccess_start"));
                        az0.A08("iab_session_id", r0.A00.getString("Tracking.ARG_SESSION_ID"));
                        az0.A04("is_initial_start", Boolean.valueOf((String) map2.get("iabIsInitialProcessStart")));
                        az0.A01();
                        break;
                }
            } else {
                AnonymousClass0QD.A01("BrowserLiteCallbackService$BrowserLiteCallbackImpl", "#onUserAction() null action");
                i = -1569880722;
            }
            AnonymousClass0Z0.A0A(i, A03);
        }

        public final void BWX(String str) {
            AnonymousClass0Z0.A0A(-123962421, AnonymousClass0Z0.A03(720725308));
        }

        public final void BWd(String str, Bundle bundle) {
            AnonymousClass0Z0.A0A(1463211987, AnonymousClass0Z0.A03(1870423535));
        }

        public final void BWi() {
            AnonymousClass0Z0.A0A(283672219, AnonymousClass0Z0.A03(205481862));
        }

        public final void Bcm(long[] jArr) {
            int A03 = AnonymousClass0Z0.A03(579075409);
            for (long Bc9 : jArr) {
                AnonymousClass0WN.A01(this.A01).Bc9(Bc9);
            }
            AnonymousClass0Z0.A0A(993693810, A03);
        }

        public final void BjE(String str) {
            AnonymousClass0Z0.A0A(-1179273335, AnonymousClass0Z0.A03(409635166));
        }

        public final void Br9() {
            AnonymousClass0Z0.A0A(539297683, AnonymousClass0Z0.A03(-1697873440));
        }

        public final void Bs4(Bundle bundle) {
            AnonymousClass0Z0.A0A(-121653057, AnonymousClass0Z0.A03(841277013));
        }
    }

    public final IBinder onBind(Intent intent) {
        return new BrowserLiteCallbackImpl();
    }
}
