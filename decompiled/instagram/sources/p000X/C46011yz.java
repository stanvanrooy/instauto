package p000X;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.TextureView;
import com.instagram.common.p004ui.widget.textureview.MultiListenerTextureView;
import java.lang.ref.WeakReference;

/* renamed from: X.1yz  reason: invalid class name and case insensitive filesystem */
public class C46011yz extends MultiListenerTextureView implements TextureView.SurfaceTextureListener {
    public static int A09;
    public static final C208318wu A0A = new C208318wu();
    public int A00;
    public GLSurfaceView.Renderer A01;
    public C208358wy A02;
    public C30785Djz A03;
    public C208338ww A04;
    public C208258wo A05;
    public boolean A06;
    public boolean A07;
    public final WeakReference A08 = new WeakReference(this);

    public C46011yz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        A09 = ((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion;
        A02(this);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|25|20|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0010, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0020 */
    public void A01() {
        C208258wo r3 = this.A05;
        C208318wu r2 = A0A;
        synchronized (r2) {
            r3.A0B = false;
            r3.A0C = true;
            r3.A0A = false;
            r2.notifyAll();
            while (!r3.A04 && r3.A09 && !r3.A0A) {
                r2.wait();
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|22|18|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x000b, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0017 */
    public void A03() {
        C208258wo r2 = this.A05;
        C208318wu r1 = A0A;
        synchronized (r1) {
            r2.A0B = true;
            r1.notifyAll();
            while (!r2.A04 && !r2.A09) {
                r1.wait();
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void A04() {
        C208258wo r2 = this.A05;
        C208318wu r1 = A0A;
        synchronized (r1) {
            r2.A0C = true;
            r1.notifyAll();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:18|19|20|21|33|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (p000X.C208258wo.A02(r3) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0014, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0036 */
    public final void A05(int i, int i2) {
        boolean z;
        C208258wo r3 = this.A05;
        C208318wu r2 = A0A;
        synchronized (r2) {
            r3.A02 = i;
            r3.A00 = i2;
            r3.A0F = true;
            r3.A0C = true;
            r3.A0A = false;
            r2.notifyAll();
            while (!r3.A04 && !r3.A09 && !r3.A0A) {
                if (r3.A07 && r3.A08) {
                    z = true;
                }
                z = false;
                if (!z) {
                    break;
                }
                r2.wait();
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void finalize() {
        try {
            C208258wo r0 = this.A05;
            if (r0 != null) {
                r0.A03();
            }
        } finally {
            super.finalize();
        }
    }

    public C208258wo getGLThread() {
        return this.A05;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|25|20|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x000e, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001e */
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C208258wo r2 = this.A05;
        C208318wu r1 = A0A;
        synchronized (r1) {
            r2.A06 = true;
            r2.A05 = false;
            r1.notifyAll();
            while (r2.A0H && !r2.A05 && !r2.A04) {
                r1.wait();
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|22|18|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x000b, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0017 */
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C208258wo r2 = this.A05;
        C208318wu r1 = A0A;
        synchronized (r1) {
            r2.A06 = false;
            r1.notifyAll();
            while (!r2.A0H && !r2.A04) {
                r1.wait();
                Thread.currentThread().interrupt();
            }
        }
        return true;
    }

    public void setEGLConfigChooser(C208338ww r3) {
        if (this.A05 == null) {
            this.A04 = r3;
            return;
        }
        throw new IllegalStateException("setRenderer has already been called for this instance.");
    }

    public void setEGLContextClientVersion(int i) {
        if (this.A05 == null) {
            this.A00 = i;
            return;
        }
        throw new IllegalStateException("setRenderer has already been called for this instance.");
    }

    public void setRenderMode(int i) {
        this.A05.A04(i);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        if (this.A05 == null) {
            if (this.A04 == null) {
                this.A04 = new C208348wx(this);
            }
            if (this.A02 == null) {
                this.A02 = new C208358wy(this);
            }
            if (this.A03 == null) {
                this.A03 = new C30785Djz();
            }
            this.A01 = renderer;
            C208258wo r1 = new C208258wo(this.A08);
            this.A05 = r1;
            r1.start();
            return;
        }
        throw new IllegalStateException("setRenderer has already been called for this instance.");
    }

    public final void onAttachedToWindow() {
        int i;
        int A062 = AnonymousClass0Z0.A06(1018381375);
        super.onAttachedToWindow();
        if (this.A07 && this.A01 != null) {
            C208258wo r0 = this.A05;
            if (r0 != null) {
                synchronized (A0A) {
                    i = r0.A01;
                }
            } else {
                i = 1;
            }
            C208258wo r1 = new C208258wo(this.A08);
            this.A05 = r1;
            if (i != 1) {
                r1.A04(i);
            }
            this.A05.start();
        }
        this.A07 = false;
        AnonymousClass0Z0.A0D(-1149544843, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(837464685);
        C208258wo r0 = this.A05;
        if (r0 != null) {
            r0.A03();
        }
        this.A07 = true;
        super.onDetachedFromWindow();
        AnonymousClass0Z0.A0D(2071669339, A062);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(1453115188);
        super.onSizeChanged(i, i2, i3, i4);
        getSurfaceTexture();
        A05(i, i2);
        AnonymousClass0Z0.A0D(-287971557, A062);
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.A06 = z;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        A05(i, i2);
    }
}
