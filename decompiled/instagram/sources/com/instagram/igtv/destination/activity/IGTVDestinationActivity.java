package com.instagram.igtv.destination.activity;

import android.os.Bundle;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass726;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C164256zW;
import p000X.C1649671t;
import p000X.C1653173e;
import p000X.C27371Ho;
import p000X.C36901in;
import p000X.C37141jB;
import p000X.C37591ju;
import p000X.C52362Om;

public class IGTVDestinationActivity extends BaseFragmentActivity implements AnonymousClass726 {
    public C1653173e A00;
    public AnonymousClass0C1 A01;
    public String A02;
    public String A03;

    public final C06590Pq A0L() {
        return this.A01;
    }

    public final void A0V(Bundle bundle) {
        getWindow().getDecorView().setBackgroundColor(C019000b.A00(this, C0003R.color.igds_secondary_background));
        if (bundle == null) {
            AnonymousClass0C1 r0 = this.A01;
            String str = this.A02;
            String str2 = this.A03;
            C1649671t r3 = new C1649671t();
            Bundle bundle2 = new Bundle();
            bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", r0.getToken());
            bundle2.putString("igtv_destination_session_id_arg", str);
            bundle2.putString("igtv_entry_point_arg", str2);
            bundle2.putBoolean("igtv_is_launching_tab_for_destination", false);
            r3.setArguments(bundle2);
            Bundle bundle3 = r3.mArguments;
            if (bundle3 == null) {
                bundle3 = new Bundle();
            }
            r3.setArguments(bundle3);
            C52362Om r1 = new C52362Om(this, this.A01);
            r1.A08 = false;
            r1.A02 = r3;
            r1.A02();
        }
    }

    public final C1653173e AGI() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-119020753);
        Bundle extras = getIntent().getExtras();
        AnonymousClass0a4.A06(extras);
        this.A01 = AnonymousClass0J1.A06(extras);
        String string = extras.getString("igtv_destination_session_id_arg");
        AnonymousClass0a4.A06(string);
        this.A02 = string;
        String string2 = extras.getString("igtv_entry_point_arg");
        AnonymousClass0a4.A06(string2);
        this.A03 = string2;
        this.A00 = new C1653173e();
        super.onCreate(bundle);
        AnonymousClass0Z0.A07(2057320273, A002);
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0Z0.A00(-1710276043);
        super.onDestroy();
        AnonymousClass0C1 r4 = this.A01;
        String str = this.A03;
        String str2 = this.A02;
        C27371Ho r0 = C164256zW.A00;
        C37141jB A032 = C37591ju.A03("igtv_destination_exit", r0);
        A032.A3Q = str;
        A032.A4o = r0.getModuleName();
        A032.A3j = str2;
        C36901in.A03(AnonymousClass0WN.A01(r4), A032.A03(), Constants.ZERO);
        AnonymousClass0Z0.A07(-412773920, A002);
    }
}
