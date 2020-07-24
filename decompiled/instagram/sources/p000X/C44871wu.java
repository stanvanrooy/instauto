package p000X;

import com.instagram.model.shopping.Merchant;

/* renamed from: X.1wu  reason: invalid class name and case insensitive filesystem */
public final class C44871wu {
    public static Merchant parseFromJson(C13080hr r4) {
        Merchant merchant = new Merchant();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("pk".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                merchant.A02 = str;
            } else if ("username".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                merchant.A03 = str;
            } else if ("profile_pic_url".equals(A0i)) {
                merchant.A00 = C13270iF.A00(r4);
            } else if ("show_shoppable_feed".equals(A0i)) {
                merchant.A05 = r4.A0O();
            } else if ("merchant_checkout_style".equals(A0i)) {
                merchant.A01 = (C44841wq) C44841wq.A01.get(r4.A0r());
            } else if ("is_verified".equals(A0i)) {
                merchant.A04 = r4.A0O();
            }
            r4.A0f();
        }
        return merchant;
    }

    public static void A00(C13460iZ r2, Merchant merchant) {
        r2.A0T();
        String str = merchant.A02;
        if (str != null) {
            r2.A0H("pk", str);
        }
        String str2 = merchant.A03;
        if (str2 != null) {
            r2.A0H("username", str2);
        }
        if (merchant.A00 != null) {
            r2.A0d("profile_pic_url");
            C13270iF.A01(r2, merchant.A00);
        }
        r2.A0I("show_shoppable_feed", merchant.A05);
        C44841wq r0 = merchant.A01;
        if (r0 != null) {
            r2.A0H("merchant_checkout_style", r0.A00);
        }
        r2.A0I("is_verified", merchant.A04);
        r2.A0Q();
    }
}
