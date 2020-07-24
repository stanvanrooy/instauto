package p000X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.model.creation.MediaCaptureConfig;
import java.io.File;
import java.util.UUID;

/* renamed from: X.1Wp  reason: invalid class name and case insensitive filesystem */
public final class C31141Wp implements C31151Wq {
    public int A00;
    public MediaCaptureConfig A01;
    public File A02;
    public Integer A03;
    public final Context A04;
    public final C31131Wo A05;
    public final AnonymousClass0C1 A06;

    private void A02(Integer num, MediaCaptureConfig mediaCaptureConfig, int i, Bundle bundle, Integer num2) {
        this.A03 = num;
        this.A01 = mediaCaptureConfig;
        C182887rW.A0d = null;
        C13920jT.A00("capture_flow_v2").A08();
        C182887rW.A01().A0D = AnonymousClass6KE.A00(num2);
        PackageManager packageManager = this.A04.getPackageManager();
        boolean hasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        boolean hasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.camera.front");
        C62742oI.A01(this.A04, this.A06, "capture_flow_helper").AQw(new C77343Zl(this, hasSystemFeature, hasSystemFeature2, num, i, bundle, num2));
    }

    public final void A03(Uri uri, int i, int i2, boolean z, String str) {
        Integer num;
        if (i == 3) {
            num = Constants.A15;
        } else {
            num = Constants.ONE;
        }
        C182887rW.A0d = null;
        C13920jT.A00("capture_flow_v2").A08();
        C182887rW.A01().A0D = AnonymousClass6KE.A00(num);
        this.A00 = i;
        C185867wo A002 = C185867wo.A00(this.A04, uri);
        A002.A00.putInt("mediaSource", this.A00);
        Integer num2 = this.A03;
        A002.A00.putInt("captureType", num2.intValue());
        A002.A00.putParcelable("captureConfig", new MediaCaptureConfig(new C31161Wr(num2)));
        Intent A003 = C11290ej.A00.A00(this.A04);
        A003.putExtras(A002.A00);
        A003.putExtra("autoCenterCrop", z);
        A003.putExtra("sourceMediaId", str);
        A003.putExtra("IgSessionManager.SESSION_TOKEN_KEY", this.A06.getToken());
        this.A05.Bps(A003, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r5 != 10004) goto L_0x0031;
     */
    public final void Ar3(int i, int i2, Intent intent) {
        if (i2 != -1) {
            A00();
            C182887rW A012 = C182887rW.A01();
            AnonymousClass0C1 r2 = this.A06;
            if (A012.A0O) {
                A012.A06(r2, "exit");
            } else if (A012.A0N) {
                A012.A05(r2, "exit");
            }
            this.A05.Ar4(i, this.A00);
            return;
        }
        if (i != 10001) {
            if (i == 10002) {
                BpY(AnonymousClass6AF.A01(intent, this.A02), 0, 10001, (String) null);
            }
            this.A05.Ar5(i, this.A00);
        }
        int i3 = this.A00;
        if (i3 == 0 || i3 == 2) {
            A00();
        }
        this.A05.AbX(intent);
        this.A05.Ar5(i, this.A00);
    }

    public final void BpO(Integer num, Integer num2) {
        BpP(num, -1, (Bundle) null, num2);
    }

    public final void BpQ(Integer num, MediaCaptureConfig mediaCaptureConfig, Integer num2) {
        A02(num, mediaCaptureConfig, -1, (Bundle) null, num2);
    }

    public final void BpY(Uri uri, int i, int i2, String str) {
        A03(uri, i, i2, false, str);
    }

    public final void BpZ(Uri uri, int i, int i2, boolean z, String str) {
        A03(uri, i, i2, z, str);
    }

    private void A00() {
        File file = this.A02;
        if (file != null && file.isFile()) {
            Uri.fromFile(this.A02);
            if (!this.A02.delete()) {
                AnonymousClass0DB.A0E("CaptureFlowHelper", "Failed to delete " + this.A02);
            }
        }
    }

    public final void BJh(Bundle bundle) {
        if (bundle != null) {
            if (bundle.getString("tempPhotoFile") != null) {
                this.A02 = new File(bundle.getString("tempPhotoFile"));
            }
            this.A03 = Constants.ZERO(3)[bundle.getInt("captureType", 0)];
            this.A01 = (MediaCaptureConfig) bundle.getParcelable("captureConfig");
            this.A00 = bundle.getInt("mediaSource");
        }
    }

    public final void BKp(Bundle bundle) {
        File file = this.A02;
        if (file != null) {
            bundle.putString("tempPhotoFile", file.toString());
        }
        bundle.putInt("captureType", this.A03.intValue());
        bundle.putParcelable("captureConfig", this.A01);
        bundle.putInt("mediaSource", this.A00);
    }

    public final void BpP(Integer num, int i, Bundle bundle, Integer num2) {
        A02(num, new MediaCaptureConfig(new C31161Wr(num)), i, bundle, num2);
    }

    public final void Bq6(Uri uri, int i, boolean z, String str) {
        this.A00 = i;
        Intent A002 = C11290ej.A00.A00(this.A04);
        A002.putExtra("videoFilePath", uri);
        A002.putExtra("mediaSource", i);
        A002.putExtra("videoRectangleCrop", z);
        A002.putExtra("autoCenterCrop", false);
        A002.putExtra("sourceMediaId", str);
        A002.putExtra("IgSessionManager.SESSION_TOKEN_KEY", this.A06.getToken());
        this.A05.Bps(A002, 10004);
    }

    public final void BqD(Integer num, MediaCaptureConfig mediaCaptureConfig, Integer num2) {
        Integer num3 = num;
        A02(num3, mediaCaptureConfig, C180687nW.A00.A00, (Bundle) null, num2);
    }

    public final void BqE(Integer num, MediaCaptureConfig mediaCaptureConfig, Integer num2) {
        Integer num3 = num;
        A02(num3, mediaCaptureConfig, C180687nW.A01.A00, (Bundle) null, num2);
    }

    public final void stop() {
        C181987pp.A01(this.A06).A05(6);
    }

    public C31141Wp(Context context, C31131Wo r4, AnonymousClass0C1 r5) {
        Integer num = Constants.ZERO;
        this.A03 = num;
        this.A01 = new MediaCaptureConfig(new C31161Wr(num));
        this.A04 = context;
        this.A05 = r4;
        this.A06 = r5;
    }

    public static void A01(C31141Wp r3, Integer num, Intent intent) {
        int i;
        boolean z;
        String str;
        switch (num.intValue()) {
            case 1:
                i = 59;
                break;
            case 8:
                i = 58;
                break;
            case 9:
                i = 60;
                break;
            case 10:
                i = 68;
                break;
            default:
                i = 35;
                z = false;
                break;
        }
        z = true;
        intent.putExtra("newGalleryEligibleEntryPoint", z);
        C181987pp A012 = C181987pp.A01(r3.A06);
        A012.A04 = true;
        String str2 = A012.A01;
        if (str2 != null) {
            AnonymousClass0QD.A02("CreationLogger#duplicateStartGallerySession", AnonymousClass000.A0K("sessionId: ", str2, " entryPoint: ", i));
        }
        A012.A01 = UUID.randomUUID().toString();
        A012.A06.clear();
        A012.A00 = i;
        if (AnonymousClass1H3.A04(A012.A05)) {
            str = "new_gallery";
        } else {
            str = "old_gallery";
        }
        A012.A02 = str;
        C181987pp.A02(A012, C181987pp.A00(A012, "ig_feed_gallery_start_session", 1));
    }
}
