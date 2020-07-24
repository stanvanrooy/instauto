package com.instagram.pendingmedia.model.constants;

import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum ShareType {
    FOLLOWERS_SHARE,
    DIRECT_SHARE,
    REEL_SHARE(true),
    DIRECT_STORY_SHARE(false),
    DIRECT_STORY_SHARE_DRAFT(false),
    REEL_SHARE_AND_DIRECT_STORY_SHARE(true),
    NAMETAG_SELFIE,
    UNKNOWN,
    IGTV,
    IGTV_REACTION,
    COWATCH_LOCAL,
    GROUP_REEL_SHARE(true),
    ARCHIVE(false),
    CLIPS,
    POST_LIVE_IGTV,
    POST_LIVE_IGTV_COVER_PHOTO,
    IGWB_SELFIE_CAPTCHA,
    INVALID;
    
    public static final EnumSet A02 = null;
    public static final Set A03 = null;
    public final boolean A00;
    public final boolean A01;

    /* access modifiers changed from: public */
    static {
        int i;
        HashSet hashSet = new HashSet();
        for (ShareType shareType : values()) {
            hashSet.add(shareType.toString());
        }
        A03 = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        for (ShareType shareType2 : values()) {
            if (shareType2.A00) {
                hashSet2.add(shareType2);
            }
        }
        A02 = EnumSet.copyOf(hashSet2);
    }

    /* access modifiers changed from: public */
    ShareType(boolean z) {
        this.A01 = true;
        this.A00 = z;
    }
}
