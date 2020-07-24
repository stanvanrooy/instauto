package p000X;

import android.os.Build;

/* renamed from: X.1vD  reason: invalid class name and case insensitive filesystem */
public final class C43871vD implements C43881vE {
    public final AnonymousClass0C1 A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean Aeb(String str) {
        return false;
    }

    public final boolean Ah6(String str) {
        return false;
    }

    public final boolean Ah7(String str) {
        return false;
    }

    public final boolean AiJ() {
        return false;
    }

    public final boolean AgX() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return this.A02;
    }

    public final boolean Ahv() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return this.A01;
    }

    public C43871vD(AnonymousClass0C1 r6) {
        this.A00 = r6;
        AnonymousClass0L7 r4 = AnonymousClass0L7.GEO_API_EXPERIMENTS;
        this.A02 = ((Boolean) AnonymousClass0L6.A02(r6, r4, "should_minimize_location_access", false, (AnonymousClass04H) null)).booleanValue();
        this.A01 = ((Boolean) AnonymousClass0L6.A02(this.A00, r4, "should_disable_subscriptions", false, (AnonymousClass04H) null)).booleanValue();
    }
}
