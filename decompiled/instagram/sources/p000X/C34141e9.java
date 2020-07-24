package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.guides.intf.model.MinimalGuide;
import com.instagram.model.venue.Venue;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.1e9  reason: invalid class name and case insensitive filesystem */
public final class C34141e9 {
    public static C34151eA parseFromJson(C13080hr r5) {
        C34181eD r0;
        C34151eA r2 = new C34151eA();
        if (r5.A0g() != C13120hv.START_OBJECT) {
            r5.A0f();
            return null;
        }
        while (r5.A0p() != C13120hv.END_OBJECT) {
            String A0i = r5.A0i();
            r5.A0p();
            if ("type".equals(A0i)) {
                r2.A0Q = (C34181eD) C34181eD.A01.get(r5.A0r());
            } else if ("x".equals(A0i)) {
                r2.A03 = (float) r5.A0H();
            } else if ("y".equals(A0i)) {
                r2.A04 = (float) r5.A0H();
            } else if ("z".equals(A0i)) {
                r2.A06 = r5.A0I();
            } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0i)) {
                r2.A02 = (float) r5.A0H();
            } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0i)) {
                r2.A00 = (float) r5.A0H();
            } else if ("rotation".equals(A0i)) {
                r2.A01 = (float) r5.A0H();
            } else if ("user".equals(A0i)) {
                r2.A0X = C13300iJ.A00(r5);
            } else if ("location".equals(A0i)) {
                r2.A0I = Venue.A00(r5, true);
            } else if ("hashtag".equals(A0i)) {
                r2.A0E = C31261Xe.parseFromJson(r5);
            } else if ("is_challenge".equals(A0i)) {
                r2.A0p = r5.A0O();
            } else {
                String str = null;
                if ("challenge_nominator_user_id".equals(A0i)) {
                    if (r5.A0g() != C13120hv.VALUE_NULL) {
                        str = r5.A0t();
                    }
                    r2.A0f = str;
                } else if ("product_sticker".equals(A0i)) {
                    r2.A0H = AnonymousClass2IQ.parseFromJson(r5);
                } else if ("product_share_sticker".equals(A0i)) {
                    r2.A0G = AnonymousClass2K9.parseFromJson(r5);
                } else if ("chat_sticker".equals(A0i)) {
                    r2.A0K = AnonymousClass2K8.parseFromJson(r5);
                } else if ("hit_me_up_sticker".equals(A0i)) {
                    r2.A0B = C49412Ca.parseFromJson(r5);
                } else if ("countdown_sticker".equals(A0i)) {
                    r2.A0L = AnonymousClass24P.parseFromJson(r5);
                } else if ("discussion_sticker".equals(A0i)) {
                    r2.A0M = AnonymousClass2K7.parseFromJson(r5);
                } else if ("fundraiser_sticker".equals(A0i)) {
                    r2.A0O = AnonymousClass2K6.parseFromJson(r5);
                } else if ("smb_support_sticker".equals(A0i)) {
                    r2.A0W = AnonymousClass2K5.parseFromJson(r5);
                } else if ("poll_sticker".equals(A0i)) {
                    r2.A0R = C34251eM.parseFromJson(r5);
                } else if ("question_sticker".equals(A0i)) {
                    r2.A0T = C44741wg.parseFromJson(r5);
                } else if ("question_response_metadata".equals(A0i)) {
                    r2.A0S = AnonymousClass2K4.parseFromJson(r5);
                } else if ("quiz_sticker".equals(A0i)) {
                    r2.A0U = AnonymousClass2ES.parseFromJson(r5);
                } else if ("slider_sticker".equals(A0i)) {
                    r2.A0V = AnonymousClass23S.parseFromJson(r5);
                } else if ("story_joinable_event_sticker".equals(A0i)) {
                    r2.A0N = AnonymousClass2K3.parseFromJson(r5);
                } else if ("music_asset_info".equals(A0i)) {
                    r2.A0J = C34541eu.parseFromJson(r5);
                } else if ("election_sticker".equals(A0i)) {
                    r2.A0D = AnonymousClass2K2.parseFromJson(r5);
                } else if ("group_poll_sticker".equals(A0i)) {
                    r2.A0P = AnonymousClass2K1.parseFromJson(r5);
                } else if ("anti_bully_sticker".equals(A0i)) {
                    r2.A0Y = AnonymousClass23e.parseFromJson(r5);
                } else if ("anti_bully_global_sticker".equals(A0i)) {
                    r2.A0Z = AnonymousClass23e.parseFromJson(r5);
                } else if ("voter_registration_sticker".equals(A0i)) {
                    r2.A0b = AnonymousClass23e.parseFromJson(r5);
                } else if ("bloks_tappable_sticker".equals(A0i)) {
                    r2.A0a = AnonymousClass23e.parseFromJson(r5);
                } else if ("guide_summary".equals(A0i)) {
                    r2.A0C = AnonymousClass2K0.parseFromJson(r5);
                } else if ("layout".equals(A0i)) {
                    C51282Jz r3 = new C51282Jz();
                    r3.A00 = C51282Jz.A02(r5);
                    C51282Jz.A05(r5, r3);
                    r2.A09 = r3;
                    C51282Jz r1 = new C51282Jz();
                    r1.A00 = r3.A00;
                    C51282Jz.A05(r5, r1);
                    r2.A0A = r1;
                } else if ("id".equals(A0i)) {
                    if (r5.A0g() != C13120hv.VALUE_NULL) {
                        str = r5.A0t();
                    }
                    r2.A0i = str;
                } else if ("media_id".equals(A0i)) {
                    if (r5.A0g() != C13120hv.VALUE_NULL) {
                        str = r5.A0t();
                    }
                    r2.A0j = str;
                } else if ("carousel_share_child_media_id".equals(A0i)) {
                    if (r5.A0g() != C13120hv.VALUE_NULL) {
                        str = r5.A0t();
                    }
                    r2.A0e = str;
                } else if ("media_owner_id".equals(A0i)) {
                    if (r5.A0g() != C13120hv.VALUE_NULL) {
                        str = r5.A0t();
                    }
                    r2.A0k = str;
                } else if ("product_type".equals(A0i)) {
                    r2.A0F = (AnonymousClass1YR) AnonymousClass1YR.A01.get(r5.A0r());
                } else if ("attribution".equals(A0i)) {
                    if (r5.A0g() != C13120hv.VALUE_NULL) {
                        str = r5.A0t();
                    }
                    r2.A0d = str;
                } else if ("is_sticker".equals(A0i)) {
                    r2.A0s = r5.A0O();
                } else if ("use_custom_title".equals(A0i)) {
                    r2.A0t = r5.A0O();
                } else if ("custom_title".equals(A0i)) {
                    if (r5.A0g() != C13120hv.VALUE_NULL) {
                        str = r5.A0t();
                    }
                    r2.A0g = str;
                } else if ("display_type".equals(A0i)) {
                    if (r5.A0g() != C13120hv.VALUE_NULL) {
                        str = r5.A0t();
                    }
                    r2.A0n = str;
                } else if ("highlighted_media_ids".equals(A0i)) {
                    if (r5.A0g() != C13120hv.VALUE_NULL) {
                        str = r5.A0t();
                    }
                    r2.A0h = str;
                } else if ("is_hidden".equals(A0i)) {
                    r2.A0r = r5.A0O();
                } else if ("is_fb_sticker".equals(A0i)) {
                    r2.A0q = r5.A0O();
                } else if ("tap_state".equals(A0i)) {
                    r2.A05 = r5.A0I();
                } else if ("tap_state_str_id".equals(A0i)) {
                    if (r5.A0g() != C13120hv.VALUE_NULL) {
                        str = r5.A0t();
                    }
                    r2.A0o = str;
                }
            }
            r5.A0f();
        }
        if (r2.A0J != null) {
            r0 = C34181eD.MUSIC_OVERLAY;
        } else if (r2.A0X != null) {
            r0 = C34181eD.MENTION;
        } else if (r2.A0I != null) {
            r0 = C34181eD.LOCATION;
        } else if (r2.A0E != null) {
            r0 = C34181eD.HASHTAG;
        } else if (r2.A0H != null) {
            r0 = C34181eD.PRODUCT;
        } else if (r2.A0G != null) {
            r0 = C34181eD.PRODUCT_SHARE;
        } else if (r2.A0K != null) {
            r0 = C34181eD.CHAT;
        } else if (r2.A0B != null) {
            r0 = C34181eD.HMU;
        } else if (r2.A0L != null) {
            r0 = C34181eD.COUNTDOWN;
        } else if (r2.A0M != null) {
            r0 = C34181eD.DISCUSSION;
        } else if (r2.A0O != null) {
            r0 = C34181eD.FUNDRAISER;
        } else if (r2.A0W != null) {
            r0 = C34181eD.SMB_SUPPORT;
        } else if (r2.A0R != null) {
            r0 = C34181eD.POLLING;
        } else if (r2.A0T != null) {
            r0 = C34181eD.QUESTION;
        } else if (r2.A0S != null) {
            r0 = C34181eD.QUESTION_RESPONSE;
        } else if (r2.A0U != null) {
            r0 = C34181eD.QUIZ;
        } else if (r2.A0V != null) {
            r0 = C34181eD.SLIDER;
        } else if (r2.A0P != null) {
            r0 = C34181eD.GROUP_POLL;
        } else if (r2.A0N != null) {
            r0 = C34181eD.EVENT;
        } else if (r2.A0j != null) {
            r0 = C34181eD.MEDIA;
        } else {
            String str2 = r2.A0i;
            if (str2 != null && str2.equals("sound_on_sticker")) {
                r0 = C34181eD.SOUND_ON;
            } else if (str2 != null && str2.equals("ar_effect_sticker")) {
                r0 = C34181eD.AREFFECT;
            } else if (r2.A0D != null) {
                r0 = C34181eD.ELECTION;
            } else if (r2.A0Y != null) {
                r0 = C34181eD.ANTI_BULLY_ENG_ONLY;
            } else if (r2.A0Z != null) {
                r0 = C34181eD.ANTI_BULLY_GLOBAL;
            } else if (r2.A0b != null) {
                r0 = C34181eD.VOTER_REGISTRATION;
            } else if (r2.A0C != null) {
                r0 = C34181eD.GUIDE;
            } else if (r2.A09 != null) {
                r0 = C34181eD.BLOKS;
            } else if (r2.A0a != null) {
                r0 = C34181eD.BLOKS_TAPPABLE;
            } else {
                r0 = C34181eD.UNKNOWN;
            }
        }
        r2.A0Q = r0;
        return r2;
    }

    public static void A00(C13460iZ r5, C34151eA r6) {
        r5.A0T();
        C34181eD r0 = r6.A0Q;
        if (r0 != null) {
            r5.A0H("type", r0.A00);
        }
        r5.A0E("x", r6.A03);
        r5.A0E("y", r6.A04);
        r5.A0F("z", r6.A06);
        r5.A0E(IgReactMediaPickerNativeModule.WIDTH, r6.A02);
        r5.A0E(IgReactMediaPickerNativeModule.HEIGHT, r6.A00);
        r5.A0E("rotation", r6.A01);
        if (r6.A0X != null) {
            r5.A0d("user");
            AnonymousClass1O2.A03(r5, r6.A0X);
        }
        if (r6.A0I != null) {
            r5.A0d("location");
            AnonymousClass27Y.A00(r5, r6.A0I);
        }
        if (r6.A0E != null) {
            r5.A0d("hashtag");
            C31261Xe.A00(r5, r6.A0E);
        }
        r5.A0I("is_challenge", r6.A0p);
        String str = r6.A0f;
        if (str != null) {
            r5.A0H("challenge_nominator_user_id", str);
        }
        if (r6.A0H != null) {
            r5.A0d("product_sticker");
            C173387ax r2 = r6.A0H;
            r5.A0T();
            String str2 = r2.A02;
            if (str2 != null) {
                r5.A0H("media_id", str2);
            }
            String str3 = r2.A04;
            if (str3 != null) {
                r5.A0H(MemoryDumpUploadJob.EXTRA_USER_ID, str3);
            }
            if (r2.A00 != null) {
                r5.A0d("product_item");
                C44861wt.A00(r5, r2.A00);
            }
            String str4 = r2.A03;
            if (str4 != null) {
                r5.A0H("text", str4);
            }
            String str5 = r2.A05;
            if (str5 != null) {
                r5.A0H("vibrant_text_color", str5);
            }
            r5.A0I("is_set_reminder_button_enabled", r2.A07);
            C173377aw r02 = r2.A01;
            if (r02 != null) {
                r5.A0H("text_review_status", r02.A00);
            }
            if (r2.A06 != null) {
                r5.A0d("stickers");
                r5.A0S();
                for (AnonymousClass4WH r03 : r2.A06) {
                    if (r03 != null) {
                        r5.A0T();
                        String str6 = r03.A00;
                        if (str6 != null) {
                            r5.A0H("id", str6);
                        }
                        r5.A0Q();
                    }
                }
                r5.A0P();
            }
            r5.A0Q();
        }
        if (r6.A0G != null) {
            r5.A0d("product_share_sticker");
            C173397ay r1 = r6.A0G;
            r5.A0T();
            if (r1.A00 != null) {
                r5.A0d("product");
                C44861wt.A00(r5, r1.A00);
            }
            r5.A0Q();
        }
        if (r6.A0K != null) {
            r5.A0d("chat_sticker");
            AnonymousClass2K8.A00(r5, r6.A0K, true);
        }
        if (r6.A0B != null) {
            r5.A0d("hit_me_up_sticker");
            C49412Ca.A00(r5, r6.A0B, true);
        }
        if (r6.A0L != null) {
            r5.A0d("countdown_sticker");
            AnonymousClass24P.A00(r5, r6.A0L);
        }
        if (r6.A0M != null) {
            r5.A0d("discussion_sticker");
            AnonymousClass2K7.A00(r5, r6.A0M, true);
        }
        if (r6.A0O != null) {
            r5.A0d("fundraiser_sticker");
            AnonymousClass2K6.A00(r5, r6.A0O, true);
        }
        if (r6.A0W != null) {
            r5.A0d("smb_support_sticker");
            AnonymousClass2K5.A00(r5, r6.A0W, true);
        }
        if (r6.A0R != null) {
            r5.A0d("poll_sticker");
            C34251eM.A00(r5, r6.A0R, true);
        }
        if (r6.A0T != null) {
            r5.A0d("question_sticker");
            C44741wg.A00(r5, r6.A0T, true);
        }
        if (r6.A0S != null) {
            r5.A0d("question_response_metadata");
            AnonymousClass2K4.A00(r5, r6.A0S);
        }
        if (r6.A0U != null) {
            r5.A0d("quiz_sticker");
            AnonymousClass2ES.A00(r5, r6.A0U, true);
        }
        if (r6.A0V != null) {
            r5.A0d("slider_sticker");
            AnonymousClass23S.A00(r5, r6.A0V, true);
        }
        if (r6.A0N != null) {
            r5.A0d("story_joinable_event_sticker");
            AnonymousClass2K3.A00(r5, r6.A0N, true);
        }
        if (r6.A0J != null) {
            r5.A0d("music_asset_info");
            C34541eu.A00(r5, r6.A0J, true);
        }
        if (r6.A0D != null) {
            r5.A0d("election_sticker");
            C1894087d r22 = r6.A0D;
            r5.A0T();
            String str7 = r22.A00;
            if (str7 != null) {
                r5.A0H("find_location_text", str7);
            }
            String str8 = r22.A01;
            if (str8 != null) {
                r5.A0H("link", str8);
            }
            r5.A0Q();
        }
        if (r6.A0P != null) {
            r5.A0d("group_poll_sticker");
            AnonymousClass2K1.A00(r5, r6.A0P, true);
        }
        if (r6.A0Y != null) {
            r5.A0d("anti_bully_sticker");
            AnonymousClass23e.A00(r5, r6.A0Y);
        }
        if (r6.A0Z != null) {
            r5.A0d("anti_bully_global_sticker");
            AnonymousClass23e.A00(r5, r6.A0Z);
        }
        if (r6.A0b != null) {
            r5.A0d("voter_registration_sticker");
            AnonymousClass23e.A00(r5, r6.A0b);
        }
        if (r6.A0a != null) {
            r5.A0d("bloks_tappable_sticker");
            AnonymousClass23e.A00(r5, r6.A0a);
        }
        if (r6.A0C != null) {
            r5.A0d("guide_summary");
            MinimalGuide minimalGuide = r6.A0C;
            r5.A0T();
            String str9 = minimalGuide.A03;
            if (str9 != null) {
                r5.A0H("id", str9);
            }
            String str10 = minimalGuide.A04;
            if (str10 != null) {
                r5.A0H("collection_type", str10);
            }
            String str11 = minimalGuide.A07;
            if (str11 != null) {
                r5.A0H(DialogModule.KEY_TITLE, str11);
            }
            String str12 = minimalGuide.A02;
            if (str12 != null) {
                r5.A0H("description", str12);
            }
            Integer num = minimalGuide.A00;
            if (num != null) {
                r5.A0F("num_items", num.intValue());
            }
            r5.A0I("can_viewer_reshare", minimalGuide.A0A);
            String str13 = minimalGuide.A09;
            if (str13 != null) {
                r5.A0H("owner", str13);
            }
            String str14 = minimalGuide.A08;
            if (str14 != null) {
                r5.A0H("cover_media", str14);
            }
            r5.A0Q();
        }
        if (r6.A09 != null) {
            r5.A0d("layout");
            C51282Jz.A04(r5, r6.A09.A00);
        }
        String str15 = r6.A0i;
        if (str15 != null) {
            r5.A0H("id", str15);
        }
        String str16 = r6.A0j;
        if (str16 != null) {
            r5.A0H("media_id", str16);
        }
        String str17 = r6.A0e;
        if (str17 != null) {
            r5.A0H("carousel_share_child_media_id", str17);
        }
        String str18 = r6.A0k;
        if (str18 != null) {
            r5.A0H("media_owner_id", str18);
        }
        AnonymousClass1YR r04 = r6.A0F;
        if (r04 != null) {
            r5.A0H("product_type", r04.A00);
        }
        String str19 = r6.A0d;
        if (str19 != null) {
            r5.A0H("attribution", str19);
        }
        r5.A0I("is_sticker", r6.A0s);
        r5.A0I("use_custom_title", r6.A0t);
        String str20 = r6.A0g;
        if (str20 != null) {
            r5.A0H("custom_title", str20);
        }
        String str21 = r6.A0n;
        if (str21 != null) {
            r5.A0H("display_type", str21);
        }
        String str22 = r6.A0h;
        if (str22 != null) {
            r5.A0H("highlighted_media_ids", str22);
        }
        r5.A0I("is_hidden", r6.A0r);
        r5.A0I("is_fb_sticker", r6.A0q);
        r5.A0F("tap_state", r6.A05);
        String str23 = r6.A0o;
        if (str23 != null) {
            r5.A0H("tap_state_str_id", str23);
        }
        r5.A0Q();
    }
}
