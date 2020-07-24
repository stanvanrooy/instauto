package com.facebook.smartcapture.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import com.facebook.C0003R;
import com.facebook.smartcapture.p011ui.IdCaptureUi;
import java.io.File;
import p000X.Constants;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1H6;
import p000X.C27237C4e;
import p000X.C27242C4l;
import p000X.C5C;
import p000X.C5N;
import p000X.C5Z;

public class PhotoReviewActivity extends IdCaptureBaseActivity implements C5Z {
    public C5C A00;
    public String A01;

    public final void BK1() {
        setResult(0);
        finish();
        this.A08.A03(Constants.ZERO);
    }

    public final void B3H() {
        this.A08.A03(Constants.ONE);
    }

    public final void BD3() {
        Intent intent = new Intent();
        String str = this.A01;
        if (str != null) {
            intent.setData(Uri.fromFile(new File(str)));
        }
        setResult(-1, intent);
        finish();
    }

    public final void onBackPressed() {
        C5C c5c = this.A00;
        if (c5c == null || !c5c.A00()) {
            super.onBackPressed();
        }
    }

    public final void BN8() {
        Toast.makeText(this, C0003R.string.scp_generic_error, 0).show();
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-32020218);
        super.onCreate(bundle);
        setContentView(C0003R.layout.photo_review_activity);
        Intent intent = getIntent();
        C27242C4l c4l = (C27242C4l) intent.getSerializableExtra("capture_stage");
        this.A01 = C5N.A00(this.A01, c4l);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("skewed_crop_points");
        IdCaptureUi idCaptureUi = this.A04;
        if (idCaptureUi == null || this.A01 == null) {
            throw new IllegalStateException("IdCaptureUi must not be null");
        }
        try {
            C5C c5c = (C5C) idCaptureUi.ARt().newInstance();
            this.A00 = c5c;
            C27237C4e A003 = this.A01.A00();
            String str = this.A01;
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("capture_mode", A003);
            bundle2.putSerializable("capture_stage", c4l);
            bundle2.putString("photo_file_path", str);
            bundle2.putParcelableArray("skewed_crop_points", parcelableArrayExtra);
            c5c.setArguments(bundle2);
            AnonymousClass1H6 A0Q = A05().A0Q();
            A0Q.A02(C0003R.C0005id.photo_review_container, this.A00);
            A0Q.A09();
        } catch (InstantiationException e) {
            e.getMessage();
        } catch (IllegalAccessException e2) {
            e2.getMessage();
        }
        AnonymousClass0Z0.A07(1100610643, A002);
    }
}
