package com.instagram.debug.devoptions.sandboxselector;

import p000X.C18720sJ;
import p000X.C225169mi;
import p000X.C63022ol;
import p000X.C63052oo;

public final /* synthetic */ class SandboxSelectorInteractor$convertViewModels$result$1 extends C225169mi implements C18720sJ {
    public SandboxSelectorInteractor$convertViewModels$result$1(SandboxSelectorInteractor sandboxSelectorInteractor) {
        super(0, sandboxSelectorInteractor);
    }

    public final String getName() {
        return "onResetSandbox";
    }

    public final C63052oo getOwner() {
        return C63022ol.A00(SandboxSelectorInteractor.class);
    }

    public final String getSignature() {
        return "onResetSandbox()V";
    }

    public final void invoke() {
        SandboxSelectorInteractor.onResetSandbox((SandboxSelectorInteractor) this.receiver);
    }
}
