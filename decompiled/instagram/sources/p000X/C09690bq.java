package p000X;

import com.facebook.systrace.Systrace;

/* renamed from: X.0bq  reason: invalid class name and case insensitive filesystem */
public final class C09690bq extends AnonymousClass0GW {
    public boolean A00;

    public C09690bq() {
        super((String) null);
    }

    public final int getSupportedProviders() {
        return C09680bp.A06;
    }

    public final int getTracingProviders() {
        if (this.A00) {
            return C09680bp.A06;
        }
        return 0;
    }

    public final void disable() {
        int A03 = AnonymousClass0Z0.A03(-327011069);
        Systrace.A00 = 0;
        this.A00 = false;
        AnonymousClass0Z0.A0A(334625755, A03);
    }

    public final void enable() {
        int A03 = AnonymousClass0Z0.A03(-1921993945);
        Systrace.A00 = 352050453946913L;
        this.A00 = true;
        AnonymousClass0Z0.A0A(1149872055, A03);
    }
}
