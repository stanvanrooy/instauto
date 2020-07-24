package com.instagram.debug.devoptions.sandboxselector;

import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass7BR;
import p000X.C13150hy;
import p000X.C15890nh;
import p000X.C206448tQ;
import p000X.C27791Jf;
import p000X.C64482rY;

public final class DevServerApi {
    public static final Companion Companion = new Companion();
    public static final String IG_DEVSERVERS_ENDPOINT_PATH = "devservers/list/";
    public static final String IG_HEALTH_CHECK_ENDPOINT_PATH = "bfad3e85bc/";

    public final C27791Jf createDevServersRequest(AnonymousClass0C1 r4) {
        C13150hy.A02(r4, "userSession");
        C15890nh r2 = new C15890nh(r4);
        r2.A09 = Constants.A0N;
        r2.A0C = IG_DEVSERVERS_ENDPOINT_PATH;
        r2.A06(DevServersResponse__JsonHelper.class, false);
        C27791Jf A00 = C64482rY.A00(r2.A03());
        C13150hy.A01(A00, "RxRequest.observeRequest(it)");
        C13150hy.A01(A00, "IgApi.Builder<DevServers…uest.observeRequest(it) }");
        return A00;
    }

    public final C27791Jf createHealthCheckRequest(AnonymousClass0C1 r3) {
        C13150hy.A02(r3, "userSession");
        C15890nh r1 = new C15890nh(r3);
        r1.A09 = Constants.A0N;
        r1.A0E = true;
        r1.A0C = IG_HEALTH_CHECK_ENDPOINT_PATH;
        r1.A06 = DevServerApi$createHealthCheckRequest$request$1.INSTANCE;
        C27791Jf A0H = C64482rY.A00(r1.A03()).A0D(DevServerApi$createHealthCheckRequest$1.INSTANCE).A0H(C206448tQ.A00);
        C13150hy.A01(A0H, "RxRequest.observeRequest…th(LoadingResult.Loading)");
        return A0H;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(AnonymousClass7BR r1) {
        }
    }
}
