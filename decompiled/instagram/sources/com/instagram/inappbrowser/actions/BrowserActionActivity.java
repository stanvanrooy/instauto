package com.instagram.inappbrowser.actions;

import android.os.Bundle;
import com.facebook.C0003R;
import com.facebook.flipper.core.StateSummary;
import com.instagram.base.activity.IgFragmentActivity;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0RA;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1X4;
import p000X.AnonymousClass40t;
import p000X.C06270Ok;
import p000X.C06590Pq;
import p000X.C103844eE;
import p000X.C16170o9;
import p000X.C19020sn;
import p000X.C207888w0;
import p000X.C207898w1;
import p000X.C207908w2;
import p000X.C26581Eb;
import p000X.C31201Wx;
import p000X.C31221Wz;
import p000X.C58022fB;

public class BrowserActionActivity extends IgFragmentActivity {
    public C207908w2 A00;
    public AnonymousClass0C1 A01;
    public C31221Wz A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final C207898w1 A07 = new C207898w1();

    public final C06590Pq A0L() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-914862404);
        super.onCreate(bundle);
        C26581Eb.A00(this, 1);
        setContentView((int) C0003R.layout.browser_action_activity);
        Bundle extras = getIntent().getExtras();
        this.A01 = AnonymousClass0J1.A06(extras);
        C31221Wz A012 = C31201Wx.A01(this);
        AnonymousClass0a4.A06(A012);
        this.A02 = A012;
        this.A00 = (C207908w2) extras.getSerializable("browser_action_extra_action_type");
        this.A03 = extras.getString("browser_action_extra_browser_url");
        this.A05 = extras.getString("browser_action_extra_media_id", "");
        this.A04 = extras.getString("browser_action_session_id");
        this.A06 = extras.getString("browser_action_tracking_token");
        this.A02.A06(new C207888w0(this));
        switch (this.A00.ordinal()) {
            case 0:
                String str = this.A03;
                C06270Ok A003 = C06270Ok.A00();
                A003.A09(StateSummary.$const$string(61), this.A04);
                A003.A09("tracking_token", this.A06);
                A003.A09("target_url", this.A03);
                A003.A09("share_type", "send_in_direct");
                C103844eE A022 = C19020sn.A00.A04().A02(this.A01, C58022fB.LINK, this.A07);
                A022.A02(this.A05);
                A022.A00.putString(AnonymousClass40t.$const$string(78), str);
                A022.A00.putSerializable(AnonymousClass0C5.$const$string(47), AnonymousClass0RA.A04(A003));
                this.A02.A0F(A022.A00());
                break;
            case 1:
                if (C16170o9.A00()) {
                    C16170o9.A00.A01(this, this.A01, "156875025728575");
                }
                finish();
                break;
        }
        AnonymousClass1X4.A04(getWindow(), getWindow().getDecorView(), extras.getBoolean("browser_action_status_bar_visibility"));
        AnonymousClass0Z0.A07(1398382271, A002);
    }
}
