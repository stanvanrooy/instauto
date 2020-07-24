package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.explore.topiccluster.ExploreTopicCluster;

/* renamed from: X.1oC  reason: invalid class name and case insensitive filesystem */
public final class C40171oC {
    public static ExploreTopicCluster parseFromJson(C13080hr r4) {
        ExploreTopicCluster exploreTopicCluster = new ExploreTopicCluster();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                exploreTopicCluster.A05 = str;
            } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                exploreTopicCluster.A07 = str;
            } else if ("name".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                exploreTopicCluster.A06 = str;
            } else if ("cover_media".equals(A0i)) {
                exploreTopicCluster.A02 = AnonymousClass1NJ.A00(r4);
            } else if ("debug_info".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                exploreTopicCluster.A04 = str;
            } else if ("type".equals(A0i)) {
                C40181oE r0 = (C40181oE) C40181oE.A01.get(r4.A0r());
                if (r0 == null) {
                    r0 = C40181oE.UNKNOWN;
                }
                exploreTopicCluster.A01 = r0;
            } else if ("ranked_position".equals(A0i)) {
                exploreTopicCluster.A00 = r4.A0I();
            } else if ("can_mute".equals(A0i)) {
                exploreTopicCluster.A08 = r4.A0O();
            } else if ("is_muted".equals(A0i)) {
                exploreTopicCluster.A09 = r4.A0O();
            } else if ("bloks_app_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                exploreTopicCluster.A03 = str;
            }
            r4.A0f();
        }
        if (exploreTopicCluster.A01 == null) {
            exploreTopicCluster.A01 = C40181oE.UNKNOWN;
        }
        return exploreTopicCluster;
    }
}
