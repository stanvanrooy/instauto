package com.instagram.debug.devoptions.sandboxselector;

import java.util.List;
import p000X.AnonymousClass1N6;

public final class SandboxSelectorFragment$onViewCreated$$inlined$with$lambda$1 implements AnonymousClass1N6 {
    public final /* synthetic */ SandboxSelectorFragment this$0;

    public SandboxSelectorFragment$onViewCreated$$inlined$with$lambda$1(SandboxSelectorFragment sandboxSelectorFragment) {
        this.this$0 = sandboxSelectorFragment;
    }

    public final void onChanged(Object obj) {
        SandboxSelectorFragment.access$getAdapter$p(this.this$0).setItems((List) obj);
    }
}
