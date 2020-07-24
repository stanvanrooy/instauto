package com.instagram.common.resources.downloadable.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;
import java.util.Locale;
import p000X.AnonymousClass000;
import p000X.AnonymousClass00B;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0OR;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1B9;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass2MU;
import p000X.B3v;
import p000X.C05700Lp;
import p000X.C11530f7;
import p000X.C11540f8;
import p000X.C11720fR;
import p000X.C14330kH;
import p000X.C14490kj;
import p000X.C14800ll;
import p000X.C15120mM;
import p000X.C25162B3t;
import p000X.C25163B3u;

public class WaitingForStringsActivity extends Activity implements AnonymousClass1B9 {
    public static final String A09 = AnonymousClass000.A0E("i18n", WaitingForStringsActivity.class.getName());
    public View A00;
    public View A01;
    public View A02;
    public C11720fR A03;
    public C14330kH A04;
    public Intent A05;
    public View A06;
    public final View.OnClickListener A07 = new B3v(this);
    public volatile boolean A08 = false;

    public static void A00(WaitingForStringsActivity waitingForStringsActivity) {
        C14490kj r1;
        waitingForStringsActivity.A01.setVisibility(0);
        waitingForStringsActivity.A00.setVisibility(8);
        C14330kH r2 = waitingForStringsActivity.A04;
        synchronized (r2) {
            r1 = r2.A00;
        }
        if (r1 == null) {
            r1 = AnonymousClass2MU.A00(new C15120mM(true, (Throwable) null));
        }
        AnonymousClass2MU.A03(r1, new C25162B3t(waitingForStringsActivity), new AnonymousClass0OR(C05700Lp.A00(), 57, 3, true, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        if (p000X.C193418Ps.$const$string(79).equals(r2.getAction()) != false) goto L_0x003a;
     */
    public static void A01(WaitingForStringsActivity waitingForStringsActivity) {
        Intent intent = waitingForStringsActivity.A05;
        if (intent != null) {
            Intent intent2 = new Intent(intent);
            intent2.setFlags(intent2.getFlags() & -268435457);
            if (Build.VERSION.SDK_INT >= 21) {
                if (!AnonymousClass0C5.$const$string(24).equals(intent2.getAction())) {
                }
                intent2.setFlags(intent2.getFlags() & -2);
            }
            AnonymousClass1BH.A03(intent2, waitingForStringsActivity);
        }
        waitingForStringsActivity.finish();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        String sb;
        int A002 = AnonymousClass0Z0.A00(1726200309);
        super.onCreate(bundle);
        C11540f8 A003 = C11540f8.A00();
        AnonymousClass0a4.A0C(A003 instanceof C11530f7, "This activity should not be triggered when string resources are not downloadable");
        C11530f7 r3 = (C11530f7) A003;
        this.A04 = r3.A01;
        this.A03 = r3.A00;
        C14800ll A012 = r3.A01();
        Intent intent = getIntent();
        if (intent != null) {
            Intent intent2 = (Intent) intent.getParcelableExtra("return_intent");
            this.A05 = intent2;
            if (!(intent2 == null || intent2.getExtras() == null)) {
                this.A05.getExtras().setClassLoader(getClass().getClassLoader());
            }
        }
        setContentView(C0003R.layout.ig_waiting_screen);
        this.A00 = findViewById(C0003R.C0005id.loading_strings_error_view);
        this.A01 = findViewById(C0003R.C0005id.loading_strings_progress_view);
        Locale A022 = this.A04.A02();
        String displayName = A022.getDisplayName(A022);
        String locale = A022.toString();
        if ("fb".equals(locale)) {
            displayName = "FB Hash";
        } else if ("qz".equals(locale)) {
            Locale locale2 = new Locale("my");
            String displayName2 = locale2.getDisplayName(locale2);
            if (displayName2 == null || displayName2.isEmpty() || displayName2.equals("မြန်မာ")) {
                str = "ျမန္မာ";
            } else {
                str = "ဗမာ";
            }
            displayName = AnonymousClass000.A0E(str, " (Zawgyi)");
        } else if ("mp".equalsIgnoreCase(locale)) {
            displayName = "ꯃꯅꯤꯄꯨꯔꯤ";
        }
        if (displayName == null) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder(displayName.length());
            String[] split = displayName.split("\\s");
            int length = split.length;
            for (int i = 0; i < length; i++) {
                String str2 = split[i];
                if (str2.length() != 0) {
                    if (i > 0) {
                        sb2.append(" ");
                    }
                    sb2.append(Character.toUpperCase(str2.charAt(0)));
                    sb2.append(split[i].substring(1));
                }
            }
            sb = sb2.toString();
        }
        ((TextView) findViewById(C0003R.C0005id.language_pack_loading_message)).setText(A012.getString(C0003R.string.language_pack_loading_message, new Object[]{sb}));
        ((TextView) findViewById(C0003R.C0005id.language_pack_loading_failed_message)).setText(A012.getString(C0003R.string.language_pack_loading_failed_message, new Object[]{sb, "Instagram"}));
        View findViewById = findViewById(C0003R.C0005id.use_english_button);
        this.A02 = findViewById;
        findViewById.setOnClickListener(this.A07);
        View findViewById2 = findViewById(C0003R.C0005id.retry_button);
        this.A06 = findViewById2;
        findViewById2.setOnClickListener(new C25163B3u(this));
        A00(this);
        AnonymousClass0Z0.A07(-765839527, A002);
    }

    public final void onPause() {
        int A002 = AnonymousClass0Z0.A00(1181165249);
        super.onPause();
        AnonymousClass00B.A01.markerEnd(4456452, 2);
        AnonymousClass0Z0.A07(-766914221, A002);
    }

    public final void onResume() {
        int A002 = AnonymousClass0Z0.A00(451683083);
        super.onResume();
        AnonymousClass00B.A01.markerStart(4456452);
        AnonymousClass0Z0.A07(-681791387, A002);
    }
}
