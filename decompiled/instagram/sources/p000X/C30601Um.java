package p000X;

import android.view.View;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* renamed from: X.1Um  reason: invalid class name and case insensitive filesystem */
public final class C30601Um {
    public final C28051Kf A00;
    public final C28121Km A01 = new C28121Km();
    public final C30621Uo A02;
    public final C30641Uq A03;

    public C30601Um(C28051Kf r30, C27371Ho r31, AnonymousClass0C1 r32, String str, String str2, String str3, AnonymousClass2KX r36, ExploreTopicCluster exploreTopicCluster, String str4, String str5, String str6, String str7, String str8) {
        this.A00 = r30;
        String str9 = str;
        AnonymousClass0C1 r7 = r32;
        C27371Ho r6 = r31;
        String str10 = str7;
        String str11 = str8;
        String str12 = str5;
        String str13 = str4;
        ExploreTopicCluster exploreTopicCluster2 = exploreTopicCluster;
        C30611Un r18 = new C30611Un(r6, r7, str9, str3, str12, str6, str13, exploreTopicCluster2, str10, str11);
        this.A02 = new C30621Uo(new C30631Up(), C28191Kt.A00(r7).A01(), r18);
        this.A03 = new C30641Uq(r6, r7, str9, new C30651Ur(), C28191Kt.A00(r7).A01(), str2, r36, exploreTopicCluster2, str13, str12, str10, str11);
    }

    public static String A00(ProductFeedItem productFeedItem, String str) {
        String A0E = AnonymousClass000.A0E("product_pivot_impression_", productFeedItem.getId());
        if (str != null) {
            return AnonymousClass000.A0J(A0E, "_", str);
        }
        return A0E;
    }

    public final void A01(View view, ProductFeedItem productFeedItem, String str) {
        this.A00.A03(view, this.A01.A00(A00(productFeedItem, str)));
    }

    public final void A02(View view, C215309Ps r4, String str) {
        this.A00.A03(view, this.A01.A00(new C213899Ke(r4, str).A00()));
    }

    public final void A03(ProductFeedItem productFeedItem, String str, AnonymousClass9Q0 r7) {
        C155366kI r1 = new C155366kI(productFeedItem, str);
        C28121Km r3 = this.A01;
        String AWN = r7.A02.AWN();
        String A002 = A00(productFeedItem, AWN);
        C30231Ta A003 = AnonymousClass1TY.A00(r1, r7, A00(productFeedItem, AWN));
        A003.A00(this.A03);
        r3.A01(A002, A003.A02());
    }

    public final void A04(C215309Ps r6, String str, int i) {
        C213899Ke r4 = new C213899Ke(r6, str);
        C28121Km r3 = this.A01;
        String A002 = r4.A00();
        C30231Ta A003 = AnonymousClass1TY.A00(r4, Integer.valueOf(i), r4.A00());
        A003.A00(this.A02);
        r3.A01(A002, A003.A02());
    }
}
