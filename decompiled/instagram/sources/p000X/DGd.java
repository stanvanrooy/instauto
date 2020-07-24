package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;

/* renamed from: X.DGd */
public final class DGd {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v13, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v33 */
    /* JADX WARNING: type inference failed for: r2v34 */
    /* JADX WARNING: type inference failed for: r2v35 */
    /* JADX WARNING: type inference failed for: r2v36 */
    /* JADX WARNING: type inference failed for: r2v37 */
    /* JADX WARNING: type inference failed for: r2v38 */
    /* JADX WARNING: type inference failed for: r2v39 */
    /* JADX WARNING: type inference failed for: r2v40 */
    /* JADX WARNING: type inference failed for: r2v41 */
    /* JADX WARNING: type inference failed for: r2v42 */
    /* JADX WARNING: type inference failed for: r2v43 */
    /* JADX WARNING: type inference failed for: r2v44 */
    /* JADX WARNING: type inference failed for: r2v45 */
    /* JADX WARNING: type inference failed for: r2v46 */
    /* JADX WARNING: type inference failed for: r2v47 */
    /* JADX WARNING: type inference failed for: r2v48 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static DGe parseFromJson(C13080hr r4) {
        Integer num;
        Integer num2;
        DGe dGe = new DGe();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r2 = 0;
            if ("__typename".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                dGe.A0M = r2;
            } else if ("can_be_applied".equals(A0i)) {
                dGe.A0U = r4.A0O();
            } else if ("is_applied".equals(A0i)) {
                dGe.A0V = r4.A0O();
            } else if ("opt_in".equals(A0i)) {
                dGe.A0W = r4.A0O();
            } else if ("refresh_on_change".equals(A0i)) {
                dGe.A0X = r4.A0O();
            } else if ("should_suggest_address".equals(A0i)) {
                dGe.A0Y = r4.A0O();
            } else if ("default_label".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                dGe.A0E = r2;
            } else if ("description".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                dGe.A0F = r2;
            } else if (AnonymousClass0C5.$const$string(94).equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                dGe.A0H = r2;
            } else if ("selected_delivery_option_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                dGe.A0I = r2;
            } else if ("selected_shipping_address_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                dGe.A0J = r2;
            } else if ("subtitle".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                dGe.A0K = r2;
            } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                dGe.A0L = r2;
            } else if ("image_url".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                dGe.A0G = r2;
            } else if ("component_type".equals(A0i)) {
                String A0r = r4.A0r();
                if (A0r != null && !A0r.isEmpty()) {
                    if (A0r.equalsIgnoreCase("BANNER")) {
                        num2 = Constants.ONE;
                    } else if (A0r.equalsIgnoreCase("ENTITY")) {
                        num2 = Constants.A0C;
                    } else if (A0r.equalsIgnoreCase("PAY_BUTTON")) {
                        num2 = Constants.A0N;
                    } else if (A0r.equalsIgnoreCase("BUBBLE")) {
                        num2 = Constants.A0Y;
                    } else if (A0r.equalsIgnoreCase("DELIVERY_OPTIONS")) {
                        num2 = Constants.A0j;
                    } else if (A0r.equalsIgnoreCase("DELIVERY_OPTIONS_GROUP")) {
                        num2 = Constants.A0u;
                    } else if (A0r.equalsIgnoreCase(AnonymousClass0C5.$const$string(45))) {
                        num2 = Constants.A12;
                    } else if (A0r.equalsIgnoreCase("TERMS_AND_POLICIES")) {
                        num2 = Constants.A14;
                    } else if (A0r.equalsIgnoreCase("CONTACT_INFO")) {
                        num2 = Constants.A15;
                    } else if (A0r.equalsIgnoreCase("SHIPPING_ADDRESSES")) {
                        num2 = Constants.A02;
                    } else if (A0r.equalsIgnoreCase("PRICE_TABLE")) {
                        num2 = Constants.A03;
                    } else if (A0r.equalsIgnoreCase("PRICE_SELECTOR")) {
                        num2 = Constants.A04;
                    } else if (A0r.equalsIgnoreCase("PAYMENT_CREDENTIAL_OPTIONS")) {
                        num2 = Constants.A05;
                    } else if (A0r.equalsIgnoreCase("COUPON_CODES")) {
                        num2 = Constants.A06;
                    } else if (A0r.equalsIgnoreCase("DEBUG_INFO")) {
                        num2 = Constants.A07;
                    } else if (A0r.equalsIgnoreCase("USER_INFO_OPT_IN")) {
                        num2 = Constants.A08;
                    } else if (A0r.equalsIgnoreCase("FREE_TRIAL")) {
                        num2 = Constants.A09;
                    } else if (A0r.equalsIgnoreCase("FREQUENCY_SELECTOR")) {
                        num2 = Constants.A0A;
                    } else if (A0r.equalsIgnoreCase("NATIONALITY_SELECTOR")) {
                        num2 = Constants.A0B;
                    } else if (A0r.equalsIgnoreCase("ITEM_DETAILS")) {
                        num2 = Constants.A0D;
                    } else if (A0r.equalsIgnoreCase("DELIVERY_INFO")) {
                        num2 = Constants.A0E;
                    } else if (A0r.equalsIgnoreCase("CUSTOM_EXTENSION")) {
                        num2 = Constants.A0F;
                    } else if (A0r.equalsIgnoreCase("DONATION_OPTIONS")) {
                        num2 = Constants.A0G;
                    } else if (A0r.equalsIgnoreCase("PSD_AGREEMENT")) {
                        num2 = Constants.A0H;
                    } else if (A0r.equalsIgnoreCase("INCENTIVES")) {
                        num2 = Constants.A0I;
                    } else if (A0r.equalsIgnoreCase("PICKUP_LOCATION")) {
                        num2 = Constants.A0J;
                    } else if (A0r.equalsIgnoreCase("TAX_INFO")) {
                        num2 = Constants.A0K;
                    } else if (A0r.equalsIgnoreCase("OFFERS")) {
                        num2 = Constants.A0L;
                    }
                    dGe.A0C = num2;
                }
                num2 = Constants.ZERO;
                dGe.A0C = num2;
            } else if ("user_info_type".equals(A0i)) {
                String A0r2 = r4.A0r();
                if (A0r2 == null || A0r2.isEmpty() || !A0r2.equalsIgnoreCase("EMAIL")) {
                    num = Constants.ZERO;
                } else {
                    num = Constants.ONE;
                }
                dGe.A0D = num;
            } else if ("disclaimer".equals(A0i)) {
                dGe.A00 = C26000Bdu.parseFromJson(r4);
            } else if ("emails".equals(A0i)) {
                dGe.A01 = DGl.parseFromJson(r4);
            } else if ("expanded_view".equals(A0i)) {
                dGe.A02 = DGj.parseFromJson(r4);
            } else if ("incentive_alert_content".equals(A0i)) {
                dGe.A03 = DGm.parseFromJson(r4);
            } else if ("incentive_alert_title".equals(A0i)) {
                dGe.A04 = C29916DGn.parseFromJson(r4);
            } else if ("incentive_description".equals(A0i)) {
                dGe.A05 = DGo.parseFromJson(r4);
            } else if ("incentive_subtitle".equals(A0i)) {
                dGe.A06 = DGp.parseFromJson(r4);
            } else if ("incentive_title".equals(A0i)) {
                dGe.A07 = C29917DGq.parseFromJson(r4);
            } else if ("inline_view".equals(A0i)) {
                dGe.A08 = C29918DGr.parseFromJson(r4);
            } else if ("name".equals(A0i)) {
                dGe.A09 = DHE.parseFromJson(r4);
            } else if ("privacy_policy".equals(A0i)) {
                dGe.A0A = DGs.parseFromJson(r4);
            } else if ("total_price".equals(A0i)) {
                dGe.A0B = DGk.parseFromJson(r4);
            } else if ("available_delivery_options".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        DHL parseFromJson = DGu.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                    r2 = arrayList;
                }
                dGe.A0N = r2;
            } else if ("available_payment_credential_options".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList2 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        DGY parseFromJson2 = DGZ.parseFromJson(r4);
                        if (parseFromJson2 != null) {
                            arrayList2.add(parseFromJson2);
                        }
                    }
                    r2 = arrayList2;
                }
                dGe.A0O = r2;
            } else if ("available_shipping_addresses".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList3 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        DHF parseFromJson3 = DGg.parseFromJson(r4);
                        if (parseFromJson3 != null) {
                            arrayList3.add(parseFromJson3);
                        }
                    }
                    r2 = arrayList3;
                }
                dGe.A0P = r2;
            } else if ("custom_label_for_selected_credential".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList4 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C27232C3y parseFromJson4 = C3x.parseFromJson(r4);
                        if (parseFromJson4 != null) {
                            arrayList4.add(parseFromJson4);
                        }
                    }
                    r2 = arrayList4;
                }
                dGe.A0Q = r2;
            } else if ("debug_info".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList5 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C29930DHg parseFromJson5 = DH7.parseFromJson(r4);
                        if (parseFromJson5 != null) {
                            arrayList5.add(parseFromJson5);
                        }
                    }
                    r2 = arrayList5;
                }
                dGe.A0R = r2;
            } else if ("items".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList6 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        DHH parseFromJson6 = DGi.parseFromJson(r4);
                        if (parseFromJson6 != null) {
                            arrayList6.add(parseFromJson6);
                        }
                    }
                    r2 = arrayList6;
                }
                dGe.A0S = r2;
            } else if ("price_subtables".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList7 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C29932DHi parseFromJson7 = C29919DGv.parseFromJson(r4);
                        if (parseFromJson7 != null) {
                            arrayList7.add(parseFromJson7);
                        }
                    }
                    r2 = arrayList7;
                }
                dGe.A0T = r2;
            }
            r4.A0f();
        }
        return dGe;
    }
}
