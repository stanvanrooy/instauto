package com.instagram.share.creativeapps;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.share.tumblr.TumblrAuthActivity;
import p000X.Constants;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1X5;
import p000X.C15330mi;
import p000X.C168377Gz;

public abstract class XAuthActivity extends IgFragmentActivity {
    public Handler A00 = new Handler();

    public String A0O() {
        return ((TumblrAuthActivity) this).getResources().getString(C0003R.string.tumblr);
    }

    public abstract void A0P();

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(1168443285);
        C15330mi.A01(this);
        super.onCreate(bundle);
        if (((double) getResources().getDisplayMetrics().density) >= 1.5d) {
            getWindow().setSoftInputMode(4);
        }
        setContentView((int) C0003R.layout.activity_xauth);
        ((TextView) findViewById(C0003R.C0005id.action_bar_textview_title)).setText(A0O());
        View findViewById = findViewById(C0003R.C0005id.action_bar_button_back);
        findViewById.setOnClickListener(new C168377Gz(this));
        findViewById.setBackground(new AnonymousClass1X5(getTheme(), Constants.ZERO));
        A0P();
        AnonymousClass0Z0.A07(-1226897779, A002);
    }
}
