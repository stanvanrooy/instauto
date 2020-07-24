package com.instagram.debug.devoptions.sandboxselector;

import p000X.AnonymousClass2GT;
import p000X.C13150hy;
import p000X.C225169mi;
import p000X.C50622Ha;
import p000X.C63022ol;
import p000X.C63052oo;

public final /* synthetic */ class SandboxSelectorInteractor$convertViewModels$result$2 extends C225169mi implements AnonymousClass2GT {
    public SandboxSelectorInteractor$convertViewModels$result$2(SandboxSelectorInteractor sandboxSelectorInteractor) {
        super(1, sandboxSelectorInteractor);
    }

    public final String getName() {
        return "onSandboxSelected";
    }

    public final C63052oo getOwner() {
        return C63022ol.A00(SandboxSelectorInteractor.class);
    }

    public final String getSignature() {
        return "onSandboxSelected(Lcom/instagram/debug/devoptions/sandboxselector/Sandbox;)V";
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Sandbox) obj);
        return C50622Ha.A00;
    }

    public final void invoke(Sandbox sandbox) {
        C13150hy.A02(sandbox, "p1");
        SandboxSelectorInteractor.onSandboxSelected((SandboxSelectorInteractor) this.receiver, sandbox);
    }
}
