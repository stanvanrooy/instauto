package com.instagram.debug.devoptions.sandboxselector;

import p000X.C05770Lw;
import p000X.C64502ra;
import p000X.C64712rv;
import p000X.C64742ry;

public final class SandboxPreferences$observeCurrentSandbox$1 implements C64502ra {
    public final /* synthetic */ SandboxPreferences this$0;

    public SandboxPreferences$observeCurrentSandbox$1(SandboxPreferences sandboxPreferences) {
        this.this$0 = sandboxPreferences;
    }

    public final void subscribe(C64712rv r3) {
        r3.BD2(this.this$0.getCurrentSandbox());
        final SandboxPreferences$observeCurrentSandbox$1$listener$1 sandboxPreferences$observeCurrentSandbox$1$listener$1 = new SandboxPreferences$observeCurrentSandbox$1$listener$1(this, r3);
        this.this$0.devPrefs.A00.registerOnSharedPreferenceChangeListener(sandboxPreferences$observeCurrentSandbox$1$listener$1);
        r3.BgU(new C64742ry() {
            public final void cancel() {
                C05770Lw r0 = SandboxPreferences$observeCurrentSandbox$1.this.this$0.devPrefs;
                r0.A00.unregisterOnSharedPreferenceChangeListener(sandboxPreferences$observeCurrentSandbox$1$listener$1);
            }
        });
    }
}
