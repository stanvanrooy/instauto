package p000X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig;
import com.instagram.location.contextualfeed.intf.LocationContextualFeedConfig;
import com.instagram.save.contextualfeed.intf.SavedContextualFeedNetworkConfig;
import com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig;
import com.instagram.secondaryaccount.upsell.contextualfeed.intf.TrialContextualFeedNetworkConfig;
import java.util.List;

/* renamed from: X.0rv  reason: invalid class name and case insensitive filesystem */
public final class C18480rv extends C18490rw {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (r1.equals("Older_Feed") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        if (r1.equals("Saved") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r1.equals("Keyword_Serp") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r1.equals("Static") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (r1.equals("Trial_Feed") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        if (r1.equals("Hashtag") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        if (r1.equals("User_Feed") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r1.equals("Location") == false) goto L_0x0011;
     */
    public final AnonymousClass30P A00(AnonymousClass1HD r16, AnonymousClass0C1 r17, AnonymousClass0RN r18, String str, Bundle bundle, List list, AnonymousClass30L r22, AnonymousClass30M r23, AnonymousClass1IE r24, AnonymousClass6TG r25, boolean z) {
        char c;
        Bundle bundle2 = bundle;
        String string = bundle2.getString("ContextualFeedFragment.ARGUMENT_CONTEXTUAL_FEED_MODE", "Static");
        switch (string.hashCode()) {
            case -1952846446:
                c = 5;
                break;
            case -1932766292:
                c = 0;
                break;
            case -1831740057:
                c = 6;
                break;
            case -1808614770:
                c = 4;
                break;
            case -1426359066:
                c = 1;
                break;
            case 79658599:
                c = 3;
                break;
            case 708324905:
                c = 7;
                break;
            case 1965687765:
                c = 2;
                break;
            default:
                c = 65535;
                break;
        }
        String str2 = str;
        AnonymousClass0RN r11 = r18;
        AnonymousClass1HD r3 = r16;
        AnonymousClass0C1 r5 = r17;
        AnonymousClass30M r13 = r23;
        AnonymousClass30L r7 = r22;
        switch (c) {
            case 0:
                Parcelable parcelable = bundle2.getParcelable("contextual_feed_config");
                AnonymousClass0a4.A06(parcelable);
                return new C221179fv(r3, r5, r11, r7, r13, (HashtagContextualFeedConfig) parcelable);
            case 1:
                Parcelable parcelable2 = bundle2.getParcelable("contextual_feed_config");
                AnonymousClass11J.A00(parcelable2);
                return new C220919fU(r3, r5, r7, r13, (KeywordSerpContextualFeedConfig) parcelable2);
            case 2:
                Parcelable parcelable3 = bundle2.getParcelable("contextual_feed_config");
                AnonymousClass11J.A00(parcelable3);
                return new C221189fw(r3, r5, r11, r7, r13, (LocationContextualFeedConfig) parcelable3);
            case 3:
                Parcelable parcelable4 = bundle2.getParcelable("contextual_feed_config");
                AnonymousClass0a4.A06(parcelable4);
                return new AnonymousClass8X8(r3, r5, r7, (SavedContextualFeedNetworkConfig) parcelable4);
            case 4:
                return new C147786Tj(r3, r5, r7, list);
            case 5:
                ContextualFeedNetworkConfig contextualFeedNetworkConfig = (ContextualFeedNetworkConfig) bundle2.getParcelable("ContextualFeedFragment.ARGUMENT_NETWORK_CONFIG");
                AnonymousClass0a4.A06(contextualFeedNetworkConfig);
                return new C147706Ta(contextualFeedNetworkConfig, r5, str2, r3, z, r7);
            case 6:
                Parcelable parcelable5 = bundle2.getParcelable("contextual_feed_config");
                AnonymousClass0a4.A06(parcelable5);
                return new C147766Th(r3, r5, r7, (TrialContextualFeedNetworkConfig) parcelable5);
            case 7:
                return new C150216bj(r3, bundle2, r5, str2, r7, r24, r25);
            default:
                throw new IllegalArgumentException(AnonymousClass000.A0E("Unsupported ContextualFeedMode:", string));
        }
    }
}
