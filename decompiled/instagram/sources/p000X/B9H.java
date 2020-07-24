package p000X;

import android.media.AudioRecord;
import android.os.Process;
import android.util.Pair;
import com.facebook.mediastreaming.opt.source.audio.AndroidAudioInputHost;
import com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder;
import java.nio.ByteBuffer;

/* renamed from: X.B9H */
public final class B9H implements Runnable {
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ AndroidAudioRecorder A01;

    public B9H(AndroidAudioRecorder androidAudioRecorder, Pair pair) {
        this.A01 = androidAudioRecorder;
        this.A00 = pair;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012b, code lost:
        if ((r8.A06.now() - r8.A03) > com.instagram.arlink.fragment.ArLinkScanControllerImpl.ERROR_DELAY_MS) goto L_0x012d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015b A[Catch:{ Exception -> 0x018d }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015f A[SYNTHETIC, Splitter:B:70:0x015f] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015e A[SYNTHETIC] */
    public final void run() {
        ByteBuffer byteBuffer;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.A01.mUseAudioPriorityThread) {
            Process.setThreadPriority(-19);
        }
        try {
            AndroidAudioRecorder androidAudioRecorder = this.A01;
            B9I b9i = new B9I(androidAudioRecorder.mMonotonicClock, androidAudioRecorder.mRecreateOnFailedRead);
            int min = Math.min(2048, ((Integer) this.A00.second).intValue());
            int i = (min * 1000) / 88200;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(min);
            while (this.A01.mIsRecordingAudioData.get()) {
                AndroidAudioInputHost androidAudioInputHost = this.A01.mHost;
                boolean z5 = this.A01.mIsStreamingAudioData.get();
                if (androidAudioInputHost == null || !z5) {
                    byteBuffer = allocateDirect;
                } else {
                    byteBuffer = androidAudioInputHost.acquireAudioSampleBuffer();
                }
                long now = this.A01.mMonotonicClock.now();
                int read = ((AudioRecord) this.A00.first).read(byteBuffer, Math.min(min, byteBuffer.remaining()));
                if (!z5) {
                    b9i.A02 = b9i.A06.now();
                    b9i.A00 = 0;
                    b9i.A01 = 0;
                    b9i.A03 = 0;
                } else {
                    int i2 = 1;
                    b9i.A00++;
                    int i3 = b9i.A01;
                    if (read >= 0) {
                        i2 = 0;
                    }
                    b9i.A01 = i3 + i2;
                    long now2 = b9i.A06.now();
                    if (read > 0) {
                        b9i.A02 = now2;
                    }
                    boolean z6 = false;
                    if (b9i.A06.now() - b9i.A02 > 3000) {
                        z6 = true;
                    }
                    if (this.A01.mMuteOn.get() || (this.A01.mSendMuteOnReadErrors && (z6 || read < 0))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        AndroidAudioRecorder androidAudioRecorder2 = this.A01;
                        if (androidAudioRecorder2.mMuteData == null) {
                            androidAudioRecorder2.mMuteData = ByteBuffer.allocateDirect(2048);
                        }
                        byteBuffer.clear();
                        while (byteBuffer.hasRemaining()) {
                            this.A01.mMuteData.limit(Math.min(byteBuffer.remaining(), this.A01.mMuteData.capacity()));
                            byteBuffer.put(this.A01.mMuteData);
                            this.A01.mMuteData.clear();
                        }
                        byteBuffer.flip();
                    }
                    if (androidAudioInputHost != null) {
                        androidAudioInputHost.audioSampleBufferFilled(read, false);
                    }
                    if (z6) {
                        AudioRecord audioRecord = (AudioRecord) this.A00.first;
                        try {
                            if (b9i.A03 != 0) {
                                z3 = true;
                            }
                            z3 = false;
                            if (!z3 && audioRecord.getRecordingState() == 1) {
                                b9i.A03 = b9i.A06.now();
                                boolean z7 = !b9i.A04;
                                b9i.A04 = z7;
                                if (!z7) {
                                    z4 = true;
                                    if (!b9i.A05) {
                                    }
                                    if (!z4) {
                                        z2 = false;
                                        if (!z2) {
                                            AnonymousClass0Z9.A03(this.A01.mExecutor, new B3Z(this), 42249928);
                                            return;
                                        }
                                    } else {
                                        audioRecord.startRecording();
                                    }
                                }
                                z4 = false;
                                if (!z4) {
                                }
                            }
                        } catch (IllegalStateException e) {
                            AnonymousClass0DB.A0B(AndroidAudioRecorder.TAG, e, "startRecording while recorder is in use", new Object[0]);
                        }
                        z2 = true;
                        if (!z2) {
                        }
                    }
                    AndroidAudioRecorder androidAudioRecorder3 = this.A01;
                    if (androidAudioRecorder3.mDelayOnSendingMuteData && z) {
                        long now3 = androidAudioRecorder3.mMonotonicClock.now() - now;
                        long j = (long) i;
                        if (now3 < j) {
                            Thread.sleep(j - now3);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            AnonymousClass0DB.A0B(AndroidAudioRecorder.TAG, e2, "AudioThread error", new Object[0]);
            AndroidAudioInputHost androidAudioInputHost2 = this.A01.mHost;
            if (androidAudioInputHost2 != null) {
                androidAudioInputHost2.onAudioRecordingFailed(e2);
            }
        }
    }
}
