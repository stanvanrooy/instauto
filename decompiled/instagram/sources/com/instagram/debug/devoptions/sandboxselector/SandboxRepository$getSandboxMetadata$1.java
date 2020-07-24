package com.instagram.debug.devoptions.sandboxselector;

import p000X.C13150hy;
import p000X.C17710qg;
import p000X.C64582ri;

public final class SandboxRepository$getSandboxMetadata$1 implements C64582ri {
    public final /* synthetic */ SandboxRepository this$0;

    public SandboxRepository$getSandboxMetadata$1(SandboxRepository sandboxRepository) {
        this.this$0 = sandboxRepository;
    }

    public final C17710qg apply(C17710qg r6) {
        DevServersResponse devServersResponse;
        C13150hy.A01(r6, "it");
        SandboxMetadata sandboxMetadata = null;
        if (!r6.A05()) {
            r6 = null;
        }
        if (!(r6 == null || (devServersResponse = (DevServersResponse) r6.A02()) == null)) {
            if (!devServersResponse.isOk()) {
                devServersResponse = null;
            }
            if (devServersResponse != null) {
                SandboxRepository sandboxRepository = this.this$0;
                sandboxMetadata = sandboxRepository.converter.convertSandboxMetadata(devServersResponse.devServers, sandboxRepository.sandboxPrefs.getSavedSandbox(), devServersResponse.isInternal);
            }
        }
        return C17710qg.A00(sandboxMetadata);
    }
}
