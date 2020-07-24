package p000X;

/* renamed from: X.CF8 */
public final class CF8 {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ad_account_not_active";
            case 2:
                return "ad_account_disabled_eligible_for_self_resolution";
            case 3:
                return "ad_account_disabled_for_payment_risk";
            case 4:
                return "ad_account_disabled_for_ads_integrity_policy";
            case 5:
                return "already_promoted";
            case 6:
                return "business_account_banhammered";
            case 7:
                return "business_ad_account_on_unsupported_platform";
            case 8:
                return "business_two_fac_enabled";
            case 9:
                return "no_access_to_ad_account";
            case 10:
                return "no_linked_page";
            case C120125Dh.VIEW_TYPE_BANNER:
                return "not_page_advertiser";
            case C120125Dh.VIEW_TYPE_SPINNER:
                return "page_not_connected";
            case C120125Dh.VIEW_TYPE_BADGE:
                return "page_not_created";
            case C120125Dh.VIEW_TYPE_LINK:
                return "page_not_owned";
            case 15:
                return "page_not_published";
            case 16:
                return "unknown_error";
            default:
                return "ad_account_unsettled";
        }
    }
}
