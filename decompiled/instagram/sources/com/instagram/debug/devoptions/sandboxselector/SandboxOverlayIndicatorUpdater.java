package com.instagram.debug.devoptions.sandboxselector;

import android.content.Context;
import p000X.AnonymousClass7BR;
import p000X.C05770Lw;
import p000X.C11860fn;
import p000X.C13150hy;

public final class SandboxOverlayIndicatorUpdater {
    public final C05770Lw devPrefs;

    public SandboxOverlayIndicatorUpdater() {
        this((C05770Lw) null, 1, (AnonymousClass7BR) null);
    }

    public final void updateOverlayIndicator(Context context) {
        C13150hy.A02(context, "context");
        if (context instanceof C11860fn) {
            ((C11860fn) context).Azn(this.devPrefs);
        }
    }

    public SandboxOverlayIndicatorUpdater(C05770Lw r2) {
        C13150hy.A02(r2, "devPrefs");
        this.devPrefs = r2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ SandboxOverlayIndicatorUpdater(C05770Lw r2, int i, AnonymousClass7BR r4) {
        this(r2);
        if ((i & 1) != 0) {
            r2 = C05770Lw.A00();
            C13150hy.A01(r2, "DevPreferences.getInstance()");
        }
    }
}
