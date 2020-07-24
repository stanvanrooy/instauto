package p000X;

import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadata;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.model.shopping.reels.ShoppingDestinationMetadata;
import com.instagram.model.shopping.reels.ShoppingIncentiveMetadata;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1jF  reason: invalid class name and case insensitive filesystem */
public final class C37181jF {
    public static Map A00(ProfileShopLink profileShopLink, ProductCollectionLink productCollectionLink, ReelProductLink reelProductLink) {
        String str;
        String str2;
        if (profileShopLink == null && productCollectionLink == null && reelProductLink == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (profileShopLink != null) {
            hashMap.put("shopping_swipe_up_destination_type", "profile_shop");
            hashMap.put("profile_shop_user_id", profileShopLink.A01);
        }
        if (productCollectionLink != null) {
            hashMap.put("shopping_swipe_up_destination_type", "shopping_product_collections");
            hashMap.put("destination_type", productCollectionLink.A02);
            ShoppingDestinationMetadata shoppingDestinationMetadata = productCollectionLink.A00;
            ShoppingIncentiveMetadata shoppingIncentiveMetadata = shoppingDestinationMetadata.A01;
            ProductCollectionLinkMetadata productCollectionLinkMetadata = shoppingDestinationMetadata.A00;
            if (shoppingIncentiveMetadata != null) {
                hashMap.put("merchant_id", shoppingIncentiveMetadata.A01);
                str = shoppingIncentiveMetadata.A00;
                str2 = "incentive_id";
            } else if (productCollectionLinkMetadata != null) {
                hashMap.put("merchant_id", productCollectionLinkMetadata.A02);
                str = productCollectionLinkMetadata.A03;
                str2 = "product_collection_id";
            }
            hashMap.put(str2, str);
        }
        if (reelProductLink != null) {
            Product product = reelProductLink.A00;
            hashMap.put("shopping_swipe_up_destination_type", "instagram_shopping_pdp");
            hashMap.put("product_id", product.getId());
            hashMap.put("merchant_id", product.A02.A02);
        }
        return hashMap;
    }
}
