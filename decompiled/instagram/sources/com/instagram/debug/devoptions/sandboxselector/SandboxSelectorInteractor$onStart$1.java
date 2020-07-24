package com.instagram.debug.devoptions.sandboxselector;

import com.facebook.C0003R;
import p000X.C13150hy;
import p000X.C17710qg;
import p000X.C253518l;

public final class SandboxSelectorInteractor$onStart$1 implements C253518l {
    public final /* synthetic */ SandboxSelectorInteractor this$0;

    public SandboxSelectorInteractor$onStart$1(SandboxSelectorInteractor sandboxSelectorInteractor) {
        this.this$0 = sandboxSelectorInteractor;
    }

    public final void accept(C17710qg r4) {
        C13150hy.A01(r4, "it");
        if (r4.A05()) {
            this.this$0.sandboxesLiveData.A0A(r4.A02());
            return;
        }
        SandboxSelectorInteractor sandboxSelectorInteractor = this.this$0;
        sandboxSelectorInteractor.toastLiveData.A0A(sandboxSelectorInteractor.resources.getString(C0003R.string.dev_options_sandbox_selector_error_network));
    }
}
