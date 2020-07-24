package p000X;

import java.util.Locale;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.1rS  reason: invalid class name and case insensitive filesystem */
public enum C42071rS {
    UNKNOWN(0, C42081rT.UNKNOWN),
    INVALID_VIDEO_SOURCE(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, r11),
    DEAD_PLAYER_SERVICE(2001, r11),
    RESPONSE_CODE_403(2002, r11),
    RESPONSE_CODE_410(2004, r1),
    LOCAL_SOCKET_NO_CONNECTION(2007, r1),
    ERROR_IO(2009, r1),
    CODEC_INITIALIZATION_ERROR(2010, r1),
    PLAYBACK_EXCEPTION(2011, r1),
    TIGON_LIGER_ERROR(2012, r1),
    TIGON_IDLE_TIMEOUT(2013, r1),
    TIGON_CONNECTION_TIMEOUT(2014, r1),
    ZERO_AUDIO_VIDEO_BITRATE(2019, r12),
    MANIFEST_PARSE_ERROR(2021, r11),
    USE_DEFAULT_CACHE_SETTING(2023, r16),
    CANT_INITIALIZE_DRM_WITH_MANIFEST(2028, r11),
    NO_VALID_VIDEO_REPRESENTATION(2030, r12),
    DYNAMIC_MANIFEST_FOR_VOD(2031, r11),
    ALL_VALID_VIDEO_REPRESENTATION_FILTERED_OUT(2033, r11),
    RESPONSE_CODE_404(2040, r1),
    MANIFEST_MISSING_PREFETCH_SEGMENT_RANGE(2051, r12);
    
    public final int A00;
    public final C42091rU A01;

    /* access modifiers changed from: public */
    C42071rS(int i, C42081rT r7) {
        this.A00 = i;
        this.A01 = new C42091rU(r7, name().toLowerCase(Locale.US));
    }
}
