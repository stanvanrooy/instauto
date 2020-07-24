package p000X;

import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.1uY  reason: invalid class name and case insensitive filesystem */
public final class C43521uY {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C43531uZ parseFromJson(C13080hr r4) {
        C43531uZ r1 = new C43531uZ();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r3 = 0;
            if ("links".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        AnonymousClass1UP A00 = AnonymousClass1UP.A00(r4);
                        if (A00 != null) {
                            arrayList.add(A00);
                        }
                    }
                    r3 = arrayList;
                }
                r1.A09 = r3;
            } else if ("cta_title_type".equals(A0i)) {
                r1.A00 = r4.A0I();
            } else if ("felix_deep_link".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r1.A05 = r3;
            } else if ("felix_video_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r1.A06 = r3;
            } else if ("object_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r1.A07 = r3;
            } else if ("cta_type".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r1.A08 = r3;
            } else if ("profile_shop_link".equals(A0i)) {
                r1.A03 = C172577Zc.parseFromJson(r4);
            } else if ("has_instagram_shop_link".equals(A0i)) {
                r1.A0A = r4.A0O();
            } else if ("product_collection_link".equals(A0i)) {
                r1.A02 = C173127aW.parseFromJson(r4);
            } else if ("product_link".equals(A0i)) {
                r1.A04 = AnonymousClass6EY.parseFromJson(r4);
            } else if ("effect_preview".equals(A0i)) {
                r1.A01 = C43061th.parseFromJson(r4);
            }
            r4.A0f();
        }
        return r1;
    }

    public static void A00(C13460iZ r3, C43531uZ r4) {
        r3.A0T();
        if (r4.A09 != null) {
            r3.A0d("links");
            r3.A0S();
            for (AnonymousClass1UP r0 : r4.A09) {
                if (r0 != null) {
                    AnonymousClass2IO.A00(r3, r0);
                }
            }
            r3.A0P();
        }
        r3.A0F("cta_title_type", r4.A00);
        String str = r4.A05;
        if (str != null) {
            r3.A0H("felix_deep_link", str);
        }
        String str2 = r4.A06;
        if (str2 != null) {
            r3.A0H("felix_video_id", str2);
        }
        String str3 = r4.A07;
        if (str3 != null) {
            r3.A0H("object_id", str3);
        }
        String str4 = r4.A08;
        if (str4 != null) {
            r3.A0H("cta_type", str4);
        }
        if (r4.A03 != null) {
            r3.A0d("profile_shop_link");
            ProfileShopLink profileShopLink = r4.A03;
            r3.A0T();
            String str5 = profileShopLink.A01;
            if (str5 != null) {
                r3.A0H("profile_shop_user_id", str5);
            }
            String str6 = profileShopLink.A02;
            if (str6 != null) {
                r3.A0H("profile_shop_username", str6);
            }
            String str7 = profileShopLink.A00;
            if (str7 != null) {
                r3.A0H("profile_shop_image_url", str7);
            }
            if (profileShopLink.A03 != null) {
                r3.A0d("profile_shop_filter_attributes");
                r3.A0T();
                for (Map.Entry entry : profileShopLink.A03.entrySet()) {
                    r3.A0d((String) entry.getKey());
                    if (entry.getValue() == null) {
                        r3.A0R();
                    } else {
                        r3.A0g((String) entry.getValue());
                    }
                }
                r3.A0Q();
            }
            r3.A0Q();
        }
        r3.A0I("has_instagram_shop_link", r4.A0A);
        if (r4.A02 != null) {
            r3.A0d("product_collection_link");
            ProductCollectionLink productCollectionLink = r4.A02;
            r3.A0T();
            String str8 = productCollectionLink.A02;
            if (str8 != null) {
                r3.A0H("destination_type", str8);
            }
            String str9 = productCollectionLink.A01;
            if (str9 != null) {
                r3.A0H("destination_title", str9);
            }
            if (productCollectionLink.A00 != null) {
                r3.A0d("destination_metadata");
                C173107aT.A00(r3, productCollectionLink.A00);
            }
            r3.A0Q();
        }
        if (r4.A04 != null) {
            r3.A0d("product_link");
            ReelProductLink reelProductLink = r4.A04;
            r3.A0T();
            if (reelProductLink.A00 != null) {
                r3.A0d("product");
                C44861wt.A00(r3, reelProductLink.A00);
            }
            r3.A0Q();
        }
        if (r4.A01 != null) {
            r3.A0d("effect_preview");
            C43061th.A00(r3, r4.A01);
        }
        r3.A0Q();
    }
}
