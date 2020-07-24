package p000X;

/* renamed from: X.CGQ */
public final class CGQ {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "business_account_banhammered";
            case 2:
                return "ad_account_disabled_for_payment_risk";
            case 3:
                return "ad_account_disabled_for_ads_integrity_policy";
            case 4:
                return "unknown_error";
            default:
                return "payments_ad_account_unsettled";
        }
    }
}
