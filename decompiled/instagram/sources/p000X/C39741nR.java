package p000X;

import java.util.HashMap;

/* renamed from: X.1nR  reason: invalid class name and case insensitive filesystem */
public final class C39741nR {
    public static final HashMap A01;
    public volatile C30791DkK A00;

    static {
        HashMap hashMap = new HashMap();
        A01 = hashMap;
        hashMap.put(C39751nS.QUALITY_SUMMARY, "quality_summary");
        HashMap hashMap2 = A01;
        hashMap2.put(C39751nS.SEGMENT_DOWNLOADED, "live_video_segment_download");
        hashMap2.put(C39751nS.FRAME_DOWNLOADED, "live_video_segment_download");
        hashMap2.put(C39751nS.FRAME_DISPLAYED, "live_video_frame_displayed");
        hashMap2.put(C39751nS.CUSTOM_LIVE_TRACE, "live_video_custom_live_trace");
        hashMap2.put(C39751nS.PLAYER_WARNING, "player_warning");
        hashMap2.put(C39751nS.MANIFEST_MISALIGNED, "manifest_misaligned");
    }
}
