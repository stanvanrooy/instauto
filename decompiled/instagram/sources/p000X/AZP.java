package p000X;

import org.webrtc.audio.JavaAudioDeviceModule;

/* renamed from: X.AZP */
public final class AZP implements JavaAudioDeviceModule.AudioRecordErrorCallback {
    public final /* synthetic */ AZK A00;

    public final void onWebRtcAudioRecordError(String str) {
        String A05 = C06360Ot.formatString("onWebRtcAudioRecordError: %s", str);
        AnonymousClass0DB.A0D("WebRtcConnectionImpl", A05);
        C23691AYc.A00(this.A00.A00, A05);
    }

    public final void onWebRtcAudioRecordInitError(String str) {
        String A05 = C06360Ot.formatString("onWebRtcAudioRecordInitError: %s", str);
        AnonymousClass0DB.A0D("WebRtcConnectionImpl", A05);
        C23691AYc.A00(this.A00.A00, A05);
    }

    public final void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        String A05 = C06360Ot.formatString("onWebRtcAudioRecordStartError: %s", str);
        AnonymousClass0DB.A0D("WebRtcConnectionImpl", A05);
        C23691AYc.A00(this.A00.A00, A05);
    }

    public AZP(AZK azk) {
        this.A00 = azk;
    }
}
