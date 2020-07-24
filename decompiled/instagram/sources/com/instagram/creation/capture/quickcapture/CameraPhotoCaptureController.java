package com.instagram.creation.capture.quickcapture;

import android.app.Activity;
import android.graphics.Bitmap;
import android.media.MediaActionSound;
import com.instagram.model.shopping.Product;
import p000X.AnonymousClass00B;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass3UD;
import p000X.AnonymousClass8TL;
import p000X.C12830hS;
import p000X.C185087vV;
import p000X.C78093b9;
import p000X.C82553ib;
import p000X.C85423nK;
import p000X.C86283om;
import p000X.C86323oq;
import p000X.C87013q2;
import p000X.C87023q3;
import p000X.C87183qJ;
import p000X.C87253qQ;
import p000X.C88143rw;
import p000X.C88193s1;
import p000X.C88203s2;
import p000X.C88213s3;

public final class CameraPhotoCaptureController {
    public Bitmap A00;
    public C87183qJ A01;
    public boolean A02;
    public final Activity A03;
    public final MediaActionSound A04 = new MediaActionSound();
    public final C87023q3 A05;
    public final C12830hS A06;
    public final C82553ib A07;
    public final C87253qQ A08;
    public final AnonymousClass0C1 A09;
    public final Runnable A0A;

    public static void A00(CameraPhotoCaptureController cameraPhotoCaptureController, C88143rw r13, Bitmap bitmap, C85423nK r15) {
        Product A022;
        AnonymousClass00B.A01.markerEnd(11272227, C78093b9.A02(true));
        AnonymousClass00B.A01.markerPoint(17629195, "image_received");
        AnonymousClass3UD r0 = cameraPhotoCaptureController.A07.A08;
        if (r0 != null) {
            r0.A03(r13);
            cameraPhotoCaptureController.A07.A08.A03.A0R.BWx((C86283om) null);
        }
        C88203s2 r3 = new C88203s2(cameraPhotoCaptureController.A09, cameraPhotoCaptureController.A03, cameraPhotoCaptureController.A07, false, cameraPhotoCaptureController.A05.A01(), cameraPhotoCaptureController.A08.A02().A04, true, C88213s3.A00(r15));
        r3.A01 = bitmap;
        r3.A06 = cameraPhotoCaptureController.A05.A04();
        r3.A02 = cameraPhotoCaptureController.A00;
        AnonymousClass8TL r02 = cameraPhotoCaptureController.A01.A0n;
        C185087vV r2 = null;
        if (!(r02 == null || (A022 = r02.A02()) == null)) {
            r2 = new C185087vV(A022.getId(), A022.A02.A02);
        }
        r3.A04 = r2;
        cameraPhotoCaptureController.A06.schedule(new C88193s1(r3));
    }

    public CameraPhotoCaptureController(Activity activity, AnonymousClass0C1 r3, C87023q3 r4, C87253qQ r5, C12830hS r6, C87183qJ r7, C82553ib r8) {
        this.A03 = activity;
        this.A09 = r3;
        this.A05 = r4;
        this.A08 = r5;
        this.A06 = r6;
        this.A01 = r7;
        this.A07 = r8;
        this.A0A = new C87013q2(this, activity);
    }

    public static /* synthetic */ void A01(Exception exc, C85423nK r4) {
        C86323oq.A09("preview", C88213s3.A00(r4), false);
        AnonymousClass00B.A01.markerEnd(11272227, C78093b9.A02(false));
        AnonymousClass0DB.A0G("com.instagram.creation.capture.quickcapture.CameraPhotoCaptureController", exc.getMessage(), exc);
    }
}
