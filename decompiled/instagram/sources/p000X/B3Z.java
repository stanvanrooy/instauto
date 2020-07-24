package p000X;

import com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder;

/* renamed from: X.B3Z */
public final class B3Z implements Runnable {
    public final /* synthetic */ B9H A00;

    public B3Z(B9H b9h) {
        this.A00 = b9h;
    }

    public final void run() {
        AndroidAudioRecorder androidAudioRecorder = this.A00.A01;
        if (androidAudioRecorder.mIsRecordingAudioData.get()) {
            AndroidAudioRecorder.release(androidAudioRecorder);
            AndroidAudioRecorder.prepare(androidAudioRecorder);
            AnonymousClass0Z9.A03(androidAudioRecorder.mExecutor, new B9F(androidAudioRecorder), -770541226);
        }
    }
}
