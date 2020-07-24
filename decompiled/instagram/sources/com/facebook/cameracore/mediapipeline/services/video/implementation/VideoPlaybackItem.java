package com.facebook.cameracore.mediapipeline.services.video.implementation;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.opengl.Matrix;
import android.view.Surface;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p000X.AnonymousClass0Z9;
import p000X.AnonymousClass3c5;
import p000X.C190878Dt;
import p000X.C190888Dv;
import p000X.C78653c6;
import p000X.C78663c7;

public class VideoPlaybackItem implements SurfaceTexture.OnFrameAvailableListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    public final AtomicInteger mAvailableFrames;
    public final ExecutorService mBackgroundThread;
    public final Context mContext;
    public final AtomicBoolean mHasError;
    public boolean mIsLooping;
    public volatile boolean mIsPrepared = false;
    public final MediaPlayer mMediaPlayer;
    public final float[] mSMatrix = new float[16];
    public volatile boolean mStartRequested = false;
    public Surface mSurface;
    public SurfaceTexture mSurfaceTexture;
    public C78653c6 mTexture;
    public final VideoFrame mVideoFrame = new VideoFrame();
    public final String mVideoUri;

    public void resume() {
        this.mStartRequested = true;
        if (this.mIsPrepared) {
            try {
                this.mMediaPlayer.start();
            } catch (IllegalStateException unused) {
                this.mHasError.set(true);
            }
        }
    }

    public int getDuration() {
        return this.mMediaPlayer.getDuration();
    }

    public boolean getHasError() {
        return this.mHasError.getAndSet(false);
    }

    public long getPosition() {
        return (long) this.mMediaPlayer.getCurrentPosition();
    }

    public VideoFrame getVideoFrameIfAvailable() {
        int andSet = this.mAvailableFrames.getAndSet(0);
        if (andSet <= 0 || this.mSurface == null || this.mTexture == null || this.mSurfaceTexture == null) {
            return null;
        }
        for (int i = 0; i < andSet; i++) {
            this.mSurfaceTexture.updateTexImage();
        }
        this.mSurfaceTexture.getTransformMatrix(this.mSMatrix);
        VideoFrame videoFrame = this.mVideoFrame;
        C78653c6 r0 = this.mTexture;
        int i2 = r0.A00;
        int i3 = r0.A01;
        float[] fArr = this.mSMatrix;
        C78663c7 r02 = r0.A02;
        int i4 = r02.A01;
        int i5 = r02.A00;
        videoFrame.textureHandler = i2;
        videoFrame.textureTarget = i3;
        videoFrame.transformationMatrix = fArr;
        videoFrame.width = i4;
        videoFrame.height = i5;
        videoFrame.presentationTimestamp = (long) this.mMediaPlayer.getCurrentPosition();
        return this.mVideoFrame;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.mHasError.set(true);
        return false;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.mAvailableFrames.incrementAndGet();
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.mMediaPlayer.setLooping(this.mIsLooping);
        AnonymousClass3c5 r1 = new AnonymousClass3c5("VideoPlaybackItem");
        r1.A02 = 36197;
        r1.A03 = this.mMediaPlayer.getVideoWidth();
        r1.A01 = this.mMediaPlayer.getVideoHeight();
        C78653c6 r0 = new C78653c6(r1);
        this.mTexture = r0;
        SurfaceTexture surfaceTexture = new SurfaceTexture(r0.A00);
        this.mSurfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        Surface surface = new Surface(this.mSurfaceTexture);
        this.mSurface = surface;
        this.mMediaPlayer.setSurface(surface);
        this.mIsPrepared = true;
        if (this.mStartRequested) {
            try {
                this.mMediaPlayer.start();
            } catch (IllegalStateException unused) {
                this.mHasError.set(true);
            }
        }
    }

    public void pause() {
        try {
            this.mMediaPlayer.pause();
        } catch (IllegalStateException unused) {
            this.mHasError.set(true);
        }
    }

    public void prepare() {
        AnonymousClass0Z9.A03(this.mBackgroundThread, new C190878Dt(this), -89104775);
    }

    public void seek(int i) {
        this.mMediaPlayer.seekTo(i);
    }

    public void setLooping(boolean z) {
        this.mIsLooping = z;
        if (this.mMediaPlayer != null && this.mIsPrepared) {
            this.mMediaPlayer.setLooping(z);
        }
    }

    public void teardown() {
        if (!this.mBackgroundThread.isShutdown()) {
            AnonymousClass0Z9.A03(this.mBackgroundThread, new C190888Dv(this), -1802356885);
        }
    }

    public VideoPlaybackItem(Context context, String str, ExecutorService executorService) {
        this.mContext = context;
        this.mVideoUri = str;
        this.mAvailableFrames = new AtomicInteger(0);
        this.mHasError = new AtomicBoolean(false);
        this.mBackgroundThread = executorService;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mMediaPlayer = mediaPlayer;
        mediaPlayer.setOnErrorListener(this);
        Matrix.setIdentityM(this.mSMatrix, 0);
    }
}
