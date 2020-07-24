package p000X;

import android.content.Context;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoAttributionConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetMode;
import com.instagram.feed.media.AttributionUser;
import com.instagram.feed.media.CreativeConfig;
import com.instagram.feed.media.EffectActionSheet;
import com.instagram.feed.media.EffectPreview;
import com.instagram.feed.media.ProfilePicture;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.model.shopping.ProductItemWithAR;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Vo  reason: invalid class name and case insensitive filesystem */
public final class C30881Vo implements C11200ea {
    public final /* synthetic */ C30841Vk A00;

    public C30881Vo(C30841Vk r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b3, code lost:
        if ("SAVED".equals(r0.A08) == false) goto L_0x00b5;
     */
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        ImmutableList A09;
        String str;
        AttributionUser attributionUser;
        AttributionUser attributionUser2;
        AttributionUser attributionUser3;
        ImageUrl imageUrl;
        boolean z;
        EffectActionSheet effectActionSheet;
        List arrayList;
        EffectActionSheet effectActionSheet2;
        List arrayList2;
        String str2;
        EffectInfoBottomSheetMode effectInfoBottomSheetMode;
        C43091tn r1;
        String str3;
        int A03 = AnonymousClass0Z0.A03(1154191800);
        int A032 = AnonymousClass0Z0.A03(-74277351);
        AnonymousClass1NJ r0 = ((C34051dv) obj).A00;
        C30841Vk r10 = this.A00;
        Map unmodifiableMap = Collections.unmodifiableMap(r0.A3F);
        Context context = r10.A00.getContext();
        if (context != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it = unmodifiableMap.values().iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                CreativeConfig creativeConfig = (CreativeConfig) it.next();
                if (!creativeConfig.A03()) {
                    EffectPreview effectPreview = creativeConfig.A01;
                    if (effectPreview != null) {
                        str3 = effectPreview.A05;
                    } else {
                        str3 = creativeConfig.A03;
                    }
                    AnonymousClass0QD.A01("MediaFeedbackHelper", AnonymousClass000.A0E("Receiving invalid creative config for effect: ", str3));
                } else {
                    String str4 = creativeConfig.A06;
                    if (!C235310t.A00(context)) {
                        str4 = context.getResources().getString(C0003R.string.unsupported_device);
                    }
                    EffectInfoAttributionConfiguration effectInfoAttributionConfiguration = new EffectInfoAttributionConfiguration();
                    String str5 = creativeConfig.A04;
                    EffectPreview effectPreview2 = creativeConfig.A01;
                    if (effectPreview2 != null) {
                        str = effectPreview2.A05;
                    } else {
                        str = creativeConfig.A03;
                    }
                    ImageUrl imageUrl2 = effectPreview2.A02.A00;
                    if (effectPreview2 != null) {
                        attributionUser = effectPreview2.A00;
                    } else {
                        attributionUser = creativeConfig.A00;
                    }
                    String str6 = attributionUser.A02;
                    ProductItemWithAR productItemWithAR = creativeConfig.A02;
                    if (productItemWithAR != null) {
                        str6 = productItemWithAR.A00.A02.A03;
                    }
                    if (effectPreview2 != null) {
                        attributionUser2 = effectPreview2.A00;
                    } else {
                        attributionUser2 = creativeConfig.A00;
                    }
                    String str7 = attributionUser2.A01;
                    if (effectPreview2 != null) {
                        attributionUser3 = effectPreview2.A00;
                    } else {
                        attributionUser3 = creativeConfig.A00;
                    }
                    ProfilePicture profilePicture = attributionUser3.A00;
                    if (profilePicture != null) {
                        imageUrl = profilePicture.A00;
                    } else {
                        imageUrl = null;
                    }
                    if (effectPreview2 != null) {
                        z = true;
                    }
                    z = false;
                    if (effectPreview2 != null) {
                        effectActionSheet = effectPreview2.A01;
                    } else {
                        effectActionSheet = null;
                    }
                    if (effectActionSheet != null) {
                        arrayList = effectActionSheet.A00;
                    } else {
                        arrayList = new ArrayList();
                    }
                    if (effectPreview2 != null) {
                        effectActionSheet2 = effectPreview2.A01;
                    } else {
                        effectActionSheet2 = null;
                    }
                    if (effectActionSheet2 != null) {
                        arrayList2 = effectActionSheet2.A01;
                    } else {
                        arrayList2 = new ArrayList();
                    }
                    effectInfoAttributionConfiguration.A03 = new AttributedAREffect(str5, str, imageUrl2, str6, str7, imageUrl, 8, z, arrayList, arrayList2);
                    effectInfoAttributionConfiguration.A05 = str6;
                    effectInfoAttributionConfiguration.A07 = creativeConfig.A05;
                    effectInfoAttributionConfiguration.A08 = str4;
                    ProductAREffectContainer productAREffectContainer = null;
                    if (creativeConfig.A02()) {
                        str2 = creativeConfig.A03;
                    } else {
                        str2 = null;
                    }
                    effectInfoAttributionConfiguration.A06 = str2;
                    ProductItemWithAR productItemWithAR2 = creativeConfig.A02;
                    if (productItemWithAR2 != null) {
                        effectInfoBottomSheetMode = EffectInfoBottomSheetMode.SHOPPING;
                    } else {
                        effectInfoBottomSheetMode = EffectInfoBottomSheetMode.NORMAL;
                    }
                    effectInfoAttributionConfiguration.A01 = effectInfoBottomSheetMode;
                    if (productItemWithAR2 != null) {
                        if (productItemWithAR2.A00 != null) {
                            z2 = false;
                        }
                        productAREffectContainer = new ProductAREffectContainer(productItemWithAR2, z2);
                    }
                    effectInfoAttributionConfiguration.A04 = productAREffectContainer;
                    EffectPreview effectPreview3 = creativeConfig.A01;
                    if (effectPreview3 != null) {
                        r1 = effectPreview3.A03;
                    } else {
                        r1 = null;
                    }
                    effectInfoAttributionConfiguration.A02 = r1;
                    arrayList3.add(effectInfoAttributionConfiguration);
                }
            }
            if (arrayList3.isEmpty()) {
                AnonymousClass0QD.A02("MediaFeedbackHelper", "Trying to launch bottom sheet with no effect info attribution configurations");
            } else {
                EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration = new EffectInfoBottomSheetConfiguration();
                if (arrayList3.size() == 1) {
                    A09 = ImmutableList.A03((EffectInfoAttributionConfiguration) arrayList3.get(0));
                } else if (!arrayList3.isEmpty()) {
                    A09 = ImmutableList.A09(arrayList3);
                } else {
                    throw new IllegalArgumentException("at least one effect is needed");
                }
                EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration2 = effectInfoBottomSheetConfiguration;
                effectInfoBottomSheetConfiguration2.A01 = A09;
                effectInfoBottomSheetConfiguration2.A00 = 8;
                EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration3 = effectInfoBottomSheetConfiguration;
                effectInfoBottomSheetConfiguration3.A02 = "feed_effect_attribution";
                effectInfoBottomSheetConfiguration3.A03 = false;
                AnonymousClass8IF.A00(r10.A04, context, effectInfoBottomSheetConfiguration, new C190588Co(r10, unmodifiableMap), AnonymousClass3TP.PRE_CAPTURE, new AnonymousClass5X0(r10));
            }
        }
        AnonymousClass0Z0.A0A(910791862, A032);
        AnonymousClass0Z0.A0A(460132237, A03);
    }
}
