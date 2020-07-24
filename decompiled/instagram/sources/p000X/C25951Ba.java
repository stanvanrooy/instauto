package p000X;

import java.net.URI;
import java.util.List;
import java.util.Map;
import oauth.signpost.OAuth;

/* renamed from: X.1Ba  reason: invalid class name and case insensitive filesystem */
public final class C25951Ba extends C25961Bb {
    public final C25971Bc A00;
    public final C26001Bf A01;
    public final boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25951Ba(C06590Pq r5) {
        super(AnonymousClass0k5.A00(r5));
        boolean AgN = r5.AgN();
        C25971Bc A002 = C25971Bc.A00(r5);
        C26001Bf A003 = C26001Bf.A07.A00(r5);
        this.A02 = AgN;
        this.A00 = A002;
        this.A01 = A003;
    }

    public static String A00(Map map, String str) {
        List list;
        for (String str2 : map.keySet()) {
            if (str.equalsIgnoreCase(str2) && (list = (List) map.get(str2)) != null && !list.isEmpty()) {
                return (String) list.get(0);
            }
        }
        return null;
    }

    public final void A01(URI uri, List list) {
        super.A01(uri, list);
        if (AnonymousClass1C1.A00(uri.toString())) {
            if (this.A02) {
                String str = this.A00.A00;
                if (!AnonymousClass1BX.A00(str)) {
                    list.add(new C17190pp(OAuth.HTTP_AUTHORIZATION_HEADER, str));
                }
            }
            String str2 = this.A00.A03.A00;
            if (!AnonymousClass1BX.A00(str2)) {
                list.add(new C17190pp("X-MID", str2));
            }
            String str3 = this.A01.A05;
            if (!AnonymousClass1BX.A00(str3)) {
                list.add(new C17190pp("IG-U-TARGET", str3));
            }
            String str4 = this.A01.A00;
            if (!AnonymousClass1BX.A00(str4)) {
                list.add(new C17190pp("IG-U-IG-DIRECT-REGION-HINT", str4));
            }
            String str5 = this.A01.A03;
            if (!AnonymousClass1BX.A00(str5)) {
                list.add(new C17190pp("IG-U-SHBID", str5));
            }
            String str6 = this.A01.A04;
            if (!AnonymousClass1BX.A00(str6)) {
                list.add(new C17190pp("IG-U-SHBTS", str6));
            }
            String str7 = this.A01.A01;
            if (!AnonymousClass1BX.A00(str7)) {
                list.add(new C17190pp("IG-U-DS-USER-ID", str7));
            }
            String str8 = this.A01.A02;
            if (!AnonymousClass1BX.A00(str8)) {
                list.add(new C17190pp("IG-U-RUR", str8));
            }
        }
    }

    public final void A02(URI uri, Map map) {
        super.A02(uri, map);
        if (AnonymousClass1C1.A00(uri.toString())) {
            String A002 = A00(map, "IG-Set-Authorization");
            if (A002 != null) {
                this.A00.A01(A002);
            }
            String A003 = A00(map, "IG-Set-X-MID");
            if (A003 != null) {
                C25991Be r1 = this.A00.A03;
                if (!A003.equals(r1.A00)) {
                    r1.A00 = A003;
                    r1.A01.edit().putString("DEVICE_HEADER_ID", r1.A00).apply();
                }
            }
            String A004 = A00(map, "IG-SET-IG-U-TARGET");
            if (A004 != null) {
                this.A01.A07(A004);
            }
            String A005 = A00(map, "IG-SET-IG-U-IG-DIRECT-REGION-HINT");
            if (A005 != null) {
                this.A01.A02(A005);
            }
            String A006 = A00(map, "IG-SET-IG-U-SHBID");
            if (A006 != null) {
                this.A01.A05(A006);
            }
            String A007 = A00(map, "IG-SET-IG-U-SHBTS");
            if (A007 != null) {
                this.A01.A06(A007);
            }
            String A008 = A00(map, "IG-SET-IG-U-DS-USER-ID");
            if (A008 != null) {
                this.A01.A03(A008);
            }
            String A009 = A00(map, "IG-SET-IG-U-RUR");
            if (A009 != null) {
                this.A01.A04(A009);
            }
        }
    }
}
