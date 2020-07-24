package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass8OY;
import p000X.AnonymousClass8Oa;
import p000X.C25948Bd0;
import p000X.D6U;

public final class DummySurface extends Surface {
    public static int A02;
    public static boolean A03;
    public boolean A00;
    public final AnonymousClass8Oa A01;

    public static int A00(Context context) {
        String eglQueryString;
        int i = C25948Bd0.A00;
        if ((i < 26 && ("samsung".equals(C25948Bd0.A02) || "XT1650".equals(C25948Bd0.A03))) || ((i < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains("EGL_EXT_protected_content"))) {
            return 0;
        }
        if (eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            return 1;
        }
        return 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (A02(r5) != false) goto L_0x0010;
     */
    public static DummySurface A01(Context context, boolean z) {
        boolean z2;
        boolean z3;
        if (C25948Bd0.A00 >= 17) {
            int i = 0;
            if (z) {
                z2 = false;
            }
            z2 = true;
            D6U.A03(z2);
            AnonymousClass8Oa r3 = new AnonymousClass8Oa();
            if (z) {
                i = A02;
            }
            r3.start();
            Handler handler = new Handler(r3.getLooper(), r3);
            r3.A00 = handler;
            r3.A01 = new AnonymousClass8OY(handler);
            synchronized (r3) {
                try {
                    z3 = false;
                    r3.A00.obtainMessage(1, i, 0).sendToTarget();
                    while (r3.A02 == null && r3.A04 == null && r3.A03 == null) {
                        try {
                            r3.wait();
                        } catch (InterruptedException unused) {
                            z3 = true;
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            th = r3.A04;
            if (th == null && (th = r3.A03) == null) {
                DummySurface dummySurface = r3.A02;
                D6U.A01(dummySurface);
                return dummySurface;
            }
            throw th;
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    public static synchronized boolean A02(Context context) {
        boolean z;
        int i;
        synchronized (DummySurface.class) {
            z = true;
            if (!A03) {
                if (C25948Bd0.A00 < 24) {
                    i = 0;
                } else {
                    i = A00(context);
                }
                A02 = i;
                A03 = true;
            }
            if (A02 == 0) {
                z = false;
            }
        }
        return z;
    }

    public DummySurface(AnonymousClass8Oa r1, SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.A01 = r1;
    }

    public final void release() {
        super.release();
        synchronized (this.A01) {
            if (!this.A00) {
                Handler handler = this.A01.A00;
                D6U.A01(handler);
                AnonymousClass0ZA.A0B(handler, 2);
                this.A00 = true;
            }
        }
    }
}
