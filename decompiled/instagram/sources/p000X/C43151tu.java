package p000X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.p009ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.1tu  reason: invalid class name and case insensitive filesystem */
public final class C43151tu {
    public static void A00(AnonymousClass0C1 r4, C43121tr r5, C31581Yw r6) {
        C13300iJ r2;
        PulsingMultiImageView pulsingMultiImageView;
        ImageUrl ASv;
        C13300iJ AZf = r6.A04.A0M.AZf();
        if (r6.A00().size() > 0) {
            r2 = (C13300iJ) r6.A00().iterator().next();
        } else {
            r2 = null;
        }
        if (C14090jk.A05(r4, AZf) || C13390iS.FollowStatusFollowing.equals(AZf.A0M)) {
            if (AZf != null) {
                r5.A0A.setAnimatingImageUrl(AZf.ASv());
            }
            if (r2 != null) {
                pulsingMultiImageView = r5.A09;
                ASv = r2.ASv();
            }
            r5.A01.setVisibility(0);
        }
        if (r2 != null) {
            r5.A0A.setAnimatingImageUrl(r2.ASv());
        }
        if (AZf != null) {
            pulsingMultiImageView = r5.A09;
            ASv = AZf.ASv();
        }
        r5.A01.setVisibility(0);
        pulsingMultiImageView.setAnimatingImageUrl(ASv);
        r5.A01.setVisibility(0);
    }
}
