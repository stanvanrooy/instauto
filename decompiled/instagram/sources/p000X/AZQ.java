package p000X;

import org.webrtc.audio.JavaAudioDeviceModule;

/* renamed from: X.AZQ */
public final class AZQ implements JavaAudioDeviceModule.AudioTrackErrorCallback {
    public final /* synthetic */ AZK A00;

    public final void onWebRtcAudioTrackError(String str) {
        String A05 = C06360Ot.formatString("onWebRtcAudioTrackError: %s", str);
        AnonymousClass0DB.A0D("WebRtcConnectionImpl", A05);
        C23691AYc.A00(this.A00.A00, A05);
    }

    public final void onWebRtcAudioTrackInitError(String str) {
        String A05 = C06360Ot.formatString("onWebRtcAudioTrackInitError: %s", str);
        AnonymousClass0DB.A0D("WebRtcConnectionImpl", A05);
        C23691AYc.A00(this.A00.A00, A05);
    }

    public final void onWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        String A05 = C06360Ot.formatString("onWebRtcAudioTrackStartError: (%s) %s", audioTrackStartErrorCode.name(), str);
        AnonymousClass0DB.A0D("WebRtcConnectionImpl", A05);
        C23691AYc.A00(this.A00.A00, A05);
    }

    public AZQ(AZK azk) {
        this.A00 = azk;
    }
}
