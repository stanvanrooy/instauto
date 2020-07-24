package p000X;

import com.instagram.model.mediatype.MediaType;

/* renamed from: X.1og  reason: invalid class name and case insensitive filesystem */
public final class C40451og {
    public final boolean A00;
    public final boolean A01;

    public static String A01(C45951yt r2) {
        Integer num;
        if (r2.A0E) {
            num = Constants.ONE;
        } else {
            C37671k2 r1 = r2.A04;
            if (r1 != null) {
                AnonymousClass1YR r0 = r1.A00;
                if (r0 != null) {
                    return r0.A00;
                }
                return C43001tb.A00(r1.A03);
            }
            MediaType mediaType = r2.A02;
            if (mediaType == MediaType.CAROUSEL || mediaType == MediaType.COLLECTION) {
                num = Constants.ZERO;
            } else {
                AnonymousClass0QD.A02("VideoAnalyticsCommon_getVideoTypeFromMetaData", "Media ID: " + r2 + ", media type: " + r2.A02);
                return "unknown";
            }
        }
        return C43001tb.A00(num);
    }

    public C40451og(AnonymousClass0C1 r5) {
        AnonymousClass0L7 r3 = AnonymousClass0L7.VIDEO_QP_LOGGER;
        this.A00 = ((Boolean) AnonymousClass0L6.A02(r5, r3, "video_profiling_enabled", false, (AnonymousClass04H) null)).booleanValue();
        this.A01 = ((Boolean) AnonymousClass0L6.A02(r5, r3, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
    }

    public static Integer A00(C37671k2 r2) {
        if (!r2.A06()) {
            return Constants.A0N;
        }
        boolean z = false;
        if (r2.A03 == Constants.A0N) {
            z = true;
        }
        if (z) {
            return Constants.A0C;
        }
        return Constants.ONE;
    }
}
