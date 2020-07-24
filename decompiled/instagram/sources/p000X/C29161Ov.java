package p000X;

import com.instagram.model.shopping.ProductMention;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Ov  reason: invalid class name and case insensitive filesystem */
public final class C29161Ov {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v14, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v28 */
    /* JADX WARNING: type inference failed for: r5v29 */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: type inference failed for: r5v31 */
    /* JADX WARNING: type inference failed for: r5v32 */
    /* JADX WARNING: type inference failed for: r5v33 */
    /* JADX WARNING: type inference failed for: r5v34 */
    /* JADX WARNING: type inference failed for: r5v35 */
    /* JADX WARNING: type inference failed for: r5v36 */
    /* JADX WARNING: type inference failed for: r5v37 */
    /* JADX WARNING: type inference failed for: r5v38 */
    /* JADX WARNING: type inference failed for: r5v39 */
    /* JADX WARNING: type inference failed for: r5v40 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static void A01(instagramComment r7, String str, C13080hr r9) {
        AnonymousClass26J r1;
        Integer num;
        String str2;
        HashMap hashMap;
        Integer num2;
        ? r5 = 0;
        if ("pk".equals(str) || "id".equals(str)) {
            if (r9.A0g() != C13120hv.VALUE_NULL) {
                r5 = r9.A0t();
            }
            r7.A0U = r5;
        } else if ("created_at".equals(str)) {
            r7.postTime = r9.A0J();
        } else if ("media_id".equals(str)) {
            if (r9.A0g() != C13120hv.VALUE_NULL) {
                r5 = r9.A0t();
            }
            r7.mediaId = r5;
        } else if ("text".equals(str)) {
            if (r9.A0g() != C13120hv.VALUE_NULL) {
                r5 = r9.A0t();
            }
            r7.commentText = r5;
        } else if ("user".equals(str) || "owner".equals(str)) {
            r7.A0D = C13300iJ.A00(r9);
        } else if ("has_translation".equals(str)) {
            r7.A0f = r9.A0O();
        } else if ("comment_like_count".equals(str)) {
            r7.A05 = r9.A0I();
        } else if ("has_liked_comment".equals(str)) {
            r7.A0b = r9.A0O();
        } else if ("did_report_as_spam".equals(str)) {
            r7.A0a = r9.A0O();
        } else if ("has_more_tail_child_comments".equals(str)) {
            r7.A0d = r9.A0O();
        } else if ("has_more_head_child_comments".equals(str)) {
            r7.A0c = r9.A0O();
        } else if ("next_max_child_cursor".equals(str)) {
            if (r9.A0g() != C13120hv.VALUE_NULL) {
                r5 = r9.A0t();
            }
            r7.A0R = r5;
        } else if ("next_min_child_cursor".equals(str)) {
            if (r9.A0g() != C13120hv.VALUE_NULL) {
                r5 = r9.A0t();
            }
            r7.A0S = r5;
        } else if ("num_head_child_comments".equals(str)) {
            r7.A06 = r9.A0I();
        } else if ("num_tail_child_comments".equals(str)) {
            r7.A07 = r9.A0I();
        } else if ("hide_username".equals(str)) {
            r7.A0g = r9.A0O();
        } else if ("type".equals(str)) {
            if (r9.A0I() != 1) {
                num2 = Constants.ZERO;
            } else {
                num2 = Constants.ONE;
            }
            r7.A0K = num2;
        } else if ("idempotence_token".equals(str)) {
            if (r9.A0g() != C13120hv.VALUE_NULL) {
                r5 = r9.A0t();
            }
            r7.uuid = r5;
        } else if ("child_comment_count".equals(str)) {
            r7.A04 = r9.A0I();
        } else if ("parent_comment_id".equals(str)) {
            if (r9.A0g() != C13120hv.VALUE_NULL) {
                r5 = r9.A0t();
            }
            r7.A0T = r5;
        } else if ("preview_child_comments".equals(str)) {
            if (r9.A0g() == C13120hv.START_ARRAY) {
                ArrayList arrayList = new ArrayList();
                while (r9.A0p() != C13120hv.END_ARRAY) {
                    instagramComment parseFromJson = parseFromJson(r9);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
                r5 = arrayList;
            }
            r7.A0Y = r5;
        } else if ("comment_index".equals(str)) {
            if (r9.A0g() != C13120hv.VALUE_NULL) {
                r5 = r9.A0t();
            }
            r7.A0O = r5;
        } else if ("background_color".equals(str)) {
            if (r9.A0g() != C13120hv.VALUE_NULL) {
                r5 = r9.A0t();
            }
            r7.A0L = r5;
        } else if ("background_color_alpha".equals(str)) {
            if (r9.A0g() != C13120hv.VALUE_NULL) {
                r5 = r9.A0t();
            }
            r7.A0M = r5;
        } else if ("text_color".equals(str)) {
            if (r9.A0g() != C13120hv.VALUE_NULL) {
                r5 = r9.A0t();
            }
            r7.A0X = r5;
        } else if ("text_size".equals(str)) {
            r7.A0J = Integer.valueOf(r9.A0I());
        } else if ("mention_user_list".equals(str)) {
            if (r9.A0g() == C13120hv.START_OBJECT) {
                hashMap = new HashMap();
                while (r9.A0p() != C13120hv.END_OBJECT) {
                    String A0t = r9.A0t();
                    r9.A0p();
                    if (r9.A0g() == C13120hv.VALUE_NULL) {
                        hashMap.put(A0t, (Object) null);
                    } else {
                        C13300iJ A00 = C13300iJ.A00(r9);
                        if (A00 != null) {
                            hashMap.put(A0t, A00);
                        }
                    }
                }
            } else {
                hashMap = null;
            }
            r7.A01 = hashMap;
        } else if ("is_new".equals(str)) {
            r7.A0E = Boolean.valueOf(r9.A0O());
        } else if ("inline_composer_display_condition".equals(str)) {
            String A0r = r9.A0r();
            Integer[] A002 = Constants.ZERO(2);
            int length = A002.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    num = Constants.ZERO;
                    break;
                }
                num = A002[i];
                if (1 - num.intValue() != 0) {
                    str2 = "never";
                } else {
                    str2 = "always";
                }
                if (str2.equals(A0r)) {
                    break;
                }
                i++;
            }
            r7.A0G = num;
        } else if ("restricted_status".equals(str)) {
            Integer valueOf = Integer.valueOf(r9.A0I());
            AnonymousClass26J[] values = AnonymousClass26J.values();
            int length2 = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    r1 = values[i2];
                    Integer num3 = r1.A00;
                    if (num3 != null && num3.equals(valueOf)) {
                        break;
                    }
                    i2++;
                } else {
                    r1 = null;
                    break;
                }
            }
            r7.A0A = r1;
        } else if ("product_mentions".equals(str)) {
            if (r9.A0g() == C13120hv.START_ARRAY) {
                ArrayList arrayList2 = new ArrayList();
                while (r9.A0p() != C13120hv.END_ARRAY) {
                    ProductMention parseFromJson2 = AnonymousClass2AC.parseFromJson(r9);
                    if (parseFromJson2 != null) {
                        arrayList2.add(parseFromJson2);
                    }
                }
                r5 = arrayList2;
            }
            r7.A02 = r5;
        } else if ("is_pinned".equals(str)) {
            r7.A0h = r9.A0O();
        }
    }

    public static instagramComment parseFromJson(C13080hr r3) {
        instagramComment r2 = new instagramComment();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            A01(r2, A0i, r3);
            r3.A0f();
        }
        r2.A00();
        return r2;
    }

    public static void A00(C13460iZ r4, instagramComment r5) {
        String str;
        r4.A0T();
        String str2 = r5.A0U;
        if (str2 != null) {
            r4.A0H("pk", str2);
        }
        r4.A0G("created_at", r5.postTime);
        String str3 = r5.mediaId;
        if (str3 != null) {
            r4.A0H("media_id", str3);
        }
        String str4 = r5.commentText;
        if (str4 != null) {
            r4.A0H("text", str4);
        }
        if (r5.A0D != null) {
            r4.A0d("user");
            AnonymousClass1O2.A03(r4, r5.A0D);
        }
        r4.A0I("has_translation", r5.A0f);
        r4.A0F("comment_like_count", r5.A05);
        r4.A0I("has_liked_comment", r5.A0b);
        r4.A0I("did_report_as_spam", r5.A0a);
        r4.A0I("has_more_tail_child_comments", r5.A0d);
        r4.A0I("has_more_head_child_comments", r5.A0c);
        String str5 = r5.A0R;
        if (str5 != null) {
            r4.A0H("next_max_child_cursor", str5);
        }
        String str6 = r5.A0S;
        if (str6 != null) {
            r4.A0H("next_min_child_cursor", str6);
        }
        r4.A0F("num_head_child_comments", r5.A06);
        r4.A0F("num_tail_child_comments", r5.A07);
        r4.A0I("hide_username", r5.A0g);
        Integer num = r5.A0K;
        if (num != null) {
            int i = 1;
            if (num.intValue() != 1) {
                i = 0;
            }
            r4.A0F("type", i);
        }
        String str7 = r5.uuid;
        if (str7 != null) {
            r4.A0H("idempotence_token", str7);
        }
        r4.A0F("child_comment_count", r5.A04);
        String str8 = r5.A0T;
        if (str8 != null) {
            r4.A0H("parent_comment_id", str8);
        }
        if (r5.A0Y != null) {
            r4.A0d("preview_child_comments");
            r4.A0S();
            for (instagramComment r0 : r5.A0Y) {
                if (r0 != null) {
                    A00(r4, r0);
                }
            }
            r4.A0P();
        }
        String str9 = r5.A0O;
        if (str9 != null) {
            r4.A0H("comment_index", str9);
        }
        String str10 = r5.A0L;
        if (str10 != null) {
            r4.A0H("background_color", str10);
        }
        String str11 = r5.A0M;
        if (str11 != null) {
            r4.A0H("background_color_alpha", str11);
        }
        String str12 = r5.A0X;
        if (str12 != null) {
            r4.A0H("text_color", str12);
        }
        Integer num2 = r5.A0J;
        if (num2 != null) {
            r4.A0F("text_size", num2.intValue());
        }
        if (r5.A01 != null) {
            r4.A0d("mention_user_list");
            r4.A0T();
            for (Map.Entry entry : r5.A01.entrySet()) {
                r4.A0d((String) entry.getKey());
                if (entry.getValue() == null) {
                    r4.A0R();
                } else {
                    AnonymousClass1O2.A03(r4, (C13300iJ) entry.getValue());
                }
            }
            r4.A0Q();
        }
        Boolean bool = r5.A0E;
        if (bool != null) {
            r4.A0I("is_new", bool.booleanValue());
        }
        Integer num3 = r5.A0G;
        if (num3 != null) {
            if (1 - num3.intValue() != 0) {
                str = "never";
            } else {
                str = "always";
            }
            r4.A0H("inline_composer_display_condition", str);
        }
        AnonymousClass26J r02 = r5.A0A;
        if (r02 != null) {
            r4.A0F("restricted_status", r02.A00.intValue());
        }
        if (r5.A02 != null) {
            r4.A0d("product_mentions");
            r4.A0S();
            for (ProductMention productMention : r5.A02) {
                if (productMention != null) {
                    r4.A0T();
                    if (productMention.A02 != null) {
                        r4.A0d("product");
                        C44861wt.A00(r4, productMention.A02);
                    }
                    r4.A0F("start_position", productMention.A00);
                    r4.A0F("text_length", productMention.A01);
                    String str13 = productMention.A04;
                    if (str13 != null) {
                        r4.A0H("product_mention_id", str13);
                    }
                    C173377aw r03 = productMention.A03;
                    if (r03 != null) {
                        r4.A0H("text_review_status", r03.A00);
                    }
                    r4.A0Q();
                }
            }
            r4.A0P();
        }
        r4.A0I("is_pinned", r5.A0h);
        r4.A0Q();
    }
}
