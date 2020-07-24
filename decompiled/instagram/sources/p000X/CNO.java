package p000X;

/* renamed from: X.CNO */
public final class CNO {
    public static Integer A00(String str) {
        for (Integer num : Constants.ZERO(4)) {
            if (A01(num).equals(str)) {
                return num;
            }
        }
        return null;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "product_item_list_item";
            case 2:
                return "product_group_list_item";
            case 3:
                return "product_collection_list_item";
            default:
                return "product_list_header";
        }
    }
}
