package com.instagram.share.handleractivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgActivity;
import java.util.Collections;
import p000X.Constants;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.C06590Pq;
import p000X.C200638iN;
import p000X.C200688iS;
import p000X.C200708iW;

public class CustomStoryShareHandlerActivity extends IgActivity implements AnonymousClass0RN {
    public C06590Pq A00;

    public final String getModuleName() {
        return "share_handler";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r2 == android.net.Uri.EMPTY) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r6 == android.net.Uri.EMPTY) goto L_0x0059;
     */
    private void A00() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("source_application");
        if (stringExtra == null && (stringExtra = getCallingPackage()) == null) {
            stringExtra = "";
        }
        C200688iS.A00(this.A00, this, Constants.ONE, stringExtra, (String) null);
        Uri data = intent.getData();
        Uri uri = (Uri) intent.getParcelableExtra("interactive_asset_uri");
        String stringExtra2 = intent.getStringExtra("top_background_color");
        String stringExtra3 = intent.getStringExtra("bottom_background_color");
        try {
            i = Color.parseColor(stringExtra2);
        } catch (Exception unused) {
            i = -16777216;
        }
        try {
            i2 = Color.parseColor(stringExtra3);
        } catch (Exception unused2) {
            i2 = -16777216;
        }
        String stringExtra4 = intent.getStringExtra("content_url");
        if (data != null) {
            z = true;
        }
        z = false;
        if (!z) {
            if (uri != null) {
                z2 = true;
            }
            z2 = false;
            if (!z2) {
                finish();
                return;
            }
        }
        C200638iN.A00(this, this.A00, intent, Collections.singletonList(data), uri, Constants.ONE, stringExtra, i, i2, stringExtra4, new C200708iW(this));
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(850251905);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0J1.A01(this);
        A00();
        AnonymousClass0Z0.A07(-1310808178, A002);
    }

    public final void onNewIntent(Intent intent) {
        setIntent(intent);
        A00();
    }
}
