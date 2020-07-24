package com.instagram.igtv.camera;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.C0003R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.gallery.Medium;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass2VU;
import p000X.AnonymousClass794;
import p000X.AnonymousClass798;
import p000X.AnonymousClass799;
import p000X.C05230Is;
import p000X.C06590Pq;
import p000X.C13150hy;
import p000X.C88423sO;

public final class IGTVCameraActivity extends IgFragmentActivity implements AnonymousClass798 {
    public static final AnonymousClass799 A01 = new AnonymousClass799();
    public AnonymousClass0C1 A00;

    public final /* bridge */ /* synthetic */ C06590Pq A0L() {
        AnonymousClass0C1 r1 = this.A00;
        if (r1 == null) {
            C13150hy.A03("userSession");
        }
        return r1;
    }

    public final void ApQ(String str, Medium medium, AnonymousClass2VU r9) {
        C13150hy.A02(str, "uploadSessionId");
        C13150hy.A02(r9, "entryPoint");
        AnonymousClass0C1 r1 = this.A00;
        if (r1 == null) {
            C13150hy.A03("userSession");
        }
        AnonymousClass794 r4 = new AnonymousClass794(r1);
        C13150hy.A02(str, "sessionId");
        r4.A00 = str;
        r4.A01 = false;
        if (medium != null) {
            r4.A01(this, r9, medium, 9999);
            return;
        }
        C13150hy.A02(this, "activity");
        C13150hy.A02(r9, "entryPoint");
        Intent A002 = AnonymousClass794.A00(r4, this, r9, Constants.ZERO);
        A002.putExtra("upload_request_code_arg", 9999);
        AnonymousClass1BH.A0A(A002, 9999, this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 9999) {
            finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-1261669100);
        super.onCreate(bundle);
        Intent intent = getIntent();
        C13150hy.A01(intent, "intent");
        C13150hy.A02(intent, "$this$getExtrasOrThrow");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            AnonymousClass0C1 A06 = AnonymousClass0J1.A06(extras);
            C13150hy.A01(A06, "IgSessionManager.getUserSession(extras)");
            this.A00 = A06;
            setContentView((int) C0003R.layout.igtv_camera_activity);
            Bundle bundle2 = extras.getBundle(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            C13150hy.A01(bundle2, "extras.getBundle(FRAGMENT_ARGS) ?: Bundle()");
            C88423sO r2 = new C88423sO();
            AnonymousClass0C1 r1 = this.A00;
            if (r1 == null) {
                C13150hy.A03("userSession");
            }
            C05230Is.A00(r1, bundle2);
            r2.setArguments(bundle2);
            AnonymousClass1H6 A0Q = A05().A0Q();
            A0Q.A01(C0003R.C0005id.layout_container_main, r2);
            A0Q.A09();
            AnonymousClass0Z0.A07(-145647510, A002);
            return;
        }
        throw new AssertionError("Intent extras cannot be null");
    }
}
