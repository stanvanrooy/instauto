package p000X;

import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* renamed from: X.1Us  reason: invalid class name and case insensitive filesystem */
public final class C30661Us {
    public final AnonymousClass0QT A00;
    public final C219489d9 A01;
    public final ExploreTopicCluster A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public final AnonymousClass9RJ A00(ProductFeedItem productFeedItem, int i, int i2) {
        return new AnonymousClass9RJ(this, productFeedItem, i, i2);
    }

    public final void A01(Product product, int i, int i2, String str) {
        C92133yf r2 = new C92133yf(this.A00.A02("instagram_shopping_product_card_dismiss"));
        if (r2.A0B()) {
            String A002 = C71813Cg.A00(i, i2);
            r2.A07("merchant_id", Long.valueOf(Long.parseLong(product.A02.A02)));
            r2.A07("product_id", Long.valueOf(Long.parseLong(product.getId())));
            r2.A04("is_checkout_enabled", Boolean.valueOf(product.A09()));
            r2.A08("position", A002);
            r2.A08("shopping_session_id", this.A0D);
            r2.A08("prior_module", this.A09);
            r2.A08("from", str);
            r2.A08("current_price", product.A0D);
            r2.A08("full_price", product.A0H);
            r2.A04("is_on_sale", Boolean.valueOf(product.A0B()));
            ExploreTopicCluster exploreTopicCluster = this.A02;
            if (exploreTopicCluster != null) {
                r2.A08("topic_cluster_id", exploreTopicCluster.A05);
                r2.A08("topic_cluster_title", this.A02.A07);
                r2.A08("topic_cluster_type", this.A02.A01.A00);
            }
            r2.A01();
        }
    }

    public C30661Us(AnonymousClass0C1 r2, AnonymousClass0RN r3, String str, String str2, String str3, String str4, String str5, ExploreTopicCluster exploreTopicCluster, String str6, String str7, String str8, String str9, String str10, C219489d9 r15, Long l) {
        this.A00 = AnonymousClass0QT.A00(r2, r3);
        this.A0D = str;
        this.A07 = str2;
        this.A0C = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A02 = exploreTopicCluster;
        this.A06 = str6;
        this.A04 = str7;
        this.A08 = str8;
        this.A05 = str9;
        this.A0B = str10;
        this.A01 = r15;
        this.A03 = l;
        this.A0E = C30671Ut.A0C(r2, str2);
    }
}
