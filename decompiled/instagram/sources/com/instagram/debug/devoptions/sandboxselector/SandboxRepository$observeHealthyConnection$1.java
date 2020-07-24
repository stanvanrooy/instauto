package com.instagram.debug.devoptions.sandboxselector;

import p000X.C27791Jf;
import p000X.C64582ri;

public final class SandboxRepository$observeHealthyConnection$1 implements C64582ri {
    public final /* synthetic */ SandboxRepository this$0;

    public SandboxRepository$observeHealthyConnection$1(SandboxRepository sandboxRepository) {
        this.this$0 = sandboxRepository;
    }

    public final C27791Jf apply(Sandbox sandbox) {
        return SandboxRepository.observeServerHealth(this.this$0);
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return SandboxRepository.observeServerHealth(this.this$0);
    }
}
