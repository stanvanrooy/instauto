package com.facebook.rsys.litecamera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.facebook.rsys.camera.gen.CameraApi;
import com.facebook.rsys.camera.gen.CameraProxy;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;
import p000X.AnonymousClass0CW;
import p000X.AnonymousClass0IT;
import p000X.AnonymousClass8NH;
import p000X.AnonymousClass8QS;
import p000X.AnonymousClass8SD;
import p000X.AnonymousClass8TB;
import p000X.C193948Rz;
import p000X.C199438g9;
import p000X.C199448gA;
import p000X.C199468gC;
import p000X.C199478gD;
import p000X.C199488gF;

public class LiteCameraProxy extends CameraProxy {
    public int A00 = 0;
    public int A01 = 640;
    public int A02 = 384;
    public CameraApi A03;
    public C199448gA A04;
    public SurfaceTextureHelper A05;
    public boolean A06 = true;
    public final C199438g9 A07;
    public final AnonymousClass0IT A08 = new C199468gC(this);
    public final AnonymousClass0IT A09;

    public LiteCameraProxy(AnonymousClass0IT r3) {
        this.A09 = r3;
        this.A07 = new C199438g9(new C199488gF(this));
    }

    public final void setCameraOn(boolean z) {
        if (z) {
            CameraApi cameraApi = this.A03;
            if (cameraApi != null) {
                cameraApi.setCameraState(1);
            }
            this.A04 = new C199448gA(this);
            ((C193948Rz) this.A08.get()).A00.A01(this.A04);
            AnonymousClass8SD r2 = ((C193948Rz) this.A08.get()).A00;
            int i = 0;
            if (this.A00 == 0) {
                i = 1;
            }
            r2.A00(i);
            ((C193948Rz) this.A08.get()).A00.Bdu();
            ((C193948Rz) this.A08.get()).A00.AIy(AnonymousClass8QS.class);
            if (this.A05 == null) {
                SurfaceTextureHelper create = SurfaceTextureHelper.create("rsys_litecamera_capture", (EglBase.Context) null);
                this.A05 = create;
                create.setTextureSize(this.A02, this.A01);
                this.A05.startListening(new C199478gD(this));
                AnonymousClass8TB r5 = ((C193948Rz) this.A08.get()).A01;
                SurfaceTexture surfaceTexture = this.A05.surfaceTexture;
                if (((AnonymousClass8NH) r5.A04.get(surfaceTexture)) == null) {
                    AnonymousClass8NH r1 = new AnonymousClass8NH(surfaceTexture, false);
                    r1.A03(true);
                    r1.A09 = 1;
                    r5.A04.put(surfaceTexture, r1);
                    r5.A00.A3t(r1);
                }
                AnonymousClass8TB r22 = ((C193948Rz) this.A08.get()).A01;
                SurfaceTexture surfaceTexture2 = this.A05.surfaceTexture;
                boolean z2 = true ^ this.A06;
                AnonymousClass8NH r0 = (AnonymousClass8NH) r22.A04.get(surfaceTexture2);
                if (r0 != null) {
                    r0.A0B = z2;
                    return;
                }
                return;
            }
            return;
        }
        ((C193948Rz) this.A08.get()).A00.pause();
        if (this.A04 != null) {
            ((C193948Rz) this.A08.get()).A00.A02(this.A04);
        }
        SurfaceTextureHelper surfaceTextureHelper = this.A05;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.stopListening();
            AnonymousClass8TB r23 = ((C193948Rz) this.A08.get()).A01;
            AnonymousClass8NH r12 = (AnonymousClass8NH) r23.A04.remove(this.A05.surfaceTexture);
            if (r12 != null) {
                r23.A00.BbL(r12);
            }
            this.A05.dispose();
            this.A05 = null;
        } else {
            ((C193948Rz) this.A08.get()).A00.AIy(AnonymousClass8QS.class);
        }
        CameraApi cameraApi2 = this.A03;
        if (cameraApi2 != null) {
            cameraApi2.setCameraState(0);
        }
    }

    public final void setDevicePosition(int i) {
        if (i != this.A00) {
            ((AnonymousClass8QS) ((C193948Rz) this.A08.get()).A00.AIy(AnonymousClass8QS.class)).A02();
            this.A00 = i;
        }
    }

    public final boolean canSwitchCamera() {
        if (Camera.getNumberOfCameras() <= 1) {
            return false;
        }
        return true;
    }

    public final boolean hasCamera() {
        if (Camera.getNumberOfCameras() > 0) {
            return true;
        }
        return false;
    }

    public final void setApi(CameraApi cameraApi) {
        AnonymousClass0CW.A01(cameraApi);
        this.A03 = cameraApi;
    }

    public final void setTargetCaptureResolution(int i, int i2) {
        int max = Math.max(i, i2);
        C199438g9 r1 = this.A07;
        if (r1.A01 != max) {
            C199438g9.A00(r1, r1.A00, max);
            r1.A01 = max;
        }
    }

    public final void setTargetFps(int i) {
    }
}
