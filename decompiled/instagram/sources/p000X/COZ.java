package p000X;

/* renamed from: X.COZ */
public final class COZ {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "shopping_partner_remove_tapped";
            case 2:
                return "product_tagging_shopping_partners_opened";
            case 3:
                return "view_approved_partner_details";
            case 4:
                return "highlighted_product_add_tapped";
            case 5:
                return "highlighted_product_remove_tapped";
            default:
                return "shopping_partner_add_tapped";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "shopping_partner_remove_failure";
            case 2:
                return "product_tagging_shopping_partners_load_failure";
            case 3:
                return "highlighted_products_load_failure";
            case 4:
                return "highlighted_product_add_failure";
            case 5:
                return "highlighted_product_remove_failure";
            default:
                return "shopping_partner_add_failure";
        }
    }

    public static String A02(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "shopping_partner_remove_success";
            case 2:
                return "product_tagging_shopping_partners_load_success";
            case 3:
                return "highlighted_products_load_success";
            case 4:
                return "highlighted_product_add_success";
            case 5:
                return "highlighted_product_remove_success";
            default:
                return "shopping_partner_add_success";
        }
    }
}
