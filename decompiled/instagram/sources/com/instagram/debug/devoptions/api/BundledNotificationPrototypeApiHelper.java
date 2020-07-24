package com.instagram.debug.devoptions.api;

import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass1N4;
import p000X.C15890nh;
import p000X.C17850qu;
import p000X.C17920r1;

public class BundledNotificationPrototypeApiHelper {
    public static C17850qu createBundledActivityFeedPrototypeTask(AnonymousClass0C1 r3, String str, C17920r1 r5) {
        C15890nh r2 = new C15890nh(r3);
        r2.A09 = Constants.ONE;
        r2.A0C = "commerce/inbox/prototype/";
        r2.A09("experience", str);
        r2.A06(AnonymousClass1N4.class, false);
        C17850qu A03 = r2.A03();
        A03.A00 = r5;
        return A03;
    }

    public static C17850qu createBundledActivityFeedRetrieveExperienceTask(AnonymousClass0C1 r3, C17920r1 r4) {
        C15890nh r2 = new C15890nh(r3);
        r2.A09 = Constants.A0N;
        r2.A0C = "commerce/inbox/prototype/setting/";
        r2.A06(BundledActivityFeedExperienceResponse__JsonHelper.class, false);
        C17850qu A03 = r2.A03();
        A03.A00 = r4;
        return A03;
    }
}
