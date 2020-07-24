package com.facebook.optic.camera1;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.WindowManager;
import java.io.File;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass3SA;
import p000X.AnonymousClass3U8;
import p000X.AnonymousClass3U9;
import p000X.AnonymousClass3UA;
import p000X.AnonymousClass3UV;
import p000X.AnonymousClass3V1;
import p000X.AnonymousClass3VP;
import p000X.AnonymousClass3VQ;
import p000X.AnonymousClass3VR;
import p000X.AnonymousClass3VU;
import p000X.AnonymousClass3Z8;
import p000X.AnonymousClass3Z9;
import p000X.AnonymousClass3ZA;
import p000X.AnonymousClass3ZU;
import p000X.AnonymousClass3ZW;
import p000X.AnonymousClass8AU;
import p000X.C191208Fh;
import p000X.C194458Ud;
import p000X.C30774Djn;
import p000X.C76273Vf;
import p000X.C76313Vj;
import p000X.C76333Vl;
import p000X.C76343Vm;
import p000X.C77053Yi;
import p000X.C77133Yq;
import p000X.C77283Zf;
import p000X.C77373Zo;
import p000X.C77533aA;
import p000X.C84493ll;
import p000X.C84633m1;
import p000X.C85423nK;
import p000X.C86283om;
import p000X.C87343qa;

public class CameraPreviewView2 extends TextureView implements TextureView.SurfaceTextureListener {
    public int A00;
    public OrientationEventListener A01;
    public AnonymousClass3UV A02;
    public C84493ll A03;
    public C30774Djn A04;
    public C77133Yq A05;
    public C76313Vj A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public TextureView.SurfaceTextureListener A0F;
    public C85423nK A0G;
    public C77533aA A0H;
    public C76343Vm A0I;
    public C84633m1 A0J;
    public AnonymousClass3ZU A0K;
    public AnonymousClass3ZU A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public final AnonymousClass3VU A0R;
    public final GestureDetector.SimpleOnGestureListener A0S;
    public final GestureDetector A0T;
    public final ScaleGestureDetector.SimpleOnScaleGestureListener A0U;
    public final ScaleGestureDetector A0V;
    public final C87343qa A0W;
    public final C86283om A0X;

    public final void A02() {
        this.A08 = true;
        this.A0N = false;
        OrientationEventListener orientationEventListener = this.A01;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.A0R.BZO("onPause", this);
        this.A0R.AC8(new C77373Zo(this));
    }

    public static void A00(CameraPreviewView2 cameraPreviewView2) {
        cameraPreviewView2.A0R.BZO("initialise", cameraPreviewView2);
        cameraPreviewView2.A0R.A9Y(cameraPreviewView2.A07, cameraPreviewView2.A0G, cameraPreviewView2.getStartupSettings(), new AnonymousClass3V1(cameraPreviewView2.A0E, cameraPreviewView2.A0D), cameraPreviewView2.getSurfacePipeCoordinator(), cameraPreviewView2.getDisplayRotation(), cameraPreviewView2.A06, (C194458Ud) null, cameraPreviewView2.A0X);
        cameraPreviewView2.getSurfacePipeCoordinator().BL7(cameraPreviewView2.getSurfaceTexture(), cameraPreviewView2.A0E, cameraPreviewView2.A0D);
    }

    public static void A01(CameraPreviewView2 cameraPreviewView2, C77133Yq r8, int i, int i2) {
        cameraPreviewView2.A0R.A7M();
        C76273Vf r0 = (C76273Vf) r8.A02.A00(C77053Yi.A0a);
        if (r0 != null) {
            int i3 = r0.A01;
            int i4 = r0.A00;
            List list = cameraPreviewView2.A0W.A00;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                list.get(i5);
            }
            Matrix transform = cameraPreviewView2.getTransform(new Matrix());
            if (cameraPreviewView2.A0R.BmQ(i, i2, i3, i4, transform, cameraPreviewView2.A0M)) {
                if (cameraPreviewView2.A0B) {
                    cameraPreviewView2.setTransform(transform);
                }
                cameraPreviewView2.A0R.AdZ(cameraPreviewView2.getWidth(), cameraPreviewView2.getHeight(), r8.A00, transform);
                if (cameraPreviewView2.A0O) {
                    cameraPreviewView2.A0N = true;
                    return;
                }
                return;
            }
            throw new RuntimeException("CameraService doesn't support setting up preview matrix.");
        }
        throw new RuntimeException(AnonymousClass000.A0E("Cannot get preview size, maybe camera was never initialised.\n characteristics.settings=\n", (String) r8.A02.A00(C77053Yi.A0d)));
    }

    private AnonymousClass3ZU getPhotoCaptureQuality() {
        AnonymousClass3ZU r0 = this.A0K;
        if (r0 == null) {
            return AnonymousClass3ZU.HIGH;
        }
        return r0;
    }

    private C77533aA getSizeSetter() {
        C77533aA r0 = this.A0H;
        if (r0 == null) {
            return new AnonymousClass8AU();
        }
        return r0;
    }

    private C76343Vm getStartupSettings() {
        C76343Vm r4 = this.A0I;
        if (r4 == null) {
            return new C76333Vl(getPhotoCaptureQuality(), getVideoCaptureQuality(), getSizeSetter(), new C77283Zf());
        }
        return r4;
    }

    private AnonymousClass3UV getSurfacePipeCoordinator() {
        if (this.A02 == null) {
            this.A02 = new C191208Fh(getSurfaceTexture());
        }
        return this.A02;
    }

    private AnonymousClass3ZU getVideoCaptureQuality() {
        AnonymousClass3ZU r0 = this.A0L;
        if (r0 == null) {
            return AnonymousClass3ZU.HIGH;
        }
        return r0;
    }

    public static void setCameraDeviceRotation(CameraPreviewView2 cameraPreviewView2, C77133Yq r4) {
        if (cameraPreviewView2.A0R.isConnected()) {
            int displayRotation = cameraPreviewView2.getDisplayRotation();
            if (cameraPreviewView2.A0C != displayRotation) {
                cameraPreviewView2.A0C = displayRotation;
                cameraPreviewView2.A0R.Bjf(displayRotation, new AnonymousClass3Z8(cameraPreviewView2));
            } else if (r4 != null && ((C76273Vf) r4.A02.A00(C77053Yi.A0a)) != null) {
                A01(cameraPreviewView2, r4, cameraPreviewView2.getWidth(), cameraPreviewView2.getHeight());
            }
        }
    }

    public final void A03(float f, float f2) {
        if (this.A0N && this.A0R.isConnected()) {
            float[] fArr = {f, f2};
            if (!this.A0R.AoQ(fArr)) {
                Log.e("CameraPreviewView2", "mapViewPointToDriverPoint called before initialiseViewToDriverMatrix");
                return;
            }
            int i = (int) fArr[0];
            int i2 = (int) fArr[1];
            if (this.A0Q) {
                this.A0R.BpE(i, i2, new AnonymousClass3ZA(this));
            }
            if (this.A0P) {
                this.A0R.AEc(i, i2);
            }
        }
    }

    public final void A04(File file, C86283om r5) {
        Activity parentActivity;
        if (!this.A0A && (parentActivity = getParentActivity()) != null) {
            this.A00 = parentActivity.getRequestedOrientation();
            parentActivity.setRequestedOrientation(14);
            this.A0A = true;
        }
        this.A0R.Bq9(file, r5);
    }

    public final void A05(String str, C86283om r5) {
        Activity parentActivity;
        if (!this.A0A && (parentActivity = getParentActivity()) != null) {
            this.A00 = parentActivity.getRequestedOrientation();
            parentActivity.setRequestedOrientation(14);
            this.A0A = true;
        }
        this.A0R.BqA(str, r5);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A0E = i;
        this.A0D = i2;
        if (!this.A08) {
            A00(this);
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A0F;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        OrientationEventListener orientationEventListener = this.A01;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.A0N = false;
        this.A0R.BZO("onSurfaceTextureDestroyed", this);
        this.A0R.AC8(new AnonymousClass3Z9(this, surfaceTexture));
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A0F;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A0E = i;
        this.A0D = i2;
        if (!this.A08) {
            getSurfacePipeCoordinator().BL6(i, i2);
            setCameraDeviceRotation(this, this.A05);
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A0F;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C84633m1 r0 = this.A0J;
        if (r0 != null) {
            r0.BQM();
            this.A0J = null;
        }
        this.A0R.Aq7();
        AnonymousClass3SA A002 = AnonymousClass3SA.A00();
        long j = A002.A01;
        if (j == 0) {
            A002.A01 = SystemClock.elapsedRealtime();
            AnonymousClass3SA.A01(A002, 4, A002.A00);
            return;
        }
        AnonymousClass3SA.A01(A002, 2, j);
        A002.A01 = SystemClock.elapsedRealtime();
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.A0V.setQuickScaleEnabled(z);
    }

    public void setInitialCameraFacing(C85423nK r4) {
        this.A0G = r4;
        AnonymousClass3VR.A00(0, 0, AnonymousClass000.A0J("CameraPreviewView2", ": ", "Initial camera facing set to: " + r4));
    }

    public void setMediaOrientationLocked(boolean z) {
        this.A0R.Bit(z);
    }

    public void setOnInitialisedListener(C84493ll r2) {
        if (!(r2 == null || this.A05 == null || !this.A0R.isConnected())) {
            r2.B7P(this.A05);
        }
        this.A03 = r2;
    }

    private int getDisplayRotation() {
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (windowManager != null) {
            return windowManager.getDefaultDisplay().getRotation();
        }
        return 0;
    }

    private Activity getParentActivity() {
        Context baseContext;
        Context context = getContext();
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper) || context == (baseContext = ((ContextWrapper) context).getBaseContext())) {
                return null;
            }
            context = baseContext;
        }
        return (Activity) context;
    }

    public final void A06(boolean z, C86283om r4) {
        Context context = getContext();
        if ((context instanceof Activity) && this.A0A) {
            getContext();
            ((Activity) context).setRequestedOrientation(this.A00);
            this.A0A = false;
        }
        this.A0R.BqZ(z, r4);
    }

    public AnonymousClass3VU getCameraService() {
        return this.A0R;
    }

    public Bitmap getPreviewFrame() {
        return getBitmap();
    }

    public TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return this.A0F;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(-169239680);
        super.onAttachedToWindow();
        AnonymousClass0Z0.A0D(-400256276, A062);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCameraDeviceRotation(this, this.A05);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(796511087);
        super.onDetachedFromWindow();
        OrientationEventListener orientationEventListener = this.A01;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        setOnInitialisedListener((C84493ll) null);
        this.A0W.A00();
        AnonymousClass0Z0.A0D(425987466, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A052 = AnonymousClass0Z0.A05(121662149);
        boolean z = false;
        if (!this.A0N || !this.A0R.isConnected()) {
            i = -2004240064;
        } else {
            boolean onTouchEvent = this.A0T.onTouchEvent(motionEvent);
            boolean onTouchEvent2 = this.A0V.onTouchEvent(motionEvent);
            if (onTouchEvent || onTouchEvent2) {
                z = true;
            }
            i = 979286938;
        }
        AnonymousClass0Z0.A0C(i, A052);
        return z;
    }

    public void setCameraEventLogger(C76313Vj r1) {
        this.A06 = r1;
    }

    public void setCropEnabled(boolean z) {
        this.A0M = z;
    }

    public void setOnSurfaceTextureUpdatedListener(C84633m1 r1) {
        this.A0J = r1;
    }

    public void setPhotoCaptureQuality(AnonymousClass3ZU r1) {
        this.A0K = r1;
    }

    public void setPinchZoomEnabled(boolean z) {
        this.A09 = z;
    }

    public void setPinchZoomListener(C30774Djn djn) {
        this.A04 = djn;
    }

    public void setProductName(String str) {
        this.A07 = str;
    }

    public void setSingleTapFocusEnabled(boolean z) {
        this.A0P = z;
    }

    public void setSingleTapMeteringEnabled(boolean z) {
        this.A0Q = z;
    }

    public void setSizeSetter(C77533aA r1) {
        this.A0H = r1;
    }

    public void setStartupSettings(C76343Vm r1) {
        this.A0I = r1;
    }

    public void setSurfacePipeCoordinator(AnonymousClass3UV r1) {
        this.A02 = r1;
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.A0F = surfaceTextureListener;
    }

    public void setTransformMatrixEnabled(boolean z) {
        this.A0B = z;
    }

    public void setVideoCaptureQuality(AnonymousClass3ZU r1) {
        this.A0L = r1;
    }

    public CameraPreviewView2(Context context) {
        this(context, (AttributeSet) null);
    }

    public CameraPreviewView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraPreviewView2(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (AnonymousClass3VQ) null, context.getClass().getSimpleName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0 = new java.lang.IllegalArgumentException();
     */
    public CameraPreviewView2(Context context, AttributeSet attributeSet, int i, AnonymousClass3VQ r13, String str) {
        super(context, attributeSet, i);
        IllegalArgumentException illegalArgumentException;
        this.A04 = null;
        this.A06 = null;
        this.A0G = C85423nK.BACK;
        this.A0C = -1;
        boolean z = true;
        this.A0B = true;
        this.A0O = true;
        this.A0M = true;
        this.A0X = new AnonymousClass3VP(this);
        this.A0S = new AnonymousClass3U8(this);
        this.A0U = new AnonymousClass3U9(this);
        this.A07 = str;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass3UA.A00, 0, 0);
        if (r13 == null) {
            try {
                int i2 = obtainStyledAttributes.getInt(4, 1);
                if (i2 == 1) {
                    r13 = AnonymousClass3VQ.CAMERA1;
                } else if (i2 != 2) {
                    r13 = AnonymousClass3VQ.CAMERA1;
                } else {
                    r13 = AnonymousClass3VQ.CAMERA2;
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        int i3 = obtainStyledAttributes.getInt(6, 0);
        AnonymousClass3ZU[] values = AnonymousClass3ZU.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            AnonymousClass3ZU r1 = values[i4];
            if (r1.A00 == i3) {
                this.A0L = r1;
                int i5 = obtainStyledAttributes.getInt(3, 0);
                for (AnonymousClass3ZU r12 : AnonymousClass3ZU.values()) {
                    if (r12.A00 == i5) {
                        this.A0K = r12;
                        this.A09 = obtainStyledAttributes.getBoolean(0, true);
                        setInitialCameraFacing(C85423nK.A00(obtainStyledAttributes.getInt(1, C85423nK.BACK.A03)));
                        int i6 = obtainStyledAttributes.getInt(5, 3);
                        this.A0P = (i6 & 1) == 1;
                        this.A0Q = (i6 & 2) != 2 ? false : z;
                        boolean z2 = obtainStyledAttributes.getBoolean(2, false);
                        obtainStyledAttributes.recycle();
                        this.A0R = AnonymousClass3ZW.A00().A01(getContext(), r13);
                        setMediaOrientationLocked(z2);
                        super.setSurfaceTextureListener(this);
                        this.A0W = new C87343qa();
                        this.A0T = new GestureDetector(context, this.A0S);
                        this.A0V = new ScaleGestureDetector(context, this.A0U);
                        return;
                    }
                }
                illegalArgumentException = new IllegalArgumentException();
            } else {
                i4++;
            }
        }
        throw illegalArgumentException;
    }
}
