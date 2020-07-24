package com.instagram.watchandbrowse.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.C0003R;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.watchandmore.ipc.WatchAndMoreMessenger;
import java.util.HashMap;
import p000X.ADA;
import p000X.AQO;
import p000X.AQR;
import p000X.ARF;
import p000X.ARP;
import p000X.ASA;
import p000X.AT3;
import p000X.AT8;
import p000X.ATH;
import p000X.ATL;
import p000X.AUB;
import p000X.AnonymousClass0XY;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0ZI;
import p000X.AnonymousClass1X4;
import p000X.AnonymousClass9FB;
import p000X.AnonymousClass9FC;
import p000X.C23596ASy;
import p000X.C23597ASz;
import p000X.C248116c;

public class WatchAndBrowseActivity extends Activity implements AnonymousClass9FC, ARF {
    public Bundle A00;
    public BrowserLiteFragment A01;
    public ATL A02;
    public C23596ASy A03;
    public AUB A04;
    public AnonymousClass9FB A05;
    public boolean A06;
    public boolean A07;

    public static void A00(WatchAndBrowseActivity watchAndBrowseActivity, int i) {
        C23596ASy.A03 = true;
        int i2 = 2;
        if (i != 1) {
            i2 = 1;
            if (i != 2) {
                i2 = 3;
                if (i == 10) {
                    i2 = 4;
                }
            }
        }
        AT3 at3 = AT3.A03;
        at3.A02.offer(Message.obtain((Handler) null, 3, i2, -1));
        AT3.A00(at3);
        watchAndBrowseActivity.A01.A0F(i);
        watchAndBrowseActivity.finish();
    }

    public final void AyK(boolean z) {
        this.A07 = true;
        AT3 at3 = AT3.A03;
        at3.A02.offer(Message.obtain((Handler) null, 4, z ? 1 : 0, -1));
        AT3.A00(at3);
        if (!this.A06) {
            HashMap hashMap = new HashMap();
            hashMap.put("action", "ig_did_fullscreen_happen");
            this.A02.A05(hashMap, this.A00);
            this.A06 = true;
        }
    }

    public final void AyL() {
        this.A07 = false;
        AT3.A01(AT3.A03, 5);
    }

    public final void Avm() {
        AT3.A01(AT3.A03, 6);
    }

    public final void AwT() {
        AT3.A01(AT3.A03, 8);
    }

    public final void AyI() {
        ARP arp;
        ARP arp2;
        AQR aqr = this.A01.A0G;
        if (!(aqr == null || (arp2 = aqr.A00) == null)) {
            arp2.setCloseButtonVisibility(true);
        }
        AQR aqr2 = this.A01.A0G;
        if (aqr2 != null && (arp = aqr2.A00) != null) {
            arp.setMenuButtonVisibility(true);
        }
    }

    public final void AyJ() {
        ARP arp;
        ARP arp2;
        AQR aqr = this.A01.A0G;
        if (!(aqr == null || (arp2 = aqr.A00) == null)) {
            arp2.setCloseButtonVisibility(false);
        }
        AQR aqr2 = this.A01.A0G;
        if (aqr2 != null && (arp = aqr2.A00) != null) {
            arp.setMenuButtonVisibility(false);
        }
    }

    public final void BQR() {
        A00(this, 10);
    }

    public final boolean Bn1(View view, MotionEvent motionEvent) {
        BrowserLiteFragment browserLiteFragment = this.A01;
        if (browserLiteFragment == null || browserLiteFragment.AYf() == null || this.A01.AYf().A03() != 0) {
            return false;
        }
        return true;
    }

    public final void onBackPressed() {
        BrowserLiteFragment browserLiteFragment = this.A01;
        if (browserLiteFragment == null || !browserLiteFragment.B6C(false)) {
            A00(this, 2);
        }
    }

    public final void Atm(int i, String str) {
        A00(this, i);
    }

    public final void finish() {
        super.finish();
        if (!this.A07) {
            overridePendingTransition(0, 0);
        } else {
            overridePendingTransition(17432576, 17432577);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C23596ASy.A00(this.A03);
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-1444592906);
        if (!AnonymousClass0XY.A01().A00(this, this, getIntent())) {
            finish();
        }
        super.onCreate(bundle);
        C23596ASy aSy = new C23596ASy(this);
        this.A03 = aSy;
        if (ATH.A03() && ADA.A00(aSy.A00)) {
            C248116c.A00 = true;
        }
        C23596ASy.A00(aSy);
        setContentView(C0003R.layout.watchandbrowse_activity);
        AT3 at3 = AT3.A03;
        Context applicationContext = getApplicationContext();
        try {
            AnonymousClass0ZI.A02(applicationContext.getApplicationContext(), new Intent(applicationContext.getApplicationContext(), WatchAndMoreMessenger.class), at3.A01, 1, -1336997705);
        } catch (SecurityException unused) {
        }
        this.A02 = ATL.A00();
        this.A00 = getIntent().getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
        Bundle bundle2 = getIntent().getExtras().getBundle("com.instagram.watchandmore.CONFIG_BUNDLE");
        if (bundle2 != null) {
            int i = bundle2.getInt("com.instagram.watchandmore.CONFIG_VIDEO_HEIGHT");
            this.A04 = new AUB(this);
            this.A01 = (BrowserLiteFragment) getFragmentManager().findFragmentById(C0003R.C0005id.browser_lite_fragment);
            ASA asa = new ASA();
            View findViewById = findViewById(C0003R.C0005id.watchbrowse_close_button);
            findViewById.setOnClickListener(new AT8(this));
            AQO.A00().A06.add(asa);
            View view = this.A01.getView();
            int dimensionPixelSize = findViewById.getContext().getResources().getDimensionPixelSize(C0003R.dimen.close_button_size);
            this.A05 = new AnonymousClass9FB((TouchInterceptorFrameLayout) findViewById(C0003R.C0005id.watchbrowse_root), view, i, new Rect(0, 0, dimensionPixelSize, dimensionPixelSize), this);
            overridePendingTransition(0, 0);
            AnonymousClass0Z0.A07(1448964082, A002);
            return;
        }
        throw new UnsupportedOperationException("WatchAndMore requires config data");
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0Z0.A00(598572388);
        super.onDestroy();
        try {
            AnonymousClass0ZI.A01(getApplicationContext().getApplicationContext(), AT3.A03.A01, 1111251505);
        } catch (IllegalArgumentException unused) {
        }
        AUB aub = this.A04;
        aub.A01 = null;
        aub.A02 = null;
        aub.A03 = null;
        AnonymousClass0Z0.A07(-1503687771, A002);
    }

    public final void onPause() {
        int A002 = AnonymousClass0Z0.A00(1097764646);
        super.onPause();
        AnonymousClass1X4.A04(getWindow(), getWindow().getDecorView(), true);
        AT3.A01(AT3.A03, 2);
        C23596ASy aSy = this.A03;
        if (C23596ASy.A03) {
            AnonymousClass0ZA.A09(new Handler(), new C23597ASz(aSy), 500, -717330067);
        }
        AUB aub = this.A04;
        if (aub.A03.isAlive()) {
            aub.A03.removeOnGlobalLayoutListener(aub.A06);
        }
        AnonymousClass0Z0.A07(672709110, A002);
    }

    public final void onResume() {
        int A002 = AnonymousClass0Z0.A00(769630615);
        super.onResume();
        AnonymousClass1X4.A04(getWindow(), getWindow().getDecorView(), false);
        AT3.A01(AT3.A03, 1);
        AUB aub = this.A04;
        ViewTreeObserver viewTreeObserver = aub.A03;
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            aub.A03 = aub.A01.getViewTreeObserver();
        }
        aub.A03.addOnGlobalLayoutListener(aub.A06);
        AnonymousClass0Z0.A07(-412460948, A002);
    }

    public final void onUserInteraction() {
        super.onUserInteraction();
        C23596ASy aSy = this.A03;
        aSy.A02.A00();
        HashMap hashMap = new HashMap();
        hashMap.put("action", "ig_browser_touch_interaction");
        aSy.A01.A05(hashMap, (Bundle) null);
    }
}
