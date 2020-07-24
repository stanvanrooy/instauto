package p000X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.StringWriter;

/* renamed from: X.B05 */
public final class B05 {
    public static String A00(B08 b08) {
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        A05.A0T();
        if (b08.A01 != null) {
            A05.A0d("access_token");
            B0A b0a = b08.A01;
            A05.A0T();
            String str = b0a.A00;
            if (str != null) {
                A05.A0H("sensitive_string_value", str);
            }
            A05.A0Q();
        }
        if (b08.A00 != null) {
            A05.A0d("data");
            B07 b07 = b08.A00;
            A05.A0T();
            String str2 = b07.A07;
            if (str2 != null) {
                A05.A0H("given_name", str2);
            }
            String str3 = b07.A06;
            if (str3 != null) {
                A05.A0H("family_name", str3);
            }
            String str4 = b07.A00;
            if (str4 != null) {
                A05.A0H("address_level1", str4);
            }
            String str5 = b07.A01;
            if (str5 != null) {
                A05.A0H("address_level2", str5);
            }
            String str6 = b07.A02;
            if (str6 != null) {
                A05.A0H("address_line1", str6);
            }
            String str7 = b07.A03;
            if (str7 != null) {
                A05.A0H("address_line2", str7);
            }
            String str8 = b07.A04;
            if (str8 != null) {
                A05.A0H("country", str8);
            }
            String str9 = b07.A08;
            if (str9 != null) {
                A05.A0H("postal_code", str9);
            }
            String str10 = b07.A05;
            if (str10 != null) {
                A05.A0H(IgReactPurchaseExperienceBridgeModule.EMAIL, str10);
            }
            String str11 = b07.A09;
            if (str11 != null) {
                A05.A0H("tel", str11);
            }
            A05.A0Q();
        }
        A05.A0Q();
        A05.close();
        return stringWriter.toString();
    }
}
