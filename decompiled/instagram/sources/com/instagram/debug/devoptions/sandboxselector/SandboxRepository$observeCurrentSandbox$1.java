package com.instagram.debug.devoptions.sandboxselector;

import p000X.AnonymousClass2GT;
import p000X.C13150hy;
import p000X.C225169mi;
import p000X.C63022ol;
import p000X.C63052oo;

public final /* synthetic */ class SandboxRepository$observeCurrentSandbox$1 extends C225169mi implements AnonymousClass2GT {
    public SandboxRepository$observeCurrentSandbox$1(SandboxDataModelConverter sandboxDataModelConverter) {
        super(1, sandboxDataModelConverter);
    }

    public final String getName() {
        return "convertHostNameToSandbox";
    }

    public final C63052oo getOwner() {
        return C63022ol.A00(SandboxDataModelConverter.class);
    }

    public final String getSignature() {
        return "convertHostNameToSandbox(Ljava/lang/String;)Lcom/instagram/debug/devoptions/sandboxselector/Sandbox;";
    }

    public final Sandbox invoke(String str) {
        C13150hy.A02(str, "p1");
        return ((SandboxDataModelConverter) this.receiver).convertHostNameToSandbox(str);
    }
}
