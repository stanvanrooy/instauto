package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1eD  reason: invalid class name and case insensitive filesystem */
public enum C34181eD {
    AREFFECT("ar_effect_sticker"),
    ANTI_BULLY_ENG_ONLY("anti_bully"),
    ANTI_BULLY_GLOBAL("anti_bully_speak_love"),
    BLOKS("bloks"),
    BLOKS_TAPPABLE("bloks_tappable"),
    CHAT("chat"),
    HMU("hit_me_up"),
    COUNTDOWN("countdown"),
    DISCUSSION("discussion"),
    ELECTION("election"),
    EVENT("invite"),
    FUNDRAISER("fundraiser"),
    HASHTAG("hashtag"),
    LOCATION("location"),
    MEDIA("feed_media"),
    MENTION("mention"),
    MENTION_RESHARE("mention"),
    MUSIC_OVERLAY("music"),
    MUSIC_LYRICS("music_lyric"),
    POLLING("poll"),
    PRODUCT("shopping_product"),
    PRODUCT_SHARE("product_share"),
    QUESTION("question"),
    QUESTION_RESPONSE("question_response"),
    QUIZ("quiz"),
    SLIDER("slider"),
    SMB_SUPPORT("smb_support"),
    SOUND_ON("sound_on"),
    UNKNOWN("unknown"),
    VOTER_REGISTRATION("voter_registration"),
    GUIDE("guide"),
    DPA("dpa"),
    GROUP_POLL("group_poll");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (C34181eD r3 : values()) {
            A01.put(r3.A00, r3);
        }
    }

    /* access modifiers changed from: public */
    C34181eD(String str) {
        this.A00 = str;
    }
}
