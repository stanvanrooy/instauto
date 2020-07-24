package com.instagram.model.mediatype;

import java.util.HashMap;
import java.util.Map;

public enum MediaType {
    PHOTO(1),
    VIDEO(2),
    AD_MAP(6),
    LIVE(7),
    CAROUSEL(8),
    LIVE_REPLAY(9),
    COLLECTION(10),
    AUDIO(11),
    SHOWREEL_NATIVE(12),
    IGWB_SELFIE_CAPTCHA(2);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (MediaType mediaType : values()) {
            if (mediaType != IGWB_SELFIE_CAPTCHA) {
                A01.put(Integer.valueOf(mediaType.A00), mediaType);
            }
        }
    }

    public static MediaType A00(int i) {
        return (MediaType) A01.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: public */
    MediaType(int i) {
        this.A00 = i;
    }
}
