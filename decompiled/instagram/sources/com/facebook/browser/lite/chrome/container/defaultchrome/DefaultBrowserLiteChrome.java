package com.facebook.browser.lite.chrome.container.defaultchrome;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.HashMap;
import p000X.AQ8;
import p000X.ARP;
import p000X.ASB;
import p000X.ASO;
import p000X.ATL;
import p000X.ATp;
import p000X.AU0;
import p000X.AUW;
import p000X.AnonymousClass0Z0;
import p000X.C176597gT;
import p000X.C225219mn;
import p000X.C23616ATy;
import p000X.C23617ATz;

public class DefaultBrowserLiteChrome extends ARP {
    public Context A00;
    public Intent A01;
    public Bundle A02;
    public View.OnClickListener A03;
    public View A04;
    public ImageView A05;
    public ImageView A06;
    public LinearLayout A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public ATL A0B;
    public AUW A0C;
    public ASB A0D;
    public ATp A0E;
    public ASO A0F;
    public AQ8 A0G;
    public final HashMap A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r0 == false) goto L_0x0029;
     */
    private void setDomain(String str) {
        Uri parse;
        boolean z;
        Bundle bundleExtra;
        String string;
        if (str == null) {
            parse = null;
        } else {
            parse = Uri.parse(str);
        }
        if (!(parse == null || parse.getHost() == null || (bundleExtra = this.A01.getBundleExtra("BrowserLiteIntent.EXTRA_ACTION_BUTTON")) == null || (string = bundleExtra.getString("KEY_BLACKLIST_DOMAIN")) == null)) {
            boolean A042 = C225219mn.A04(parse.getHost(), string);
            z = true;
        }
        z = false;
        if (z) {
            this.A08.setVisibility(8);
        } else {
            this.A08.setVisibility(0);
        }
        if (parse == null) {
            A04((String) null, false);
        } else {
            A04(parse.getHost(), parse.getScheme().equals("https"));
        }
        int i = 8;
        if (this.A0E.AhM()) {
            this.A08.setVisibility(8);
            return;
        }
        TextView textView = this.A08;
        if (C225219mn.A01(parse)) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    private void setTitleBarColorScheme(int i) {
        if (i == 1) {
            A00();
        } else if (i == 2) {
            A00();
            SpannableString spannableString = new SpannableString(this.A08.getText());
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 0);
            this.A08.setText(spannableString);
        }
    }

    private void A00() {
        setBackground(new ColorDrawable(C176597gT.A00(this.A00, 0)));
        int A002 = C176597gT.A00(this.A00, 0);
        this.A0A.setTextColor(A002);
        this.A09.setTextColor(C176597gT.A00(this.A00, C0003R.color.browser_alternative_subtitle_color));
        this.A05.setColorFilter(A002);
        this.A08.setTextColor(A002);
        this.A06.setColorFilter(A002);
    }

    public final void A04(String str, boolean z) {
        if (str == null) {
            this.A09.setVisibility(8);
        } else {
            this.A09.setVisibility(0);
            this.A09.setText(str);
        }
        this.A09.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setCloseButtonVisibility(boolean z) {
        ImageView imageView = this.A05;
        int i = 8;
        if (z) {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    public void setControllers(ATp aTp, ASB asb) {
        this.A0E = aTp;
        this.A0D = asb;
    }

    public void setMenuButtonVisibility(boolean z) {
        ImageView imageView = this.A06;
        int i = 8;
        if (z) {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    public void setTextZoom(int i) {
        WebSettings A092 = this.A0G.A09();
        A092.setTextZoom(i);
        WebSettings.LayoutAlgorithm layoutAlgorithm = A092.getLayoutAlgorithm();
        WebSettings.LayoutAlgorithm layoutAlgorithm2 = WebSettings.LayoutAlgorithm.NORMAL;
        if (layoutAlgorithm != layoutAlgorithm2) {
            A092.setLayoutAlgorithm(layoutAlgorithm2);
        }
    }

    public void setTitle(String str) {
        if (str == null || !this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_TITLE", true)) {
            this.A0A.setVisibility(8);
            return;
        }
        this.A0A.setVisibility(0);
        this.A0A.setText(str);
    }

    public final void A03(String str) {
        setDomain(str);
        TextUtils.isEmpty(str);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(126264480);
        super.onAttachedToWindow();
        AnonymousClass0Z0.A0D(-2080620137, A062);
    }

    public DefaultBrowserLiteChrome(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x018d, code lost:
        if ("THEME_MESSENGER_IAB".equals(r1) != false) goto L_0x018f;
     */
    public DefaultBrowserLiteChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.A0H = new HashMap();
        this.A00 = context;
        Intent intent = ((Activity) context).getIntent();
        this.A01 = intent;
        this.A02 = intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
        if (ASO.A02 == null) {
            ASO.A02 = new ASO();
        }
        this.A0F = ASO.A02;
        this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_REPORT_SHOULD_INCLUDE_CLOAKING_DATA", false);
        Context context2 = getContext();
        LayoutInflater.from(context2).inflate(C0003R.layout.browser_lite_chrome, this);
        this.A0A = (TextView) findViewById(C0003R.C0005id.text_title);
        this.A09 = (TextView) findViewById(C0003R.C0005id.text_subtitle);
        this.A03 = new C23617ATz(this);
        ImageView imageView = (ImageView) findViewById(C0003R.C0005id.close_button);
        this.A05 = imageView;
        imageView.setClickable(true);
        this.A05.setBackground(getResources().getDrawable(C0003R.C0004drawable.clickable_item_bg));
        this.A05.setOnClickListener(this.A03);
        this.A05.setContentDescription(this.A00.getString(C0003R.string.__external__browser_close_button_description));
        this.A08 = (TextView) findViewById(C0003R.C0005id.browser_action_button);
        this.A06 = (ImageView) findViewById(C0003R.C0005id.browser_menu_button);
        this.A04 = findViewById(C0003R.C0005id.layout_title_and_subtitle);
        this.A07 = (LinearLayout) findViewById(C0003R.C0005id.layout_title_container);
        Bundle bundleExtra = this.A01.getBundleExtra("BrowserLiteIntent.EXTRA_ACTION_BUTTON");
        if (bundleExtra != null) {
            String string = bundleExtra.getString("KEY_LABEL");
            String string2 = bundleExtra.getString("action");
            if (!TextUtils.isEmpty(string) && string2 != null) {
                this.A08.setText(string);
                this.A08.setVisibility(0);
                this.A08.setOnClickListener(new C23616ATy(this, string2));
            }
        }
        ArrayList parcelableArrayListExtra = this.A01.getParcelableArrayListExtra("BrowserLiteIntent.EXTRA_MENU_ITEMS");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            ImageView imageView2 = this.A06;
            getContext();
            imageView2.setContentDescription(context2.getString(C0003R.string.__external__feed_browser_more_options));
            this.A06.setImageDrawable(C176597gT.A02(this.A00, this.A01.getIntExtra("extra_menu_button_icon", C0003R.C0004drawable.browser_more_button)));
            this.A06.setOnClickListener(new AU0(this, parcelableArrayListExtra));
            setMenuButtonVisibility(this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_MENU_ITEM", true));
        }
        if (this.A06.getVisibility() == 8 && this.A08.getVisibility() != 8) {
            TextView textView = this.A08;
            textView.setPadding(textView.getPaddingLeft(), this.A08.getPaddingTop(), this.A00.getResources().getDimensionPixelSize(C0003R.dimen.action_button_optional_padding_right), this.A08.getPaddingBottom());
        }
        String stringExtra = this.A01.getStringExtra("BrowserLiteIntent.EXTRA_BROWSER_THEME");
        boolean z = (!"THEME_MESSENGER_FB4A".equals(stringExtra) && !"THEME_WORK_CHAT".equals(stringExtra)) ? false : z;
        z = true;
        if (!(z || this.A01.getExtras() == null || (i = this.A01.getExtras().getInt("BrowserLiteIntent.EXTRA_USE_ALTERNATIVE_TITLE_BAR_COLOR_SCHEME", 0)) == 0)) {
            setTitleBarColorScheme(i);
        }
        setCloseButtonVisibility(this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_CLOSE_BUTTON", true));
        String stringExtra2 = this.A01.getStringExtra("BrowserLiteIntent.EXTRA_BROWSER_THEME");
        if ("THEME_MESSENGER_IAB".equals(stringExtra2)) {
            this.A01.getDoubleExtra("BrowserLiteIntent.DISPLAY_HEIGHT_RATIO", 1.0d);
            this.A05.setImageDrawable(C176597gT.A02(this.A00, 0));
        } else {
            this.A05.setImageDrawable(C176597gT.A02(this.A00, C0003R.C0004drawable.browser_close_button));
            if ("THEME_MESSENGER_FB4A".equals(stringExtra2) || "THEME_WORK_CHAT".equals(stringExtra2)) {
                setBackground(new ColorDrawable(C176597gT.A00(this.A00, 0)));
                this.A0A.setTextColor(C176597gT.A00(this.A00, 0));
                this.A05.setColorFilter(C176597gT.A00(this.A00, 0));
            } else if ("THEME_INSTAGRAM_WATCHBROWSE".equals(stringExtra2)) {
                this.A09.getLayoutParams().height = -1;
                this.A09.setTextSize(0, this.A0A.getTextSize());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A04.getLayoutParams();
                layoutParams.setMargins(this.A00.getResources().getDimensionPixelOffset(C0003R.dimen.browser_watchbrowse_title_left_margin), layoutParams.topMargin, 0, layoutParams.bottomMargin);
            }
        }
        this.A0B = ATL.A00();
    }

    public HashMap getMenuItemActionLog() {
        return this.A0H;
    }
}
