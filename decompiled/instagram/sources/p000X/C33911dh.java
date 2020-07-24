package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.feed.media.Media__JsonHelper;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.venue.Venue;
import java.util.ArrayList;

/* renamed from: X.1dh  reason: invalid class name and case insensitive filesystem */
public final class C33911dh {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v22, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: type inference failed for: r3v31 */
    /* JADX WARNING: type inference failed for: r3v32 */
    /* JADX WARNING: type inference failed for: r3v33 */
    /* JADX WARNING: type inference failed for: r3v34 */
    /* JADX WARNING: type inference failed for: r3v35 */
    /* JADX WARNING: type inference failed for: r3v36 */
    /* JADX WARNING: type inference failed for: r3v37 */
    /* JADX WARNING: type inference failed for: r3v38 */
    /* JADX WARNING: type inference failed for: r3v39 */
    /* JADX WARNING: type inference failed for: r3v40 */
    /* JADX WARNING: type inference failed for: r3v41 */
    /* JADX WARNING: type inference failed for: r3v42 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C33971dn parseFromJson(C13080hr r6) {
        String str;
        ArrayList arrayList;
        String A0t;
        C33971dn r1 = new C33971dn();
        if (r6.A0g() != C13120hv.START_OBJECT) {
            r6.A0f();
            return null;
        }
        while (r6.A0p() != C13120hv.END_OBJECT) {
            String A0i = r6.A0i();
            r6.A0p();
            ? r3 = 0;
            if ("id".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r6.A0t();
                }
                r1.A0b = r3;
            } else if ("user".equals(A0i)) {
                r1.A0N = C13300iJ.A00(r6);
            } else if ("owner".equals(A0i)) {
                r1.A0I = C44341w0.parseFromJson(r6);
            } else if ("group_thread_info".equals(A0i)) {
                r1.A0H = AnonymousClass2AP.parseFromJson(r6);
            } else if ("source_token".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r6.A0t();
                }
                r1.A0Z = r3;
            } else if ("latest_reel_media".equals(A0i)) {
                r1.A03 = r6.A0J();
            } else if ("seen".equals(A0i)) {
                r1.A01 = r6.A0I();
            } else if ("ranked_position".equals(A0i)) {
                r1.A0X = Long.valueOf(r6.A0J());
            } else if ("seen_ranked_position".equals(A0i)) {
                r1.A0Y = Long.valueOf(r6.A0J());
            } else if ("priority_index".equals(A0i)) {
                r1.A0Q = Integer.valueOf(r6.A0I());
            } else if ("can_reply".equals(A0i)) {
                r1.A0n = r6.A0O();
            } else if ("can_reshare".equals(A0i)) {
                r1.A0o = r6.A0O();
            } else if ("is_nux".equals(A0i)) {
                r1.A0u = r6.A0O();
            } else if ("show_nux_tooltip".equals(A0i)) {
                r1.A0v = r6.A0O();
            } else if ("promotion_id".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r6.A0t();
                }
                r1.A0e = r3;
            } else if ("media_preview".equals(A0i)) {
                r1.A04 = AnonymousClass2AO.parseFromJson(r6);
            } else if ("items".equals(A0i)) {
                if (r6.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList2 = new ArrayList();
                    while (r6.A0p() != C13120hv.END_ARRAY) {
                        AnonymousClass1NJ A00 = AnonymousClass1NJ.A00(r6);
                        if (A00 != null) {
                            arrayList2.add(A00);
                        }
                    }
                    r3 = arrayList2;
                }
                r1.A0j = r3;
            } else if ("muted".equals(A0i)) {
                r1.A0O = Boolean.valueOf(r6.A0O());
            } else if ("prefetch_count".equals(A0i)) {
                r1.A02 = r6.A0I();
            } else if ("viewer_prefetch_count".equals(A0i)) {
                r1.A0U = Integer.valueOf(r6.A0I());
            } else if ("prefetch_media_item".equals(A0i)) {
                r1.A06 = AnonymousClass1NJ.A00(r6);
            } else if ("dismiss_card".equals(A0i)) {
                r1.A07 = AnonymousClass2AN.parseFromJson(r6);
            } else if ("reel_subtitle".equals(A0i)) {
                r1.A0C = AnonymousClass2AM.parseFromJson(r6);
            } else if ("reel_toast".equals(A0i)) {
                r1.A0B = C469021l.parseFromJson(r6);
            } else if ("has_besties_media".equals(A0i)) {
                r1.A0p = r6.A0O();
            } else if ("has_pride_media".equals(A0i)) {
                r1.A0r = r6.A0O();
            } else if ("cover_media".equals(A0i)) {
                r1.A09 = AnonymousClass2AL.parseFromJson(r6);
            } else if ("unique_integer_reel_id".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r6.A0t();
                }
                r1.A0g = r3;
            } else if ("imbe_megaphone_reel_id".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r6.A0t();
                }
                r1.A0c = r3;
            } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r6.A0t();
                }
                r1.A0f = r3;
            } else if ("created_at".equals(A0i)) {
                r1.A0V = Long.valueOf(r6.A0J());
            } else if ("expiring_at".equals(A0i)) {
                r1.A0W = Long.valueOf(r6.A0J());
            } else if ("first_item_photo_url".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r6.A0t();
                }
                r1.A0a = r3;
            } else if ("media_count".equals(A0i)) {
                r1.A0T = Integer.valueOf(r6.A0I());
            } else if ("media_ids".equals(A0i)) {
                if (r6.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r6.A0p() != C13120hv.END_ARRAY) {
                        if (r6.A0g() == C13120hv.VALUE_NULL) {
                            A0t = null;
                        } else {
                            A0t = r6.A0t();
                        }
                        if (A0t != null) {
                            arrayList.add(A0t);
                        }
                    }
                } else {
                    arrayList = null;
                }
                r1.A0k = arrayList;
            } else if ("interaction_timestamp".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r6.A0t();
                }
                r1.A0d = r3;
            } else if ("ring_spec".equals(A0i)) {
                r1.A0M = C44361w2.parseFromJson(r6);
            } else if ("ring_glyph".equals(A0i)) {
                r1.A0L = C44771wj.parseFromJson(r6);
            } else if ("contains_stitched_media_blocked_by_rm".equals(A0i)) {
                r1.A0q = r6.A0O();
            } else if ("hide_from_feed_unit".equals(A0i)) {
                r1.A0s = r6.A0O();
            } else if ("reel_type".equals(A0i)) {
                r1.A0D = (AnonymousClass172) AnonymousClass172.A01.get(r6.A0r());
            } else if ("carousel_rendering_type".equals(A0i)) {
                String A0r = r6.A0r();
                Integer num = Constants.ZERO;
                if (!AnonymousClass2AK.A00(num).equals(A0r)) {
                    num = Constants.ONE;
                    if (!AnonymousClass2AK.A00(num).equals(A0r)) {
                        num = Constants.A0C;
                        if (!AnonymousClass2AK.A00(num).equals(A0r)) {
                            throw new UnsupportedOperationException("Unsupported reel carousel type");
                        }
                    }
                }
                r1.A0R = num;
            } else if ("carousel_transformation_cards".equals(A0i)) {
                if (r6.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList3 = new ArrayList();
                    while (r6.A0p() != C13120hv.END_ARRAY) {
                        String A0r2 = r6.A0r();
                        AnonymousClass29e r2 = AnonymousClass29e.ORIGINAL;
                        if (!r2.A00.equals(A0r2)) {
                            r2 = AnonymousClass29e.CAPTION;
                            if (!r2.A00.equals(A0r2)) {
                                throw new UnsupportedOperationException("Unsupported auto-generated card type");
                            }
                        }
                        arrayList3.add(r2);
                    }
                    r3 = arrayList3;
                }
                r1.A0h = r3;
            } else if ("carousel_opt_in_position".equals(A0i)) {
                r1.A00 = r6.A0I();
            } else if ("video_to_carousel_cut_secs".equals(A0i)) {
                if (r6.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList4 = new ArrayList();
                    while (r6.A0p() != C13120hv.END_ARRAY) {
                        Double valueOf = Double.valueOf(r6.A0H());
                        if (valueOf != null) {
                            arrayList4.add(valueOf);
                        }
                    }
                    r3 = arrayList4;
                }
                r1.A0l = r3;
            } else if ("video_to_carousel_cut_thumbnails".equals(A0i)) {
                if (r6.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList5 = new ArrayList();
                    while (r6.A0p() != C13120hv.END_ARRAY) {
                        ExtendedImageUrl parseFromJson = AnonymousClass0i9.parseFromJson(r6);
                        if (parseFromJson != null) {
                            arrayList5.add(parseFromJson);
                        }
                    }
                    r3 = arrayList5;
                }
                r1.A0m = r3;
            } else if ("netego_type".equals(A0i)) {
                String A0r3 = r6.A0r();
                Integer num2 = Constants.ZERO;
                if (!AnonymousClass2AJ.A00(num2).equals(A0r3)) {
                    num2 = Constants.ONE;
                    if (!AnonymousClass2AJ.A00(num2).equals(A0r3)) {
                        num2 = Constants.A0C;
                        if (!AnonymousClass2AJ.A00(num2).equals(A0r3)) {
                            throw new UnsupportedOperationException(AnonymousClass000.A0E("Unsupported story netego type: ", A0r3));
                        }
                    }
                }
                r1.A0P = num2;
            } else if ("netego_background_media".equals(A0i)) {
                r1.A05 = AnonymousClass1NJ.A00(r6);
            } else if ("simple_action".equals(A0i)) {
                r1.A0F = AnonymousClass2AI.parseFromJson(r6);
            } else if ("ad4ad".equals(A0i)) {
                r1.A0E = AnonymousClass2AH.parseFromJson(r6);
            } else if ("highlights_header_design".equals(A0i)) {
                String A0r4 = r6.A0r();
                Integer num3 = Constants.ZERO;
                if (1 - num3.intValue() != 0) {
                    str = "show_from_highlights_and_date";
                } else {
                    str = "";
                }
                if (!str.equals(A0r4)) {
                    num3 = Constants.ONE;
                }
                r1.A0S = num3;
            } else if ("location_info".equals(A0i)) {
                r1.A0K = Venue.A00(r6, true);
            } else if ("tags_info".equals(A0i)) {
                if (r6.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList6 = new ArrayList();
                    while (r6.A0p() != C13120hv.END_ARRAY) {
                        Hashtag parseFromJson2 = C31261Xe.parseFromJson(r6);
                        if (parseFromJson2 != null) {
                            arrayList6.add(parseFromJson2);
                        }
                    }
                    r3 = arrayList6;
                }
                r1.A0i = r3;
            } else if ("suggested_users".equals(A0i)) {
                r1.A0G = AnonymousClass2AG.parseFromJson(r6);
            } else if ("quick_reactions_config".equals(A0i)) {
                r1.A08 = AnonymousClass2AF.parseFromJson(r6);
            } else if ("client_gap_rules".equals(A0i)) {
                r1.A0A = AnonymousClass2AE.parseFromJson(r6);
            } else if ("ad_pod_rules".equals(A0i)) {
                r1.A0J = AnonymousClass2AD.parseFromJson(r6);
            } else if ("is_cacheable".equals(A0i)) {
                r1.A0t = r6.A0O();
            } else {
                AnonymousClass1N4.A01(r1, A0i, r6);
            }
            r6.A0f();
        }
        return r1;
    }

    public static void A00(C13460iZ r5, C33971dn r6) {
        String str;
        r5.A0T();
        String str2 = r6.A0b;
        if (str2 != null) {
            r5.A0H("id", str2);
        }
        if (r6.A0N != null) {
            r5.A0d("user");
            AnonymousClass1O2.A03(r5, r6.A0N);
        }
        if (r6.A0I != null) {
            r5.A0d("owner");
            C44341w0.A00(r5, r6.A0I);
        }
        if (r6.A0H != null) {
            r5.A0d("group_thread_info");
            C51242Jv r2 = r6.A0H;
            r5.A0T();
            String str3 = r2.A00;
            if (str3 != null) {
                r5.A0H("thread_id", str3);
            }
            String str4 = r2.A01;
            if (str4 != null) {
                r5.A0H("thread_title", str4);
            }
            if (r2.A02 != null) {
                r5.A0d("users");
                r5.A0S();
                for (C13300iJ r0 : r2.A02) {
                    if (r0 != null) {
                        AnonymousClass1O2.A03(r5, r0);
                    }
                }
                r5.A0P();
            }
            r5.A0Q();
        }
        String str5 = r6.A0Z;
        if (str5 != null) {
            r5.A0H("source_token", str5);
        }
        r5.A0G("latest_reel_media", r6.A03);
        r5.A0F("seen", r6.A01);
        Long l = r6.A0X;
        if (l != null) {
            r5.A0G("ranked_position", l.longValue());
        }
        Long l2 = r6.A0Y;
        if (l2 != null) {
            r5.A0G("seen_ranked_position", l2.longValue());
        }
        Integer num = r6.A0Q;
        if (num != null) {
            r5.A0F("priority_index", num.intValue());
        }
        r5.A0I("can_reply", r6.A0n);
        r5.A0I("can_reshare", r6.A0o);
        r5.A0I("is_nux", r6.A0u);
        r5.A0I("show_nux_tooltip", r6.A0v);
        String str6 = r6.A0e;
        if (str6 != null) {
            r5.A0H("promotion_id", str6);
        }
        if (r6.A04 != null) {
            r5.A0d("media_preview");
            AnonymousClass2AO.A00(r5, r6.A04);
        }
        if (r6.A0j != null) {
            r5.A0d("items");
            r5.A0S();
            for (AnonymousClass1NJ r02 : r6.A0j) {
                if (r02 != null) {
                    Media__JsonHelper.A01(r5, r02);
                }
            }
            r5.A0P();
        }
        Boolean bool = r6.A0O;
        if (bool != null) {
            r5.A0I("muted", bool.booleanValue());
        }
        r5.A0F("prefetch_count", r6.A02);
        Integer num2 = r6.A0U;
        if (num2 != null) {
            r5.A0F("viewer_prefetch_count", num2.intValue());
        }
        if (r6.A06 != null) {
            r5.A0d("prefetch_media_item");
            Media__JsonHelper.A01(r5, r6.A06);
        }
        if (r6.A07 != null) {
            r5.A0d("dismiss_card");
            C92873zr r22 = r6.A07;
            r5.A0T();
            String str7 = r22.A03;
            if (str7 != null) {
                r5.A0H("card_id", str7);
            }
            String str8 = r22.A08;
            if (str8 != null) {
                r5.A0H("promotion_id", str8);
            }
            if (r22.A00 != null) {
                r5.A0d("image_url");
                C13270iF.A01(r5, r22.A00);
            }
            String str9 = r22.A09;
            if (str9 != null) {
                r5.A0H(DialogModule.KEY_TITLE, str9);
            }
            String str10 = r22.A05;
            if (str10 != null) {
                r5.A0H(DialogModule.KEY_MESSAGE, str10);
            }
            String str11 = r22.A02;
            if (str11 != null) {
                r5.A0H("button_text", str11);
            }
            String str12 = r22.A04;
            if (str12 != null) {
                r5.A0H("face_filter_id", str12);
            }
            AnonymousClass2TV r03 = r22.A01;
            if (r03 != null) {
                r5.A0H("camera_target", r03.toString());
            }
            String str13 = r22.A06;
            if (str13 != null) {
                r5.A0H("primary_button_text", str13);
            }
            String str14 = r22.A07;
            if (str14 != null) {
                r5.A0H("primary_button_url", str14);
            }
            r5.A0Q();
        }
        if (r6.A0C != null) {
            r5.A0d("reel_subtitle");
            C30782Djw djw = r6.A0C;
            r5.A0T();
            String str15 = djw.A00;
            if (str15 != null) {
                r5.A0H("text", str15);
            }
            r5.A0Q();
        }
        if (r6.A0B != null) {
            r5.A0d("reel_toast");
            C469121m r23 = r6.A0B;
            r5.A0T();
            String str16 = r23.A01;
            if (str16 != null) {
                r5.A0H("text", str16);
            }
            if (r23.A00 != null) {
                r5.A0d("image_url");
                C13270iF.A01(r5, r23.A00);
            }
            r5.A0Q();
        }
        r5.A0I("has_besties_media", r6.A0p);
        r5.A0I("has_pride_media", r6.A0r);
        if (r6.A09 != null) {
            r5.A0d("cover_media");
            AnonymousClass2B1 r24 = r6.A09;
            r5.A0T();
            if (r24.A01 != null) {
                r5.A0d("cropped_image_version");
                AnonymousClass3Ab.A00(r5, r24.A01);
            }
            if (r24.A02 != null) {
                r5.A0d("full_image_version");
                AnonymousClass3Ab.A00(r5, r24.A02);
            }
            String str17 = r24.A03;
            if (str17 != null) {
                r5.A0H("media_id", str17);
            }
            String str18 = r24.A04;
            if (str18 != null) {
                r5.A0H("upload_id", str18);
            }
            if (r24.A05 != null) {
                r5.A0d("crop_rect");
                r5.A0S();
                for (Float f : r24.A05) {
                    if (f != null) {
                        r5.A0W(f.floatValue());
                    }
                }
                r5.A0P();
            }
            r5.A0Q();
        }
        String str19 = r6.A0g;
        if (str19 != null) {
            r5.A0H("unique_integer_reel_id", str19);
        }
        String str20 = r6.A0c;
        if (str20 != null) {
            r5.A0H("imbe_megaphone_reel_id", str20);
        }
        String str21 = r6.A0f;
        if (str21 != null) {
            r5.A0H(DialogModule.KEY_TITLE, str21);
        }
        Long l3 = r6.A0V;
        if (l3 != null) {
            r5.A0G("created_at", l3.longValue());
        }
        Long l4 = r6.A0W;
        if (l4 != null) {
            r5.A0G("expiring_at", l4.longValue());
        }
        String str22 = r6.A0a;
        if (str22 != null) {
            r5.A0H("first_item_photo_url", str22);
        }
        Integer num3 = r6.A0T;
        if (num3 != null) {
            r5.A0F("media_count", num3.intValue());
        }
        if (r6.A0k != null) {
            r5.A0d("media_ids");
            r5.A0S();
            for (String str23 : r6.A0k) {
                if (str23 != null) {
                    r5.A0g(str23);
                }
            }
            r5.A0P();
        }
        String str24 = r6.A0d;
        if (str24 != null) {
            r5.A0H("interaction_timestamp", str24);
        }
        if (r6.A0M != null) {
            r5.A0d("ring_spec");
            C44361w2.A00(r5, r6.A0M);
        }
        if (r6.A0L != null) {
            r5.A0d("ring_glyph");
            C44771wj.A00(r5, r6.A0L);
        }
        r5.A0I("contains_stitched_media_blocked_by_rm", r6.A0q);
        r5.A0I("hide_from_feed_unit", r6.A0s);
        AnonymousClass172 r04 = r6.A0D;
        if (r04 != null) {
            r5.A0H("reel_type", r04.A00);
        }
        Integer num4 = r6.A0R;
        if (num4 != null) {
            r5.A0H("carousel_rendering_type", AnonymousClass2AK.A00(num4));
        }
        if (r6.A0h != null) {
            r5.A0d("carousel_transformation_cards");
            r5.A0S();
            for (AnonymousClass29e r05 : r6.A0h) {
                if (r05 != null) {
                    r5.A0g(r05.A00);
                }
            }
            r5.A0P();
        }
        r5.A0F("carousel_opt_in_position", r6.A00);
        if (r6.A0l != null) {
            r5.A0d("video_to_carousel_cut_secs");
            r5.A0S();
            for (Double d : r6.A0l) {
                if (d != null) {
                    r5.A0V(d.doubleValue());
                }
            }
            r5.A0P();
        }
        if (r6.A0m != null) {
            r5.A0d("video_to_carousel_cut_thumbnails");
            r5.A0S();
            for (ExtendedImageUrl extendedImageUrl : r6.A0m) {
                if (extendedImageUrl != null) {
                    AnonymousClass0i9.A00(r5, extendedImageUrl);
                }
            }
            r5.A0P();
        }
        Integer num5 = r6.A0P;
        if (num5 != null) {
            r5.A0H("netego_type", AnonymousClass2AJ.A00(num5));
        }
        if (r6.A05 != null) {
            r5.A0d("netego_background_media");
            Media__JsonHelper.A01(r5, r6.A05);
        }
        if (r6.A0F != null) {
            r5.A0d("simple_action");
            AnonymousClass9G1 r25 = r6.A0F;
            r5.A0T();
            String str25 = r25.A04;
            if (str25 != null) {
                r5.A0H("id", str25);
            }
            String str26 = r25.A03;
            if (str26 != null) {
                r5.A0H("icon_url", str26);
            }
            String str27 = r25.A07;
            if (str27 != null) {
                r5.A0H("tracking_token", str27);
            }
            String str28 = r25.A00;
            if (str28 != null) {
                r5.A0H("action_type", str28);
            }
            String str29 = r25.A06;
            if (str29 != null) {
                r5.A0H(DialogModule.KEY_TITLE, str29);
            }
            String str30 = r25.A05;
            if (str30 != null) {
                r5.A0H(DialogModule.KEY_MESSAGE, str30);
            }
            String str31 = r25.A01;
            if (str31 != null) {
                r5.A0H("button_text", str31);
            }
            String str32 = r25.A02;
            if (str32 != null) {
                r5.A0H("extra_data_token", str32);
            }
            r5.A0Q();
        }
        if (r6.A0E != null) {
            r5.A0d("ad4ad");
            AnonymousClass9G0 r26 = r6.A0E;
            r5.A0T();
            String str33 = r26.A01;
            if (str33 != null) {
                r5.A0H("id", str33);
            }
            String str34 = r26.A04;
            if (str34 != null) {
                r5.A0H("tracking_token", str34);
            }
            String str35 = r26.A03;
            if (str35 != null) {
                r5.A0H(DialogModule.KEY_TITLE, str35);
            }
            String str36 = r26.A02;
            if (str36 != null) {
                r5.A0H(DialogModule.KEY_MESSAGE, str36);
            }
            String str37 = r26.A00;
            if (str37 != null) {
                r5.A0H("action_text", str37);
            }
            r5.A0Q();
        }
        Integer num6 = r6.A0S;
        if (num6 != null) {
            if (1 - num6.intValue() != 0) {
                str = "show_from_highlights_and_date";
            } else {
                str = "";
            }
            r5.A0H("highlights_header_design", str);
        }
        if (r6.A0K != null) {
            r5.A0d("location_info");
            AnonymousClass27Y.A00(r5, r6.A0K);
        }
        if (r6.A0i != null) {
            r5.A0d("tags_info");
            r5.A0S();
            for (Hashtag hashtag : r6.A0i) {
                if (hashtag != null) {
                    C31261Xe.A00(r5, hashtag);
                }
            }
            r5.A0P();
        }
        if (r6.A0G != null) {
            r5.A0d("suggested_users");
            AnonymousClass9G2 r27 = r6.A0G;
            r5.A0T();
            String str38 = r27.A02;
            if (str38 != null) {
                r5.A0H("id", str38);
            }
            String str39 = r27.A05;
            if (str39 != null) {
                r5.A0H("tracking_token", str39);
            }
            String str40 = r27.A04;
            if (str40 != null) {
                r5.A0H(DialogModule.KEY_TITLE, str40);
            }
            String str41 = r27.A01;
            if (str41 != null) {
                r5.A0H("action_text", str41);
            }
            r5.A0I("is_unit_dismissable", r27.A07);
            String str42 = r27.A03;
            if (str42 != null) {
                r5.A0H("ranking_algorithm", str42);
            }
            r5.A0F("duration", r27.A00);
            r5.A0I("shuffle_enabled", r27.A08);
            if (r27.A06 != null) {
                r5.A0d("suggestions");
                r5.A0S();
                for (C212789Fq r3 : r27.A06) {
                    if (r3 != null) {
                        r5.A0T();
                        r5.A0I("is_new_suggestion", r3.A05);
                        if (r3.A00 != null) {
                            r5.A0d("user");
                            AnonymousClass1O2.A03(r5, r3.A00);
                        }
                        String str43 = r3.A01;
                        if (str43 != null) {
                            r5.A0H("algorithm", str43);
                        }
                        String str44 = r3.A03;
                        if (str44 != null) {
                            r5.A0H("uuid", str44);
                        }
                        String str45 = r3.A02;
                        if (str45 != null) {
                            r5.A0H("social_context", str45);
                        }
                        r5.A0I("followed_by", r3.A04);
                        r5.A0Q();
                    }
                }
                r5.A0P();
            }
            r5.A0Q();
        }
        if (r6.A08 != null) {
            r5.A0d("quick_reactions_config");
            C30781Djv djv = r6.A08;
            r5.A0T();
            if (djv.A00 != null) {
                r5.A0d("quick_reactions_emojis");
                r5.A0S();
                for (C25661BTv bTv : djv.A00) {
                    if (bTv != null) {
                        r5.A0T();
                        String str46 = bTv.A01;
                        if (str46 != null) {
                            r5.A0H("unicode", str46);
                        }
                        String str47 = bTv.A00;
                        if (str47 != null) {
                            r5.A0H("description", str47);
                        }
                        r5.A0Q();
                    }
                }
                r5.A0P();
            }
            r5.A0Q();
        }
        if (r6.A0A != null) {
            r5.A0d("client_gap_rules");
            AnonymousClass30F r28 = r6.A0A;
            r5.A0T();
            r5.A0F("reel_gap_to_previous_ad", r28.A01);
            r5.A0F("reel_gap_to_previous_netego", r28.A02);
            r5.A0F("max_reel_gap_to_previous_item", r28.A00);
            r5.A0F("consumed_media_gap_to_previous_ad", r28.A01);
            r5.A0F("consumed_media_gap_to_previous_netego", r28.A02);
            r5.A0F("highest_position_rule", r28.A03);
            r5.A0F("min_media_gap_to_previous_item", r28.A04);
            r5.A0D("time_gap_to_previous_item_in_sec", r28.A00);
            r5.A0Q();
        }
        if (r6.A0J != null) {
            r5.A0d("ad_pod_rules");
            DjR djR = r6.A0J;
            r5.A0T();
            String str48 = djR.A01;
            if (str48 != null) {
                r5.A0H("ad_pod_id", str48);
            }
            r5.A0F("index_in_ad_pod", djR.A00);
            r5.A0Q();
        }
        r5.A0I("is_cacheable", r6.A0t);
        AnonymousClass1N4.A00(r5, r6);
        r5.A0Q();
    }
}
