package com.facebook.smartcapture.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.facebook.C0003R;
import com.facebook.jni.HybridData;
import com.facebook.smartcapture.docauth.DocAuthManager;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.p011ui.PhotoRequirementsView;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import p000X.Constants;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZH;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass1HD;
import p000X.B7F;
import p000X.BWP;
import p000X.BYN;
import p000X.C191258Fm;
import p000X.C25022AyE;
import p000X.C27235C4c;
import p000X.C27237C4e;
import p000X.C27239C4g;
import p000X.C27242C4l;
import p000X.C27250C5c;
import p000X.C27251C5d;
import p000X.C27252C5e;
import p000X.C4L;
import p000X.C4Q;
import p000X.C4U;
import p000X.C4X;
import p000X.C4n;
import p000X.C5I;
import p000X.C5S;
import p000X.C76273Vf;
import p000X.C77053Yi;
import p000X.C77133Yq;
import p000X.C84493ll;

public class IdCaptureActivity extends IdCaptureBaseActivity implements C4X, C84493ll, C27252C5e {
    public C191258Fm A00;
    public C4Q A01;
    public C27239C4g A02;
    public Uri A03;
    public FrameLayout A04;

    public final void Bog(int i) {
        Toast.makeText(this, i, 0).show();
    }

    public final void A6M(boolean z) {
        Integer num;
        C4Q c4q = this.A01;
        if (z) {
            num = Constants.A14;
        } else {
            num = Constants.A12;
        }
        c4q.A01 = num;
        C4Q.A01(c4q, true);
    }

    public final int AHf() {
        return this.A04.getHeight();
    }

    public final int AHg() {
        return this.A04.getWidth();
    }

    public final void Auq() {
        this.A08.A01(Constants.ONE);
        super.onBackPressed();
    }

    public final void B7P(C77133Yq r10) {
        C76273Vf r2 = (C76273Vf) this.A00.A00.A0R.AVr().A00(C77053Yi.A0a);
        C76273Vf r0 = (C76273Vf) this.A00.A00.A0R.AVr().A00(C77053Yi.A0V);
        if (r2 != null && r0 != null) {
            BYN.A00("preview_width", Integer.valueOf(r2.A01), "preview_height", Integer.valueOf(r2.A00), AnonymousClass0C5.$const$string(247), Integer.valueOf(r0.A01), AnonymousClass0C5.$const$string(246), Integer.valueOf(r0.A00), "view_width", Integer.valueOf(this.A04.getWidth()), "view_height", Integer.valueOf(this.A04.getHeight()));
        }
    }

    public final void BBu() {
        C4L c4l = C4L.FIRST_PHOTO_CONFIRMATION;
        this.A03 = c4l;
        this.A08.A02(c4l, C4L.SECOND_PHOTO_CAPTURE);
    }

    public final void BBv() {
        C5I c5i;
        Intent intent = new Intent();
        intent.setData(this.A03);
        Integer num = this.A01.A01;
        if (num == Constants.A12) {
            c5i = C5I.SC_V2_AUTO;
        } else {
            if (num == Constants.A14) {
                c5i = C5I.CAMERA_MANUAL;
            }
            setResult(-1, intent);
            finish();
        }
        intent.putExtra("authenticity_upload_medium", c5i);
        setResult(-1, intent);
        finish();
    }

    public final void BBw(C27242C4l c4l, Point[] pointArr) {
        BXU(new C4U(this, c4l, pointArr));
    }

    public final void BQx() {
        C191258Fm.A00(this.A00, 1, this.A01);
    }

    public final void BQy() {
        C191258Fm.A00(this.A00, 0, this.A01);
    }

    public final void BkY(boolean z) {
        this.A02.A04(z);
    }

    public final void BkZ(boolean z) {
        this.A02.A05(z);
    }

    public final void Bka(int i) {
        this.A02.A01(i);
    }

    public final void Bsb(Integer num, Rect rect, boolean z) {
        this.A02.A03(num, rect, z);
    }

    public final void BtE(Integer num) {
        this.A02.A02(num);
    }

    public static Intent A00(Context context, IdCaptureConfig idCaptureConfig, DocumentType documentType, C4L c4l) {
        Intent intent;
        if (!C25022AyE.A00(context)) {
            intent = new Intent(context, PermissionsActivity.class);
            intent.putExtra("id_capture_config", idCaptureConfig);
            intent.putExtra("preset_document_type", documentType);
        } else {
            intent = new Intent(context, IdCaptureActivity.class);
            intent.putExtra("preset_document_type", documentType);
            intent.putExtra("id_capture_config", idCaptureConfig);
        }
        intent.putExtra("previous_step", c4l);
        return intent;
    }

    public static C4L A01(C27242C4l c4l, boolean z) {
        switch (c4l.ordinal()) {
            case 0:
            case 2:
                if (z) {
                    return C4L.FIRST_PHOTO_CONFIRMATION;
                }
                return C4L.FIRST_PHOTO_CAPTURE;
            case 1:
                if (z) {
                    return C4L.SECOND_PHOTO_CONFIRMATION;
                }
                return C4L.SECOND_PHOTO_CAPTURE;
            default:
                throw new IllegalArgumentException("Unsupported stage: " + c4l);
        }
    }

    public final float AK7() {
        return getResources().getDisplayMetrics().density;
    }

    public final void B2z(Exception exc) {
    }

    public final void BXU(Runnable runnable) {
        getWindow().getDecorView().post(runnable);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            if (intent != null) {
                this.A03 = intent.getData();
            }
            C4Q c4q = this.A01;
            C27237C4e A002 = c4q.A06.A00();
            C4X c4x = (C4X) c4q.A0C.get();
            if (c4q.A00 == C27242C4l.ID_FRONT_SIDE && A002 == C27237C4e.FRONT_AND_BACK) {
                c4q.A00 = C27242C4l.ID_BACK_SIDE;
                if (c4x != null) {
                    c4x.BBu();
                }
            } else if (c4x != null) {
                c4x.BBv();
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().addFlags(128);
    }

    public final void onBackPressed() {
        boolean z;
        AnonymousClass1HD A0L = A05().A0L(C0003R.C0005id.capture_overlay_fragment_container);
        if (A0L instanceof C4n) {
            PhotoRequirementsView photoRequirementsView = ((C4n) A0L).A0A;
            if (photoRequirementsView.A03) {
                B7F b7f = photoRequirementsView.A02;
                if (b7f != null) {
                    b7f.A00();
                    photoRequirementsView.A02 = null;
                }
                photoRequirementsView.A03 = false;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
        }
        this.A08.A01(Constants.ZERO);
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(2107200659);
        super.onCreate(bundle);
        setContentView(C0003R.layout.capture_activity);
        View findViewById = findViewById(C0003R.C0005id.camera_fragment_container);
        if (findViewById != null) {
            FrameLayout frameLayout = (FrameLayout) findViewById;
            this.A04 = frameLayout;
            if (Build.VERSION.SDK_INT >= 21) {
                frameLayout.setClipToOutline(true);
            }
            IdCaptureConfig idCaptureConfig = this.A01;
            this.A01 = new C4Q(this, this, idCaptureConfig, this.A07, this.A00, new DocAuthManager(this, idCaptureConfig), this.A08);
            BXU(new C5S(this));
            if (this.A04 != null) {
                try {
                    C191258Fm r2 = new C191258Fm();
                    this.A00 = r2;
                    r2.A01 = new WeakReference(this.A01.A04);
                    this.A00.A02 = new WeakReference(this);
                    C27239C4g c4g = (C27239C4g) this.A04.AHq().newInstance();
                    this.A02 = c4g;
                    boolean z = this.A01.A0D;
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("frame_forced_hidden", z);
                    c4g.setArguments(bundle2);
                    AnonymousClass1H6 A0Q = A05().A0Q();
                    A0Q.A02(C0003R.C0005id.camera_fragment_container, this.A00);
                    A0Q.A02(C0003R.C0005id.capture_overlay_fragment_container, this.A02);
                    A0Q.A09();
                } catch (InstantiationException e) {
                    e.getMessage();
                } catch (IllegalAccessException e2) {
                    e2.getMessage();
                }
            }
            AnonymousClass0Z0.A07(-1074289496, A002);
            return;
        }
        throw new IllegalStateException("Required View not found. Your layout is missing the ID requested.");
    }

    public final void onPause() {
        int A002 = AnonymousClass0Z0.A00(-507326034);
        super.onPause();
        C4Q c4q = this.A01;
        if (c4q != null) {
            DocAuthManager docAuthManager = c4q.A04;
            synchronized (docAuthManager) {
                HybridData hybridData = docAuthManager.mHybridData;
                if (hybridData != null) {
                    hybridData.resetNative();
                    docAuthManager.mHybridData = null;
                }
            }
            C27235C4c c4c = c4q.A09;
            if (c4c != null) {
                SensorManager sensorManager = c4c.A00;
                if (sensorManager != null) {
                    AnonymousClass0ZH.A00(sensorManager, c4c.A03);
                }
                WeakReference weakReference = c4c.A01;
                if (weakReference != null) {
                    weakReference.clear();
                }
                c4c.A00 = null;
                c4c.A01 = null;
            }
            BYN.A00("state_history", c4q.A08.toString());
        }
        AnonymousClass0Z0.A07(-1931083044, A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r4.mIdCaptureConfig.A01() == p000X.C27238C4f.LOW_END) goto L_0x004b;
     */
    public final void onResume() {
        boolean z;
        int A002 = AnonymousClass0Z0.A00(1082468860);
        super.onResume();
        C4Q c4q = this.A01;
        if (c4q != null) {
            BWP bwp = c4q.A08;
            synchronized (bwp) {
                bwp.A00 = new JSONArray();
            }
            c4q.A08.A00(C27250C5c.A00(Constants.ZERO), new String[0]);
            c4q.A02();
            DocAuthManager docAuthManager = c4q.A04;
            boolean z2 = c4q.A0D;
            synchronized (docAuthManager) {
                synchronized (docAuthManager) {
                    HybridData hybridData = docAuthManager.mHybridData;
                    if (hybridData != null) {
                        hybridData.resetNative();
                        docAuthManager.mHybridData = null;
                    }
                }
                if (DocAuthManager.HAS_LOADED_NATIVE_LIBRARY) {
                    z = true;
                }
                z = false;
                if (z) {
                    docAuthManager.mHybridData = DocAuthManager.initHybrid(docAuthManager.mIdCaptureConfig.A0C, z2);
                } else {
                    docAuthManager.mHybridData = null;
                }
            }
            Context context = (Context) c4q.A0B.get();
            C27235C4c c4c = c4q.A09;
            if (!(c4c == null || context == null)) {
                C27251C5d c5d = c4q.A0A;
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                c4c.A00 = sensorManager;
                if (sensorManager != null) {
                    AnonymousClass0ZH.A01(sensorManager, c4c.A03, sensorManager.getDefaultSensor(1), 2);
                    c4c.A01 = new WeakReference(c5d);
                    c4c.A02 = true;
                }
            }
        }
        AnonymousClass0Z0.A07(946695725, A002);
    }
}
