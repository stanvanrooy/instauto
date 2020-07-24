package p000X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebResourceResponse;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.C0003R;
import com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy;
import com.facebook.browser.lite.extensions.watchandbrowse.BrowserLiteHeaderLoadingScreen;
import com.facebook.react.uimanager.BaseViewManager;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.List;

/* renamed from: X.ASL */
public class ASL {
    public Context A00 = null;
    public Intent A01 = null;
    public View A02 = null;
    public ASB A03 = null;
    public ATp A04 = null;
    public ARQ A05 = null;

    public final WebResourceResponse AUY(String str) {
        return null;
    }

    public final String AZc() {
        return null;
    }

    public void Apy(AQ8 aq8) {
        if (this instanceof ASA) {
            Bundle extras = ((ASA) this).A01.getExtras();
            if (extras != null) {
                int i = 0;
                if (extras.getBoolean("watch_and_browse_is_in_watch_and_browse", false) && extras.containsKey("watch_and_browse_browser_height")) {
                    boolean z = extras.getBoolean("watch_and_browse_is_in_watch_and_install", false);
                    boolean z2 = extras.getBoolean("watch_and_browse_is_entering_as_overlay", false);
                    if (!z || z2) {
                        i = (int) aq8.A05().getResources().getDimension(C0003R.dimen.watch_and_browse_chrome_height);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, extras.getInt("watch_and_browse_browser_height", -1) - i);
                    aq8.A0S(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    aq8.A0g(layoutParams);
                }
            }
        } else if (this instanceof C24075AhV) {
            C24075AhV ahV = (C24075AhV) this;
            AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy = new AutofillSharedJSBridgeProxy(aq8, ahV, ahV.A01, ahV.A03);
            aq8.A0k(autofillSharedJSBridgeProxy, autofillSharedJSBridgeProxy.A03);
            ahV.A07.put(aq8, autofillSharedJSBridgeProxy);
        }
    }

    public void Ar0(Bundle bundle) {
        ASB asb;
        ARQ AHB;
        if (this instanceof ASA) {
            ASA asa = (ASA) this;
            asa.A05 = asa.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_WATCH_INSTALL_JS_ENABLED", true);
            asa.A02 = asa.A01.getBooleanExtra("watch_and_install_hijack_cta_button_enabled", false);
            asa.A03 = asa.A01.getBooleanExtra("watch_and_install_hijack_install_button_enabled", asa.A03);
            if (!asa.A01.getBooleanExtra("IN_WATCH_AND_MORE_OVERLAY", false) && asa.A01.getExtras().getBoolean("watch_and_browse_is_in_watch_and_browse")) {
                asa.A03.AIC().setVisibility(8);
                if (asa.A01 == null) {
                    ViewStub viewStub = (ViewStub) asa.A02.findViewById(C0003R.C0005id.browser_lite_header_loading_screen_stub);
                    asa.A01 = (BrowserLiteHeaderLoadingScreen) (viewStub == null ? asa.A02.findViewById(C0003R.C0005id.browser_lite_header_loading_screen) : viewStub.inflate());
                }
                asa.A01.setLoadingScreenDisplayUrlEnabled(false);
                asa.A01.getExtras().getBoolean("watch_and_browse_is_in_watch_and_install", false);
                asa.A01.setVisibility(8);
            }
            Bundle extras = asa.A01.getExtras();
            if (extras != null) {
                int i = 0;
                if (extras.getBoolean("watch_and_browse_is_in_watch_and_browse", false)) {
                    if (extras.containsKey("watch_and_browse_dummy_video_view_height")) {
                        int i2 = extras.getInt("watch_and_browse_dummy_video_view_height");
                        asa.A03.AHA().setLayoutParams(new LinearLayout.LayoutParams(-1, asa.A01.getExtras().getInt("watch_and_browse_translation_height") + i2));
                        asa.A03.AHA().setPadding(0, i2, 0, 0);
                        asa.A03.Aaf().setClipToPadding(false);
                        asa.A03.Aaf().setClipChildren(false);
                    }
                    asa.A03.AHA().setBackground(new ColorDrawable(0));
                    asa.A03.Aaf().setBackground(new ColorDrawable(0));
                    boolean z = extras.getBoolean("watch_and_browse_is_in_watch_and_install", false);
                    boolean z2 = extras.getBoolean("watch_and_browse_is_entering_as_overlay", false);
                    if (z && (asb = asa.A03) != null && (AHB = asb.AHB()) != null) {
                        asa.A04.BjT(true);
                        if (AHB != null) {
                            if (!z2) {
                                i = 8;
                            }
                            ARt aRt = AHB.A02;
                            if (aRt != null || (aRt = AHB.A03) != null) {
                                ((RelativeLayout) aRt).setVisibility(i);
                            }
                        }
                    }
                }
            }
        }
    }

    public void Ar3(int i, int i2, Intent intent) {
    }

    public void Atl() {
        if (this instanceof ASC) {
            ASC.A01((ASC) this);
        }
    }

    public void B0Q(AQ8 aq8) {
    }

    public final boolean B6B() {
        return false;
    }

    public boolean B6E(String str, int i, boolean z) {
        boolean z2 = this instanceof ASA;
        return false;
    }

    public final boolean B6G(String str, Intent intent) {
        return false;
    }

    public void B9Y(AQ8 aq8, String str) {
        AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy;
        if ((this instanceof C24075AhV) && (autofillSharedJSBridgeProxy = (AutofillSharedJSBridgeProxy) ((C24075AhV) this).A07.get(aq8)) != null) {
            autofillSharedJSBridgeProxy.A08(str);
        }
    }

    public void BDY(AQ8 aq8, String str) {
    }

    public void BDb(AQ8 aq8, long j) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    public void BDk(String str) {
        String str2;
        String host;
        MessageDigest messageDigest;
        if (this instanceof ASC) {
            ASC asc = (ASC) this;
            if (!asc.A03) {
                Uri parse = Uri.parse(str);
                if (parse.getHost() == null) {
                    return;
                }
                if (asc.A02) {
                    List list = asc.A07;
                    String host2 = parse.getHost();
                    String path = parse.getPath();
                    MessageDigest messageDigest2 = asc.A06;
                    String str3 = null;
                    if (messageDigest2 != null) {
                        messageDigest2.reset();
                        asc.A06.update(path.getBytes());
                        try {
                            str2 = C04190Cw.A00(asc.A06.digest());
                        } catch (UnsupportedEncodingException unused) {
                        }
                        host = parse.getHost();
                        if (host.startsWith("www.")) {
                            host = host.substring(4);
                        }
                        messageDigest = asc.A06;
                        if (messageDigest != null) {
                            messageDigest.reset();
                            asc.A06.update(host.getBytes());
                            try {
                                str3 = C04190Cw.A00(asc.A06.digest());
                            } catch (UnsupportedEncodingException unused2) {
                            }
                        }
                        list.add(new C23592ASr(str, host2, str2, str3));
                        asc.A01 = false;
                    }
                    str2 = null;
                    host = parse.getHost();
                    if (host.startsWith("www.")) {
                    }
                    messageDigest = asc.A06;
                    if (messageDigest != null) {
                    }
                    list.add(new C23592ASr(str, host2, str2, str3));
                    asc.A01 = false;
                } else if (asc.A0A && str.equals(ADB.A00)) {
                    asc.A02 = true;
                }
            }
        }
    }

    public void BMf(String str) {
        BrowserLiteHeaderLoadingScreen browserLiteHeaderLoadingScreen;
        if ((this instanceof ASA) && (browserLiteHeaderLoadingScreen = ((ASA) this).A01) != null) {
            browserLiteHeaderLoadingScreen.setTitleText(str);
        }
    }

    public void BO1(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if (this instanceof AUD) {
            AUD aud = (AUD) this;
            Intent intent = aud.A01;
            if (intent != null ? intent.getBooleanExtra("extra_hide_system_status_bar", false) : false) {
                ViewGroup viewGroup = (ViewGroup) aud.A03.getActivity().findViewById(16908290);
                View childAt = viewGroup.getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                Rect rect = new Rect();
                viewGroup.getWindowVisibleDisplayFrame(rect);
                int height = rect.height();
                if (height != aud.A00) {
                    layoutParams.height = height;
                    childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
                    childAt.requestLayout();
                    aud.A00 = height;
                }
            }
        }
    }

    public void BTo(String str) {
        BrowserLiteHeaderLoadingScreen browserLiteHeaderLoadingScreen;
        if ((this instanceof ASA) && (browserLiteHeaderLoadingScreen = ((ASA) this).A01) != null) {
            browserLiteHeaderLoadingScreen.setURLText(str);
        }
    }

    public void BYc(AQ8 aq8, AQ8 aq82) {
        if (this instanceof ASA) {
            ASA asa = (ASA) this;
            if (aq82 == null && asa.A01.getExtras().getBoolean("watch_and_browse_is_in_watch_and_browse") && asa.A04) {
                aq8.A08().setBackground(new ColorDrawable(-16777216));
                if (asa.A01 != null) {
                    asa.A03.AIC().setVisibility(8);
                    asa.A01.setVisibility(0);
                }
            }
        }
    }

    public final boolean Bn2(AQ8 aq8, String str) {
        return false;
    }

    public void Bn8(AQ8 aq8, String str) {
        AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy;
        if ((this instanceof C24075AhV) && (autofillSharedJSBridgeProxy = (AutofillSharedJSBridgeProxy) ((C24075AhV) this).A07.get(aq8)) != null) {
            autofillSharedJSBridgeProxy.A08(str);
        }
    }

    public void BuB(AQ8 aq8) {
        if (this instanceof C24075AhV) {
            ((C24075AhV) this).A07.remove(aq8);
        }
    }

    public void destroy() {
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A04 = null;
        this.A05 = null;
    }

    public final void B3L(Context context, Intent intent, View view, ASB asb, ATp aTp, ARQ arq) {
        this.A00 = context;
        this.A01 = intent;
        this.A02 = view;
        this.A03 = asb;
        this.A04 = aTp;
        this.A05 = arq;
    }
}
