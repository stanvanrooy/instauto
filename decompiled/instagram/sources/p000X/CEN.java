package p000X;

import java.util.List;

/* renamed from: X.CEN */
public final class CEN {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;

    public final Integer A00() {
        String str = this.A01;
        if (str != null && !str.isEmpty()) {
            char c = 65535;
            switch (str.hashCode()) {
                case -2049690400:
                    if (str.equals("ad_account_not_active")) {
                        c = 1;
                        break;
                    }
                    break;
                case -749871342:
                    if (str.equals("ad_account_unsettled")) {
                        c = 0;
                        break;
                    }
                    break;
                case -566613550:
                    if (str.equals("page_not_published")) {
                        c = 10;
                        break;
                    }
                    break;
                case -179335560:
                    if (str.equals("no_access_to_ad_account")) {
                        c = 7;
                        break;
                    }
                    break;
                case -158743338:
                    if (str.equals("ad_account_disabled_eligible_for_self_resolution")) {
                        c = 2;
                        break;
                    }
                    break;
                case 85077879:
                    if (str.equals("no_linked_page")) {
                        c = 8;
                        break;
                    }
                    break;
                case 110160751:
                    if (str.equals("not_page_advertiser")) {
                        c = 6;
                        break;
                    }
                    break;
                case 259001481:
                    if (str.equals("page_not_owned")) {
                        c = 9;
                        break;
                    }
                    break;
                case 412385662:
                    if (str.equals("ad_account_disabled_for_ads_integrity_policy")) {
                        c = 15;
                        break;
                    }
                    break;
                case 687259603:
                    if (str.equals("ad_account_disabled_for_payment_risk")) {
                        c = 14;
                        break;
                    }
                    break;
                case 743685710:
                    if (str.equals("business_ad_account_on_unsupported_platform")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1176033560:
                    if (str.equals("business_two_fac_enabled")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1259177187:
                    if (str.equals("business_account_banhammered")) {
                        c = 13;
                        break;
                    }
                    break;
                case 1672776875:
                    if (str.equals("already_promoted")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1701739245:
                    if (str.equals("page_not_connected")) {
                        c = 12;
                        break;
                    }
                    break;
                case 1875619788:
                    if (str.equals("page_not_created")) {
                        c = 11;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return Constants.ZERO;
                case 1:
                    return Constants.ONE;
                case 2:
                    return Constants.A0C;
                case 3:
                    return Constants.A0j;
                case 4:
                    return Constants.A14;
                case 5:
                    return Constants.A12;
                case 6:
                    return Constants.A03;
                case 7:
                    return Constants.A15;
                case 8:
                    return Constants.A02;
                case 9:
                    return Constants.A06;
                case 10:
                    return Constants.A07;
                case C120125Dh.VIEW_TYPE_BANNER:
                    return Constants.A05;
                case C120125Dh.VIEW_TYPE_SPINNER:
                    return Constants.A04;
                case C120125Dh.VIEW_TYPE_BADGE:
                    return Constants.A0u;
                case C120125Dh.VIEW_TYPE_LINK:
                    return Constants.A0N;
                case 15:
                    return Constants.A0Y;
            }
        }
        return Constants.A08;
    }
}
