package com.facebook.browser.lite;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.C0003R;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import com.facebook.browser.lite.views.BrowserLiteErrorScreen;
import com.facebook.browser.lite.views.BrowserLiteGestureDelegateView;
import com.facebook.browser.lite.views.BrowserLiteWrapperView;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABFirstPauseEvent;
import com.facebook.iabeventlogging.model.IABLandingPageStartedEvent;
import com.facebook.iabeventlogging.model.IABLandingPageViewEndedEvent;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import p000X.ADA;
import p000X.ADB;
import p000X.AQ8;
import p000X.AQA;
import p000X.AQD;
import p000X.AQE;
import p000X.AQJ;
import p000X.AQL;
import p000X.AQM;
import p000X.AQO;
import p000X.AQP;
import p000X.AQR;
import p000X.AQS;
import p000X.AQT;
import p000X.AQV;
import p000X.AQX;
import p000X.AQY;
import p000X.AQZ;
import p000X.ARE;
import p000X.ARF;
import p000X.ARG;
import p000X.ARM;
import p000X.ARN;
import p000X.ARP;
import p000X.ARQ;
import p000X.ARR;
import p000X.ARU;
import p000X.AS5;
import p000X.ASA;
import p000X.ASB;
import p000X.ASC;
import p000X.ASO;
import p000X.ATH;
import p000X.ATK;
import p000X.ATL;
import p000X.ATN;
import p000X.ATp;
import p000X.AUA;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Z9;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass2WW;
import p000X.AnonymousClass2ZY;
import p000X.B34;
import p000X.C05370Ke;
import p000X.C195468Yc;
import p000X.C225219mn;
import p000X.C23530AQa;
import p000X.C23534AQe;
import p000X.C23535AQf;
import p000X.C23537AQh;
import p000X.C23538AQi;
import p000X.C23539AQj;
import p000X.C23540AQk;
import p000X.C23542AQm;
import p000X.C23546AQq;
import p000X.C23550AQu;
import p000X.C23560ARe;
import p000X.C23564ARi;
import p000X.C23565ARj;
import p000X.C23570ARp;
import p000X.C23590ASp;
import p000X.C23600ATg;
import p000X.C23602ATi;
import p000X.C25138B2q;

public class BrowserLiteFragment extends Fragment implements ASB, ATp {
    public static final Pattern A0w = Pattern.compile("(?i)^https://(.*)\\.facebook\\.com/(flx/warn|fblynx/warn|si/linkclick/warn)/(.*)");
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Context A07;
    public Intent A08;
    public Uri A09;
    public Bundle A0A;
    public TextView A0B;
    public BrowserLiteJSBridgeProxy A0C;
    public C23570ARp A0D;
    public ATL A0E;
    public ARQ A0F;
    public AQR A0G;
    public AQE A0H = new AQE();
    public C23560ARe A0I;
    public ARG A0J;
    public BrowserLiteErrorScreen A0K;
    public BrowserLiteWrapperView A0L;
    public AQA A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public List A0Q = Collections.emptyList();
    public List A0R = Collections.emptyList();
    public List A0S = Collections.emptyList();
    public List A0T = Collections.emptyList();
    public boolean A0U = false;
    public boolean A0V;
    public boolean A0W = false;
    public boolean A0X = false;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a = false;
    public boolean A0b = false;
    public boolean A0c = false;
    public boolean A0d = false;
    public boolean A0e;
    public long A0f = -1;
    public View A0g;
    public View A0h;
    public View A0i;
    public FrameLayout A0j;
    public ARF A0k;
    public String A0l;
    public ExecutorService A0m;
    public boolean A0n = true;
    public boolean A0o = false;
    public boolean A0p;
    public boolean A0q = true;
    public boolean A0r;
    public boolean A0s = false;
    public final Set A0t = new HashSet();
    public final Stack A0u = new Stack();
    public volatile String A0v;

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:205)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1507)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0032 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    public final boolean A0J(java.lang.String r6) {
        /*
            r5 = this;
            r4 = 1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 0
            r1[r0] = r6
            java.lang.String r0 = "handleInvalidProtocol %s"
            p000X.ATK.A03(r0, r1)
            X.ATL r0 = r5.A0E
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r0.A06
            if (r0 == 0) goto L_0x0016
            int r3 = r0.AbN(r6)     // Catch:{ RemoteException -> 0x0016 }
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            java.util.List r0 = r5.A0S
            java.util.Iterator r2 = r0.iterator()
        L_0x001d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r1 = r2.next()
            X.AQM r1 = (p000X.AQM) r1
            boolean r0 = r5.A0U
            boolean r0 = r1.B6E(r6, r3, r0)
            if (r0 == 0) goto L_0x001d
        L_0x0031:
            return r4
        L_0x0032:
            if (r3 == r4) goto L_0x0031
            r0 = 2
            if (r3 == r0) goto L_0x006b
            r0 = 3
            if (r3 == r0) goto L_0x0063
            r5.A0O = r6
            X.AQA r1 = r5.A0M
            boolean r0 = r1.A0R
            if (r0 == 0) goto L_0x0044
            r1.A0H = r6
        L_0x0044:
            android.content.Context r0 = r5.A07
            boolean r4 = p000X.ADA.A03(r0, r6)
            java.util.List r0 = r5.A0S
            java.util.Iterator r1 = r0.iterator()
        L_0x0050:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005a
            r1.next()
            goto L_0x0050
        L_0x005a:
            if (r4 != 0) goto L_0x0031
            r0 = 2131820564(0x7f110014, float:1.9273847E38)
            r5.A05(r0)
            return r4
        L_0x0063:
            r0 = 2131820564(0x7f110014, float:1.9273847E38)
            r5.A05(r0)
            r4 = 0
            return r4
        L_0x006b:
            r0 = 4
            r5.A8u(r0, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.A0J(java.lang.String):boolean");
    }

    public final boolean B6C(boolean z) {
        BrowserLiteWebChromeClient A11;
        boolean z2;
        this.A02 = 2;
        boolean z3 = false;
        List list = this.A0Q;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((AQP) it.next()).B6B()) {
                        z3 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (!z3) {
            AQ8 AYf = AYf();
            if (AYf != null) {
                if (AYf == null) {
                    A11 = null;
                } else {
                    A11 = AYf.A11();
                }
                if (A11 != null) {
                    boolean z4 = false;
                    if (A11.A07.getVisibility() == 0) {
                        z4 = true;
                    }
                    if (z4) {
                        A11.A03();
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        z3 = true;
                    }
                }
                if (AYf.A18()) {
                    AYf.A0J();
                    z3 = true;
                } else if (this.A0u.size() > 1) {
                    A08(this);
                    z3 = true;
                }
            }
            z3 = false;
        }
        if (z3) {
            C23560ARe aRe = this.A0I;
            if (aRe != null) {
                aRe.A01 = SystemClock.elapsedRealtime();
            }
            if (z) {
                this.A03++;
            }
        }
        return z3;
    }

    public static BrowserLiteErrorScreen A02(BrowserLiteFragment browserLiteFragment, C23550AQu aQu) {
        if (browserLiteFragment.A0K == null) {
            ViewStub viewStub = (ViewStub) browserLiteFragment.getView().findViewById(C0003R.C0005id.browser_lite_error_screen_stub);
            if (viewStub != null) {
                viewStub.setLayoutResource(C0003R.layout.browser_lite_error_screen);
                browserLiteFragment.A0K = (BrowserLiteErrorScreen) viewStub.inflate();
            } else if (aQu == null) {
                return null;
            } else {
                aQu.A00.cancel();
                return null;
            }
        }
        return browserLiteFragment.A0K;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0267, code lost:
        if (r1.contains("\"account_type\":1") == false) goto L_0x0269;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02ed A[LOOP:1: B:91:0x02e7->B:93:0x02ed, LOOP_END] */
    private AQ8 A03() {
        AQ8 aq8;
        WebSettings A092;
        String stringExtra;
        BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy;
        ArrayList<Bundle> parcelableArrayListExtra;
        Intent intent;
        int intExtra;
        String str;
        boolean z;
        C23590ASp.A00().A01("BLF.createWebView.Start");
        Context context = this.A07;
        if (this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_USE_HELIUM_IAB", false)) {
            try {
                aq8 = (AQ8) Class.forName("com.facebook.browser.helium.HeliumWebViewProvider").getMethod("loadHelium", new Class[]{Context.class, AttributeSet.class, Integer.TYPE}).invoke((Object) null, new Object[]{context, null, 16842885});
            } catch (IllegalAccessException e) {
                AnonymousClass0DB.A0M("WebViewLiteProvider", e, "Got IllegalAccessException while loading WebView");
            } catch (InvocationTargetException e2) {
                AnonymousClass0DB.A0M("WebViewLiteProvider", e2, "Got InvocationTargetException while loading WebView");
            } catch (NoSuchMethodException e3) {
                AnonymousClass0DB.A0M("WebViewLiteProvider", e3, "Got NoSuchMethodException while loading WebView");
            } catch (ClassNotFoundException e4) {
                AnonymousClass0DB.A0M("WebViewLiteProvider", e4, "Got ClassNotFoundException while loading WebView");
            }
            C23590ASp.A00().A01("BLF.createWebView.inflate_end");
            if (this.A0Z && this.A08.getIntExtra("BrowserLiteIntent.EXTRA_LE_DESIGN_EXPERIMENT_STYLE", 0) == 1) {
                aq8.A0U(0);
            }
            aq8.A09 = new C23540AQk(this);
            Bundle extras = this.A08.getExtras();
            aq8.A0g(new FrameLayout.LayoutParams(-1, -1));
            aq8.A0t(true);
            aq8.A0u(true);
            aq8.A0w(true);
            aq8.A0W(33554432);
            aq8.A0f(new AQJ(this, aq8));
            if (this.A08.hasExtra("BrowserLiteIntent.EXTRA_INITIAL_SCALE")) {
                aq8.A0V(this.A08.getIntExtra("BrowserLiteIntent.EXTRA_INITIAL_SCALE", 0));
            }
            A092 = aq8.A09();
            A092.setSaveFormData(false);
            A092.setSavePassword(false);
            A092.setSupportZoom(true);
            A092.setBuiltInZoomControls(true);
            A092.setSupportMultipleWindows(this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_MULTIPLE_WINDOWS_ENABLED", true));
            A092.setDisplayZoomControls(false);
            A092.setUseWideViewPort(this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_USE_WIDE_VIEW_PORT", true));
            A092.setLoadWithOverviewMode(true);
            if (this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_RESOURCE_MEDIA_PLAYBACK_REQUIRE_USER_GESTURE_ENABLED", false)) {
                A092.setMediaPlaybackRequiresUserGesture(false);
            }
            if (extras != null && extras.getBoolean("BrowserLiteIntent.EXTRA_LAME_DUCK_MODE", false)) {
                A092.setBlockNetworkLoads(true);
            }
            A092.setJavaScriptEnabled(true);
            stringExtra = this.A08.getStringExtra("BrowserLiteIntent.EXTRA_UA");
            if (!TextUtils.isEmpty(stringExtra)) {
                String A0E2 = AnonymousClass000.A0E(A092.getUserAgentString(), stringExtra);
                this.A0P = A0E2;
                A092.setUserAgentString(A0E2);
            }
            C23564ARi aRi = new C23564ARi(this.A0G, this.A0F, this.A0E, this, this.A0D, this.A07, this.A08, this.A0e, this.A0r);
            aq8.A0i(aRi);
            aq8.A0C = aRi;
            ARQ arq = this.A0F;
            this.A08.getStringExtra("BrowserLiteIntent.EXTRA_BROWSER_THEME");
            BrowserLiteWebChromeClient browserLiteWebChromeClient = new BrowserLiteWebChromeClient(aq8, this, arq, this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_THIRD_PARTY_CAMERA_ACCESS", false), getActivity().getContentResolver(), this.A08.getBooleanExtra("BrowserLiteIntent.IAB_PERMISSION_DIALOG_ENABLED", false));
            aq8.A0h(browserLiteWebChromeClient);
            aq8.A0B = browserLiteWebChromeClient;
            aq8.A0A = new C23537AQh(this);
            C195468Yc r7 = new C195468Yc();
            r7.A00.add(new ARM(this));
            r7.A00.add(new C23542AQm(this));
            if (this.A08.getBooleanExtra("extra_enable_swipe_down_to_dismiss", false)) {
                r7.A00.add(new ARN(this));
            }
            aq8.A0e(r7);
            aq8.A0v(false);
            aq8.A0H();
            A092.setAppCacheEnabled(true);
            A092.setAppCacheMaxSize(5242880);
            A092.setDatabaseEnabled(true);
            A092.setDomStorageEnabled(true);
            aq8.A0y(this.A0p);
            if (Build.VERSION.SDK_INT >= 21) {
                A0A(aq8);
                if (this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_MIXED_CONTENT_COMPATABILITY_MODE", false)) {
                    A092.setMixedContentMode(2);
                } else {
                    A092.setMixedContentMode(1);
                }
            }
            browserLiteJSBridgeProxy = this.A0C;
            if (browserLiteJSBridgeProxy != null) {
                aq8.A0k(browserLiteJSBridgeProxy, browserLiteJSBridgeProxy.A03);
            }
            C23590ASp.A00().A01("BLF.createWebView.injectSessionCookies_start");
            parcelableArrayListExtra = getIntent().getParcelableArrayListExtra(AnonymousClass0C5.$const$string(43));
            if (parcelableArrayListExtra != null) {
                HashMap hashMap = new HashMap();
                String host = this.A09.getHost();
                String path = this.A09.getPath();
                Set<String> queryParameterNames = this.A09.getQueryParameterNames();
                String str2 = null;
                if (queryParameterNames.contains("app_id")) {
                    str = this.A09.getQueryParameter("app_id");
                } else {
                    str = null;
                }
                if (queryParameterNames.contains("state")) {
                    str2 = this.A09.getQueryParameter("state");
                }
                if (!(host == null || path == null || str == null || str2 == null || !host.endsWith("instagram.com") || !path.equals("/oauth/authorize/") || !str.equals("430503497666018"))) {
                    z = true;
                }
                z = false;
                for (Bundle bundle : parcelableArrayListExtra) {
                    String string = bundle.getString("KEY_URL");
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_STRING_ARRAY");
                    if (!TextUtils.isEmpty(string) && stringArrayList != null && !stringArrayList.isEmpty()) {
                        if (!z || !string.endsWith("instagram.com")) {
                            hashMap.put(string, stringArrayList);
                        }
                    }
                }
                C23600ATg.A01(this.A07, hashMap, getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_COOKIE_FLUSH_ON_START_ENABLED", true));
            }
            this.A0V = true;
            C23590ASp.A00().A01("BLF.createWebView.injectSessionCookies_end");
            Intent intent2 = this.A08;
            if ((intent2 == null || !intent2.getBooleanExtra("OAUTH_DO_NOT_REMOVE_PREVIOUS_SESSION", false)) && (intent = this.A08) != null && intent.hasExtra("OAUTH_BASE_URI")) {
                Context context2 = this.A07;
                Uri parse = Uri.parse(this.A08.getStringExtra("OAUTH_BASE_URI"));
                C23600ATg.A00(context2, AnonymousClass000.A0J(parse.getScheme(), "://", parse.getHost()));
            }
            intExtra = this.A08.getIntExtra("BrowserLiteIntent.EXTRA_WEBVIEW_LAYER_TYPE", -1);
            if (intExtra >= 0 && intExtra <= 2) {
                aq8.A0Z(intExtra, (Paint) null);
            }
            for (AQM Apy : this.A0S) {
                Apy.Apy(aq8);
            }
            this.A0j.addView(aq8.A08());
            C23590ASp.A00().A01("BLF.createWebView.End");
            return aq8;
        }
        aq8 = new SystemWebView(context);
        C23590ASp.A00().A01("BLF.createWebView.inflate_end");
        aq8.A0U(0);
        aq8.A09 = new C23540AQk(this);
        Bundle extras2 = this.A08.getExtras();
        aq8.A0g(new FrameLayout.LayoutParams(-1, -1));
        aq8.A0t(true);
        aq8.A0u(true);
        aq8.A0w(true);
        aq8.A0W(33554432);
        aq8.A0f(new AQJ(this, aq8));
        if (this.A08.hasExtra("BrowserLiteIntent.EXTRA_INITIAL_SCALE")) {
        }
        A092 = aq8.A09();
        A092.setSaveFormData(false);
        A092.setSavePassword(false);
        A092.setSupportZoom(true);
        A092.setBuiltInZoomControls(true);
        A092.setSupportMultipleWindows(this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_MULTIPLE_WINDOWS_ENABLED", true));
        A092.setDisplayZoomControls(false);
        A092.setUseWideViewPort(this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_USE_WIDE_VIEW_PORT", true));
        A092.setLoadWithOverviewMode(true);
        if (this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_RESOURCE_MEDIA_PLAYBACK_REQUIRE_USER_GESTURE_ENABLED", false)) {
        }
        A092.setBlockNetworkLoads(true);
        try {
            A092.setJavaScriptEnabled(true);
        } catch (NullPointerException unused) {
        }
        stringExtra = this.A08.getStringExtra("BrowserLiteIntent.EXTRA_UA");
        if (!TextUtils.isEmpty(stringExtra)) {
        }
        C23564ARi aRi2 = new C23564ARi(this.A0G, this.A0F, this.A0E, this, this.A0D, this.A07, this.A08, this.A0e, this.A0r);
        aq8.A0i(aRi2);
        aq8.A0C = aRi2;
        ARQ arq2 = this.A0F;
        this.A08.getStringExtra("BrowserLiteIntent.EXTRA_BROWSER_THEME");
        BrowserLiteWebChromeClient browserLiteWebChromeClient2 = new BrowserLiteWebChromeClient(aq8, this, arq2, this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_THIRD_PARTY_CAMERA_ACCESS", false), getActivity().getContentResolver(), this.A08.getBooleanExtra("BrowserLiteIntent.IAB_PERMISSION_DIALOG_ENABLED", false));
        aq8.A0h(browserLiteWebChromeClient2);
        aq8.A0B = browserLiteWebChromeClient2;
        aq8.A0A = new C23537AQh(this);
        C195468Yc r72 = new C195468Yc();
        r72.A00.add(new ARM(this));
        r72.A00.add(new C23542AQm(this));
        if (this.A08.getBooleanExtra("extra_enable_swipe_down_to_dismiss", false)) {
        }
        aq8.A0e(r72);
        aq8.A0v(false);
        aq8.A0H();
        A092.setAppCacheEnabled(true);
        A092.setAppCacheMaxSize(5242880);
        A092.setDatabaseEnabled(true);
        A092.setDomStorageEnabled(true);
        aq8.A0y(this.A0p);
        if (Build.VERSION.SDK_INT >= 21) {
        }
        browserLiteJSBridgeProxy = this.A0C;
        if (browserLiteJSBridgeProxy != null) {
        }
        C23590ASp.A00().A01("BLF.createWebView.injectSessionCookies_start");
        parcelableArrayListExtra = getIntent().getParcelableArrayListExtra(AnonymousClass0C5.$const$string(43));
        if (parcelableArrayListExtra != null) {
        }
        this.A0V = true;
        C23590ASp.A00().A01("BLF.createWebView.injectSessionCookies_end");
        Intent intent22 = this.A08;
        Context context22 = this.A07;
        Uri parse2 = Uri.parse(this.A08.getStringExtra("OAUTH_BASE_URI"));
        C23600ATg.A00(context22, AnonymousClass000.A0J(parse2.getScheme(), "://", parse2.getHost()));
        intExtra = this.A08.getIntExtra("BrowserLiteIntent.EXTRA_WEBVIEW_LAYER_TYPE", -1);
        aq8.A0Z(intExtra, (Paint) null);
        while (r1.hasNext()) {
        }
        this.A0j.addView(aq8.A08());
        C23590ASp.A00().A01("BLF.createWebView.End");
        return aq8;
    }

    private void A04() {
        IABEvent iABLandingPageViewEndedEvent;
        if (!this.A0c) {
            AQA aqa = this.A0M;
            long j = aqa.A0B;
            boolean z = aqa.A0R;
            if (z) {
                aqa.A0A = j;
            }
            ATL atl = this.A0E;
            if (!z) {
                iABLandingPageViewEndedEvent = IABEvent.A04;
            } else {
                iABLandingPageViewEndedEvent = new IABLandingPageViewEndedEvent(aqa.A0K, aqa.A0A, aqa.A0P.now(), aqa.A0M);
            }
            atl.A04(iABLandingPageViewEndedEvent, this.A0A);
        }
        AQA aqa2 = this.A0M;
        int i = this.A02;
        if (aqa2.A0R) {
            aqa2.A00 = i;
        }
        this.A0E.A04(aqa2.A01(), this.A0A);
    }

    private void A05(int i) {
        String string = this.A07.getString(i);
        int i2 = 0;
        if (string.length() > 60) {
            i2 = 1;
        }
        Toast.makeText(this.A07.getApplicationContext(), string, i2).show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (android.webkit.URLUtil.isHttpsUrl(r5.toString()) == false) goto L_0x0059;
     */
    private void A07(Bundle bundle) {
        String str;
        Object[] objArr;
        String str2;
        boolean z;
        if (bundle == null) {
            AQ8 A0E2 = A0E();
            String stringExtra = this.A08.getStringExtra("BrowserLiteIntent.EXTRA_POST_DATA");
            Uri uri = this.A09;
            if (!TextUtils.isEmpty(stringExtra) && !C225219mn.A02(uri)) {
                boolean z2 = false;
                if (uri != null) {
                    String scheme = uri.getScheme();
                    if ("fb".equals(scheme) || "fb-messenger".equals(scheme) || "fbinternal".equals(scheme) || "fb-work".equals(scheme) || "dialtone".equals(scheme)) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    z = true;
                }
            }
            z = false;
            if (!z) {
                stringExtra = null;
            }
            String stringExtra2 = this.A08.getStringExtra("BrowserLiteIntent.EXTRA_REFERER");
            if (!TextUtils.isEmpty(stringExtra2)) {
                ADB.A00 = stringExtra2;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Referer", ADB.A00);
            A0G(A0E2, this.A09, hashMap, stringExtra);
            return;
        }
        if (!bundle.containsKey("web_view_number")) {
            str = "BrowserLiteFragment";
            objArr = new Object[0];
            str2 = "The fragment is reconstructed but without webview state number info!";
        } else {
            int i = bundle.getInt("web_view_number");
            if (i == 0) {
                str = "BrowserLiteFragment";
                objArr = new Object[0];
                str2 = "0 webview saved!";
            } else {
                for (int i2 = 0; i2 < i; i2++) {
                    String A052 = AnonymousClass000.A05("web_view_", i2);
                    if (!bundle.containsKey(A052)) {
                        ATK.A01("BrowserLiteFragment", "Info for webview %d (total %d) not found!", Integer.valueOf(i2), Integer.valueOf(i));
                    } else {
                        Bundle bundle2 = bundle.getBundle(A052);
                        AQ8 A032 = A03();
                        A032.A0b(bundle2);
                        this.A0u.push(A032);
                    }
                }
                A0B((AQ8) this.A0u.peek());
                Iterator it = this.A0S.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return;
            }
        }
        ATK.A01(str, str2, objArr);
    }

    public static void A08(BrowserLiteFragment browserLiteFragment) {
        if (browserLiteFragment.A0u.isEmpty()) {
            browserLiteFragment.A8u(4, (String) null);
            return;
        }
        AQ8 aq8 = (AQ8) browserLiteFragment.A0u.pop();
        aq8.A0Y(8);
        browserLiteFragment.A0j.removeView(aq8.A08());
        for (AQM BuB : browserLiteFragment.A0S) {
            BuB.BuB(aq8);
        }
        if (aq8 != null) {
            aq8.A0m(ReactWebViewManager.BLANK_URL);
            aq8.A0j((Object) null);
            aq8.A0G();
            aq8.A0O();
            try {
                aq8.A0R();
            } catch (Exception unused) {
            }
            aq8.A0I();
        }
        AQ8 AYf = browserLiteFragment.AYf();
        if (AYf == null) {
            browserLiteFragment.A8u(4, (String) null);
            return;
        }
        AYf.A0Y(0);
        AYf.A0L();
        if (browserLiteFragment.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_DISABLE_OLD_WEBVIEW_JS", true)) {
            AYf.A09().setJavaScriptEnabled(true);
        }
        browserLiteFragment.A0B(AYf);
    }

    public static void A09(BrowserLiteFragment browserLiteFragment, boolean z) {
        Bundle bundle;
        C25138B2q b2q;
        B34 b34;
        if (browserLiteFragment.A0v != null && !browserLiteFragment.A0v.equalsIgnoreCase(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            AQE aqe = browserLiteFragment.A0H;
            synchronized (aqe.A02) {
                try {
                    bundle = new Bundle();
                    bundle.putSerializable("resource_counts", new B34(aqe.A00));
                    bundle.putSerializable("resource_domains", new C25138B2q(aqe.A02));
                    bundle.putSerializable("images_url", new C25138B2q(aqe.A01));
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                }
            }
            for (ASC asc : browserLiteFragment.A0R) {
                if (!asc.A03) {
                    AQE aqe2 = asc.A04;
                    AQE aqe3 = new AQE(bundle);
                    synchronized (aqe2.A02) {
                        try {
                            Set set = aqe2.A02;
                            synchronized (aqe3.A02) {
                                try {
                                    b2q = new C25138B2q(aqe3.A02);
                                } catch (Throwable th2) {
                                    while (true) {
                                        th = th2;
                                    }
                                    throw th;
                                }
                            }
                            set.addAll(b2q);
                            aqe2.A01.addAll(aqe3.A00());
                            synchronized (aqe3.A02) {
                                try {
                                    b34 = new B34(aqe3.A00);
                                } catch (Throwable th3) {
                                    while (true) {
                                        th = th3;
                                        break;
                                    }
                                }
                            }
                            for (String str : b34.keySet()) {
                                if (aqe2.A00.containsKey(str)) {
                                    aqe2.A00.put(str, Integer.valueOf(((Integer) b34.get(str)).intValue() + ((Integer) aqe2.A00.get(str)).intValue()));
                                } else {
                                    aqe2.A00.put(str, b34.get(str));
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                    ASC.A00(asc);
                }
            }
            AQE aqe4 = browserLiteFragment.A0H;
            synchronized (aqe4.A02) {
                try {
                    aqe4.A00.clear();
                    aqe4.A02.clear();
                    aqe4.A01.clear();
                } catch (Throwable th5) {
                    while (true) {
                        th = th5;
                        break;
                    }
                }
            }
            if (z) {
                browserLiteFragment.A0v = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                return;
            }
            return;
        }
        return;
        throw th;
    }

    private void A0A(AQ8 aq8) {
        aq8.A0a(this.A07);
    }

    private void A0B(AQ8 aq8) {
        AQR aqr;
        BrowserLiteWebChromeClient A11;
        if (this.A0F == null && (aqr = this.A0G) != null) {
            if (aq8 == null) {
                A11 = null;
            } else {
                A11 = aq8.A11();
            }
            ARP arp = aqr.A00;
            if (arp != null) {
                arp.A01(aq8, A11);
            }
        }
        BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy = this.A0C;
        if (browserLiteJSBridgeProxy != null) {
            browserLiteJSBridgeProxy.A07(aq8);
        }
    }

    public final int A0D() {
        Iterator it = this.A0u.iterator();
        int i = 0;
        while (it.hasNext()) {
            ARR A0C2 = ((AQ8) it.next()).A0C();
            int i2 = A0C2.A00 + 1;
            if (i2 > A0C2.A01.size()) {
                i2 = A0C2.A01.size();
            }
            if (i2 == 0) {
                i2 = 0;
            } else if (i2 == 1) {
                i2 = !ReactWebViewManager.BLANK_URL.equals(A0C2.A00(0).A03);
            } else {
                String str = A0C2.A00(0).A03;
                String str2 = A0C2.A00(1).A03;
                if (ReactWebViewManager.BLANK_URL.equals(str) || str.equals(str2)) {
                    i2--;
                }
            }
            i += i2;
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[LOOP:0: B:30:0x0090->B:32:0x0096, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00da  */
    public final void A0G(AQ8 aq8, Uri uri, Map map, String str) {
        String str2;
        Map map2;
        String str3;
        IABEvent iABLandingPageStartedEvent;
        AQ8 aq82 = aq8;
        if (this.A0f < 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.A0f = currentTimeMillis;
            AQA aqa = this.A0M;
            if (aqa.A0R) {
                aqa.A0E = currentTimeMillis;
            }
            ATL A002 = ATL.A00();
            AQA aqa2 = this.A0M;
            if (!aqa2.A0R) {
                iABLandingPageStartedEvent = IABEvent.A04;
            } else {
                iABLandingPageStartedEvent = new IABLandingPageStartedEvent(aqa2.A0K, aqa2.A0E, aqa2.A0P.now(), aqa2.A0M);
            }
            A002.A04(iABLandingPageStartedEvent, this.A0A);
            aq8.A06 = this.A0f;
        }
        Uri uri2 = uri;
        String uri3 = uri2.toString();
        String str4 = str;
        if (!TextUtils.isEmpty(str4)) {
            try {
                aq8.A0q(uri3, str4.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                ATK.A02("BrowserLiteFragment", e, "Failed postUrl", new Object[0]);
            }
        } else {
            if (uri2 == this.A09) {
                PrefetchCacheEntry prefetchCacheEntry = this.A0D.A01;
                if (prefetchCacheEntry != null) {
                    str2 = prefetchCacheEntry.A03;
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    if (!uri3.equals(str2)) {
                        ATK.A00("BrowserLiteFragment", "Prefetch resolved final url %s -> %s", uri3, str2);
                    }
                    for (AQM B9Y : this.A0S) {
                        B9Y.B9Y(aq8, str2);
                    }
                    C23590ASp.A00().A01("BLF.loadExternalUrl.Start");
                    map2 = map;
                    if (Build.VERSION.SDK_INT != 19 || !this.A0q || !map2.containsKey("Referer")) {
                        aq8.A0p(str2, map2);
                    } else {
                        String str5 = ADB.A00;
                        try {
                            str3 = String.format("<!DOCTYPE HTML>\n<html lang=\"en-US\">\n    <head>\n        <meta charset=\"UTF-8\">\n        <script type=\"text/javascript\">\n            window.location.href = decodeURIComponent(escape(atob(\"%s\")));\n        </script>\n    </head>\n    <body/>\n</html>", new Object[]{Base64.encodeToString(str2.getBytes("UTF-8"), 2)});
                        } catch (UnsupportedEncodingException unused) {
                            str3 = null;
                        }
                        aq82.A0o(str5, str3, ReactWebViewManager.HTML_MIME_TYPE, "UTF-8", (String) null);
                    }
                    C23590ASp.A00().A01("BLF.loadExternalUrl.End");
                }
            }
            str2 = uri3;
            while (r1.hasNext()) {
            }
            C23590ASp.A00().A01("BLF.loadExternalUrl.Start");
            map2 = map;
            if (Build.VERSION.SDK_INT != 19 || !this.A0q || !map2.containsKey("Referer")) {
            }
            C23590ASp.A00().A01("BLF.loadExternalUrl.End");
        }
    }

    public final void A0H(String str) {
        ARP arp;
        this.A0l = str;
        AQR aqr = this.A0G;
        if (!(aqr == null || (arp = aqr.A00) == null)) {
            arp.setTitle(str);
        }
        for (AQP BMf : this.A0Q) {
            BMf.BMf(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r6.A05 == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        if (r1 != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0089, code lost:
        if (r1 > 0) goto L_0x008b;
     */
    public final void A8u(int i, String str) {
        boolean z;
        C23560ARe aRe;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Dialog dialog;
        int i2;
        this.A02 = i;
        if (!(i == 8 || (aRe = this.A0I) == null)) {
            aRe.A04 = str;
            Context context = aRe.A03.getContext();
            if (context == null || ((context instanceof Activity) && ((Activity) context).isFinishing())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 && aRe.A06) {
                z3 = true;
            }
            z3 = false;
            if (z3) {
                dialog = aRe.A03;
            } else {
                Context context2 = aRe.A02.getContext();
                if (context2 == null || ((context2 instanceof Activity) && ((Activity) context2).isFinishing())) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4 && i == 2) {
                    long j = aRe.A01;
                    if (j >= 0 && (i2 = aRe.A00) > 0) {
                        int i3 = ((SystemClock.elapsedRealtime() - j) > ((long) i2) ? 1 : ((SystemClock.elapsedRealtime() - j) == ((long) i2) ? 0 : -1));
                        z5 = true;
                    }
                }
                z5 = false;
                if (z5) {
                    dialog = aRe.A02;
                } else {
                    z6 = false;
                    z = true;
                }
            }
            dialog.show();
            z6 = true;
            z = true;
        }
        z = false;
        if (!z) {
            BrowserLiteErrorScreen browserLiteErrorScreen = this.A0K;
            if (browserLiteErrorScreen != null) {
                browserLiteErrorScreen.A02.BqK();
            }
            for (AQP Atl : this.A0Q) {
                Atl.Atl();
            }
            if (this.A08.getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_HOT_INSTANCE_ENABLED", false)) {
                this.A0W = true;
            }
            ARF arf = this.A0k;
            if (arf != null) {
                arf.Atm(this.A02, str);
            }
        }
    }

    public final AQ8 AYf() {
        if (this.A0u.isEmpty()) {
            return null;
        }
        return (AQ8) this.A0u.peek();
    }

    public final boolean AfL() {
        BrowserLiteErrorScreen browserLiteErrorScreen = this.A0K;
        if (browserLiteErrorScreen == null || browserLiteErrorScreen.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r3.A18() != false) goto L_0x001d;
     */
    public final boolean Afr() {
        boolean z;
        String dataString = this.A08.getDataString();
        AQ8 AYf = AYf();
        if (AYf == null) {
            return false;
        }
        if (this.A0u.size() == 1) {
            z = true;
        }
        z = false;
        String A14 = AYf.A14();
        if (z || dataString.equalsIgnoreCase(A14)) {
            return true;
        }
        return false;
    }

    public final void B6F(Intent intent) {
        String sb;
        Object[] objArr;
        String str;
        String stringExtra = intent.getStringExtra("EXTRA_ACTION");
        if (stringExtra != null) {
            for (AQP B6G : this.A0Q) {
                if (B6G.B6G(stringExtra, intent)) {
                    return;
                }
            }
            char c = 65535;
            switch (stringExtra.hashCode()) {
                case -2116976163:
                    if (stringExtra.equals("BrowserLiteIntent.EXTRA_IAB_CLICKID_RECEIVED")) {
                        c = 3;
                        break;
                    }
                    break;
                case -2074076840:
                    if (stringExtra.equals("ACTION_CLOSE_BROWSER")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1305823940:
                    if (stringExtra.equals("ACTION_IAB_AUTOFILL_OPTOUT_FETCHED")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1505276866:
                    if (stringExtra.equals("ACTION_REFRESH_TOP_WEBVIEW")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1776594544:
                    if (stringExtra.equals("ACTION_COMPLETE_WEB_SHARE_DIALOG")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                String stringExtra2 = intent.getStringExtra("BrowserLiteIntent.EXTRA_WEB_SHARE_COMPLETION_MESSAGE");
                String stringExtra3 = intent.getStringExtra("BrowserLiteIntent.EXTRA_REFERER");
                AQ8 AYf = AYf();
                if (AYf != null && stringExtra3 != null && stringExtra2 != null && getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_EXECUTE_WEB_SHARE_JS", true)) {
                    if (stringExtra2 == null) {
                        sb = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        for (int i = 0; i < stringExtra2.length(); i++) {
                            char charAt = stringExtra2.charAt(i);
                            if (Character.isLetterOrDigit(charAt)) {
                                sb2.append(charAt);
                            } else {
                                if (charAt <= 255) {
                                    objArr = new Object[]{Integer.valueOf(charAt)};
                                    str = "\\x%02X";
                                } else if (charAt > 255) {
                                    objArr = new Object[]{Integer.valueOf(charAt)};
                                    str = "\\u%04X";
                                }
                                sb2.append(String.format(str, objArr));
                            }
                        }
                        sb = sb2.toString();
                    }
                    AYf.A0l(new AQT(this, stringExtra3, AYf, AnonymousClass000.A0J("  (function dispatchEvent(eventName, data){    var event = document.createEvent('Event');    event.initEvent(eventName,true,true);    event.data = data;    document.dispatchEvent(event);  })('message', '", sb, "');")));
                }
            } else if (c == 1) {
                AS5.A00(new AQL(this));
            } else if (c == 2) {
                AS5.A00(new C23534AQe(this));
            } else if (c == 3) {
                this.A08.putExtra("BrowserLiteIntent.EXTRA_IAB_CLICKID", intent.getStringExtra("BrowserLiteIntent.EXTRA_IAB_CLICKID"));
                this.A08.putExtra("BrowserLiteIntent.EXTRA_IAB_CLICKID_STATUS", "YES");
                this.A08.putExtra("BrowserLiteIntent.EXTRA_SHOULD_ATTACH_CLICKID", intent.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOULD_ATTACH_CLICKID", false));
            } else if (c == 4) {
                this.A08.putExtra("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_DOMAIN_KEY", intent.getStringExtra("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_DOMAIN_KEY"));
                this.A08.putExtra("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_IS_OPTOUT_KEY", intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_IS_OPTOUT_KEY", true));
            }
        }
    }

    public final Intent getIntent() {
        Intent intent = this.A08;
        if (intent != null) {
            return intent;
        }
        Bundle arguments = getArguments();
        if (arguments == null || arguments.isEmpty()) {
            return getActivity().getIntent();
        }
        return (Intent) arguments.getParcelable("BrowserLiteIntent.ACTIVITY_INTENT");
    }

    public final void onDestroy() {
        ATL atl = this.A0E;
        Context applicationContext = this.A07.getApplicationContext();
        if (atl.A01 != null) {
            AnonymousClass0ZA.A0E(atl.A02, new ATN(atl, applicationContext), -221847429);
        }
        C23538AQi A002 = C23538AQi.A00();
        synchronized (A002) {
            Iterator it = A002.A00.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null || weakReference.get() == this) {
                    it.remove();
                }
            }
        }
        ExecutorService executorService = this.A0m;
        if (executorService != null) {
            executorService.shutdownNow();
            this.A0m = null;
        }
        while (!this.A0u.isEmpty()) {
            AQ8 aq8 = (AQ8) this.A0u.pop();
            if (aq8 != null) {
                aq8.A0m(ReactWebViewManager.BLANK_URL);
                aq8.A0j((Object) null);
                aq8.A0G();
                aq8.A0O();
                try {
                    aq8.A0R();
                } catch (Exception unused) {
                }
                aq8.A0I();
            }
        }
        super.onDestroy();
        if (getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_CRASH_LOGGING_ENABLED", false)) {
            if (AQD.A02 == null) {
                AQD.A02 = new AQD();
            }
            AQD aqd = AQD.A02;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = aqd.A01;
            if (uncaughtExceptionHandler != null) {
                Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
                aqd.A01 = null;
            }
            if (aqd.A00 != null) {
                aqd.A00 = null;
            }
        }
    }

    public final void onDestroyView() {
        FrameLayout frameLayout = this.A0j;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.A0j = null;
        }
        this.A0i = null;
        AQR aqr = this.A0G;
        if (aqr != null) {
            aqr.A00 = null;
            aqr.A02 = null;
        }
        super.onDestroyView();
    }

    /* JADX WARNING: type inference failed for: r7v9, types: [com.facebook.iabeventlogging.model.IABEmptyEvent] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void onPause() {
        String str;
        SslError sslError;
        LinkedHashMap linkedHashMap;
        IABFirstPauseEvent iABFirstPauseEvent;
        Map map;
        super.onPause();
        AQ8 AYf = AYf();
        String str2 = null;
        if (AYf != null) {
            str = AYf.A14();
        } else {
            str = null;
        }
        if (AYf != null) {
            str2 = AYf.A0E();
        }
        ATL atl = this.A0E;
        boolean z = this.A0X;
        if (ASO.A02 == null) {
            ASO.A02 = new ASO();
        }
        ATL.A02(atl, new C23530AQa(atl, ASO.A02.A01(), str, z));
        AQA aqa = this.A0M;
        if (aqa.A0R) {
            aqa.A0B = aqa.A0P.now();
        }
        List list = this.A0Q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (AYf != null) {
            AYf.A0M();
            try {
                AYf.A0R();
            } catch (Exception unused) {
            }
            if (this.A0n) {
                this.A0n = false;
                C23590ASp.A00().A01("BLF.onPause");
                AQ8 aq8 = (AQ8) this.A0u.firstElement();
                HashMap hashMap = new HashMap();
                if (this.A0e) {
                    HashMap hashMap2 = new HashMap();
                    long j = aq8.A00;
                    if (j != -1) {
                        hashMap2.put("fbevents_ms", Long.toString(j));
                        hashMap2.put("fbevents_prefetched", Boolean.toString(aq8.A0J));
                    }
                    long j2 = aq8.A08;
                    if (j2 != -1) {
                        hashMap2.put("tr_ms", Long.toString(j2));
                        hashMap2.put("tr_prefetched", Boolean.toString(aq8.A0K));
                    }
                    long j3 = aq8.A02;
                    if (j3 != -1) {
                        hashMap2.put("ga_collect_ms", Long.toString(j3));
                        hashMap2.put("ga_collect_prefetched", Boolean.toString(aq8.A0E));
                    }
                    long j4 = aq8.A03;
                    if (j4 != -1) {
                        hashMap2.put("ga_js_ms", Long.toString(j4));
                        hashMap2.put("ga_js_prefetched", Boolean.toString(aq8.A0F));
                    }
                    hashMap.putAll(hashMap2);
                }
                hashMap.put("user_agent", this.A0P);
                C23564ARi aRi = null;
                if (aq8 != null) {
                    C23565ARj A12 = aq8.A12();
                    if (A12 instanceof C23564ARi) {
                        aRi = (C23564ARi) A12;
                    }
                }
                if (aRi != null) {
                    sslError = aRi.A03;
                } else {
                    sslError = null;
                }
                if (sslError != null) {
                    hashMap.put("ssl_error_url", sslError.getUrl());
                    hashMap.put("ssl_primary_error", AnonymousClass000.A05("", sslError.getPrimaryError()));
                }
                AQR aqr = this.A0G;
                if (aqr != null) {
                    ARP arp = aqr.A00;
                    if (arp != null) {
                        map = arp.getMenuItemActionLog();
                    } else {
                        map = null;
                    }
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            hashMap.put(entry.getKey(), Integer.toString(((Integer) entry.getValue()).intValue()));
                        }
                    }
                }
                hashMap.put("nav_bar_back_btn_press", Integer.toString(this.A03));
                if (this.A0X) {
                    hashMap.put("close_browser_action", Integer.toString(this.A02));
                }
                hashMap.put("webview_provider_name", aq8.A0D());
                if (hashMap.isEmpty()) {
                    hashMap = null;
                }
                ATL atl2 = this.A0E;
                Context applicationContext = this.A07.getApplicationContext();
                String A13 = aq8.A13();
                long j5 = this.A0f;
                long j6 = aq8.A07;
                long j7 = aq8.A04;
                long j8 = aq8.A05;
                long j9 = aq8.A01;
                int i = this.A01;
                boolean z2 = this.A0X;
                boolean z3 = aq8.A0I;
                boolean z4 = this.A0o;
                String str3 = this.A0O;
                C23590ASp A002 = C23590ASp.A00();
                if (!A002.A03) {
                    linkedHashMap = null;
                } else {
                    linkedHashMap = A002.A00;
                }
                ATL.A02(atl2, new ARU(atl2, A13, j5, j6, j7, j8, j9, i, z2, z3, hashMap, z4, str3, linkedHashMap, applicationContext));
                AQA aqa2 = this.A0M;
                long j10 = aq8.A01;
                if (aqa2.A0R) {
                    aqa2.A0C = j10;
                }
                String A132 = aq8.A13();
                if (aqa2.A0R) {
                    aqa2.A0L = A132;
                }
                ATL atl3 = this.A0E;
                AQA aqa3 = this.A0M;
                if (!aqa3.A0R) {
                    iABFirstPauseEvent = IABEvent.A04;
                } else {
                    String str4 = aqa3.A0K;
                    long j11 = aqa3.A0B;
                    long now = aqa3.A0P.now();
                    long j12 = aqa3.A0D;
                    long j13 = aqa3.A0E;
                    long j14 = aqa3.A06;
                    long j15 = aqa3.A0C;
                    long j16 = aqa3.A08;
                    long j17 = aqa3.A09;
                    long j18 = aqa3.A0A;
                    ArrayList arrayList = aqa3.A0Q;
                    String str5 = aqa3.A0M;
                    String str6 = aqa3.A0L;
                    String str7 = aqa3.A0G;
                    int i2 = aqa3.A00;
                    int i3 = aqa3.A02;
                    int i4 = aqa3.A03;
                    int i5 = aqa3.A01;
                    String str8 = aqa3.A0H;
                    boolean z5 = false;
                    if (str8 != null) {
                        z5 = true;
                    }
                    iABFirstPauseEvent = new IABFirstPauseEvent(str4, j11, now, j12, j13, j14, j15, j16, j17, j18, arrayList, str5, str6, str7, i2, i3, i4, i5, z5, str8, aqa3.A0O);
                }
                atl3.A04(iABFirstPauseEvent, this.A0A);
            }
        }
        if (this.A0W) {
            AQA aqa4 = this.A0M;
            if (aqa4.A0R) {
                aqa4.A0F = 1;
            }
            A04();
        } else if (this.A0X) {
            AQA aqa5 = this.A0M;
            if (aqa5.A0R) {
                aqa5.A0F = 0;
            }
            A04();
            A09(this, true);
            ATL atl4 = this.A0E;
            HashMap hashMap3 = new HashMap();
            hashMap3.put("tap_point", Integer.valueOf(this.A02));
            hashMap3.put("total_navigation_number", Integer.valueOf(this.A06));
            hashMap3.put("same_domain_navigation_number", Integer.valueOf(this.A05));
            hashMap3.put("number_scrolls", Integer.valueOf(this.A04));
            ATL.A02(atl4, new AQV(atl4, str, str2, hashMap3, this.A0A));
        }
        ATL atl5 = this.A0E;
        ATL.A02(atl5, new AQX(atl5, this.A07.getApplicationContext()));
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Intent intent = this.A08;
        if (intent == null || intent.getBooleanExtra("BrowserLiteIntent.EXTRA_ON_SAVED_INSTANCE_STATE_ENABLED", false)) {
            for (int i = 0; i < this.A0u.size(); i++) {
                Bundle bundle2 = new Bundle();
                ((AQ8) this.A0u.get(i)).A0c(bundle2);
                bundle.putBundle(AnonymousClass000.A05("web_view_", i), bundle2);
            }
            bundle.putInt("web_view_number", this.A0u.size());
        }
    }

    private int A00() {
        AQ8 AYf = AYf();
        if (AYf != null) {
            ARR A0C2 = AYf.A0C();
            int i = A0C2.A00;
            for (int i2 = i + 1; i2 < A0C2.A01.size(); i2++) {
                String str = A0C2.A00(i2).A03;
                if (str != null && C225219mn.A01(Uri.parse(str))) {
                    return i2 - i;
                }
            }
        }
        return 0;
    }

    private int A01(int i) {
        AQ8 AYf = AYf();
        int i2 = 0;
        if (AYf == null) {
            return 0;
        }
        if (!AYf.A18()) {
            return i - 1;
        }
        ARR A0C2 = AYf.A0C();
        int i3 = A0C2.A00;
        for (int i4 = i3 - 1; i4 > -1; i4--) {
            String str = A0C2.A00(i4).A03;
            if (str != null && C225219mn.A01(Uri.parse(str)) && (i2 = i2 + 1) == i) {
                return i4 - i3;
            }
        }
        return i - A0C2.A01.size();
    }

    private void A06(Context context) {
        C23590ASp.A00().A01("BLF.onSelfAttached");
        getIntent().setExtrasClassLoader(BrowserLiteFragment.class.getClassLoader());
        ATK.A00 = getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_LOGCAT", false);
        ATL A002 = ATL.A00();
        this.A0E = A002;
        if (C23570ARp.A03 == null) {
            C23570ARp.A03 = new C23570ARp();
        }
        A002.A05 = C23570ARp.A03;
        if (ADA.A00(this.A07)) {
            ATL atl = this.A0E;
            synchronized (atl) {
                atl.A04 = new ARE();
            }
        } else {
            ATK.A03("Browser running in main process.", new Object[0]);
        }
        this.A0E.A03(this.A07.getApplicationContext(), true);
        this.A0A = getIntent().getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
        if (context instanceof ARF) {
            this.A0k = (ARF) context;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("BrowserLiteIntent.IABLoggingExtras.IAB_EVENT_LOGGER_ENABLED", false);
        C05370Ke r0 = C05370Ke.A00;
        AQA aqa = new AQA(booleanExtra, r0);
        this.A0M = aqa;
        long now = r0.now();
        if (aqa.A0R) {
            aqa.A06 = now;
        }
        String stringExtra = getIntent().getStringExtra("iab_click_source");
        if (aqa.A0R) {
            aqa.A0G = stringExtra;
        }
        long longExtra = getIntent().getLongExtra("BrowserLiteIntent.IABLoggingExtras.IAB_USER_CLICK_TS", -1);
        if (aqa.A0R) {
            aqa.A0D = longExtra;
        }
        String stringExtra2 = getIntent().getStringExtra("BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID");
        if (stringExtra2 == null) {
            stringExtra2 = AnonymousClass2ZY.A00().toString();
            getIntent().putExtra("BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID", stringExtra2);
        }
        AQA aqa2 = this.A0M;
        if (aqa2.A0R) {
            aqa2.A0K = stringExtra2;
        }
        boolean booleanExtra2 = getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_CRASH_LOGGING_ENABLED", false);
        if (booleanExtra2) {
            if (AQD.A02 == null) {
                AQD.A02 = new AQD();
            }
            AQD aqd = AQD.A02;
            C23539AQj aQj = new C23539AQj(this);
            if (booleanExtra2) {
                aqd.A00 = aQj;
                aqd.A01 = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(aqd);
            }
        }
        AnonymousClass2WW r2 = new AnonymousClass2WW(this.A0A);
        r2.A00.putString("Tracking.ARG_SESSION_ID", stringExtra2);
        this.A0A = new Bundle(r2.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r0 != false) goto L_0x001b;
     */
    public static final boolean A0C(AQ8 aq8, String str) {
        boolean z;
        if (!aq8.A19()) {
            String A14 = aq8.A14();
            if (A14 != null && !ReactWebViewManager.BLANK_URL.equals(A14)) {
                boolean equals = A14.equals(str);
                z = false;
            }
            z = true;
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final AQ8 A0E() {
        AQ8 AYf = AYf();
        if (AYf != null) {
            try {
                AYf.A0R();
            } catch (Exception unused) {
            }
            if (this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_DISABLE_OLD_WEBVIEW_JS", true)) {
                AYf.A09().setJavaScriptEnabled(false);
            }
            AYf.A0Y(8);
            AYf.A0Q();
        }
        AQ8 A032 = A03();
        for (AQM BYc : this.A0S) {
            BYc.BYc(A032, AYf);
        }
        this.A0u.push(A032);
        A0B(A032);
        return A032;
    }

    public final void A0F(int i) {
        AQO.A00().A03();
        BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy = this.A0C;
        if (browserLiteJSBridgeProxy != null) {
            browserLiteJSBridgeProxy.A07((AQ8) null);
        }
        this.A02 = i;
        this.A0X = true;
    }

    public final boolean A0I(int i) {
        BrowserLiteWebChromeClient A11;
        boolean z;
        AQ8 AYf = AYf();
        if (AYf == null) {
            return false;
        }
        if (AYf == null) {
            A11 = null;
        } else {
            A11 = AYf.A11();
        }
        if (A11 != null) {
            boolean z2 = false;
            if (A11.A07.getVisibility() == 0) {
                z2 = true;
            }
            if (z2) {
                A11.A03();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        int A012 = A01(i);
        if (A012 < 0) {
            AYf.A0T(A012);
            return true;
        } else if (this.A0u.size() <= 1) {
            return false;
        } else {
            A08(this);
            if (A012 == 0 || A0I(A012)) {
                return true;
            }
            return false;
        }
    }

    public final boolean A7f() {
        AQ8 AYf = AYf();
        if (AYf == null) {
            return false;
        }
        if (!this.A0s) {
            return AYf.A18();
        }
        if (A01(1) >= 0) {
            return false;
        }
        return true;
    }

    public final boolean A7h() {
        AQ8 AYf = AYf();
        if (AYf == null) {
            return false;
        }
        if (!this.A0s) {
            return AYf.A0z();
        }
        if (A00() != 0) {
            return true;
        }
        return false;
    }

    public final View AHA() {
        return this.A0h;
    }

    public final ARQ AHB() {
        return this.A0F;
    }

    public final View AIC() {
        return this.A0g;
    }

    public final String AJc() {
        return this.A0N;
    }

    public final AQA AN7() {
        return this.A0M;
    }

    public final Uri ANa() {
        return this.A09;
    }

    public final String AYP() {
        return this.A0l;
    }

    public final Bundle AYv() {
        return this.A0A;
    }

    public final FrameLayout Aaf() {
        return this.A0j;
    }

    public final boolean AhM() {
        AYf();
        return false;
    }

    public final void B5M() {
        AQ8 AYf = AYf();
        if (AYf != null) {
            if (this.A0s) {
                AYf.A0T(A00());
            } else {
                AYf.A0K();
            }
        }
    }

    public final void BjT(boolean z) {
        this.A0Y = z;
    }

    public final void BlN(int i) {
        BrowserLiteWebChromeClient A11;
        if (AYf() != null) {
            AQ8 AYf = AYf();
            if (AYf == null) {
                A11 = null;
            } else {
                A11 = AYf.A11();
            }
            if (A11 != null && A11.A0A == null) {
                A11.A0B.setVisibility(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0297, code lost:
        if (p000X.ADB.A01 != false) goto L_0x0299;
     */
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        String str;
        C23590ASp.A00().A01("BLF.onActivityCreated.Start");
        super.onActivityCreated(bundle);
        Intent intent = getIntent();
        this.A08 = intent;
        Uri data = intent.getData();
        this.A09 = data;
        if (data != null && C225219mn.A01(data)) {
            if (this.A08.getBooleanExtra("BrowserLiteIntent.IAB_DNS_PREFETCH_ENABLED", false)) {
                String host = this.A09.getHost();
                ATK.A00("BrowserLiteFragment", "Pre-resolve DNS for %s for URL %s", host, this.A09);
                if (this.A0m == null) {
                    this.A0m = Executors.newSingleThreadExecutor(new C23535AQf());
                }
                AnonymousClass0Z9.A03(this.A0m, new AQS(host), -2138334442);
            }
            AQA aqa = this.A0M;
            String uri = this.A09.toString();
            if (aqa.A0R) {
                aqa.A0M = uri;
            }
            AQA aqa2 = this.A0M;
            long longExtra = this.A08.getLongExtra("HOT_INSTANCE_FLAG", 0);
            if (aqa2.A0R) {
                aqa2.A07 = longExtra;
            }
            ATL.A00().A04(this.A0M.A00(), this.A0A);
            View view = getView();
            this.A0j = (FrameLayout) view.findViewById(C0003R.C0005id.webview_container);
            this.A0h = view.findViewById(C0003R.C0005id.browser_container);
            this.A0g = view.findViewById(C0003R.C0005id.browser_chrome_container);
            int intExtra = this.A08.getIntExtra("BrowserLiteIntent.EXTRA_LE_DESIGN_EXPERIMENT_STYLE", 0);
            boolean z2 = false;
            if (this.A08.getIntExtra("BrowserLiteIntent.EXTRA_LE_DESIGN_EXPERIMENT_STYLE", 0) != 0) {
                z2 = true;
            }
            AQA aqa3 = this.A0M;
            if (aqa3.A0R) {
                aqa3.A0O = z2;
            }
            this.A0Z = z2;
            AQO.A00().A03 = new WeakReference(this.A07);
            AQO.A00().A04 = new WeakReference(this.A08);
            AQO.A00().A05 = new WeakReference(view);
            AQO.A00().A02 = this;
            AQO.A00().A01 = this;
            AQO.A00().A00 = this.A0F;
            AQO.A00().A02();
            this.A0Q = AQO.A00().A01(AQP.class);
            this.A0S = AQO.A00().A01(AQM.class);
            this.A0R = AQO.A00().A01(ASC.class);
            this.A0T = AQO.A00().A01(ASA.class);
            if (this.A0Z) {
                this.A0g.setBackground(new ColorDrawable(0));
                this.A0h.setBackground(new ColorDrawable(0));
                this.A0L = (BrowserLiteWrapperView) view.findViewById(C0003R.C0005id.browser_wrapper_view);
                ViewStub viewStub = (ViewStub) view.findViewById(C0003R.C0005id.primary_chrome);
                viewStub.setBackgroundColor(0);
                ARQ arq = new ARQ();
                this.A0F = arq;
                arq.A04 = this;
                arq.A05 = this;
                arq.A00 = viewStub;
                arq.A01 = (ViewStub) view.findViewById(C0003R.C0005id.secondary_chrome);
                Intent intent2 = this.A08;
                if (intent2 != null) {
                    intent2.getStringExtra("BrowserLiteIntent.EXTRA_BROWSER_THEME");
                }
                Iterator it = this.A0T.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((ASA) it.next()).A00()) {
                            break;
                        }
                    } else {
                        this.A0F.A00(C0003R.layout.default_le_browser_chrome, (String) null);
                        break;
                    }
                }
                this.A0L.A05(this, this, this.A0F);
                BrowserLiteGestureDelegateView browserLiteGestureDelegateView = (BrowserLiteGestureDelegateView) view.findViewById(C0003R.C0005id.browser_gesture_delegate_view);
                BrowserLiteWrapperView browserLiteWrapperView = this.A0L;
                boolean z3 = false;
                if (intExtra != 2) {
                    z3 = true;
                }
                this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOULD_ADJUST_DRAG_DISTANCE", false);
                boolean booleanExtra = this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOULD_DISABLE_SWIPE_TO_CLOSE", false);
                this.A08.getDoubleExtra("BrowserLiteIntent.EXTRA_DRAG_TO_CLOSE_THRESHOLD", 1.0d);
                browserLiteGestureDelegateView.A03 = browserLiteWrapperView;
                browserLiteGestureDelegateView.A02 = browserLiteWrapperView.findViewById(C0003R.C0005id.browser_container);
                browserLiteGestureDelegateView.A08 = z3;
                browserLiteGestureDelegateView.A07 = booleanExtra;
                Context context = browserLiteGestureDelegateView.getContext();
                browserLiteGestureDelegateView.A00 = (int) ((10.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
                browserLiteGestureDelegateView.getContext();
                browserLiteGestureDelegateView.A01 = new GestureDetector(context, new AUA(browserLiteGestureDelegateView));
                this.A0L.A01();
                boolean booleanExtra2 = this.A08.getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_ALERT_ON_FORM_EXIT_ENABLED", false);
                int intExtra2 = this.A08.getIntExtra("BrowserLiteIntent.InstagramExtras.EXTRA_ALERT_ON_EXIT_DOUBLE_BACK_PRESS_THRESHOLD_MS", 0);
                if (booleanExtra2 || intExtra2 > 0) {
                    this.A0I = new C23560ARe(booleanExtra2, intExtra2, this.A07, new C23546AQq(this));
                }
            }
            if (this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_DEBUG_OVERLAY_ENABLED", false)) {
                ViewStub viewStub2 = (ViewStub) view.findViewById(C0003R.C0005id.browser_lite_debug_overlay_stub);
                viewStub2.setLayoutResource(C0003R.layout.browser_lite_debug_overlay);
                View inflate = viewStub2.inflate();
                if (inflate != null) {
                    TextView textView = (TextView) inflate;
                    this.A0B = textView;
                    C23602ATi.A04 = true;
                    textView.bringToFront();
                    this.A0B.setMovementMethod(new ScrollingMovementMethod());
                    if (C23602ATi.A03 == null) {
                        C23602ATi.A03 = new C23602ATi();
                    }
                    C23602ATi.A03.A00 = this.A0B;
                    ATK.A00("BrowserLiteFragment", "debug overlay. separate data dir: %s, click source %s", Boolean.valueOf(this.A0d), this.A08.getStringExtra("iab_click_source"));
                }
            }
            boolean A002 = ADA.A00(this.A07);
            if (A002) {
                z = false;
            }
            z = true;
            this.A0o = z;
            ADB.A01 = true;
            this.A0C = (BrowserLiteJSBridgeProxy) this.A08.getParcelableExtra("BrowserLiteIntent.JS_BRIDGE");
            this.A0p = this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_IN_APP_BROWSER_PROFILING_ENABLED", false);
            this.A0e = this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_LOG_FB_TRACKING_REQUEST", false);
            this.A0r = this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_USE_DEFAULT_INTENT_URL_LOADING", false);
            this.A0v = this.A08.getStringExtra("BrowserLiteIntent.EXTRA_REQUEST_LOG_LEVEL");
            if (this.A0v != null) {
                str = this.A0v;
            } else {
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            }
            this.A0v = str;
            this.A0q = this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_REFERRER_HTML_ENABLED", true);
            this.A0s = this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_SAFE_BROWSING_ENABLED", false);
            this.A0N = this.A09.toString();
            if (C23570ARp.A03 == null) {
                C23570ARp.A03 = new C23570ARp();
            }
            this.A0D = C23570ARp.A03;
            PrefetchCacheEntry prefetchCacheEntry = (PrefetchCacheEntry) this.A08.getParcelableExtra("BrowserLiteIntent.EXTRA_PREFETCH_INFO");
            if (prefetchCacheEntry != null) {
                this.A0D.A01 = prefetchCacheEntry;
            } else {
                String stringExtra = this.A08.getStringExtra("BrowserLiteIntent.EXTRA_NO_PREFETCH_REASON");
                if (stringExtra != null) {
                    ATK.A00("BrowserLiteFragment", "No prefetch reason: %s", stringExtra);
                }
            }
            C23590ASp.A00().A01("BLF.onActivityCreated.setUpBrowserChromeControllerByTheme_start");
            if (!this.A0Z) {
                Intent intent3 = this.A08;
                if (intent3 != null) {
                    intent3.getStringExtra("BrowserLiteIntent.EXTRA_BROWSER_THEME");
                }
                this.A0G = new AQR(this, this, (ViewStub) view.findViewById(C0003R.C0005id.primary_chrome), (ViewStub) view.findViewById(C0003R.C0005id.secondary_chrome));
                Iterator it2 = this.A0T.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((ASA) it2.next()).A00()) {
                            break;
                        }
                    } else {
                        AQR aqr = this.A0G;
                        aqr.A03.setLayoutResource(C0003R.layout.default_browser_chrome);
                        ARP arp = (ARP) aqr.A03.inflate();
                        aqr.A00 = arp;
                        if ("watch_and_browse".equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)) {
                            arp.setBackground(new ColorDrawable(-16777216));
                        }
                        ARP arp2 = aqr.A00;
                        arp2.setControllers(aqr.A02, aqr.A01);
                        arp2.bringToFront();
                    }
                }
            }
            C23590ASp.A00().A01("BLF.onActivityCreated.setUpBrowserChromeControllerByTheme_end");
            int intExtra3 = this.A08.getIntExtra("BrowserLiteIntent.EXTRA_TOAST_RES_ID", -1);
            if (intExtra3 > 0) {
                A05(intExtra3);
            }
            C23590ASp.A00().A01("BLF.IABListenerProvider.onActivityCreated_Start");
            for (AQP Ar0 : this.A0Q) {
                Ar0.Ar0(bundle);
            }
            C23590ASp.A00().A01("BLF.IABListenerProvider.onActivityCreated_End");
            if (!this.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_DISABLE_INIT_EXCEPTION_HANDLING", false)) {
                try {
                    A07(bundle);
                } catch (Exception e) {
                    AnonymousClass0DB.A0I("BrowserLiteFragment", "Exception while creating WebView.", e);
                    A8u(4, (String) null);
                }
            } else {
                A07(bundle);
            }
            C23538AQi A003 = C23538AQi.A00();
            synchronized (A003) {
                Iterator it3 = A003.A00.iterator();
                boolean z4 = false;
                while (it3.hasNext()) {
                    WeakReference weakReference = (WeakReference) it3.next();
                    if (weakReference.get() == null) {
                        it3.remove();
                    } else if (this == weakReference.get()) {
                        z4 = true;
                    }
                }
                if (!z4) {
                    A003.A00.addLast(new WeakReference(this));
                }
            }
            ATL atl = this.A0E;
            ATL.A02(atl, new AQY(atl, this.A09.toString(), this.A0A));
            if (ATH.A03() && A002) {
                this.A0d = true;
            }
            C23590ASp.A00().A01("BLF.onActivityCreated.End");
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        BrowserLiteWebChromeClient A11;
        AQ8 AYf = AYf();
        if (AYf == null) {
            A11 = null;
        } else {
            A11 = AYf.A11();
        }
        if (A11 != null) {
            A11.A04(i, i2, intent);
        }
        for (AQP Ar3 : this.A0Q) {
            Ar3.Ar3(i, i2, intent);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        ARP arp;
        super.onConfigurationChanged(configuration);
        BrowserLiteWrapperView browserLiteWrapperView = this.A0L;
        if (browserLiteWrapperView != null) {
            browserLiteWrapperView.A02();
        }
        AQR aqr = this.A0G;
        if (aqr != null && (arp = aqr.A00) != null) {
            arp.A02();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.A0A != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("action", "iabProcessStart");
            boolean z = false;
            if (bundle == null) {
                z = true;
            }
            hashMap.put("iabIsInitialProcessStart", String.valueOf(z));
            this.A0E.A05(hashMap, this.A0A);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C23590ASp.A00().A01("BLF.onCreateView");
        View inflate = layoutInflater.inflate(C0003R.layout.browser_lite_fragment, viewGroup, false);
        this.A0i = inflate;
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        BrowserLiteWrapperView browserLiteWrapperView = this.A0L;
        if (browserLiteWrapperView != null) {
            browserLiteWrapperView.A03();
        }
        ATL atl = this.A0E;
        ATL.A02(atl, new AQZ(atl, this.A0N, this.A08.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING")));
        AQA aqa = this.A0M;
        if (aqa.A0R) {
            long j = aqa.A0B;
            if (j != -1) {
                aqa.A0Q.add(new ArrayList(Arrays.asList(new Long[]{Long.valueOf(j), Long.valueOf(aqa.A0P.now())})));
            }
        }
        AQ8 AYf = AYf();
        if (AYf != null) {
            AYf.A0L();
            AYf.A0P();
        }
        List list = this.A0Q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void BoZ(AQ8 aq8, C23550AQu aQu, SslError sslError) {
        A02(this, aQu);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.A07 = activity;
        if (Build.VERSION.SDK_INT < 23) {
            A06(activity);
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A07 = context;
        A06(context);
    }
}
