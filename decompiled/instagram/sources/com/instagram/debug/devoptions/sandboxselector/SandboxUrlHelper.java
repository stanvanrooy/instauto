package com.instagram.debug.devoptions.sandboxselector;

import p000X.AnonymousClass1BE;
import p000X.C13150hy;

public final class SandboxUrlHelper {
    public final void clearCachedDevServerSetting() {
        synchronized (AnonymousClass1BE.class) {
            AnonymousClass1BE.A00 = null;
        }
    }

    public final String getParsedHostServerUrl(String str) {
        C13150hy.A02(str, "hostName");
        return AnonymousClass1BE.A02(str);
    }

    public final String getDefaultInstagramHost() {
        return "i.instagram.com";
    }
}
