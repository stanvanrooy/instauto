package com.facebook.cameracore.camerasdk.optic.arcore;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import java.util.List;
import p000X.AnonymousClass3SO;
import p000X.AnonymousClass3TL;
import p000X.AnonymousClass3UV;
import p000X.AnonymousClass3UW;
import p000X.AnonymousClass3UX;
import p000X.AnonymousClass8Nt;
import p000X.C25756BYd;
import p000X.C85423nK;

public class PreviewSetupDelegateImpl implements AnonymousClass3UX {
    public Context A00;
    public AnonymousClass8Nt A01;
    public C85423nK A02;
    public volatile AnonymousClass3UX A03;
    public volatile boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r2 == p000X.C85423nK.BACK) goto L_0x000a;
     */
    public final synchronized boolean Adz() {
        boolean z;
        C85423nK r2 = this.A02;
        if (r2 != null) {
            z = false;
        }
        z = true;
        return z;
    }

    public synchronized void closeSession() {
        if (this.A03 != null) {
            this.A03.closeSession();
            this.A02 = null;
            this.A03 = null;
            AnonymousClass8Nt r0 = this.A01;
            if (r0 != null) {
                r0.BaX((SurfaceTexture) null);
            }
        }
    }

    public synchronized void createSession(CameraDevice cameraDevice, C85423nK r3) {
        this.A02 = r3;
        A00().createSession(cameraDevice, r3);
    }

    public synchronized AnonymousClass3UV getSurfacePipeCoordinator(SurfaceTexture surfaceTexture, C85423nK r3) {
        AnonymousClass8Nt r0;
        this.A02 = r3;
        r0 = new AnonymousClass8Nt(surfaceTexture, this);
        this.A01 = r0;
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (Adz() == false) goto L_0x000c;
     */
    public synchronized boolean isARCoreEnabled() {
        boolean z;
        if (this.A04) {
            z = true;
        }
        z = false;
        return z;
    }

    public boolean isARCoreSupported() {
        return true;
    }

    public synchronized void setUseArCoreIfSupported(boolean z) {
        this.A04 = z;
    }

    private AnonymousClass3UX A00() {
        AnonymousClass3UX r1;
        if (this.A03 == null) {
            synchronized (this) {
                if (this.A03 == null) {
                    if (isARCoreEnabled()) {
                        r1 = new C25756BYd(this.A00);
                    } else {
                        r1 = AnonymousClass3UW.A00;
                    }
                    this.A03 = r1;
                }
            }
        }
        return this.A03;
    }

    public void onCameraClosed(CameraDevice cameraDevice) {
        if (this.A03 != null) {
            A00().onCameraClosed(cameraDevice);
        }
    }

    public List addArSurfaces(List list) {
        return A00().addArSurfaces(list);
    }

    public SurfaceTexture getArSurfaceTexture(int i, AnonymousClass3TL r3) {
        return A00().getArSurfaceTexture(i, r3);
    }

    public Surface getPreviewSurface(SurfaceTexture surfaceTexture) {
        return A00().getPreviewSurface(surfaceTexture);
    }

    public int getPreviewTemplate() {
        return A00().getPreviewTemplate();
    }

    public boolean isCameraSessionActivated() {
        return A00().isCameraSessionActivated();
    }

    public void onCameraDisconnected(CameraDevice cameraDevice) {
        A00().onCameraDisconnected(cameraDevice);
    }

    public void onCameraError(CameraDevice cameraDevice, int i) {
        A00().onCameraError(cameraDevice, i);
    }

    public void setCameraSessionActivated(AnonymousClass3SO r2) {
        A00().setCameraSessionActivated(r2);
    }

    public void update() {
        A00().update();
    }

    public CameraCaptureSession.StateCallback wrapSessionConfigurationCallback(CameraCaptureSession.StateCallback stateCallback) {
        return A00().wrapSessionConfigurationCallback(stateCallback);
    }

    public PreviewSetupDelegateImpl(Context context) {
        this(context, false);
    }

    public PreviewSetupDelegateImpl(Context context, boolean z) {
        this.A00 = context.getApplicationContext();
        this.A04 = z;
    }
}
