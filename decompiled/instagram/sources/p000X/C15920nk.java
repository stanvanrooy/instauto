package p000X;

import org.webrtc.MediaStreamTrack;

/* renamed from: X.0nk  reason: invalid class name and case insensitive filesystem */
public enum C15920nk {
    Undefined("undefined"),
    Video(MediaStreamTrack.VIDEO_TRACK_KIND),
    Image("image"),
    Other("other"),
    API("api"),
    CriticalAPI("critical-api"),
    MediaUpload("media-upload"),
    Analytics("analytic");
    
    public final String A00;

    /* access modifiers changed from: public */
    C15920nk(String str) {
        this.A00 = str;
    }
}
