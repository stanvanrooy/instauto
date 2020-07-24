package com.instagram.debug.devoptions.sandboxselector;

import android.content.SharedPreferences;
import p000X.AnonymousClass0C5;
import p000X.C13150hy;
import p000X.C64712rv;

public final class SandboxPreferences$observeCurrentSandbox$1$listener$1 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ C64712rv $emitter;
    public final /* synthetic */ SandboxPreferences$observeCurrentSandbox$1 this$0;

    public SandboxPreferences$observeCurrentSandbox$1$listener$1(SandboxPreferences$observeCurrentSandbox$1 sandboxPreferences$observeCurrentSandbox$1, C64712rv r2) {
        this.this$0 = sandboxPreferences$observeCurrentSandbox$1;
        this.$emitter = r2;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (C13150hy.A05(str, "using_dev_server") || C13150hy.A05(str, AnonymousClass0C5.$const$string(85))) {
            this.$emitter.BD2(this.this$0.this$0.getCurrentSandbox());
        }
    }
}
