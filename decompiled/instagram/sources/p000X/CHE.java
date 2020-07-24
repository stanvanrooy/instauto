package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;

/* renamed from: X.CHE */
public final class CHE {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v29 */
    /* JADX WARNING: type inference failed for: r2v30 */
    /* JADX WARNING: type inference failed for: r2v31 */
    /* JADX WARNING: type inference failed for: r2v32 */
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
    /* JADX WARNING: Multi-variable type inference failed */
    public static CHG parseFromJson(C13080hr r4) {
        CHD chd;
        CHF chf;
        Integer num;
        CHG chg = new CHG();
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
                chg.A0B = r2;
            } else if ("time_created".equals(A0i)) {
                chg.A00 = r4.A0J();
            } else if (IgReactPurchaseExperienceBridgeModule.EMAIL.equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                chg.A04 = r2;
            } else if ("expiry_month".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                chg.A05 = r2;
            } else if ("expiry_year".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                chg.A06 = r2;
            } else if ("id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                chg.A07 = r2;
            } else if ("last4".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                chg.A08 = r2;
            } else if ("login_ref_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                chg.A09 = r2;
            } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                chg.A0A = r2;
            } else if (IgReactNavigatorModule.URL.equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                chg.A0C = r2;
            } else if ("billing_agreement_type".equals(A0i)) {
                String A0r = r4.A0r();
                if (A0r != null && !A0r.isEmpty()) {
                    if (A0r.equalsIgnoreCase("NOT_SPECIFIED")) {
                        num = Constants.ONE;
                    } else if (A0r.equalsIgnoreCase("MIB")) {
                        num = Constants.A0C;
                    } else if (A0r.equalsIgnoreCase("CIB")) {
                        num = Constants.A0N;
                    }
                    chg.A02 = num;
                }
                num = Constants.ZERO;
                chg.A02 = num;
            } else if ("card_type".equals(A0i)) {
                chg.A03 = C27456CDy.A00(r4.A0r());
            } else if ("credential_type".equals(A0i)) {
                chg.A01 = C26669BpT.A00(r4.A0r());
            } else if ("available_card_categories".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        String A0r2 = r4.A0r();
                        if (A0r2 != null && !A0r2.isEmpty()) {
                            if (A0r2.equalsIgnoreCase("CREDIT_CARD_CATEGORY_DEBIT")) {
                                chf = CHF.CREDIT_CARD_CATEGORY_DEBIT;
                            } else if (A0r2.equalsIgnoreCase("CREDIT_CARD_CATEGORY_CREDIT")) {
                                chf = CHF.CREDIT_CARD_CATEGORY_CREDIT;
                            } else if (A0r2.equalsIgnoreCase("CREDIT_CARD_CATEGORY_CHARGE")) {
                                chf = CHF.CREDIT_CARD_CATEGORY_CHARGE;
                            } else if (A0r2.equalsIgnoreCase("CREDIT_CARD_CATEGORY_PREPAID")) {
                                chf = CHF.CREDIT_CARD_CATEGORY_PREPAID;
                            } else if (A0r2.equalsIgnoreCase("CREDIT_CARD_CATEGORY_DEFERRED_DEBIT")) {
                                chf = CHF.CREDIT_CARD_CATEGORY_DEFERRED_DEBIT;
                            } else if (A0r2.equalsIgnoreCase("CREDIT_CARD_CATEGORY_PREPAID_AND_DEBIT")) {
                                chf = CHF.CREDIT_CARD_CATEGORY_PREPAID_AND_DEBIT;
                            } else if (A0r2.equalsIgnoreCase("CREDIT_CARD_CATEGORY_COMBO")) {
                                chf = CHF.CREDIT_CARD_CATEGORY_COMBO;
                            } else if (A0r2.equalsIgnoreCase("CREDIT_CARD_CATEGORY_UNKNOWN")) {
                                chf = CHF.CREDIT_CARD_CATEGORY_UNKNOWN;
                            }
                            arrayList.add(chf);
                        }
                        chf = CHF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                        arrayList.add(chf);
                    }
                    r2 = arrayList;
                }
                chg.A0E = r2;
            } else if ("available_card_types".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList2 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        String A0r3 = r4.A0r();
                        if (A0r3 != null && !A0r3.isEmpty()) {
                            if (A0r3.equalsIgnoreCase("DINERSCLUB")) {
                                chd = CHD.DINERSCLUB;
                            } else if (A0r3.equalsIgnoreCase("AMERICANEXPRESS")) {
                                chd = CHD.AMERICANEXPRESS;
                            } else if (A0r3.equalsIgnoreCase("DISCOVER")) {
                                chd = CHD.DISCOVER;
                            } else if (A0r3.equalsIgnoreCase("ELO")) {
                                chd = CHD.ELO;
                            } else if (A0r3.equalsIgnoreCase("INTERAC")) {
                                chd = CHD.INTERAC;
                            } else if (A0r3.equalsIgnoreCase("JCB")) {
                                chd = CHD.JCB;
                            } else if (A0r3.equalsIgnoreCase("MASTERCARD")) {
                                chd = CHD.MASTERCARD;
                            } else if (A0r3.equalsIgnoreCase("PIN_ONLY")) {
                                chd = CHD.PIN_ONLY;
                            } else if (A0r3.equalsIgnoreCase("CUP")) {
                                chd = CHD.CUP;
                            } else if (A0r3.equalsIgnoreCase(NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED)) {
                                chd = CHD.A0C;
                            } else if (A0r3.equalsIgnoreCase("VISA")) {
                                chd = CHD.VISA;
                            } else if (A0r3.equalsIgnoreCase("RUPAY")) {
                                chd = CHD.RUPAY;
                            } else if (A0r3.equalsIgnoreCase("MAESTRO")) {
                                chd = CHD.MAESTRO;
                            }
                            arrayList2.add(chd);
                        }
                        chd = CHD.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                        arrayList2.add(chd);
                    }
                    r2 = arrayList2;
                }
                chg.A0F = r2;
            } else if ("fields_to_verify".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList3 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        arrayList3.add(C228819vo.A00(r4.A0r()));
                    }
                    r2 = arrayList3;
                }
                chg.A0G = r2;
            } else if ("additional_fields".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList4 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C228459tS parseFromJson = C228809vn.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList4.add(parseFromJson);
                        }
                    }
                    r2 = arrayList4;
                }
                chg.A0D = r2;
            } else if ("fields_to_verify_attempts".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList5 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        CHI parseFromJson2 = CHH.parseFromJson(r4);
                        if (parseFromJson2 != null) {
                            arrayList5.add(parseFromJson2);
                        }
                    }
                    r2 = arrayList5;
                }
                chg.A0H = r2;
            }
            r4.A0f();
        }
        return chg;
    }
}
