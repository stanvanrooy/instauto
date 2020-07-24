package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.textwithentities.Entity;
import com.instagram.common.textwithentities.InlineStyleAtRange;
import com.instagram.common.textwithentities.Range;
import com.instagram.common.textwithentities.TextWithEntities;
import com.instagram.common.textwithentities.TextWithEntitiesBlock;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductCheckoutProperties;
import com.instagram.model.shopping.ProductImageContainer;
import com.instagram.model.shopping.ProductLaunchInformation;
import com.instagram.model.shopping.ProductUntaggableReason;
import com.instagram.model.shopping.ProductVariantValue;
import com.instagram.model.shopping.ShippingAndReturnsMetadata;
import com.instagram.model.shopping.incentives.sellerfunded.Incentive;
import com.instagram.model.shopping.incentives.sellerfunded.IncentiveContainer;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.util.ArrayList;

/* renamed from: X.1wt  reason: invalid class name and case insensitive filesystem */
public final class C44861wt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v17, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v27, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v29, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v31 */
    /* JADX WARNING: type inference failed for: r3v32 */
    /* JADX WARNING: type inference failed for: r3v33 */
    /* JADX WARNING: type inference failed for: r3v34 */
    /* JADX WARNING: type inference failed for: r3v35 */
    /* JADX WARNING: type inference failed for: r3v36 */
    /* JADX WARNING: type inference failed for: r3v37 */
    /* JADX WARNING: type inference failed for: r3v38 */
    /* JADX WARNING: type inference failed for: r3v39 */
    /* JADX WARNING: type inference failed for: r3v40 */
    /* JADX WARNING: type inference failed for: r3v41 */
    /* JADX WARNING: type inference failed for: r3v42 */
    /* JADX WARNING: type inference failed for: r3v43 */
    /* JADX WARNING: type inference failed for: r3v44 */
    /* JADX WARNING: type inference failed for: r3v45 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static Product parseFromJson(C13080hr r4) {
        Product product = new Product();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("has_viewer_saved".equals(A0i)) {
                product.A0Q = r4.A0O();
            } else if ("can_share_to_story".equals(A0i)) {
                product.A0P = r4.A0O();
            } else if ("can_see_insights_for_viewer".equals(A0i)) {
                product.A0O = r4.A0O();
            } else if ("incentive_information".equals(A0i)) {
                product.A09 = C172617Zg.parseFromJson(r4);
            } else {
                ? r3 = 0;
                if ("product_images".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            ProductImageContainer parseFromJson = AnonymousClass232.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                        r3 = arrayList;
                    }
                    product.A0L = r3;
                } else if ("variant_values".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList2 = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            ProductVariantValue parseFromJson2 = AnonymousClass9JB.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                        r3 = arrayList2;
                    }
                    product.A0N = r3;
                } else if ("merchant".equals(A0i)) {
                    product.A02 = C44871wu.parseFromJson(r4);
                } else if ("checkout_properties".equals(A0i)) {
                    product.A03 = C50062Et.parseFromJson(r4);
                } else if ("launch_information".equals(A0i)) {
                    product.A06 = AnonymousClass963.parseFromJson(r4);
                } else if ("main_image".equals(A0i)) {
                    product.A04 = AnonymousClass232.parseFromJson(r4);
                } else if ("thumbnail_image".equals(A0i)) {
                    product.A05 = AnonymousClass232.parseFromJson(r4);
                } else if ("review_status".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    product.A07 = AnonymousClass230.A00(r3);
                } else if ("checkout_style".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    product.A0A = r3;
                } else if ("current_price".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    product.A0C = r3;
                } else if ("description".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    product.A0E = r3;
                } else if ("rich_text_description".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList3 = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            TextWithEntitiesBlock parseFromJson3 = AnonymousClass26I.parseFromJson(r4);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                        r3 = arrayList3;
                    }
                    product.A0M = r3;
                } else if ("external_url".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    product.A0F = r3;
                } else if ("full_price".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    product.A0G = r3;
                } else if ("current_price_stripped".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    product.A0D = r3;
                } else if ("full_price_stripped".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    product.A0H = r3;
                } else if ("name".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    product.A0I = r3;
                } else if ("product_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    product.A0J = r3;
                } else if ("compound_product_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    product.A0B = r3;
                } else if ("retailer_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    product.A0K = r3;
                } else if ("untaggable_reason".equals(A0i)) {
                    product.A08 = C25659BTt.parseFromJson(r4);
                }
            }
            r4.A0f();
        }
        product.A01 = System.currentTimeMillis();
        Product.A00(product);
        if (product.A0D == null) {
            product.A0D = product.A0C;
        }
        if (product.A0H == null) {
            product.A0H = product.A0G;
        }
        return product;
    }

    public static void A00(C13460iZ r9, Product product) {
        r9.A0T();
        r9.A0I("has_viewer_saved", product.A0Q);
        r9.A0I("can_share_to_story", product.A0P);
        r9.A0I("can_see_insights_for_viewer", product.A0O);
        if (product.A09 != null) {
            r9.A0d("incentive_information");
            IncentiveContainer incentiveContainer = product.A09;
            r9.A0T();
            if (incentiveContainer.A00 != null) {
                r9.A0d("incentives");
                r9.A0S();
                for (Incentive incentive : incentiveContainer.A00) {
                    if (incentive != null) {
                        r9.A0T();
                        String str = incentive.A00;
                        if (str != null) {
                            r9.A0H("id", str);
                        }
                        String str2 = incentive.A01;
                        if (str2 != null) {
                            r9.A0H("name", str2);
                        }
                        r9.A0Q();
                    }
                }
                r9.A0P();
            }
            r9.A0Q();
        }
        if (product.A0L != null) {
            r9.A0d("product_images");
            r9.A0S();
            for (ProductImageContainer productImageContainer : product.A0L) {
                if (productImageContainer != null) {
                    AnonymousClass232.A00(r9, productImageContainer);
                }
            }
            r9.A0P();
        }
        if (product.A0N != null) {
            r9.A0d("variant_values");
            r9.A0S();
            for (ProductVariantValue productVariantValue : product.A0N) {
                if (productVariantValue != null) {
                    r9.A0T();
                    String str3 = productVariantValue.A01;
                    if (str3 != null) {
                        r9.A0H("id", str3);
                    }
                    String str4 = productVariantValue.A02;
                    if (str4 != null) {
                        r9.A0H("name", str4);
                    }
                    String str5 = productVariantValue.A03;
                    if (str5 != null) {
                        r9.A0H("value", str5);
                    }
                    AnonymousClass9JI r0 = productVariantValue.A00;
                    if (r0 != null) {
                        r9.A0H("visual_style", r0.A00);
                    }
                    r9.A0I("is_preselected", productVariantValue.A04);
                    r9.A0Q();
                }
            }
            r9.A0P();
        }
        if (product.A02 != null) {
            r9.A0d("merchant");
            C44871wu.A00(r9, product.A02);
        }
        if (product.A03 != null) {
            r9.A0d("checkout_properties");
            ProductCheckoutProperties productCheckoutProperties = product.A03;
            r9.A0T();
            r9.A0I("has_free_shipping", productCheckoutProperties.A08);
            r9.A0I("can_add_to_bag", productCheckoutProperties.A06);
            r9.A0F("inventory_quantity", productCheckoutProperties.A00);
            r9.A0I("product_group_has_inventory", productCheckoutProperties.A09);
            if (productCheckoutProperties.A02 != null) {
                r9.A0d("currency_amount");
                C222829ig.A00(r9, productCheckoutProperties.A02);
            }
            String str6 = productCheckoutProperties.A05;
            if (str6 != null) {
                r9.A0H("receiver_id", str6);
            }
            String str7 = productCheckoutProperties.A04;
            if (str7 != null) {
                r9.A0H("ig_referrer_fbid", str7);
            }
            if (productCheckoutProperties.A03 != null) {
                r9.A0d("shipping_and_return");
                ShippingAndReturnsMetadata shippingAndReturnsMetadata = productCheckoutProperties.A03;
                r9.A0T();
                if (shippingAndReturnsMetadata.A00 != null) {
                    r9.A0d("return_cost");
                    C222829ig.A00(r9, shippingAndReturnsMetadata.A00);
                }
                if (shippingAndReturnsMetadata.A01 != null) {
                    r9.A0d("shipping_cost");
                    C222829ig.A00(r9, shippingAndReturnsMetadata.A01);
                }
                r9.A0Q();
            }
            r9.A0F("viewer_purchase_limit", productCheckoutProperties.A01);
            r9.A0I("can_enable_restock_reminder", productCheckoutProperties.A07);
            r9.A0Q();
        }
        if (product.A06 != null) {
            r9.A0d("launch_information");
            ProductLaunchInformation productLaunchInformation = product.A06;
            r9.A0T();
            r9.A0G("launch_date", productLaunchInformation.A00);
            r9.A0I("has_launched", productLaunchInformation.A01);
            r9.A0Q();
        }
        if (product.A04 != null) {
            r9.A0d("main_image");
            AnonymousClass232.A00(r9, product.A04);
        }
        if (product.A05 != null) {
            r9.A0d("thumbnail_image");
            AnonymousClass232.A00(r9, product.A05);
        }
        AnonymousClass230 r02 = product.A07;
        if (r02 != null) {
            r9.A0H("review_status", r02.A00);
        }
        String str8 = product.A0A;
        if (str8 != null) {
            r9.A0H("checkout_style", str8);
        }
        String str9 = product.A0C;
        if (str9 != null) {
            r9.A0H("current_price", str9);
        }
        String str10 = product.A0E;
        if (str10 != null) {
            r9.A0H("description", str10);
        }
        if (product.A0M != null) {
            r9.A0d("rich_text_description");
            r9.A0S();
            for (TextWithEntitiesBlock textWithEntitiesBlock : product.A0M) {
                if (textWithEntitiesBlock != null) {
                    r9.A0T();
                    C25980BdZ bdZ = textWithEntitiesBlock.A01;
                    if (bdZ != null) {
                        r9.A0H("block_type", bdZ.toString());
                    }
                    r9.A0F("depth", textWithEntitiesBlock.A00);
                    if (textWithEntitiesBlock.A02 != null) {
                        r9.A0d("text_with_entities");
                        TextWithEntities textWithEntities = textWithEntitiesBlock.A02;
                        r9.A0T();
                        String str11 = textWithEntities.A00;
                        if (str11 != null) {
                            r9.A0H("text", str11);
                        }
                        if (textWithEntities.A01 != null) {
                            r9.A0d("inline_style_ranges");
                            r9.A0S();
                            for (InlineStyleAtRange inlineStyleAtRange : textWithEntities.A01) {
                                if (inlineStyleAtRange != null) {
                                    r9.A0T();
                                    r9.A0F("length", inlineStyleAtRange.A00);
                                    r9.A0F("offset", inlineStyleAtRange.A01);
                                    C25972BdR bdR = inlineStyleAtRange.A02;
                                    if (bdR != null) {
                                        r9.A0F("inline_style", bdR.A00);
                                    }
                                    r9.A0Q();
                                }
                            }
                            r9.A0P();
                        }
                        if (textWithEntities.A02 != null) {
                            r9.A0d("ranges");
                            r9.A0S();
                            for (Range range : textWithEntities.A02) {
                                if (range != null) {
                                    r9.A0T();
                                    if (range.A02 != null) {
                                        r9.A0d("entity");
                                        Entity entity = range.A02;
                                        r9.A0T();
                                        String str12 = entity.A01;
                                        if (str12 != null) {
                                            r9.A0H("typename", str12);
                                        }
                                        String str13 = entity.A02;
                                        if (str13 != null) {
                                            r9.A0H(IgReactNavigatorModule.URL, str13);
                                        }
                                        String str14 = entity.A00;
                                        if (str14 != null) {
                                            r9.A0H("id", str14);
                                        }
                                        r9.A0Q();
                                    }
                                    r9.A0F("length", range.A00);
                                    r9.A0F("offset", range.A01);
                                    r9.A0Q();
                                }
                            }
                            r9.A0P();
                        }
                        r9.A0Q();
                    }
                    r9.A0Q();
                }
            }
            r9.A0P();
        }
        String str15 = product.A0F;
        if (str15 != null) {
            r9.A0H("external_url", str15);
        }
        String str16 = product.A0G;
        if (str16 != null) {
            r9.A0H("full_price", str16);
        }
        String str17 = product.A0D;
        if (str17 != null) {
            r9.A0H("current_price_stripped", str17);
        }
        String str18 = product.A0H;
        if (str18 != null) {
            r9.A0H("full_price_stripped", str18);
        }
        String str19 = product.A0I;
        if (str19 != null) {
            r9.A0H("name", str19);
        }
        String str20 = product.A0J;
        if (str20 != null) {
            r9.A0H("product_id", str20);
        }
        String str21 = product.A0B;
        if (str21 != null) {
            r9.A0H("compound_product_id", str21);
        }
        String str22 = product.A0K;
        if (str22 != null) {
            r9.A0H("retailer_id", str22);
        }
        if (product.A08 != null) {
            r9.A0d("untaggable_reason");
            ProductUntaggableReason productUntaggableReason = product.A08;
            r9.A0T();
            Integer num = productUntaggableReason.A02;
            if (num != null) {
                r9.A0H("taggability_state", C25658BTr.A01(num));
            }
            String str23 = productUntaggableReason.A04;
            if (str23 != null) {
                r9.A0H(DialogModule.KEY_TITLE, str23);
            }
            String str24 = productUntaggableReason.A03;
            if (str24 != null) {
                r9.A0H("description", str24);
            }
            if (productUntaggableReason.A01 != null) {
                r9.A0d("help_link");
                C156316lw.A00(r9, productUntaggableReason.A01);
            }
            if (productUntaggableReason.A00 != null) {
                r9.A0d("action");
                C156316lw.A00(r9, productUntaggableReason.A00);
            }
            r9.A0Q();
        }
        r9.A0Q();
    }
}
