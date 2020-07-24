package com.instagram.debug.devoptions.sandboxselector;

import p000X.AnonymousClass0C5;
import p000X.AnonymousClass7BR;
import p000X.C05770Lw;
import p000X.C13150hy;
import p000X.C27791Jf;

public final class SandboxPreferences {
    public final C05770Lw devPrefs;
    public final SandboxUrlHelper urlHelper;

    public SandboxPreferences() {
        this((C05770Lw) null, (SandboxUrlHelper) null, 3, (AnonymousClass7BR) null);
    }

    public final String getCurrentSandbox() {
        String str;
        String str2;
        if (this.devPrefs.A0K()) {
            str = this.devPrefs.A04();
            str2 = "devPrefs.devServerName";
        } else {
            str = "i.instagram.com";
            str2 = "urlHelper.getDefaultInstagramHost()";
        }
        C13150hy.A01(str, str2);
        return str;
    }

    public final String getSavedSandbox() {
        String A04 = this.devPrefs.A04();
        boolean z = false;
        if (A04.length() == 0) {
            z = true;
        }
        if (z) {
            A04 = null;
        }
        return A04;
    }

    public final C27791Jf observeCurrentSandbox() {
        C27791Jf A09 = C27791Jf.A06(new SandboxPreferences$observeCurrentSandbox$1(this)).A09();
        C13150hy.A01(A09, "Observable\n        .crea…  .distinctUntilChanged()");
        return A09;
    }

    public final void resetToDefaultSandbox() {
        this.devPrefs.A0C(false);
        this.urlHelper.clearCachedDevServerSetting();
    }

    public final void setSandbox(String str) {
        C13150hy.A02(str, "hostName");
        C05770Lw r4 = this.devPrefs;
        boolean z = !C13150hy.A05(str, "i.instagram.com");
        if (z) {
            this.devPrefs.A00.edit().putString(AnonymousClass0C5.$const$string(85), this.urlHelper.getParsedHostServerUrl(str)).apply();
        }
        r4.A0C(z);
        this.urlHelper.clearCachedDevServerSetting();
    }

    public SandboxPreferences(C05770Lw r2, SandboxUrlHelper sandboxUrlHelper) {
        C13150hy.A02(r2, "devPrefs");
        C13150hy.A02(sandboxUrlHelper, "urlHelper");
        this.devPrefs = r2;
        this.urlHelper = sandboxUrlHelper;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ SandboxPreferences(C05770Lw r2, SandboxUrlHelper sandboxUrlHelper, int i, AnonymousClass7BR r5) {
        this(r2, (i & 2) != 0 ? new SandboxUrlHelper() : sandboxUrlHelper);
        if ((i & 1) != 0) {
            r2 = C05770Lw.A00();
            C13150hy.A01(r2, "DevPreferences.getInstance()");
        }
    }
}
