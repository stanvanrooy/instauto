package com.facebook.browser.lite;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import com.facebook.C0003R;
import com.facebook.browser.lite.views.BrowserLiteWrapperView;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import org.webrtc.MediaStreamTrack;
import p000X.ADA;
import p000X.AQ8;
import p000X.AQA;
import p000X.ARF;
import p000X.ARO;
import p000X.ASO;
import p000X.AT1;
import p000X.AT2;
import p000X.ATC;
import p000X.ATE;
import p000X.ATF;
import p000X.ATH;
import p000X.ATK;
import p000X.ATL;
import p000X.ATO;
import p000X.AUE;
import p000X.AUG;
import p000X.AV3;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0D1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.C04230Dc;
import p000X.C05370Ke;
import p000X.C23564ARi;
import p000X.C23590ASp;
import p000X.C23594ASt;
import p000X.C248116c;

public class BrowserLiteActivity extends Activity implements ARF {
    public double A00 = 1.0d;
    public BrowserLiteFragment A01;
    public AT2 A02;
    public ATE A03;
    public ATL A04;
    public Resources A05;
    public ASO A06;
    public boolean A07;
    public boolean A08 = false;
    public boolean A09;

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z;
        if (strArr == null || strArr.length <= 0 || !"e2e".equals(strArr[0])) {
            z = false;
        } else {
            if (C04230Dc.A02 == null) {
                C04230Dc.A02 = new C04230Dc();
            }
            C04230Dc.A01(C04230Dc.A02, str, printWriter, strArr);
            z = true;
        }
        if (!z) {
            super.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public static void A01(BrowserLiteActivity browserLiteActivity) {
        if (browserLiteActivity.A08) {
            ATL atl = browserLiteActivity.A04;
            Handler handler = atl.A02;
            if (handler == null || atl.A06 == null) {
                AnonymousClass0D1.A00("Shutting down browser process");
            } else {
                AnonymousClass0ZA.A0E(handler, new ATO(atl), -1917017939);
            }
        } else if (Build.VERSION.SDK_INT < 23) {
            try {
                Object systemService = browserLiteActivity.getSystemService("input_method");
                Method declaredMethod = InputMethodManager.class.getDeclaredMethod("finishInputLocked", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(systemService, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public final void A02(int i, String str) {
        BrowserLiteFragment browserLiteFragment = this.A01;
        if (browserLiteFragment != null) {
            browserLiteFragment.A0F(i);
            if (getCallingActivity() != null) {
                setResult(this.A01.A00, new Intent(getIntent()).putExtra("KEY_URL", str).putExtra("last_tap_point", i));
            }
        }
        finish();
    }

    public final void onBackPressed() {
        BrowserLiteFragment browserLiteFragment = this.A01;
        if (browserLiteFragment == null) {
            A02(2, (String) null);
        } else if (!browserLiteFragment.B6C(true)) {
            this.A01.A8u(2, (String) null);
        }
    }

    public final void onNewIntent(Intent intent) {
        AT2 at2 = this.A02;
        BrowserLiteFragment browserLiteFragment = this.A01;
        if (at2.A01) {
            BrowserLiteActivity browserLiteActivity = at2.A00;
            int[] intArrayExtra = browserLiteActivity.getIntent().getIntArrayExtra("BrowserLiteIntent.EXTRA_ANIMATION");
            if (intArrayExtra != null && intArrayExtra.length == 4) {
                browserLiteActivity.overridePendingTransition(intArrayExtra[0], intArrayExtra[1]);
            }
            AnonymousClass0ZA.A02(at2, 1);
            AQ8 AYf = browserLiteFragment.AYf();
            if (AYf != null) {
                WebSettings A092 = AYf.A09();
                String userAgentString = A092.getUserAgentString();
                if (userAgentString.endsWith(" NV/1")) {
                    A092.setUserAgentString(userAgentString.substring(0, userAgentString.length() - 5));
                }
            }
        }
        if (!intent.getData().equals(getIntent().getData())) {
            this.A01.A0F(4);
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.remove(this.A01);
            intent.putExtra("HOT_INSTANCE_FLAG", 2);
            setIntent(intent);
            BrowserLiteFragment browserLiteFragment2 = new BrowserLiteFragment();
            this.A01 = browserLiteFragment2;
            Bundle bundle = new Bundle();
            bundle.putParcelable("BrowserLiteIntent.ACTIVITY_INTENT", intent);
            browserLiteFragment2.setArguments(bundle);
            beginTransaction.add(C0003R.C0005id.browser_lite_root_container, this.A01, "BROWSER_LITE_FRAGMENT_TAG");
            beginTransaction.commit();
        } else if (this.A02.A01) {
            this.A01.getView().setVisibility(0);
            BrowserLiteFragment browserLiteFragment3 = this.A01;
            if (browserLiteFragment3.A0W) {
                browserLiteFragment3.A0W = false;
                browserLiteFragment3.getActivity().setIntent(intent);
                AQA aqa = browserLiteFragment3.A0M;
                long longExtra = 1 | intent.getLongExtra("HOT_INSTANCE_FLAG", 0);
                boolean z = aqa.A0R;
                if (z) {
                    aqa.A07 = longExtra;
                }
                long now = C05370Ke.A00.now();
                if (z) {
                    aqa.A06 = now;
                }
                long longExtra2 = intent.getLongExtra("BrowserLiteIntent.IABLoggingExtras.IAB_USER_CLICK_TS", -1);
                boolean z2 = aqa.A0R;
                if (z2) {
                    aqa.A0D = longExtra2;
                }
                if (z2) {
                    aqa.A0A = -1;
                }
                BrowserLiteWrapperView browserLiteWrapperView = browserLiteFragment3.A0L;
                if (browserLiteWrapperView != null) {
                    browserLiteWrapperView.A01();
                }
                browserLiteFragment3.A0E.A04(browserLiteFragment3.A0M.A00(), browserLiteFragment3.A0A);
            }
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        BrowserLiteWebChromeClient A11;
        AQ8 AYf = this.A01.AYf();
        if (AYf == null) {
            A11 = null;
        } else {
            A11 = AYf.A11();
        }
        if (A11 != null && i == 3 && iArr.length > 0 && iArr[0] == 0) {
            BrowserLiteWebChromeClient.A02(A11, A11.A04, A11.A06);
            A11.A04 = null;
            A11.A06 = null;
        }
    }

    public final void onUserInteraction() {
        if (this.A01 != null) {
            this.A04.A05(Collections.singletonMap("action", "ig_browser_touch_interaction"), this.A01.AYv());
        }
        this.A06.A00();
        super.onUserInteraction();
    }

    private void A00() {
        Locale locale = (Locale) getIntent().getSerializableExtra("BrowserLiteIntent.EXTRA_LOCALE");
        if (locale != null) {
            Configuration configuration = getResources().getConfiguration();
            if (!locale.equals(configuration.locale)) {
                configuration.locale = locale;
                Resources resources = getResources();
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                Locale.setDefault(locale);
            }
        }
    }

    public final void Atm(int i, String str) {
        boolean z;
        if (getCallingActivity() == null) {
            AT2 at2 = this.A02;
            BrowserLiteFragment browserLiteFragment = this.A01;
            if (at2.A01 && browserLiteFragment.A0O == null && (browserLiteFragment.AYf() == null || browserLiteFragment.AYf().A12() == null || !((C23564ARi) browserLiteFragment.AYf().A12()).A07)) {
                Bundle bundle = null;
                ((AudioManager) at2.A00.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, 3, 2);
                if (!at2.A02) {
                    browserLiteFragment.getView().setVisibility(8);
                }
                Intent intent = at2.A00.getIntent();
                AnonymousClass0ZA.A06(at2, at2.obtainMessage(1, str), intent.getLongExtra("BrowserLiteIntent.InstagramExtras.EXTRA_HOT_INSTANCE_DURATION_MS", ArLinkScanControllerImpl.ERROR_DELAY_MS));
                Intent intent2 = (Intent) intent.getParcelableExtra("BrowserLiteIntent.InstagramExtras.EXTRA_HOT_INSTANCE_PREVIOUS_ACTIVITY_INTENT");
                if (at2.A02) {
                    BrowserLiteActivity browserLiteActivity = at2.A00;
                    if ((browserLiteActivity instanceof BrowserLite2Activity) || (browserLiteActivity instanceof BrowserLiteInMainProcess2Activity)) {
                        bundle = ActivityOptions.makeCustomAnimation(browserLiteActivity, 0, C0003R.anim.browser_slide_right_out).toBundle();
                    }
                }
                try {
                    at2.A00.startActivity(intent2, bundle);
                    z = true;
                } catch (Exception unused) {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                return;
            }
        }
        A02(i, str);
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.A05 = context.getResources();
    }

    public final void finish() {
        boolean z;
        super.finish();
        int i = ATF.A00 - 1;
        ATF.A00 = i;
        if (i < 0) {
            ATK.A01("ActivityCounter", "sCounter = %d < 0! This should not happen!", Integer.valueOf(i));
        }
        boolean z2 = false;
        if (!getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_KEEP_PROCESS_ALIVE ", false)) {
            boolean z3 = false;
            if (ATF.A00 == 0) {
                z3 = true;
            }
            if (z3 && ADA.A00(this)) {
                synchronized (ATH.class) {
                    Iterator it = ATH.A00.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((WeakReference) it.next()).get() != null) {
                                z = true;
                                break;
                            }
                            it.remove();
                        } else {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    z2 = true;
                }
            }
        }
        this.A08 = z2;
        if (z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
            View currentFocus = getCurrentFocus();
            if (currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
        boolean z4 = false;
        if (ATF.A00 == 0) {
            z4 = true;
        }
        if (z4 && !this.A09) {
            ATH.A01(this);
        }
        int[] intArrayExtra = getIntent().getIntArrayExtra("BrowserLiteIntent.EXTRA_ANIMATION");
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            overridePendingTransition(intArrayExtra[2], intArrayExtra[3]);
        }
    }

    public final Resources getResources() {
        return this.A05;
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        Iterator it = this.A01.A0Q.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        Iterator it = this.A01.A0Q.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A01.onActivityResult(i, i2, intent);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A00();
    }

    public void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-1315188815);
        C23590ASp.A04 = new C23590ASp(getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_PERFORMANCE_LOGGING_ENABLED", false));
        long longExtra = getIntent().getLongExtra("BrowserLiteIntent.HANDLE_INTENT_START_TIME", 0);
        if (longExtra > 0) {
            C23590ASp A003 = C23590ASp.A00();
            if (A003.A03 && A003.A01.add("BLIH.Intent_Creation")) {
                A003.A00.put("BLIH.Intent_Creation", Long.valueOf(longExtra));
            }
        }
        C23590ASp.A00().A01("BLA.onCreate.Start");
        this.A02 = new AT2(this);
        this.A07 = getIntent().getBooleanExtra("extra_hide_system_status_bar", false);
        String stringExtra = getIntent().getStringExtra("BrowserLiteIntent.EXTRA_BROWSER_THEME");
        int intValue = Integer.valueOf(getIntent().getIntExtra("BrowserLiteIntent.EXTRA_ACTIVITY_THEME_RES", 0)).intValue();
        if (intValue != 0) {
            setTheme(intValue);
        }
        super.onCreate(bundle);
        if (ATH.A03() && ADA.A00(this)) {
            C248116c.A00 = true;
        }
        if (bundle == null) {
            ATF.A00++;
        }
        int[] intArrayExtra = getIntent().getIntArrayExtra("BrowserLiteIntent.EXTRA_ANIMATION");
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            overridePendingTransition(intArrayExtra[0], intArrayExtra[1]);
        }
        A00();
        ATK.A00 = getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_LOGCAT", false);
        C23594ASt aSt = C23594ASt.A09;
        if (aSt != null) {
            synchronized (aSt) {
                if (aSt.A01 != null) {
                    if (aSt.A06 || !aSt.A08.isEmpty()) {
                        ATK.A00("BrowserHtmlResourceExtractor", "HtmlResourceExtractor is still working when browser opened, current url %s, in queue %d", aSt.A04, Integer.valueOf(aSt.A08.size()));
                    }
                    aSt.A08.clear();
                    aSt.A05.clear();
                    aSt.A01.destroy();
                    aSt.A01 = null;
                }
            }
        }
        C23590ASp.A00().A01("BLA.setContentView.Start");
        setContentView(C0003R.layout.browser_lite_main);
        C23590ASp.A00().A01("BLA.setContentView.End");
        boolean z = false;
        if ((getWindow().getAttributes().flags & 1024) != 0) {
            z = true;
        }
        if (z) {
            new AUE(this);
        }
        if (Build.VERSION.SDK_INT >= 26 && getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_ENABLED", false)) {
            getWindow().getDecorView().setImportantForAutofill(8);
        }
        if (bundle != null) {
            this.A01 = (BrowserLiteFragment) getFragmentManager().findFragmentByTag("BROWSER_LITE_FRAGMENT_TAG");
        } else {
            BrowserLiteFragment browserLiteFragment = new BrowserLiteFragment();
            this.A01 = browserLiteFragment;
            Intent intent = getIntent();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("BrowserLiteIntent.ACTIVITY_INTENT", intent);
            browserLiteFragment.setArguments(bundle2);
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().add(C0003R.C0005id.browser_lite_root_container, this.A01, "BROWSER_LITE_FRAGMENT_TAG").commit();
            fragmentManager.executePendingTransactions();
        }
        this.A04 = ATL.A00();
        if (ASO.A02 == null) {
            ASO.A02 = new ASO();
        }
        this.A06 = ASO.A02;
        this.A03 = new ATE();
        if (getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_IS_RAGE_SHAKE_AVAILABLE", false) && this.A03 != null) {
            FragmentManager fragmentManager2 = getFragmentManager();
            if (((AV3) fragmentManager2.findFragmentByTag("rageshake_listener_fragment")) == null) {
                fragmentManager2.beginTransaction().add(0, new AV3(), "rageshake_listener_fragment").disallowAddToBackStack().commit();
            }
        }
        this.A09 = getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_PERSISTENT_COOKIE", true);
        double doubleExtra = getIntent().getDoubleExtra("BrowserLiteIntent.DISPLAY_HEIGHT_RATIO", 1.0d);
        this.A00 = doubleExtra;
        if (doubleExtra < 0.25d || doubleExtra >= 1.0d) {
            this.A00 = 1.0d;
            getWindow().setLayout(-1, -1);
        } else {
            getWindow().setLayout(-1, (int) (((double) getResources().getDisplayMetrics().heightPixels) * this.A00));
            getWindow().setGravity(87);
        }
        ArrayList arrayList = new ArrayList();
        if ("THEME_MESSENGER_PLATFORM_IAB".equals(stringExtra) && this.A00 < 1.0d) {
            arrayList.add(new AT1(this));
        }
        arrayList.add(new ARO(this));
        View findViewById = findViewById(C0003R.C0005id.browser_lite_root_container);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new AUG(this, findViewById, arrayList));
        C23590ASp.A00().A01("BLA.onCreate.End");
        AnonymousClass0Z0.A07(1756737450, A002);
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0Z0.A00(1494063891);
        super.onDestroy();
        if (getIntent().getBooleanExtra("BrowserLiteIntent.WAIT_FOR_DESTROY_BEFORE_KILLING_PROCESS", false) && isFinishing()) {
            A01(this);
        }
        AnonymousClass0Z0.A07(106872659, A002);
    }

    public final void onPause() {
        AV3 av3;
        AQ8 AYf;
        int A002 = AnonymousClass0Z0.A00(118453648);
        super.onPause();
        AT2 at2 = this.A02;
        BrowserLiteFragment browserLiteFragment = this.A01;
        if (!(!at2.A01 || browserLiteFragment == null || (AYf = browserLiteFragment.AYf()) == null)) {
            WebSettings A092 = AYf.A09();
            String userAgentString = A092.getUserAgentString();
            if (!userAgentString.endsWith(" NV/1")) {
                A092.setUserAgentString(AnonymousClass000.A0E(userAgentString, " NV/1"));
            }
        }
        if (!(this.A03 == null || (av3 = (AV3) getFragmentManager().findFragmentByTag("rageshake_listener_fragment")) == null)) {
            av3.onPause();
        }
        if (!getIntent().getBooleanExtra("BrowserLiteIntent.WAIT_FOR_DESTROY_BEFORE_KILLING_PROCESS", false) && isFinishing()) {
            AnonymousClass0ZA.A09(new Handler(), new ATC(this), 500, 926117553);
        }
        AnonymousClass0Z0.A07(-1056468934, A002);
    }

    public final void onResume() {
        boolean z;
        int i;
        AV3 av3;
        AQ8 AYf;
        int A002 = AnonymousClass0Z0.A00(-1240128304);
        AT2 at2 = this.A02;
        BrowserLiteFragment browserLiteFragment = this.A01;
        if (!(!at2.A01 || browserLiteFragment == null || (AYf = browserLiteFragment.AYf()) == null)) {
            WebSettings A092 = AYf.A09();
            String userAgentString = A092.getUserAgentString();
            if (userAgentString.endsWith(" NV/1")) {
                A092.setUserAgentString(userAgentString.substring(0, userAgentString.length() - 5));
            }
        }
        super.onResume();
        AT2 at22 = this.A02;
        if (!at22.A01 || !at22.hasMessages(1)) {
            z = false;
        } else {
            AnonymousClass0ZA.A02(at22, 1);
            at22.A00.A02(4, (String) null);
            at22.A00.overridePendingTransition(0, 0);
            z = true;
        }
        if (z) {
            i = -259344038;
        } else {
            if (!(this.A03 == null || (av3 = (AV3) getFragmentManager().findFragmentByTag("rageshake_listener_fragment")) == null)) {
                av3.onResume();
            }
            if (this.A07) {
                Window window = getWindow();
                View decorView = getWindow().getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4);
                window.setFlags(1024, 1024);
            }
            i = 1756564768;
        }
        AnonymousClass0Z0.A07(i, A002);
    }
}
