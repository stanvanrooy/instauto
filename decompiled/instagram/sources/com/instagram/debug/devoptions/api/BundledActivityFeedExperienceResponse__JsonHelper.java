package com.instagram.debug.devoptions.api;

import p000X.AnonymousClass1N4;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13120hv;

public final class BundledActivityFeedExperienceResponse__JsonHelper {
    public static boolean processSingleField(BundledActivityFeedExperienceResponse bundledActivityFeedExperienceResponse, String str, C13080hr r4) {
        String A0t;
        if (!"setting".equals(str)) {
            return AnonymousClass1N4.A01(bundledActivityFeedExperienceResponse, str, r4);
        }
        if (r4.A0g() == C13120hv.VALUE_NULL) {
            A0t = null;
        } else {
            A0t = r4.A0t();
        }
        bundledActivityFeedExperienceResponse.mExperience = A0t;
        return true;
    }

    public static BundledActivityFeedExperienceResponse parseFromJson(C13080hr r3) {
        BundledActivityFeedExperienceResponse bundledActivityFeedExperienceResponse = new BundledActivityFeedExperienceResponse();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            processSingleField(bundledActivityFeedExperienceResponse, A0i, r3);
            r3.A0f();
        }
        return bundledActivityFeedExperienceResponse;
    }

    public static BundledActivityFeedExperienceResponse parseFromJson(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return parseFromJson(A0A);
    }
}
