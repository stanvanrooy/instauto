package com.facebook.cameracore.mediapipeline.services.audio.implementation;

import android.content.Context;
import android.media.AudioManager;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;
import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.BaseViewManager;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.MediaStreamTrack;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0CW;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Z9;
import p000X.AnonymousClass1BX;
import p000X.C108014l5;
import p000X.C200198hb;
import p000X.C200768id;
import p000X.C200778ie;
import p000X.C200788if;
import p000X.C200798ig;
import p000X.C200808ih;
import p000X.C29956DIk;
import p000X.C29958DIn;
import p000X.C86263ok;

public class AudioPlatformComponentHostImpl extends AudioPlatformComponentHost {
    public static final Class TAG = AudioPlatformComponentHostImpl.class;
    public String mAssetsDirectory;
    public C200778ie mAudioDecoder;
    public AudioInputPreview mAudioInputPreview;
    public final AudioManager mAudioManager;
    public volatile C29956DIk mAudioPlayer;
    public volatile AudioServiceController mAudioServiceController;
    public final int mDefaultSampleRate;
    public C86263ok mExternalAudioProvider;
    public short[] mInputSamples;
    public boolean mIsCaptureEnabled = true;
    public boolean mIsEffectLoaded = false;
    public boolean mIsMuted = false;
    public boolean mIsPreviewOnRecordingEnabled = false;
    public boolean mIsRecording = false;
    public boolean mIsServiceCreated = false;
    public MicrophoneSink mMicrophoneSink;
    public final AtomicBoolean mMicrophoneSinkAvailable;
    public byte[] mOutputBytes;
    public short[] mOutputSamples;
    public AudioRenderCallback mRenderCallback;
    public C200198hb mStreamType = C200198hb.MUSIC;

    private native double getDefaultSampleRate();

    private native HybridData initHybrid();

    /* access modifiers changed from: private */
    public native void readAudioFileFinished(String str);

    /* access modifiers changed from: private */
    public native void readAudioFileReady(String str, short[] sArr, int i);

    /* access modifiers changed from: private */
    public native void readAudioFileStarted(String str, double d, boolean z);

    public void startRecording(boolean z) {
        this.mIsRecording = true;
        this.mIsPreviewOnRecordingEnabled = z;
        updateAudioState();
    }

    public void stopRecording() {
        this.mIsRecording = false;
        this.mIsPreviewOnRecordingEnabled = false;
        updateAudioState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r1 == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0 != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0031, code lost:
        if (r4 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0045, code lost:
        if (r6.mIsMuted != false) goto L_0x0047;
     */
    private void updateAudioPreviewState() {
        boolean z;
        boolean z2;
        float f;
        boolean z3;
        boolean z4 = false;
        if (this.mMicrophoneSink != null) {
            z4 = true;
        }
        boolean z5 = false;
        if (z4 && !this.mIsPreviewOnRecordingEnabled) {
            C29956DIk dIk = this.mAudioPlayer;
            if (dIk != null) {
                boolean A04 = dIk.A04();
                z3 = true;
            }
            z3 = false;
            z = false;
        }
        z = true;
        if (this.mIsEffectLoaded && (!this.mIsRecording || z)) {
            z5 = true;
        }
        C29956DIk dIk2 = this.mAudioPlayer;
        if (z5 && this.mAudioServiceController != null) {
            z2 = true;
        }
        z2 = false;
        if (this.mAudioServiceController != null) {
            this.mAudioServiceController.setPreviewEnabled(z2);
        }
        if (dIk2 != null) {
            if (z2) {
                f = 1.0f;
            }
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            try {
                dIk2.A00.setStereoVolume(f, f);
            } catch (IllegalStateException e) {
                AnonymousClass0DB.A0B(C29956DIk.A0A, e, "Failed to set volume for AudioPlayer", new Object[0]);
            }
            if (dIk2.A03 == z2) {
                return;
            }
            if (z2) {
                try {
                    boolean A042 = dIk2.A04();
                    boolean z6 = false;
                    if (this.mMicrophoneSink != null) {
                        z6 = true;
                    }
                    dIk2.A03(A042, z6);
                } catch (IllegalStateException e2) {
                    AnonymousClass0DB.A05(TAG, "Exception", e2);
                }
            } else {
                dIk2.A01();
            }
        }
    }

    public AudioServiceController createAudioServiceController() {
        if (this.mAudioServiceController == null) {
            this.mAudioServiceController = new AudioServiceController();
        }
        return this.mAudioServiceController;
    }

    public MicrophoneSink createMicrophoneSink() {
        if (this.mMicrophoneSink == null) {
            this.mMicrophoneSink = new MicrophoneSink();
        }
        this.mMicrophoneSinkAvailable.set(true);
        return this.mMicrophoneSink;
    }

    public void onEffectLoaded(String str, boolean z) {
        boolean z2 = this.mIsServiceCreated;
        Class cls = TAG;
        AnonymousClass0CW.A09(z2, "%s > onEffectLoaded() > service is not created yet", cls);
        AnonymousClass0CW.A09(!this.mIsEffectLoaded, "%s > onEffectLoaded() > effect is already loaded", cls);
        this.mAudioDecoder = new C200778ie();
        AnonymousClass0CW.A09(!AnonymousClass1BX.A00(str), "%s > isDirectoryPathExistsAndValid() > path is null or empty", cls);
        if (!new File(str).isDirectory()) {
            AnonymousClass0DB.A08(cls, "Could not set asset directory, path does not exist or valid: %s", str);
        } else {
            String str2 = File.separator;
            if (str.endsWith(str2)) {
                this.mAssetsDirectory = str;
            } else {
                this.mAssetsDirectory = AnonymousClass000.A0E(str, str2);
            }
        }
        if (z) {
            this.mAudioInputPreview = new AudioInputPreview(this.mAudioServiceController, (int) getDefaultSampleRate());
            C29956DIk dIk = this.mAudioPlayer;
            this.mAudioPlayer = null;
            if (dIk != null) {
                dIk.A02();
                dIk.A00.release();
            }
            AnonymousClass0CW.A03(this.mAudioInputPreview, "%s > createPreviewPlayer() > mAudioInputPreview is null", cls);
            C29956DIk dIk2 = new C29956DIk(this.mAudioManager, this.mStreamType);
            AudioInputPreview audioInputPreview = this.mAudioInputPreview;
            int i = this.mDefaultSampleRate;
            AnonymousClass0CW.A01(audioInputPreview);
            dIk2.A01 = audioInputPreview;
            dIk2.A00.setPlaybackRate(i);
            this.mAudioPlayer = dIk2;
        }
        this.mIsEffectLoaded = true;
        updateAudioState();
    }

    public void onEffectReleased() {
        if (this.mIsEffectLoaded) {
            this.mIsEffectLoaded = false;
            this.mAssetsDirectory = null;
            updateAudioState();
            C29956DIk dIk = this.mAudioPlayer;
            this.mAudioPlayer = null;
            if (dIk != null) {
                dIk.A02();
                dIk.A00.release();
            }
            C200778ie r1 = this.mAudioDecoder;
            if (r1 != null) {
                synchronized (r1) {
                    r1.A01.shutdown();
                }
                this.mAudioDecoder = null;
            }
            AudioInputPreview audioInputPreview = this.mAudioInputPreview;
            if (audioInputPreview != null) {
                audioInputPreview.close();
                this.mAudioInputPreview = null;
            }
            this.mMicrophoneSinkAvailable.set(false);
            MicrophoneSink microphoneSink = this.mMicrophoneSink;
            if (microphoneSink != null) {
                microphoneSink.mHybridData.resetNative();
                this.mMicrophoneSink = null;
            }
        }
    }

    public boolean onInputDataAvailable(byte[] bArr, int i, int i2) {
        MicrophoneSink microphoneSink;
        if (!this.mIsRecording) {
            return false;
        }
        if (this.mAudioServiceController == null) {
            AnonymousClass0DB.A04(TAG, "Service is already destroyed but buffers are still being pumped through");
            return false;
        } else if (i2 < 0) {
            AnonymousClass0DB.A08(TAG, "Negative buffer size for input data: %d", Integer.valueOf(i2));
            return false;
        } else {
            if (i2 % 2 > 0) {
                AnonymousClass0DB.A08(TAG, "Odd buffer size for input data: %d", Integer.valueOf(i2));
            }
            int i3 = i2 >> 1;
            boolean z = false;
            if (this.mMicrophoneSink != null) {
                z = true;
            }
            if (z) {
                if (this.mInputSamples.length < i3) {
                    this.mInputSamples = new short[(i3 << 1)];
                }
                int i4 = i3 << 1;
                short[] sArr = this.mInputSamples;
                boolean z2 = true;
                boolean z3 = false;
                if (i4 % 2 == 0) {
                    z3 = true;
                }
                AnonymousClass0CW.A05(z3);
                int i5 = i4 >> 1;
                if (sArr.length < i5) {
                    z2 = false;
                }
                AnonymousClass0CW.A05(z2);
                ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).asShortBuffer().get(sArr, 0, i5);
                if (this.mMicrophoneSinkAvailable.get() && (microphoneSink = this.mMicrophoneSink) != null) {
                    microphoneSink.write(this.mInputSamples, i3, i);
                }
            }
            AnonymousClass0CW.A03(this.mRenderCallback, "%s > renderSamples() > mRenderCallback is null", TAG);
            if (this.mOutputSamples.length < i3) {
                this.mOutputSamples = new short[(i3 << 1)];
            }
            int readCaptureSamples = this.mAudioServiceController.readCaptureSamples(this.mOutputSamples, i3, i);
            if (readCaptureSamples == 0) {
                return false;
            }
            int i6 = readCaptureSamples << 1;
            if (this.mOutputBytes.length < i6) {
                this.mOutputBytes = new byte[(i6 << 1)];
            }
            short[] sArr2 = this.mOutputSamples;
            byte[] bArr2 = this.mOutputBytes;
            boolean z4 = false;
            if (bArr2.length >= i6) {
                z4 = true;
            }
            AnonymousClass0CW.A05(z4);
            ByteBuffer.wrap(bArr2).order(ByteOrder.nativeOrder()).asShortBuffer().put(sArr2, 0, readCaptureSamples);
            this.mRenderCallback.onSamplesReady(this.mOutputBytes, i6);
            return true;
        }
    }

    public void onServiceCreated() {
        AnonymousClass0CW.A09(!this.mIsServiceCreated, "%s > onServiceCreated() > service is already created", TAG);
        AnonymousClass0CW.A03(this.mAudioServiceController, "%s > onServiceCreated() > mAudioServiceController is null", TAG);
        this.mIsServiceCreated = true;
    }

    public void onServiceDestroyed() {
        if (this.mIsServiceCreated) {
            AnonymousClass0CW.A09(!this.mIsEffectLoaded, "%s > onServiceDestroyed() > effect is not released yet", TAG);
            this.mAudioServiceController.mHybridData.resetNative();
            this.mAudioServiceController = null;
            this.mIsServiceCreated = false;
        }
    }

    public void readAudioFile(String str, String str2) {
        AnonymousClass0CW.A03(this.mAudioDecoder, "%s > readAudioFile() > mAudioDecoder is null", TAG);
        String findAssetPath = findAssetPath(str);
        if (findAssetPath == null) {
            AnonymousClass0DB.A08(TAG, "Failed to read audio file: %s", str);
            return;
        }
        C200778ie r3 = this.mAudioDecoder;
        C200808ih r4 = new C200808ih(this, str2);
        synchronized (r3) {
            if (r3.A01.isShutdown()) {
                String A0J = AnonymousClass000.A0J("Cannot decode file ", findAssetPath, ": executor shut down");
                AnonymousClass0DB.A08(TAG, "Fail to decode audio file: %s", A0J);
            } else {
                C200768id r2 = r3.A00;
                C200798ig r1 = new C200798ig(findAssetPath, r4);
                synchronized (r2) {
                    r2.A01.add(r1);
                }
                AnonymousClass0Z9.A03(r3.A01, new C200788if(r3), 1158195203);
            }
        }
    }

    public void setMuted(boolean z) {
        this.mIsMuted = z;
        updateAudioPreviewState();
    }

    public AudioPlatformComponentHostImpl(Context context, C29958DIn dIn) {
        HybridData initHybrid = initHybrid();
        this.mHybridData = initHybrid;
        AnonymousClass0CW.A03(initHybrid, "%s > mHybridData is null", TAG);
        this.mAudioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.mDefaultSampleRate = (int) getDefaultSampleRate();
        this.mMicrophoneSinkAvailable = new AtomicBoolean(false);
        int i = this.mDefaultSampleRate;
        this.mInputSamples = new short[i];
        this.mOutputSamples = new short[i];
        this.mOutputBytes = new byte[(i << 1)];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r2.mIsCaptureEnabled == false) goto L_0x0014;
     */
    private void updateAudioState() {
        boolean z;
        updateAudioPreviewState();
        if (this.mAudioServiceController != null) {
            if (this.mIsEffectLoaded && this.mIsRecording) {
                z = true;
            }
            z = false;
            this.mAudioServiceController.setCaptureEnabled(z);
        }
    }

    public String findAssetPath(String str) {
        Class cls = TAG;
        AnonymousClass0CW.A09(!AnonymousClass1BX.A00(str), "%s > findAssetPath() > assetName is null or empty", cls);
        String str2 = this.mAssetsDirectory;
        AnonymousClass0CW.A03(str2, "%s > findAssetPath() > mAssetsDirectory is null", cls);
        String A0E = AnonymousClass000.A0E(str2, str);
        AnonymousClass0CW.A09(!AnonymousClass1BX.A00(A0E), "%s > isFilePathExistsAndValid() > path is null or empty", cls);
        if (new File(A0E).exists()) {
            return A0E;
        }
        AnonymousClass0DB.A08(cls, "File path does not exist or valid: %s", A0E);
        return null;
    }

    public int readExternalAudioStream(String str, short[] sArr, int i) {
        AnonymousClass0CW.A09(!AnonymousClass1BX.A00(str), "%s > readExternalAudioStream() > identifier is null or empty", TAG);
        C86263ok r6 = this.mExternalAudioProvider;
        if (r6 == null) {
            return 0;
        }
        int AQY = r6.A03.A00.A1J.A0O.AQY();
        int i2 = 0;
        while (i2 < i) {
            C108014l5 r1 = (C108014l5) r6.A04.poll();
            if (r1 == null) {
                break;
            } else if (r1.A00 >= AQY) {
                byte[] bArr = r1.A01;
                int min = Math.min(bArr.length >> 1, i - i2);
                ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).asShortBuffer().get(sArr, i2, min);
                i2 += min;
            }
        }
        return i2;
    }

    public void setExternalAudioProvider(C86263ok r1) {
        this.mExternalAudioProvider = r1;
    }

    public void setRenderCallback(AudioRenderCallback audioRenderCallback) {
        this.mRenderCallback = audioRenderCallback;
    }
}
