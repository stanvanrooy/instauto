package p000X;

/* renamed from: X.CLX */
public final class CLX {
    public static void A00(C13460iZ r2, CLY cly) {
        r2.A0T();
        String str = cly.A02;
        if (str != null) {
            r2.A0H("first_name", str);
        }
        String str2 = cly.A04;
        if (str2 != null) {
            r2.A0H("middle_name", str2);
        }
        String str3 = cly.A03;
        if (str3 != null) {
            r2.A0H("last_name", str3);
        }
        String str4 = cly.A06;
        if (str4 == null) {
            C13150hy.A03("street1");
        }
        if (str4 != null) {
            String str5 = cly.A06;
            if (str5 == null) {
                C13150hy.A03("street1");
            }
            r2.A0H("street1", str5);
        }
        String str6 = cly.A00;
        if (str6 == null) {
            C13150hy.A03("city");
        }
        if (str6 != null) {
            String str7 = cly.A00;
            if (str7 == null) {
                C13150hy.A03("city");
            }
            r2.A0H("city", str7);
        }
        String str8 = cly.A05;
        if (str8 == null) {
            C13150hy.A03("state");
        }
        if (str8 != null) {
            String str9 = cly.A05;
            if (str9 == null) {
                C13150hy.A03("state");
            }
            r2.A0H("state", str9);
        }
        String str10 = cly.A07;
        if (str10 == null) {
            C13150hy.A03("zip");
        }
        if (str10 != null) {
            String str11 = cly.A07;
            if (str11 == null) {
                C13150hy.A03("zip");
            }
            r2.A0H("zip", str11);
        }
        String str12 = cly.A01;
        if (str12 == null) {
            C13150hy.A03("countryCode");
        }
        if (str12 != null) {
            String str13 = cly.A01;
            if (str13 == null) {
                C13150hy.A03("countryCode");
            }
            r2.A0H("country_code", str13);
        }
        r2.A0Q();
    }
}
