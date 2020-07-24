package p000X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES10;
import android.opengl.GLES20;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: X.0zV  reason: invalid class name and case insensitive filesystem */
public final class C23080zV {
    public static Map A00;

    public static Map A00() {
        RuntimeException runtimeException;
        boolean z;
        if (A00 == null) {
            A00 = new HashMap();
            try {
                AnonymousClass10A r3 = null;
                if (((EGL10) EGLContext.getEGL()).eglGetCurrentContext().equals(EGL10.EGL_NO_CONTEXT)) {
                    C23100zY r5 = new C23100zY();
                    EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(r5.A02, r5.A00, new int[]{12375, 1, 12374, 1, 12344}, 0);
                    int eglGetError = EGL14.eglGetError();
                    if (eglGetError == 12288) {
                        if (eglCreatePbufferSurface == null) {
                            runtimeException = new RuntimeException("surface was null");
                        } else if (EGL14.eglMakeCurrent(r5.A02, eglCreatePbufferSurface, eglCreatePbufferSurface, r5.A01)) {
                            r3 = new AnonymousClass10A(r5, eglCreatePbufferSurface);
                        } else {
                            runtimeException = new RuntimeException("eglMakeCurrent failed");
                        }
                        throw runtimeException;
                    }
                    throw new RuntimeException(AnonymousClass000.A0J("eglCreatePbufferSurface", ": EGL error: 0x", Integer.toHexString(eglGetError)));
                }
                int[] iArr = new int[1];
                GLES20.glGetIntegerv(34466, iArr, 0);
                int[] iArr2 = new int[iArr[0]];
                GLES20.glGetIntegerv(34467, iArr2, 0);
                int i = 0;
                while (true) {
                    if (i >= iArr2.length) {
                        z = false;
                        break;
                    } else if (iArr2[i] == 37496) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    A00.put("etc2_compression", true);
                }
                if (GLES10.glGetString(7939).contains("GL_IMG_texture_compression_pvrtc")) {
                    A00.put("pvr_compression", true);
                }
                if (r3 != null) {
                    EGLDisplay eGLDisplay = r3.A01.A02;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                        C23100zY r0 = r3.A01;
                        EGL14.eglDestroySurface(r0.A02, r3.A00);
                        r3.A01.A00();
                    } else {
                        runtimeException = new RuntimeException("eglMakeCurrent failed");
                        throw runtimeException;
                    }
                }
            } catch (Throwable th) {
                Log.e("SDKInfo", "Error while checking for capabilities", th);
            }
        }
        return A00;
    }
}
