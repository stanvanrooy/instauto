package p000X;

import android.content.Context;

/* renamed from: X.18t  reason: invalid class name and case insensitive filesystem */
public final class C254318t implements AnonymousClass0IT {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C253718n A01;

    public C254318t(Context context, C253718n r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        String string = this.A00.getString(this.A01.A01);
        AnonymousClass0a2.A05(string, "ApplicationId must be set.");
        String string2 = this.A00.getString(this.A01.A00);
        AnonymousClass0a2.A05(string2, "ApiKey must be set.");
        return new C51922Mq(string, string2, this.A00.getString(this.A01.A02), this.A00.getString(this.A01.A03), this.A00.getString(this.A01.A04));
    }
}
