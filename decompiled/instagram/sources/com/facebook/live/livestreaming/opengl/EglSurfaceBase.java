package com.facebook.live.livestreaming.opengl;

import android.opengl.EGL14;
import android.opengl.EGLSurface;

public class EglSurfaceBase {
    public EGLSurface A00 = EGL14.EGL_NO_SURFACE;
    public EglCore A01;

    public final void A00() {
        EglCore eglCore = this.A01;
        EGLSurface eGLSurface = this.A00;
        if (!EGL14.eglMakeCurrent(eglCore.A02, eGLSurface, eGLSurface, eglCore.A01)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public EglSurfaceBase(EglCore eglCore) {
        this.A01 = eglCore;
    }
}
