package com.instagram.settings.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import com.facebook.C0003R;
import com.instagram.base.activity.IgFragmentActivity;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass572;
import p000X.C06590Pq;
import p000X.C12600h4;
import p000X.C12620h6;
import p000X.C15790nX;

public class NotificationSettingsHandlerActivity extends IgFragmentActivity implements AnonymousClass0RN {
    public C06590Pq A00;

    public final String getModuleName() {
        return "notification_settings_handler";
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0WN.A01(this.A00).Bck(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-1897045012);
        super.onCreate(bundle);
        setContentView((int) C0003R.layout.activity_single_container);
        Intent intent = getIntent();
        C06590Pq A01 = AnonymousClass0J1.A01(this);
        this.A00 = A01;
        if (A01.AgN()) {
            AnonymousClass0C1 A05 = AnonymousClass0J1.A05();
            if ("android.intent.action.MAIN".equals(intent.getAction()) && intent.hasCategory("android.intent.category.NOTIFICATION_PREFERENCES")) {
                C12600h4.A00().A05(C12620h6.NOTIFICATION_CHANNELS);
                AnonymousClass572.A02(this, A05, true);
            }
        } else {
            C15790nX.A00.A00(this, A01, intent.getExtras());
        }
        AnonymousClass0Z0.A07(31092000, A002);
    }
}
