package com.instagram.common.p004ui.widget.videopreviewview;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.gallery.Medium;
import java.io.IOException;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1XB;
import p000X.C104964g6;
import p000X.C105414gp;
import p000X.C190808Dm;
import p000X.C190818Dn;
import p000X.C190828Do;
import p000X.C190838Dp;
import p000X.C190848Dq;
import p000X.C190858Dr;
import p000X.C190868Ds;
import p000X.C45681yK;
import p000X.C45851yg;

/* renamed from: com.instagram.common.ui.widget.videopreviewview.VideoPreviewView */
public class VideoPreviewView extends TextureView implements TextureView.SurfaceTextureListener, C190868Ds, MediaPlayer.OnPreparedListener {
    public static final Class A07 = VideoPreviewView.class;
    public MediaPlayer A00;
    public Surface A01;
    public C190838Dp A02;
    public C190808Dm A03;
    public Runnable A04;
    public C45681yK A05;
    public final Runnable A06;

    public float getMaxFitAspectRatio() {
        return 1.0f;
    }

    public float getMinFitAspectRatio() {
        return 1.0f;
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    private void A00() {
        int i;
        int i2;
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer == null || !A08()) {
            i = 0;
        } else {
            i = mediaPlayer.getVideoWidth();
        }
        MediaPlayer mediaPlayer2 = this.A00;
        if (mediaPlayer2 == null || !A08()) {
            i2 = 0;
        } else {
            i2 = mediaPlayer2.getVideoHeight();
        }
        C45851yg.A01(this, getScaleType(), i, i2, getMinFitAspectRatio(), getMaxFitAspectRatio(), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this);
    }

    private void A01() {
        Runnable runnable = this.A04;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        if (!A09()) {
            boolean z = false;
            if (this.A03 == C190808Dm.PAUSED) {
                z = true;
            }
            if (!z) {
                return;
            }
        }
        try {
            this.A00.stop();
            setMediaPlayerState(C190808Dm.STOPPED);
        } catch (IllegalStateException e) {
            A03(e);
        }
    }

    private void A02(C105414gp r4, C190838Dp r5) {
        if (this.A00 == null) {
            this.A00 = new MediaPlayer();
            setMediaPlayerState(C190808Dm.IDLE);
            this.A04 = new C190848Dq(this);
            Surface surface = this.A01;
            if (surface != null) {
                this.A00.setSurface(surface);
            }
        }
        C190808Dm r1 = this.A03;
        C190808Dm r2 = C190808Dm.PREPARING;
        boolean z = false;
        if (r1 == r2) {
            z = true;
        }
        if (!z) {
            try {
                this.A02 = r5;
                A01();
                this.A00.reset();
                if (getSurfaceTexture() != null) {
                    Surface surface2 = new Surface(getSurfaceTexture());
                    this.A01 = surface2;
                    this.A00.setSurface(surface2);
                }
                r4.Bh1(this.A00);
                setMediaPlayerState(C190808Dm.A02);
                this.A00.setLooping(true);
                this.A00.prepareAsync();
                setMediaPlayerState(r2);
                this.A00.setOnPreparedListener(this);
            } catch (IOException e) {
                AnonymousClass0DB.A05(A07, "failed to load video", e);
            } catch (IllegalStateException e2) {
                A03(e2);
            }
        }
    }

    private void A03(IllegalStateException illegalStateException) {
        AnonymousClass0DB.A05(A07, "VideoPreviewView_IllegalStateException", illegalStateException);
        AnonymousClass0QD.A05("VideoPreviewView_IllegalStateException", "current state: " + this.A03, illegalStateException);
    }

    private void setMediaPlayerState(C190808Dm r2) {
        this.A03 = r2;
        C190838Dp r0 = this.A02;
        if (r0 != null) {
            r0.BOn(r2);
        }
    }

    public final void A04() {
        Runnable runnable = this.A04;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        if (A09()) {
            try {
                this.A00.pause();
                setMediaPlayerState(C190808Dm.PAUSED);
            } catch (IllegalStateException e) {
                A03(e);
            }
        }
    }

    public final void A05() {
        if (this.A00 != null) {
            removeCallbacks(this.A04);
            this.A02 = null;
            this.A01 = null;
            this.A00.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
            A01();
            try {
                this.A00.release();
                setMediaPlayerState(C190808Dm.RELEASED);
                this.A00 = null;
                setMediaPlayerState((C190808Dm) null);
            } catch (IllegalStateException e) {
                A03(e);
            }
        }
    }

    public final boolean A08() {
        C190808Dm r2 = this.A03;
        if (r2 == C190808Dm.PREPARED || r2 == C190808Dm.STARTED || r2 == C190808Dm.PAUSED || r2 == C190808Dm.STOPPED) {
            return true;
        }
        return false;
    }

    public final boolean A09() {
        if (this.A03 == C190808Dm.STARTED) {
            return true;
        }
        return false;
    }

    public final void BFO(float f) {
        C190838Dp r0 = this.A02;
        if (r0 != null) {
            r0.BFP(this, f);
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        setMediaPlayerState(C190808Dm.PREPARED);
        A00();
        if (this.A02 != null) {
            this.A02.B9P(this, this.A00.getVideoWidth(), this.A00.getVideoHeight());
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        this.A01 = surface;
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(surface);
        }
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        this.A01 = surface;
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(surface);
        }
    }

    public void setVideoAssetFileDescriptor(AssetFileDescriptor assetFileDescriptor, C190838Dp r3) {
        A02(new C104964g6(this, assetFileDescriptor), r3);
    }

    public void setVideoMedium(Medium medium, C190838Dp r3) {
        setVideoPath(medium.A0P, r3);
    }

    public void setVideoPath(String str, C190838Dp r3) {
        A02(new C190858Dr(this, str), r3);
    }

    public void setVolume(float f) {
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (A09() != false) goto L_0x000d;
     */
    public final void A06() {
        boolean z;
        if (A08()) {
            z = true;
        }
        z = false;
        if (z && this.A02 != null) {
            this.A00.setOnInfoListener(new C190818Dn(this));
            postDelayed(this.A04, 500);
            A00();
            try {
                this.A00.start();
                setMediaPlayerState(C190808Dm.STARTED);
            } catch (IllegalStateException e) {
                A03(e);
            }
        }
    }

    public final void A07(int i) {
        if (!A09()) {
            boolean z = false;
            if (this.A03 == C190808Dm.PAUSED) {
                z = true;
            }
            if (!z) {
                return;
            }
        }
        this.A00.seekTo(i);
    }

    public C45681yK getScaleType() {
        return this.A05;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(-1413965078);
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
        AnonymousClass0Z0.A0D(583309646, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(749203486);
        super.onDetachedFromWindow();
        A05();
        AnonymousClass0Z0.A0D(1492552835, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00();
    }

    public void setScaleType(C45681yK r1) {
        this.A05 = r1;
    }

    public VideoPreviewView(Context context) {
        this(context, (AttributeSet) null);
    }

    public VideoPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = new C190828Do(this);
        this.A05 = C45681yK.FILL;
        AnonymousClass1XB.A00(this);
    }
}
