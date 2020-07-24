package com.instagram.share.tumblr;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.facebook.C0003R;
import com.instagram.share.creativeapps.XAuthActivity;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass1L8;
import p000X.C06590Pq;
import p000X.C192698Lv;
import p000X.C192708Lw;

public class TumblrAuthActivity extends XAuthActivity {
    public AnonymousClass0C1 A00;
    public final View.OnClickListener A01 = new C192708Lw(this);

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void A0P() {
        this.A00 = AnonymousClass0J1.A05();
        AnonymousClass0C1 A05 = AnonymousClass0J1.A05();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", A05.getToken());
        bundle.putBoolean("deliverOnly", true);
        AnonymousClass1L8.A00(this).A03(0, bundle, new C192698Lv(this));
        findViewById(C0003R.C0005id.done).setOnClickListener(this.A01);
        EditText editText = (EditText) findViewById(C0003R.C0005id.username);
        editText.setHint(getString(C0003R.string.tumblr_username_hint));
        if (Build.VERSION.SDK_INT >= 26) {
            editText.setImportantForAutofill(2);
            findViewById(C0003R.C0005id.password).setImportantForAutofill(2);
        }
    }
}
