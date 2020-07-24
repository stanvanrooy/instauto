package com.instagram.debug.devoptions.sandboxselector;

import com.instagram.debug.devoptions.sandboxselector.IgServerHealth;
import p000X.C13150hy;
import p000X.C16090o1;
import p000X.C33861dc;

public final class DevServerApi$createHealthCheckRequest$request$1 implements C16090o1 {
    public static final DevServerApi$createHealthCheckRequest$request$1 INSTANCE = new DevServerApi$createHealthCheckRequest$request$1();

    public final IgServerHealthCheckResponse then(C33861dc r4) {
        IgServerHealth unhealthy;
        C13150hy.A01(r4, "it");
        int i = r4.A01;
        if (i == 200) {
            unhealthy = IgServerHealth.Healthy.INSTANCE;
        } else {
            unhealthy = new IgServerHealth.Unhealthy(IgServerHealth.Unhealthy.UnhealthyReason.Companion.fromHttpStatusCode(i));
        }
        return new IgServerHealthCheckResponse(unhealthy);
    }
}
