package p000X;

import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.productfeed.ButtonDestination;

/* renamed from: X.1Uo  reason: invalid class name and case insensitive filesystem */
public final class C30621Uo extends AnonymousClass1SZ {
    public final C30611Un A00;

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        String id;
        C213899Ke r8 = (C213899Ke) obj;
        Integer num = (Integer) obj2;
        C215309Ps r5 = r8.A00;
        if (r5 instanceof AnonymousClass9VP) {
            this.A00.A00(r5, ((AnonymousClass9VP) r5).AXA(), num);
            return;
        }
        C30611Un r4 = this.A00;
        String str = r8.A01;
        C92143yg r2 = new C92143yg(r4.A00.A02("instagram_shopping_product_hscroll_impression"));
        if (r2.A0B()) {
            r2.A08("prior_module", r4.A06);
            r2.A08("prior_submodule", r4.A07);
            r2.A08("submodule", str);
            r2.A08("shopping_session_id", r4.A08);
            AnonymousClass9Q3 ALh = r5.ALh();
            if (ALh != null) {
                id = ALh.toString();
            } else {
                id = r5.getId();
            }
            r2.A08("product_collection_type", id);
            String str2 = r4.A04;
            if (str2 != null) {
                r2.A07("merchant_id", Long.valueOf(Long.parseLong(str2)));
            }
            r2.A01();
        }
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        String id;
        Merchant merchant;
        C213899Ke r8 = (C213899Ke) obj;
        Integer num = (Integer) obj2;
        C215309Ps r5 = r8.A00;
        if (r5 instanceof AnonymousClass9VP) {
            C30611Un r4 = this.A00;
            String AXA = ((AnonymousClass9VP) r5).AXA();
            C92173yj r3 = new C92173yj(r4.A00.A02("instagram_shopping_product_pivots_sub_impression"));
            if (r3.A0B()) {
                r3.A07("chaining_position", Long.valueOf((long) num.intValue()));
                r3.A08("m_pk", r5.AWN());
                r3.A08("source_media_type", r5.AWO());
                r3.A08("parent_m_pk", r4.A05);
                r3.A08("submodule", AXA);
                r3.A08("prior_module", r4.A06);
                r3.A08("prior_submodule", r4.A07);
                r3.A08("session_id", r4.A03);
                r3.A08("chaining_session_id", r4.A02);
                r3.A08("shopping_session_id", r4.A08);
                ExploreTopicCluster exploreTopicCluster = r4.A01;
                if (exploreTopicCluster != null) {
                    r3.A08("topic_cluster_id", exploreTopicCluster.A05);
                    r3.A08("topic_cluster_title", r4.A01.A07);
                    r3.A08("topic_cluster_type", r4.A01.A01.A00);
                    r3.A08("topic_cluster_debug_info", r4.A01.A04);
                }
                ButtonDestination AHN = r5.AHN();
                if (!(AHN == null || (merchant = AHN.A00) == null)) {
                    r3.A07("merchant_id", Long.valueOf(Long.parseLong(merchant.A02)));
                }
                r3.A01();
                return;
            }
            return;
        }
        C30611Un r42 = this.A00;
        String str = r8.A01;
        C92153yh r2 = new C92153yh(r42.A00.A02("instagram_shopping_product_hscroll_sub_impression"));
        if (r2.A0B()) {
            r2.A08("prior_module", r42.A06);
            r2.A08("prior_submodule", r42.A07);
            r2.A08("submodule", str);
            r2.A08("shopping_session_id", r42.A08);
            AnonymousClass9Q3 ALh = r5.ALh();
            if (ALh != null) {
                id = ALh.toString();
            } else {
                id = r5.getId();
            }
            r2.A08("product_collection_type", id);
            String str2 = r42.A04;
            if (str2 != null) {
                r2.A07("merchant_id", Long.valueOf(Long.parseLong(str2)));
            }
            r2.A01();
        }
    }

    public C30621Uo(AnonymousClass1L0 r1, C13740j9 r2, C30611Un r3) {
        super(r2, r1);
        this.A00 = r3;
    }
}
