package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1ex  reason: invalid class name and case insensitive filesystem */
public enum C34571ex {
    UNSET("unset"),
    POST_CAPTURE_STICKER("post_capture_sticker"),
    MUSIC_CAMERA_FORMAT("music_camera_format"),
    CLIPS_CAMERA_FORMAT("clips_camera_format"),
    CLIPS_CAMERA_FORMAT_V2("clips_camera_format_v2"),
    QUESTION_RESPONSE("question_response"),
    QUESTION_RESPONSE_RESHARE("question_response_reshare"),
    MENTION_RESHARE("mention_reshare"),
    MEMORY_RESHARE("memory_reshare"),
    MUSIC_AR_EFFECT("music_ar_effect"),
    MUSIC_AR_EFFECT_DEMO("music_ar_effect_demo");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (C34571ex r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C34571ex(String str) {
        this.A00 = str;
    }

    public final String A00() {
        switch (ordinal()) {
            case 1:
                return "story_camera_music_overlay_post_capture";
            case 2:
                return "story_camera_music_overlay_pre_capture";
            case 3:
                return "story_camera_clips";
            case 4:
                return "story_camera_clips_v2";
            case 5:
                return "question_sticker_reply_with_music";
            case 6:
                return "question_sticker_music_response_share";
            case 7:
                return "music_mention_share";
            case 8:
                return "music_memory_reshare";
            case 9:
                return "story_camera_music_effect";
            case 10:
                return "story_camera_music_effects_demo";
            default:
                AnonymousClass0QD.A02("MusicProduct", "Unset MusicProduct.");
                return "story_camera_music_overlay_post_capture";
        }
    }

    public final boolean A01() {
        switch (ordinal()) {
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            default:
                return false;
        }
    }
}
