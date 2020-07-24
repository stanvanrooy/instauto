package com.instagram.debug.devoptions.sandboxselector;

import com.instagram.debug.devoptions.sandboxselector.IgServerHealth;
import p000X.C191608Hd;
import p000X.C206418tG;
import p000X.C206428tH;
import p000X.C206448tQ;
import p000X.C206458tT;
import p000X.C64582ri;

public final class SandboxRepository$observeServerHealth$1 implements C64582ri {
    public static final SandboxRepository$observeServerHealth$1 INSTANCE = new SandboxRepository$observeServerHealth$1();

    public final IgServerHealth apply(C206458tT r3) {
        if (r3 instanceof C206448tQ) {
            return IgServerHealth.CheckingHealth.INSTANCE;
        }
        if (r3 instanceof C206418tG) {
            return (IgServerHealth) ((C206418tG) r3).A00;
        }
        if (r3 instanceof C206428tH) {
            return new IgServerHealth.Unhealthy(IgServerHealth.Unhealthy.UnhealthyReason.UNKNOWN);
        }
        throw new C191608Hd();
    }
}
