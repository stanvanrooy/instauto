package p000X;

import android.content.Context;

/* renamed from: X.0dg  reason: invalid class name and case insensitive filesystem */
public final class C10670dg implements C07640Tw {
    public final Context A00;

    public final String AFr() {
        return AnonymousClass0T9.A00(this.A00, Constants.A06).getString("analytics_endpoint", (String) null);
    }

    public final String AQS() {
        return AnonymousClass0T9.A00(this.A00, Constants.A06).getString("host_name_ipv6", (String) null);
    }

    public C10670dg(Context context) {
        this.A00 = context;
    }
}
