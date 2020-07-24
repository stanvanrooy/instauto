package com.instagram.debug.devoptions.sandboxselector;

import android.content.Context;
import p000X.AnonymousClass2GT;
import p000X.C13150hy;
import p000X.C225169mi;
import p000X.C50622Ha;
import p000X.C63022ol;
import p000X.C63052oo;

public final /* synthetic */ class SandboxSelectorInteractor$onResetSandbox$toastRes$1 extends C225169mi implements AnonymousClass2GT {
    public SandboxSelectorInteractor$onResetSandbox$toastRes$1(SandboxOverlayIndicatorUpdater sandboxOverlayIndicatorUpdater) {
        super(1, sandboxOverlayIndicatorUpdater);
    }

    public final String getName() {
        return "updateOverlayIndicator";
    }

    public final C63052oo getOwner() {
        return C63022ol.A00(SandboxOverlayIndicatorUpdater.class);
    }

    public final String getSignature() {
        return "updateOverlayIndicator(Landroid/content/Context;)V";
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Context) obj);
        return C50622Ha.A00;
    }

    public final void invoke(Context context) {
        C13150hy.A02(context, "p1");
        ((SandboxOverlayIndicatorUpdater) this.receiver).updateOverlayIndicator(context);
    }
}
