package com.google.p013ar.core;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass8US;
import p000X.BZ4;

/* renamed from: com.google.ar.core.SharedCamera */
public class SharedCamera {
    public Handler A00;
    public final Session A01;
    public final BZ4 A02 = new BZ4();

    private native void nativeSharedCameraCaptureSessionActive(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionClosed(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigureFailed(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigured(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionReady(long j, CameraCaptureSession cameraCaptureSession);

    private native ImageReader nativeSharedCameraGetImageReader(long j, CameraDevice cameraDevice);

    private native ImageReader nativeSharedCameraGetImageReaderMotionTracking(long j, CameraDevice cameraDevice);

    private native Surface nativeSharedCameraGetSurface(long j, CameraDevice cameraDevice);

    private native SurfaceTexture nativeSharedCameraGetSurfaceTexture(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnClosed(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnDisconnected(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnOpened(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraSetAppSurfaces(long j, String str, List list);

    private native void nativeSharedCameraSetCaptureCallback(long j, CameraCaptureSession.CaptureCallback captureCallback, Handler handler);

    public static SurfaceTexture A00(SharedCamera sharedCamera) {
        return sharedCamera.nativeSharedCameraGetSurfaceTexture(sharedCamera.A01.nativeWrapperHandle, sharedCamera.A02.A01);
    }

    public static Surface A01(SharedCamera sharedCamera) {
        return sharedCamera.nativeSharedCameraGetSurface(sharedCamera.A01.nativeWrapperHandle, sharedCamera.A02.A01);
    }

    public static void A02(SharedCamera sharedCamera) {
        ImageReader nativeSharedCameraGetImageReader = sharedCamera.nativeSharedCameraGetImageReader(sharedCamera.A01.nativeWrapperHandle, sharedCamera.A02.A01);
        if (nativeSharedCameraGetImageReader != null) {
            nativeSharedCameraGetImageReader.setOnImageAvailableListener(AnonymousClass8US.A00, sharedCamera.A00);
        }
        ImageReader nativeSharedCameraGetImageReaderMotionTracking = sharedCamera.nativeSharedCameraGetImageReaderMotionTracking(sharedCamera.A01.nativeWrapperHandle, sharedCamera.A02.A01);
        if (nativeSharedCameraGetImageReaderMotionTracking != null) {
            nativeSharedCameraGetImageReaderMotionTracking.setOnImageAvailableListener(AnonymousClass8US.A00, sharedCamera.A00);
        }
    }

    public static void A03(SharedCamera sharedCamera, CameraCaptureSession cameraCaptureSession) {
        sharedCamera.nativeSharedCameraCaptureSessionActive(sharedCamera.A01.nativeWrapperHandle, cameraCaptureSession);
    }

    public static void A04(SharedCamera sharedCamera, CameraCaptureSession cameraCaptureSession) {
        sharedCamera.nativeSharedCameraCaptureSessionClosed(sharedCamera.A01.nativeWrapperHandle, cameraCaptureSession);
    }

    public static void A05(SharedCamera sharedCamera, CameraCaptureSession cameraCaptureSession) {
        sharedCamera.nativeSharedCameraCaptureSessionConfigureFailed(sharedCamera.A01.nativeWrapperHandle, cameraCaptureSession);
    }

    public static void A06(SharedCamera sharedCamera, CameraCaptureSession cameraCaptureSession) {
        sharedCamera.nativeSharedCameraCaptureSessionConfigured(sharedCamera.A01.nativeWrapperHandle, cameraCaptureSession);
    }

    public static void A07(SharedCamera sharedCamera, CameraCaptureSession cameraCaptureSession) {
        sharedCamera.nativeSharedCameraCaptureSessionReady(sharedCamera.A01.nativeWrapperHandle, cameraCaptureSession);
    }

    public static void A08(SharedCamera sharedCamera, CameraDevice cameraDevice) {
        sharedCamera.nativeSharedCameraOnClosed(sharedCamera.A01.nativeWrapperHandle, cameraDevice);
    }

    public static void A09(SharedCamera sharedCamera, CameraDevice cameraDevice) {
        sharedCamera.nativeSharedCameraOnDisconnected(sharedCamera.A01.nativeWrapperHandle, cameraDevice);
        sharedCamera.A02.A01 = null;
    }

    public static void A0A(SharedCamera sharedCamera, CameraDevice cameraDevice) {
        sharedCamera.A02.A01 = cameraDevice;
        sharedCamera.nativeSharedCameraOnOpened(sharedCamera.A01.nativeWrapperHandle, cameraDevice);
    }

    public final List A0B() {
        ArrayList arrayList = new ArrayList();
        BZ4 bz4 = this.A02;
        arrayList.add(bz4.A02);
        ImageReader nativeSharedCameraGetImageReaderMotionTracking = nativeSharedCameraGetImageReaderMotionTracking(this.A01.nativeWrapperHandle, bz4.A01);
        if (nativeSharedCameraGetImageReaderMotionTracking != null) {
            arrayList.add(nativeSharedCameraGetImageReaderMotionTracking.getSurface());
        }
        arrayList.add(nativeSharedCameraGetImageReader(this.A01.nativeWrapperHandle, this.A02.A01).getSurface());
        return arrayList;
    }

    public final void A0C(CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        nativeSharedCameraSetCaptureCallback(this.A01.nativeWrapperHandle, captureCallback, handler);
    }

    public final void A0D(String str, List list) {
        this.A02.A03.put(str, list);
        nativeSharedCameraSetAppSurfaces(this.A01.nativeWrapperHandle, str, list);
    }

    public SharedCamera(Session session) {
        HandlerThread handlerThread = new HandlerThread("SharedCameraHandlerThread");
        handlerThread.start();
        this.A00 = new Handler(handlerThread.getLooper());
        this.A01 = session;
    }
}
