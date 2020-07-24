package p000X;

import android.media.AudioRecord;
import android.util.Pair;
import com.facebook.mediastreaming.opt.source.audio.AndroidAudioInputHost;
import com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder;

/* renamed from: X.B9F */
public final class B9F implements Runnable {
    public final /* synthetic */ AndroidAudioRecorder A00;

    public B9F(AndroidAudioRecorder androidAudioRecorder) {
        this.A00 = androidAudioRecorder;
    }

    public final void run() {
        if (this.A00.mIsRecordingAudioData.get()) {
            AnonymousClass0DB.A04(AndroidAudioRecorder.TAG, "Audio recording already started!");
            return;
        }
        AndroidAudioRecorder.prepare(this.A00);
        AndroidAudioRecorder androidAudioRecorder = this.A00;
        if (androidAudioRecorder.mIsRecordingAudioData.compareAndSet(false, true)) {
            AndroidAudioRecorder.prepare(androidAudioRecorder);
            int i = 0;
            while (true) {
                if (i < androidAudioRecorder.mStartRecordingRetries) {
                    if (androidAudioRecorder.mAudioRecorderWithSize == null || i != 0) {
                        AndroidAudioRecorder.release(androidAudioRecorder);
                        androidAudioRecorder.mIsRecordingAudioData.set(true);
                        AndroidAudioRecorder.prepare(androidAudioRecorder);
                    }
                    Pair pair = androidAudioRecorder.mAudioRecorderWithSize;
                    if (pair != null) {
                        ((AudioRecord) pair.first).startRecording();
                        if (((AudioRecord) androidAudioRecorder.mAudioRecorderWithSize.first).getRecordingState() == 3) {
                            break;
                        }
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException unused) {
                        }
                        i++;
                    } else {
                        AndroidAudioRecorder.release(androidAudioRecorder);
                        AndroidAudioInputHost androidAudioInputHost = androidAudioRecorder.mHost;
                        if (androidAudioInputHost != null) {
                            androidAudioInputHost.onAudioRecordingFailed(new IllegalStateException("AudioRecorder could not be opened"));
                        }
                    }
                } else {
                    break;
                }
            }
            Pair pair2 = androidAudioRecorder.mAudioRecorderWithSize;
            if (pair2 != null) {
                Thread thread = new Thread(new B9H(androidAudioRecorder, pair2), "live_audio_recording");
                androidAudioRecorder.mThread = thread;
                thread.start();
            }
        }
    }
}
