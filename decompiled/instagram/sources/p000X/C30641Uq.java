package p000X;

import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* renamed from: X.1Uq  reason: invalid class name and case insensitive filesystem */
public final class C30641Uq extends AnonymousClass1SZ {
    public final C30661Us A00;
    public final C27371Ho A01;
    public final AnonymousClass0C1 A02;
    public final AnonymousClass2KX A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30641Uq(C27371Ho r18, AnonymousClass0C1 r19, String str, AnonymousClass1L0 r21, C13740j9 r22, String str2, AnonymousClass2KX r24, ExploreTopicCluster exploreTopicCluster, String str3, String str4, String str5, String str6) {
        super(r22, r21);
        C27371Ho r3 = r18;
        this.A01 = r3;
        AnonymousClass0C1 r2 = r19;
        this.A02 = r2;
        this.A03 = r24;
        ExploreTopicCluster exploreTopicCluster2 = exploreTopicCluster;
        this.A00 = new C30661Us(r2, r3, str, str2, (String) null, str4, (String) null, exploreTopicCluster2, str3, str5, str6, (String) null, (String) null, (C219489d9) null, (Long) null);
    }

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        AnonymousClass9Q0 r8 = (AnonymousClass9Q0) obj2;
        ProductFeedItem productFeedItem = ((C155366kI) obj).A01;
        C215309Ps r5 = r8.A02;
        C30661Us r2 = this.A00;
        Object obj3 = r8.A04.get(productFeedItem.getId());
        AnonymousClass0a4.A06(obj3);
        AnonymousClass9RK r4 = new AnonymousClass9RK(r2, productFeedItem, 0, ((Integer) obj3).intValue());
        if (r5 != null) {
            AnonymousClass9Q3 ALh = r5.ALh();
            if (ALh != null) {
                r4.A00.A08("product_collection_type", ALh.toString());
            }
            String AWN = r5.AWN();
            if (AWN != null) {
                r4.A00.A08("m_pk", AWN);
            }
            String AWO = r5.AWO();
            if (AWO != null) {
                r4.A00.A08("source_media_type", AWO);
            }
            if (r5 instanceof MultiProductComponent) {
                r4.A00.A08("from", ((MultiProductComponent) r5).A00());
            }
        }
        String AWO2 = r8.A02.AWO();
        Integer valueOf = Integer.valueOf(r8.A01);
        if (AWO2 != null) {
            r4.A00.A08("source_media_type", AWO2);
        }
        if (valueOf != null) {
            r4.A00.A07("chaining_position", Long.valueOf(valueOf.longValue()));
        }
        String AXA = r5.AXA();
        if (AXA != null) {
            r4.A00.A08("submodule", AXA);
        }
        AnonymousClass9RM r1 = r4.A00;
        if (r1.A0B()) {
            r1.A01();
        }
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        AnonymousClass9Q0 r8 = (AnonymousClass9Q0) obj2;
        ProductFeedItem productFeedItem = ((C155366kI) obj).A01;
        C215309Ps r5 = r8.A02;
        C30661Us r2 = this.A00;
        Object obj3 = r8.A04.get(productFeedItem.getId());
        AnonymousClass0a4.A06(obj3);
        AnonymousClass9RL r4 = new AnonymousClass9RL(r2, productFeedItem, 0, ((Integer) obj3).intValue());
        if (r5 != null) {
            AnonymousClass9Q3 ALh = r5.ALh();
            if (ALh != null) {
                r4.A00.A08("product_collection_type", ALh.toString());
            }
            String AWN = r5.AWN();
            if (AWN != null) {
                r4.A00.A08("m_pk", AWN);
            }
            String AWO = r5.AWO();
            if (AWO != null) {
                r4.A00.A08("source_media_type", AWO);
            }
            if (r5 instanceof MultiProductComponent) {
                r4.A00.A08("from", ((MultiProductComponent) r5).A00());
            }
        }
        String AWO2 = r8.A02.AWO();
        Integer valueOf = Integer.valueOf(r8.A01);
        if (AWO2 != null) {
            r4.A00.A08("source_media_type", AWO2);
        }
        if (valueOf != null) {
            r4.A00.A07("chaining_position", Long.valueOf(valueOf.longValue()));
        }
        String AXA = r5.AXA();
        if (AXA != null) {
            r4.A00.A08("submodule", AXA);
        }
        AnonymousClass9RN r1 = r4.A00;
        if (r1.A0B()) {
            r1.A01();
        }
    }
}
