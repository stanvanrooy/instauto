package com.instagram.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.Map;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0OS;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass103;
import p000X.AnonymousClass108;
import p000X.AnonymousClass10J;
import p000X.AnonymousClass1BC;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass1DW;
import p000X.AnonymousClass1G3;
import p000X.AnonymousClass1G4;
import p000X.C05210Iq;
import p000X.C05700Lp;
import p000X.C06590Pq;
import p000X.C12600h4;
import p000X.C13150hy;
import p000X.C15610nF;
import p000X.C16180oA;
import p000X.C23320zx;

public class LauncherActivity extends IgFragmentActivity implements AnonymousClass0RN {
    public AnonymousClass0C1 A00;

    public final String getModuleName() {
        return "launcher";
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass0C1 r0;
        int A002 = AnonymousClass0Z0.A00(-1322658105);
        boolean z = true;
        AnonymousClass0C1 r3 = null;
        C12600h4.A02(C12600h4.A00(), "LAUNCHER_ACTIVITY_ONCREATE_START");
        super.onCreate(bundle);
        C06590Pq A01 = AnonymousClass0J1.A01(this);
        boolean AgN = A01.AgN();
        if (AgN) {
            r3 = C05210Iq.A02(A01);
        }
        this.A00 = r3;
        if (AgN && getIntent().hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(getIntent().getAction())) {
            String str = AnonymousClass1BC.A02.A00;
            if (str == null || str.equals(AnonymousClass1DW.A00(Constants.ZERO))) {
                C15610nF.A00(this.A00).BXl(this, this.A00);
            }
            C15610nF.A00(this.A00).BXm(this.A00);
        }
        Intent intent = getIntent();
        if (!intent.hasCategory("android.intent.category.LAUNCHER") || !"android.intent.action.MAIN".equals(intent.getAction())) {
            z = false;
        }
        if (z && (r0 = this.A00) != null) {
            int i = C16180oA.A00(r0).A00.getInt("num_unseen_activities", 0);
            AnonymousClass103 A012 = C23320zx.A00(this.A00).A01();
            AnonymousClass10J r5 = new AnonymousClass10J(AnonymousClass108.MAIN, i);
            C13150hy.A02(r5, "badge");
            AnonymousClass103.A00(A012, "app_open", r5, (AnonymousClass1G4) null, (AnonymousClass1G3) null, (Map) null);
        }
        Intent intent2 = new Intent();
        intent2.setClassName(this, "com.instagram.mainactivity.MainActivity");
        intent2.setFlags(67108864);
        AnonymousClass1BH.A03(intent2, this);
        finish();
        C12600h4.A02(C12600h4.A00(), "LAUNCHER_ACTIVITY_ONCREATE_END");
        ((AnonymousClass0OS) C05700Lp.A0E).BOm();
        AnonymousClass0Z0.A07(-1237890940, A002);
    }
}
