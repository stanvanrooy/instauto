package p000X;

import android.content.Context;
import com.facebook.systrace.Systrace;

/* renamed from: X.0eQ  reason: invalid class name and case insensitive filesystem */
public final class C11100eQ extends AnonymousClass0GW {
    public boolean A00;
    public final Context A01;

    public C11100eQ(Context context) {
        super((String) null);
        this.A01 = context;
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
        int A03 = AnonymousClass0Z0.A03(1387651773);
        this.A00 = false;
        C06530Pk.A00 = false;
        AnonymousClass0Z0.A0A(1607498891, A03);
    }

    public final void enable() {
        int A03 = AnonymousClass0Z0.A03(-782532556);
        this.A00 = true;
        Context context = this.A01;
        if (!C06530Pk.A00) {
            AnonymousClass0Y1.A05(context);
            Systrace.A00 = 1;
            AnonymousClass0ZJ.A01(1, "SystraceInit", -92406422);
            AnonymousClass0ZJ.A00(1, 1954521277);
        }
        C06530Pk.A00 = true;
        AnonymousClass0Z0.A0A(-1445494276, A03);
    }
}
