package com.facebook.smartcapture.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C0003R;
import com.facebook.smartcapture.p011ui.IdCaptureUi;
import p000X.Constants;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1H6;
import p000X.BYN;
import p000X.C25022AyE;
import p000X.C26967BvW;
import p000X.C26969BvY;
import p000X.C36431i2;
import p000X.C4L;

public class PermissionsActivity extends IdCaptureBaseActivity implements C26969BvY {
    public int A00;
    public C26967BvW A01;
    public boolean A02 = false;

    public final void Atn() {
        this.A00++;
        if (this.A02) {
            Intent intent = new Intent(AnonymousClass0C5.$const$string(56));
            intent.setData(Uri.fromParts("package", getPackageName(), (String) null));
            startActivityForResult(intent, 2);
            return;
        }
        C36431i2.A0B(this, new String[]{"android.permission.CAMERA"}, 10);
    }

    public final void onBackPressed() {
        this.A08.A01(Constants.ZERO);
        super.onBackPressed();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            setResult(i2, intent);
            finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0Z0.A00(2086729728);
        super.onCreate(bundle);
        setContentView(C0003R.layout.permissions_activity);
        if (C25022AyE.A00(this)) {
            Intent A003 = IdCaptureActivity.A00(this, this.A01, this.A00, A0K());
            this.A02 = C4L.FIRST_PHOTO_CAPTURE;
            startActivityForResult(A003, 1);
            i = -1626083041;
        } else {
            if (bundle == null) {
                IdCaptureUi idCaptureUi = this.A04;
                if (idCaptureUi != null) {
                    try {
                        this.A01 = (C26967BvW) idCaptureUi.ARn().newInstance();
                        AnonymousClass1H6 A0Q = A05().A0Q();
                        A0Q.A02(C0003R.C0005id.permissions_container, this.A01);
                        A0Q.A09();
                    } catch (InstantiationException e) {
                        e.getMessage();
                    } catch (IllegalAccessException e2) {
                        e2.getMessage();
                    }
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("IdCaptureUi must not be null");
                    AnonymousClass0Z0.A07(1746595195, A002);
                    throw illegalStateException;
                }
            }
            i = -1742291520;
        }
        AnonymousClass0Z0.A07(i, A002);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10 && iArr.length > 0) {
            int i2 = iArr[0];
            if (i2 == 0) {
                this.A01.A00(false);
                BYN.A00("attempts", Integer.valueOf(this.A00));
            } else if (i2 == -1 && !C36431i2.A0C(this, "android.permission.CAMERA")) {
                this.A02 = true;
            }
        }
    }

    public final void onResume() {
        C26967BvW bvW;
        int A002 = AnonymousClass0Z0.A00(-1928878986);
        super.onResume();
        if (C25022AyE.A00(this) && (bvW = this.A01) != null) {
            bvW.A00(false);
            Intent A003 = IdCaptureActivity.A00(this, this.A01, this.A00, A0K());
            this.A02 = C4L.FIRST_PHOTO_CAPTURE;
            startActivityForResult(A003, 1);
        }
        AnonymousClass0Z0.A07(-795199342, A002);
    }
}
