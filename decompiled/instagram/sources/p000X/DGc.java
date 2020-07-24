package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.io.StringWriter;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.DGc */
public final class DGc implements C28044CaS {
    public C2102594w A00;
    public C28049CaX A01;
    public Throwable A02;
    public final /* synthetic */ C223009j1 A03;

    public final synchronized void B41(C28047CaV caV) {
        this.A03.A01.getAndSet(false);
        Throwable th = new Throwable(caV.A00);
        this.A02 = th;
        C2102594w r0 = this.A00;
        if (r0 != null) {
            r0.reject(th);
            this.A02 = null;
        }
    }

    public final synchronized void BPv(C28049CaX caX) {
        this.A03.A01.getAndSet(false);
        this.A01 = caX;
        C2102594w r1 = this.A00;
        if (r1 != null) {
            try {
                r1.resolve(A00(this));
                this.A03.A02 = true;
            } catch (IOException | JSONException e) {
                this.A00.reject(e);
            }
        }
        return;
    }

    public DGc(C223009j1 r1) {
        this.A03 = r1;
    }

    public static C228259s1 A00(DGc dGc) {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            C28049CaX caX = dGc.A01;
            if (caX != null) {
                StringWriter stringWriter = new StringWriter();
                C13460iZ A05 = C12890hY.A00.A05(stringWriter);
                A05.A0T();
                if (caX.A00 != null) {
                    A05.A0d("checkout_information_mutation");
                    DHG dhg = caX.A00;
                    A05.A0T();
                    if (dhg.A00 != null) {
                        A05.A0d("checkout_information");
                        DGb dGb = dhg.A00;
                        A05.A0T();
                        A05.A0I("fbpay_experience_enabled", dGb.A04);
                        String str5 = dGb.A01;
                        if (str5 != null) {
                            A05.A0H("payment_session_id", str5);
                        }
                        if (dGb.A00 != null) {
                            A05.A0d("payment_security");
                            DHN dhn = dGb.A00;
                            A05.A0T();
                            A05.A0I("user_has_pin", dhn.A01);
                            A05.A0I("validation_needed", dhn.A02);
                            Integer num = dhn.A00;
                            if (num != null) {
                                switch (num.intValue()) {
                                    case 1:
                                        str4 = "MANDATORY";
                                        break;
                                    case 2:
                                        str4 = "OPTIONAL";
                                        break;
                                    case 3:
                                        str4 = "BACKLOADED";
                                        break;
                                    case 4:
                                        str4 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                                        break;
                                    default:
                                        str4 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                                        break;
                                }
                                A05.A0H("fbpay_pin_creation_flow_type", str4);
                            }
                            A05.A0Q();
                        }
                        if (dGb.A03 != null) {
                            A05.A0d("screen_order");
                            A05.A0S();
                            for (C29920DGw dGw : dGb.A03) {
                                if (dGw != null) {
                                    A05.A0g(dGw.toString());
                                }
                            }
                            A05.A0P();
                        }
                        if (dGb.A02 != null) {
                            A05.A0d("checkout_screen_components");
                            A05.A0S();
                            for (DGe dGe : dGb.A02) {
                                if (dGe != null) {
                                    A05.A0T();
                                    String str6 = dGe.A0M;
                                    if (str6 != null) {
                                        A05.A0H("__typename", str6);
                                    }
                                    A05.A0I("can_be_applied", dGe.A0U);
                                    A05.A0I("is_applied", dGe.A0V);
                                    A05.A0I("opt_in", dGe.A0W);
                                    A05.A0I("refresh_on_change", dGe.A0X);
                                    A05.A0I("should_suggest_address", dGe.A0Y);
                                    String str7 = dGe.A0E;
                                    if (str7 != null) {
                                        A05.A0H("default_label", str7);
                                    }
                                    String str8 = dGe.A0F;
                                    if (str8 != null) {
                                        A05.A0H("description", str8);
                                    }
                                    String str9 = dGe.A0H;
                                    if (str9 != null) {
                                        A05.A0H(AnonymousClass0C5.$const$string(94), str9);
                                    }
                                    String str10 = dGe.A0I;
                                    if (str10 != null) {
                                        A05.A0H("selected_delivery_option_id", str10);
                                    }
                                    String str11 = dGe.A0J;
                                    if (str11 != null) {
                                        A05.A0H("selected_shipping_address_id", str11);
                                    }
                                    String str12 = dGe.A0K;
                                    if (str12 != null) {
                                        A05.A0H("subtitle", str12);
                                    }
                                    String str13 = dGe.A0L;
                                    if (str13 != null) {
                                        A05.A0H(DialogModule.KEY_TITLE, str13);
                                    }
                                    String str14 = dGe.A0G;
                                    if (str14 != null) {
                                        A05.A0H("image_url", str14);
                                    }
                                    Integer num2 = dGe.A0C;
                                    if (num2 != null) {
                                        switch (num2.intValue()) {
                                            case 1:
                                                str3 = "BANNER";
                                                break;
                                            case 2:
                                                str3 = "ENTITY";
                                                break;
                                            case 3:
                                                str3 = "PAY_BUTTON";
                                                break;
                                            case 4:
                                                str3 = "BUBBLE";
                                                break;
                                            case 5:
                                                str3 = "DELIVERY_OPTIONS";
                                                break;
                                            case 6:
                                                str3 = "DELIVERY_OPTIONS_GROUP";
                                                break;
                                            case 7:
                                                str3 = AnonymousClass0C5.$const$string(45);
                                                break;
                                            case 8:
                                                str3 = "TERMS_AND_POLICIES";
                                                break;
                                            case 9:
                                                str3 = "CONTACT_INFO";
                                                break;
                                            case 10:
                                                str3 = "SHIPPING_ADDRESSES";
                                                break;
                                            case C120125Dh.VIEW_TYPE_BANNER:
                                                str3 = "PRICE_TABLE";
                                                break;
                                            case C120125Dh.VIEW_TYPE_SPINNER:
                                                str3 = "PRICE_SELECTOR";
                                                break;
                                            case C120125Dh.VIEW_TYPE_BADGE:
                                                str3 = "PAYMENT_CREDENTIAL_OPTIONS";
                                                break;
                                            case C120125Dh.VIEW_TYPE_LINK:
                                                str3 = "COUPON_CODES";
                                                break;
                                            case 15:
                                                str3 = "DEBUG_INFO";
                                                break;
                                            case 16:
                                                str3 = "USER_INFO_OPT_IN";
                                                break;
                                            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                                                str3 = "FREE_TRIAL";
                                                break;
                                            case 18:
                                                str3 = "FREQUENCY_SELECTOR";
                                                break;
                                            case 19:
                                                str3 = "NATIONALITY_SELECTOR";
                                                break;
                                            case 20:
                                                str3 = "ITEM_DETAILS";
                                                break;
                                            case C120125Dh.VIEW_TYPE_BRANDING:
                                                str3 = "DELIVERY_INFO";
                                                break;
                                            case C120125Dh.NUM_VIEW_TYPES:
                                                str3 = "CUSTOM_EXTENSION";
                                                break;
                                            case 23:
                                                str3 = "DONATION_OPTIONS";
                                                break;
                                            case 24:
                                                str3 = "PSD_AGREEMENT";
                                                break;
                                            case 25:
                                                str3 = "INCENTIVES";
                                                break;
                                            case OdexSchemeArtXdex.OREO_SDK_INT:
                                                str3 = "PICKUP_LOCATION";
                                                break;
                                            case 27:
                                                str3 = "TAX_INFO";
                                                break;
                                            case 28:
                                                str3 = "OFFERS";
                                                break;
                                            default:
                                                str3 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                                                break;
                                        }
                                        A05.A0H("component_type", str3);
                                    }
                                    Integer num3 = dGe.A0D;
                                    if (num3 != null) {
                                        if (1 - num3.intValue() != 0) {
                                            str2 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                                        } else {
                                            str2 = "EMAIL";
                                        }
                                        A05.A0H("user_info_type", str2);
                                    }
                                    if (dGe.A00 != null) {
                                        A05.A0d("disclaimer");
                                        C26001Bdv bdv = dGe.A00;
                                        A05.A0T();
                                        String str15 = bdv.A00;
                                        if (str15 != null) {
                                            A05.A0H("text", str15);
                                        }
                                        if (bdv.A01 != null) {
                                            A05.A0d("css_font_weight_ranges");
                                            A05.A0S();
                                            for (C25999Bdt bdt : bdv.A01) {
                                                if (bdt != null) {
                                                    A05.A0T();
                                                    A05.A0F("length", bdt.A00);
                                                    A05.A0F("offset", bdt.A01);
                                                    Integer num4 = bdt.A02;
                                                    if (num4 != null) {
                                                        switch (num4.intValue()) {
                                                            case 1:
                                                                str = "NORMAL";
                                                                break;
                                                            case 2:
                                                                str = "BOLD";
                                                                break;
                                                            case 3:
                                                                str = "LIGHTER";
                                                                break;
                                                            case 4:
                                                                str = "BOLDER";
                                                                break;
                                                            case 5:
                                                                str = "CSS_100";
                                                                break;
                                                            case 6:
                                                                str = "CSS_200";
                                                                break;
                                                            case 7:
                                                                str = "CSS_300";
                                                                break;
                                                            case 8:
                                                                str = "CSS_400";
                                                                break;
                                                            case 9:
                                                                str = "CSS_500";
                                                                break;
                                                            case 10:
                                                                str = "CSS_600";
                                                                break;
                                                            case C120125Dh.VIEW_TYPE_BANNER:
                                                                str = "CSS_700";
                                                                break;
                                                            case C120125Dh.VIEW_TYPE_SPINNER:
                                                                str = "CSS_800";
                                                                break;
                                                            case C120125Dh.VIEW_TYPE_BADGE:
                                                                str = "CSS_900";
                                                                break;
                                                            default:
                                                                str = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                                                                break;
                                                        }
                                                        A05.A0H("font_weight", str);
                                                    }
                                                    A05.A0Q();
                                                }
                                            }
                                            A05.A0P();
                                        }
                                        A05.A0Q();
                                    }
                                    if (dGe.A01 != null) {
                                        A05.A0d("emails");
                                        C29928DHe dHe = dGe.A01;
                                        A05.A0T();
                                        String str16 = dHe.A00;
                                        if (str16 != null) {
                                            A05.A0H("selected_email_id", str16);
                                        }
                                        if (dHe.A01 != null) {
                                            A05.A0d("available_emails");
                                            A05.A0S();
                                            for (C29929DHf dHf : dHe.A01) {
                                                if (dHf != null) {
                                                    A05.A0T();
                                                    String str17 = dHf.A00;
                                                    if (str17 != null) {
                                                        A05.A0H("id", str17);
                                                    }
                                                    String str18 = dHf.A01;
                                                    if (str18 != null) {
                                                        A05.A0H("normalized_email_address", str18);
                                                    }
                                                    A05.A0Q();
                                                }
                                            }
                                            A05.A0P();
                                        }
                                        A05.A0Q();
                                    }
                                    if (dGe.A02 != null) {
                                        A05.A0d("expanded_view");
                                        DHI dhi = dGe.A02;
                                        A05.A0T();
                                        if (dhi.A00 != null) {
                                            A05.A0d("header");
                                            C29935DHl dHl = dhi.A00;
                                            A05.A0T();
                                            String str19 = dHl.A00;
                                            if (str19 != null) {
                                                A05.A0H("text", str19);
                                            }
                                            A05.A0Q();
                                        }
                                        if (dhi.A01 != null) {
                                            A05.A0d(DialogModule.KEY_TITLE);
                                            C29934DHk dHk = dhi.A01;
                                            A05.A0T();
                                            String str20 = dHk.A00;
                                            if (str20 != null) {
                                                A05.A0H("text", str20);
                                            }
                                            A05.A0Q();
                                        }
                                        if (dhi.A02 != null) {
                                            A05.A0d("actions");
                                            A05.A0S();
                                            for (C29936DHm dHm : dhi.A02) {
                                                if (dHm != null) {
                                                    A05.A0T();
                                                    String str21 = dHm.A00;
                                                    if (str21 != null) {
                                                        A05.A0H("text", str21);
                                                    }
                                                    A05.A0Q();
                                                }
                                            }
                                            A05.A0P();
                                        }
                                        A05.A0Q();
                                    }
                                    if (dGe.A03 != null) {
                                        A05.A0d("incentive_alert_content");
                                        C29927DHd dHd = dGe.A03;
                                        A05.A0T();
                                        String str22 = dHd.A00;
                                        if (str22 != null) {
                                            A05.A0H("text", str22);
                                        }
                                        if (dHd.A01 != null) {
                                            A05.A0d("ranges");
                                            A05.A0S();
                                            for (DHU dhu : dHd.A01) {
                                                if (dhu != null) {
                                                    A05.A0T();
                                                    A05.A0F("length", dhu.A00);
                                                    A05.A0F("offset", dhu.A01);
                                                    String str23 = dhu.A02;
                                                    if (str23 != null) {
                                                        A05.A0H("override_uri", str23);
                                                    }
                                                    A05.A0Q();
                                                }
                                            }
                                            A05.A0P();
                                        }
                                        A05.A0Q();
                                    }
                                    if (dGe.A04 != null) {
                                        A05.A0d("incentive_alert_title");
                                        C29926DHc dHc = dGe.A04;
                                        A05.A0T();
                                        String str24 = dHc.A00;
                                        if (str24 != null) {
                                            A05.A0H("text", str24);
                                        }
                                        if (dHc.A01 != null) {
                                            A05.A0d("ranges");
                                            A05.A0S();
                                            for (DHT dht : dHc.A01) {
                                                if (dht != null) {
                                                    A05.A0T();
                                                    A05.A0F("length", dht.A00);
                                                    A05.A0F("offset", dht.A01);
                                                    String str25 = dht.A02;
                                                    if (str25 != null) {
                                                        A05.A0H("override_uri", str25);
                                                    }
                                                    A05.A0Q();
                                                }
                                            }
                                            A05.A0P();
                                        }
                                        A05.A0Q();
                                    }
                                    if (dGe.A05 != null) {
                                        A05.A0d("incentive_description");
                                        C29925DHb dHb = dGe.A05;
                                        A05.A0T();
                                        String str26 = dHb.A00;
                                        if (str26 != null) {
                                            A05.A0H("text", str26);
                                        }
                                        if (dHb.A01 != null) {
                                            A05.A0d("ranges");
                                            A05.A0S();
                                            for (DHS dhs : dHb.A01) {
                                                if (dhs != null) {
                                                    A05.A0T();
                                                    A05.A0F("length", dhs.A00);
                                                    A05.A0F("offset", dhs.A01);
                                                    String str27 = dhs.A02;
                                                    if (str27 != null) {
                                                        A05.A0H("override_uri", str27);
                                                    }
                                                    A05.A0Q();
                                                }
                                            }
                                            A05.A0P();
                                        }
                                        A05.A0Q();
                                    }
                                    if (dGe.A06 != null) {
                                        A05.A0d("incentive_subtitle");
                                        C29924DHa dHa = dGe.A06;
                                        A05.A0T();
                                        String str28 = dHa.A00;
                                        if (str28 != null) {
                                            A05.A0H("text", str28);
                                        }
                                        if (dHa.A01 != null) {
                                            A05.A0d("ranges");
                                            A05.A0S();
                                            for (DHR dhr : dHa.A01) {
                                                if (dhr != null) {
                                                    A05.A0T();
                                                    A05.A0F("length", dhr.A00);
                                                    A05.A0F("offset", dhr.A01);
                                                    String str29 = dhr.A02;
                                                    if (str29 != null) {
                                                        A05.A0H("override_uri", str29);
                                                    }
                                                    A05.A0Q();
                                                }
                                            }
                                            A05.A0P();
                                        }
                                        A05.A0Q();
                                    }
                                    if (dGe.A07 != null) {
                                        A05.A0d("incentive_title");
                                        DHZ dhz = dGe.A07;
                                        A05.A0T();
                                        String str30 = dhz.A00;
                                        if (str30 != null) {
                                            A05.A0H("text", str30);
                                        }
                                        if (dhz.A01 != null) {
                                            A05.A0d("ranges");
                                            A05.A0S();
                                            for (DHQ dhq : dhz.A01) {
                                                if (dhq != null) {
                                                    A05.A0T();
                                                    A05.A0F("length", dhq.A00);
                                                    A05.A0F("offset", dhq.A01);
                                                    String str31 = dhq.A02;
                                                    if (str31 != null) {
                                                        A05.A0H("override_uri", str31);
                                                    }
                                                    A05.A0Q();
                                                }
                                            }
                                            A05.A0P();
                                        }
                                        A05.A0Q();
                                    }
                                    if (dGe.A08 != null) {
                                        A05.A0d("inline_view");
                                        DHY dhy = dGe.A08;
                                        A05.A0T();
                                        String str32 = dhy.A00;
                                        if (str32 != null) {
                                            A05.A0H("text", str32);
                                        }
                                        if (dhy.A01 != null) {
                                            A05.A0d("ranges");
                                            A05.A0S();
                                            for (DHP dhp : dhy.A01) {
                                                if (dhp != null) {
                                                    A05.A0T();
                                                    A05.A0F("length", dhp.A00);
                                                    A05.A0F("offset", dhp.A01);
                                                    String str33 = dhp.A02;
                                                    if (str33 != null) {
                                                        A05.A0H("override_uri", str33);
                                                    }
                                                    A05.A0Q();
                                                }
                                            }
                                            A05.A0P();
                                        }
                                        A05.A0Q();
                                    }
                                    if (dGe.A09 != null) {
                                        A05.A0d("name");
                                        C29933DHj dHj = dGe.A09;
                                        A05.A0T();
                                        String str34 = dHj.A00;
                                        if (str34 != null) {
                                            A05.A0H("full_name", str34);
                                        }
                                        A05.A0Q();
                                    }
                                    if (dGe.A0A != null) {
                                        A05.A0d("privacy_policy");
                                        DHW dhw = dGe.A0A;
                                        A05.A0T();
                                        String str35 = dhw.A00;
                                        if (str35 != null) {
                                            A05.A0H("text", str35);
                                        }
                                        if (dhw.A01 != null) {
                                            A05.A0d("ranges");
                                            A05.A0S();
                                            for (DHO dho : dhw.A01) {
                                                if (dho != null) {
                                                    A05.A0T();
                                                    A05.A0F("length", dho.A00);
                                                    A05.A0F("offset", dho.A01);
                                                    String str36 = dho.A02;
                                                    if (str36 != null) {
                                                        A05.A0H("override_uri", str36);
                                                    }
                                                    A05.A0Q();
                                                }
                                            }
                                            A05.A0P();
                                        }
                                        A05.A0Q();
                                    }
                                    if (dGe.A0B != null) {
                                        A05.A0d("total_price");
                                        DHJ dhj = dGe.A0B;
                                        A05.A0T();
                                        String str37 = dhj.A02;
                                        if (str37 != null) {
                                            A05.A0H("display_price", str37);
                                        }
                                        String str38 = dhj.A03;
                                        if (str38 != null) {
                                            A05.A0H("label", str38);
                                        }
                                        Integer num5 = dhj.A01;
                                        if (num5 != null) {
                                            A05.A0H("price_type", C25723BWt.A01(num5));
                                        }
                                        if (dhj.A00 != null) {
                                            A05.A0d("price");
                                            DHV dhv = dhj.A00;
                                            A05.A0T();
                                            String str39 = dhv.A00;
                                            if (str39 != null) {
                                                A05.A0H("amount", str39);
                                            }
                                            String str40 = dhv.A01;
                                            if (str40 != null) {
                                                A05.A0H("currency", str40);
                                            }
                                            A05.A0Q();
                                        }
                                        A05.A0Q();
                                    }
                                    if (dGe.A0N != null) {
                                        A05.A0d("available_delivery_options");
                                        A05.A0S();
                                        for (DHL dhl : dGe.A0N) {
                                            if (dhl != null) {
                                                A05.A0T();
                                                String str41 = dhl.A01;
                                                if (str41 != null) {
                                                    A05.A0H("delivery_estimate", str41);
                                                }
                                                String str42 = dhl.A02;
                                                if (str42 != null) {
                                                    A05.A0H("id", str42);
                                                }
                                                String str43 = dhl.A03;
                                                if (str43 != null) {
                                                    A05.A0H("name", str43);
                                                }
                                                if (dhl.A00 != null) {
                                                    A05.A0d("price");
                                                    C29931DHh dHh = dhl.A00;
                                                    A05.A0T();
                                                    String str44 = dHh.A00;
                                                    if (str44 != null) {
                                                        A05.A0H("amount", str44);
                                                    }
                                                    String str45 = dHh.A01;
                                                    if (str45 != null) {
                                                        A05.A0H("currency", str45);
                                                    }
                                                    A05.A0Q();
                                                }
                                                A05.A0Q();
                                            }
                                        }
                                        A05.A0P();
                                    }
                                    if (dGe.A0O != null) {
                                        A05.A0d("available_payment_credential_options");
                                        A05.A0S();
                                        for (DGY dgy : dGe.A0O) {
                                            if (dgy != null) {
                                                A05.A0T();
                                                A05.A0I("is_disabled", dgy.A01);
                                                A05.A0I("is_selected", dgy.A02);
                                                if (dgy.A00 != null) {
                                                    A05.A0d("payment_credential_option");
                                                    CHG chg = dgy.A00;
                                                    A05.A0T();
                                                    String str46 = chg.A0B;
                                                    if (str46 != null) {
                                                        A05.A0H("__typename", str46);
                                                    }
                                                    A05.A0G("time_created", chg.A00);
                                                    String str47 = chg.A04;
                                                    if (str47 != null) {
                                                        A05.A0H(IgReactPurchaseExperienceBridgeModule.EMAIL, str47);
                                                    }
                                                    String str48 = chg.A05;
                                                    if (str48 != null) {
                                                        A05.A0H("expiry_month", str48);
                                                    }
                                                    String str49 = chg.A06;
                                                    if (str49 != null) {
                                                        A05.A0H("expiry_year", str49);
                                                    }
                                                    String str50 = chg.A07;
                                                    if (str50 != null) {
                                                        A05.A0H("id", str50);
                                                    }
                                                    String str51 = chg.A08;
                                                    if (str51 != null) {
                                                        A05.A0H("last4", str51);
                                                    }
                                                    String str52 = chg.A09;
                                                    if (str52 != null) {
                                                        A05.A0H("login_ref_id", str52);
                                                    }
                                                    String str53 = chg.A0A;
                                                    if (str53 != null) {
                                                        A05.A0H(DialogModule.KEY_TITLE, str53);
                                                    }
                                                    String str54 = chg.A0C;
                                                    if (str54 != null) {
                                                        A05.A0H(IgReactNavigatorModule.URL, str54);
                                                    }
                                                    Integer num6 = chg.A02;
                                                    if (num6 != null) {
                                                        A05.A0H("billing_agreement_type", CHJ.A00(num6));
                                                    }
                                                    Integer num7 = chg.A03;
                                                    if (num7 != null) {
                                                        A05.A0H("card_type", C27456CDy.A01(num7));
                                                    }
                                                    C26669BpT bpT = chg.A01;
                                                    if (bpT != null) {
                                                        A05.A0H("credential_type", bpT.toString());
                                                    }
                                                    if (chg.A0E != null) {
                                                        A05.A0d("available_card_categories");
                                                        A05.A0S();
                                                        for (CHF chf : chg.A0E) {
                                                            if (chf != null) {
                                                                A05.A0g(chf.toString());
                                                            }
                                                        }
                                                        A05.A0P();
                                                    }
                                                    if (chg.A0F != null) {
                                                        A05.A0d("available_card_types");
                                                        A05.A0S();
                                                        for (CHD chd : chg.A0F) {
                                                            if (chd != null) {
                                                                A05.A0g(chd.toString());
                                                            }
                                                        }
                                                        A05.A0P();
                                                    }
                                                    if (chg.A0G != null) {
                                                        A05.A0d("fields_to_verify");
                                                        A05.A0S();
                                                        for (C228819vo r0 : chg.A0G) {
                                                            if (r0 != null) {
                                                                A05.A0g(r0.toString());
                                                            }
                                                        }
                                                        A05.A0P();
                                                    }
                                                    if (chg.A0D != null) {
                                                        A05.A0d("additional_fields");
                                                        A05.A0S();
                                                        for (C228459tS r11 : chg.A0D) {
                                                            if (r11 != null) {
                                                                A05.A0T();
                                                                String str55 = r11.A00;
                                                                if (str55 != null) {
                                                                    A05.A0H("country", str55);
                                                                }
                                                                if (r11.A01 != null) {
                                                                    A05.A0d("fields");
                                                                    A05.A0S();
                                                                    for (C228819vo r02 : r11.A01) {
                                                                        if (r02 != null) {
                                                                            A05.A0g(r02.toString());
                                                                        }
                                                                    }
                                                                    A05.A0P();
                                                                }
                                                                A05.A0Q();
                                                            }
                                                        }
                                                        A05.A0P();
                                                    }
                                                    if (chg.A0H != null) {
                                                        A05.A0d("fields_to_verify_attempts");
                                                        A05.A0S();
                                                        for (CHI chi : chg.A0H) {
                                                            if (chi != null) {
                                                                A05.A0T();
                                                                A05.A0F("attempts", chi.A00);
                                                                A05.A0F("max_tries", chi.A01);
                                                                C228819vo r03 = chi.A02;
                                                                if (r03 != null) {
                                                                    A05.A0H("verify_field", r03.toString());
                                                                }
                                                                A05.A0Q();
                                                            }
                                                        }
                                                        A05.A0P();
                                                    }
                                                    A05.A0Q();
                                                }
                                                A05.A0Q();
                                            }
                                        }
                                        A05.A0P();
                                    }
                                    if (dGe.A0P != null) {
                                        A05.A0d("available_shipping_addresses");
                                        A05.A0S();
                                        for (DHF dhf : dGe.A0P) {
                                            if (dhf != null) {
                                                A05.A0T();
                                                A05.A0I("is_default", dhf.A09);
                                                A05.A0I("verified", dhf.A0A);
                                                String str56 = dhf.A00;
                                                if (str56 != null) {
                                                    A05.A0H("care_of", str56);
                                                }
                                                String str57 = dhf.A01;
                                                if (str57 != null) {
                                                    A05.A0H("city", str57);
                                                }
                                                String str58 = dhf.A02;
                                                if (str58 != null) {
                                                    A05.A0H("country", str58);
                                                }
                                                String str59 = dhf.A03;
                                                if (str59 != null) {
                                                    A05.A0H("id", str59);
                                                }
                                                String str60 = dhf.A04;
                                                if (str60 != null) {
                                                    A05.A0H("label", str60);
                                                }
                                                String str61 = dhf.A05;
                                                if (str61 != null) {
                                                    A05.A0H("postal_code", str61);
                                                }
                                                String str62 = dhf.A06;
                                                if (str62 != null) {
                                                    A05.A0H("state", str62);
                                                }
                                                String str63 = dhf.A07;
                                                if (str63 != null) {
                                                    A05.A0H("street1", str63);
                                                }
                                                String str64 = dhf.A08;
                                                if (str64 != null) {
                                                    A05.A0H("street2", str64);
                                                }
                                                A05.A0Q();
                                            }
                                        }
                                        A05.A0P();
                                    }
                                    if (dGe.A0Q != null) {
                                        A05.A0d("custom_label_for_selected_credential");
                                        A05.A0S();
                                        for (C27232C3y c3y : dGe.A0Q) {
                                            if (c3y != null) {
                                                A05.A0T();
                                                String str65 = c3y.A01;
                                                if (str65 != null) {
                                                    A05.A0H("label", str65);
                                                }
                                                C26669BpT bpT2 = c3y.A00;
                                                if (bpT2 != null) {
                                                    A05.A0H("credential_type", bpT2.toString());
                                                }
                                                A05.A0Q();
                                            }
                                        }
                                        A05.A0P();
                                    }
                                    if (dGe.A0R != null) {
                                        A05.A0d("debug_info");
                                        A05.A0S();
                                        for (C29930DHg dHg : dGe.A0R) {
                                            if (dHg != null) {
                                                A05.A0T();
                                                String str66 = dHg.A00;
                                                if (str66 != null) {
                                                    A05.A0H("key", str66);
                                                }
                                                String str67 = dHg.A01;
                                                if (str67 != null) {
                                                    A05.A0H("value", str67);
                                                }
                                                A05.A0Q();
                                            }
                                        }
                                        A05.A0P();
                                    }
                                    if (dGe.A0S != null) {
                                        A05.A0d("items");
                                        A05.A0S();
                                        for (DHH dhh : dGe.A0S) {
                                            if (dhh != null) {
                                                A05.A0T();
                                                A05.A0F("quantity", dhh.A00);
                                                String str68 = dhh.A02;
                                                if (str68 != null) {
                                                    A05.A0H("strikethrough_subtitle", str68);
                                                }
                                                String str69 = dhh.A03;
                                                if (str69 != null) {
                                                    A05.A0H("subsubtitle", str69);
                                                }
                                                String str70 = dhh.A04;
                                                if (str70 != null) {
                                                    A05.A0H("subtitle", str70);
                                                }
                                                String str71 = dhh.A05;
                                                if (str71 != null) {
                                                    A05.A0H(DialogModule.KEY_TITLE, str71);
                                                }
                                                String str72 = dhh.A01;
                                                if (str72 != null) {
                                                    A05.A0H("item_image_url", str72);
                                                }
                                                A05.A0Q();
                                            }
                                        }
                                        A05.A0P();
                                    }
                                    if (dGe.A0T != null) {
                                        A05.A0d("price_subtables");
                                        A05.A0S();
                                        for (C29932DHi dHi : dGe.A0T) {
                                            if (dHi != null) {
                                                A05.A0T();
                                                if (dHi.A00 != null) {
                                                    A05.A0d("price_lists");
                                                    A05.A0S();
                                                    for (DHK dhk : dHi.A00) {
                                                        if (dhk != null) {
                                                            A05.A0T();
                                                            String str73 = dhk.A02;
                                                            if (str73 != null) {
                                                                A05.A0H("display_price", str73);
                                                            }
                                                            String str74 = dhk.A03;
                                                            if (str74 != null) {
                                                                A05.A0H("label", str74);
                                                            }
                                                            Integer num8 = dhk.A01;
                                                            if (num8 != null) {
                                                                A05.A0H("price_type", C25723BWt.A01(num8));
                                                            }
                                                            if (dhk.A00 != null) {
                                                                A05.A0d("price");
                                                                DHX dhx = dhk.A00;
                                                                A05.A0T();
                                                                String str75 = dhx.A00;
                                                                if (str75 != null) {
                                                                    A05.A0H("amount", str75);
                                                                }
                                                                String str76 = dhx.A01;
                                                                if (str76 != null) {
                                                                    A05.A0H("currency", str76);
                                                                }
                                                                A05.A0Q();
                                                            }
                                                            A05.A0Q();
                                                        }
                                                    }
                                                    A05.A0P();
                                                }
                                                A05.A0Q();
                                            }
                                        }
                                        A05.A0P();
                                    }
                                    A05.A0Q();
                                }
                            }
                            A05.A0P();
                        }
                        A05.A0Q();
                    }
                    if (dhg.A01 != null) {
                        A05.A0d("velocity_restriction_settings");
                        DHM dhm = dhg.A01;
                        A05.A0T();
                        A05.A0D("incremental_delay_secs", dhm.A00);
                        A05.A0D("maximum_retry_secs", dhm.A01);
                        A05.A0Q();
                    }
                    A05.A0Q();
                }
                A05.A0Q();
                A05.close();
                return C23042A0s.A01(new JSONObject(stringWriter.toString()));
            }
            throw new IOException("Prefetched data is null!");
        } catch (IOException | JSONException e) {
            AnonymousClass0DB.A0M("react_checkout_information_mutation_executor", e, "Error serializing to JSON");
            throw e;
        }
    }
}
