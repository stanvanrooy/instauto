package com.instagram.canvas;

import android.os.Bundle;
import com.facebook.C0003R;
import com.instagram.base.activity.IgFragmentActivity;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1H6;
import p000X.C06590Pq;
import p000X.CAL;

public class CanvasActivity extends IgFragmentActivity {
    public CAL A00;
    public AnonymousClass0C1 A01;

    public final void onBackPressed() {
        this.A00.onBackPressed();
    }

    public final C06590Pq A0L() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(1797511702);
        super.onCreate(bundle);
        this.A01 = AnonymousClass0J1.A06(getIntent().getExtras());
        setContentView((int) C0003R.layout.activity_canvas);
        CAL cal = (CAL) A05().A0L(C0003R.C0005id.layout_container_main);
        this.A00 = cal;
        if (cal == null) {
            this.A00 = new CAL();
            Bundle extras = getIntent().getExtras();
            extras.putBoolean("CanvasFragment.ARGUMENTS_CANVAS_CLOSE_ACTIVITY", true);
            this.A00.setArguments(extras);
            AnonymousClass1H6 A0Q = A05().A0Q();
            A0Q.A02(C0003R.C0005id.layout_container_main, this.A00);
            A0Q.A09();
        }
        AnonymousClass0Z0.A07(184355600, A002);
    }
}
