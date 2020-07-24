package com.instagram.osversionblock;

import android.os.Bundle;
import android.widget.Button;
import com.facebook.C0003R;
import com.instagram.base.activity.IgFragmentActivity;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass4OT;
import p000X.C06590Pq;

public class OsVersionBlockingActivity extends IgFragmentActivity {
    public C06590Pq A00;

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-1936183618);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0J1.A01(this);
        setContentView((int) C0003R.layout.osversionblock);
        ((Button) findViewById(C0003R.C0005id.os_version_blocking_nav_button)).setOnClickListener(new AnonymousClass4OT(this));
        AnonymousClass0Z0.A07(-853442433, A002);
    }
}
