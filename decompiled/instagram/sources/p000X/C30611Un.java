package p000X;

import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.productfeed.ButtonDestination;

/* renamed from: X.1Un  reason: invalid class name and case insensitive filesystem */
public final class C30611Un {
    public final AnonymousClass0QT A00;
    public final ExploreTopicCluster A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final void A00(C215309Ps r4, String str, Integer num) {
        Merchant merchant;
        C92163yi r2 = new C92163yi(this.A00.A02("instagram_shopping_product_pivots_impression"));
        if (r2.A0B()) {
            r2.A07("chaining_position", Long.valueOf((long) num.intValue()));
            r2.A08("m_pk", r4.AWN());
            r2.A08("source_media_type", r4.AWO());
            r2.A08("parent_m_pk", this.A05);
            r2.A08("submodule", str);
            r2.A08("prior_module", this.A06);
            r2.A08("prior_submodule", this.A07);
            r2.A08("session_id", this.A03);
            r2.A08("chaining_session_id", this.A02);
            r2.A08("shopping_session_id", this.A08);
            ExploreTopicCluster exploreTopicCluster = this.A01;
            if (exploreTopicCluster != null) {
                r2.A08("topic_cluster_id", exploreTopicCluster.A05);
                r2.A08("topic_cluster_title", this.A01.A07);
                r2.A08("topic_cluster_type", this.A01.A01.A00);
                r2.A08("topic_cluster_debug_info", this.A01.A04);
            }
            ButtonDestination AHN = r4.AHN();
            if (!(AHN == null || (merchant = AHN.A00) == null)) {
                r2.A07("merchant_id", Long.valueOf(Long.parseLong(merchant.A02)));
            }
            r2.A01();
        }
    }

    public C30611Un(C27371Ho r2, AnonymousClass0C1 r3, String str, String str2, String str3, String str4, String str5, ExploreTopicCluster exploreTopicCluster, String str6, String str7) {
        this.A00 = AnonymousClass0QT.A00(r3, r2);
        this.A08 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = str5;
        this.A01 = exploreTopicCluster;
        this.A02 = str6;
        this.A05 = str7;
    }
}
