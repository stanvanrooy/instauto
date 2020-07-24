package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1kb  reason: invalid class name and case insensitive filesystem */
public final class C38021kb {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: type inference failed for: r3v31 */
    /* JADX WARNING: type inference failed for: r3v32 */
    /* JADX WARNING: type inference failed for: r3v33 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C38031kc parseFromJson(C13080hr r4) {
        C38051ke r0;
        C38031kc r2 = new C38031kc();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r3 = 0;
            if ("id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r2.A0I = r3;
            } else if ("cover_frame_url".equals(A0i)) {
                r2.A06 = C13270iF.A00(r4);
            } else if ("dash_playback_url".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r2.A0M = r3;
            } else if ("dash_abr_playback_url".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r2.A0K = r3;
            } else if ("dash_live_predictive_playback_url".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r2.A0N = r3;
            } else if ("dash_manifest".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r2.A0L = r3;
            } else if ("broadcast_owner".equals(A0i)) {
                r2.A0C = C13300iJ.A00(r4);
            } else if ("viewer_count".equals(A0i)) {
                r2.A03 = r4.A0I();
            } else if ("total_unique_viewer_count".equals(A0i)) {
                r2.A02 = r4.A0I();
            } else if ("published_time".equals(A0i)) {
                r2.A05 = r4.A0J();
            } else if ("expire_at".equals(A0i)) {
                r2.A04 = r4.A0J();
            } else if ("muted".equals(A0i)) {
                r2.A0E = Boolean.valueOf(r4.A0O());
            } else if ("media_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r2.A0P = r3;
            } else if ("broadcast_status".equals(A0i)) {
                String A0r = r4.A0r();
                if (A0r != null) {
                    r0 = (C38051ke) C38051ke.A01.get(A0r.toLowerCase());
                } else {
                    r0 = null;
                }
                if (r0 == null) {
                    r0 = C38051ke.UNKNOWN;
                }
                r2.A08 = r0;
            } else if ("ranked_position".equals(A0i)) {
                r2.A0G = Long.valueOf(r4.A0J());
            } else if ("seen_ranked_position".equals(A0i)) {
                r2.A0H = Long.valueOf(r4.A0J());
            } else if ("organic_tracking_token".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r2.A0Q = r3;
            } else if ("encoding_tag".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r2.A0O = r3;
            } else if ("cobroadcasters".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    HashSet hashSet = new HashSet();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C13300iJ A00 = C13300iJ.A00(r4);
                        if (A00 != null) {
                            hashSet.add(A00);
                        }
                    }
                    r3 = hashSet;
                }
                r2.A0V = r3;
            } else if ("question_pk".equals(A0i)) {
                r2.A0F = Long.valueOf(r4.A0J());
            } else if ("simulcast_fb_broadcast_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r2.A0S = r3;
            } else if ("internal_only".equals(A0i)) {
                r2.A0X = r4.A0O();
            } else if ("number_of_qualities".equals(A0i)) {
                r2.A01 = r4.A0I();
            } else if ("copyright_violation".equals(A0i)) {
                r2.A0W = r4.A0O();
            } else if ("is_player_live_trace_enabled".equals(A0i)) {
                r2.A0Z = r4.A0O();
            } else if ("hide_from_feed_unit".equals(A0i)) {
                r2.A0D = Boolean.valueOf(r4.A0O());
            } else if ("gating".equals(A0i)) {
                r2.A07 = C38081kh.parseFromJson(r4);
            } else if ("charity_info".equals(A0i)) {
                r2.A09 = C49122Av.parseFromJson(r4);
            } else if ("user_pay_viewer_config".equals(A0i)) {
                r2.A0B = C49112Au.parseFromJson(r4);
            } else if ("shopping_viewer_config".equals(A0i)) {
                r2.A0A = C49102At.parseFromJson(r4);
            } else if ("broadcast_message".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r2.A0J = r3;
            } else {
                AnonymousClass1N4.A01(r2, A0i, r4);
            }
            r4.A0f();
        }
        return r2;
    }

    public static void A00(C13460iZ r8, C38031kc r9) {
        r8.A0T();
        String str = r9.A0I;
        if (str != null) {
            r8.A0H("id", str);
        }
        if (r9.A06 != null) {
            r8.A0d("cover_frame_url");
            C13270iF.A01(r8, r9.A06);
        }
        String str2 = r9.A0M;
        if (str2 != null) {
            r8.A0H("dash_playback_url", str2);
        }
        String str3 = r9.A0K;
        if (str3 != null) {
            r8.A0H("dash_abr_playback_url", str3);
        }
        String str4 = r9.A0N;
        if (str4 != null) {
            r8.A0H("dash_live_predictive_playback_url", str4);
        }
        String str5 = r9.A0L;
        if (str5 != null) {
            r8.A0H("dash_manifest", str5);
        }
        if (r9.A0C != null) {
            r8.A0d("broadcast_owner");
            AnonymousClass1O2.A03(r8, r9.A0C);
        }
        r8.A0F("viewer_count", r9.A03);
        r8.A0F("total_unique_viewer_count", r9.A02);
        r8.A0G("published_time", r9.A05);
        r8.A0G("expire_at", r9.A04);
        Boolean bool = r9.A0E;
        if (bool != null) {
            r8.A0I("muted", bool.booleanValue());
        }
        String str6 = r9.A0P;
        if (str6 != null) {
            r8.A0H("media_id", str6);
        }
        C38051ke r0 = r9.A08;
        if (r0 != null) {
            r8.A0H("broadcast_status", r0.toString());
        }
        Long l = r9.A0G;
        if (l != null) {
            r8.A0G("ranked_position", l.longValue());
        }
        Long l2 = r9.A0H;
        if (l2 != null) {
            r8.A0G("seen_ranked_position", l2.longValue());
        }
        String str7 = r9.A0Q;
        if (str7 != null) {
            r8.A0H("organic_tracking_token", str7);
        }
        String str8 = r9.A0O;
        if (str8 != null) {
            r8.A0H("encoding_tag", str8);
        }
        if (r9.A0V != null) {
            r8.A0d("cobroadcasters");
            r8.A0S();
            for (C13300iJ r02 : r9.A0V) {
                if (r02 != null) {
                    AnonymousClass1O2.A03(r8, r02);
                }
            }
            r8.A0P();
        }
        Long l3 = r9.A0F;
        if (l3 != null) {
            r8.A0G("question_pk", l3.longValue());
        }
        String str9 = r9.A0S;
        if (str9 != null) {
            r8.A0H("simulcast_fb_broadcast_id", str9);
        }
        r8.A0I("internal_only", r9.A0X);
        r8.A0F("number_of_qualities", r9.A01);
        r8.A0I("copyright_violation", r9.A0W);
        r8.A0I("is_player_live_trace_enabled", r9.A0Z);
        Boolean bool2 = r9.A0D;
        if (bool2 != null) {
            r8.A0I("hide_from_feed_unit", bool2.booleanValue());
        }
        if (r9.A07 != null) {
            r8.A0d("gating");
            C38081kh.A00(r8, r9.A07);
        }
        if (r9.A09 != null) {
            r8.A0d("charity_info");
            C49122Av.A00(r8, r9.A09);
        }
        if (r9.A0B != null) {
            r8.A0d("user_pay_viewer_config");
            C23495AOr aOr = r9.A0B;
            r8.A0T();
            if (aOr.A01 != null) {
                r8.A0d("pay_config");
                APT apt = aOr.A01;
                r8.A0T();
                String str10 = apt.A03;
                if (str10 == null) {
                    C13150hy.A03("payeeId");
                }
                if (str10 != null) {
                    String str11 = apt.A03;
                    if (str11 == null) {
                        C13150hy.A03("payeeId");
                    }
                    r8.A0H("payee_id", str11);
                }
                String str12 = apt.A02;
                if (str12 == null) {
                    C13150hy.A03("digitalNonConsumableProductId");
                }
                if (str12 != null) {
                    String str13 = apt.A02;
                    if (str13 == null) {
                        C13150hy.A03("digitalNonConsumableProductId");
                    }
                    r8.A0H("digital_non_consumable_product_id", str13);
                }
                List list = apt.A04;
                if (list == null) {
                    C13150hy.A03("tierInfos");
                }
                if (list != null) {
                    r8.A0d("tier_infos");
                    r8.A0S();
                    List<APS> list2 = apt.A04;
                    if (list2 == null) {
                        C13150hy.A03("tierInfos");
                    }
                    for (APS aps : list2) {
                        if (aps != null) {
                            r8.A0T();
                            if (aps.A00() != null) {
                                r8.A0H("sku", aps.A00());
                            }
                            C23334AIl aIl = aps.A00;
                            if (aIl == null) {
                                C13150hy.A03("supportTier");
                            }
                            if (aIl != null) {
                                C23334AIl aIl2 = aps.A00;
                                if (aIl2 == null) {
                                    C13150hy.A03("supportTier");
                                }
                                C13150hy.A02(aIl2, "tier");
                                r8.A0H("support_tier", aIl2.name());
                            }
                            r8.A0Q();
                        }
                    }
                    r8.A0P();
                }
                C212479Ej r1 = apt.A01;
                if (r1 == null) {
                    C13150hy.A03("pinnedRowConfig");
                }
                if (r1 != null) {
                    r8.A0d("pinned_row_config");
                    C212479Ej r6 = apt.A01;
                    if (r6 == null) {
                        C13150hy.A03("pinnedRowConfig");
                    }
                    r8.A0T();
                    String str14 = r6.A01;
                    if (str14 == null) {
                        C13150hy.A03("description");
                    }
                    if (str14 != null) {
                        String str15 = r6.A01;
                        if (str15 == null) {
                            C13150hy.A03("description");
                        }
                        r8.A0H("description", str15);
                    }
                    String str16 = r6.A00;
                    if (str16 == null) {
                        C13150hy.A03("buttonTitle");
                    }
                    if (str16 != null) {
                        String str17 = r6.A00;
                        if (str17 == null) {
                            C13150hy.A03("buttonTitle");
                        }
                        r8.A0H("button_title", str17);
                    }
                    r8.A0Q();
                }
                A53 a53 = apt.A00;
                if (a53 == null) {
                    C13150hy.A03("consumptionSheetConfig");
                }
                if (a53 != null) {
                    r8.A0d("consumption_sheet_config");
                    A53 a532 = apt.A00;
                    if (a532 == null) {
                        C13150hy.A03("consumptionSheetConfig");
                    }
                    r8.A0T();
                    String str18 = a532.A02;
                    if (str18 == null) {
                        C13150hy.A03(DialogModule.KEY_TITLE);
                    }
                    if (str18 != null) {
                        String str19 = a532.A02;
                        if (str19 == null) {
                            C13150hy.A03(DialogModule.KEY_TITLE);
                        }
                        r8.A0H(DialogModule.KEY_TITLE, str19);
                    }
                    String str20 = a532.A00;
                    if (str20 == null) {
                        C13150hy.A03("description");
                    }
                    if (str20 != null) {
                        String str21 = a532.A00;
                        if (str21 == null) {
                            C13150hy.A03("description");
                        }
                        r8.A0H("description", str21);
                    }
                    String str22 = a532.A01;
                    if (str22 == null) {
                        C13150hy.A03("privacyDisclaimer");
                    }
                    if (str22 != null) {
                        String str23 = a532.A01;
                        if (str23 == null) {
                            C13150hy.A03("privacyDisclaimer");
                        }
                        r8.A0H("privacy_disclaimer", str23);
                    }
                    r8.A0Q();
                }
                r8.A0Q();
            }
            C23334AIl aIl3 = aOr.A00;
            if (aIl3 != null) {
                C13150hy.A02(aIl3, "tier");
                r8.A0H("viewer_support_tier", aIl3.name());
            }
            r8.A0Q();
        }
        if (r9.A0A != null) {
            r8.A0d("shopping_viewer_config");
            AnonymousClass7LM r2 = r9.A0A;
            r8.A0T();
            r8.A0I("shopping_enabled", r2.A02);
            String str24 = r2.A01;
            if (str24 == null) {
                C13150hy.A03("merchantUsername");
            }
            if (str24 != null) {
                String str25 = r2.A01;
                if (str25 == null) {
                    C13150hy.A03("merchantUsername");
                }
                r8.A0H("merchant_username", str25);
            }
            if (r2.A00 != null) {
                r8.A0d("active_pin");
                C219239ci r3 = r2.A00;
                r8.A0T();
                C219329cr r12 = r3.A01;
                if (r12 == null) {
                    C13150hy.A03("compoundProductId");
                }
                if (r12 != null) {
                    r8.A0d("compound_product_id");
                    C219329cr r5 = r3.A01;
                    if (r5 == null) {
                        C13150hy.A03("compoundProductId");
                    }
                    r8.A0T();
                    String str26 = r5.A01;
                    if (str26 == null) {
                        C13150hy.A03("productId");
                    }
                    if (str26 != null) {
                        String str27 = r5.A01;
                        if (str27 == null) {
                            C13150hy.A03("productId");
                        }
                        r8.A0H("product_id", str27);
                    }
                    String str28 = r5.A00;
                    if (str28 == null) {
                        C13150hy.A03("merchantId");
                    }
                    if (str28 != null) {
                        String str29 = r5.A00;
                        if (str29 == null) {
                            C13150hy.A03("merchantId");
                        }
                        r8.A0H("merchant_id", str29);
                    }
                    r8.A0Q();
                }
                String str30 = r3.A03;
                String str31 = str30;
                if (str30 != null) {
                    r8.A0H("caption", str31);
                }
                String str32 = r3.A05;
                String str33 = str32;
                if (str32 != null) {
                    r8.A0H("subcaption", str33);
                }
                Integer num = r3.A02;
                Integer num2 = num;
                if (num != null) {
                    C13150hy.A02(num2, "ctaType");
                    r8.A0H("cta_type", C219299co.A00(num2));
                }
                if (r3.A00 != null) {
                    r8.A0d("product_details");
                    C44861wt.A00(r8, r3.A00);
                }
                String str34 = r3.A04;
                String str35 = str34;
                if (str34 != null) {
                    r8.A0H("product_payload", str35);
                }
                r8.A0Q();
            }
            r8.A0Q();
        }
        String str36 = r9.A0J;
        if (str36 != null) {
            r8.A0H("broadcast_message", str36);
        }
        AnonymousClass1N4.A00(r8, r9);
        r8.A0Q();
    }
}
