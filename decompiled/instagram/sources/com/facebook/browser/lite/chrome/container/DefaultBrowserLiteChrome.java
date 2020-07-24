package com.facebook.browser.lite.chrome.container;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar;
import java.util.ArrayList;
import p000X.ARt;
import p000X.ASB;
import p000X.ATp;
import p000X.AU2;
import p000X.AU5;
import p000X.AU6;
import p000X.AUW;
import p000X.AnonymousClass1BA;
import p000X.C019000b;
import p000X.C176597gT;

public class DefaultBrowserLiteChrome extends RelativeLayout implements ARt {
    public ImageView A00;
    public TextView A01;
    public AUW A02;
    public ASB A03;
    public ATp A04;
    public String A05;
    public String A06;
    public View A07;
    public ImageView A08;
    public TextView A09;
    public BrowserLiteProgressBar A0A;
    public final Intent A0B;
    public final Bundle A0C;

    public final void BoE(int i) {
        Resources resources;
        int i2;
        if (i == -8 || i == -1) {
            resources = getResources();
            i2 = C0003R.string.instagram_browser_chrome_unknown_error;
        } else {
            resources = getResources();
            i2 = C0003R.string.instagram_browser_chrome_failed_to_load;
        }
        String string = resources.getString(i2);
        this.A05 = string;
        this.A01.setText(string);
        this.A07.setVisibility(8);
    }

    public void setBottomDivider(int i) {
    }

    public void setProgressBarVisibility(int i) {
    }

    public final void AdS() {
        if (this.A0B.getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_IAB_FULLSCREEN_EXPERIENCE", false)) {
            Context context = getContext();
            getContext();
            C176597gT.A04(this, C019000b.A00(context, AnonymousClass1BA.A03(context, C0003R.attr.iabChromeBackgroundColor)));
        } else {
            setBackgroundResource(AnonymousClass1BA.A03(getContext(), C0003R.attr.iabChromeBackgroundRes));
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Resources resources = getResources();
        layoutParams.height = resources.getDimensionPixelSize(C0003R.dimen.browser_chrome_height);
        Context context2 = getContext();
        LayoutInflater.from(context2).inflate(C0003R.layout.ig_browser_chrome, this);
        this.A01 = (TextView) findViewById(C0003R.C0005id.ig_browser_text_title);
        this.A09 = (TextView) findViewById(C0003R.C0005id.ig_browser_text_subtitle);
        this.A08 = (ImageView) findViewById(C0003R.C0005id.ig_secure_connection_icon);
        this.A07 = findViewById(C0003R.C0005id.ig_chrome_subsection);
        View findViewById = findViewById(C0003R.C0005id.ig_browser_close_button);
        getResources();
        findViewById.setContentDescription(resources.getString(C0003R.string.__external__browser_close_button_description));
        ImageView imageView = (ImageView) findViewById(C0003R.C0005id.ig_browser_close_button);
        imageView.setClickable(true);
        getContext();
        imageView.setImageDrawable(C176597gT.A02(context2, C0003R.C0004drawable.browser_close_button));
        imageView.setOnClickListener(new AU6(this));
        getContext();
        ArrayList parcelableArrayListExtra = this.A0B.getParcelableArrayListExtra("BrowserLiteIntent.EXTRA_MENU_ITEMS");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            ImageView imageView2 = (ImageView) findViewById(C0003R.C0005id.ig_browser_menu_button);
            this.A00 = imageView2;
            imageView2.setVisibility(0);
            ImageView imageView3 = this.A00;
            getContext();
            imageView3.setContentDescription(context2.getString(C0003R.string.__external__feed_browser_more_options));
            this.A00.setImageDrawable(C176597gT.A02(context2, C0003R.C0004drawable.browser_more_button));
            this.A00.setOnClickListener(new AU2(this, parcelableArrayListExtra));
        }
    }

    public final void BTp(String str) {
        String AYP = this.A04.AYP();
        if (TextUtils.isEmpty(AYP)) {
            this.A01.setText(C0003R.string.ig_browser_chrome_title_loading_text);
        } else if (!AYP.equals(this.A05)) {
            this.A01.setText(AYP);
            this.A05 = AYP;
        }
        setChromeSubsection(str);
    }

    public void setControllers(ASB asb, ATp aTp) {
        this.A03 = asb;
        this.A04 = aTp;
    }

    public void setProgress(int i) {
        this.A0A.setProgress(i);
        BrowserLiteProgressBar browserLiteProgressBar = this.A0A;
        int i2 = 0;
        if (i == 100) {
            i2 = 8;
        }
        browserLiteProgressBar.setVisibility(i2);
    }

    private void setChromeSubsection(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A07.setVisibility(0);
            if (!str.equals(this.A06)) {
                this.A09.setText(Uri.parse(str).getHost());
                this.A06 = str;
            }
            if (this.A0B.getBooleanExtra("BrowserLiteIntent.EXTRA_SECURE_CONNECTION_VISUALS_IS_ENABLED", false)) {
                boolean z = false;
                if (!(this.A04.AYf() == null || this.A04.AYf().A07() == null)) {
                    z = true;
                }
                this.A08.setVisibility(0);
                ImageView imageView = this.A08;
                int i = C0003R.C0004drawable.instagram_error_outline_24;
                if (z) {
                    i = C0003R.C0004drawable.instagram_lock_filled_24;
                }
                imageView.setImageResource(i);
                this.A07.setOnClickListener(new AU5(this, z));
                return;
            }
            return;
        }
        this.A07.setVisibility(8);
    }

    public final void AdT() {
        BrowserLiteProgressBar browserLiteProgressBar = (BrowserLiteProgressBar) findViewById(C0003R.C0005id.ig_browser_chrome_progress_bar);
        this.A0A = browserLiteProgressBar;
        browserLiteProgressBar.setVisibility(0);
        this.A0A.setProgress(0);
    }

    public int getHeightPx() {
        int height = getHeight();
        if (height <= 0) {
            return (int) getResources().getDimension(C0003R.dimen.browser_chrome_height);
        }
        return height;
    }

    public DefaultBrowserLiteChrome(Context context) {
        this(context, (AttributeSet) null);
    }

    public DefaultBrowserLiteChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intent intent = ((Activity) context).getIntent();
        this.A0B = intent;
        this.A0C = intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
    }
}
