package com.facebook.mediastreaming.opt.source.video;

import android.util.Pair;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.common.StreamingHybridClassBase;
import com.facebook.mediastreaming.opt.common.SurfaceHolder;
import com.facebook.mediastreaming.opt.source.SurfaceTextureHolder;
import java.util.HashMap;
import java.util.Map;
import p000X.AW7;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass8NP;
import p000X.AnonymousClass8NU;
import p000X.AnonymousClass8NX;
import p000X.AnonymousClass8NZ;
import p000X.AnonymousClass8Nj;
import p000X.AnonymousClass8Nn;
import p000X.AnonymousClass8Nq;
import p000X.C192988Na;
import p000X.C192998Nc;
import p000X.C193028Nh;
import p000X.C193058No;

public class AndroidExternalVideoSource extends StreamingHybridClassBase {
    public static final String TAG = AnonymousClass000.A0E("mss:", "AndroidExternalVideoSource");
    public C193028Nh mFrameScheduler;
    public AW7 mFrameSchedulerFactory;
    public int mHeight;
    public int mOutputFrameRate;
    public final Map mOutputSurfaces = new HashMap();
    public AnonymousClass8NX mRenderer;
    public boolean mStarted;
    public AndroidVideoInput mVideoInput;
    public int mWidth;

    /* access modifiers changed from: private */
    public native void onFrameDrawn(int i);

    static {
        AnonymousClass0Y1.A08("mediastreaming");
    }

    private void ensureSurfaceOutput() {
        boolean z = this.mStarted;
        HashMap hashMap = new HashMap(this.mOutputSurfaces);
        if (this.mVideoInput.enableCaptureRenderer()) {
            if (this.mFrameScheduler != null) {
                stop();
            }
            if (!hashMap.isEmpty()) {
                AnonymousClass8NX r6 = new AnonymousClass8NX(this.mWidth, this.mHeight, this.mVideoInput.enableSecondInputSurface(), new AnonymousClass8Nq(this));
                C193028Nh r0 = new C193028Nh(r6.A06, new C193058No(this, r6));
                this.mFrameScheduler = r0;
                AnonymousClass8NZ.A00(r0.A02, new AnonymousClass8NU(r0, r6), true, false);
                this.mRenderer = r6;
                this.mOutputSurfaces.putAll(hashMap);
                for (Map.Entry entry : this.mOutputSurfaces.entrySet()) {
                    AnonymousClass8NX r62 = this.mRenderer;
                    AnonymousClass8NZ.A00(r62.A06, new C192988Na(r62, ((Integer) entry.getKey()).intValue(), ((AnonymousClass8Nj) entry.getValue()).A02), true, false);
                }
                this.mVideoInput.setOutputSurface((SurfaceTextureHolder) this.mRenderer, true);
            }
        } else {
            for (Map.Entry entry2 : this.mOutputSurfaces.entrySet()) {
                this.mVideoInput.setOutputSurface(((Integer) entry2.getKey()).intValue(), ((AnonymousClass8Nj) entry2.getValue()).A02);
            }
        }
        if (z) {
            start();
        }
    }

    public void setOutputSurface(int i, SurfaceHolder surfaceHolder, int i2, int i3, boolean z, boolean z2) {
        AnonymousClass8NX r0;
        Map map = this.mOutputSurfaces;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            this.mOutputSurfaces.put(valueOf, new AnonymousClass8Nj(surfaceHolder, i2, i3, z2));
        } else {
            AnonymousClass8Nj r02 = (AnonymousClass8Nj) this.mOutputSurfaces.get(valueOf);
            r02.A02 = surfaceHolder;
            if (surfaceHolder != null) {
                r02.A01 = i2;
                r02.A00 = i3;
            }
        }
        long j = 0;
        Pair create = Pair.create(0, 0);
        for (AnonymousClass8Nj r03 : this.mOutputSurfaces.values()) {
            int i4 = r03.A01;
            int i5 = r03.A00;
            long j2 = ((long) i4) * ((long) i5);
            if (j2 > j) {
                create = Pair.create(Integer.valueOf(i4), Integer.valueOf(i5));
                j = j2;
            }
        }
        setVideoConfig(((Integer) create.first).intValue(), ((Integer) create.second).intValue(), this.mOutputFrameRate);
        if (!this.mStarted) {
            return;
        }
        if (!this.mVideoInput.enableCaptureRenderer()) {
            this.mVideoInput.setOutputSurface(i, surfaceHolder);
        } else if (this.mWidth == ((Integer) create.first).intValue() && this.mHeight == ((Integer) create.second).intValue() && (r0 = this.mRenderer) != null) {
            AnonymousClass8NZ.A00(r0.A06, new C192988Na(r0, i, surfaceHolder), z, false);
        } else {
            ensureSurfaceOutput();
        }
    }

    public void setVideoConfig(int i, int i2, int i3) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mOutputFrameRate = i3;
    }

    public void stop() {
        this.mVideoInput.stopRenderingToOutput();
        this.mVideoInput.setOutputSurface((SurfaceTextureHolder) null, false);
        C193028Nh r0 = this.mFrameScheduler;
        if (r0 != null) {
            AnonymousClass8NZ.A00(r0.A02, new C192998Nc(r0), true, true);
            this.mFrameScheduler = null;
        }
        AnonymousClass8NX r3 = this.mRenderer;
        if (r3 != null) {
            AnonymousClass0ZA.A0F(r3.A06, new AnonymousClass8NP(r3), -1576287904);
            r3.A06.getLooper().quitSafely();
            try {
                r3.A07.join();
            } catch (InterruptedException e) {
                AnonymousClass0DB.A05(AnonymousClass8NX.A0B, "Join interrupted", e);
                Thread.currentThread().interrupt();
            }
            this.mRenderer = null;
        }
        this.mOutputSurfaces.clear();
        this.mStarted = false;
    }

    public void uninitialize() {
        AndroidVideoInput androidVideoInput = this.mVideoInput;
        if (androidVideoInput != null) {
            androidVideoInput.removeErrorListener(this);
        }
    }

    public AndroidExternalVideoSource(HybridData hybridData) {
        super(hybridData);
    }

    public void pause() {
        stop();
    }

    public void pauseOutput(int i) {
        Integer valueOf = Integer.valueOf(i);
        if (this.mOutputSurfaces.containsKey(valueOf)) {
            ((AnonymousClass8Nj) this.mOutputSurfaces.get(valueOf)).A03 = true;
        }
    }

    public void resume() {
        start();
    }

    public void resumeOutput(int i) {
        Integer valueOf = Integer.valueOf(i);
        if (this.mOutputSurfaces.containsKey(valueOf)) {
            ((AnonymousClass8Nj) this.mOutputSurfaces.get(valueOf)).A03 = false;
        }
    }

    public void setVideoInput(AndroidVideoInput androidVideoInput) {
        AnonymousClass0a4.A06(androidVideoInput);
        this.mVideoInput = androidVideoInput;
        androidVideoInput.setErrorListener(this);
        this.mFrameSchedulerFactory = androidVideoInput.getFrameSchedulerFactory();
    }

    public void start() {
        ensureSurfaceOutput();
        this.mVideoInput.startRenderingToOutput();
        C193028Nh r0 = this.mFrameScheduler;
        if (r0 != null) {
            AnonymousClass8NZ.A00(r0.A02, new AnonymousClass8Nn(r0), true, false);
        }
        this.mStarted = true;
    }
}
