package com.instagram.debug.devoptions.sandboxselector;

import p000X.C13150hy;
import p000X.C17710qg;
import p000X.C206418tG;
import p000X.C206428tH;
import p000X.C206458tT;
import p000X.C50622Ha;
import p000X.C64582ri;

public final class DevServerApi$createHealthCheckRequest$1 implements C64582ri {
    public static final DevServerApi$createHealthCheckRequest$1 INSTANCE = new DevServerApi$createHealthCheckRequest$1();

    public final C206458tT apply(C17710qg r3) {
        C13150hy.A01(r3, "it");
        if (r3.A05()) {
            return new C206418tG(((IgServerHealthCheckResponse) r3.A02()).health);
        }
        return new C206428tH(C50622Ha.A00);
    }
}
