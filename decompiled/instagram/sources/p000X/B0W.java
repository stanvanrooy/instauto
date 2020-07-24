package p000X;

import android.content.Context;
import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.EmailAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.facebook.phonenumbers.PhoneNumberUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.B0W */
public final class B0W {
    public final Context A00;
    public final String A01;

    public static List A00(Map map) {
        Object obj;
        HashMap hashMap = new HashMap();
        for (String str : new HashSet(AddressAutofillData.A00)) {
            List list = (List) map.get(str);
            if (list == null || list.isEmpty()) {
                obj = null;
            } else {
                obj = list.get(0);
            }
            String str2 = (String) obj;
            if (str2 != null) {
                hashMap.put(str, str2);
            }
        }
        String str3 = (String) hashMap.get("address-line1");
        String str4 = (String) hashMap.get("street-address");
        if (str3 != null) {
            StringBuilder sb = new StringBuilder(str3);
            String str5 = (String) hashMap.get("address-line2");
            if (str5 != null && !str5.isEmpty()) {
                if (sb.length() != 0) {
                    sb.append(" ");
                }
                sb.append(str5);
            }
            String str6 = (String) hashMap.get("address-line3");
            if (str6 != null && !str6.isEmpty()) {
                if (sb.length() != 0) {
                    sb.append(" ");
                }
                sb.append(str6);
            }
            hashMap.put("street-address", sb.toString());
        } else if (str4 != null) {
            hashMap.put("address-line1", str4);
            hashMap.remove("address-line2");
            hashMap.remove("address-line3");
        }
        ArrayList arrayList = new ArrayList();
        if (!hashMap.isEmpty()) {
            arrayList.add(new AddressAutofillData((Map) hashMap));
        }
        return arrayList;
    }

    public static List A01(Map map) {
        ArrayList arrayList = new ArrayList();
        for (String str : new HashSet(EmailAutofillData.A00)) {
            List<String> list = (List) map.get(str);
            if (list != null) {
                for (String emailAutofillData : list) {
                    arrayList.add(new EmailAutofillData(str, emailAutofillData));
                }
            }
        }
        return arrayList;
    }

    public static List A02(Map map) {
        Object obj;
        HashMap hashMap = new HashMap();
        for (String str : new HashSet(NameAutofillData.A00)) {
            List list = (List) map.get(str);
            if (list == null || list.isEmpty()) {
                obj = null;
            } else {
                obj = list.get(0);
            }
            String str2 = (String) obj;
            if (str2 != null) {
                hashMap.put(str, str2);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (!hashMap.isEmpty()) {
            arrayList.add(new NameAutofillData((Map) hashMap));
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        if (r2.length() == 0) goto L_0x0079;
     */
    public final List A03(Map map) {
        boolean z;
        StringBuilder sb;
        Object obj;
        HashMap hashMap = new HashMap();
        for (String str : new HashSet(TelephoneAutofillData.A01)) {
            List list = (List) map.get(str);
            if (list == null || list.isEmpty()) {
                obj = null;
            } else {
                obj = list.get(0);
            }
            String str2 = (String) obj;
            if (str2 != null) {
                hashMap.put(str, str2);
            }
        }
        String str3 = (String) hashMap.get("tel");
        if (str3 == null) {
            String str4 = (String) hashMap.get("tel-country-code");
            if (str4 == null) {
                sb = new StringBuilder();
            } else {
                String replaceFirst = str4.replaceFirst("0*", "");
                if (!replaceFirst.isEmpty() && !replaceFirst.startsWith("+")) {
                    replaceFirst = AnonymousClass000.A0E("+", replaceFirst);
                }
                sb = new StringBuilder(replaceFirst);
            }
            String str5 = (String) hashMap.get("tel-national");
            if (str5 != null) {
                sb.append(str5);
            } else {
                String str6 = (String) hashMap.get("tel-area-code");
                String str7 = (String) hashMap.get("tel-local");
                if (str6 == null || str7 == null) {
                    String str8 = (String) hashMap.get("tel-local-prefix");
                    String str9 = (String) hashMap.get("tel-local-suffix");
                    if (!(str6 == null || str8 == null || str9 == null)) {
                        sb.append(str6);
                        sb.append(str8);
                        sb.append(str9);
                    }
                } else {
                    sb.append(str6);
                    sb.append(str7);
                }
            }
            str3 = sb.toString();
        }
        ArrayList arrayList = new ArrayList();
        PhoneNumberUtil A012 = PhoneNumberUtil.A01(this.A00);
        String str10 = this.A01;
        if (str3 != null) {
            z = false;
        }
        z = true;
        TelephoneAutofillData telephoneAutofillData = null;
        if (!z) {
            try {
                C73223Iz A0F = A012.A0F(str3, str10);
                HashMap hashMap2 = new HashMap();
                String A0J = A012.A0J(A0F, Constants.ZERO);
                String l = Long.toString(A0F.A02);
                hashMap2.put("tel", A0J);
                hashMap2.put("tel-country-code", Integer.toString(A0F.A00));
                hashMap2.put("tel-national", l);
                if (!(!B0Y.A01(str10, A012.A0H(A0F.A00)))) {
                    A0J = l;
                }
                telephoneAutofillData = new TelephoneAutofillData(hashMap2, A0J);
            } catch (C45471xw unused) {
            }
        }
        if (telephoneAutofillData != null) {
            arrayList.add(telephoneAutofillData);
        }
        return arrayList;
    }

    public B0W(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }
}
