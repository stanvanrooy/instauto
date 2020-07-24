package com.facebook.mediastreaming.opt.source.audio;

import android.media.AudioRecord;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import p000X.AVM;
import p000X.AW8;
import p000X.AnonymousClass0CQ;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Y1;
import p000X.B9K;

public class AndroidAudioRecorder implements AndroidAudioInput {
    public static final Class TAG = AndroidAudioRecorder.class;
    public Pair mAudioRecorderWithSize;
    public final int mBufferSize;
    public final boolean mDelayOnSendingMuteData;
    public final Executor mExecutor;
    public volatile AndroidAudioInputHost mHost;
    public final AtomicBoolean mIsRecordingAudioData = new AtomicBoolean(false);
    public final AtomicBoolean mIsStreamingAudioData = new AtomicBoolean(false);
    public AVM mMonotonicClock;
    public ByteBuffer mMuteData;
    public final AtomicBoolean mMuteOn = new AtomicBoolean(false);
    public boolean mRecreateOnFailedRead;
    public final boolean mSendMuteOnReadErrors;
    public final int mStartRecordingRetries;
    public Thread mThread;
    public final boolean mUseAudioPriorityThread;

    public AndroidAudioRecorder(AVM avm, boolean z, boolean z2, int i, boolean z3, boolean z4, AW8 aw8) {
        this.mMonotonicClock = avm;
        this.mSendMuteOnReadErrors = true;
        this.mDelayOnSendingMuteData = true;
        this.mStartRecordingRetries = Math.max(1, 2);
        this.mRecreateOnFailedRead = true;
        this.mBufferSize = 2048;
        this.mUseAudioPriorityThread = true;
        this.mExecutor = Executors.newSingleThreadExecutor(new AnonymousClass0CQ("AudioRecorder"));
    }

    public static native double calculateVolume(Object obj, int i);

    static {
        AnonymousClass0Y1.A08("mediastreaming");
    }

    public static void prepare(AndroidAudioRecorder androidAudioRecorder) {
        Pair pair;
        AudioRecord audioRecord;
        if (androidAudioRecorder.mAudioRecorderWithSize == null) {
            try {
                int i = B9K.A01.get();
                int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
                if (minBufferSize <= 0) {
                    minBufferSize = 4096;
                }
                int i2 = 0;
                int[] iArr = {i, i / 10, minBufferSize << 1, minBufferSize};
                while (true) {
                    if (i2 >= 4) {
                        break;
                    }
                    int max = Math.max(iArr[i2], minBufferSize);
                    try {
                        audioRecord = new AudioRecord(1, 44100, 16, 2, max);
                        if (audioRecord.getState() != 1) {
                            audioRecord.release();
                            audioRecord = null;
                        }
                    } catch (IllegalArgumentException e) {
                        AnonymousClass0DB.A05(B9K.A00, "Failed attempt to create audio record", e);
                    }
                    if (audioRecord == null) {
                        if (max == minBufferSize) {
                            break;
                        }
                        i2++;
                    } else {
                        B9K.A01.set(max);
                        B9K.A02.addAndGet(1);
                        pair = new Pair(audioRecord, Integer.valueOf(max));
                        break;
                    }
                }
                pair = null;
                androidAudioRecorder.mAudioRecorderWithSize = pair;
            } catch (IllegalArgumentException e2) {
                AnonymousClass0DB.A0B(TAG, e2, "MicrophoneSetup.openMic failed refCount %d", Integer.valueOf(B9K.A02.get()));
            }
        }
    }

    public static void release(AndroidAudioRecorder androidAudioRecorder) {
        androidAudioRecorder.mIsRecordingAudioData.set(false);
        Thread thread = androidAudioRecorder.mThread;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                AnonymousClass0DB.A0B(TAG, e, "Ran into an exception while draining audio", new Object[0]);
            }
        }
        androidAudioRecorder.mThread = null;
        Pair pair = androidAudioRecorder.mAudioRecorderWithSize;
        if (pair != null) {
            AudioRecord audioRecord = (AudioRecord) pair.first;
            if (audioRecord != null) {
                audioRecord.release();
                B9K.A02.addAndGet(-1);
            }
            androidAudioRecorder.mAudioRecorderWithSize = null;
        }
    }

    public void startAudioStreaming() {
        this.mIsStreamingAudioData.set(true);
    }

    public void stopAudioStreaming() {
        this.mIsStreamingAudioData.set(false);
    }

    public void setHost(AndroidAudioInputHost androidAudioInputHost) {
        this.mHost = androidAudioInputHost;
    }
}
