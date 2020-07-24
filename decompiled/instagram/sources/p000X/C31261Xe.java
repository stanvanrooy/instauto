package p000X;

import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.usertagentity.UserTagEntity;

/* renamed from: X.1Xe  reason: invalid class name and case insensitive filesystem */
public final class C31261Xe {
    public static Hashtag parseFromJson(C13080hr r4) {
        Hashtag hashtag = new Hashtag();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("name".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                hashtag.A0A = str;
            } else if ("media_count".equals(A0i)) {
                hashtag.A02 = r4.A0I();
            } else if ("formatted_media_count".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                hashtag.A06 = str;
            } else if ("id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                hashtag.A07 = str;
            } else if ("profile_pic_url".equals(A0i)) {
                hashtag.A03 = C13270iF.A00(r4);
            } else if ("following".equals(A0i)) {
                hashtag.A00 = r4.A0I();
            } else if ("follow_status".equals(A0i)) {
                hashtag.A01 = r4.A0I();
            } else if ("allow_following".equals(A0i)) {
                hashtag.A0B = r4.A0O();
            } else if ("non_violating".equals(A0i)) {
                hashtag.A0F = r4.A0O();
            } else if ("is_eligible_for_survey".equals(A0i)) {
                hashtag.A0D = r4.A0O();
            } else if ("search_result_subtitle".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                hashtag.A08 = str;
            } else if ("search_subtitle".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                hashtag.A09 = str;
            } else if ("use_default_avatar".equals(A0i)) {
                hashtag.A0G = r4.A0O();
            } else if ("challenge_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                hashtag.A05 = str;
            } else if ("nominated_by_info".equals(A0i)) {
                hashtag.A04 = C50102Ez.parseFromJson(r4);
            }
            r4.A0f();
        }
        return hashtag;
    }

    public static void A00(C13460iZ r3, Hashtag hashtag) {
        r3.A0T();
        String str = hashtag.A0A;
        if (str != null) {
            r3.A0H("name", str);
        }
        r3.A0F("media_count", hashtag.A02);
        String str2 = hashtag.A06;
        if (str2 != null) {
            r3.A0H("formatted_media_count", str2);
        }
        String str3 = hashtag.A07;
        if (str3 != null) {
            r3.A0H("id", str3);
        }
        if (hashtag.A03 != null) {
            r3.A0d("profile_pic_url");
            C13270iF.A01(r3, hashtag.A03);
        }
        r3.A0F("following", hashtag.A00);
        r3.A0F("follow_status", hashtag.A01);
        r3.A0I("allow_following", hashtag.A0B);
        r3.A0I("non_violating", hashtag.A0F);
        r3.A0I("is_eligible_for_survey", hashtag.A0D);
        String str4 = hashtag.A08;
        if (str4 != null) {
            r3.A0H("search_result_subtitle", str4);
        }
        String str5 = hashtag.A09;
        if (str5 != null) {
            r3.A0H("search_subtitle", str5);
        }
        r3.A0I("use_default_avatar", hashtag.A0G);
        String str6 = hashtag.A05;
        if (str6 != null) {
            r3.A0H("challenge_id", str6);
        }
        if (hashtag.A04 != null) {
            r3.A0d("nominated_by_info");
            UserTagEntity userTagEntity = hashtag.A04;
            r3.A0T();
            String str7 = userTagEntity.A00;
            if (str7 != null) {
                r3.A0H("id", str7);
            }
            String str8 = userTagEntity.A01;
            if (str8 != null) {
                r3.A0H("username", str8);
            }
            r3.A0Q();
        }
        r3.A0Q();
    }
}
