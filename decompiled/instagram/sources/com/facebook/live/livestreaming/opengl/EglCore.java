package com.facebook.live.livestreaming.opengl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import org.webrtc.EglBase10;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0DB;

public final class EglCore {
    public EGLConfig A00 = null;
    public EGLContext A01;
    public EGLDisplay A02;

    public EglCore() {
        EGLConfig eGLConfig;
        EGLConfig eGLConfig2 = null;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.A02 = eGLDisplay;
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        this.A01 = eGLContext;
        if (eGLDisplay == eGLDisplay) {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.A02 = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    if (this.A01 == EGL14.EGL_NO_CONTEXT) {
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        if (!EGL14.eglChooseConfig(this.A02, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                            AnonymousClass0DB.A0K("com.facebook.live.livestreaming.opengl.EglCore", "unable to find RGB8888 /%d EGLConfig", 2);
                            eGLConfig = null;
                        } else {
                            eGLConfig = eGLConfigArr[0];
                            eGLConfig2 = eGLConfig;
                        }
                        if (eGLConfig != null) {
                            EGLContext eglCreateContext = EGL14.eglCreateContext(this.A02, eGLConfig2, eGLContext, new int[]{EglBase10.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                            int eglGetError = EGL14.eglGetError();
                            if (eglGetError == 12288) {
                                this.A00 = eGLConfig2;
                                this.A01 = eglCreateContext;
                            } else {
                                throw new RuntimeException(AnonymousClass000.A0J("eglCreateContext", ": EGL error: 0x", Integer.toHexString(eglGetError)));
                            }
                        } else {
                            throw new RuntimeException("Unable to find a suitable EGLConfig");
                        }
                    }
                    EGL14.eglQueryContext(this.A02, this.A01, EglBase10.EGL_CONTEXT_CLIENT_VERSION, new int[1], 0);
                    return;
                }
                this.A02 = null;
                throw new RuntimeException("unable to initialize EGL14");
            }
            throw new RuntimeException("unable to get EGL14 display");
        }
        throw new RuntimeException("EGL already set up");
    }

    public final void A00() {
        EGLDisplay eGLDisplay = this.A02;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.A02, this.A01);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.A02);
        }
        this.A02 = EGL14.EGL_NO_DISPLAY;
        this.A01 = EGL14.EGL_NO_CONTEXT;
        this.A00 = null;
    }

    public final void finalize() {
        try {
            if (this.A02 != EGL14.EGL_NO_DISPLAY) {
                AnonymousClass0DB.A0E("com.facebook.live.livestreaming.opengl.EglCore", "WARNING: EglCore was not explicitly released -- state may be leaked");
                A00();
            }
        } finally {
            super.finalize();
        }
    }
}
