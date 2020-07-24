package com.instagram.creation.photo.crop;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C0003R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.creation.base.CropInfo;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1H6;
import p000X.C06590Pq;
import p000X.C15330mi;
import p000X.C16330oQ;
import p000X.C183397sO;
import p000X.C183547sf;

public class AvatarCropActivity extends IgFragmentActivity implements C183547sf {
    public AnonymousClass0C1 A00;

    public final void Aub() {
        setResult(0);
        finish();
    }

    public final void B4e(Uri uri, Location location, CropInfo cropInfo, int i, int i2, String str) {
        setResult(-1, new Intent(uri.toString()));
        finish();
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(975380221);
        requestWindowFeature(1);
        super.onCreate(bundle);
        C15330mi.A01(this);
        this.A00 = AnonymousClass0J1.A06(getIntent().getExtras());
        setContentView((int) C0003R.layout.activity_single_container);
        if (A05().A0L(C0003R.C0005id.layout_container_main) == null) {
            AnonymousClass1H6 A0Q = A05().A0Q();
            C16330oQ.A00.A03();
            C183397sO r1 = new C183397sO();
            r1.setArguments(getIntent().getExtras());
            A0Q.A02(C0003R.C0005id.layout_container_main, r1);
            A0Q.A09();
        }
        AnonymousClass0Z0.A07(1347945438, A002);
    }
}
