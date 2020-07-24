package com.instagram.debug.devoptions.sandboxselector;

import p000X.C13150hy;
import p000X.C17710qg;
import p000X.C225169mi;
import p000X.C234210i;
import p000X.C63022ol;
import p000X.C63052oo;

public final /* synthetic */ class SandboxSelectorInteractor$onStart$combined$1 extends C225169mi implements C234210i {
    public SandboxSelectorInteractor$onStart$combined$1(SandboxSelectorInteractor sandboxSelectorInteractor) {
        super(3, sandboxSelectorInteractor);
    }

    public final String getName() {
        return "convertViewModels";
    }

    public final C63052oo getOwner() {
        return C63022ol.A00(SandboxSelectorInteractor.class);
    }

    public final String getSignature() {
        return "convertViewModels(Lcom/instagram/debug/devoptions/sandboxselector/Sandbox;Lcom/instagram/debug/devoptions/sandboxselector/IgServerHealth;Lcom/google/common/base/Optional;)Lcom/google/common/base/Optional;";
    }

    public final C17710qg invoke(Sandbox sandbox, IgServerHealth igServerHealth, C17710qg r4) {
        C13150hy.A02(sandbox, "p1");
        C13150hy.A02(igServerHealth, "p2");
        C13150hy.A02(r4, "p3");
        return SandboxSelectorInteractor.convertViewModels((SandboxSelectorInteractor) this.receiver, sandbox, igServerHealth, r4);
    }
}
