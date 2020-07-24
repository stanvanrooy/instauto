package p000X;

import android.content.Context;
import android.os.Bundle;

/* renamed from: X.1zj  reason: invalid class name and case insensitive filesystem */
public final class C46431zj implements AnonymousClass12D, AnonymousClass0C2 {
    public final AnonymousClass0C1 A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C46431zj A00(AnonymousClass0C1 r2) {
        return (C46431zj) r2.AVA(C46431zj.class, new C46441zk(r2));
    }

    public final void Brn() {
        ATJ.A01(StoredPreferences.A00, "ACTION_CLEAR_DATA", (Bundle) null, this.A02);
    }

    public final void Bro() {
        ATJ.A01(StoredPreferences.A00, "ACTION_CLEAR_DATA", (Bundle) null, this.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002f, code lost:
        if (android.os.Build.VERSION.SDK_INT < ((java.lang.Integer) p000X.AnonymousClass0L6.A03(r7, r5, "min_sdk", 0, (p000X.AnonymousClass04H) null)).intValue()) goto L_0x0031;
     */
    public C46431zj(AnonymousClass0C1 r7) {
        this.A00 = r7;
        AnonymousClass0L7 r5 = AnonymousClass0L7.IN_PROCESS_IAB;
        boolean z = ((Boolean) AnonymousClass0L6.A03(r7, r5, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() ? true : z;
        z = false;
        this.A02 = z;
        this.A03 = ((Boolean) AnonymousClass0L6.A02(this.A00, r5, "is_warmup_webview_enabled", false, (AnonymousClass04H) null)).booleanValue();
        this.A01 = ((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.IAB_HOLDOUT, "in_holdout", false, (AnonymousClass04H) null)).booleanValue();
    }

    public static void A01(AnonymousClass0O9 r1) {
        if (C12670hC.A08()) {
            C05700Lp.A00().ADc(r1);
        } else {
            r1.run();
        }
    }

    public final void A02(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (!this.A02 || !this.A03) {
            A01(new C46451zl(this, applicationContext));
        } else {
            A01(new C205938rj(this, applicationContext));
        }
    }

    public final void onUserSessionStart(boolean z) {
        AnonymousClass0Z0.A0A(1879614570, AnonymousClass0Z0.A03(-623336340));
    }
}
