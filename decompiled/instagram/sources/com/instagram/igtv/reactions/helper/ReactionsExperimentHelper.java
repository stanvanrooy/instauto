package com.instagram.igtv.reactions.helper;

import com.instagram.igtv.reactions.helper.C0141L;
import java.util.Map;
import p000X.AnonymousClass0C1;
import p000X.C13150hy;
import p000X.C234910p;
import p000X.C51712Lv;

public final class ReactionsExperimentHelper {
    public static final ReactionsExperimentHelper INSTANCE = new ReactionsExperimentHelper();
    public static final int IS_CONSUMPTION_ENABLED = 1;
    public static final int IS_CREATION_ENABLED = 2;
    public static final String REACTIONS_KEY = "8d313b7e3a128b1018736b1ea4a6207f5c4e24a6";

    public static final Map initConfig() {
        return C51712Lv.A06(C234910p.A00(1, ReactionsExperimentHelper$initConfig$1.INSTANCE), C234910p.A00(2, ReactionsExperimentHelper$initConfig$2.INSTANCE));
    }

    public static final boolean isReactionsConsumptionEnabled(AnonymousClass0C1 r2) {
        C13150hy.A02(r2, "userSession");
        Boolean andExpose = C0141L.ig_android_igtv_destination.is_reactions_enabled.getAndExpose(r2);
        C13150hy.A01(andExpose, "L.ig_android_igtv_destin…getAndExpose(userSession)");
        if (!andExpose.booleanValue()) {
            Boolean andExpose2 = C0141L.ig_android_igtv_destination.is_reactions_creation_enabled.getAndExpose(r2);
            C13150hy.A01(andExpose2, "L.ig_android_igtv_destin…getAndExpose(userSession)");
            if (andExpose2.booleanValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean isReactionsCreationEnabled(AnonymousClass0C1 r1) {
        C13150hy.A02(r1, "userSession");
        Boolean andExpose = C0141L.ig_android_igtv_destination.is_reactions_creation_enabled.getAndExpose(r1);
        C13150hy.A01(andExpose, "L.ig_android_igtv_destin…getAndExpose(userSession)");
        return andExpose.booleanValue();
    }
}
