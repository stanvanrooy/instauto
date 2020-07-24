package com.instagram.react.activity;

import android.os.Bundle;
import com.facebook.C0003R;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.instagram.base.activity.BaseFragmentActivity;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1H6;
import p000X.C06590Pq;
import p000X.C227489qa;
import p000X.C23079A5b;

public class IgReactActivity extends BaseFragmentActivity implements C23079A5b {
    public PermissionsModule A00;
    public C06590Pq A01;

    public final void BdQ(String[] strArr, int i, PermissionsModule permissionsModule) {
        this.A00 = permissionsModule;
        requestPermissions(strArr, i);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        PermissionsModule permissionsModule = this.A00;
        if (permissionsModule != null && permissionsModule.onRequestPermissionsResult(i, strArr, iArr)) {
            this.A00 = null;
        }
    }

    public final C06590Pq A0L() {
        return this.A01;
    }

    public final void A0V(Bundle bundle) {
        if (A05().A0L(C0003R.C0005id.layout_container_main) == null) {
            C227489qa r2 = new C227489qa();
            r2.setArguments(getIntent().getExtras());
            AnonymousClass1H6 A0Q = A05().A0Q();
            A0Q.A02(C0003R.C0005id.layout_container_main, r2);
            A0Q.A09();
        }
    }

    public final void finish() {
        super.finish();
        int[] intArrayExtra = getIntent().getIntArrayExtra("IgReactActivity.EXTRA_ACTIVITY_ANIMATION");
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            overridePendingTransition(intArrayExtra[2], intArrayExtra[3]);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-1930693958);
        super.onCreate(bundle);
        this.A01 = AnonymousClass0J1.A00(getIntent().getExtras());
        int[] intArrayExtra = getIntent().getIntArrayExtra("IgReactActivity.EXTRA_ACTIVITY_ANIMATION");
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            overridePendingTransition(intArrayExtra[0], intArrayExtra[1]);
        }
        AnonymousClass0Z0.A07(79003697, A002);
    }
}
