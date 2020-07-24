package com.instagram.debug.devoptions.sandboxselector;

import android.view.View;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass2GT;

public final class SandboxViewModelConverter$toMenuItem$2 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass2GT $onServerSelected;
    public final /* synthetic */ Sandbox $this_toMenuItem;

    public SandboxViewModelConverter$toMenuItem$2(Sandbox sandbox, AnonymousClass2GT r2) {
        this.$this_toMenuItem = sandbox;
        this.$onServerSelected = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-2082990415);
        this.$onServerSelected.invoke(this.$this_toMenuItem);
        AnonymousClass0Z0.A0C(-797885604, A05);
    }
}
