package p000X;

import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.EnumSet;

/* renamed from: X.1tK  reason: invalid class name and case insensitive filesystem */
public final class C42831tK {
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        r0 = java.util.EnumSet.of(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        r0 = java.util.EnumSet.of(r3, r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        r0 = java.util.EnumSet.of(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        return r4.A11(r0);
     */
    public static final boolean A00(Integer num, PendingMedia pendingMedia) {
        ShareType shareType;
        ShareType shareType2;
        ShareType shareType3;
        ShareType shareType4;
        ShareType shareType5;
        ShareType shareType6;
        ShareType shareType7;
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                shareType = ShareType.DIRECT_SHARE;
                break;
            case 1:
                shareType = ShareType.FOLLOWERS_SHARE;
                break;
            case 2:
                shareType6 = ShareType.REEL_SHARE;
                break;
            case 3:
                shareType6 = ShareType.DIRECT_STORY_SHARE;
                break;
            case 4:
                shareType2 = ShareType.FOLLOWERS_SHARE;
                shareType3 = ShareType.REEL_SHARE;
                shareType4 = ShareType.DIRECT_STORY_SHARE;
                shareType5 = ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE;
                break;
            case 5:
                shareType = ShareType.NAMETAG_SELFIE;
                break;
            case 6:
                shareType6 = ShareType.IGTV;
                shareType7 = ShareType.POST_LIVE_IGTV;
                break;
            case 7:
                EnumSet enumSet = EnumSet.of(ShareType.FOLLOWERS_SHARE, ShareType.IGTV, ShareType.POST_LIVE_IGTV);
                break;
            case 8:
                shareType = ShareType.CLIPS;
                break;
            case 9:
                shareType6 = ShareType.FOLLOWERS_SHARE;
                shareType7 = ShareType.CLIPS;
                break;
            case 10:
                shareType2 = ShareType.FOLLOWERS_SHARE;
                shareType3 = ShareType.CLIPS;
                shareType4 = ShareType.IGTV;
                shareType5 = ShareType.POST_LIVE_IGTV;
                break;
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                return true;
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                shareType = ShareType.GROUP_REEL_SHARE;
                break;
            default:
                if (num != null) {
                    switch (intValue) {
                        case 1:
                            str = "ONLY_FOLLOWERS_SHARES";
                            break;
                        case 2:
                            str = "ONLY_REEL_SHARES";
                            break;
                        case 3:
                            str = "DIRECT_STORY_SHARES";
                            break;
                        case 4:
                            str = "FOLLOWERS_SHARES_AND_STORY_SHARES";
                            break;
                        case 5:
                            str = "NAMETAG_SELFIE_SHARES";
                            break;
                        case 6:
                            str = "IGTV_SHARES";
                            break;
                        case 7:
                            str = "FOLLOWERS_SHARES_AND_IGTV_SHARES";
                            break;
                        case 8:
                            str = "CLIPS_SHARES";
                            break;
                        case 9:
                            str = "FOLLOWERS_SHARES_AND_CLIPS_SHARES";
                            break;
                        case 10:
                            str = "ALL_PERMANENT_PRIMITIVE_MEDIA_SHARES";
                            break;
                        case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                            str = "ALL_SHARES";
                            break;
                        case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                            str = "GROUP_REEL_SHARES";
                            break;
                        default:
                            str = "ONLY_DIRECT_SHARES";
                            break;
                    }
                } else {
                    str = "null";
                }
                throw new IllegalArgumentException(AnonymousClass000.A0E("Unknown value: ", str));
        }
    }
}
