package p000X;

import com.instagram.model.shopping.ProductMention;
import com.instagram.model.shopping.ProductTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1in  reason: invalid class name and case insensitive filesystem */
public final class C36901in {
    public static void A0F(AnonymousClass0C1 r8, AnonymousClass0RU r9, C27371Ho r10, C249616t r11, C37121j9 r12, boolean z, Integer num, String str, AnonymousClass1I6 r16) {
        C27371Ho r2 = r10;
        C249616t r3 = r11;
        if (A0M(r11, r10)) {
            AnonymousClass0C1 r1 = r8;
            C37121j9 r4 = r12;
            A09(r9, r10, r11, A00(r1, r2, r3, r4, z, num, str, r16).A03(), (Integer) null);
        }
    }

    public static void A0H(AnonymousClass0C1 r6, C37141jB r7, AnonymousClass1NJ r8, C27371Ho r9, int i) {
        A0I(r6, r7, r8, r9, i, false);
    }

    public static void A0L(AnonymousClass0C1 r4, String str, AnonymousClass1I6 r6, AnonymousClass1NJ r7, C27371Ho r8, int i, Integer num, Integer num2) {
        AnonymousClass0C1 r2 = r4;
        AnonymousClass1NJ r5 = r7;
        C37141jB A00 = C37591ju.A00(r2, str, r6, r5, r8, num);
        if (A00 != null) {
            if (num != null) {
                A00.A14 = num.intValue();
            }
            if (num2 != null) {
                A00.A0s = num2.intValue();
            }
            A0H(r2, A00, r5, r8, i);
        }
    }

    public static C37141jB A01(String str, C27371Ho r2, C37121j9 r3) {
        return new C37141jB(str, r2, r3);
    }

    public static void A03(AnonymousClass0RU r1, AnonymousClass0P4 r2, Integer num) {
        if (num == Constants.ONE) {
            r1.BdB(r2);
        } else {
            r1.BcG(r2);
        }
    }

    public static void A04(AnonymousClass0RU r1, C37141jB r2, C249616t r3, C27371Ho r4) {
        A05(r1, r2, r3, r4, Constants.ZERO);
    }

    public static void A05(AnonymousClass0RU r2, C37141jB r3, C249616t r4, C27371Ho r5, Integer num) {
        AnonymousClass0P4 r1;
        Integer num2;
        if (r5 instanceof C30541Ug) {
            r3.A07(((C30541Ug) r5).BYN());
        }
        if (A0O(r4, r5) || (num != null && num == Constants.ONE)) {
            r1 = r3.A03();
            num2 = Constants.ONE;
        } else if (A0N(r4, r5) || r4.Afk()) {
            r1 = r3.A03();
            num2 = Constants.ZERO;
        } else {
            return;
        }
        A03(r2, r1, num2);
    }

    public static void A07(AnonymousClass0RU r2, C249616t r3, C27371Ho r4, String str, String str2, String str3, String str4, C37121j9 r9, AnonymousClass0C1 r10, String str5) {
        C37141jB A02 = A02("action", r4, r3, r9);
        A02.A2w = str2;
        A02.A3W = str;
        A02.A53 = str3;
        A02.A4G = str4;
        A02.A4c = str5;
        String A04 = C33501d1.A00(r10).A04();
        if (A04 != null) {
            A02.A3S = A04;
        }
        A03(r2, A02.A03(), Constants.ONE);
    }

    public static void A08(AnonymousClass0RU r2, AnonymousClass1NJ r3, C27371Ho r4, C37121j9 r5, String str, String str2, String str3, String str4) {
        C37141jB A02 = A02(AnonymousClass000.A0E("instagram_ad_", "disclaimer_ad_unit_action"), r4, r3, r5);
        A02.A3N = str2;
        A02.A3M = str4;
        A02.A3O = str3;
        A02.A3L = str;
        A03(r2, A02.A03(), Constants.ONE);
    }

    public static void A09(AnonymousClass0RU r1, C27371Ho r2, C249616t r3, AnonymousClass0P4 r4, Integer num) {
        if (num == null) {
            if (A0O(r3, r2)) {
                num = Constants.ONE;
            } else {
                num = Constants.ZERO;
            }
        }
        A03(r1, r4, num);
    }

    public static void A0A(AnonymousClass0RU r3, C27371Ho r4, C249616t r5, C37121j9 r6, int i) {
        if (A0M(r5, r4)) {
            C37141jB A02 = A02("branded_content_click", r4, r5, r6);
            A02.A4i = "about";
            if (i != -1) {
                A02.A14 = i;
            }
            A09(r3, r4, r5, A02.A03(), (Integer) null);
        }
    }

    public static void A0B(AnonymousClass0RU r2, C27371Ho r3, C249616t r4, String str, List list, C37121j9 r7) {
        C37141jB A02 = A02("invalidation", r3, r4, r7);
        A02.A4Y = str;
        A02.A5K = list;
        A09(r2, r3, r4, A02.A03(), Constants.ONE);
    }

    public static void A0C(AnonymousClass0RU r2, C27371Ho r3, String str, String str2, String str3, String str4, String str5) {
        C37141jB A03 = C37591ju.A03(AnonymousClass000.A0E("instagram_ad_", "political_info_sheet_action"), r3);
        A03.A3L = str;
        A03.A2w = str2;
        A03.A53 = str3;
        A03.A3W = str4;
        A03.A50 = str5;
        A03(r2, A03.A03(), Constants.ONE);
    }

    public static void A0E(C37141jB r2, AnonymousClass1NJ r3, int i) {
        if (r3 != null && r3.A1W() && i != -1) {
            AnonymousClass1NJ A0P = r3.A0P(i);
            r2.A0k = i;
            r2.A3A = A0P.APo();
            r2.A39 = r3.A0P(0).APo();
            r2.A0n = r3.A07();
            r2.A0l = A0P.APx().A00;
            r2.A3u = r3.A24;
        }
    }

    public static void A0G(AnonymousClass0C1 r3, AnonymousClass0RU r4, String str, String str2, C27371Ho r7, int i, String str3, String str4) {
        C37141jB r2 = new C37141jB(AnonymousClass000.A0E("instagram_ad_", "hide_response"), r7, (C37121j9) null);
        r2.A50 = str2;
        r2.A4Y = str3;
        r2.A4i = str4;
        r2.A1y = C06270Ok.A00();
        A0E(r2, AnonymousClass1PZ.A00(r3).A02(str), i);
        A03(r4, r2.A03(), Constants.ONE);
    }

    public static void A0I(AnonymousClass0C1 r7, C37141jB r8, AnonymousClass1NJ r9, C27371Ho r10, int i, boolean z) {
        AnonymousClass0C1 r0 = r7;
        int i2 = i;
        A0J(r0, r8, r9, r10, i2, z, Constants.ZERO);
    }

    public static C37141jB A00(AnonymousClass0C1 r2, C27371Ho r3, C249616t r4, C37121j9 r5, boolean z, Integer num, String str, AnonymousClass1I6 r9) {
        String str2;
        String A04;
        switch (num.intValue()) {
            case 0:
                str2 = "brand_profile";
                break;
            case 1:
                str2 = "user_profile";
                break;
            case 2:
                str2 = "influencer_profile";
                break;
            default:
                str2 = "";
                break;
        }
        C37141jB A02 = A02(str2, r3, r4, r5);
        if (A0O(r4, r3)) {
            A02.A2e = Boolean.valueOf(z);
            if (num == Constants.ZERO && (A04 = C33501d1.A00(r2).A04()) != null) {
                A02.A3S = A04;
            }
        }
        A02.A4i = str;
        if (r9 != null) {
            A02.A4c = r9.AVo();
        }
        return A02;
    }

    public static C37141jB A02(String str, C27371Ho r2, C249616t r3, C37121j9 r4) {
        String str2;
        if (A0O(r3, r2)) {
            str2 = "instagram_ad_";
        } else {
            str2 = "instagram_organic_";
        }
        return new C37141jB(AnonymousClass000.A0E(str2, str), r2, r4);
    }

    public static void A06(AnonymousClass0RU r1, C37141jB r2, Integer num) {
        A03(r1, r2.A03(), num);
    }

    public static void A0D(AnonymousClass0RU r1, String str, C27371Ho r3, C249616t r4, C37121j9 r5, Integer num) {
        if (A0M(r4, r3)) {
            A09(r1, r3, r4, A02(str, r3, r4, r5).A03(), num);
        }
    }

    public static void A0J(AnonymousClass0C1 r3, C37141jB r4, AnonymousClass1NJ r5, C27371Ho r6, int i, boolean z, Integer num) {
        List<ProductMention> list;
        AnonymousClass0RU A01 = AnonymousClass0WN.A01(r3);
        A0E(r4, r5, i);
        if (z && r5.A1W() && i != -1) {
            AnonymousClass1NJ A0P = r5.A0P(i);
            ArrayList arrayList = new ArrayList();
            ArrayList A11 = A0P.A11();
            if (!AnonymousClass0OX.A00(A11)) {
                Iterator it = A11.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ProductTag) it.next()).A01);
                }
            }
            instagramComment r0 = r5.A0K;
            if (r0 != null) {
                list = r0.A04();
            } else {
                list = null;
            }
            if (!AnonymousClass0OX.A00(list)) {
                for (ProductMention productMention : list) {
                    arrayList.add(productMention.A02);
                }
            }
            if (!AnonymousClass0OX.A00(arrayList)) {
                r4.A5C = arrayList;
            } else {
                r4.A5C = null;
            }
        }
        A05(A01, r4, r5, r6, num);
    }

    public static void A0K(AnonymousClass0C1 r2, String str, AnonymousClass1NJ r4, C27371Ho r5, int i, int i2, String str2, String str3) {
        if (A0M(r4, r5)) {
            C37141jB A01 = C37591ju.A01(str, r4, r5);
            A01.A0B(r2, r4);
            A01.A14 = i2;
            A01.A53 = str2;
            A01.A2w = str3;
            String A04 = C33501d1.A00(r2).A04();
            if (A04 != null) {
                A01.A3S = A04;
            }
            A0H(r2, A01, r4, r5, i);
        }
    }

    public static boolean A0M(C249616t r1, C27371Ho r2) {
        if (A0N(r1, r2) || A0O(r1, r2) || r1.Afk()) {
            return true;
        }
        return false;
    }

    public static boolean A0N(C249616t r0, C27371Ho r1) {
        if (!r0.Agp() || !r1.Ago()) {
            return false;
        }
        return true;
    }

    public static boolean A0O(C249616t r0, C27371Ho r1) {
        if (!r0.Aho() || !r1.Ahq()) {
            return false;
        }
        return true;
    }
}
