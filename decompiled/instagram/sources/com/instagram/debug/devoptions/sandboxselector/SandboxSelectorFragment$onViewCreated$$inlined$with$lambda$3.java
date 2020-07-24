package com.instagram.debug.devoptions.sandboxselector;

import android.content.Context;
import p000X.AnonymousClass1N6;
import p000X.AnonymousClass2GT;
import p000X.C13150hy;

public final class SandboxSelectorFragment$onViewCreated$$inlined$with$lambda$3 implements AnonymousClass1N6 {
    public final /* synthetic */ SandboxSelectorFragment this$0;

    public SandboxSelectorFragment$onViewCreated$$inlined$with$lambda$3(SandboxSelectorFragment sandboxSelectorFragment) {
        this.this$0 = sandboxSelectorFragment;
    }

    public final void onChanged(Object obj) {
        AnonymousClass2GT r3 = (AnonymousClass2GT) obj;
        Context context = this.this$0.getContext();
        if (context != null) {
            C13150hy.A01(context, "it");
            r3.invoke(context);
        }
    }
}
