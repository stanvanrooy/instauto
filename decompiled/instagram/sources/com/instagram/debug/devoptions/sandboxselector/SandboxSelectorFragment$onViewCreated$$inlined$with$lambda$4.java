package com.instagram.debug.devoptions.sandboxselector;

import com.instagram.debug.sandbox.SandboxUtil;
import java.util.List;
import p000X.AnonymousClass1N6;

public final class SandboxSelectorFragment$onViewCreated$$inlined$with$lambda$4 implements AnonymousClass1N6 {
    public final /* synthetic */ SandboxSelectorFragment this$0;

    public SandboxSelectorFragment$onViewCreated$$inlined$with$lambda$4(SandboxSelectorFragment sandboxSelectorFragment) {
        this.this$0 = sandboxSelectorFragment;
    }

    public final void onChanged(Object obj) {
        SandboxSelectorFragment sandboxSelectorFragment = this.this$0;
        SandboxUtil.getSandboxDialog(sandboxSelectorFragment.getContext(), SandboxSelectorFragment.access$getSession$p(sandboxSelectorFragment), (List) null).show();
    }
}
