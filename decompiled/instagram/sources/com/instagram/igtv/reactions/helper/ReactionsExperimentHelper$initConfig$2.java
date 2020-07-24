package com.instagram.igtv.reactions.helper;

import p000X.AnonymousClass0C1;
import p000X.AnonymousClass2GT;
import p000X.C13150hy;
import p000X.C18690sG;

public final class ReactionsExperimentHelper$initConfig$2 extends C18690sG implements AnonymousClass2GT {
    public static final ReactionsExperimentHelper$initConfig$2 INSTANCE = new ReactionsExperimentHelper$initConfig$2();

    public ReactionsExperimentHelper$initConfig$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((AnonymousClass0C1) obj));
    }

    public final boolean invoke(AnonymousClass0C1 r2) {
        C13150hy.A02(r2, "session");
        return ReactionsExperimentHelper.isReactionsCreationEnabled(r2);
    }
}
